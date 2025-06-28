package com.sj4l;

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 

public class LoggingSLF4J {

	 private static final Logger logger = LoggerFactory.getLogger(LoggingSLF4J.class); 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.error("Error Logger Message"); 
        logger.warn("Warning Logger Message"); 
	}

}
