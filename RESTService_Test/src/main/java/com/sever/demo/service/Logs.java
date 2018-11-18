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
	private Logger LOGGER = (Logger) LoggerFactory.getLogger(ProductController.class);

    public void writeConsole(ProductModel value) {

        LOGGER.trace(String.format("Product with code %s is trace", value.getCode()));

        LOGGER.debug(String.format("Product with code %s is sent", value.getCode()));

        LOGGER.info("Product Added");

        LOGGER.warn("There is no product");

        LOGGER.error("Error in database");

    }
}
