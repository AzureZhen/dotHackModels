package mod.azure.rcraft.proxy;

import mod.azure.rcraft.RcraftMod;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	@EventHandler
	public void preInit()
    {
		OBJLoader.INSTANCE.addDomain(RcraftMod.modid);
    }
	
	@EventHandler
	public void init() {
		
	}
	
	@EventHandler
	public void postInit() {
		
	}
}
