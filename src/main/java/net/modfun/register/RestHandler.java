package net.modfun.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class RestHandler
{
    /*@SubscribeEvent
    public static void initItems(RegistryEvent.Register<Item> event)1
    {
        //Register all items
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.registerAll(RegistBlock.getItemBlocks());
    }

    @SubscribeEvent
    public static void regBlocks(RegistryEvent.Register<Block> event)
    {
        //Register all blocks
        event.getRegistry().registerAll(RegistBlock.getBlocks());
        RegistBlock.regTileEntities();
    }
    */
}
