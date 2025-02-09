package ej2;

public class ej2 {
    public static void main(String[] args) {
        int inici = Integer.parseInt(args[0]);
        int fin = Integer.parseInt(args[1]);
        if(inici>fin) {
            int temp = inici;
            inici=fin;
            fin=temp;
        }
        int[] lista=new int[(fin-inici)+1];
        for(int i=0; i<lista.length;i++){
            lista[i]=inici+i;
        }
        for(int elemento : lista)
            System.out.println(elemento);
    }
}
