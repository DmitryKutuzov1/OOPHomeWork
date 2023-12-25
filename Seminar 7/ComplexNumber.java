public class ComplexNumber implements Operations{
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        return "[" + realPart + " + " + imaginaryPart + "i" + "]";
    }

    @Override
    public ComplexNumber sum(ComplexNumber number2) {
        double realPartSum = this.realPart + number2.realPart;
        double imaginaryPartSum = this.imaginaryPart + number2.realPart;
        return new ComplexNumber(realPartSum, imaginaryPartSum);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber number2) {
        double realPartMult = this.realPart * number2.realPart - this.imaginaryPart * number2.imaginaryPart;
        double imaginaryPartMult = this.realPart * number2.imaginaryPart + this.imaginaryPart * number2.realPart;
        return new ComplexNumber(realPartMult, imaginaryPartMult);
    }

    @Override
    public ComplexNumber divide(ComplexNumber number2) {
        double realPartDiv = (this.realPart * number2.realPart + this.imaginaryPart * number2.imaginaryPart) /
                            (number2.realPart * number2.realPart + number2.imaginaryPart * number2.imaginaryPart);
        double imaginaryPartDiv = (this.imaginaryPart * number2.realPart - this.realPart * number2.imaginaryPart) /
                            (number2.realPart * number2.realPart + number2.imaginaryPart * number2.imaginaryPart);
        return new ComplexNumber(realPartDiv, imaginaryPartDiv);
    }
}