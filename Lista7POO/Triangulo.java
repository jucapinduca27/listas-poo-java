public class Triangulo implements Forma2D{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) { // constructor
        this.base = base;
        this.altura = altura;
    }
    public double getBase(){ // getter
        return base;
    }
    public double getAltura(){ // getter
        return altura;
    }
    public void setBase(double b){ // setter
        this.base = b;
    }
    public void setAltura(double h){ // setter
        this.altura = h;
    }
    @Override
    public double calcular_area() {
        return 0.5 * base * altura;
    }
    @Override
    public void imprimir_dados() {
        System.out.println("Forma: Triângulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcular_area());
    }
    
}
