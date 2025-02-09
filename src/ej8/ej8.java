package ej8;

public class ej8 {
    public static void main(String[] args) {
        int[] valores={8,25,43,10,8,25,343,100,8};
        utilArrays array=new utilArrays(valores);
        System.out.println(array.maxim());
        System.out.println(array.minim());
        System.out.println(array.sumatori());
        System.out.println(array.valorMax());
    }

}
