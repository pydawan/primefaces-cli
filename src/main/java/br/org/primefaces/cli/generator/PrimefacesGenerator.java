package br.org.primefaces.cli.generator;

import static br.org.jext.StringUtil.capitalize;

/**
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public class PrimefacesGenerator {
   
   public static void generateModel(String _package, String name) {
      _package = _package == null ? "" : _package.trim();
      name = name == null ? "" : name.trim();
      
      if (!name.isEmpty()) {
         System.out.println(capitalize(name));
         if (_package.isEmpty()) {
            
         } else {
            
         }
      } else {
         throw new IllegalArgumentException("ATENÇÃO: O nome do modelo a ser gerado é um parâmetro obrigatório!");
      }
   }
   
   public static void generateModel(String name) {
      generateModel(null, name);
   }
   
}
