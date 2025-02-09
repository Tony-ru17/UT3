package ej3;
import java.util.Scanner;
public class ej3 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String palabra;
        System.out.println("Dime una palabra:");
        palabra=sc.nextLine();
        char[] letras=toCharArray(palabra);
        for(char caracter : letras){
            System.out.println(caracter);
        }
    }
    
    public static char[] toCharArray(String s){
        int longitud=s.length();
        char[] letras= new char[s.length()];
        
        for(int i=0;i<longitud;i++)
            letras[i]=s.charAt(i);
        return letras;
    }
}
