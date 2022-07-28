package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

        @ParameterizedTest
        @CsvFileSource(files="src/test/resources/square.csv")
        public void test(int expected, int lowLimit, int upLimit) {

            SQRService service = new SQRService();
            int countUp = service.fairSquare(lowLimit, upLimit);
            Assertions.assertEquals(expected, countUp);
        }
}
