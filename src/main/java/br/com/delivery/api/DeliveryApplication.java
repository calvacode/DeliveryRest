package br.com.delivery.api;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@AllArgsConstructor
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "br.com.delivery.api")
public class DeliveryApplication implements CommandLineRunner {

    public static void main(final String[] args) {
        SpringApplication.run(DeliveryApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        GeoApiContext geoApiContext = new GeoApiContext.Builder().apiKey("AIzaSyA7Bwpxv2g_6d5Oey_CyekuuOZmRSOE2k8").build();

//        GeocodingResult [] results = GeocodingApi.geocode(geoApiContext,
//                "113 Domenico Alegri sao paulo sp").await();
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        System.out.println(gson.toJson(results[0].addressComponents));

        DistanceMatrix distanceMatrix =
                DistanceMatrixApi.getDistanceMatrix(geoApiContext, (String[])Arrays.asList("RUA DOMENICO ALEGRI SAO PAULO")
                        .toArray(),(String[])Arrays.asList("AV ARICANDUVA SAO PAULO","TERMINAL SÃO MATEUS SAO PAULO").toArray()).await();

        System.out.println(distanceMatrix);

    }
}
