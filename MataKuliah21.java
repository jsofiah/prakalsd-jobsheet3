import java.util.Scanner;
public class MataKuliah21 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah21(){
        
    }
    public MataKuliah21(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(Scanner absen21){
            System.out.print("Kode         : ");
            kode = absen21.nextLine();
            System.out.print("Nama         : ");
            nama = absen21.nextLine();
            System.out.print("SKS          : ");
            sks = absen21.nextInt();
            System.out.print("Jumlah Jam   : ");
            jumlahJam = absen21.nextInt();
            absen21.nextLine();
            System.out.println("----------------------------------------");
    }
}
