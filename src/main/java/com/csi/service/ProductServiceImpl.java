package com.csi.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private CsvDataReader dataReader;

	@Override
	public String doProcess(String fileName) throws IOException {

		List<Product> products = dataReader.readProductData(fileName);

		products.forEach(p -> {
			System.out.println(p);
		});

		return null;
	}

}
