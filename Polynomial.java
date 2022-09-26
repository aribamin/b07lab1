public class Polynomial{
    private double[] coefficients;

    public Polynomial() {
        coefficients = new double[]{0};
    }

    public Polynomial (double[] array){
        coefficients = new double[array.length];
        for (int i = 0; i < array.length; i++){
            coefficients[i] = array[i];
        }
    }

    public Polynomial add (Polynomial p){
        double[] result_coefficients = new double[p.coefficients.length];
        for (int i = 0; i < this.coefficients.length; i++){
            result_coefficients[i] = result_coefficients[i] + this.coefficients[i];
        }
        for (int i = 0; i < p.coefficients.length; i++){
            result_coefficients[i] += p.coefficients[i];
        }
        Polynomial result_p = new Polynomial(result_coefficients);
        return result_p;
    } 

    public double evaluate (double x){
        double result = 0;
        for (int i = 0; i < this.coefficients.length; i++){
            result = result + (this.coefficients[i] * Math.pow(x,i));
        }
        return result;
    }

    public boolean hasRoot (double x){
        return this.evaluate(x) == 0;
    }
}
