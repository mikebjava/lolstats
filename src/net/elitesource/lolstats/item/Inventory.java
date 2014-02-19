package net.elitesource.lolstats.item;

public class Inventory
{

	private Item[] items;

	public Inventory()
	{
		this.items = new Item[6];
	}

	public boolean contains(Item item)
	{
		for (int i = 0; i < items.length; i++)
		{
			if (items[i].equals(item))
			{
				return true;
			} else
			{
				continue;
			}
		}
		return false;
	}

	public Item[] getItems()
	{
		return this.items;
	}

	public void setItemAt(Item item, int index)
	{
		this.items[index] = item;
		return;
	}

	public boolean isFull()
	{
		for (int i = 0; i < items.length; i++)
		{
			if (items[i] == null || items[i] == ItemList.emptyInstance)
			{
				return false;
			} else
			{
				continue;
			}
		}
		return true;
	}
}
