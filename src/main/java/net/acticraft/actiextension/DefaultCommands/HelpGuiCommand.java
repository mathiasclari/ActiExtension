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

import java.awt.*;

public class HelpGuiCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){


            Player p = (Player) sender;

            Inventory hgui = Bukkit.createInventory(p, 9, ChatColor.of(new Color(61, 168, 255))+"Help Gui");

            ItemStack suicide = new ItemStack(Material.TNT);
            ItemStack feed = new ItemStack(Material.CAKE);
            ItemStack sword = new ItemStack(Material.IRON_SWORD);

            p.openInventory(hgui);
        }
        return false;
    }
}
