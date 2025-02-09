package ej8;


public class utilArrays {
    private int[] array;

    public utilArrays(int[] array){
        this.array=array;
    }
    public int maxim(){
        int max=array[0];
        for(int i=0;i<array.length;i++)
            if(max<array[i]){
                max=array[i];
            }
        return max;
    }
    public int minim(){
        int min=array[0];
        for(int i=0;i<array.length;i++)
            if(min>array[i]){
                min=array[i];
            }
        return min;
    }
    public int sumatori(){
        int suma=0;
        for(int i=0;i<array.length;i++)
            suma+=array[i];
        return suma;
    }
    public int valorMax(){
        int countMax=0;
        int max=array[0];
        int count=0;
        for(int i=0;i<array.length;i++){
            count=0;
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j])
                    count++;
            }
            if(count>countMax)
                max=array[i];

        }
        return max;
    }



}
