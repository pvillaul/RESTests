package com.sever.demo.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sever.demo.controller.ProductController;
import com.sever.demo.model.ProductModel;

import ch.qos.logback.classic.Logger;

@Service
public class Logs {
    @Autowired
	private Logger logs = (Logger) LoggerFactory.getLogger(ProductController.class);

    public void writeConsole(ProductModel value) {

    	logs.trace("Product with code" + value.getCode() + "is trace");

    	logs.debug("Product with code" + value.getCode() + "is sent");

    	logs.info("Product Added");

    	logs.warn("There is no product");

    	logs.error("Error in database");

    }
}
