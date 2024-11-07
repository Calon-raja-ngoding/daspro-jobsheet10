import java.util.Scanner;
public class TUGAS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[][]= new int[10][6],i=0,j,jnP[]=new int[6],jnR[]=new int[10],jnK=0;
        double rata2P[]=new double[6],rata2R[]=new double[10],rata2K=0;

        for(i=0;i<10;i++){
            for(j=0;j<6;j++){
                System.out.print("Masukkan nilai pertanyaan ke-"+(j+1)+" dari responden ke"+(i+1)+" : ");
                n[i][j]= sc.nextInt();
                jnK += n[i][j];
                jnP[j]+= n[i][j];
                jnR[i]+= n[i][j];
                }
            System.out.println();
        }
        rata2K=(double)jnK/60;
        System.out.println("Rata-rata nilai keseluruhan adalah "+rata2K);
        System.out.println();
        for(i=0;i<10;i++){
            rata2R[i]=(double)jnR[i]/6;
            System.out.println("Rata-rata nilai responden ke-"+(i+1)+" adalah "+rata2R[i]);
        }
        System.out.println();
        for(i=0;i<6;i++){
            rata2P[i]=(double)jnP[i]/10;
            System.out.println("Rata-rata nilai pertanyaan ke-"+(i+1)+" adalah "+rata2P[i]);
        }
        System.out.println( );
    }
}
