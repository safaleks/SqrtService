package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrtServiceTest {

    @ParameterizedTest
/*
    @CsvSource({
            "3,200,300",
            "90,99,9802",
            "90,100,9801",
            "1,100,100",
            "1,9801,9801",
            "88,101,9800",
            "0,0,99",
            "0,9802,15000"
    })
*/

    @CsvFileSource(files = "src/test/resources/square.scv")
    public void shouldExact(int expected, int min, int max) {
        SqrtService service = new SqrtService();
//        int expected = 3;
        int actual = service.calcCount(min, max);
        Assertions.assertEquals(expected, actual);
    }
}
