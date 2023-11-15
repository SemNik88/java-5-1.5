package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FreelancerServiceTest {
    private final FreelancerService service = new FreelancerService();

    @Test
    void shouldCalculateRestMonths() {
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;
        int actual = service.calculateRestMonths(income, expenses, threshold);
        assertEquals(expected, actual);
                int restMonths = service.calculateRestMonths(income, expenses, threshold);

        System.out.println("Количество месяцев отдыха: " + restMonths);
    }
}

