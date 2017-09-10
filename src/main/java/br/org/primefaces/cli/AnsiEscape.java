package br.org.primefaces.cli;

import static org.fusesource.jansi.Ansi.ansi;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

/**
 * É responsável por imprimir sequências de escape ANSI
 * na saída padrão.
 * 
 * @author thiago-amm
 * @version v1.0.0 14/08/2017
 * @since v1.0.0
 */
public final class AnsiEscape {
   
   public static void install() {
      System.setProperty("jansi.passthrough", "true");
      AnsiConsole.systemInstall();
   }
   
   public static void uninstall() {
      AnsiConsole.systemUninstall();
   }
   
   public static Ansi render(String text) {
      return ansi().render(text);
   }
   
   public static Ansi render(String formatador, Object... argumentos) {
      return ansi().render(String.format(formatador, argumentos));
   }
   
}