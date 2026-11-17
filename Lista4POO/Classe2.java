
public class Classe2{
    private Classe1 obj;
    public Classe2(Classe1 c){
        obj = c;
    }
    public Classe1 getObj(){
        return obj;
    }
    public int getValor(){
        return obj.getValor();
    }
    public void somaValor(int v){
        v++;
        obj.soma(v);
    }
}