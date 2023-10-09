import java.util.Scanner;

public class WhileGaji05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukan Jumlah Karyawan :");
        jumlahKaryawan = input.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan Jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukan jabatan karyawan ke-" + (i+1) +": ");
            jabatan = input.next();
            System.out.print("Masukan Jumlah Jam Lembur: ");
            jumlahJamLembur = input.nextInt();
            i++;

            int gajiLembur = 0;

            if (jabatan.equalsIgnoreCase("direktur")) {
            continue;
        } else if (jabatan.equalsIgnoreCase("manajer")) {
            gajiLembur = jumlahJamLembur * 100000;
        } else if (jabatan.equalsIgnoreCase("karyawan")) {
            gajiLembur = jumlahJamLembur * 75000;
        }
        totalGajiLembur += gajiLembur;
    }
    System.out.println("Total gaji lembur: " + totalGajiLembur);
}
}
