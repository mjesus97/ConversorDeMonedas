import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true){
            System.out.println("Cuanto dinero quiere convertir (0 para salir):");
            double monto = teclado.nextDouble();
            if (monto == 0 ){
                System.out.println("Programa terminado");
                break;
            }
            RequestConversionApi apiRequest = new RequestConversionApi();
            InteraccionconUsuario usuario = new InteraccionconUsuario();

            List<String> listaConversionSeleccionada =  usuario.eleccionUsuario();

            double factorConversion = apiRequest.conversion(listaConversionSeleccionada.get(0),listaConversionSeleccionada.get(1));
            System.out.println("*******************\n");
            System.out.println("su conversión es:");
            System.out.println(monto +
                    " "+ listaConversionSeleccionada.get(0) +" = " +
                    factorConversion*monto+ " "+
                     listaConversionSeleccionada.get(1));
            System.out.println("\n*******************");
        }


    }
}
