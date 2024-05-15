package core;

import entities.concretes.Product;
import jLogger.JLoggerManager;

public interface LoggerService {
    void logToSystem(JLoggerManager jLoggerManager, Product product);
}
