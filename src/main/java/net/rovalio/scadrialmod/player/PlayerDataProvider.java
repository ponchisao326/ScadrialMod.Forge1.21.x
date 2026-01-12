package net.rovalio.scadrialmod.player;

import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.*;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rovalio.scadrialmod.ScadrialMod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Mod.EventBusSubscriber(modid = ScadrialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerDataProvider implements ICapabilitySerializable<CompoundTag> {


    public static final Capability<PlayerCosmereData> COSMERE_DATA = CapabilityManager.get(new CapabilityToken<>(){});

    private final PlayerCosmereData data = new PlayerCosmereData();
    private final LazyOptional<PlayerCosmereData> optional = LazyOptional.of(() -> data);

    /* ---------- MÉTODOS DE LA INTERFAZ ---------- */

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        // Si piden COSMERE_DATA, devolvemos nuestra data. Si no, vacío.
        return cap == COSMERE_DATA ? optional.cast() : LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT(HolderLookup.Provider registryAccess) {
        CompoundTag tag = new CompoundTag();
        if (data != null) {
            data.saveNBT(tag);
        }
        return tag;
    }

    @Override
    public void deserializeNBT(HolderLookup.Provider registryAccess, CompoundTag nbt) {
        if (nbt != null && data != null) {
            data.loadNBT(nbt);
        }
    }

    /* ---------- ACCESO ESTÁTICO ---------- */

    // Utilidad para obtener los datos desde cualquier parte del código
    public static LazyOptional<PlayerCosmereData> get(Player player) {
        return player.getCapability(COSMERE_DATA);
    }

    /* ---------- EVENTOS ---------- */

    @SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        Player player = event.getEntity();
        // Obtenemos la data y si existe, intentamos inicializarla
        get(player).ifPresent(data -> {
            // Usamos el RandomSource del player, no java.util.Random
            data.initializeIfNeeded(player.getRandom());
            ScadrialMod.LOGGER.info("Poderes de {}: Alomancia: {}, Feruquimia: {}, Investidura: {}",
                    player.getName().getString(), data.hasAllomancy(), data.hasFeruchemy(), data.getInvestitureUEA());
        });
    }

    @SubscribeEvent
    public static void onPlayerCloned(PlayerEvent.Clone event) {

        event.getOriginal().getCapability(COSMERE_DATA).ifPresent(oldData -> {
            event.getEntity().getCapability(COSMERE_DATA).ifPresent(newData -> {

                CompoundTag tag = new CompoundTag();
                oldData.saveNBT(tag);
                newData.loadNBT(tag);

            });
        });
    }

    @SubscribeEvent
    public static void attachCapabilities(AttachCapabilitiesEvent<net.minecraft.world.entity.Entity> event) {
        if (event.getObject() instanceof Player player) {

            if (!player.getCapability(COSMERE_DATA).isPresent()) {
                event.addCapability(
                        ResourceLocation.fromNamespaceAndPath(ScadrialMod.MOD_ID, "cosmere_data"),
                        new PlayerDataProvider()
                );
            }
        }
    }
}