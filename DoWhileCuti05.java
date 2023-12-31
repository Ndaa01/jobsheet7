import java.util.Scanner;

public class DoWhileCuti05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa Jatah Cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa Jatah Cuti tidak Mencukupi");
                    break;
                } 
            }
        } while (jatahCuti > 0 && ! konfirmasi.equalsIgnoreCase("t"));
    }
}
