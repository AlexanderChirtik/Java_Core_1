package org.process;

public class View {
    /**
     * Вывод на экран 4 строчек текста с результатами вычислений
     * @param firstValue задается в классе Main
     * @param secondValue задается в классе Main
     * @param multiValue результат перемножения из класса Logics
     * @param divisValue результат деления из класса Logics
     * @param additionValue результат сложения из класса Logics
     * @param subtractionValue результат вычитания из класса Logics
     */
    public static void print(int firstValue, int secondValue, int multiValue, int divisValue,
                             int additionValue, int subtractionValue){
        System.out.println("Результат умножения чисел " + firstValue + " и " + secondValue + " = " + multiValue);
        System.out.println("Результат деления " + firstValue + " на " + secondValue + " = " + divisValue);
        System.out.println("Результат сложения чисел " + firstValue + " и " + secondValue + " = " + additionValue);
        System.out.println("Результат вычитания " + firstValue + " и " + secondValue + " = " + subtractionValue);
    }
}
