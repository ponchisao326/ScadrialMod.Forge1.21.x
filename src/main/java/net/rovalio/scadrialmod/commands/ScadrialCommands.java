package net.rovalio.scadrialmod.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.rovalio.scadrialmod.player.CosmerePowerAssigner;
import net.rovalio.scadrialmod.player.PlayerDataProvider;

import java.util.Collection;

public class ScadrialCommands {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("scadrial")
                .then(Commands.literal("powers")
                        .then(Commands.literal("info")
                                .executes(context -> showInfo(context.getSource()))
                        )

                        .then(Commands.literal("reroll")
                                .then(Commands.argument("targets", EntityArgument.players())
                                        .executes(context -> rerollPowers(context, EntityArgument.getPlayers(context, "targets")))
                                )
                        )
                        .then(Commands.literal("clear")
                                .then(Commands.argument("targets", EntityArgument.players())
                                        .executes(context -> clearPowers(context, EntityArgument.getPlayers(context, "targets")))
                                )
                        )
                        .then(Commands.literal("set")
                                .then(Commands.literal("mistborn")
                                        .then(Commands.argument("targets", EntityArgument.players())
                                                .executes(context -> {
                                                    for (ServerPlayer player : EntityArgument.getPlayers(context, "targets")) {
                                                        PlayerDataProvider.get(player).ifPresent(data -> {
                                                            data.setNoPowers(false);
                                                            data.setFullAllomancer(true);
                                                            data.setFullFeruchemist(false);
                                                            data.setInvestitureUEA(11.0);
                                                            player.sendSystemMessage(Component.literal("§d¡Ahora eres un Nacido de la Bruma!"));
                                                        });
                                                    }
                                                    return 1;
                                                })
                                        )
                                )
                                .then(Commands.literal("feruchemist")
                                        .then(Commands.argument("targets", EntityArgument.players())
                                                .executes(context -> {
                                                    for (ServerPlayer player : EntityArgument.getPlayers(context, "targets")) {
                                                        PlayerDataProvider.get(player).ifPresent(data -> {
                                                            data.setNoPowers(false);
                                                            data.setFullAllomancer(false);
                                                            data.setFullFeruchemist(true);
                                                            data.setInvestitureUEA(11.0);
                                                            player.sendSystemMessage(Component.literal("§d¡Ahora eres Feruquimista!"));
                                                        });
                                                    }
                                                    return 1;
                                                })
                                        )
                                )
                                .then(Commands.literal("fullborn")
                                        .then(Commands.argument("targets", EntityArgument.players())
                                                .executes(context -> {
                                                    for (ServerPlayer player : EntityArgument.getPlayers(context, "targets")) {
                                                        PlayerDataProvider.get(player).ifPresent(data -> {
                                                            data.setNoPowers(false);
                                                            data.setFullAllomancer(true);
                                                            data.setFullFeruchemist(true);
                                                            data.setInvestitureUEA(20.0);
                                                            player.sendSystemMessage(Component.literal("§d¡Ahora eres Nacido de la Bruma y Feruquimista!"));
                                                        });
                                                    }
                                                    return 1;
                                                })
                                        )
                                )
                        )
                )


        );
    }

    private static int rerollPowers(CommandContext<CommandSourceStack> context, Collection<ServerPlayer> targets) {
        for (ServerPlayer player : targets) {
            PlayerDataProvider.get(player).ifPresent(data -> {

                CosmerePowerAssigner.assignInitialData(data, player.getRandom());

                player.sendSystemMessage(Component.literal("§fTu Conexión con Conservación se ha restablecido"));
            });
        }
        return 0;
    }

    private static int clearPowers(CommandContext<CommandSourceStack> context, Collection<ServerPlayer> targets) {
        for (ServerPlayer player : targets) {
            PlayerDataProvider.get(player).ifPresent(data -> {
                data.setNoPowers(true);
                data.setFullAllomancer(false);
                data.setFullFeruchemist(false);
                data.setInvestitureUEA(1.5);
                data.setSpiritWebSize(10);
                player.sendSystemMessage(Component.literal("§0Has perdido tu Conexión con Conservación"));
            });
        }
        return 0;
    }

    private static int showInfo(CommandSourceStack source) {
        if (!(source.getEntity() instanceof Player player)) {
            source.sendFailure(Component.literal("Solo los jugadores pueden usar este comando."));
            return 0;
        }

        PlayerDataProvider.get(player).ifPresent(data -> {
            player.sendSystemMessage(Component.literal("§6--- ESTADO DEL COSMERE ---"));

            // --- Lógica de Títulos y Metales ---
            StringBuilder poderesStr = new StringBuilder();

            if (data.isFullAllomancer() && data.isFullFeruchemist()) {
                poderesStr.append("§dFullborn");
            } else {
                // --- PARTE ALOMÁNTICA ---
                if (data.isFullAllomancer()) {
                    poderesStr.append("§bMistborn");
                } else if (!data.getAllomanticMetals().isEmpty()) {
                    // Para cada metal que tenga, sacamos su nombre alomántico
                    data.getAllomanticMetals().forEach(metal ->
                            poderesStr.append("§7").append(metal.getAllomancyName())
                                    .append(" (").append(metal.name().toLowerCase()).append(")")
                    );
                }

                if (data.hasAllomancy() && data.hasFeruchemy()) poderesStr.append(" §f& ");

                // --- PARTE FERUQUÍMICA ---
                if (data.isFullFeruchemist()) {
                    poderesStr.append("§eFeruchemist");
                } else if (!data.getFeruchemicalMetals().isEmpty()) {
                    data.getFeruchemicalMetals().forEach(metal ->
                            poderesStr.append("§7").append(metal.getFeruchemyName())
                                    .append(" (").append(metal.name().toLowerCase()).append(")")
                    );
                }

                if (poderesStr.isEmpty()) poderesStr.append("§8Drab");
            }

            player.sendSystemMessage(Component.literal("§7Powers: " + poderesStr.toString()));
            player.sendSystemMessage(Component.literal(String.format("§7Investiture: §b%.2f UEA", data.getInvestitureUEA())));
            player.sendSystemMessage(Component.literal("§7Spiritweb Integrity: §a" + data.getSpiritWebIntegrity() + "%"));
            player.sendSystemMessage(Component.literal("§7Spiritweb Size: §b" + data.getSpiritWebSize()));
            player.sendSystemMessage(Component.literal("§6-------------------------"));
        });

        return 1;
    }
}