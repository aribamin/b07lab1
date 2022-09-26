public class Polynomial{
    double[] coefficients;

    public Polynomial() {
        coefficients = new double[]{0}
    }

    public Polynomial (double[] array){
        coefficients = new double[array.length]
        for (int i = 0; i < array.length; i++){
            coefficients[i] = array[i];
        }
    }

    public Polynomial add (Polynomial p){
        double[] result_coefficients = coefficients;
        for (int i = 0; i < this.coefficients.length; i++){
            result_coefficients[i] = result_coefficients[i] + this.coefficients[i];
        }
        Polynomial p1 = new Polynomial(new_coefficients);
        return p;
    } 

    public double evaluate (double x){
        double result = 0;
        for (int i = 0; i < this.coefficients.length; i++){
            result = result + (this.coefficients[i] * Math.pow(x,i));
        }
        return result;
    }

    public boolean hasRoot (double x){
        return this.evaluate(value) == 0;
    }
}
