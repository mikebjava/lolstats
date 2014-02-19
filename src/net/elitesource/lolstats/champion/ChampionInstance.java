package net.elitesource.lolstats.champion;

import net.elitesource.lolstats.item.Item;

public class ChampionInstance
{

	private Champion c;
	private Item[] inventory;

	public ChampionInstance(Champion c, Item[] inventory)
	{
		super();
		this.c = c;
		this.inventory = inventory;
	}

	/**
	 * @return the c
	 */
	public Champion getChampion()
	{
		return c;
	}

	/**
	 * @param c
	 *            the c to set
	 */
	public void setChampion(Champion c)
	{
		this.c = c;
	}

	/**
	 * @return the inventory
	 */
	public Item[] getInventory()
	{
		return inventory;
	}

	/**
	 * @param inventory
	 *            the inventory to set
	 */
	public void setInventory(Item[] inventory)
	{
		this.inventory = inventory;
	}

}
