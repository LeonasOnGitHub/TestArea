package testArrays;

public class Testing2D {
    public static void main (String[]  args) {
        int[][] a = new int [5][5];

        a[2][1]=6;
        a[2][2]=0;

        for (int i=0; i< a.length; i++){
            for (int j=0; j< a.length; j++){
               System.out.println(a[i][j]);
            }
        }
    }
}
