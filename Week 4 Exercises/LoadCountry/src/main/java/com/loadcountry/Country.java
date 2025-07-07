package com.loadcountry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    public Country() {
        LOGGER.debug("Country Constructor called");
    }

    public String getCode() {
        LOGGER.debug("Get Code: {}", code);
        return code;
    }

    public void setCode(String code) {
        LOGGER.debug("Set Code: {}", code);
        this.code = code;
    }

    public String getName() {
        LOGGER.debug("Get Name: {}", name);
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Setting name: {}", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{code='" + code + "', name='" + name + "'}";
    }
}
