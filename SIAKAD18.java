import java.util.Scanner;
public class SIAKAD18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa,jumlahMatkul;
        System.out.print("Masukkan jumlah mahasiswa yg ingin didata : ");
        jumlahMahasiswa= sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah yg ingin didata : ");
        jumlahMatkul=sc.nextInt();
        int nilai[][]=new int[jumlahMahasiswa][jumlahMatkul];
        for (int i =0;i<nilai.length;i++){
            System.out.println("Input nilai mahasiswa ke-"+(i+1));
            double totalPersiswa = 0;
            for(int j=0;j<nilai[0].length;j++){
                System.out.print("  Nilai mata kuliah "+(j+1)+" : ");
                nilai[i][j]=sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata : "+ totalPersiswa/3);
        }
        System.out.println("\n=====================================");
        System.out.println("Rata-rata Nilai setiap Mata kuliah : ");
        for(int j = 0;j<3;j++){
            double jumlahPerMatkul=0;
            for(int i=0;i<4;i++){
                jumlahPerMatkul+=nilai[i][j];
            }
            System.out.println("  Mata kuliah "+(j+1)+" : "+ jumlahPerMatkul/4);
        }
    }
}
