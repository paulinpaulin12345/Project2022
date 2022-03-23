package com.Logger.Demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Confoguration {
	 static Logger log=Logger.getLogger(Property_Confoguration.class);
     public static void main(String[] args) {
    	 
    	 PropertyConfigurator.configure("log4j.properties");
		log.debug("Debugging");
		log.info("Infromation");
		log.warn("Message");
		log.error("error");
		log.fatal("Fatal");
		
	}

}
