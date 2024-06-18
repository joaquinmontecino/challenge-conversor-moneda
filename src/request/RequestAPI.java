package request;

import com.google.gson.Gson;
import models.Request;
import models.RequestResponse;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestAPI {
    String apiKey = "19ed6624398e6deb48e473d5";

    public Request convertCurrencies(String baseCode, String targetCode, double amount){
        URI address = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + baseCode + "/" + targetCode + "/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder()
                .uri(address)
                .build();

        try{
            HttpResponse<String> response = client
                    .send(req, HttpResponse.BodyHandlers.ofString());
            RequestResponse requestResponse = new Gson().fromJson(response.body(), RequestResponse.class);

            return new Request(requestResponse, amount);

        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
