package com.loadcountry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoadCountryApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoadCountryApplication.class);

    public static void main(String[] args) {
        LOGGER.debug("Starting main method");
        displayCountry();
        LOGGER.debug("Ending main method");
    }

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Country: {}", country);
    }
}
