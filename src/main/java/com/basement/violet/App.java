package com.basement.violet;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Violet
 *
 */
public class App 
{
	private static Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
        logger.debug("Logger debug message");
        logger.warn("Logger warn message");
        logger.error("Logger error message");
        logger.debug("Entering application.");
    }
}
