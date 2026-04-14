package client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PlatziStoreClient", url = "${basket.client.platzi}")
public interface PlatziStoreClient {
    @GetMapping("/products")
    public void getAllProducts();

    @GetMapping("/{id}")
    public void getProductById(@PathVariable Long id);
}
