package net.acticraft.actiextension;

import net.acticraft.actiextension.DefaultCommands.HelpGuiCommand;
import net.acticraft.actiextension.GUIEvents.ClickEvent;
import net.acticraft.actiextension.Guis.HelpGui;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class ActiExtension extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[]=================[" + ChatColor.of(new Color(61, 168, 255)) + ChatColor.BOLD + "ActiExtension" + ChatColor.GRAY + "]=================[]");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of(new Color(65, 65, 65)) + "       Name:" + ChatColor.of(new Color(61, 168, 255)) + " ActiExtension");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of(new Color(65, 65, 65)) + "       Developer:" + ChatColor.of(new Color(61, 168, 255)) + " Mat");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of(new Color(65, 65, 65)) + "       Discord:" + ChatColor.of(new Color(61, 168, 255)) + " Mat#5000");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of(new Color(65, 65, 65)) + "       Type:" + ChatColor.of(new Color(166, 255, 241)) + "Open Source");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[]===============================================[]");


        //Command
        getCommand("hgui").setExecutor(new HelpGuiCommand());



        //Events
        getServer().getPluginManager().registerEvents(new ClickEvent(), this);

        // Load HelpGUI
        HelpGui.SetHelpGui();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[]=================[" + ChatColor.of(new Color(61, 168, 255)) + ChatColor.BOLD + "ActiExtension" + ChatColor.GRAY + "]=================[]");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of(new Color(65, 65, 65)) + "       Status:" + ChatColor.of(new Color(129, 61, 255)) + " SHUTTING DOWN");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[]===============================================[]");
    }
}
