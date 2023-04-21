package org.aadi.api;

import lombok.RequiredArgsConstructor;
import org.aadi.domain.Product;
import org.aadi.domain.ProductEventPublisher;
import org.aadi.domain.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
class ProductController {
    private final ProductRepository productRepository;
    private final ProductEventPublisher productEventPublisher;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Void> createProduct(@RequestBody Product product) {
        productEventPublisher.publishProductCreatedEvent(product);
        return ResponseEntity.ok().build();
    }
}
