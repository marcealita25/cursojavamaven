package es.cursojava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        logger.debug("Debug Hello world!");
        logger.info("Info Hello world!");
        logger.warn("Warn Hello world!");
        logger.error("Error Hello world!");
        
    }
}