package ru.netology.services;
public class FreelancerService {
    public int calculateRestMonths(int income, int expenses, int threshold) {
        int currentMoney = 0;
        int restMonths = 0;

        for (int i = 1; i <= 12; i++) {
            if (currentMoney < threshold) {
                // Работаем
                currentMoney += income;
                currentMoney -= expenses;
            } else {
                // Отдыхаем
                currentMoney -= expenses;
                currentMoney -= currentMoney;
                restMonths++;
            }
        }

        return restMonths;
    }
}