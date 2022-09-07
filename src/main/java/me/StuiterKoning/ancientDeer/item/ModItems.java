package me.StuiterKoning.ancientDeer.item;
import me.StuiterKoning.ancientDeer.AncientDeerMod;
import me.StuiterKoning.ancientDeer.entity.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AncientDeerMod.MOD_ID);

    public static final RegistryObject<Item> Antlers = ITEMS.register("deer_antlers",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> AncientAntler = ITEMS.register("ancient_elk_antler",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> DeerSpawnEgg = ITEMS.register("deer_spawn_egg",
            ()-> new ForgeSpawnEggItem(ModEntityTypes.DEER, 0x6d422d, 0x421e11, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
