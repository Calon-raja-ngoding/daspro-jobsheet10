import java.util.Scanner;
public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris,kolom,menu,u=1,j=0;
        String next,nama;
        String penonton[][]=new String[4][2];
         while (true) {
            System.out.println("_______________________________________");
            System.out.println("| Menu layanan :                       |");
            System.out.println("|   1.Input data penonton              |");
            System.out.println("|   2.Tampilkan daftar penonton        |");
            System.out.println("|   3.Exit                             |");
            System.out.println("|______________________________________|");
            System.out.println();
            System.out.print("Masukkan angka dari layanan yg anda ingin lakukan : ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                while (true) {
                    while (true) {
                        System.out.print("Masukkan nama : ");
                        nama = sc.nextLine();
                        while (true) {
                            System.out.print("Masukkan baris : ");
                            baris = sc.nextInt();
                            if (baris < 5) {
                                break;
                            }
                            System.out.println("Baris yg anda pilih tidak tersediia");
                        }
                        while (true) {
                            System.out.print("Masukkan kolom : ");
                            kolom = sc.nextInt();
                            if (kolom < 3 || kolom > 0) {
                                break;
                            }
                            System.out.println("Kolom yg anda pilih tidak tersediia");
                        }
                    
                        sc.nextLine();

                        if (penonton[baris-1][kolom-1] == null) {
                            break;
                        }else{
                            System.out.println("Kursi yg dipilih sudah terisi, mohon pilih kursi di baris atau kolom yg berbeda");
                        }
                    }
                    penonton[baris-1][kolom-1]= nama;
                    j++;
                    System.out.print("Input penonton lainnya ? (y/n) : ");
                    next= sc.nextLine();
            
                    if (next.equalsIgnoreCase("n")) {
                    break;
                    }
                }
            }else if (menu == 2) {
                u=1;
                for(int i =0;i<4;i++){
                    for(int o=0;o<2;o++){
                        if (penonton[i][o] == null) {
                            System.out.println(u+". ****"+" ( Baris "+(i+1)+", kolom "+(o+1)+" )");
                        }else{
                            System.out.println(u+". "+penonton[i][o]+" ( Baris "+(i+1)+", kolom "+(o+1)+" )");
                        }
                    }
                }
            }else if(menu == 3){
                break;
            }else{
                System.out.println("Angka dari menu layanan yg anda masukkan tidak terdaftar");
            }
        }
    }
}
