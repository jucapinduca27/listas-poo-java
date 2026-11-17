public class Quadrado implements Forma2D {
    private double lado;
    public Quadrado(double l) { // constructor
        this.lado = l;
    }
    public double getLado(){ // getter
        return lado;
    }
    public void setRaio(double l){ // setter
        this.lado = l;
    }
    @Override
    public double calcular_area() {
        return Math.pow(lado, 2);
    }
    @Override
    public void imprimir_dados() {
        System.out.println("Forma: Quadrado");
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + calcular_area());
    }
    
}
