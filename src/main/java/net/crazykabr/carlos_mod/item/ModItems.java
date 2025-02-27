package net.crazykabr.carlos_mod.item;

import net.crazykabr.carlos_mod.Carlos_mod;
import net.crazykabr.carlos_mod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Carlos_mod.MOD_ID); //Isso inicializa a criação dos meus itens.

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", //Exemplo de um item meu criado.
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMETHYST_CHISEL = ITEMS.register("amethyst_chisel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(300)));

    public static void register(IEventBus eventBus) {  //Registrador dos meus itens, ele... Registra? Eu acho...
        ITEMS.register(eventBus);
    }
}
