package ru.netology.services;

public class FreelancerService {
    public int calculateRestMonths(int income, int expenses, int threshold) {
        int currentMoney = 0;
        int restMonths = 0;
        int expences = 0;
        for (int i = 1; i <= 12; i++) {
            if (currentMoney < threshold) {
                // Работаем
                currentMoney += income - expences;
                currentMoney -= expenses;//когда дохода нет, а жить нужно, без нее смотрите скрин-шот с ошибкой
            } else {
                // Отдыхаем
                currentMoney = (currentMoney - expenses) / 3;
                restMonths++;
            }
        }
        return restMonths;
    }
}
