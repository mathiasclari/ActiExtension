package net.acticraft.actiextension.GuiList;

import org.bukkit.inventory.Inventory;
import org.ipvp.canvas.Menu;
import org.ipvp.canvas.mask.Mask;
import org.ipvp.canvas.mask.RecipeMask;
import org.ipvp.canvas.type.ChestMenu;

public class LobbyGui {

    public Menu createMenu() {
        return ChestMenu.builder(4)
                .title("Menu")
                .build();
    }
}
