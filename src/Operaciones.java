import java.util.Scanner;
public class Operaciones {
    private static final int TAM=tamanyo(10);
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numOperador=0,respuestaUsuario=0;

        Operand[] operando = new Operand[TAM];
        Operador[] operador = new Operador[TAM/2];
        Respuesta[] respuestas = new Respuesta[TAM/2];


        for(int i=0;i<TAM;i++)
            operando[i]=new Operand();

        for(int i=0;i<TAM/2;i++)
            operador[i]=new Operador();

        for (int i = 0; i < TAM; i+=2) {
            System.out.println(operando[i]+" "+operador[numOperador] +" "+operando[i+1]);

            System.out.println("Su respuesta:");
            respuestaUsuario=sc.nextInt();

            respuestas[numOperador]=new Respuesta(calculo(operando[i].getValor(),operando[i+1].getValor(),operador[numOperador].getValor()));

            if(respuestas[numOperador].getValor()==respuestaUsuario)  
                System.out.println("El número está bien!!!");
            else 
                System.out.println("El número está mal :( .");
            numOperador++;
        }


    }
    public static int tamanyo(int tamanyo){
        if(tamanyo%2==0)
            return tamanyo;
        else
            return tamanyo+1;
    }
    public static int calculo(int num1, int num2, char operador){

        switch (operador){
            case '+':
                return (num1 + num2);
            case '-':
                return (num1 - num2);
            case '/':
                return (num1 / num2);
            case '*':
                return (num1 * num2);
        }
        return 0;
    }

}

