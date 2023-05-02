import java.util.Scanner;

public class Matritsa {

        public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("N ni kiriting:");
        int n=scanner.nextInt();
        int [][] mat= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]= (int)( Math.random()*100+1);
            }
        }
        System.out.println("Martirsa");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Diagonal");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if(i==(j)) {
                    System.out.print(mat[i][j] + "\t");
                }
            }
            System.out.println();
        }


    }
}
