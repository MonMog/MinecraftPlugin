package dontbreak.youwillfly;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public final class Youwillfly extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getLogger().info("Hello I am in the server");
    }


    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Location location = event.getPlayer().getLocation();
        location.setY(location.getY() + 15);
        event.getPlayer().teleport(location);
    }

    @Override
    public void onDisable() {
        getServer().getLogger().info("Goodbye I am no longer in the server");
    }
}
