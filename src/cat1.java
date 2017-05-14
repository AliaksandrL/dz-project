package dz.cat1;

/**
 * Created by Администратор on 01.05.2017.
 */
public class cat1 {
    public static void main(String[] args) {
        int t, i;
        int table [][] = new int[5][5];

        for (t = 0; t < 5; t++) {
            for (i = 0; i < 5; i++) {
                table [t][i] = (t*0)+i+1;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}
