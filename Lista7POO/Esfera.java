public class Esfera implements Forma3D {
    private double raio;
    public Esfera(double r){
        this.raio = r;
    }
    public double getRaio(){
        return raio;
    }
    public void setRaio(double r){
        this.raio = r;
    }
    @Override
    public double calcular_area() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }
    @Override
    public double calcular_volume() {
        return (4/3) * Math.PI * Math.pow(raio, 3);
    }
    @Override 
    public void imprimir_dados() {
        System.out.println("Forma: Esfera:");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcular_area());
        System.out.println("Volume: " + calcular_volume());
    }
}
