package com.iamnick.tournament;

import java.io.BufferedWriter;


public class Commands {

	public static void execute(String[] message, BufferedWriter writer) throws Exception {
		if (message[3].equals("Gosh, that Italian family at the next table sure is quiet")){
			if(message[1].equalsIgnoreCase("mikto1000") || message[1].equalsIgnoreCase("1amnick")){
				Chatter.chat("SeemsGood Kappa");
			}else{
				Chatter.chat("Your win chance have been improved by -40%! Your chance of winning is now 10%");
			}
		}

	}
}