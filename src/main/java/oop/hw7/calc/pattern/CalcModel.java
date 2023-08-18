package oop.hw7.calc.pattern;

/**
 * Solid 1. Класс CalcMathFunc отвечает только за одну зону ответственности (арифметические вычисления)
 */
class CalcMathFunc {

    public double sum(double value1, double value2) {
        return value1 + value2;
    }

    public double div(double value1, double value2) {
        if (value2 != 0) {
            return value1 / value2;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
    }

    public double mul(double value1, double value2) {
        return value1 * value2;
    }

    public double sub(double value1, double value2) {
        return value1 - value2;
    }
}
