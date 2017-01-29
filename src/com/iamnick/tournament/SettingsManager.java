package com.iamnick.tournament;

import java.io.*;

public class SettingsManager {

	String OAUTH = null;
	String Channel = null;
	String Account = null;





	public void loadChatBotSettings(){
		try {
			BufferedReader loader = new BufferedReader(new FileReader("timertchatsettings.txt"));
			try {
				Channel = (loader.readLine());
				Account = (loader.readLine());
				OAUTH  = (loader.readLine());
				loader.close();
			} catch (IOException e) {
				//if there is an error in reading the line
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			//nothing to load lets make a baby
			//e.printStackTrace();
			System.out.println("Twitch file not found.\nCreating File...");
			try{
				PrintWriter writer = new PrintWriter("timertchatsettings.txt", "UTF-8");
				writer.println("#channel");
				writer.println("account");
				writer.println("oauth:blahsomelettersandnumbers");
				writer.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
		}


	}

	public String getOAUTH() {
		return OAUTH;
	}

	public String getChannel() {
		return Channel;
	}

	public String getAccount() {
		return Account;
	}
}
