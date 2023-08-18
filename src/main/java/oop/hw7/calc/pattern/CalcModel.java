package oop.hw7.calc.pattern;

abstract class CalcMathFunc {
    double value1, value2;

    abstract double getResult();
}

/**
 * Solid 1. Класс Sum отвечает только за суммирование
 */
class Sum extends CalcMathFunc {
    @Override
    double getResult() {
        return value1 + value2;
    }
}

/**
 * Solid 1. Класс Div отвечает только за деление
 */
class Div extends CalcMathFunc {
    @Override
    double getResult() {
        if (value2 != 0) {
            return value1 / value2;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
    }
}

/**
 * Solid 1. Класс Mul отвечает только за умножение
 */
class Mul extends CalcMathFunc {
    @Override
    double getResult() {
        return value1 * value2;
    }
}

/**
 * Solid 1. Класс Sub отвечает только за Вычитание
 */
class Sub extends CalcMathFunc {
    @Override
    double getResult() {
        return value1 - value2;
    }
}


class OperationFactory {
    public CalcMathFunc createOperator(char ch) {
        CalcMathFunc operator = null;
        switch (ch) {
            case '+':
                operator = new Sum();
                break;
            case '-':
                operator = new Div();
                break;
            case '/':
                operator = new Mul();
                break;
            case '*':
                operator = new Sub();
                break;
            default:
                System.out.println("Введена неверная операция!");
                break;
        }
        return operator;
    }
}
