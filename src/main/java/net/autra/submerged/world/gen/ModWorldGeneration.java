package net.autra.submerged.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGeneration(){
        ModGeodeGeneration.generateGeodes();
        ModOreGeneration.generateOres();
    }
}