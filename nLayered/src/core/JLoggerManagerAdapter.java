package core;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;
import jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{


    @Override
    public void logToSystem(JLoggerManager jLoggerManager, Product product) {
        jLoggerManager.log("Ürün eklendi " + product.getName());
    }
}
