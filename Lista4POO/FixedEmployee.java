public class FixedEmployee {
    private String name;
    private String cpf;
    private String sector;
    private Float wage;
    
    public FixedEmployee(String name, String cpf, String sector, Float wage){
        this.name = name;
        this.cpf = cpf;
        this.sector = sector;
        this.wage = wage;
    }
    public String getName(){
        return this.name;
    }
    public String getCPF(){
        return this.cpf;
    }
    public String getSector(){
        return this.sector;
    }
    public void setName(String name){ // ? mudar nome?
        this.name = name;
    }
    public void setSector(String sector){
        this.sector = sector;
    }
    public void setWage(Float wage){
        this.wage = wage;
    }
    public Float WageCalc(){
        return wage;
    }
    public void showDataEmployee(){
        System.out.println("NOME: " + name + "");
        System.out.println("CPF: " + cpf + "");
        System.out.println("SETOR: " + sector + "");
        System.out.println("SALÁRIO: " + wage + "");
    }
    

}