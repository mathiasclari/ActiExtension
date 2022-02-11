package net.acticraft.actiextension.GUIEvents;

import net.acticraft.actiextension.Guis.HelpGui;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;

public class ClickEventBlocker implements Listener {
    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {

        if (e.getInventory().equals(hgui))

            e.setCancelled(true);

    }
}