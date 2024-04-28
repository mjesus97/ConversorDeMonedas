import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import records.jsonConversion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestConversionApi {

    public double conversion(String monedaInicial, String monedaFinal) {
        String apiKey = "9aa29ae429a6619af900c236";
        String direccion = "https://v6.exchangerate-api.com/v6/" +
                apiKey + "/pair/" + monedaInicial + "/" + monedaFinal;

        Gson gson =  new Gson();

        try{
            HttpClient client = HttpClient.newHttpClient(); //es el cliente
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion)) //de postman
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();


            jsonConversion factorConversion = gson.fromJson(json, jsonConversion.class);
            //System.out.println("factor: %.2f", String.valueOf(factorConversion.conversion_rate()));

            return factorConversion.conversion_rate();


        } catch (IOException e) {
            throw new RuntimeException(e);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
