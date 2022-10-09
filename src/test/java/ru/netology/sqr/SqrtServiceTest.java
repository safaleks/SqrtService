package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrtServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/square.scv")
    public void shouldExact(int expected, int min, int max) {
        SqrtService service = new SqrtService();
//        int expected = 3;
        int actual = service.calcCount(min, max);
        Assertions.assertEquals(expected, actual);
    }
}
