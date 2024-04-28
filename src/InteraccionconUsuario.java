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
        switch (monedainicial) {
            case "1":
                listamonedas.add("ARS");
                break;
            case "2":
                listamonedas.add("BRL");
                break;
            case "3":
                listamonedas.add("CLP");
                break;
            case "4":
                listamonedas.add("COP");
                break;
            case "5":
                listamonedas.add("USD");
                break;
        }

        System.out.println("****************************\n");
        System.out.println("A que moneda quieres convertir:\n" +
                "1. Peso Argentino [ARS]\n" +
                "2. Real Brasileño [BRL]\n" +
                "3. Peso Chileno [CLP]\n" +
                "4. Peso Colombiano [COP]\n" +
                "5. Dolar Estadounidense [USD]");

        String monedaFinal = teclado.next();

        switch (monedaFinal) {
            case "1":
                listamonedas.add("ARS");
                break;
            case "2":
                listamonedas.add("BRL");
                break;
            case "3":
                listamonedas.add("CLP");
                break;
            case "4":
                listamonedas.add("COP");
                break;
            case "5":
                listamonedas.add("USD");
                break;
        }

        return listamonedas;
    }
}
