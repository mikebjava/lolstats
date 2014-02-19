package net.elitesource.lolstats.item;
import java.io.Serializable;
import java.util.HashMap;
public class Item implements Serializable {
	private static final long serialVersionUID = -7429257977594274208L;
	private HashMap<ItemType, Float> itemStats;
	public Item(HashMap<ItemType, Float> itemStats) {
		
	}
	public HashMap<ItemType, Float> getItemStats() {
		return itemStats;
	}
	public void setItemStats(HashMap<ItemType, Float> itemStats) {
		this.itemStats = itemStats;
	}
}
