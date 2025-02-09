package ejemplo;

public class Operador {
    private char operador;
    public Operador(){
        switch((int)(Math.random()*4+1)){
            case 1:
                this.operador='+';
                break;
            case 2:
                this.operador='-';
                break;
            case 3:
                this.operador='*';
                break;
            case 4:
                this.operador='/';
                break;
            default:
                this.operador='+';
        }
    }
    public char getValor(){
        return operador;
    }
    public String toString(){
        return String.valueOf(operador);
    }
}
