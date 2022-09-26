public class Polynomial{
    double[] coefficients;

    public Polynomial() {
    }

    public Polynomial (double[] array){
        for (int i = 0; i < array.length; i++){
            coefficients[i] = array[i];
        }
    }

    public Polynomial add (Polynomial p){
        for (int i = 0; i < p.coefficients.length; i++){
            p.coefficients[i] = p.coefficients[i] + coefficients[i];
        }
        return p;
    } 

    public double evaluate (double x){
        double result = 0;
        for (int i = 0; i < coefficients.length; i++){
            result = result + (coefficients[i] * x);
        }
        return result;
    }

    public boolean hasRoot (double x){
        double result = 0;
        for (int i = 0; i < coefficients.length; i++){
            result = result + (coefficients[i] * x);
        }
        return result == 0;
    }
}