package me.gallowsdove.foxymachines.types;

import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun5.libraries.keys.NamespacedKey;
import me.gallowsdove.foxymachines.FoxyMachines;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

public class FoxyRecipeType {
    private static final ItemStack QUEST_ITEM = CustomItemStack.create(
            Material.MOJANG_BANNER_PATTERN,
            "&6Quest Reward",
            "",
            "&e&oGet this by completing the quest with the sword.",
            "&e&oUse &c/foxy quest &e&oto view your current quest."
    );

    static {
        ItemMeta meta = QUEST_ITEM.getItemMeta();
        if (meta != null) {
            meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            QUEST_ITEM.setItemMeta(meta);
        }
    }

    public static final RecipeType SACRIFICIAL_ALTAR = new RecipeType(
            new NamespacedKey(FoxyMachines.getInstance(), "sacrificial_altar"),
            CustomItemStack.create(
                    Material.POLISHED_BLACKSTONE_BRICKS,
                    "&cSacrificial Altar",
                    "",
                    "&e&oSacrifice the mob in the Sacrificial Altar",
                    "&e&oUse &c/foxy altar &e&oto view the multiblock."
            )
    );

    public static final RecipeType FISHING = new RecipeType(
            new NamespacedKey(FoxyMachines.getInstance(), "fishing"),
            CustomItemStack.create(Material.FISHING_ROD, "&bFishing", "", "&e&oGet this as a fishing loot.")
    );

    public static final RecipeType QUEST = new RecipeType(
            new NamespacedKey(FoxyMachines.getInstance(), "quest"),
            QUEST_ITEM
    );

    public static final RecipeType CUSTOM_MOB_DROP = new RecipeType(
            new NamespacedKey(FoxyMachines.getInstance(), "mob_drop"),
            CustomItemStack.create(Material.DIAMOND_SWORD, "&aUnique Mob Drop", "", "&e&oObtained by killing the specified mob.")
    );
}
