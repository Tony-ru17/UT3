public class Operand {
    private int valor;

    public Operand(){
        this.valor=(int)(Math.random()*10+1);
    }
    public Operand(int valor){
        this.valor=valor;
    }
    public Operand(Operand operand){
        this.valor=operand.valor;
    }
    public int getValor(){
        return valor;
    }
    public String toString(){
        return String.valueOf(valor);
    }
}
