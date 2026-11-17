public class Cilindro implements Forma3D {
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }
    public double getRaio(){
        return raio;
    }
    public double getAltura(){
        return altura;
    }
    public void setRaio(double r){
        this.raio = r;
    }
    public void setAltura(double h){
        this.altura = h;
    }

    @Override
    public double calcular_area() {
        return 2 * Math.PI * raio * (raio + altura);
    }
    @Override
    public double calcular_volume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    @Override
    public void imprimir_dados() {
        System.out.println("Forma: Cilindro");
        System.out.println("Raio: " + raio);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcular_area());
        System.out.println("Volume: " + calcular_volume());
    }
    
}
