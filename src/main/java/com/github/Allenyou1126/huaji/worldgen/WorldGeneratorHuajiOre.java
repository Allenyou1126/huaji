package com.github.Allenyou1126.huaji.worldgen;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

import java.util.Random;

import com.github.Allenyou1126.huaji.block.BlockLoader;

public class WorldGeneratorHuajiOre extends WorldGenerator{
	private final WorldGenerator glowstoneGenerator = new WorldGenMinable(BlockLoader.huajiOre.getDefaultState(), 16);

    @Override
    public boolean generate(World world, Random rand, BlockPos pos){
        if (TerrainGen.generateOre(world, rand, this, pos, OreGenEvent.GenerateMinable.EventType.CUSTOM)){
            for (int i = 0; i < 4; ++i){
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 16 + rand.nextInt(16);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                BiomeGenBase biomeGenBase = world.getBiomeGenForCoords(blockpos);
            }
        }
        return true;
    }
}