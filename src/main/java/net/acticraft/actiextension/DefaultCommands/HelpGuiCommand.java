package net.acticraft.actiextension.DefaultCommands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.ipvp.canvas.Menu;

public class HelpGuiCommand implements CommandExecutor {

    public void displayMenu(Player player) {
        Menu menu = createMenu();
        menu.open(player);
    }

}
