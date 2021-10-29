package me.Thom.hello;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() { //Metoda po zapnutí serveru / konzole
		Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&2&lPlugin HelloWorld byl aktivovan!")); //Při zapnutí serveru napíše do konzole "Plugin HelloWorld byl aktivovan!"
		getCommand("hello").setExecutor(this); //Registruje příkaz /hello
	}
	
	public void onDisable() { //Metoda po vypnutí serveru / konzole
		Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&2&lPlugin HelloWorld byl vypnut!")); //Při vypnutí serveru napíše do konzole "Plugin HelloWorld byl vypnut!"
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) { //Metoda onCommand(), aktivuje se, když hráč napíše "/" do chatu
		
		if (sender instanceof Player) { //Zkontroluje, zda je sender hráč 
			Player p = (Player) sender; //Hráč sender uložen v proměnné "p"
			
			if (cmd.getName().equalsIgnoreCase("hello")) { //Když hráč napíše /hello
				
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2Ahoj hraci " + ChatColor.YELLOW + p.getName())); //Pošle hráči zprávu "Ahoj hraci <hrac>"
				
			}
			
			
		} else sender.sendMessage(ChatColor.RED + "Toto muze jen hrac!"); //Když není sender hráč pošle se senderovi zpráva "Toto muze jen hrac!"
		
		return false; //Musí být u každé boolean metody - zajištuje, aby metoda onCommand() nic nevracela 
	}
	
}
