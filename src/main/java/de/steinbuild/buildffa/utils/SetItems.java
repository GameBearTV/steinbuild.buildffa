package de.steinbuild.buildffa.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class SetItems {

    public static void setItems(Player player) {

        //Items:

        ItemStack DIAMOND_SWORD = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta SWORDMETA = DIAMOND_SWORD.getItemMeta();
        SWORDMETA.setDisplayName(ChatColor.BLUE + "Knüppel");
        SWORDMETA.addEnchant(Enchantment.DAMAGE_ALL,2,true);
        DIAMOND_SWORD.setItemMeta(SWORDMETA);
        player.getInventory().setItem(0, DIAMOND_SWORD);

        ItemStack GOLDEN_APPLE = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta APPLEMETA = GOLDEN_APPLE.getItemMeta();
        GOLDEN_APPLE.setAmount(13);
        APPLEMETA.setDisplayName("Heil-Apfel");
        GOLDEN_APPLE.setItemMeta(APPLEMETA);
        player.getInventory().setItem(1, GOLDEN_APPLE);

        ItemStack HEALTH_POTION = new ItemStack(Material.POTION, 5, (short) 16421);
        ItemMeta HEALTHPOTIONMETA = HEALTH_POTION.getItemMeta();
        HEALTHPOTIONMETA.setDisplayName(ChatColor.GREEN + "Healing Potion");
        HEALTH_POTION.setItemMeta(HEALTHPOTIONMETA);
        player.getInventory().setItem(2, HEALTH_POTION);

        ItemStack WOOD1 = new ItemStack(Material.WOOD);
        ItemMeta WOODMETA = WOOD1.getItemMeta();
        WOOD1.setAmount(128);
        WOODMETA.setDisplayName(ChatColor.DARK_RED + "WOOD");
        WOOD1.setItemMeta(WOODMETA);
        player.getInventory().setItem(8, WOOD1);

        //Armour:

        ItemStack DIAHELMET = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta DIAHELMETMETA = DIAHELMET.getItemMeta();
        DIAHELMET.setAmount(1);
        DIAHELMETMETA.setDisplayName(ChatColor.BLUE + "Diamant Helm");
        DIAHELMET.setItemMeta(DIAHELMETMETA);
        player.getInventory().setItem(39, DIAHELMET);

        ItemStack DIACHEST = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta DIACHESTMETA = DIACHEST.getItemMeta();
        DIACHEST.setAmount(1);
        DIACHESTMETA.setDisplayName(ChatColor.BLUE + "Diamant Brustplatte");
        DIACHEST.setItemMeta(DIACHESTMETA);
        player.getInventory().setItem(38, DIACHEST);

        ItemStack DIALEGS = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta DIALEGSMETA = DIALEGS.getItemMeta();
        DIALEGS.setAmount(1);
        DIALEGSMETA.setDisplayName(ChatColor.BLUE + "Diamant Hose");
        DIALEGS.setItemMeta(DIALEGSMETA);
        player.getInventory().setItem(37, DIALEGS);

        ItemStack DIABOOTS = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta DIABOOTSMETA = DIABOOTS.getItemMeta();
        DIABOOTS.setAmount(1);
        DIABOOTSMETA.setDisplayName(ChatColor.BLUE + "Diamant Schuhe");
        DIABOOTS.setItemMeta(DIABOOTSMETA);
        player.getInventory().setItem(36, DIABOOTS);



    }
    public static void setItems1(Player player) {

        //Items:

        ItemStack DIAMOND_SWORD = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta SWORDMETA = DIAMOND_SWORD.getItemMeta();
        SWORDMETA.setDisplayName(ChatColor.BLUE + "Knüppel");
        SWORDMETA.addEnchant(Enchantment.DAMAGE_ALL,2,true);
        DIAMOND_SWORD.setItemMeta(SWORDMETA);
        player.getInventory().setItem(0, DIAMOND_SWORD);

        ItemStack GOLDEN_APPLE = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta APPLEMETA = GOLDEN_APPLE.getItemMeta();
        GOLDEN_APPLE.setAmount(13);
        APPLEMETA.setDisplayName("Heil-Apfel");
        GOLDEN_APPLE.setItemMeta(APPLEMETA);
        player.getInventory().setItem(7, GOLDEN_APPLE);

        ItemStack HEALTH_POTION = new ItemStack(Material.POTION, 5, (short) 16421);
        ItemMeta HEALTHPOTIONMETA = HEALTH_POTION.getItemMeta();
        HEALTHPOTIONMETA.setDisplayName(ChatColor.GREEN + "Healing Potion");
        HEALTH_POTION.setItemMeta(HEALTHPOTIONMETA);
        player.getInventory().setItem(2, HEALTH_POTION);

        ItemStack STONE = new ItemStack(Material.STONE);
        ItemMeta STONEMETA = STONE.getItemMeta();
        STONE.setAmount(2147483647);
        STONEMETA.setDisplayName(ChatColor.GRAY + "Stein");
        STONE.setItemMeta(STONEMETA);
        player.getInventory().setItem(8, STONE);

        ItemStack ROD = new ItemStack(Material.FISHING_ROD);
        ItemMeta RODMETA = ROD.getItemMeta();
        ROD.setAmount(1);
        RODMETA.setDisplayName(ChatColor.WHITE + "Fishing Rod");
        ROD.setItemMeta(RODMETA);
        RODMETA.spigot().setUnbreakable(true);
        player.getInventory().setItem(1, ROD);

        ItemStack PEARL = new ItemStack(Material.ENDER_PEARL);
        ItemMeta PEARLMETA = PEARL.getItemMeta();
        PEARL.setAmount(1);
        PEARLMETA.setDisplayName(ChatColor.DARK_PURPLE + "Ender Perle");
        PEARL.setItemMeta(PEARLMETA);
        player.getInventory().setItem(4, PEARL);

        ItemStack WEB = new ItemStack(Material.WEB);
        ItemMeta WEBMETA = WEB.getItemMeta();
        WEB.setAmount(10);
        WEBMETA.setDisplayName(ChatColor.DARK_PURPLE + "Cobwebs");
        WEB.setItemMeta(WEBMETA);
        player.getInventory().setItem(3, WEB);

        //Armour:

        ItemStack DIAHELMET = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta DIAHELMETMETA = DIAHELMET.getItemMeta();
        DIAHELMET.setAmount(1);
        DIAHELMETMETA.setDisplayName(ChatColor.BLUE + "Diamant Helm");
        DIAHELMET.setItemMeta(DIAHELMETMETA);
        player.getInventory().setItem(39, DIAHELMET);

        ItemStack DIACHEST = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta DIACHESTMETA = DIACHEST.getItemMeta();
        DIACHEST.setAmount(1);
        DIACHESTMETA.setDisplayName(ChatColor.BLUE + "Diamant Brustplatte");
        DIACHEST.setItemMeta(DIACHESTMETA);
        player.getInventory().setItem(38, DIACHEST);

        ItemStack DIALEGS = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta DIALEGSMETA = DIALEGS.getItemMeta();
        DIALEGS.setAmount(1);
        DIALEGSMETA.setDisplayName(ChatColor.BLUE + "Diamant Hose");
        DIALEGS.setItemMeta(DIALEGSMETA);
        player.getInventory().setItem(37, DIALEGS);

        ItemStack DIABOOTS = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta DIABOOTSMETA = DIABOOTS.getItemMeta();
        DIABOOTS.setAmount(1);
        DIABOOTSMETA.setDisplayName(ChatColor.BLUE + "Diamant Schuhe");
        DIABOOTS.setItemMeta(DIABOOTSMETA);
        player.getInventory().setItem(36, DIABOOTS);



    }
}
