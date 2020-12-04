package com.bmp.NoCreeperExplosions;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class NoCreeperExplosions  extends JavaPlugin implements Listener {
	@Override
    public void onEnable() {
    	getLogger().info("onEnable has been invoked!");
    	this.getServer().getPluginManager().registerEvents(this, this);
    }
    
    @Override
    public void onDisable() {
    	getLogger().info("onDisable has been invoked!");
    }
    
    @EventHandler
    public void entityExplodeEvent(org.bukkit.event.entity.EntityExplodeEvent event){
    	if(event.getEntity() instanceof Creeper) {
    		event.blockList().clear();
    	}
    }
}