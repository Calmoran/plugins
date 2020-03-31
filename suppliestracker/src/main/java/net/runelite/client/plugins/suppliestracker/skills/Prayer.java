package net.runelite.client.plugins.suppliestracker.skills;

import javax.inject.Singleton;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.suppliestracker.SuppliesTrackerPlugin;

@Singleton
public class Prayer
{
	private final SuppliesTrackerPlugin plugin;
	private final ItemManager itemManager;
	private int bonesId = 0;

	public Prayer(SuppliesTrackerPlugin plugin, ItemManager itemManager)
	{
		this.plugin = plugin;
		this.itemManager = itemManager;
	}

	public void OnChat(String message)
	{
		String name = itemManager.getItemDefinition(bonesId).getName().toLowerCase();

		if (bonesId <= 0 || !name.contains("bones"))
		{
			return;
		}
		if (message.toLowerCase().contains("you bury the bones"))
		{
			plugin.buildEntries(bonesId);
		}
	}

	public void build()
	{
		plugin.buildEntries(bonesId);
	}

	public void setBonesId(int bonesId)
	{
		this.bonesId = bonesId;
	}
}
