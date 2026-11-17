public class ComissionedEmployee {
    private String name; // n
    private String cpf; // c
    private String sector;
    private Float baseWage; // bw
    private Float totalSells; // ts
    private Float PercentComission; // pc em %
    //private Float finalWage; // fw

    public ComissionedEmployee(String n, String c, String s, Float bw, Float ts, Float pc){
        this.name = n;
        this.cpf = c;
        this.sector = s;
        this.baseWage = bw;
        this.totalSells = ts;
        this.PercentComission = pc;   
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
    public Float getTotalSells(){
        return this.totalSells;
    }
    public Float getBaseWage(){
        return this.baseWage;
    }
    public Float getPercentComission(){
        return this.PercentComission;
    }
    public Float WageCalc(){

        Float wage = baseWage + (totalSells * (PercentComission/100));
        return wage;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setSector(String s){
        this.sector = s;
    }
    public void setBaseWage(Float bw){
        this.baseWage = bw;
    }
    public void setPercentComission(Float pc){
        this.PercentComission = pc;
    }
    public void showDataEmployee(){
        System.out.println("NOME: " + name + "");
        System.out.println("CPF: " + cpf + "");
        System.out.println("SETOR: " + sector + "");
        System.out.println("SALÁRIO: " + this.WageCalc()+ "");
    }


}

