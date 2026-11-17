public class Cubo implements Forma3D {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcular_area() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcular_volume() {
        return Math.pow(lado, 3);
    }

    @Override
    public void imprimir_dados() {
        System.out.println("Forma: Cubo");
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + calcular_area());
        System.out.println("Volume: " + calcular_volume());
    }
    
}
