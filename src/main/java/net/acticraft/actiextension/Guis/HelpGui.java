package net.acticraft.actiextension.Guis;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.util.ArrayList;

import static org.bukkit.Material.*;

public class HelpGui implements CommandExecutor , Listener {

    // GUI Create
    public static Inventory HelpGUIMeunu = Bukkit.createInventory(null, 9, ChatColor.of(new Color(61, 168, 255))+"Help Gui");

    public static void SetHelpGui(){

        // SetItems
        ItemStack suicide = new ItemStack(TNT);
        ItemStack feed = new ItemStack(Material.CAKE);
        ItemStack sword = new ItemStack(Material.IRON_SWORD);

        ItemMeta suicide_meta = suicide.getItemMeta();
        suicide_meta.setDisplayName(ChatColor.of(new Color(255, 61, 129))+"Suicide");
        ArrayList<String> suicide_lore = new ArrayList<>();
        suicide_lore.add(ChatColor.of(new Color(152, 23, 70))+"Try it out");
        suicide_meta.setLore(suicide_lore);
        suicide.setItemMeta(suicide_meta);

        ItemStack[] menu_items = {suicide, feed, sword};
        HelpGUIMeunu.setContents(menu_items);
    }

    // Open Gui Command
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            ((Player) sender).getPlayer().openInventory(HelpGUIMeunu);
        }

        return false;

    }

    // events
    @EventHandler
    public void HelpMenuAction(InventoryClickEvent event){
        if(event.getView().getTitle().equalsIgnoreCase("Help Gui")) {

            // item
            if (event.getInventory().equals(HelpGUIMeunu)) {
                Player player = (Player) event.getWhoClicked();
                //Determine what they selected and what to do
                switch (event.getCurrentItem().getType()) {
                    case TNT:
                        player.closeInventory();
                        player.setHealth(0.0);
                        player.sendMessage("You just killed yourself");
                        break;
                    case BREAD:
                        player.closeInventory();
                        player.setFoodLevel(20);
                        player.sendMessage("YUM!");
                        break;
                    case DIAMOND_SWORD:
                        player.closeInventory();
                        player.getInventory().addItem(new ItemStack(DIAMOND_SWORD));
                        player.sendMessage("Don't slice yourself");
                        break;
                }


                event.setCancelled(true);
            }
            event.setCancelled(true);

        }

    }

}
