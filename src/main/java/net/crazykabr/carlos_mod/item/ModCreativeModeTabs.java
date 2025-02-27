package net.crazykabr.carlos_mod.item;

import net.crazykabr.carlos_mod.Carlos_mod;
import net.crazykabr.carlos_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Carlos_mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CARLOS_MOD_TAB = CREATIVE_MODE_TABS.register("carlosm_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.carlos_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE.get());        //Adicione aqui os itens na aba do próprio mod
                        output.accept(ModItems.RAW_SAPPHIRE.get());
                        output.accept(ModItems.AMETHYST_CHISEL.get());
                        output.accept(ModItems.METAL_DETECTOR.get());

                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
