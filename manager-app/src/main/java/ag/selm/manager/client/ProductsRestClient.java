package ag.selm.manager.client;

import ag.selm.manager.controller.payload.NewProductPayload;
import ag.selm.manager.controller.payload.UpdateProductPayload;
import ag.selm.manager.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductsRestClient {

    List<Product> findAllProducts();

    Product createProduct(NewProductPayload payload);

    Optional<Product> findProductById(int productId);

    void updateProduct(int productId, UpdateProductPayload payload);

    void deleteProduct(int productId);
}
