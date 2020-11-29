public class CalcArab {
    private int digit1;
    private int digit2;
    private String znak;
    private int result;

    public CalcArab(int digit1, int digit2, String znak) {
        if (znak.equals("/") && digit2 == 0) { //проверка деления на ноль
            throw new ArithmeticException();
        }

        this.digit1 = digit1;
        this.digit2 = digit2;
        this.znak = znak;
        calculation(this.digit1, this.digit2, this.znak);
    }

    int calculation(int digit1, int digit2, String znak) {
        switch (znak) {
            case "+":
                result = digit1 + digit2;
                break;
            case "-":
                result = digit1 - digit2;
                break;
            case "*":
                result = digit1 * digit2;
                break;
            case "/":
                result = digit1 / digit2;
        }
        return result;
    }


    int getResult() {
        return this.result;
    }
}
