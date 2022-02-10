package net.acticraft.actiextension.DefaultCommands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.util.ArrayList;

public class HelpGuiCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){


            Player p = (Player) sender;

            Inventory hgui = Bukkit.createInventory(p, 9, ChatColor.of(new Color(61, 168, 255))+"Help Gui");

            ItemStack suicide = new ItemStack(Material.TNT);
            ItemStack feed = new ItemStack(Material.CAKE);
            ItemStack sword = new ItemStack(Material.IRON_SWORD);

            ItemMeta suicide_meta = suicide.getItemMeta();
            suicide_meta.setDisplayName(ChatColor.of(new Color(255, 61, 129))+"Suicide");
            ArrayList<String> suicide_lore = new ArrayList<>();
            suicide_lore.add(ChatColor.of(new Color(152, 23, 70))+"Try it out");
            suicide_meta.setLore(suicide_lore);
            suicide.setItemMeta(suicide_meta);

            ItemStack[] menu_items = {suicide, feed, sword};
            hgui.setContents(menu_items);


            p.openInventory(hgui);
        }
        return false;
    }
}
