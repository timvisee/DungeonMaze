package com.timvisee.DungeonMaze.event.generation;

import java.util.List;
import java.util.Random;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.inventory.ItemStack;

import com.timvisee.DungeonMaze.event.EventHandler.DMEventHandler;

public class DMGenerationChestEvent extends DMEventHandler {
	
	private Block b;
	private Random random;
	private List<ItemStack> is;
	private boolean addContentsInOrder = false;
	
	public DMGenerationChestEvent(Block b, Random random, List<ItemStack> is) {
		this.b = b;
		this.is = is;
		this.random = random;
	}
	
	/**
	 * Get the block location where the chest will be created
	 * @return the chest location as a block
	 */
	public Block getBlock() {
		return this.b;
	}
	
	/**
	 * Get the world the chest will be created in
	 * @return the world
	 */
	public World getWorld() {
		return this.b.getWorld();
	}
	
	/**
	 * Get the contents wich will be added into the chest
	 * @return chest contents
	 */
	public List<ItemStack> getContents() {
		return this.is;
	}
	
	/**
	 * Set the contents of the chest
	 * @param is ItemStack list
	 */
	public void setContents(List<ItemStack> is) {
		if(is != null)
			this.is = is;
	}
		
	/**
	 * Get the random object from the generator, to get the ability to add support for seeds in your listener
	 * @return Random
	 */
	public Random getRandom() {
		return this.random;
	}
	
	/**
	 * Will the chest contents be placed in order into the chest, or will they be placed randomly
	 * @return true if placed in order
	 */
	public boolean getAddContentsInOrder() {
		return this.addContentsInOrder;
	}
	
	/**
	 * Set if the chests contents should be added in order, or if they should be added randomly
	 * @param addInOrder true if they should be added in order
	 */
	public void setAddContentsInOrder(boolean addInOrder) {
		this.addContentsInOrder = addInOrder;
	}
}
