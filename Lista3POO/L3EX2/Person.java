public class Person {
    private String name;
    private String cpf;
    
    public Person(String name, String cpf){
        this.name = name;
        this.cpf = cpf;
    }
    public String getName(){
        return this.name;
    }
    public String getCPF(){
        return this.cpf;
    }
    @Override 
    public String toString(){
        return "Name: " + name + " | CPF: " + cpf + "";
    }
}