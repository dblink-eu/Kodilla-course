package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        logger.log("log1 entry");
        logger.log("log2 entry");
        //When
        String lastLog = logger.getLastLog();
        //Then
        Assert.assertEquals("log2 entry", lastLog);
    }
}
