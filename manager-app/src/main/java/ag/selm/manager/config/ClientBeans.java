package ag.selm.manager.config;


import ag.selm.manager.client.ProductsRestClient;
import ag.selm.manager.client.RestClientProductsRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ClientBeans {

    @Bean
    public ProductsRestClient productsRestClient(
            @Value("${service.catalogue.uri:http://localhost:8081/catalogue-api}") String  catalogueBaseUri){
            return new RestClientProductsRestClient(RestClient.builder()
                    .baseUrl(catalogueBaseUri)
                    .build());
    }
}
