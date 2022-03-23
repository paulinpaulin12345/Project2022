package com.Logger.Demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {
         static Logger log=Logger.getLogger(Basic_Configuration.class);
         public static void main(String[] args) {
        	 BasicConfigurator.configure();
			log.debug("Debugging");
			log.info("Infromation");
			log.warn("Message");
			log.error("error");
			log.fatal("Fatal");
			
		}
}
