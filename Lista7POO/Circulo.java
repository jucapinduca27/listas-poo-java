public class Circulo implements Forma2D {
    private double raio; // atribute

    public Circulo(double raio) { // constructor
        this.raio = raio;
    }
    public double getRaio(){ // getter
        return raio;
    }
    public void setRaio(double raio){ // setter
        this.raio = raio;
    }
    @Override
    public double calcular_area() {
        return Math.PI * Math.pow(raio, 2);
    }
    @Override
    public void imprimir_dados() {
        System.out.println("Forma: Círculo:");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcular_area());
    }
    
}
