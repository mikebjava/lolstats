package net.elitesource.lolstats.item;

import java.io.Serializable;
import java.util.HashMap;

import net.elitesource.lolstats.champion.ChampionInstance;

public class Item implements Serializable
{
	private static final long serialVersionUID = -7429257977594274208L;
	private HashMap<StatType, Float> itemStats;

	public Item(HashMap<StatType, Float> itemStats)
	{
		this.itemStats = itemStats;
	}

	public void equip(ChampionInstance c)
	{
		// TODO Equip()
	}

	public void unequip(ChampionInstance c)
	{
		// TODO Unequip()
	}

	public HashMap<StatType, Float> getItemStats()
	{
		return itemStats;
	}

	public void setItemStats(HashMap<StatType, Float> itemStats)
	{
		this.itemStats = itemStats;
	}
}
