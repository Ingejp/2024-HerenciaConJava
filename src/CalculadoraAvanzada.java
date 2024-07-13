public class CalculadoraAvanzada extends Calculadora {
    private String nombre;

    public double sumarDecimales(double primerNumero, double segundoNumero){
        return primerNumero + segundoNumero;
    }

    public int elevarCuadrado(int numeroBase){
        return numeroBase * numeroBase;
    }

    protected int resta(int primerNumero, int segundoNumero){
        return primerNumero - segundoNumero;
    }
}
