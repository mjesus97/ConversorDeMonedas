import Exceptions.ErrorMonedaSeleccionadaException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InteraccionconUsuario {
    public List eleccionUsuario() {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> listamonedas = new ArrayList<>();

        System.out.println("****************************\n");
        System.out.println("De que moneda quieres convertir:\n" +
                "1. Peso Argentino [ARS]\n" +
                "2. Real Brasileño [BRL]\n" +
                "3. Peso Chileno [CLP]\n" +
                "4. Peso Colombiano [COP]\n" +
                "5. Dolar Estadounidense [USD]");
        String monedainicial = teclado.next();
        listamonedas.add(moneda(monedainicial));

        System.out.println("****************************\n");
        System.out.println("A que moneda quieres convertir:\n" +
                "1. Peso Argentino [ARS]\n" +
                "2. Real Brasileño [BRL]\n" +
                "3. Peso Chileno [CLP]\n" +
                "4. Peso Colombiano [COP]\n" +
                "5. Dolar Estadounidense [USD]");

        String monedaFinal = teclado.next();

        listamonedas.add(moneda(monedaFinal));

        return listamonedas;
    }

    private String moneda(String inputMoneda){
        switch (inputMoneda) {
            case "1":
                return("ARS");
            case "2":
                return("BRL");
            case "3":
                return("CLP");
            case "4":
                return("COP");
            case "5":
                return("USD");
        }
        throw new ErrorMonedaSeleccionadaException("no existe la moneda seleccionada en el menu.");
    }
}
