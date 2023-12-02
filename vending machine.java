import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//Data Diri Saya
		System.out.println("Muhammad Safarudin Pratama");
		System.out.println("09021282328102");
		System.out.println(" ");
		System.out.println(" ");
		Scanner s = new Scanner(System.in);
		//UI Awal
		System.out.println("==================================================");
		System.out.println("============| Vending Machine Minuman KEEMPAT |===========");
		System.out.println("==================================================");
		System.out.println(" ");
		System.out.println("Silahkan pilih satu minuman yang ingin kamu beli");
		System.out.println("_____________________________________________");
		System.out.println("| KODE MINUMAN | NAMA MINUMAN  |    HARGA   |");
		System.out.println("|      1       |     Milo      |  Rp.7.500  |");
		System.out.println("|      2       |     Kopi      |  Rp.4.000  |");
		System.out.println("|      3       |   Teh Botol   |  Rp.3.500  |");
		System.out.println("|      4       |   Jus Mangga  |  Rp.5.000  |");
		System.out.println(" ");
		//Pendataan dan deklarasi
		System.out.print("Masukkan Kode Minuman     = ");
		int km = 0;
		int jb = 0;
		String hb = "Rp.0";//Harga Barang Per Pcs
		String pd = "0%";//Persen Diskon
		double thb = 0;//total harga barang
		double d = 0;//diskon
		double ht = 0;//harga total
		String nb = "Tidak Ada";//Nama Barang
        km = s.nextInt();//kode minuman
        if (km >=1 && km <=4){
    		System.out.print("Masukkan Jumlah Pembelian = ");
		    jb = s.nextInt();//jumlah beli
        }
        else {
            System.out.println("Anda Memasukkan Kode Yang Salah");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
		//switch case
		switch(km){
		    case 1:
		        thb = 7500*jb;
		        hb = "Rp.7500";
		        nb = "Milo";
		        break;
		    case 2:
		        thb = 4000*jb;
		        hb = "Rp.4000";
		        nb = "Kopi";
		        break;
		    case 3:
		        thb = 3500*jb;
		        hb = "Rp.3500";
		        nb = "Teh Botol";
		        break;
		    case 4:
		        thb = 5000*jb;
		        hb = "Rp.5000";
		        nb = "Jus Mangga";
		    default:
		        System.out.println("Error...Error...Tidak Dapat Menemukan Kode Minuman");
		        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
		        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
		        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
		        System.out.println("Tolong Ulangi dan Masukkan Kode Yang Benar");
		}
		//menghitung diskon
		if (thb>100000){
		    pd = "15%";
		    d = thb*0.15;
		}
		else if (thb>=50000 && thb<=100000){
		    pd = "7,5%";
		    d = thb*0.075;
		}
		else{
		    pd = "Tidak Ada";
		    d = 0;
		}
		ht = thb-d;
		//eksekusi input
		System.out.println(" ");
		System.out.println("Rincian Pembelian");
		System.out.println("Nama Minuman         = "+nb);
		System.out.println("Harga Barang Per Pcs = "+hb);
		System.out.println("Jumlah Beli          = "+jb+" Pcs");
		System.out.println("Total Harga Barang   = Rp."+thb);
		System.out.println("Total Diskon         = "+pd);
		System.out.println("Total Harga          = Rp."+ht);
		System.out.println(" ");
		System.out.println("Jadi, Anda Harus Membayar Sebanyak Rp."+ht);
		System.out.println("Terimakasih Telah Membeli Minuman Di Vending Machine Kami");
	}
}