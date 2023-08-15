package oop.hw6.calc.solid;


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

/**
 * Solid 1. Класс ClasTrigonometryFunc отвечает только за одну зону ответственности (тригонометрические вычисления)
 */
class ClasTrigonometryFunc {
    // класc не прописан. Приведен для примера.
}