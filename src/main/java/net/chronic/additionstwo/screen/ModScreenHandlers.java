package net.chronic.additionstwo.screen;

import net.chronic.additionstwo.screen.custom.AlloyerScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.chronic.additionstwo.AdditionsTwo;
import net.chronic.additionstwo.screen.custom.PedestalScreenHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {
    public static final ScreenHandlerType<PedestalScreenHandler> PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(AdditionsTwo.MOD_ID, "pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(PedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<AlloyerScreenHandler> ALLOYER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(AdditionsTwo.MOD_ID, "alloyer_screen_handler"),
                    new ExtendedScreenHandlerType<>(AlloyerScreenHandler::new, BlockPos.PACKET_CODEC));

    public static void registerScreenHandlers() {
        AdditionsTwo.LOGGER.info("Registering Screen Handlers for " + AdditionsTwo.MOD_ID);
    }
}