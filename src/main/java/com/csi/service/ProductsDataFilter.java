package com.csi.service;


import java.util.List;

import org.springframework.stereotype.Component;

import com.csi.model.Product;

@Component
public class ProductsDataFilter {

	public List<Product> filterData(List<Product> products) {

		List<Product> filteredProducts = new ArrayList<Product>();

		for (Product p : products) {
			if (p.getProductPrice() >= 3000) {
				filteredProducts.add(p);
			}
		}

		return filteredProducts;
	}
}
