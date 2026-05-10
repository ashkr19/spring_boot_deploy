package com.example.product.controllers;

import com.example.product.Dto.ProductDTO;
import com.example.product.common.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @GetMapping("/prod")
    public ResponseEntity<ApiResponse<List<ProductDTO>>> getAllProducts() {
        List<ProductDTO> products = List.of(
            new ProductDTO("Product 1", "Description  1", 10.0),
            new ProductDTO("Product 2", "Description 2", 20.0)
        );
        ApiResponse<List<ProductDTO>> response = new ApiResponse<>(true, "Products retrieved successfully", products);
        return ResponseEntity.ok().body(response);
    }
}
