package net.elitesource.lolstats;

import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.elitesource.lolstats.champion.Champion;
import net.elitesource.lolstats.champion.ChampionList;

public class Start
{

	public static void main(String[] args)
	{
		Field[] fields = ChampionList.class.getDeclaredFields();
		ArrayList<Champion> champions = new ArrayList<Champion>();
		for (int i = 0; i < fields.length; i++)
		{
			if (fields[i].getType() == Champion.class)
			{
				try
				{
					Champion c = (Champion) fields[i].get(fields[i].getName());
					champions.add(c);
				} catch (IllegalArgumentException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			try
			{
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("champions.list")));
				oos.writeObject(champions);
				oos.close();
			} catch (Exception e)
			{

			}

		}

	}

}
