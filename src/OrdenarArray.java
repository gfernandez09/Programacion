public class OrdenarArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,3,8,6,7,2,5,4,9,10};
        OrdenameArray(array1);

        for (int array : array1) {
            System.out.print(array + ", ");
        }
    }

    public static int[] OrdenameArray(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    //Intercambiamos valores
                    int variableauxiliar=array[i];
                    array[i]=array[j];
                    array[j]=variableauxiliar;
                }
            }
        }
        return array;
    }
}
