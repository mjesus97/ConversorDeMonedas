import Exceptions.ErrorMonedaSeleccionadaException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        RequestConversionApi apiRequest = new RequestConversionApi();
        InteraccionconUsuario usuario = new InteraccionconUsuario();
        Double monto;

        while (true){
            try {
                System.out.println("Cuanto dinero quiere convertir (0 para salir):");
                monto = Double.valueOf(teclado.next());

                if (monto == 0) {
                    System.out.println("Programa terminado\n \n¡Gracias Por preferirnos!");
                    break;
                }

                List<String> listaConversionSeleccionada = usuario.eleccionUsuario();

                double factorConversion = apiRequest.conversion(listaConversionSeleccionada.get(0), listaConversionSeleccionada.get(1));

                System.out.println("*******************\n");
                System.out.println("su conversión es:");
                System.out.println(String.format("%.2f %s = %.2f %s", monto, listaConversionSeleccionada.get(0),
                        factorConversion*monto,listaConversionSeleccionada.get(1)));
                System.out.println("\n*******************");
            }catch (NumberFormatException e){
                System.out.println("No es un monto valido\n");
            }catch (ErrorMonedaSeleccionadaException e){
                System.out.println("No existe la moneda seleccionada en el menu.\n");
            }

        }


    }
}
