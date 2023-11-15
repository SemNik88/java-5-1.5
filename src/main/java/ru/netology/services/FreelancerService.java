package ru.netology.services;
public class FreelancerService {
    public int calculateRestMonths(int income, int expenses, int threshold) {
        int currentMoney = 0;
        int restMonths = 0;

        for (int i = 1; i <= 12; i++) {
            if (currentMoney < threshold) {
                // Работаем
                int expences = 0;
                currentMoney += income - expences;
                currentMoney -= expenses;

                } else {
                // Отдыхаем
                currentMoney -= expenses + (currentMoney / 3 );
                currentMoney -= currentMoney;
                restMonths++;
            }
        }

        return restMonths;
    }
}
