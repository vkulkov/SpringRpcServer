package com.simple.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Component
@WebService(serviceName = "CalculationService")
@Service("calculationService")
public class CalculationServiceImpl implements CalculationService {
    private Logger logger = Logger.getLogger(CalculationServiceImpl.class);

    @Override
    @WebMethod
    public long add(int x, int y) {
        logger.debug("add() method is invoked with arguments [" + x + ", " + y +"]");
        return x + y;
    }

    @Override
    @WebMethod
    public long subtract(int x, int y) {
        logger.debug("subtract() method is invoked with arguments [" + x + ", " + y +"]");
        return x - y;
    }

    @Override
    @WebMethod
    public long multiply(int x, int y) {
        logger.debug("multiply() method is invoked with arguments [" + x + ", " + y +"]");
        return x * y;
    }

    @Override
    @WebMethod
    public float divide(int x, int y) {
        logger.debug("divide() method is invoked with arguments [" + x + ", " + y +"]");
        return x / y;
    }
}
