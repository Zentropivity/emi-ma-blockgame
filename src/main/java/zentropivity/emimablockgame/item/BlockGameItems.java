package zentropivity.emimablockgame.item;

import java.util.Map;

import org.slf4j.Logger;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.StringNbtReader;
import static java.util.Map.entry;

import java.util.HashMap;

public class BlockGameItems {
  private final Map<String, EmiStack> ITEMS;

  public static EmiStack createItem(Item item, String bgItem, String name) {
    ItemStack Stack = new ItemStack(item);
    // Stack.setCount(0);

    String nbt = "{ \"display\": {\"Name\": '{\"text\":\"" + name
        + "\",\"color\":\"white\",\"italic\":false}'}, \"MMOITEMS_ITEM_ID\": \"" + bgItem + "\" }";

    NbtCompound NBT = new NbtCompound();
    try {
      NBT = StringNbtReader.parse(nbt);
    } catch (CommandSyntaxException e) {
      throw new RuntimeException(e);
    }
    Stack.setNbt(NBT);

    return EmiStack.of(Stack);
  }

  public BlockGameItems() {
    Map<String, EmiStack> map = new HashMap<String, EmiStack>();
    map.put("ACOLYTE_BOOTS", createItem(Items.LEATHER_BOOTS, "ACOLYTE_BOOTS", "Acolyte Boots"));
    map.put("ACOLYTE_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "ACOLYTE_CHESTPLATE", "Acolyte Chestplate"));
    map.put("ACOLYTE_HELMET", createItem(Items.LEATHER_HELMET, "ACOLYTE_HELMET", "Acolyte Helmet"));
    map.put("ACOLYTE_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "ACOLYTE_LEGGINGS", "Acolyte Leggings"));
    map.put("ANCIENT_POTTERY", createItem(Items.FLOWER_POT, "ANCIENT_POTTERY", "Ancient Pottery"));
    map.put("ANIMATED_BONE", createItem(Items.BONE, "ANIMATED_BONE", "Animated Bone"));
    map.put("ARCHAEOLOGIST_BOOTS", createItem(Items.LEATHER_BOOTS, "ARCHAEOLOGIST_BOOTS", "Archaeologist Boots"));
    map.put("ARCHAEOLOGIST_BOOTS_1", createItem(Items.LEATHER_BOOTS, "ARCHAEOLOGIST_BOOTS_1", "Archaeologist Boots 1"));
    map.put("ARCHAEOLOGIST_BOOTS_2", createItem(Items.LEATHER_BOOTS, "ARCHAEOLOGIST_BOOTS_2", "Archaeologist Boots 2"));
    map.put("ARCHAEOLOGIST_BOOTS_3", createItem(Items.LEATHER_BOOTS, "ARCHAEOLOGIST_BOOTS_3", "Archaeologist Boots 3"));
    map.put("ARCHAEOLOGIST_BOOTS_4", createItem(Items.LEATHER_BOOTS, "ARCHAEOLOGIST_BOOTS_4", "Archaeologist Boots 4"));
    map.put("ARCHAEOLOGIST_BOOTS_5", createItem(Items.LEATHER_BOOTS, "ARCHAEOLOGIST_BOOTS_5", "Archaeologist Boots 5"));
    map.put("ARCHAEOLOGIST_CHESTPLATE",
        createItem(Items.LEATHER_CHESTPLATE, "ARCHAEOLOGIST_CHESTPLATE", "Archaeologist Chestplate"));
    map.put("ARCHAEOLOGIST_CHESTPLATE_1",
        createItem(Items.LEATHER_CHESTPLATE, "ARCHAEOLOGIST_CHESTPLATE_1", "Archaeologist Chestplate 1"));
    map.put("ARCHAEOLOGIST_CHESTPLATE_2",
        createItem(Items.LEATHER_CHESTPLATE, "ARCHAEOLOGIST_CHESTPLATE_2", "Archaeologist Chestplate 2"));
    map.put("ARCHAEOLOGIST_CHESTPLATE_3",
        createItem(Items.LEATHER_CHESTPLATE, "ARCHAEOLOGIST_CHESTPLATE_3", "Archaeologist Chestplate 3"));
    map.put("ARCHAEOLOGIST_CHESTPLATE_4",
        createItem(Items.LEATHER_CHESTPLATE, "ARCHAEOLOGIST_CHESTPLATE_4", "Archaeologist Chestplate 4"));
    map.put("ARCHAEOLOGIST_CHESTPLATE_5",
        createItem(Items.LEATHER_CHESTPLATE, "ARCHAEOLOGIST_CHESTPLATE_5", "Archaeologist Chestplate 5"));
    map.put("ARCHAEOLOGIST_HELMET", createItem(Items.LEATHER_HELMET, "ARCHAEOLOGIST_HELMET", "Archaeologist Helmet"));
    map.put("ARCHAEOLOGIST_HELMET_1",
        createItem(Items.LEATHER_HELMET, "ARCHAEOLOGIST_HELMET_1", "Archaeologist Helmet 1"));
    map.put("ARCHAEOLOGIST_HELMET_2",
        createItem(Items.LEATHER_HELMET, "ARCHAEOLOGIST_HELMET_2", "Archaeologist Helmet 2"));
    map.put("ARCHAEOLOGIST_HELMET_3",
        createItem(Items.LEATHER_HELMET, "ARCHAEOLOGIST_HELMET_3", "Archaeologist Helmet 3"));
    map.put("ARCHAEOLOGIST_HELMET_4",
        createItem(Items.LEATHER_HELMET, "ARCHAEOLOGIST_HELMET_4", "Archaeologist Helmet 4"));
    map.put("ARCHAEOLOGIST_HELMET_5",
        createItem(Items.LEATHER_HELMET, "ARCHAEOLOGIST_HELMET_5", "Archaeologist Helmet 5"));
    map.put("ARCHAEOLOGIST_LEGGINGS",
        createItem(Items.LEATHER_LEGGINGS, "ARCHAEOLOGIST_LEGGINGS", "Archaeologist Leggings"));
    map.put("ARCHAEOLOGIST_LEGGINGS_1",
        createItem(Items.LEATHER_LEGGINGS, "ARCHAEOLOGIST_LEGGINGS_1", "Archaeologist Leggings 1"));
    map.put("ARCHAEOLOGIST_LEGGINGS_2",
        createItem(Items.LEATHER_LEGGINGS, "ARCHAEOLOGIST_LEGGINGS_2", "Archaeologist Leggings 2"));
    map.put("ARCHAEOLOGIST_LEGGINGS_3",
        createItem(Items.LEATHER_LEGGINGS, "ARCHAEOLOGIST_LEGGINGS_3", "Archaeologist Leggings 3"));
    map.put("ARCHAEOLOGIST_LEGGINGS_4",
        createItem(Items.LEATHER_LEGGINGS, "ARCHAEOLOGIST_LEGGINGS_4", "Archaeologist Leggings 4"));
    map.put("ARCHAEOLOGIST_LEGGINGS_5",
        createItem(Items.LEATHER_LEGGINGS, "ARCHAEOLOGIST_LEGGINGS_5", "Archaeologist Leggings 5"));
    map.put("AUGMENT_ARCHAEOLOGY_1", createItem(Items.LEVER, "AUGMENT_ARCHAEOLOGY_1", "Augment Archaeology 1"));
    map.put("AUGMENT_ARCHAEOLOGY_2", createItem(Items.LEVER, "AUGMENT_ARCHAEOLOGY_2", "Augment Archaeology 2"));
    map.put("AUGMENT_ARCHAEOLOGY_3", createItem(Items.LEVER, "AUGMENT_ARCHAEOLOGY_3", "Augment Archaeology 3"));
    map.put("AUGMENT_ARCHAEOLOGY_4", createItem(Items.LEVER, "AUGMENT_ARCHAEOLOGY_4", "Augment Archaeology 4"));
    map.put("AUGMENT_ARCHAEOLOGY_5", createItem(Items.LEVER, "AUGMENT_ARCHAEOLOGY_5", "Augment Archaeology 5"));
    map.put("AUGMENT_FISHING_1", createItem(Items.CHEST, "AUGMENT_FISHING_1", "Augment Fishing 1"));
    map.put("AUGMENT_FISHING_2", createItem(Items.CHEST, "AUGMENT_FISHING_2", "Augment Fishing 2"));
    map.put("AUGMENT_FISHING_3", createItem(Items.CHEST, "AUGMENT_FISHING_3", "Augment Fishing 3"));
    map.put("AUGMENT_FISHING_4", createItem(Items.CHEST, "AUGMENT_FISHING_4", "Augment Fishing 4"));
    map.put("AUGMENT_FISHING_5", createItem(Items.ENDER_CHEST, "AUGMENT_FISHING_5", "Augment Fishing 5"));
    map.put("AUGMENT_HERBALISM_1", createItem(Items.FLOWER_POT, "AUGMENT_HERBALISM_1", "Augment Herbalism 1"));
    map.put("AUGMENT_HERBALISM_2", createItem(Items.FLOWER_POT, "AUGMENT_HERBALISM_2", "Augment Herbalism 2"));
    map.put("AUGMENT_HERBALISM_3", createItem(Items.FLOWER_POT, "AUGMENT_HERBALISM_3", "Augment Herbalism 3"));
    map.put("AUGMENT_HERBALISM_4", createItem(Items.FLOWER_POT, "AUGMENT_HERBALISM_4", "Augment Herbalism 4"));
    map.put("AUGMENT_HERBALISM_5", createItem(Items.FLOWER_POT, "AUGMENT_HERBALISM_5", "Augment Herbalism 5"));
    map.put("AUGMENT_LOGGING_1", createItem(Items.CLOCK, "AUGMENT_LOGGING_1", "Augment Logging 1"));
    map.put("AUGMENT_LOGGING_2", createItem(Items.CLOCK, "AUGMENT_LOGGING_2", "Augment Logging 2"));
    map.put("AUGMENT_LOGGING_3", createItem(Items.CLOCK, "AUGMENT_LOGGING_3", "Augment Logging 3"));
    map.put("AUGMENT_LOGGING_4", createItem(Items.CLOCK, "AUGMENT_LOGGING_4", "Augment Logging 4"));
    map.put("AUGMENT_LOGGING_5", createItem(Items.CLOCK, "AUGMENT_LOGGING_5", "Augment Logging 5"));
    map.put("AUGMENT_MINING_1", createItem(Items.STICK, "AUGMENT_MINING_1", "Augment Mining 1"));
    map.put("AUGMENT_MINING_2", createItem(Items.LIGHTNING_ROD, "AUGMENT_MINING_2", "Augment Mining 2"));
    map.put("AUGMENT_MINING_3", createItem(Items.END_ROD, "AUGMENT_MINING_3", "Augment Mining 3"));
    map.put("AUGMENT_MINING_4", createItem(Items.SOUL_TORCH, "AUGMENT_MINING_4", "Augment Mining 4"));
    map.put("AUGMENT_MINING_5", createItem(Items.CHAIN, "AUGMENT_MINING_5", "Augment Mining 5"));
    map.put("BACON_AND_EGGS", createItem(Items.RABBIT_STEW, "BACON_AND_EGGS", "Bacon And Eggs"));
    map.put("BACON_BITS", createItem(Items.COCOA_BEANS, "BACON_BITS", "Bacon Bits"));
    map.put("BLESSED_WOOL_BOOTS", createItem(Items.LEATHER_BOOTS, "BLESSED_WOOL_BOOTS", "Blessed Wool Boots"));
    map.put("BLESSED_WOOL_CHESTPLATE",
        createItem(Items.LEATHER_CHESTPLATE, "BLESSED_WOOL_CHESTPLATE", "Blessed Wool Chestplate"));
    map.put("BLESSED_WOOL_HELMET", createItem(Items.LEATHER_HELMET, "BLESSED_WOOL_HELMET", "Blessed Wool Helmet"));
    map.put("BLESSED_WOOL_LEGGINGS",
        createItem(Items.LEATHER_LEGGINGS, "BLESSED_WOOL_LEGGINGS", "Blessed Wool Leggings"));
    map.put("BLOODSNOUT_BLADE", createItem(Items.GOLDEN_SWORD, "BLOODSNOUT_BLADE", "Bloodsnout Blade"));
    map.put("BLOODSNOUT_BRUTE_BOOTS",
        createItem(Items.GOLDEN_BOOTS, "BLOODSNOUT_BRUTE_BOOTS", "Bloodsnout Brute Boots"));
    map.put("BLOODSNOUT_BRUTE_CHESTPLATE",
        createItem(Items.GOLDEN_CHESTPLATE, "BLOODSNOUT_BRUTE_CHESTPLATE", "Bloodsnout Brute Chestplate"));
    map.put("BLOODSNOUT_BRUTE_HELMET",
        createItem(Items.GOLDEN_HELMET, "BLOODSNOUT_BRUTE_HELMET", "Bloodsnout Brute Helmet"));
    map.put("BLOODSNOUT_BRUTE_LEGGINGS",
        createItem(Items.GOLDEN_LEGGINGS, "BLOODSNOUT_BRUTE_LEGGINGS", "Bloodsnout Brute Leggings"));
    map.put("BLOODSNOUT_HEALER_BOOTS",
        createItem(Items.LEATHER_BOOTS, "BLOODSNOUT_HEALER_BOOTS", "Bloodsnout Healer Boots"));
    map.put("BLOODSNOUT_HEALER_CHESTPLATE",
        createItem(Items.LEATHER_CHESTPLATE, "BLOODSNOUT_HEALER_CHESTPLATE", "Bloodsnout Healer Chestplate"));
    map.put("BLOODSNOUT_HEALER_HELMET",
        createItem(Items.LEATHER_HELMET, "BLOODSNOUT_HEALER_HELMET", "Bloodsnout Healer Helmet"));
    map.put("BLOODSNOUT_HEALER_LEGGINGS",
        createItem(Items.LEATHER_LEGGINGS, "BLOODSNOUT_HEALER_LEGGINGS", "Bloodsnout Healer Leggings"));
    map.put("BLOODSNOUT_MACE", createItem(Items.BLAZE_ROD, "BLOODSNOUT_MACE", "Bloodsnout Mace"));
    map.put("BLOODSNOUT_MAGI_BOOTS", createItem(Items.LEATHER_BOOTS, "BLOODSNOUT_MAGI_BOOTS", "Bloodsnout Magi Boots"));
    map.put("BLOODSNOUT_MAGI_CHESTPLATE",
        createItem(Items.LEATHER_CHESTPLATE, "BLOODSNOUT_MAGI_CHESTPLATE", "Bloodsnout Magi Chestplate"));
    map.put("BLOODSNOUT_MAGI_HELMET",
        createItem(Items.LEATHER_HELMET, "BLOODSNOUT_MAGI_HELMET", "Bloodsnout Magi Helmet"));
    map.put("BLOODSNOUT_MAGI_LEGGINGS",
        createItem(Items.LEATHER_LEGGINGS, "BLOODSNOUT_MAGI_LEGGINGS", "Bloodsnout Magi Leggings"));
    map.put("BLOODSNOUT_SHIELD", createItem(Items.CRIMSON_FUNGUS, "BLOODSNOUT_SHIELD", "Bloodsnout Shield"));
    map.put("BLOODSNOUT_SLAYER_BOOTS",
        createItem(Items.GOLDEN_BOOTS, "BLOODSNOUT_SLAYER_BOOTS", "Bloodsnout Slayer Boots"));
    map.put("BLOODSNOUT_SLAYER_CHESTPLATE",
        createItem(Items.GOLDEN_CHESTPLATE, "BLOODSNOUT_SLAYER_CHESTPLATE", "Bloodsnout Slayer Chestplate"));
    map.put("BLOODSNOUT_SLAYER_HELMET",
        createItem(Items.GOLDEN_HELMET, "BLOODSNOUT_SLAYER_HELMET", "Bloodsnout Slayer Helmet"));
    map.put("BLOODSNOUT_SLAYER_LEGGINGS",
        createItem(Items.GOLDEN_LEGGINGS, "BLOODSNOUT_SLAYER_LEGGINGS", "Bloodsnout Slayer Leggings"));
    map.put("BOLT_BACON", createItem(Items.WHITE_DYE, "BOLT_BACON", "Bolt Bacon"));
    map.put("BOLT_BRANDED", createItem(Items.WHITE_DYE, "BOLT_BRANDED", "Bolt Branded"));
    map.put("BOLT_SANDY", createItem(Items.WHITE_DYE, "BOLT_SANDY", "Bolt Sandy"));
    map.put("BOLT_SCORCHING", createItem(Items.WHITE_DYE, "BOLT_SCORCHING", "Bolt Scorching"));
    map.put("BOLT_SILK", createItem(Items.WHITE_DYE, "BOLT_SILK", "Bolt Silk"));
    map.put("BOLT_SILK_SPARKING", createItem(Items.WHITE_DYE, "BOLT_SILK_SPARKING", "Bolt Silk Sparking"));
    map.put("BOLT_SOULFUL", createItem(Items.WHITE_DYE, "BOLT_SOULFUL", "Bolt Soulful"));
    map.put("BOLT_WOOL", createItem(Items.WHITE_DYE, "BOLT_WOOL", "Bolt Wool"));
    map.put("BOLT_WOOL_BLESSED", createItem(Items.WHITE_DYE, "BOLT_WOOL_BLESSED", "Bolt Wool Blessed"));
    map.put("BOLT_WOOL_GREASY", createItem(Items.WHITE_DYE, "BOLT_WOOL_GREASY", "Bolt Wool Greasy"));
    map.put("BOLT_WOOL_SANCTIFIED", createItem(Items.WHITE_DYE, "BOLT_WOOL_SANCTIFIED", "Bolt Wool Sanctified"));
    map.put("BOLT_WOOL_SANDY", createItem(Items.WHITE_DYE, "BOLT_WOOL_SANDY", "Bolt Wool Sandy"));
    map.put("BONES_EVERPOWERFUL", createItem(Items.BONE, "BONES_EVERPOWERFUL", "Bones Everpowerful"));
    map.put("BONE_BROTH", createItem(Items.POTION, "BONE_BROTH", "Bone Broth"));
    map.put("BONE_SHIELD", createItem(Items.BONE, "BONE_SHIELD", "Bone Shield"));
    map.put("BOTANIST_BOOTS", createItem(Items.LEATHER_BOOTS, "BOTANIST_BOOTS", "Botanist Boots"));
    map.put("BOTANIST_BOOTS_1", createItem(Items.LEATHER_BOOTS, "BOTANIST_BOOTS_1", "Botanist Boots 1"));
    map.put("BOTANIST_BOOTS_2", createItem(Items.LEATHER_BOOTS, "BOTANIST_BOOTS_2", "Botanist Boots 2"));
    map.put("BOTANIST_BOOTS_3", createItem(Items.LEATHER_BOOTS, "BOTANIST_BOOTS_3", "Botanist Boots 3"));
    map.put("BOTANIST_BOOTS_4", createItem(Items.LEATHER_BOOTS, "BOTANIST_BOOTS_4", "Botanist Boots 4"));
    map.put("BOTANIST_BOOTS_5", createItem(Items.LEATHER_BOOTS, "BOTANIST_BOOTS_5", "Botanist Boots 5"));
    map.put("BOTANIST_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "BOTANIST_CHESTPLATE", "Botanist Chestplate"));
    map.put("BOTANIST_CHESTPLATE_1",
        createItem(Items.LEATHER_CHESTPLATE, "BOTANIST_CHESTPLATE_1", "Botanist Chestplate 1"));
    map.put("BOTANIST_CHESTPLATE_2",
        createItem(Items.LEATHER_CHESTPLATE, "BOTANIST_CHESTPLATE_2", "Botanist Chestplate 2"));
    map.put("BOTANIST_CHESTPLATE_3",
        createItem(Items.LEATHER_CHESTPLATE, "BOTANIST_CHESTPLATE_3", "Botanist Chestplate 3"));
    map.put("BOTANIST_CHESTPLATE_4",
        createItem(Items.LEATHER_CHESTPLATE, "BOTANIST_CHESTPLATE_4", "Botanist Chestplate 4"));
    map.put("BOTANIST_CHESTPLATE_5",
        createItem(Items.LEATHER_CHESTPLATE, "BOTANIST_CHESTPLATE_5", "Botanist Chestplate 5"));
    map.put("BOTANIST_HELMET", createItem(Items.LEATHER_HELMET, "BOTANIST_HELMET", "Botanist Helmet"));
    map.put("BOTANIST_HELMET_1", createItem(Items.LEATHER_HELMET, "BOTANIST_HELMET_1", "Botanist Helmet 1"));
    map.put("BOTANIST_HELMET_2", createItem(Items.LEATHER_HELMET, "BOTANIST_HELMET_2", "Botanist Helmet 2"));
    map.put("BOTANIST_HELMET_3", createItem(Items.LEATHER_HELMET, "BOTANIST_HELMET_3", "Botanist Helmet 3"));
    map.put("BOTANIST_HELMET_4", createItem(Items.LEATHER_HELMET, "BOTANIST_HELMET_4", "Botanist Helmet 4"));
    map.put("BOTANIST_HELMET_5", createItem(Items.LEATHER_HELMET, "BOTANIST_HELMET_5", "Botanist Helmet 5"));
    map.put("BOTANIST_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "BOTANIST_LEGGINGS", "Botanist Leggings"));
    map.put("BOTANIST_LEGGINGS_1", createItem(Items.LEATHER_LEGGINGS, "BOTANIST_LEGGINGS_1", "Botanist Leggings 1"));
    map.put("BOTANIST_LEGGINGS_2", createItem(Items.LEATHER_LEGGINGS, "BOTANIST_LEGGINGS_2", "Botanist Leggings 2"));
    map.put("BOTANIST_LEGGINGS_3", createItem(Items.LEATHER_LEGGINGS, "BOTANIST_LEGGINGS_3", "Botanist Leggings 3"));
    map.put("BOTANIST_LEGGINGS_4", createItem(Items.LEATHER_LEGGINGS, "BOTANIST_LEGGINGS_4", "Botanist Leggings 4"));
    map.put("BOTANIST_LEGGINGS_5", createItem(Items.LEATHER_LEGGINGS, "BOTANIST_LEGGINGS_5", "Botanist Leggings 5"));
    map.put("BOTTLE_EARTH", createItem(Items.SPLASH_POTION, "BOTTLE_EARTH", "Bottle Earth"));
    map.put("BOTTLE_FROST", createItem(Items.SPLASH_POTION, "BOTTLE_FROST", "Bottle Frost"));
    map.put("BOTTLE_FROST_GREATER", createItem(Items.SPLASH_POTION, "BOTTLE_FROST_GREATER", "Bottle Frost Greater"));
    map.put("BOTTLE_HAUNTED", createItem(Items.POTION, "BOTTLE_HAUNTED", "Bottle Haunted"));
    map.put("BOTTLE_HEALING", createItem(Items.POTION, "BOTTLE_HEALING", "Bottle Healing"));
    map.put("BOTTLE_HEALING_GLOWING", createItem(Items.POTION, "BOTTLE_HEALING_GLOWING", "Bottle Healing Glowing"));
    map.put("BOTTLE_LAPIS", createItem(Items.POTION, "BOTTLE_LAPIS", "Bottle Lapis"));
    map.put("BOTTLE_LAVA", createItem(Items.SPLASH_POTION, "BOTTLE_LAVA", "Bottle Lava"));
    map.put("BOTTLE_LAVA_GREATER", createItem(Items.SPLASH_POTION, "BOTTLE_LAVA_GREATER", "Bottle Lava Greater"));
    map.put("BOTTLE_REDSTONE", createItem(Items.POTION, "BOTTLE_REDSTONE", "Bottle Redstone"));
    map.put("BOTTLE_WATER_CLEAN", createItem(Items.POTION, "BOTTLE_WATER_CLEAN", "Bottle Water Clean"));
    map.put("BOTTLE_WIND", createItem(Items.SPLASH_POTION, "BOTTLE_WIND", "Bottle Wind"));
    map.put("BRANDED_SOUL", createItem(Items.BLAZE_POWDER, "BRANDED_SOUL", "Branded Soul"));
    map.put("BRASS_AXE", createItem(Items.STONE_AXE, "BRASS_AXE", "Brass Axe"));
    map.put("BRASS_FISHINGPOLE", createItem(Items.FISHING_ROD, "BRASS_FISHINGPOLE", "Brass Fishingpole"));
    map.put("BRASS_HOE", createItem(Items.STONE_HOE, "BRASS_HOE", "Brass Hoe"));
    map.put("BRASS_PICKAXE", createItem(Items.STONE_PICKAXE, "BRASS_PICKAXE", "Brass Pickaxe"));
    map.put("BRASS_SHOVEL", createItem(Items.STONE_SHOVEL, "BRASS_SHOVEL", "Brass Shovel"));
    map.put("BURNING_CORE", createItem(Items.REDSTONE_BLOCK, "BURNING_CORE", "Burning Core"));
    map.put("BUTTER", createItem(Items.GOLD_INGOT, "BUTTER", "Butter"));
    map.put("BUTTER_FRIED_BEEF", createItem(Items.COOKED_BEEF, "BUTTER_FRIED_BEEF", "Butter Fried Beef"));
    map.put("BUTTER_FRIED_CHICKEN", createItem(Items.COOKED_CHICKEN, "BUTTER_FRIED_CHICKEN", "Butter Fried Chicken"));
    map.put("BUTTER_FRIED_COD", createItem(Items.COOKED_COD, "BUTTER_FRIED_COD", "Butter Fried Cod"));
    map.put("BUTTER_FRIED_MUTTON", createItem(Items.COOKED_MUTTON, "BUTTER_FRIED_MUTTON", "Butter Fried Mutton"));
    map.put("BUTTER_FRIED_PORKCHOP",
        createItem(Items.COOKED_PORKCHOP, "BUTTER_FRIED_PORKCHOP", "Butter Fried Porkchop"));
    map.put("BUTTER_FRIED_PUFFERFISH",
        createItem(Items.PUFFERFISH, "BUTTER_FRIED_PUFFERFISH", "Butter Fried Pufferfish"));
    map.put("BUTTER_FRIED_RABBIT", createItem(Items.COOKED_RABBIT, "BUTTER_FRIED_RABBIT", "Butter Fried Rabbit"));
    map.put("BUTTER_FRIED_SALMON", createItem(Items.COOKED_SALMON, "BUTTER_FRIED_SALMON", "Butter Fried Salmon"));
    map.put("BUTTER_FRIED_TROPICAL_FISH",
        createItem(Items.TROPICAL_FISH, "BUTTER_FRIED_TROPICAL_FISH", "Butter Fried Tropical Fish"));
    map.put("CACTUS_BOOTS", createItem(Items.LEATHER_BOOTS, "CACTUS_BOOTS", "Cactus Boots"));
    map.put("CACTUS_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "CACTUS_CHESTPLATE", "Cactus Chestplate"));
    map.put("CACTUS_HELMET", createItem(Items.LEATHER_HELMET, "CACTUS_HELMET", "Cactus Helmet"));
    map.put("CACTUS_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "CACTUS_LEGGINGS", "Cactus Leggings"));
    map.put("CACTUS_SWORD", createItem(Items.WOODEN_SWORD, "CACTUS_SWORD", "Cactus Sword"));
    map.put("CANDYFISH", createItem(Items.TROPICAL_FISH, "CANDYFISH", "Candyfish"));
    map.put("CANDY_CORN", createItem(Items.PUMPKIN_SEEDS, "CANDY_CORN", "Candy Corn"));
    map.put("CHILLED_HIDE", createItem(Items.LEATHER, "CHILLED_HIDE", "Chilled Hide"));
    map.put("CHOCOLATE_RABBIT", createItem(Items.COOKED_RABBIT, "CHOCOLATE_RABBIT", "Chocolate Rabbit"));
    map.put("CINDERS_BOOTS", createItem(Items.LEATHER_BOOTS, "CINDERS_BOOTS", "Cinders Boots"));
    map.put("CINDERS_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "CINDERS_CHESTPLATE", "Cinders Chestplate"));
    map.put("CINDERS_FIREBRAND", createItem(Items.REDSTONE_TORCH, "CINDERS_FIREBRAND", "Cinders Firebrand"));
    map.put("CINDERS_HELMET", createItem(Items.LEATHER_HELMET, "CINDERS_HELMET", "Cinders Helmet"));
    map.put("CINDERS_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "CINDERS_LEGGINGS", "Cinders Leggings"));
    map.put("COAGULATED_MASS", createItem(Items.RED_DYE, "COAGULATED_MASS", "Coagulated Mass"));
    map.put("COMMON_SHELL", createItem(Items.NAUTILUS_SHELL, "COMMON_SHELL", "Common Shell"));
    map.put("COMPRESSED_CRYSTAL", createItem(Items.AMETHYST_SHARD, "COMPRESSED_CRYSTAL", "Compressed Crystal"));
    map.put("COMPRESSED_DIAMOND", createItem(Items.DIAMOND, "COMPRESSED_DIAMOND", "Compressed Diamond"));
    map.put("COOKIE_DOUGH", createItem(Items.BROWN_DYE, "COOKIE_DOUGH", "Cookie Dough"));
    map.put("COPPER_BOOTS", createItem(Items.LEATHER_BOOTS, "COPPER_BOOTS", "Copper Boots"));
    map.put("COPPER_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "COPPER_CHESTPLATE", "Copper Chestplate"));
    map.put("COPPER_HELMET", createItem(Items.LEATHER_HELMET, "COPPER_HELMET", "Copper Helmet"));
    map.put("COPPER_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "COPPER_LEGGINGS", "Copper Leggings"));
    map.put("COPPER_MACE", createItem(Items.LIGHTNING_ROD, "COPPER_MACE", "Copper Mace"));
    map.put("COPPER_SHIELD", createItem(Items.RAW_COPPER, "COPPER_SHIELD", "Copper Shield"));
    map.put("CORRUPTED_SHARD", createItem(Items.ECHO_SHARD, "CORRUPTED_SHARD", "Corrupted Shard"));
    map.put("CORRUPTED_SOUL", createItem(Items.ENDER_EYE, "CORRUPTED_SOUL", "Corrupted Soul"));
    map.put("CRUMBLING_EARTH", createItem(Items.CHARCOAL, "CRUMBLING_EARTH", "Crumbling Earth"));
    map.put("CRYSTAL_HIDE", createItem(Items.LEATHER, "CRYSTAL_HIDE", "Crystal Hide"));
    map.put("CURIOUS_DEVICE", createItem(Items.CONDUIT, "CURIOUS_DEVICE", "Curious Device"));
    map.put("CURSED_SAND", createItem(Items.GLOWSTONE_DUST, "CURSED_SAND", "Cursed Sand"));
    map.put("DANCING_SPARK", createItem(Items.BLAZE_POWDER, "DANCING_SPARK", "Dancing Spark"));
    map.put("DELICIOUS_BISCUIT", createItem(Items.BAKED_POTATO, "DELICIOUS_BISCUIT", "Delicious Biscuit"));
    map.put("DIAMOND_BOOTS", createItem(Items.DIAMOND_BOOTS, "DIAMOND_BOOTS", "Diamond Boots"));
    map.put("DIAMOND_CHESTPLATE", createItem(Items.DIAMOND_CHESTPLATE, "DIAMOND_CHESTPLATE", "Diamond Chestplate"));
    map.put("DIAMOND_HELMET", createItem(Items.DIAMOND_HELMET, "DIAMOND_HELMET", "Diamond Helmet"));
    map.put("DIAMOND_LEGGINGS", createItem(Items.DIAMOND_LEGGINGS, "DIAMOND_LEGGINGS", "Diamond Leggings"));
    map.put("DIAMOND_SHIELD", createItem(Items.DIAMOND, "DIAMOND_SHIELD", "Diamond Shield"));
    map.put("DOUGH", createItem(Items.BROWN_DYE, "DOUGH", "Dough"));
    map.put("EARTHEN_HEART", createItem(Items.TURTLE_EGG, "EARTHEN_HEART", "Earthen Heart"));
    map.put("EASTER_LAMB", createItem(Items.COOKED_MUTTON, "EASTER_LAMB", "Easter Lamb"));
    map.put("EGGNOG", createItem(Items.POTION, "EGGNOG", "Eggnog"));
    map.put("ESSENCE_CORRUPTED", createItem(Items.BLACK_DYE, "ESSENCE_CORRUPTED", "Essence Corrupted"));
    map.put("ESSENCE_EARTH", createItem(Items.BROWN_DYE, "ESSENCE_EARTH", "Essence Earth"));
    map.put("ESSENCE_FIRE", createItem(Items.RED_DYE, "ESSENCE_FIRE", "Essence Fire"));
    map.put("ESSENCE_LIFE", createItem(Items.GHAST_TEAR, "ESSENCE_LIFE", "Essence Life"));
    map.put("ESSENCE_WATER", createItem(Items.BLUE_DYE, "ESSENCE_WATER", "Essence Water"));
    map.put("ESSENCE_WIND", createItem(Items.LIGHT_GRAY_DYE, "ESSENCE_WIND", "Essence Wind"));
    map.put("FANCY_SHELL", createItem(Items.NAUTILUS_SHELL, "FANCY_SHELL", "Fancy Shell"));
    map.put("FAT_CARROT", createItem(Items.CARROT, "FAT_CARROT", "Fat Carrot"));
    map.put("FINNY_BONE", createItem(Items.PRISMARINE_CRYSTALS, "FINNY_BONE", "Finny Bone"));
    map.put("FINS_EVERFLAPPING", createItem(Items.PRISMARINE_SHARD, "FINS_EVERFLAPPING", "Fins Everflapping"));
    map.put("FISHERMAN_BOOTS", createItem(Items.LEATHER_BOOTS, "FISHERMAN_BOOTS", "Fisherman Boots"));
    map.put("FISHERMAN_BOOTS_1", createItem(Items.LEATHER_BOOTS, "FISHERMAN_BOOTS_1", "Fisherman Boots 1"));
    map.put("FISHERMAN_BOOTS_2", createItem(Items.LEATHER_BOOTS, "FISHERMAN_BOOTS_2", "Fisherman Boots 2"));
    map.put("FISHERMAN_BOOTS_3", createItem(Items.LEATHER_BOOTS, "FISHERMAN_BOOTS_3", "Fisherman Boots 3"));
    map.put("FISHERMAN_BOOTS_4", createItem(Items.LEATHER_BOOTS, "FISHERMAN_BOOTS_4", "Fisherman Boots 4"));
    map.put("FISHERMAN_BOOTS_5", createItem(Items.LEATHER_BOOTS, "FISHERMAN_BOOTS_5", "Fisherman Boots 5"));
    map.put("FISHERMAN_CHESTPLATE",
        createItem(Items.LEATHER_CHESTPLATE, "FISHERMAN_CHESTPLATE", "Fisherman Chestplate"));
    map.put("FISHERMAN_CHESTPLATE_1",
        createItem(Items.LEATHER_CHESTPLATE, "FISHERMAN_CHESTPLATE_1", "Fisherman Chestplate 1"));
    map.put("FISHERMAN_CHESTPLATE_2",
        createItem(Items.LEATHER_CHESTPLATE, "FISHERMAN_CHESTPLATE_2", "Fisherman Chestplate 2"));
    map.put("FISHERMAN_CHESTPLATE_3",
        createItem(Items.LEATHER_CHESTPLATE, "FISHERMAN_CHESTPLATE_3", "Fisherman Chestplate 3"));
    map.put("FISHERMAN_CHESTPLATE_4",
        createItem(Items.LEATHER_CHESTPLATE, "FISHERMAN_CHESTPLATE_4", "Fisherman Chestplate 4"));
    map.put("FISHERMAN_CHESTPLATE_5",
        createItem(Items.LEATHER_CHESTPLATE, "FISHERMAN_CHESTPLATE_5", "Fisherman Chestplate 5"));
    map.put("FISHERMAN_HELMET", createItem(Items.LEATHER_HELMET, "FISHERMAN_HELMET", "Fisherman Helmet"));
    map.put("FISHERMAN_HELMET_1", createItem(Items.LEATHER_HELMET, "FISHERMAN_HELMET_1", "Fisherman Helmet 1"));
    map.put("FISHERMAN_HELMET_2", createItem(Items.LEATHER_HELMET, "FISHERMAN_HELMET_2", "Fisherman Helmet 2"));
    map.put("FISHERMAN_HELMET_3", createItem(Items.LEATHER_HELMET, "FISHERMAN_HELMET_3", "Fisherman Helmet 3"));
    map.put("FISHERMAN_HELMET_4", createItem(Items.LEATHER_HELMET, "FISHERMAN_HELMET_4", "Fisherman Helmet 4"));
    map.put("FISHERMAN_HELMET_5", createItem(Items.LEATHER_HELMET, "FISHERMAN_HELMET_5", "Fisherman Helmet 5"));
    map.put("FISHERMAN_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "FISHERMAN_LEGGINGS", "Fisherman Leggings"));
    map.put("FISHERMAN_LEGGINGS_1", createItem(Items.LEATHER_LEGGINGS, "FISHERMAN_LEGGINGS_1", "Fisherman Leggings 1"));
    map.put("FISHERMAN_LEGGINGS_2", createItem(Items.LEATHER_LEGGINGS, "FISHERMAN_LEGGINGS_2", "Fisherman Leggings 2"));
    map.put("FISHERMAN_LEGGINGS_3", createItem(Items.LEATHER_LEGGINGS, "FISHERMAN_LEGGINGS_3", "Fisherman Leggings 3"));
    map.put("FISHERMAN_LEGGINGS_4", createItem(Items.LEATHER_LEGGINGS, "FISHERMAN_LEGGINGS_4", "Fisherman Leggings 4"));
    map.put("FISHERMAN_LEGGINGS_5", createItem(Items.LEATHER_LEGGINGS, "FISHERMAN_LEGGINGS_5", "Fisherman Leggings 5"));
    map.put("FISH_BADFISH", createItem(Items.COD, "FISH_BADFISH", "Fish Badfish"));
    map.put("FISH_BAMBOOZLE", createItem(Items.COD, "FISH_BAMBOOZLE", "Fish Bamboozle"));
    map.put("FISH_BLUESFISH", createItem(Items.COD, "FISH_BLUESFISH", "Fish Bluesfish"));
    map.put("FISH_DARKFISH", createItem(Items.COD, "FISH_DARKFISH", "Fish Darkfish"));
    map.put("FISH_DRYFISH", createItem(Items.COD, "FISH_DRYFISH", "Fish Dryfish"));
    map.put("FISH_FUNGALFISH", createItem(Items.TROPICAL_FISH, "FISH_FUNGALFISH", "Fish Fungalfish"));
    map.put("FISH_GLOWFISH", createItem(Items.TROPICAL_FISH, "FISH_GLOWFISH", "Fish Glowfish"));
    map.put("FISH_LEATHER", createItem(Items.LEATHER, "FISH_LEATHER", "Fish Leather"));
    map.put("FISH_PEPPERFISH", createItem(Items.SALMON, "FISH_PEPPERFISH", "Fish Pepperfish"));
    map.put("FISH_SALTFISH", createItem(Items.COD, "FISH_SALTFISH", "Fish Saltfish"));
    map.put("FISH_STONEFISH", createItem(Items.COD, "FISH_STONEFISH", "Fish Stonefish"));
    map.put("FISH_WOODFISH", createItem(Items.COD, "FISH_WOODFISH", "Fish Woodfish"));
    map.put("FLICKERING_FROST", createItem(Items.NETHER_STAR, "FLICKERING_FROST", "Flickering Frost"));
    map.put("FLOUR", createItem(Items.SUGAR, "FLOUR", "Flour"));
    map.put("FOCUS_BLOODSNOUT", createItem(Items.MAGMA_CREAM, "FOCUS_BLOODSNOUT", "Focus Bloodsnout"));
    map.put("FOCUS_CINDERS", createItem(Items.BLAZE_POWDER, "FOCUS_CINDERS", "Focus Cinders"));
    map.put("FOCUS_DJEDI", createItem(Items.BLAZE_POWDER, "FOCUS_DJEDI", "Focus Djedi"));
    map.put("FOCUS_FROST", createItem(Items.SNOWBALL, "FOCUS_FROST", "Focus Frost"));
    map.put("FOCUS_FROSTSLIME", createItem(Items.SLIME_BLOCK, "FOCUS_FROSTSLIME", "Focus Frostslime"));
    map.put("FOCUS_SLIME", createItem(Items.SLIME_BALL, "FOCUS_SLIME", "Focus Slime"));
    map.put("FOCUS_TRINITY", createItem(Items.MAGMA_CREAM, "FOCUS_TRINITY", "Focus Trinity"));
    map.put("FOCUS_UNSETTLING", createItem(Items.SKELETON_SKULL, "FOCUS_UNSETTLING", "Focus Unsettling"));
    map.put("FRAGILE_AXE", createItem(Items.DIAMOND_AXE, "FRAGILE_AXE", "Fragile Axe"));
    map.put("FRAGILE_HOE", createItem(Items.DIAMOND_HOE, "FRAGILE_HOE", "Fragile Hoe"));
    map.put("FRAGILE_PICKAXE", createItem(Items.DIAMOND_PICKAXE, "FRAGILE_PICKAXE", "Fragile Pickaxe"));
    map.put("FRAGILE_SHOVEL", createItem(Items.DIAMOND_SHOVEL, "FRAGILE_SHOVEL", "Fragile Shovel"));
    map.put("FROZEN_HIDE", createItem(Items.LEATHER, "FROZEN_HIDE", "Frozen Hide"));
    map.put("FROZEN_SOUL", createItem(Items.NETHER_STAR, "FROZEN_SOUL", "Frozen Soul"));
    map.put("FROZEN_STAR", createItem(Items.NETHER_STAR, "FROZEN_STAR", "Frozen Star"));
    map.put("Filter", createItem(Items.STICK, "Filter", "Filter"));
    map.put("GIANT_GINGERBREAD_COOKIE",
        createItem(Items.COOKIE, "GIANT_GINGERBREAD_COOKIE", "Giant Gingerbread Cookie"));
    map.put("GINGERBREAD_BOOTS_2022",
        createItem(Items.LEATHER_BOOTS, "GINGERBREAD_BOOTS_2022", "Gingerbread Boots 2022"));
    map.put("GINGERBREAD_CHESTPLATE_2022",
        createItem(Items.LEATHER_CHESTPLATE, "GINGERBREAD_CHESTPLATE_2022", "Gingerbread Chestplate 2022"));
    map.put("GINGERBREAD_HELMET_2022",
        createItem(Items.LEATHER_HELMET, "GINGERBREAD_HELMET_2022", "Gingerbread Helmet 2022"));
    map.put("GINGERBREAD_LEGGINGS_2022",
        createItem(Items.LEATHER_LEGGINGS, "GINGERBREAD_LEGGINGS_2022", "Gingerbread Leggings 2022"));
    map.put("GLOWING_MOTE", createItem(Items.SUNFLOWER, "GLOWING_MOTE", "Glowing Mote"));
    map.put("GOLDEN_BEETROOT", createItem(Items.BEETROOT, "GOLDEN_BEETROOT", "Golden Beetroot"));
    map.put("GOLDEN_BREAD", createItem(Items.BREAD, "GOLDEN_BREAD", "Golden Bread"));
    map.put("GOLDEN_CARP", createItem(Items.TROPICAL_FISH, "GOLDEN_CARP", "Golden Carp"));
    map.put("GOLDEN_DOUGH", createItem(Items.ORANGE_DYE, "GOLDEN_DOUGH", "Golden Dough"));
    map.put("GOLDEN_FLOUR", createItem(Items.GLOWSTONE_DUST, "GOLDEN_FLOUR", "Golden Flour"));
    map.put("GOLDEN_GRAVY", createItem(Items.POTION, "GOLDEN_GRAVY", "Golden Gravy"));
    map.put("GOLDEN_GUPPY", createItem(Items.COD, "GOLDEN_GUPPY", "Golden Guppy"));
    map.put("GOLDEN_POTATO", createItem(Items.POTATO, "GOLDEN_POTATO", "Golden Potato"));
    map.put("GOLDEN_POTATOES_AND_GOLDEN_GRAVY",
        createItem(Items.BAKED_POTATO, "GOLDEN_POTATOES_AND_GOLDEN_GRAVY", "Golden Potatoes And Golden Gravy"));
    map.put("GOLDEN_POTATOES_AND_GOLDEN_GRAVY_ANIMATED", createItem(Items.BAKED_POTATO,
        "GOLDEN_POTATOES_AND_GOLDEN_GRAVY_ANIMATED", "Golden Potatoes And Golden Gravy Animated"));
    map.put("GOLDEN_POTATOES_AND_GRAVY",
        createItem(Items.BAKED_POTATO, "GOLDEN_POTATOES_AND_GRAVY", "Golden Potatoes And Gravy"));
    map.put("GOLDEN_POTATOES_AND_SENTIENT_GRAVY",
        createItem(Items.BAKED_POTATO, "GOLDEN_POTATOES_AND_SENTIENT_GRAVY", "Golden Potatoes And Sentient Gravy"));
    map.put("GOLDEN_PUFFERFISH", createItem(Items.PUFFERFISH, "GOLDEN_PUFFERFISH", "Golden Pufferfish"));
    map.put("GOLDEN_RING", createItem(Items.SUNFLOWER, "GOLDEN_RING", "Golden Ring"));
    map.put("GOLDEN_WHEAT", createItem(Items.WHEAT, "GOLDEN_WHEAT", "Golden Wheat"));
    map.put("GOLD_BRICK", createItem(Items.GOLD_INGOT, "GOLD_BRICK", "Gold Brick"));
    map.put("GOLD_COIN", createItem(Items.GOLD_NUGGET, "GOLD_COIN", "Gold Coin"));
    map.put("GRAVY", createItem(Items.POTION, "GRAVY", "Gravy"));
    map.put("GREASY_HIDE", createItem(Items.LEATHER, "GREASY_HIDE", "Greasy Hide"));
    map.put("GRILLED_APPLE", createItem(Items.APPLE, "GRILLED_APPLE", "Grilled Apple"));
    map.put("GRILLED_BEETROOT", createItem(Items.BEETROOT, "GRILLED_BEETROOT", "Grilled Beetroot"));
    map.put("GRILLED_CARROT", createItem(Items.CARROT, "GRILLED_CARROT", "Grilled Carrot"));
    map.put("GRILLED_COOKIE", createItem(Items.COOKIE, "GRILLED_COOKIE", "Grilled Cookie"));
    map.put("GRILLED_GOLDEN_BEETROOT",
        createItem(Items.BEETROOT, "GRILLED_GOLDEN_BEETROOT", "Grilled Golden Beetroot"));
    map.put("GRILLED_GOLDEN_POTATO", createItem(Items.BAKED_POTATO, "GRILLED_GOLDEN_POTATO", "Grilled Golden Potato"));
    map.put("GRILLED_MUSHROOM", createItem(Items.BAKED_POTATO, "GRILLED_MUSHROOM", "Grilled Mushroom"));
    map.put("GRILLED_PLAIN_CHICKEN",
        createItem(Items.COOKED_CHICKEN, "GRILLED_PLAIN_CHICKEN", "Grilled Plain Chicken"));
    map.put("GRILLED_PLAIN_COD", createItem(Items.COOKED_COD, "GRILLED_PLAIN_COD", "Grilled Plain Cod"));
    map.put("GRILLED_PLAIN_MUTTON", createItem(Items.COOKED_MUTTON, "GRILLED_PLAIN_MUTTON", "Grilled Plain Mutton"));
    map.put("GRILLED_PLAIN_PORKCHOP",
        createItem(Items.COOKED_PORKCHOP, "GRILLED_PLAIN_PORKCHOP", "Grilled Plain Porkchop"));
    map.put("GRILLED_PLAIN_RABBIT", createItem(Items.COOKED_RABBIT, "GRILLED_PLAIN_RABBIT", "Grilled Plain Rabbit"));
    map.put("GRILLED_PLAIN_SALMON", createItem(Items.COOKED_SALMON, "GRILLED_PLAIN_SALMON", "Grilled Plain Salmon"));
    map.put("GRILLED_PLAIN_STEAK", createItem(Items.COOKED_BEEF, "GRILLED_PLAIN_STEAK", "Grilled Plain Steak"));
    map.put("GRILLED_PLAIN_TROPICAL_FISH",
        createItem(Items.COOKED_COD, "GRILLED_PLAIN_TROPICAL_FISH", "Grilled Plain Tropical Fish"));
    map.put("GRILLED_POTATO", createItem(Items.BAKED_POTATO, "GRILLED_POTATO", "Grilled Potato"));
    map.put("GRILLED_STUFFED_MUSHROOM",
        createItem(Items.BAKED_POTATO, "GRILLED_STUFFED_MUSHROOM", "Grilled Stuffed Mushroom"));
    map.put("HAUNTED_HIDE", createItem(Items.LEATHER, "HAUNTED_HIDE", "Haunted Hide"));
    map.put("HEKA_BOOTS", createItem(Items.LEATHER_BOOTS, "HEKA_BOOTS", "Heka Boots"));
    map.put("HEKA_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "HEKA_CHESTPLATE", "Heka Chestplate"));
    map.put("HEKA_HELMET", createItem(Items.LEATHER_HELMET, "HEKA_HELMET", "Heka Helmet"));
    map.put("HEKA_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "HEKA_LEGGINGS", "Heka Leggings"));
    map.put("HORRID_BOOTS", createItem(Items.NETHERITE_BOOTS, "HORRID_BOOTS", "Horrid Boots"));
    map.put("HORRID_CHESTPLATE", createItem(Items.NETHERITE_CHESTPLATE, "HORRID_CHESTPLATE", "Horrid Chestplate"));
    map.put("HORRID_HELMET", createItem(Items.NETHERITE_HELMET, "HORRID_HELMET", "Horrid Helmet"));
    map.put("HORRID_LEGGINGS", createItem(Items.NETHERITE_LEGGINGS, "HORRID_LEGGINGS", "Horrid Leggings"));
    map.put("HOT_CHOCOLATE", createItem(Items.POTION, "HOT_CHOCOLATE", "Hot Chocolate"));
    map.put("HOT_CROSS_BUN", createItem(Items.BREAD, "HOT_CROSS_BUN", "Hot Cross Bun"));
    map.put("IMPLEMENT_BELL", createItem(Items.BELL, "IMPLEMENT_BELL", "Implement Bell"));
    map.put("IMPLEMENT_BRAND", createItem(Items.SOUL_TORCH, "IMPLEMENT_BRAND", "Implement Brand"));
    map.put("IMPLEMENT_CALLER", createItem(Items.SOUL_LANTERN, "IMPLEMENT_CALLER", "Implement Caller"));
    map.put("IMPLEMENT_CAUTERIZING", createItem(Items.TORCH, "IMPLEMENT_CAUTERIZING", "Implement Cauterizing"));
    map.put("IMPLEMENT_GUIDING", createItem(Items.LANTERN, "IMPLEMENT_GUIDING", "Implement Guiding"));
    map.put("IMPLEMENT_HEKA", createItem(Items.BREWING_STAND, "IMPLEMENT_HEKA", "Implement Heka"));
    map.put("INCANTATION_ROTTENMAW_1", createItem(Items.PAPER, "INCANTATION_ROTTENMAW_1", "Incantation Rottenmaw 1"));
    map.put("INCANTATION_ROTTENMAW_5", createItem(Items.PAPER, "INCANTATION_ROTTENMAW_5", "Incantation Rottenmaw 5"));
    map.put("INFUSED_CRYSTAL", createItem(Items.AMETHYST_SHARD, "INFUSED_CRYSTAL", "Infused Crystal"));
    map.put("INFUSED_DIAMOND", createItem(Items.DIAMOND, "INFUSED_DIAMOND", "Infused Diamond"));
    map.put("JAMMY_BUTTER_TOAST", createItem(Items.BREAD, "JAMMY_BUTTER_TOAST", "Jammy Butter Toast"));
    map.put("JAM_GLOWBERRY", createItem(Items.POTION, "JAM_GLOWBERRY", "Jam Glowberry"));
    map.put("JAM_SWEETBERRY", createItem(Items.POTION, "JAM_SWEETBERRY", "Jam Sweetberry"));
    map.put("KEY_INERT_ROTTENMAW", createItem(Items.NETHERITE_INGOT, "KEY_INERT_ROTTENMAW", "Key Inert Rottenmaw"));
    map.put("KEY_ROTTENMAW_1", createItem(Items.NETHERITE_INGOT, "KEY_ROTTENMAW_1", "Key Rottenmaw 1"));
    map.put("KEY_ROTTENMAW_2", createItem(Items.NETHERITE_INGOT, "KEY_ROTTENMAW_2", "Key Rottenmaw 2"));
    map.put("KEY_ROTTENMAW_3", createItem(Items.NETHERITE_INGOT, "KEY_ROTTENMAW_3", "Key Rottenmaw 3"));
    map.put("KEY_ROTTENMAW_4", createItem(Items.NETHERITE_INGOT, "KEY_ROTTENMAW_4", "Key Rottenmaw 4"));
    map.put("KEY_ROTTENMAW_5", createItem(Items.NETHERITE_INGOT, "KEY_ROTTENMAW_5", "Key Rottenmaw 5"));
    map.put("KEY_ROTTENMAW_6", createItem(Items.NETHERITE_INGOT, "KEY_ROTTENMAW_6", "Key Rottenmaw 6"));
    map.put("KEY_ROTTENMAW_7", createItem(Items.NETHERITE_INGOT, "KEY_ROTTENMAW_7", "Key Rottenmaw 7"));
    map.put("KEY_ROTTENMAW_8", createItem(Items.NETHERITE_INGOT, "KEY_ROTTENMAW_8", "Key Rottenmaw 8"));
    map.put("KROGNARS_BLADE", createItem(Items.GOLDEN_SWORD, "KROGNARS_BLADE", "Krognars Blade"));
    map.put("KROGNARS_BOOTS", createItem(Items.GOLDEN_BOOTS, "KROGNARS_BOOTS", "Krognars Boots"));
    map.put("KROGNARS_CHESTPLATE", createItem(Items.GOLDEN_CHESTPLATE, "KROGNARS_CHESTPLATE", "Krognars Chestplate"));
    map.put("KROGNARS_CLEAVER", createItem(Items.GOLDEN_AXE, "KROGNARS_CLEAVER", "Krognars Cleaver"));
    map.put("KROGNARS_HELMET", createItem(Items.GOLDEN_HELMET, "KROGNARS_HELMET", "Krognars Helmet"));
    map.put("KROGNARS_LEGGINGS", createItem(Items.GOLDEN_LEGGINGS, "KROGNARS_LEGGINGS", "Krognars Leggings"));
    map.put("KROGNARS_MACE", createItem(Items.CHAIN, "KROGNARS_MACE", "Krognars Mace"));
    map.put("Krognars Bastion - Compass",
        createItem(Items.STICK, "Krognars Bastion - Compass", "Krognars bastion - compass"));
    map.put("LAMP_EVERBURNING", createItem(Items.SOUL_LANTERN, "LAMP_EVERBURNING", "Lamp Everburning"));
    map.put("LEATHER_SCRAPS", createItem(Items.NETHERITE_SCRAP, "LEATHER_SCRAPS", "Leather Scraps"));
    map.put("LIVING_FIRE", createItem(Items.BLAZE_POWDER, "LIVING_FIRE", "Living Fire"));
    map.put("LOBSTER_SOUL", createItem(Items.LAPIS_LAZULI, "LOBSTER_SOUL", "Lobster Soul"));
    map.put("LUMBERJACK_BOOTS", createItem(Items.LEATHER_BOOTS, "LUMBERJACK_BOOTS", "Lumberjack Boots"));
    map.put("LUMBERJACK_BOOTS_1", createItem(Items.LEATHER_BOOTS, "LUMBERJACK_BOOTS_1", "Lumberjack Boots 1"));
    map.put("LUMBERJACK_BOOTS_2", createItem(Items.LEATHER_BOOTS, "LUMBERJACK_BOOTS_2", "Lumberjack Boots 2"));
    map.put("LUMBERJACK_BOOTS_3", createItem(Items.LEATHER_BOOTS, "LUMBERJACK_BOOTS_3", "Lumberjack Boots 3"));
    map.put("LUMBERJACK_BOOTS_4", createItem(Items.LEATHER_BOOTS, "LUMBERJACK_BOOTS_4", "Lumberjack Boots 4"));
    map.put("LUMBERJACK_BOOTS_5", createItem(Items.LEATHER_BOOTS, "LUMBERJACK_BOOTS_5", "Lumberjack Boots 5"));
    map.put("LUMBERJACK_CHESTPLATE",
        createItem(Items.LEATHER_CHESTPLATE, "LUMBERJACK_CHESTPLATE", "Lumberjack Chestplate"));
    map.put("LUMBERJACK_CHESTPLATE_1",
        createItem(Items.LEATHER_CHESTPLATE, "LUMBERJACK_CHESTPLATE_1", "Lumberjack Chestplate 1"));
    map.put("LUMBERJACK_CHESTPLATE_2",
        createItem(Items.LEATHER_CHESTPLATE, "LUMBERJACK_CHESTPLATE_2", "Lumberjack Chestplate 2"));
    map.put("LUMBERJACK_CHESTPLATE_3",
        createItem(Items.LEATHER_CHESTPLATE, "LUMBERJACK_CHESTPLATE_3", "Lumberjack Chestplate 3"));
    map.put("LUMBERJACK_CHESTPLATE_4",
        createItem(Items.LEATHER_CHESTPLATE, "LUMBERJACK_CHESTPLATE_4", "Lumberjack Chestplate 4"));
    map.put("LUMBERJACK_CHESTPLATE_5",
        createItem(Items.LEATHER_CHESTPLATE, "LUMBERJACK_CHESTPLATE_5", "Lumberjack Chestplate 5"));
    map.put("LUMBERJACK_HELMET", createItem(Items.LEATHER_HELMET, "LUMBERJACK_HELMET", "Lumberjack Helmet"));
    map.put("LUMBERJACK_HELMET_1", createItem(Items.LEATHER_HELMET, "LUMBERJACK_HELMET_1", "Lumberjack Helmet 1"));
    map.put("LUMBERJACK_HELMET_2", createItem(Items.LEATHER_HELMET, "LUMBERJACK_HELMET_2", "Lumberjack Helmet 2"));
    map.put("LUMBERJACK_HELMET_3", createItem(Items.LEATHER_HELMET, "LUMBERJACK_HELMET_3", "Lumberjack Helmet 3"));
    map.put("LUMBERJACK_HELMET_4", createItem(Items.LEATHER_HELMET, "LUMBERJACK_HELMET_4", "Lumberjack Helmet 4"));
    map.put("LUMBERJACK_HELMET_5", createItem(Items.LEATHER_HELMET, "LUMBERJACK_HELMET_5", "Lumberjack Helmet 5"));
    map.put("LUMBERJACK_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "LUMBERJACK_LEGGINGS", "Lumberjack Leggings"));
    map.put("LUMBERJACK_LEGGINGS_1",
        createItem(Items.LEATHER_LEGGINGS, "LUMBERJACK_LEGGINGS_1", "Lumberjack Leggings 1"));
    map.put("LUMBERJACK_LEGGINGS_2",
        createItem(Items.LEATHER_LEGGINGS, "LUMBERJACK_LEGGINGS_2", "Lumberjack Leggings 2"));
    map.put("LUMBERJACK_LEGGINGS_3",
        createItem(Items.LEATHER_LEGGINGS, "LUMBERJACK_LEGGINGS_3", "Lumberjack Leggings 3"));
    map.put("LUMBERJACK_LEGGINGS_4",
        createItem(Items.LEATHER_LEGGINGS, "LUMBERJACK_LEGGINGS_4", "Lumberjack Leggings 4"));
    map.put("LUMBERJACK_LEGGINGS_5",
        createItem(Items.LEATHER_LEGGINGS, "LUMBERJACK_LEGGINGS_5", "Lumberjack Leggings 5"));
    map.put("LURE_EVERBUBBLING", createItem(Items.BLAZE_ROD, "LURE_EVERBUBBLING", "Lure Everbubbling"));
    map.put("MAGISTEEL_AXE", createItem(Items.NETHERITE_AXE, "MAGISTEEL_AXE", "Magisteel Axe"));
    map.put("MAGISTEEL_FISHINGPOLE", createItem(Items.FISHING_ROD, "MAGISTEEL_FISHINGPOLE", "Magisteel Fishingpole"));
    map.put("MAGISTEEL_HOE", createItem(Items.NETHERITE_HOE, "MAGISTEEL_HOE", "Magisteel Hoe"));
    map.put("MAGISTEEL_INGOT", createItem(Items.NETHERITE_INGOT, "MAGISTEEL_INGOT", "Magisteel Ingot"));
    map.put("MAGISTEEL_PICKAXE", createItem(Items.NETHERITE_PICKAXE, "MAGISTEEL_PICKAXE", "Magisteel Pickaxe"));
    map.put("MAGISTEEL_SHOVEL", createItem(Items.NETHERITE_SHOVEL, "MAGISTEEL_SHOVEL", "Magisteel Shovel"));
    map.put("MEAT_BROTH", createItem(Items.POTION, "MEAT_BROTH", "Meat Broth"));
    map.put("MEGA_MUSHROOM", createItem(Items.RED_MUSHROOM, "MEGA_MUSHROOM", "Mega Mushroom"));
    map.put("METEOR_SHARD", createItem(Items.NETHER_STAR, "METEOR_SHARD", "Meteor Shard"));
    map.put("MINER_BOOTS", createItem(Items.LEATHER_BOOTS, "MINER_BOOTS", "Miner Boots"));
    map.put("MINER_BOOTS_1", createItem(Items.LEATHER_BOOTS, "MINER_BOOTS_1", "Miner Boots 1"));
    map.put("MINER_BOOTS_2", createItem(Items.LEATHER_BOOTS, "MINER_BOOTS_2", "Miner Boots 2"));
    map.put("MINER_BOOTS_3", createItem(Items.LEATHER_BOOTS, "MINER_BOOTS_3", "Miner Boots 3"));
    map.put("MINER_BOOTS_4", createItem(Items.LEATHER_BOOTS, "MINER_BOOTS_4", "Miner Boots 4"));
    map.put("MINER_BOOTS_5", createItem(Items.LEATHER_BOOTS, "MINER_BOOTS_5", "Miner Boots 5"));
    map.put("MINER_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "MINER_CHESTPLATE", "Miner Chestplate"));
    map.put("MINER_CHESTPLATE_1", createItem(Items.LEATHER_CHESTPLATE, "MINER_CHESTPLATE_1", "Miner Chestplate 1"));
    map.put("MINER_CHESTPLATE_2", createItem(Items.LEATHER_CHESTPLATE, "MINER_CHESTPLATE_2", "Miner Chestplate 2"));
    map.put("MINER_CHESTPLATE_3", createItem(Items.LEATHER_CHESTPLATE, "MINER_CHESTPLATE_3", "Miner Chestplate 3"));
    map.put("MINER_CHESTPLATE_4", createItem(Items.LEATHER_CHESTPLATE, "MINER_CHESTPLATE_4", "Miner Chestplate 4"));
    map.put("MINER_CHESTPLATE_5", createItem(Items.LEATHER_CHESTPLATE, "MINER_CHESTPLATE_5", "Miner Chestplate 5"));
    map.put("MINER_HELMET", createItem(Items.LEATHER_HELMET, "MINER_HELMET", "Miner Helmet"));
    map.put("MINER_HELMET_1", createItem(Items.LEATHER_HELMET, "MINER_HELMET_1", "Miner Helmet 1"));
    map.put("MINER_HELMET_2", createItem(Items.LEATHER_HELMET, "MINER_HELMET_2", "Miner Helmet 2"));
    map.put("MINER_HELMET_3", createItem(Items.LEATHER_HELMET, "MINER_HELMET_3", "Miner Helmet 3"));
    map.put("MINER_HELMET_4", createItem(Items.LEATHER_HELMET, "MINER_HELMET_4", "Miner Helmet 4"));
    map.put("MINER_HELMET_5", createItem(Items.LEATHER_HELMET, "MINER_HELMET_5", "Miner Helmet 5"));
    map.put("MINER_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "MINER_LEGGINGS", "Miner Leggings"));
    map.put("MINER_LEGGINGS_1", createItem(Items.LEATHER_LEGGINGS, "MINER_LEGGINGS_1", "Miner Leggings 1"));
    map.put("MINER_LEGGINGS_2", createItem(Items.LEATHER_LEGGINGS, "MINER_LEGGINGS_2", "Miner Leggings 2"));
    map.put("MINER_LEGGINGS_3", createItem(Items.LEATHER_LEGGINGS, "MINER_LEGGINGS_3", "Miner Leggings 3"));
    map.put("MINER_LEGGINGS_4", createItem(Items.LEATHER_LEGGINGS, "MINER_LEGGINGS_4", "Miner Leggings 4"));
    map.put("MINER_LEGGINGS_5", createItem(Items.LEATHER_LEGGINGS, "MINER_LEGGINGS_5", "Miner Leggings 5"));
    map.put("MINI_MUSHROOM", createItem(Items.BROWN_MUSHROOM, "MINI_MUSHROOM", "Mini Mushroom"));
    map.put("MYTHRIL_BOOTS", createItem(Items.CHAINMAIL_BOOTS, "MYTHRIL_BOOTS", "Mythril Boots"));
    map.put("MYTHRIL_CHESTPLATE", createItem(Items.CHAINMAIL_CHESTPLATE, "MYTHRIL_CHESTPLATE", "Mythril Chestplate"));
    map.put("MYTHRIL_HELMET", createItem(Items.CHAINMAIL_HELMET, "MYTHRIL_HELMET", "Mythril Helmet"));
    map.put("MYTHRIL_INGOT", createItem(Items.IRON_INGOT, "MYTHRIL_INGOT", "Mythril Ingot"));
    map.put("MYTHRIL_LEGGINGS", createItem(Items.CHAINMAIL_LEGGINGS, "MYTHRIL_LEGGINGS", "Mythril Leggings"));
    map.put("MYTHRIL_SCRAP", createItem(Items.NETHERITE_SCRAP, "MYTHRIL_SCRAP", "Mythril Scrap"));
    map.put("NECRONOMICON", createItem(Items.BOOK, "NECRONOMICON", "Necronomicon"));
    map.put("NUTMEG", createItem(Items.COCOA_BEANS, "NUTMEG", "Nutmeg"));
    map.put("OLD_STONKS", createItem(Items.NETHERITE_SCRAP, "OLD_STONKS", "Old Stonks"));
    map.put("ONION_AXE", createItem(Items.WOODEN_AXE, "ONION_AXE", "Onion Axe"));
    map.put("ONION_BOOTS", createItem(Items.LEATHER_BOOTS, "ONION_BOOTS", "Onion Boots"));
    map.put("ONION_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "ONION_CHESTPLATE", "Onion Chestplate"));
    map.put("ONION_HELMET", createItem(Items.LEATHER_HELMET, "ONION_HELMET", "Onion Helmet"));
    map.put("ONION_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "ONION_LEGGINGS", "Onion Leggings"));
    map.put("ONION_PICKAXE", createItem(Items.WOODEN_PICKAXE, "ONION_PICKAXE", "Onion Pickaxe"));
    map.put("ONION_SHIELD", createItem(Items.WHITE_DYE, "ONION_SHIELD", "Onion Shield"));
    map.put("ONION_SWORD", createItem(Items.WOODEN_SWORD, "ONION_SWORD", "Onion Sword"));
    map.put("PAINTED_EGG", createItem(Items.PUFFERFISH, "PAINTED_EGG", "Painted Egg"));
    map.put("PEPPER", createItem(Items.GUNPOWDER, "PEPPER", "Pepper"));
    map.put("PERFECT_SPECIMEN", createItem(Items.ALLIUM, "PERFECT_SPECIMEN", "Perfect Specimen"));
    map.put("PICKLED_PHALANGES", createItem(Items.POTION, "PICKLED_PHALANGES", "Pickled Phalanges"));
    map.put("PIE_ALLBERRY", createItem(Items.PUMPKIN_PIE, "PIE_ALLBERRY", "Pie Allberry"));
    map.put("PIE_GLOWBERRY", createItem(Items.PUMPKIN_PIE, "PIE_GLOWBERRY", "Pie Glowberry"));
    map.put("PIE_JACKOLANTERN", createItem(Items.PUMPKIN_PIE, "PIE_JACKOLANTERN", "Pie Jackolantern"));
    map.put("PIE_MEAT", createItem(Items.PUMPKIN_PIE, "PIE_MEAT", "Pie Meat"));
    map.put("PIE_PUMPKIN", createItem(Items.PUMPKIN_PIE, "PIE_PUMPKIN", "Pie Pumpkin"));
    map.put("PIE_STARGAZY", createItem(Items.PUMPKIN_PIE, "PIE_STARGAZY", "Pie Stargazy"));
    map.put("PIE_SWEETBERRY", createItem(Items.PUMPKIN_PIE, "PIE_SWEETBERRY", "Pie Sweetberry"));
    map.put("PIGGLY_WIGGLY_BOW", createItem(Items.BOW, "PIGGLY_WIGGLY_BOW", "Piggly Wiggly Bow"));
    map.put("PLATINUM_COIN", createItem(Items.IRON_NUGGET, "PLATINUM_COIN", "Platinum Coin"));
    map.put("POLAR_BOOTS_2022", createItem(Items.DIAMOND_BOOTS, "POLAR_BOOTS_2022", "Polar Boots 2022"));
    map.put("POLAR_CHESTPLATE_2022",
        createItem(Items.DIAMOND_CHESTPLATE, "POLAR_CHESTPLATE_2022", "Polar Chestplate 2022"));
    map.put("POLAR_HELMET_2022", createItem(Items.DIAMOND_HELMET, "POLAR_HELMET_2022", "Polar Helmet 2022"));
    map.put("POLAR_LEGGINGS_2022", createItem(Items.DIAMOND_LEGGINGS, "POLAR_LEGGINGS_2022", "Polar Leggings 2022"));
    map.put("POTATOES_AND_GOLDEN_GRAVY",
        createItem(Items.BAKED_POTATO, "POTATOES_AND_GOLDEN_GRAVY", "Potatoes And Golden Gravy"));
    map.put("POTATOES_AND_GRAVY", createItem(Items.BAKED_POTATO, "POTATOES_AND_GRAVY", "Potatoes And Gravy"));
    map.put("POTATOES_AND_GRAVY_ANIMATED",
        createItem(Items.BAKED_POTATO, "POTATOES_AND_GRAVY_ANIMATED", "Potatoes And Gravy Animated"));
    map.put("POTATOES_AND_SENTIENT_GRAVY",
        createItem(Items.BAKED_POTATO, "POTATOES_AND_SENTIENT_GRAVY", "Potatoes And Sentient Gravy"));
    map.put("PRETTY_SHELL", createItem(Items.NAUTILUS_SHELL, "PRETTY_SHELL", "Pretty Shell"));
    map.put("PRISTINE_CORE", createItem(Items.SPRUCE_LOG, "PRISTINE_CORE", "Pristine Core"));
    map.put("PRISTINE_HIDE", createItem(Items.LEATHER, "PRISTINE_HIDE", "Pristine Hide"));
    map.put("PRISTINE_STONE", createItem(Items.FIREWORK_STAR, "PRISTINE_STONE", "Pristine Stone"));
    map.put("PRISTINE_WOOD", createItem(Items.BRICK, "PRISTINE_WOOD", "Pristine Wood"));
    map.put("PUMPKIN_BLADE", createItem(Items.NETHERITE_SWORD, "PUMPKIN_BLADE", "Pumpkin Blade"));
    map.put("PUMPKIN_BOOTS", createItem(Items.NETHERITE_BOOTS, "PUMPKIN_BOOTS", "Pumpkin Boots"));
    map.put("PUMPKIN_CHESTPLATE", createItem(Items.NETHERITE_CHESTPLATE, "PUMPKIN_CHESTPLATE", "Pumpkin Chestplate"));
    map.put("PUMPKIN_HELMET", createItem(Items.NETHERITE_HELMET, "PUMPKIN_HELMET", "Pumpkin Helmet"));
    map.put("PUMPKIN_LEGGINGS", createItem(Items.NETHERITE_LEGGINGS, "PUMPKIN_LEGGINGS", "Pumpkin Leggings"));
    map.put("QUIVER_CRYSTALLINE", createItem(Items.ARROW, "QUIVER_CRYSTALLINE", "Quiver Crystalline"));
    map.put("QUIVER_EXPLOSIVE", createItem(Items.ARROW, "QUIVER_EXPLOSIVE", "Quiver Explosive"));
    map.put("QUIVER_FIRE", createItem(Items.ARROW, "QUIVER_FIRE", "Quiver Fire"));
    map.put("QUIVER_FLINT", createItem(Items.ARROW, "QUIVER_FLINT", "Quiver Flint"));
    map.put("QUIVER_GREASY", createItem(Items.ARROW, "QUIVER_GREASY", "Quiver Greasy"));
    map.put("QUIVER_POISON", createItem(Items.ARROW, "QUIVER_POISON", "Quiver Poison"));
    map.put("QUIVER_SATET", createItem(Items.ARROW, "QUIVER_SATET", "Quiver Satet"));
    map.put("QUIVER_SLOW", createItem(Items.ARROW, "QUIVER_SLOW", "Quiver Slow"));
    map.put("QUIVER_SPARKING", createItem(Items.ARROW, "QUIVER_SPARKING", "Quiver Sparking"));
    map.put("QUIVER_UNSETTLING", createItem(Items.ARROW, "QUIVER_UNSETTLING", "Quiver Unsettling"));
    map.put("QUIVER_VOLCANIC", createItem(Items.ARROW, "QUIVER_VOLCANIC", "Quiver Volcanic"));
    map.put("RAID_CRATE_KROGNARS", createItem(Items.BARREL, "RAID_CRATE_KROGNARS", "Raid Crate Krognars"));
    map.put("RAID_CRATE_NEITH", createItem(Items.BARREL, "RAID_CRATE_NEITH", "Raid Crate Neith"));
    map.put("RAID_CRATE_ROTTEN", createItem(Items.BARREL, "RAID_CRATE_ROTTEN", "Raid Crate Rotten"));
    map.put("RAID_CRATE_SUNKEN", createItem(Items.BARREL, "RAID_CRATE_SUNKEN", "Raid Crate Sunken"));
    map.put("RAID_GUIDE_KROGNARS", createItem(Items.WRITTEN_BOOK, "RAID_GUIDE_KROGNARS", "Raid Guide Krognars"));
    map.put("RAID_GUIDE_ROTTEN", createItem(Items.WRITTEN_BOOK, "RAID_GUIDE_ROTTEN", "Raid Guide Rotten"));
    map.put("RAID_GUIDE_SUNKEN", createItem(Items.WRITTEN_BOOK, "RAID_GUIDE_SUNKEN", "Raid Guide Sunken"));
    map.put("RAW_GINGER", createItem(Items.POTATO, "RAW_GINGER", "Raw Ginger"));
    map.put("RAW_VEGGIE_SALAD", createItem(Items.RABBIT_STEW, "RAW_VEGGIE_SALAD", "Raw Veggie Salad"));
    map.put("RECIPE_BACON_AND_EGGS", createItem(Items.BOOK, "RECIPE_BACON_AND_EGGS", "Recipe Bacon And Eggs"));
    map.put("RECIPE_CANDYFISH", createItem(Items.BOOK, "RECIPE_CANDYFISH", "Recipe Candyfish"));
    map.put("RECIPE_CANDY_CORN", createItem(Items.BOOK, "RECIPE_CANDY_CORN", "Recipe Candy Corn"));
    map.put("RECIPE_CHOCOLATE_RABBIT", createItem(Items.BOOK, "RECIPE_CHOCOLATE_RABBIT", "Recipe Chocolate Rabbit"));
    map.put("RECIPE_COOKIE_GINGERBREAD",
        createItem(Items.BOOK, "RECIPE_COOKIE_GINGERBREAD", "Recipe Cookie Gingerbread"));
    map.put("RECIPE_EASTER_LAMB", createItem(Items.BOOK, "RECIPE_EASTER_LAMB", "Recipe Easter Lamb"));
    map.put("RECIPE_EGGNOG", createItem(Items.BOOK, "RECIPE_EGGNOG", "Recipe Eggnog"));
    map.put("RECIPE_HOT_CHOCOLATE", createItem(Items.BOOK, "RECIPE_HOT_CHOCOLATE", "Recipe Hot Chocolate"));
    map.put("RECIPE_HOT_CROSS_BUN", createItem(Items.BOOK, "RECIPE_HOT_CROSS_BUN", "Recipe Hot Cross Bun"));
    map.put("RECIPE_PAINTED_EGG", createItem(Items.BOOK, "RECIPE_PAINTED_EGG", "Recipe Painted Egg"));
    map.put("RECIPE_PICKLED_PHALANGES", createItem(Items.BOOK, "RECIPE_PICKLED_PHALANGES", "Recipe Pickled Phalanges"));
    map.put("RECIPE_PIE_JACKOLANTERN", createItem(Items.BOOK, "RECIPE_PIE_JACKOLANTERN", "Recipe Pie Jackolantern"));
    map.put("RECIPE_PIE_MEAT", createItem(Items.BOOK, "RECIPE_PIE_MEAT", "Recipe Pie Meat"));
    map.put("RECIPE_SPICED_SLUGS", createItem(Items.BOOK, "RECIPE_SPICED_SLUGS", "Recipe Spiced Slugs"));
    map.put("RECIPE_TOME_ACOLYTE_BOOTS",
        createItem(Items.BOOK, "RECIPE_TOME_ACOLYTE_BOOTS", "Recipe Tome Acolyte Boots"));
    map.put("RECIPE_TOME_ACOLYTE_CHESTPLATE",
        createItem(Items.BOOK, "RECIPE_TOME_ACOLYTE_CHESTPLATE", "Recipe Tome Acolyte Chestplate"));
    map.put("RECIPE_TOME_ACOLYTE_HELMET",
        createItem(Items.BOOK, "RECIPE_TOME_ACOLYTE_HELMET", "Recipe Tome Acolyte Helmet"));
    map.put("RECIPE_TOME_ACOLYTE_LEGGINGS",
        createItem(Items.BOOK, "RECIPE_TOME_ACOLYTE_LEGGINGS", "Recipe Tome Acolyte Leggings"));
    map.put("RECIPE_TOME_BLOODSNOUT_HEALER_BOOTS",
        createItem(Items.BOOK, "RECIPE_TOME_BLOODSNOUT_HEALER_BOOTS", "Recipe Tome Bloodsnout Healer Boots"));
    map.put("RECIPE_TOME_BLOODSNOUT_HEALER_CHESTPLATE",
        createItem(Items.BOOK, "RECIPE_TOME_BLOODSNOUT_HEALER_CHESTPLATE", "Recipe Tome Bloodsnout Healer Chestplate"));
    map.put("RECIPE_TOME_BLOODSNOUT_HEALER_HELMET",
        createItem(Items.BOOK, "RECIPE_TOME_BLOODSNOUT_HEALER_HELMET", "Recipe Tome Bloodsnout Healer Helmet"));
    map.put("RECIPE_TOME_BLOODSNOUT_HEALER_LEGGINGS",
        createItem(Items.BOOK, "RECIPE_TOME_BLOODSNOUT_HEALER_LEGGINGS", "Recipe Tome Bloodsnout Healer Leggings"));
    map.put("RECIPE_TOME_BLOODSNOUT_SLAYER_BOOTS",
        createItem(Items.BOOK, "RECIPE_TOME_BLOODSNOUT_SLAYER_BOOTS", "Recipe Tome Bloodsnout Slayer Boots"));
    map.put("RECIPE_TOME_BLOODSNOUT_SLAYER_CHESTPLATE",
        createItem(Items.BOOK, "RECIPE_TOME_BLOODSNOUT_SLAYER_CHESTPLATE", "Recipe Tome Bloodsnout Slayer Chestplate"));
    map.put("RECIPE_TOME_BLOODSNOUT_SLAYER_HELMET",
        createItem(Items.BOOK, "RECIPE_TOME_BLOODSNOUT_SLAYER_HELMET", "Recipe Tome Bloodsnout Slayer Helmet"));
    map.put("RECIPE_TOME_BLOODSNOUT_SLAYER_LEGGINGS",
        createItem(Items.BOOK, "RECIPE_TOME_BLOODSNOUT_SLAYER_LEGGINGS", "Recipe Tome Bloodsnout Slayer Leggings"));
    map.put("RECIPE_TOME_COLLAPSING_EARTH_3",
        createItem(Items.BOOK, "RECIPE_TOME_COLLAPSING_EARTH_3", "Recipe Tome Collapsing Earth 3"));
    map.put("RECIPE_TOME_COLLAPSING_EARTH_4",
        createItem(Items.BOOK, "RECIPE_TOME_COLLAPSING_EARTH_4", "Recipe Tome Collapsing Earth 4"));
    map.put("RECIPE_TOME_COLLAPSING_EARTH_5",
        createItem(Items.BOOK, "RECIPE_TOME_COLLAPSING_EARTH_5", "Recipe Tome Collapsing Earth 5"));
    map.put("RECIPE_TOME_COLLAPSING_EARTH_6",
        createItem(Items.BOOK, "RECIPE_TOME_COLLAPSING_EARTH_6", "Recipe Tome Collapsing Earth 6"));
    map.put("RECIPE_TOME_CORRUPTION_3", createItem(Items.BOOK, "RECIPE_TOME_CORRUPTION_3", "Recipe Tome Corruption 3"));
    map.put("RECIPE_TOME_CORRUPTION_4", createItem(Items.BOOK, "RECIPE_TOME_CORRUPTION_4", "Recipe Tome Corruption 4"));
    map.put("RECIPE_TOME_CORRUPTION_5", createItem(Items.BOOK, "RECIPE_TOME_CORRUPTION_5", "Recipe Tome Corruption 5"));
    map.put("RECIPE_TOME_CORRUPTION_6", createItem(Items.BOOK, "RECIPE_TOME_CORRUPTION_6", "Recipe Tome Corruption 6"));
    map.put("RECIPE_TOME_FIREBOLT_3", createItem(Items.BOOK, "RECIPE_TOME_FIREBOLT_3", "Recipe Tome Firebolt 3"));
    map.put("RECIPE_TOME_FIREBOLT_4", createItem(Items.BOOK, "RECIPE_TOME_FIREBOLT_4", "Recipe Tome Firebolt 4"));
    map.put("RECIPE_TOME_FIREBOLT_5", createItem(Items.BOOK, "RECIPE_TOME_FIREBOLT_5", "Recipe Tome Firebolt 5"));
    map.put("RECIPE_TOME_FIREBOLT_6", createItem(Items.BOOK, "RECIPE_TOME_FIREBOLT_6", "Recipe Tome Firebolt 6"));
    map.put("RECIPE_TOME_FLASH_HEAL_3", createItem(Items.BOOK, "RECIPE_TOME_FLASH_HEAL_3", "Recipe Tome Flash Heal 3"));
    map.put("RECIPE_TOME_FLASH_HEAL_4", createItem(Items.BOOK, "RECIPE_TOME_FLASH_HEAL_4", "Recipe Tome Flash Heal 4"));
    map.put("RECIPE_TOME_FLASH_HEAL_5", createItem(Items.BOOK, "RECIPE_TOME_FLASH_HEAL_5", "Recipe Tome Flash Heal 5"));
    map.put("RECIPE_TOME_FLASH_HEAL_6", createItem(Items.BOOK, "RECIPE_TOME_FLASH_HEAL_6", "Recipe Tome Flash Heal 6"));
    map.put("RECIPE_TOME_FROSTBOLT_3", createItem(Items.BOOK, "RECIPE_TOME_FROSTBOLT_3", "Recipe Tome Frostbolt 3"));
    map.put("RECIPE_TOME_FROSTBOLT_4", createItem(Items.BOOK, "RECIPE_TOME_FROSTBOLT_4", "Recipe Tome Frostbolt 4"));
    map.put("RECIPE_TOME_FROSTBOLT_5", createItem(Items.BOOK, "RECIPE_TOME_FROSTBOLT_5", "Recipe Tome Frostbolt 5"));
    map.put("RECIPE_TOME_FROSTBOLT_6", createItem(Items.BOOK, "RECIPE_TOME_FROSTBOLT_6", "Recipe Tome Frostbolt 6"));
    map.put("RECIPE_TOME_IMPLEMENT_BRAND",
        createItem(Items.BOOK, "RECIPE_TOME_IMPLEMENT_BRAND", "Recipe Tome Implement Brand"));
    map.put("RECIPE_TOME_IMPLEMENT_CALLER",
        createItem(Items.BOOK, "RECIPE_TOME_IMPLEMENT_CALLER", "Recipe Tome Implement Caller"));
    map.put("RECIPE_TOME_IMPLEMENT_HEKA",
        createItem(Items.BOOK, "RECIPE_TOME_IMPLEMENT_HEKA", "Recipe Tome Implement Heka"));
    map.put("RECIPE_TOME_LIFE_DRAIN_3", createItem(Items.BOOK, "RECIPE_TOME_LIFE_DRAIN_3", "Recipe Tome Life Drain 3"));
    map.put("RECIPE_TOME_LIFE_DRAIN_4", createItem(Items.BOOK, "RECIPE_TOME_LIFE_DRAIN_4", "Recipe Tome Life Drain 4"));
    map.put("RECIPE_TOME_LIFE_DRAIN_5", createItem(Items.BOOK, "RECIPE_TOME_LIFE_DRAIN_5", "Recipe Tome Life Drain 5"));
    map.put("RECIPE_TOME_LIFE_DRAIN_6", createItem(Items.BOOK, "RECIPE_TOME_LIFE_DRAIN_6", "Recipe Tome Life Drain 6"));
    map.put("RECIPE_TOME_MYTHRIL_BOOTS",
        createItem(Items.BOOK, "RECIPE_TOME_MYTHRIL_BOOTS", "Recipe Tome Mythril Boots"));
    map.put("RECIPE_TOME_MYTHRIL_CHESTPLATE",
        createItem(Items.BOOK, "RECIPE_TOME_MYTHRIL_CHESTPLATE", "Recipe Tome Mythril Chestplate"));
    map.put("RECIPE_TOME_MYTHRIL_HELMET",
        createItem(Items.BOOK, "RECIPE_TOME_MYTHRIL_HELMET", "Recipe Tome Mythril Helmet"));
    map.put("RECIPE_TOME_MYTHRIL_LEGGINGS",
        createItem(Items.BOOK, "RECIPE_TOME_MYTHRIL_LEGGINGS", "Recipe Tome Mythril Leggings"));
    map.put("RECIPE_TOME_PIGGLY_WIGGLY_BOW",
        createItem(Items.BOOK, "RECIPE_TOME_PIGGLY_WIGGLY_BOW", "Recipe Tome Piggly Wiggly Bow"));
    map.put("RECIPE_TOME_PRESSURE_WAVE_3",
        createItem(Items.BOOK, "RECIPE_TOME_PRESSURE_WAVE_3", "Recipe Tome Pressure Wave 3"));
    map.put("RECIPE_TOME_PRESSURE_WAVE_4",
        createItem(Items.BOOK, "RECIPE_TOME_PRESSURE_WAVE_4", "Recipe Tome Pressure Wave 4"));
    map.put("RECIPE_TOME_PRESSURE_WAVE_5",
        createItem(Items.BOOK, "RECIPE_TOME_PRESSURE_WAVE_5", "Recipe Tome Pressure Wave 5"));
    map.put("RECIPE_TOME_PRESSURE_WAVE_6",
        createItem(Items.BOOK, "RECIPE_TOME_PRESSURE_WAVE_6", "Recipe Tome Pressure Wave 6"));
    map.put("RECIPE_TOME_REGENERATION_3",
        createItem(Items.BOOK, "RECIPE_TOME_REGENERATION_3", "Recipe Tome Regeneration 3"));
    map.put("RECIPE_TOME_REGENERATION_4",
        createItem(Items.BOOK, "RECIPE_TOME_REGENERATION_4", "Recipe Tome Regeneration 4"));
    map.put("RECIPE_TOME_REGENERATION_5",
        createItem(Items.BOOK, "RECIPE_TOME_REGENERATION_5", "Recipe Tome Regeneration 5"));
    map.put("RECIPE_TOME_REGENERATION_6",
        createItem(Items.BOOK, "RECIPE_TOME_REGENERATION_6", "Recipe Tome Regeneration 6"));
    map.put("RECIPE_TOME_RING_OF_MERCY_3",
        createItem(Items.BOOK, "RECIPE_TOME_RING_OF_MERCY_3", "Recipe Tome Ring Of Mercy 3"));
    map.put("RECIPE_TOME_RING_OF_MERCY_4",
        createItem(Items.BOOK, "RECIPE_TOME_RING_OF_MERCY_4", "Recipe Tome Ring Of Mercy 4"));
    map.put("RECIPE_TOME_RING_OF_MERCY_5",
        createItem(Items.BOOK, "RECIPE_TOME_RING_OF_MERCY_5", "Recipe Tome Ring Of Mercy 5"));
    map.put("RECIPE_TOME_RING_OF_MERCY_6",
        createItem(Items.BOOK, "RECIPE_TOME_RING_OF_MERCY_6", "Recipe Tome Ring Of Mercy 6"));
    map.put("RECIPE_TOME_SANCTIFIED_BOOTS",
        createItem(Items.BOOK, "RECIPE_TOME_SANCTIFIED_BOOTS", "Recipe Tome Sanctified Boots"));
    map.put("RECIPE_TOME_SANCTIFIED_CHESTPLATE",
        createItem(Items.BOOK, "RECIPE_TOME_SANCTIFIED_CHESTPLATE", "Recipe Tome Sanctified Chestplate"));
    map.put("RECIPE_TOME_SANCTIFIED_HELMET",
        createItem(Items.BOOK, "RECIPE_TOME_SANCTIFIED_HELMET", "Recipe Tome Sanctified Helmet"));
    map.put("RECIPE_TOME_SANCTIFIED_LEGGINGS",
        createItem(Items.BOOK, "RECIPE_TOME_SANCTIFIED_LEGGINGS", "Recipe Tome Sanctified Leggings"));
    map.put("RECIPE_TOME_STEEL_BOOTS", createItem(Items.BOOK, "RECIPE_TOME_STEEL_BOOTS", "Recipe Tome Steel Boots"));
    map.put("RECIPE_TOME_STEEL_CHESTPLATE",
        createItem(Items.BOOK, "RECIPE_TOME_STEEL_CHESTPLATE", "Recipe Tome Steel Chestplate"));
    map.put("RECIPE_TOME_STEEL_HELMET", createItem(Items.BOOK, "RECIPE_TOME_STEEL_HELMET", "Recipe Tome Steel Helmet"));
    map.put("RECIPE_TOME_STEEL_LEGGINGS",
        createItem(Items.BOOK, "RECIPE_TOME_STEEL_LEGGINGS", "Recipe Tome Steel Leggings"));
    map.put("RECIPE_TOME_UNSETTLING_BOW",
        createItem(Items.BOOK, "RECIPE_TOME_UNSETTLING_BOW", "Recipe Tome Unsettling Bow"));
    map.put("REPAIR_PATCH_LEATHER", createItem(Items.DRIED_KELP, "REPAIR_PATCH_LEATHER", "Repair Patch Leather"));
    map.put("REPAIR_PATCH_ZOMBIE", createItem(Items.DRIED_KELP, "REPAIR_PATCH_ZOMBIE", "Repair Patch Zombie"));
    map.put("REPAIR_POWDER_ARCANE_COMMON",
        createItem(Items.REDSTONE, "REPAIR_POWDER_ARCANE_COMMON", "Repair Powder Arcane Common"));
    map.put("REPAIR_POWDER_ARCANE_EPIC",
        createItem(Items.REDSTONE, "REPAIR_POWDER_ARCANE_EPIC", "Repair Powder Arcane Epic"));
    map.put("REPAIR_POWDER_ARCANE_RARE",
        createItem(Items.REDSTONE, "REPAIR_POWDER_ARCANE_RARE", "Repair Powder Arcane Rare"));
    map.put("REPAIR_POWDER_ARCANE_UNCOMMON",
        createItem(Items.REDSTONE, "REPAIR_POWDER_ARCANE_UNCOMMON", "Repair Powder Arcane Uncommon"));
    map.put("REPAIR_POWDER_BASIC", createItem(Items.SUGAR, "REPAIR_POWDER_BASIC", "Repair Powder Basic"));
    map.put("REPAIR_POWDER_COMMON", createItem(Items.SUGAR, "REPAIR_POWDER_COMMON", "Repair Powder Common"));
    map.put("REPAIR_POWDER_EPIC", createItem(Items.SUGAR, "REPAIR_POWDER_EPIC", "Repair Powder Epic"));
    map.put("REPAIR_POWDER_EXOTIC", createItem(Items.SUGAR, "REPAIR_POWDER_EXOTIC", "Repair Powder Exotic"));
    map.put("REPAIR_POWDER_RARE", createItem(Items.SUGAR, "REPAIR_POWDER_RARE", "Repair Powder Rare"));
    map.put("REPAIR_POWDER_UNCOMMON", createItem(Items.SUGAR, "REPAIR_POWDER_UNCOMMON", "Repair Powder Uncommon"));
    map.put("REPLICATING_AMETHYST", createItem(Items.BUDDING_AMETHYST, "REPLICATING_AMETHYST", "Replicating Amethyst"));
    map.put("RIGHTEOUS_SOUL", createItem(Items.END_CRYSTAL, "RIGHTEOUS_SOUL", "Righteous Soul"));
    map.put("ROASTED_APPLE", createItem(Items.APPLE, "ROASTED_APPLE", "Roasted Apple"));
    map.put("ROASTED_BEETROOT", createItem(Items.BEETROOT, "ROASTED_BEETROOT", "Roasted Beetroot"));
    map.put("ROASTED_CARROT", createItem(Items.CARROT, "ROASTED_CARROT", "Roasted Carrot"));
    map.put("ROASTED_COOKIE", createItem(Items.COOKIE, "ROASTED_COOKIE", "Roasted Cookie"));
    map.put("ROASTED_GOLDEN_BEETROOT",
        createItem(Items.BEETROOT, "ROASTED_GOLDEN_BEETROOT", "Roasted Golden Beetroot"));
    map.put("ROASTED_GOLDEN_POTATO", createItem(Items.BAKED_POTATO, "ROASTED_GOLDEN_POTATO", "Roasted Golden Potato"));
    map.put("ROASTED_MUSHROOM", createItem(Items.BAKED_POTATO, "ROASTED_MUSHROOM", "Roasted Mushroom"));
    map.put("ROASTED_PLAIN_CHICKEN",
        createItem(Items.COOKED_CHICKEN, "ROASTED_PLAIN_CHICKEN", "Roasted Plain Chicken"));
    map.put("ROASTED_PLAIN_COD", createItem(Items.COOKED_COD, "ROASTED_PLAIN_COD", "Roasted Plain Cod"));
    map.put("ROASTED_PLAIN_MUTTON", createItem(Items.COOKED_MUTTON, "ROASTED_PLAIN_MUTTON", "Roasted Plain Mutton"));
    map.put("ROASTED_PLAIN_PORKCHOP",
        createItem(Items.COOKED_PORKCHOP, "ROASTED_PLAIN_PORKCHOP", "Roasted Plain Porkchop"));
    map.put("ROASTED_PLAIN_RABBIT", createItem(Items.COOKED_RABBIT, "ROASTED_PLAIN_RABBIT", "Roasted Plain Rabbit"));
    map.put("ROASTED_PLAIN_SALMON", createItem(Items.COOKED_SALMON, "ROASTED_PLAIN_SALMON", "Roasted Plain Salmon"));
    map.put("ROASTED_PLAIN_STEAK", createItem(Items.COOKED_BEEF, "ROASTED_PLAIN_STEAK", "Roasted Plain Steak"));
    map.put("ROASTED_PLAIN_TROPICAL_FISH",
        createItem(Items.COOKED_COD, "ROASTED_PLAIN_TROPICAL_FISH", "Roasted Plain Tropical Fish"));
    map.put("ROASTED_POTATO", createItem(Items.BAKED_POTATO, "ROASTED_POTATO", "Roasted Potato"));
    map.put("ROASTED_STUFFED_MUSHROOM",
        createItem(Items.BAKED_POTATO, "ROASTED_STUFFED_MUSHROOM", "Roasted Stuffed Mushroom"));
    map.put("ROSEBUD_SALAD", createItem(Items.RABBIT_STEW, "ROSEBUD_SALAD", "Rosebud Salad"));
    map.put("RUNECARVING_ADVANCEMENT_1",
        createItem(Items.TURTLE_EGG, "RUNECARVING_ADVANCEMENT_1", "Runecarving Advancement 1"));
    map.put("RUNECARVING_ADVANCEMENT_2",
        createItem(Items.TURTLE_EGG, "RUNECARVING_ADVANCEMENT_2", "Runecarving Advancement 2"));
    map.put("RUNECARVING_ADVANCEMENT_3",
        createItem(Items.TURTLE_EGG, "RUNECARVING_ADVANCEMENT_3", "Runecarving Advancement 3"));
    map.put("RUNECARVING_ADVANCEMENT_4",
        createItem(Items.TURTLE_EGG, "RUNECARVING_ADVANCEMENT_4", "Runecarving Advancement 4"));
    map.put("RUNECARVING_ADVANCEMENT_5",
        createItem(Items.TURTLE_EGG, "RUNECARVING_ADVANCEMENT_5", "Runecarving Advancement 5"));
    map.put("RUNECARVING_DEFENSE_1", createItem(Items.DIAMOND, "RUNECARVING_DEFENSE_1", "Runecarving Defense 1"));
    map.put("RUNECARVING_DEFENSE_2", createItem(Items.DIAMOND, "RUNECARVING_DEFENSE_2", "Runecarving Defense 2"));
    map.put("RUNECARVING_DEFENSE_3", createItem(Items.DIAMOND, "RUNECARVING_DEFENSE_3", "Runecarving Defense 3"));
    map.put("RUNECARVING_DEFENSE_4", createItem(Items.DIAMOND, "RUNECARVING_DEFENSE_4", "Runecarving Defense 4"));
    map.put("RUNECARVING_DEFENSE_5", createItem(Items.DIAMOND, "RUNECARVING_DEFENSE_5", "Runecarving Defense 5"));
    map.put("RUNECARVING_MUDDLED_1", createItem(Items.ENDER_PEARL, "RUNECARVING_MUDDLED_1", "Runecarving Muddled 1"));
    map.put("RUNECARVING_MUDDLED_2", createItem(Items.ENDER_PEARL, "RUNECARVING_MUDDLED_2", "Runecarving Muddled 2"));
    map.put("RUNECARVING_MUDDLED_3", createItem(Items.ENDER_PEARL, "RUNECARVING_MUDDLED_3", "Runecarving Muddled 3"));
    map.put("RUNECARVING_MUDDLED_4", createItem(Items.ENDER_PEARL, "RUNECARVING_MUDDLED_4", "Runecarving Muddled 4"));
    map.put("RUNECARVING_MUDDLED_5", createItem(Items.ENDER_PEARL, "RUNECARVING_MUDDLED_5", "Runecarving Muddled 5"));
    map.put("RUNECARVING_OFFENSE_1", createItem(Items.BLAZE_POWDER, "RUNECARVING_OFFENSE_1", "Runecarving Offense 1"));
    map.put("RUNECARVING_OFFENSE_2", createItem(Items.BLAZE_POWDER, "RUNECARVING_OFFENSE_2", "Runecarving Offense 2"));
    map.put("RUNECARVING_OFFENSE_3", createItem(Items.BLAZE_POWDER, "RUNECARVING_OFFENSE_3", "Runecarving Offense 3"));
    map.put("RUNECARVING_OFFENSE_4", createItem(Items.BLAZE_POWDER, "RUNECARVING_OFFENSE_4", "Runecarving Offense 4"));
    map.put("RUNECARVING_OFFENSE_5", createItem(Items.BLAZE_POWDER, "RUNECARVING_OFFENSE_5", "Runecarving Offense 5"));
    map.put("RUNECARVING_PVP_1", createItem(Items.SKELETON_SKULL, "RUNECARVING_PVP_1", "Runecarving Pvp 1"));
    map.put("RUNECARVING_PVP_2", createItem(Items.SKELETON_SKULL, "RUNECARVING_PVP_2", "Runecarving Pvp 2"));
    map.put("RUNECARVING_PVP_3", createItem(Items.SKELETON_SKULL, "RUNECARVING_PVP_3", "Runecarving Pvp 3"));
    map.put("RUNECARVING_PVP_4", createItem(Items.SKELETON_SKULL, "RUNECARVING_PVP_4", "Runecarving Pvp 4"));
    map.put("RUNECARVING_PVP_5", createItem(Items.SKELETON_SKULL, "RUNECARVING_PVP_5", "Runecarving Pvp 5"));
    map.put("RUNE_ERASER", createItem(Items.BLAZE_ROD, "RUNE_ERASER", "Rune Eraser"));
    map.put("Rotten Maw - Compass", createItem(Items.STICK, "Rotten Maw - Compass", "Rotten maw - compass"));
    map.put("SALT", createItem(Items.SUGAR, "SALT", "Salt"));
    map.put("SALVAGE_KIT", createItem(Items.JUKEBOX, "SALVAGE_KIT", "Salvage Kit"));
    map.put("SANCTIFIED_BOOTS", createItem(Items.LEATHER_BOOTS, "SANCTIFIED_BOOTS", "Sanctified Boots"));
    map.put("SANCTIFIED_CHESTPLATE",
        createItem(Items.LEATHER_CHESTPLATE, "SANCTIFIED_CHESTPLATE", "Sanctified Chestplate"));
    map.put("SANCTIFIED_HELMET", createItem(Items.LEATHER_HELMET, "SANCTIFIED_HELMET", "Sanctified Helmet"));
    map.put("SANCTIFIED_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "SANCTIFIED_LEGGINGS", "Sanctified Leggings"));
    map.put("SANDY_HIDE", createItem(Items.LEATHER, "SANDY_HIDE", "Sandy Hide"));
    map.put("SATET_BOW", createItem(Items.BOW, "SATET_BOW", "Satet Bow"));
    map.put("SECRETS_ARCHAEOLOGY", createItem(Items.BOOK, "SECRETS_ARCHAEOLOGY", "Secrets Archaeology"));
    map.put("SECRETS_CLASS", createItem(Items.BOOK, "SECRETS_CLASS", "Secrets Class"));
    map.put("SECRETS_FISHING", createItem(Items.BOOK, "SECRETS_FISHING", "Secrets Fishing"));
    map.put("SECRETS_HERBALISM", createItem(Items.BOOK, "SECRETS_HERBALISM", "Secrets Herbalism"));
    map.put("SECRETS_LOGGING", createItem(Items.BOOK, "SECRETS_LOGGING", "Secrets Logging"));
    map.put("SECRETS_MINING", createItem(Items.BOOK, "SECRETS_MINING", "Secrets Mining"));
    map.put("SEE_BREATHER", createItem(Items.PUFFERFISH, "SEE_BREATHER", "See Breather"));
    map.put("SENTIENT_BREAD", createItem(Items.BREAD, "SENTIENT_BREAD", "Sentient Bread"));
    map.put("SENTIENT_DOUGH", createItem(Items.CYAN_DYE, "SENTIENT_DOUGH", "Sentient Dough"));
    map.put("SENTIENT_FLOUR", createItem(Items.SUGAR, "SENTIENT_FLOUR", "Sentient Flour"));
    map.put("SENTIENT_GRAVY", createItem(Items.POTION, "SENTIENT_GRAVY", "Sentient Gravy"));
    map.put("SENTIENT_POTATOES_AND_SENTIENT_GRAVY",
        createItem(Items.BAKED_POTATO, "SENTIENT_POTATOES_AND_SENTIENT_GRAVY", "Sentient Potatoes And Sentient Gravy"));
    map.put("SENTIENT_POTATOES_AND_SENTIENT_GRAVY_ANIMATED", createItem(Items.BAKED_POTATO,
        "SENTIENT_POTATOES_AND_SENTIENT_GRAVY_ANIMATED", "Sentient Potatoes And Sentient Gravy Animated"));
    map.put("SENTIENT_WHEAT", createItem(Items.WHEAT, "SENTIENT_WHEAT", "Sentient Wheat"));
    map.put("SHELL_EVERBUBBLING", createItem(Items.NAUTILUS_SHELL, "SHELL_EVERBUBBLING", "Shell Everbubbling"));
    map.put("SHIMMERGLASS_AXE", createItem(Items.DIAMOND_AXE, "SHIMMERGLASS_AXE", "Shimmerglass Axe"));
    map.put("SHIMMERGLASS_FISHINGPOLE",
        createItem(Items.FISHING_ROD, "SHIMMERGLASS_FISHINGPOLE", "Shimmerglass Fishingpole"));
    map.put("SHIMMERGLASS_HOE", createItem(Items.DIAMOND_HOE, "SHIMMERGLASS_HOE", "Shimmerglass Hoe"));
    map.put("SHIMMERGLASS_PICKAXE", createItem(Items.DIAMOND_PICKAXE, "SHIMMERGLASS_PICKAXE", "Shimmerglass Pickaxe"));
    map.put("SHIMMERGLASS_SHOVEL", createItem(Items.DIAMOND_SHOVEL, "SHIMMERGLASS_SHOVEL", "Shimmerglass Shovel"));
    map.put("SILK_BOOTS", createItem(Items.LEATHER_BOOTS, "SILK_BOOTS", "Silk Boots"));
    map.put("SILK_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "SILK_CHESTPLATE", "Silk Chestplate"));
    map.put("SILK_HELMET", createItem(Items.LEATHER_HELMET, "SILK_HELMET", "Silk Helmet"));
    map.put("SILK_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "SILK_LEGGINGS", "Silk Leggings"));
    map.put("SKELETAL_BOW", createItem(Items.BOW, "SKELETAL_BOW", "Skeletal Bow"));
    map.put("SKYSTEEL_AXE", createItem(Items.IRON_AXE, "SKYSTEEL_AXE", "Skysteel Axe"));
    map.put("SKYSTEEL_FISHINGPOLE", createItem(Items.FISHING_ROD, "SKYSTEEL_FISHINGPOLE", "Skysteel Fishingpole"));
    map.put("SKYSTEEL_HOE", createItem(Items.IRON_HOE, "SKYSTEEL_HOE", "Skysteel Hoe"));
    map.put("SKYSTEEL_PICKAXE", createItem(Items.IRON_PICKAXE, "SKYSTEEL_PICKAXE", "Skysteel Pickaxe"));
    map.put("SKYSTEEL_SHOVEL", createItem(Items.IRON_SHOVEL, "SKYSTEEL_SHOVEL", "Skysteel Shovel"));
    map.put("SMOKED_APPLE", createItem(Items.APPLE, "SMOKED_APPLE", "Smoked Apple"));
    map.put("SMOKED_BEETROOT", createItem(Items.BEETROOT, "SMOKED_BEETROOT", "Smoked Beetroot"));
    map.put("SMOKED_CARROT", createItem(Items.CARROT, "SMOKED_CARROT", "Smoked Carrot"));
    map.put("SMOKED_COOKIE", createItem(Items.COOKIE, "SMOKED_COOKIE", "Smoked Cookie"));
    map.put("SMOKED_GOLDEN_BEETROOT", createItem(Items.BEETROOT, "SMOKED_GOLDEN_BEETROOT", "Smoked Golden Beetroot"));
    map.put("SMOKED_GOLDEN_POTATO", createItem(Items.BAKED_POTATO, "SMOKED_GOLDEN_POTATO", "Smoked Golden Potato"));
    map.put("SMOKED_MUSHROOM", createItem(Items.BAKED_POTATO, "SMOKED_MUSHROOM", "Smoked Mushroom"));
    map.put("SMOKED_PLAIN_CHICKEN", createItem(Items.COOKED_CHICKEN, "SMOKED_PLAIN_CHICKEN", "Smoked Plain Chicken"));
    map.put("SMOKED_PLAIN_COD", createItem(Items.COOKED_COD, "SMOKED_PLAIN_COD", "Smoked Plain Cod"));
    map.put("SMOKED_PLAIN_MUTTON", createItem(Items.COOKED_MUTTON, "SMOKED_PLAIN_MUTTON", "Smoked Plain Mutton"));
    map.put("SMOKED_PLAIN_PORKCHOP",
        createItem(Items.COOKED_PORKCHOP, "SMOKED_PLAIN_PORKCHOP", "Smoked Plain Porkchop"));
    map.put("SMOKED_PLAIN_RABBIT", createItem(Items.COOKED_RABBIT, "SMOKED_PLAIN_RABBIT", "Smoked Plain Rabbit"));
    map.put("SMOKED_PLAIN_SALMON", createItem(Items.COOKED_SALMON, "SMOKED_PLAIN_SALMON", "Smoked Plain Salmon"));
    map.put("SMOKED_PLAIN_STEAK", createItem(Items.COOKED_BEEF, "SMOKED_PLAIN_STEAK", "Smoked Plain Steak"));
    map.put("SMOKED_PLAIN_TROPICAL_FISH",
        createItem(Items.COOKED_COD, "SMOKED_PLAIN_TROPICAL_FISH", "Smoked Plain Tropical Fish"));
    map.put("SMOKED_POTATO", createItem(Items.BAKED_POTATO, "SMOKED_POTATO", "Smoked Potato"));
    map.put("SMOKED_STUFFED_MUSHROOM",
        createItem(Items.BAKED_POTATO, "SMOKED_STUFFED_MUSHROOM", "Smoked Stuffed Mushroom"));
    map.put("SMOOTHIE_STAR", createItem(Items.POTION, "SMOOTHIE_STAR", "Smoothie Star"));
    map.put("SOGGY_BOOK", createItem(Items.BOOK, "SOGGY_BOOK", "Soggy Book"));
    map.put("SOUL_CHARGE", createItem(Items.GLOWSTONE, "SOUL_CHARGE", "Soul Charge"));
    map.put("SOUL_FRAGMENT", createItem(Items.AMETHYST_SHARD, "SOUL_FRAGMENT", "Soul Fragment"));
    map.put("SOUL_SHARD", createItem(Items.AMETHYST_SHARD, "SOUL_SHARD", "Soul Shard"));
    map.put("SPARKING_SILK_BOOTS", createItem(Items.LEATHER_BOOTS, "SPARKING_SILK_BOOTS", "Sparking Silk Boots"));
    map.put("SPARKING_SILK_CHESTPLATE",
        createItem(Items.LEATHER_CHESTPLATE, "SPARKING_SILK_CHESTPLATE", "Sparking Silk Chestplate"));
    map.put("SPARKING_SILK_HELMET", createItem(Items.LEATHER_HELMET, "SPARKING_SILK_HELMET", "Sparking Silk Helmet"));
    map.put("SPARKING_SILK_LEGGINGS",
        createItem(Items.LEATHER_LEGGINGS, "SPARKING_SILK_LEGGINGS", "Sparking Silk Leggings"));
    map.put("SPICED_SLUGS", createItem(Items.POTION, "SPICED_SLUGS", "Spiced Slugs"));
    map.put("SPIRIT_ACACIA", createItem(Items.PHANTOM_MEMBRANE, "SPIRIT_ACACIA", "Spirit Acacia"));
    map.put("SPIRIT_BIRCH", createItem(Items.PHANTOM_MEMBRANE, "SPIRIT_BIRCH", "Spirit Birch"));
    map.put("SPIRIT_DARKOAK", createItem(Items.PHANTOM_MEMBRANE, "SPIRIT_DARKOAK", "Spirit Darkoak"));
    map.put("SPIRIT_JUNGLE", createItem(Items.PHANTOM_MEMBRANE, "SPIRIT_JUNGLE", "Spirit Jungle"));
    map.put("SPIRIT_OAK", createItem(Items.PHANTOM_MEMBRANE, "SPIRIT_OAK", "Spirit Oak"));
    map.put("SPIRIT_SPRUCE", createItem(Items.PHANTOM_MEMBRANE, "SPIRIT_SPRUCE", "Spirit Spruce"));
    map.put("STARTER_ARCHAEOLOGIST_CHISELED",
        createItem(Items.CHISELED_SANDSTONE, "STARTER_ARCHAEOLOGIST_CHISELED", "Starter Archaeologist Chiseled"));
    map.put("STARTER_ARCHAEOLOGIST_COMMONSHELL",
        createItem(Items.CHISELED_SANDSTONE, "STARTER_ARCHAEOLOGIST_COMMONSHELL", "Starter Archaeologist Commonshell"));
    map.put("STARTER_ARCHAEOLOGIST_FANCYSHELL",
        createItem(Items.CHISELED_SANDSTONE, "STARTER_ARCHAEOLOGIST_FANCYSHELL", "Starter Archaeologist Fancyshell"));
    map.put("STARTER_ARCHAEOLOGIST_PRETTYSHELL",
        createItem(Items.CHISELED_SANDSTONE, "STARTER_ARCHAEOLOGIST_PRETTYSHELL", "Starter Archaeologist Prettyshell"));
    map.put("STARTER_ARCHAEOLOGIST_SALT",
        createItem(Items.CHISELED_SANDSTONE, "STARTER_ARCHAEOLOGIST_SALT", "Starter Archaeologist Salt"));
    map.put("STARTER_BOTANIST_BEETROOT",
        createItem(Items.GREEN_DYE, "STARTER_BOTANIST_BEETROOT", "Starter Botanist Beetroot"));
    map.put("STARTER_BOTANIST_CARROT",
        createItem(Items.GREEN_DYE, "STARTER_BOTANIST_CARROT", "Starter Botanist Carrot"));
    map.put("STARTER_BOTANIST_PEPPER",
        createItem(Items.GREEN_DYE, "STARTER_BOTANIST_PEPPER", "Starter Botanist Pepper"));
    map.put("STARTER_BOTANIST_POTATO",
        createItem(Items.GREEN_DYE, "STARTER_BOTANIST_POTATO", "Starter Botanist Potato"));
    map.put("STARTER_BOTANIST_WHEAT", createItem(Items.GREEN_DYE, "STARTER_BOTANIST_WHEAT", "Starter Botanist Wheat"));
    map.put("STARTER_CHRISTMAS", createItem(Items.SNOW, "STARTER_CHRISTMAS", "Starter Christmas"));
    map.put("STARTER_FISHERMAN_COD", createItem(Items.PAPER, "STARTER_FISHERMAN_COD", "Starter Fisherman Cod"));
    map.put("STARTER_FISHERMAN_FROST", createItem(Items.PAPER, "STARTER_FISHERMAN_FROST", "Starter Fisherman Frost"));
    map.put("STARTER_FISHERMAN_PUFFER",
        createItem(Items.PAPER, "STARTER_FISHERMAN_PUFFER", "Starter Fisherman Puffer"));
    map.put("STARTER_FISHERMAN_SALMON",
        createItem(Items.PAPER, "STARTER_FISHERMAN_SALMON", "Starter Fisherman Salmon"));
    map.put("STARTER_FISHERMAN_TROPICAL",
        createItem(Items.PAPER, "STARTER_FISHERMAN_TROPICAL", "Starter Fisherman Tropical"));
    map.put("STARTER_FISHERMAN_WATER", createItem(Items.PAPER, "STARTER_FISHERMAN_WATER", "Starter Fisherman Water"));
    map.put("STARTER_HALLOWEEN", createItem(Items.JACK_O_LANTERN, "STARTER_HALLOWEEN", "Starter Halloween"));
    map.put("STARTER_HUNTER_OUTPOST_DESTROYED",
        createItem(Items.BARREL, "STARTER_HUNTER_OUTPOST_DESTROYED", "Starter Hunter Outpost Destroyed"));
    map.put("STARTER_HUNTER_PILLAGER", createItem(Items.BARREL, "STARTER_HUNTER_PILLAGER", "Starter Hunter Pillager"));
    map.put("STARTER_LUMBERJACK_ACACIA",
        createItem(Items.ACACIA_LOG, "STARTER_LUMBERJACK_ACACIA", "Starter Lumberjack Acacia"));
    map.put("STARTER_LUMBERJACK_BIRCH",
        createItem(Items.BIRCH_LOG, "STARTER_LUMBERJACK_BIRCH", "Starter Lumberjack Birch"));
    map.put("STARTER_LUMBERJACK_DARKOAK",
        createItem(Items.DARK_OAK_LOG, "STARTER_LUMBERJACK_DARKOAK", "Starter Lumberjack Darkoak"));
    map.put("STARTER_LUMBERJACK_JUNGLE",
        createItem(Items.JUNGLE_LOG, "STARTER_LUMBERJACK_JUNGLE", "Starter Lumberjack Jungle"));
    map.put("STARTER_LUMBERJACK_OAK", createItem(Items.OAK_LOG, "STARTER_LUMBERJACK_OAK", "Starter Lumberjack Oak"));
    map.put("STARTER_LUMBERJACK_SPRUCE",
        createItem(Items.SPRUCE_LOG, "STARTER_LUMBERJACK_SPRUCE", "Starter Lumberjack Spruce"));
    map.put("STARTER_MINER_COPPER", createItem(Items.CHARCOAL, "STARTER_MINER_COPPER", "Starter Miner Copper"));
    map.put("STARTER_MINER_EARTH", createItem(Items.CHARCOAL, "STARTER_MINER_EARTH", "Starter Miner Earth"));
    map.put("STARTER_MINER_GEODE", createItem(Items.CHARCOAL, "STARTER_MINER_GEODE", "Starter Miner Geode"));
    map.put("STARTER_MINER_IRON", createItem(Items.CHARCOAL, "STARTER_MINER_IRON", "Starter Miner Iron"));
    map.put("STARTER_MINER_LAPIS", createItem(Items.CHARCOAL, "STARTER_MINER_LAPIS", "Starter Miner Lapis"));
    map.put("STARTER_MINER_REDSTONE", createItem(Items.CHARCOAL, "STARTER_MINER_REDSTONE", "Starter Miner Redstone"));
    map.put("STARTER_MINER_SPARK", createItem(Items.CHARCOAL, "STARTER_MINER_SPARK", "Starter Miner Spark"));
    map.put("STARTER_RUNECARVER_CLARITY",
        createItem(Items.CHISELED_POLISHED_BLACKSTONE, "STARTER_RUNECARVER_CLARITY", "Starter Runecarver Clarity"));
    map.put("STARTER_RUNECARVER_MUDDLED",
        createItem(Items.CHISELED_POLISHED_BLACKSTONE, "STARTER_RUNECARVER_MUDDLED", "Starter Runecarver Muddled"));
    map.put("STARTER_RUNECARVER_SERENITY",
        createItem(Items.CHISELED_POLISHED_BLACKSTONE, "STARTER_RUNECARVER_SERENITY", "Starter Runecarver Serenity"));
    map.put("STARTER_RUNECARVER_VIOLENCE",
        createItem(Items.CHISELED_POLISHED_BLACKSTONE, "STARTER_RUNECARVER_VIOLENCE", "Starter Runecarver Violence"));
    map.put("STEEL_BOOTS", createItem(Items.IRON_BOOTS, "STEEL_BOOTS", "Steel Boots"));
    map.put("STEEL_CHESTPLATE", createItem(Items.IRON_CHESTPLATE, "STEEL_CHESTPLATE", "Steel Chestplate"));
    map.put("STEEL_HELMET", createItem(Items.IRON_HELMET, "STEEL_HELMET", "Steel Helmet"));
    map.put("STEEL_INGOT", createItem(Items.IRON_INGOT, "STEEL_INGOT", "Steel Ingot"));
    map.put("STEEL_LEGGINGS", createItem(Items.IRON_LEGGINGS, "STEEL_LEGGINGS", "Steel Leggings"));
    map.put("STEEL_SCRAP", createItem(Items.NETHERITE_SCRAP, "STEEL_SCRAP", "Steel Scrap"));
    map.put("STONE_BOOTS", createItem(Items.LEATHER_BOOTS, "STONE_BOOTS", "Stone Boots"));
    map.put("STONE_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "STONE_CHESTPLATE", "Stone Chestplate"));
    map.put("STONE_HELMET", createItem(Items.LEATHER_HELMET, "STONE_HELMET", "Stone Helmet"));
    map.put("STONE_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "STONE_LEGGINGS", "Stone Leggings"));
    map.put("STONE_SWORD", createItem(Items.STONE_SWORD, "STONE_SWORD", "Stone Sword"));
    map.put("STRONG_BOW", createItem(Items.BOW, "STRONG_BOW", "Strong Bow"));
    map.put("STRONG_FISHINGPOLE", createItem(Items.FISHING_ROD, "STRONG_FISHINGPOLE", "Strong Fishingpole"));
    map.put("STUFFED_MUSHROOM", createItem(Items.BAKED_POTATO, "STUFFED_MUSHROOM", "Stuffed Mushroom"));
    map.put("Sunken Cells - Compass", createItem(Items.STICK, "Sunken Cells - Compass", "Sunken cells - compass"));
    map.put("T1_RANDOM_COLLAPSING_EARTH",
        createItem(Items.BOOK, "T1_RANDOM_COLLAPSING_EARTH", "T1 Random Collapsing Earth"));
    map.put("T1_RANDOM_CORRUPTION", createItem(Items.BOOK, "T1_RANDOM_CORRUPTION", "T1 Random Corruption"));
    map.put("T1_RANDOM_FIREBOLT", createItem(Items.BOOK, "T1_RANDOM_FIREBOLT", "T1 Random Firebolt"));
    map.put("T1_RANDOM_FLASH_HEAL", createItem(Items.BOOK, "T1_RANDOM_FLASH_HEAL", "T1 Random Flash Heal"));
    map.put("T1_RANDOM_FROSTBOLT", createItem(Items.BOOK, "T1_RANDOM_FROSTBOLT", "T1 Random Frostbolt"));
    map.put("T1_RANDOM_LIFE_DRAIN", createItem(Items.BOOK, "T1_RANDOM_LIFE_DRAIN", "T1 Random Life Drain"));
    map.put("T1_RANDOM_PRESSURE_WAVE", createItem(Items.BOOK, "T1_RANDOM_PRESSURE_WAVE", "T1 Random Pressure Wave"));
    map.put("T1_RANDOM_REGENERATION", createItem(Items.BOOK, "T1_RANDOM_REGENERATION", "T1 Random Regeneration"));
    map.put("T1_RANDOM_RING_OF_MERCY", createItem(Items.BOOK, "T1_RANDOM_RING_OF_MERCY", "T1 Random Ring Of Mercy"));
    map.put("T2_RANDOM_COLLAPSING_EARTH",
        createItem(Items.BOOK, "T2_RANDOM_COLLAPSING_EARTH", "T2 Random Collapsing Earth"));
    map.put("T2_RANDOM_CORRUPTION", createItem(Items.BOOK, "T2_RANDOM_CORRUPTION", "T2 Random Corruption"));
    map.put("T2_RANDOM_FIREBOLT", createItem(Items.BOOK, "T2_RANDOM_FIREBOLT", "T2 Random Firebolt"));
    map.put("T2_RANDOM_FLASH_HEAL", createItem(Items.BOOK, "T2_RANDOM_FLASH_HEAL", "T2 Random Flash Heal"));
    map.put("T2_RANDOM_FROSTBOLT", createItem(Items.BOOK, "T2_RANDOM_FROSTBOLT", "T2 Random Frostbolt"));
    map.put("T2_RANDOM_LIFE_DRAIN", createItem(Items.BOOK, "T2_RANDOM_LIFE_DRAIN", "T2 Random Life Drain"));
    map.put("T2_RANDOM_PRESSURE_WAVE", createItem(Items.BOOK, "T2_RANDOM_PRESSURE_WAVE", "T2 Random Pressure Wave"));
    map.put("T2_RANDOM_REGENERATION", createItem(Items.BOOK, "T2_RANDOM_REGENERATION", "T2 Random Regeneration"));
    map.put("T2_RANDOM_RING_OF_MERCY", createItem(Items.BOOK, "T2_RANDOM_RING_OF_MERCY", "T2 Random Ring Of Mercy"));
    map.put("T3_RANDOM_COLLAPSING_EARTH",
        createItem(Items.BOOK, "T3_RANDOM_COLLAPSING_EARTH", "T3 Random Collapsing Earth"));
    map.put("T3_RANDOM_CORRUPTION", createItem(Items.BOOK, "T3_RANDOM_CORRUPTION", "T3 Random Corruption"));
    map.put("T3_RANDOM_FIREBOLT", createItem(Items.BOOK, "T3_RANDOM_FIREBOLT", "T3 Random Firebolt"));
    map.put("T3_RANDOM_FLASH_HEAL", createItem(Items.BOOK, "T3_RANDOM_FLASH_HEAL", "T3 Random Flash Heal"));
    map.put("T3_RANDOM_FROSTBOLT", createItem(Items.BOOK, "T3_RANDOM_FROSTBOLT", "T3 Random Frostbolt"));
    map.put("T3_RANDOM_LIFE_DRAIN", createItem(Items.BOOK, "T3_RANDOM_LIFE_DRAIN", "T3 Random Life Drain"));
    map.put("T3_RANDOM_PRESSURE_WAVE", createItem(Items.BOOK, "T3_RANDOM_PRESSURE_WAVE", "T3 Random Pressure Wave"));
    map.put("T3_RANDOM_REGENERATION", createItem(Items.BOOK, "T3_RANDOM_REGENERATION", "T3 Random Regeneration"));
    map.put("T3_RANDOM_RING_OF_MERCY", createItem(Items.BOOK, "T3_RANDOM_RING_OF_MERCY", "T3 Random Ring Of Mercy"));
    map.put("T4_RANDOM_BATTLETOTEM", createItem(Items.WEEPING_VINES, "T4_RANDOM_BATTLETOTEM", "T4 Random Battletotem"));
    map.put("T4_RANDOM_COLLAPSING_EARTH",
        createItem(Items.BOOK, "T4_RANDOM_COLLAPSING_EARTH", "T4 Random Collapsing Earth"));
    map.put("T4_RANDOM_CORRUPTION", createItem(Items.BOOK, "T4_RANDOM_CORRUPTION", "T4 Random Corruption"));
    map.put("T4_RANDOM_FIREBOLT", createItem(Items.BOOK, "T4_RANDOM_FIREBOLT", "T4 Random Firebolt"));
    map.put("T4_RANDOM_FLASH_HEAL", createItem(Items.BOOK, "T4_RANDOM_FLASH_HEAL", "T4 Random Flash Heal"));
    map.put("T4_RANDOM_FROSTBOLT", createItem(Items.BOOK, "T4_RANDOM_FROSTBOLT", "T4 Random Frostbolt"));
    map.put("T4_RANDOM_LIFE_DRAIN", createItem(Items.BOOK, "T4_RANDOM_LIFE_DRAIN", "T4 Random Life Drain"));
    map.put("T4_RANDOM_PRESSURE_WAVE", createItem(Items.BOOK, "T4_RANDOM_PRESSURE_WAVE", "T4 Random Pressure Wave"));
    map.put("T4_RANDOM_REGENERATION", createItem(Items.BOOK, "T4_RANDOM_REGENERATION", "T4 Random Regeneration"));
    map.put("T4_RANDOM_RING_OF_MERCY", createItem(Items.BOOK, "T4_RANDOM_RING_OF_MERCY", "T4 Random Ring Of Mercy"));
    map.put("T5_RANDOM_COLLAPSING_EARTH",
        createItem(Items.BOOK, "T5_RANDOM_COLLAPSING_EARTH", "T5 Random Collapsing Earth"));
    map.put("T5_RANDOM_CORRUPTION", createItem(Items.BOOK, "T5_RANDOM_CORRUPTION", "T5 Random Corruption"));
    map.put("T5_RANDOM_FIREBOLT", createItem(Items.BOOK, "T5_RANDOM_FIREBOLT", "T5 Random Firebolt"));
    map.put("T5_RANDOM_FLASH_HEAL", createItem(Items.BOOK, "T5_RANDOM_FLASH_HEAL", "T5 Random Flash Heal"));
    map.put("T5_RANDOM_FROSTBOLT", createItem(Items.BOOK, "T5_RANDOM_FROSTBOLT", "T5 Random Frostbolt"));
    map.put("T5_RANDOM_IMPLEMENT", createItem(Items.BREWING_STAND, "T5_RANDOM_IMPLEMENT", "T5 Random Implement"));
    map.put("T5_RANDOM_LIFE_DRAIN", createItem(Items.BOOK, "T5_RANDOM_LIFE_DRAIN", "T5 Random Life Drain"));
    map.put("T5_RANDOM_PRESSURE_WAVE", createItem(Items.BOOK, "T5_RANDOM_PRESSURE_WAVE", "T5 Random Pressure Wave"));
    map.put("T5_RANDOM_REGENERATION", createItem(Items.BOOK, "T5_RANDOM_REGENERATION", "T5 Random Regeneration"));
    map.put("T5_RANDOM_RING_OF_MERCY", createItem(Items.BOOK, "T5_RANDOM_RING_OF_MERCY", "T5 Random Ring Of Mercy"));
    map.put("T5_RANDOM_SPELLFOCUS", createItem(Items.BLAZE_POWDER, "T5_RANDOM_SPELLFOCUS", "T5 Random Spellfocus"));
    map.put("T6_RANDOM_COLLAPSING_EARTH",
        createItem(Items.BOOK, "T6_RANDOM_COLLAPSING_EARTH", "T6 Random Collapsing Earth"));
    map.put("T6_RANDOM_CORRUPTION", createItem(Items.BOOK, "T6_RANDOM_CORRUPTION", "T6 Random Corruption"));
    map.put("T6_RANDOM_FIREBOLT", createItem(Items.BOOK, "T6_RANDOM_FIREBOLT", "T6 Random Firebolt"));
    map.put("T6_RANDOM_FLASH_HEAL", createItem(Items.BOOK, "T6_RANDOM_FLASH_HEAL", "T6 Random Flash Heal"));
    map.put("T6_RANDOM_FROSTBOLT", createItem(Items.BOOK, "T6_RANDOM_FROSTBOLT", "T6 Random Frostbolt"));
    map.put("T6_RANDOM_LIFE_DRAIN", createItem(Items.BOOK, "T6_RANDOM_LIFE_DRAIN", "T6 Random Life Drain"));
    map.put("T6_RANDOM_PRESSURE_WAVE", createItem(Items.BOOK, "T6_RANDOM_PRESSURE_WAVE", "T6 Random Pressure Wave"));
    map.put("T6_RANDOM_REGENERATION", createItem(Items.BOOK, "T6_RANDOM_REGENERATION", "T6 Random Regeneration"));
    map.put("T6_RANDOM_RING_OF_MERCY", createItem(Items.BOOK, "T6_RANDOM_RING_OF_MERCY", "T6 Random Ring Of Mercy"));
    map.put("TAINTED_METAL", createItem(Items.NETHERITE_INGOT, "TAINTED_METAL", "Tainted Metal"));
    map.put("TASTY_MELON_POP", createItem(Items.MELON_SLICE, "TASTY_MELON_POP", "Tasty Melon Pop"));
    map.put("TEA_BURNING", createItem(Items.POTION, "TEA_BURNING", "Tea Burning"));
    map.put("TEA_INVISIBLE", createItem(Items.POTION, "TEA_INVISIBLE", "Tea Invisible"));
    map.put("TEA_QUICKSTEP", createItem(Items.POTION, "TEA_QUICKSTEP", "Tea Quickstep"));
    map.put("TEA_STOMACH", createItem(Items.POTION, "TEA_STOMACH", "Tea Stomach"));
    map.put("TEA_STONESKIN", createItem(Items.POTION, "TEA_STONESKIN", "Tea Stoneskin"));
    map.put("TECHNICALLY_TURKEY", createItem(Items.COOKED_CHICKEN, "TECHNICALLY_TURKEY", "Technically Turkey"));
    map.put("THAUMATURG_BOOTS", createItem(Items.LEATHER_BOOTS, "THAUMATURG_BOOTS", "Thaumaturg Boots"));
    map.put("TOKEN_CHRISTMAS", createItem(Items.CLAY_BALL, "TOKEN_CHRISTMAS", "Token Christmas"));
    map.put("TOKEN_EASTER", createItem(Items.TURTLE_EGG, "TOKEN_EASTER", "Token Easter"));
    map.put("TOKEN_HALLOWEEN", createItem(Items.PUMPKIN, "TOKEN_HALLOWEEN", "Token Halloween"));
    map.put("TOKEN_HUNTER_OUTPOST_DESTROYED",
        createItem(Items.NETHER_BRICK, "TOKEN_HUNTER_OUTPOST_DESTROYED", "Token Hunter Outpost Destroyed"));
    map.put("TOKEN_HUNTER_PILLAGER",
        createItem(Items.NETHERITE_INGOT, "TOKEN_HUNTER_PILLAGER", "Token Hunter Pillager"));
    map.put("TOKEN_ORIGIN_DAILY", createItem(Items.END_CRYSTAL, "TOKEN_ORIGIN_DAILY", "Token Origin Daily"));
    map.put("TOME_COLLAPSING_EARTH_1", createItem(Items.BOOK, "TOME_COLLAPSING_EARTH_1", "Tome Collapsing Earth 1"));
    map.put("TOME_COLLAPSING_EARTH_2", createItem(Items.BOOK, "TOME_COLLAPSING_EARTH_2", "Tome Collapsing Earth 2"));
    map.put("TOME_COLLAPSING_EARTH_3", createItem(Items.BOOK, "TOME_COLLAPSING_EARTH_3", "Tome Collapsing Earth 3"));
    map.put("TOME_COLLAPSING_EARTH_4", createItem(Items.BOOK, "TOME_COLLAPSING_EARTH_4", "Tome Collapsing Earth 4"));
    map.put("TOME_COLLAPSING_EARTH_5", createItem(Items.BOOK, "TOME_COLLAPSING_EARTH_5", "Tome Collapsing Earth 5"));
    map.put("TOME_COLLAPSING_EARTH_6", createItem(Items.BOOK, "TOME_COLLAPSING_EARTH_6", "Tome Collapsing Earth 6"));
    map.put("TOME_CORRUPTION_1", createItem(Items.BOOK, "TOME_CORRUPTION_1", "Tome Corruption 1"));
    map.put("TOME_CORRUPTION_2", createItem(Items.BOOK, "TOME_CORRUPTION_2", "Tome Corruption 2"));
    map.put("TOME_CORRUPTION_3", createItem(Items.BOOK, "TOME_CORRUPTION_3", "Tome Corruption 3"));
    map.put("TOME_CORRUPTION_4", createItem(Items.BOOK, "TOME_CORRUPTION_4", "Tome Corruption 4"));
    map.put("TOME_CORRUPTION_5", createItem(Items.BOOK, "TOME_CORRUPTION_5", "Tome Corruption 5"));
    map.put("TOME_CORRUPTION_6", createItem(Items.BOOK, "TOME_CORRUPTION_6", "Tome Corruption 6"));
    map.put("TOME_FIREBOLT_1", createItem(Items.BOOK, "TOME_FIREBOLT_1", "Tome Firebolt 1"));
    map.put("TOME_FIREBOLT_2", createItem(Items.BOOK, "TOME_FIREBOLT_2", "Tome Firebolt 2"));
    map.put("TOME_FIREBOLT_3", createItem(Items.BOOK, "TOME_FIREBOLT_3", "Tome Firebolt 3"));
    map.put("TOME_FIREBOLT_4", createItem(Items.BOOK, "TOME_FIREBOLT_4", "Tome Firebolt 4"));
    map.put("TOME_FIREBOLT_5", createItem(Items.BOOK, "TOME_FIREBOLT_5", "Tome Firebolt 5"));
    map.put("TOME_FIREBOLT_6", createItem(Items.BOOK, "TOME_FIREBOLT_6", "Tome Firebolt 6"));
    map.put("TOME_FLASH_HEAL_1", createItem(Items.BOOK, "TOME_FLASH_HEAL_1", "Tome Flash Heal 1"));
    map.put("TOME_FLASH_HEAL_2", createItem(Items.BOOK, "TOME_FLASH_HEAL_2", "Tome Flash Heal 2"));
    map.put("TOME_FLASH_HEAL_3", createItem(Items.BOOK, "TOME_FLASH_HEAL_3", "Tome Flash Heal 3"));
    map.put("TOME_FLASH_HEAL_4", createItem(Items.BOOK, "TOME_FLASH_HEAL_4", "Tome Flash Heal 4"));
    map.put("TOME_FLASH_HEAL_5", createItem(Items.BOOK, "TOME_FLASH_HEAL_5", "Tome Flash Heal 5"));
    map.put("TOME_FLASH_HEAL_6", createItem(Items.BOOK, "TOME_FLASH_HEAL_6", "Tome Flash Heal 6"));
    map.put("TOME_FROSTBOLT_1", createItem(Items.BOOK, "TOME_FROSTBOLT_1", "Tome Frostbolt 1"));
    map.put("TOME_FROSTBOLT_2", createItem(Items.BOOK, "TOME_FROSTBOLT_2", "Tome Frostbolt 2"));
    map.put("TOME_FROSTBOLT_3", createItem(Items.BOOK, "TOME_FROSTBOLT_3", "Tome Frostbolt 3"));
    map.put("TOME_FROSTBOLT_4", createItem(Items.BOOK, "TOME_FROSTBOLT_4", "Tome Frostbolt 4"));
    map.put("TOME_FROSTBOLT_5", createItem(Items.BOOK, "TOME_FROSTBOLT_5", "Tome Frostbolt 5"));
    map.put("TOME_FROSTBOLT_6", createItem(Items.BOOK, "TOME_FROSTBOLT_6", "Tome Frostbolt 6"));
    map.put("TOME_LIFE_DRAIN_1", createItem(Items.BOOK, "TOME_LIFE_DRAIN_1", "Tome Life Drain 1"));
    map.put("TOME_LIFE_DRAIN_2", createItem(Items.BOOK, "TOME_LIFE_DRAIN_2", "Tome Life Drain 2"));
    map.put("TOME_LIFE_DRAIN_3", createItem(Items.BOOK, "TOME_LIFE_DRAIN_3", "Tome Life Drain 3"));
    map.put("TOME_LIFE_DRAIN_4", createItem(Items.BOOK, "TOME_LIFE_DRAIN_4", "Tome Life Drain 4"));
    map.put("TOME_LIFE_DRAIN_5", createItem(Items.BOOK, "TOME_LIFE_DRAIN_5", "Tome Life Drain 5"));
    map.put("TOME_LIFE_DRAIN_6", createItem(Items.BOOK, "TOME_LIFE_DRAIN_6", "Tome Life Drain 6"));
    map.put("TOME_PRESSURE_WAVE_1", createItem(Items.BOOK, "TOME_PRESSURE_WAVE_1", "Tome Pressure Wave 1"));
    map.put("TOME_PRESSURE_WAVE_2", createItem(Items.BOOK, "TOME_PRESSURE_WAVE_2", "Tome Pressure Wave 2"));
    map.put("TOME_PRESSURE_WAVE_3", createItem(Items.BOOK, "TOME_PRESSURE_WAVE_3", "Tome Pressure Wave 3"));
    map.put("TOME_PRESSURE_WAVE_4", createItem(Items.BOOK, "TOME_PRESSURE_WAVE_4", "Tome Pressure Wave 4"));
    map.put("TOME_PRESSURE_WAVE_5", createItem(Items.BOOK, "TOME_PRESSURE_WAVE_5", "Tome Pressure Wave 5"));
    map.put("TOME_PRESSURE_WAVE_6", createItem(Items.BOOK, "TOME_PRESSURE_WAVE_6", "Tome Pressure Wave 6"));
    map.put("TOME_REGENERATION_1", createItem(Items.BOOK, "TOME_REGENERATION_1", "Tome Regeneration 1"));
    map.put("TOME_REGENERATION_2", createItem(Items.BOOK, "TOME_REGENERATION_2", "Tome Regeneration 2"));
    map.put("TOME_REGENERATION_3", createItem(Items.BOOK, "TOME_REGENERATION_3", "Tome Regeneration 3"));
    map.put("TOME_REGENERATION_4", createItem(Items.BOOK, "TOME_REGENERATION_4", "Tome Regeneration 4"));
    map.put("TOME_REGENERATION_5", createItem(Items.BOOK, "TOME_REGENERATION_5", "Tome Regeneration 5"));
    map.put("TOME_REGENERATION_6", createItem(Items.BOOK, "TOME_REGENERATION_6", "Tome Regeneration 6"));
    map.put("TOME_RING_OF_MERCY_1", createItem(Items.BOOK, "TOME_RING_OF_MERCY_1", "Tome Ring Of Mercy 1"));
    map.put("TOME_RING_OF_MERCY_2", createItem(Items.BOOK, "TOME_RING_OF_MERCY_2", "Tome Ring Of Mercy 2"));
    map.put("TOME_RING_OF_MERCY_3", createItem(Items.BOOK, "TOME_RING_OF_MERCY_3", "Tome Ring Of Mercy 3"));
    map.put("TOME_RING_OF_MERCY_4", createItem(Items.BOOK, "TOME_RING_OF_MERCY_4", "Tome Ring Of Mercy 4"));
    map.put("TOME_RING_OF_MERCY_5", createItem(Items.BOOK, "TOME_RING_OF_MERCY_5", "Tome Ring Of Mercy 5"));
    map.put("TOME_RING_OF_MERCY_6", createItem(Items.BOOK, "TOME_RING_OF_MERCY_6", "Tome Ring Of Mercy 6"));
    map.put("TORCH_EVERBURNING", createItem(Items.SOUL_TORCH, "TORCH_EVERBURNING", "Torch Everburning"));
    map.put("TOTEM_BLOODSNOUT", createItem(Items.WEEPING_VINES, "TOTEM_BLOODSNOUT", "Totem Bloodsnout"));
    map.put("TOTEM_CACTUS", createItem(Items.SEA_PICKLE, "TOTEM_CACTUS", "Totem Cactus"));
    map.put("TOTEM_KROGNARS", createItem(Items.CLOCK, "TOTEM_KROGNARS", "Totem Krognars"));
    map.put("TOTEM_MONTU", createItem(Items.BREWING_STAND, "TOTEM_MONTU", "Totem Montu"));
    map.put("TOTEM_STONE", createItem(Items.CHISELED_DEEPSLATE, "TOTEM_STONE", "Totem Stone"));
    map.put("TOTEM_UNSETTLING", createItem(Items.SKELETON_SKULL, "TOTEM_UNSETTLING", "Totem Unsettling"));
    map.put("TOUGH_ROOTS", createItem(Items.HANGING_ROOTS, "TOUGH_ROOTS", "Tough Roots"));
    map.put("TOWN_BLOCK", createItem(Items.PAPER, "TOWN_BLOCK", "Town Block"));
    map.put("TURBO_ENCABULATOR", createItem(Items.COMMAND_BLOCK, "TURBO_ENCABULATOR", "Turbo Encabulator"));
    map.put("UNCANNY_CUBE", createItem(Items.CONDUIT, "UNCANNY_CUBE", "Uncanny Cube"));
    map.put("UNSETTLING_BLADE", createItem(Items.IRON_SWORD, "UNSETTLING_BLADE", "Unsettling Blade"));
    map.put("UNSETTLING_BOW", createItem(Items.BOW, "UNSETTLING_BOW", "Unsettling Bow"));
    map.put("UNSETTLING_FISHINGPOLE",
        createItem(Items.FISHING_ROD, "UNSETTLING_FISHINGPOLE", "Unsettling Fishingpole"));
    map.put("UNSETTLING_MACE", createItem(Items.BONE, "UNSETTLING_MACE", "Unsettling Mace"));
    map.put("WARSCROLL_BLACK_HOLE", createItem(Items.PAPER, "WARSCROLL_BLACK_HOLE", "Warscroll Black Hole"));
    map.put("WARSCROLL_DIVINE_INTERVENTION",
        createItem(Items.PAPER, "WARSCROLL_DIVINE_INTERVENTION", "Warscroll Divine Intervention"));
    map.put("WARSCROLL_EXPLODING_FOWL",
        createItem(Items.PAPER, "WARSCROLL_EXPLODING_FOWL", "Warscroll Exploding Fowl"));
    map.put("WARSCROLL_METEOR", createItem(Items.PAPER, "WARSCROLL_METEOR", "Warscroll Meteor"));
    map.put("WARSCROLL_OVERLOAD", createItem(Items.PAPER, "WARSCROLL_OVERLOAD", "Warscroll Overload"));
    map.put("WAR_BOND", createItem(Items.PAPER, "WAR_BOND", "War Bond"));
    map.put("WAR_SUPPLIES", createItem(Items.BARREL, "WAR_SUPPLIES", "War Supplies"));
    map.put("WEAPON_POMMEL", createItem(Items.TRIPWIRE_HOOK, "WEAPON_POMMEL", "Weapon Pommel"));
    map.put("WELL_SEASONED_BEEF", createItem(Items.COOKED_BEEF, "WELL_SEASONED_BEEF", "Well Seasoned Beef"));
    map.put("WELL_SEASONED_CHICKEN",
        createItem(Items.COOKED_CHICKEN, "WELL_SEASONED_CHICKEN", "Well Seasoned Chicken"));
    map.put("WELL_SEASONED_COD", createItem(Items.COOKED_COD, "WELL_SEASONED_COD", "Well Seasoned Cod"));
    map.put("WELL_SEASONED_MUTTON", createItem(Items.COOKED_MUTTON, "WELL_SEASONED_MUTTON", "Well Seasoned Mutton"));
    map.put("WELL_SEASONED_PORKCHOP",
        createItem(Items.COOKED_PORKCHOP, "WELL_SEASONED_PORKCHOP", "Well Seasoned Porkchop"));
    map.put("WELL_SEASONED_PUFFERFISH",
        createItem(Items.PUFFERFISH, "WELL_SEASONED_PUFFERFISH", "Well Seasoned Pufferfish"));
    map.put("WELL_SEASONED_RABBIT", createItem(Items.COOKED_RABBIT, "WELL_SEASONED_RABBIT", "Well Seasoned Rabbit"));
    map.put("WELL_SEASONED_SALMON", createItem(Items.COOKED_SALMON, "WELL_SEASONED_SALMON", "Well Seasoned Salmon"));
    map.put("WELL_SEASONED_TROPICAL_FISH",
        createItem(Items.TROPICAL_FISH, "WELL_SEASONED_TROPICAL_FISH", "Well Seasoned Tropical Fish"));
    map.put("WHIPPING_WIND", createItem(Items.BONE_MEAL, "WHIPPING_WIND", "Whipping Wind"));
    map.put("WHOLE_WART", createItem(Items.RED_DYE, "WHOLE_WART", "Whole Wart"));
    map.put("WHOLE_WART_BREAD", createItem(Items.BREAD, "WHOLE_WART_BREAD", "Whole Wart Bread"));
    map.put("WIZARDS_BOOTS", createItem(Items.LEATHER_BOOTS, "WIZARDS_BOOTS", "Wizards Boots"));
    map.put("WIZARDS_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "WIZARDS_CHESTPLATE", "Wizards Chestplate"));
    map.put("WIZARDS_HELMET", createItem(Items.LEATHER_HELMET, "WIZARDS_HELMET", "Wizards Helmet"));
    map.put("WIZARDS_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "WIZARDS_LEGGINGS", "Wizards Leggings"));
    map.put("WOODEN_AXE", createItem(Items.WOODEN_AXE, "WOODEN_AXE", "Wooden Axe"));
    map.put("WOODEN_BOOTS", createItem(Items.LEATHER_BOOTS, "WOODEN_BOOTS", "Wooden Boots"));
    map.put("WOODEN_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "WOODEN_CHESTPLATE", "Wooden Chestplate"));
    map.put("WOODEN_HELMET", createItem(Items.LEATHER_HELMET, "WOODEN_HELMET", "Wooden Helmet"));
    map.put("WOODEN_HOE", createItem(Items.WOODEN_HOE, "WOODEN_HOE", "Wooden Hoe"));
    map.put("WOODEN_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "WOODEN_LEGGINGS", "Wooden Leggings"));
    map.put("WOODEN_MACE", createItem(Items.STICK, "WOODEN_MACE", "Wooden Mace"));
    map.put("WOODEN_PICKAXE", createItem(Items.STONE_PICKAXE, "WOODEN_PICKAXE", "Wooden Pickaxe"));
    map.put("WOODEN_SHIELD", createItem(Items.DEAD_BUSH, "WOODEN_SHIELD", "Wooden Shield"));
    map.put("WOODEN_SHOVEL", createItem(Items.WOODEN_SHOVEL, "WOODEN_SHOVEL", "Wooden Shovel"));
    map.put("WOOL_BOOTS", createItem(Items.LEATHER_BOOTS, "WOOL_BOOTS", "Wool Boots"));
    map.put("WOOL_CHESTPLATE", createItem(Items.LEATHER_CHESTPLATE, "WOOL_CHESTPLATE", "Wool Chestplate"));
    map.put("WOOL_HELMET", createItem(Items.LEATHER_HELMET, "WOOL_HELMET", "Wool Helmet"));
    map.put("WOOL_LEGGINGS", createItem(Items.LEATHER_LEGGINGS, "WOOL_LEGGINGS", "Wool Leggings"));
    map.put("ZOMBIE_LEATHER", createItem(Items.LEATHER, "ZOMBIE_LEATHER", "Zombie Leather"));
    ITEMS = Map.copyOf(map);
  }

  public EmiStack item(String key) {
    return ITEMS.get(key);
  }

  // public static final EmiStack GOLD_COIN = EmiStack.of(new
  // ItemStack(Items.GOLD_NUGGET).setCustomName(Text.of("Gold Coin")));
  public void addItems(EmiRegistry registry) {
    ITEMS.forEach((k, v) -> {
      registry.addEmiStack(v);
    });
  }
}
