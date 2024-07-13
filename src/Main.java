public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        CalculadoraAvanzada miCalculadora = new CalculadoraAvanzada();
        miCalculadora.sumar(10,4);
        miCalculadora.elevarCuadrado(5);
        miCalculadora.resta(10, 4);
       System.out.println(miCalculadora.elevarCuadrado(5));
    }
}