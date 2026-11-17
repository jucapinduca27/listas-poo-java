import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;
    public Agenda(){
        this.contatos = new ArrayList<>();
    }
    public static void main(String[] args){
    }
    public void addContato(Contato contato){
        contatos.add(contato);
    }
    public boolean removerContato(String nome){
        return contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }
    public String buscarContato(String nome){
        for(Contato c : contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                return "Nome: " + c.getNome() + " | Tel: " + c.getTel() + " | Email: " + c.getEmail();
            }
        }
        return "Impossível encontrar contato!\n";
    }
    public void listarContatos(){
        if(contatos.size() == 0){
            System.out.println("Não há contatos na agenda!");
            return;
        }
        for(Contato c: contatos){
            System.out.println("Nome: " + c.getNome() + " | Tel: " + c.getTel() + " | Email: " + c.getEmail());
        }
    }
}