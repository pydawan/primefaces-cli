package br.org.primefaces.cli;

import static org.fusesource.jansi.Ansi.ansi;
import static org.fusesource.jansi.Ansi.Color.*;

/**
 * @author thiago-amm
 * @version v1.0.0 14/08/2017
 * @since v1.0.0
 */
public class PrimeFacesCLI {
   
   private static String version = "v1.0.0";
   
   public static void main(String[] args) {
      
   }
   
   public static void showLogo() {
      ansi().eraseScreen();
      System.out.println(ansi().bg(BLACK));
      System.out.println(ansi().bold());
      
      System.out.print(ansi().fg(BLUE) + "      _____      _                ______                 ");
      System.out.println(ansi().fg(RED) + "      _____ _      _____           ");
      
      System.out.print(ansi().fg(BLUE) + "     |  __ \\    (_)              |  ____|                ");
      System.out.println(ansi().fg(RED) + "     / ____| |    |_   _|          ");
      
      System.out.print(ansi().fg(BLUE) + "     | |__) _ __ _ _ __ ___   ___| |__ __ _  ___ ___ ___ ");
      System.out.println(ansi().fg(RED) + "    | |    | |      | |            ");
      
      System.out.print(ansi().fg(BLUE) + "     |  ___| '__| | '_ ` _ \\ / _ |  __/ _` |/ __/ _ / __|");
      System.out.println(ansi().fg(RED) + "    | |    | |      | |            ");
      
      System.out.print(ansi().fg(BLUE) + "     | |   | |  | | | | | | |  __| | | (_| | (_|  __\\__ \\");
      System.out.println(ansi().fg(RED) + "    | |____| |____ _| |_           ");
      
      System.out.print(ansi().fg(BLUE) + "     |_|   |_|  |_|_| |_| |_|\\___|_|  \\__,_|\\___\\___|___/");
      System.out.println(ansi().fg(RED) + "     \\_____|______|_____|          ");
      
      System.out.print(ansi().fg(BLUE) + "                                                         ");
      System.out.println(ansi().fg(RED) + "                                   ");
      
      System.out.print(ansi().fg(BLUE) + "                                                         ");
      System.out.println(ansi().fg(RED) + "                                   ");
      
      System.out.print(ansi().fg(WHITE) + "     Versão: " + ansi().boldOff() + version);
      System.out.println("                                                                         ");
      System.out.println(ansi().reset());
      
   }
   
}
