package br.org.primefaces.cli;

import org.junit.Test;

import br.org.primefaces.cli.PrimeFacesCLI;
import br.org.primefaces.cli.generator.PrimeFacesGenerator;

public class PrimeFacesCLITest {
   
   @Test
   public void test() {
      PrimeFacesCLI.showLogo();
      PrimeFacesGenerator.generateModel("pessoa");
   }
   
}
