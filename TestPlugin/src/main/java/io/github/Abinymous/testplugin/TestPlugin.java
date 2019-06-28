package io.github.Abinymous.testplugin;

import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin
{
    @Override
    public void onEnable()
    {
    	getLogger().info("onEnable has been invoked!");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("hi"))
    	{
    	    if (args.length > 0)
    	    {
    	        sender.sendMessage("This command needs no arguments!");
    	        return false;
    	    } 
    	    
    		if (!(sender instanceof Player))
    		{
    			sender.sendMessage("This command can only be run by a player.");
    			return false;
    		}
    		else
    		{
    			Player player = (Player) sender;
    			player.sendMessage("Hello!");
    			return true;
    		}
    	}
    	return false; 
    }
    
    @Override
    public void onDisable()
    {
    	getLogger().info("onDisable has been invoked!");
    }
}
