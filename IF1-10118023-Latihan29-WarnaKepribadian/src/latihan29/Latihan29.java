/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan29;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Warna Kepribadian
 */

public class Latihan29 {

        public static final String reset = "\u001B[0m";
        public static final String merah = "\u001B[31m";
        public static final String hijau = "\u001B[32m";
        public static final String kuning = "\u001B[33m";
        public static final String biru = "\u001B[34m";
        public static final String ungu = "\u001B[35m";
        public static final String biruMuda = "\u001B[36m";
        public static final String putih = "\u001B[37m";
        public static final String latarMerah = "\u001B[41m";
        public static final String latarHijau = "\u001B[42m";
        public static final String latarKuning = "\u001B[43m";
        public static final String latarBiru = "\u001B[44m";
        public static final String latarUngu = "\u001B[45m";
        
        //variabel global
        public static String nama;
        public static String warna;
        public static String warnaCek;
    
        public static void warnaBiru(){
            System.out.println("1. Menyenangkan,");
            System.out.println("2. Bijaksana,");
            System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
            System.out.println("4. Dinamis,");
            System.out.println("5. Senang berbagi,");
            System.out.println("6. Bersahabat,");
            System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
            System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
        }
        
         public static void warnaMerah(){
            System.out.println("1. Periang,");
            System.out.println("2. Pemberani,");
            System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
            System.out.println("4. Menyukai tantangan");
            System.out.println("5. Kurang sabar,");
            System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahnnya akan sulit dikontrol,");
            System.out.println("7. Memiliki energi kehangatan dan cinta.");                            
        }
        
        public static void warnaKuning(){
            System.out.println("1. Optimis,");
            System.out.println("2. Suka bergaul,");
            System.out.println("3. Periang,");
            System.out.println("4. Senang menolong,");
            System.out.println("5. Lincah dan aktif,");
            System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
            System.out.println("7. Loyal,");
            System.out.println("8. Hangat,");
            System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
            System.out.println("10. Cenderung penakut.");
        }
        
        public static void warnaUngu(){
             System.out.println("1. Optimis,");
             System.out.println("2. Tidak pernah ragu, ");
             System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
             System.out.println("4. Memiliki ambisi yang besar,");
             System.out.println("5. Memiliki empati yang besar,");
             System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
             System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");  
        }
        
        public static void warnaHijau(){
            System.out.println("1. Romantis,");
            System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
            System.out.println("3. Teguh pada prinsip,");
            System.out.println("4. Menginginkan kesempurnaan,");
            System.out.println("5. Mudah cemburu,");
            System.out.println("6. Mudah merasa iri,");
            System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
        }
        
    public static void main(String[] args) {
      
        //tampilan awal
        System.out.println(merah + " YUK " + hijau + "CEK " + kuning + "KEPRIBADIANMU" +biruMuda +
                " DARI " + ungu + "WARNA " + biru + "FAVORITMU\n\n");
       
        System.out.println(latarMerah + putih+ "\t  MERAH\t\t");
        System.out.println(latarHijau + putih+ "\t  HIJAU\t\t");
        System.out.println(latarKuning + putih+ "\t  KUNING\t");
        System.out.println(latarBiru + putih+ "\t  BIRU\t\t");
        System.out.println(latarUngu + putih+ "\t  UNGU\t\t\n");
        
        //input
        System.out.print(reset + "PILIH WARNA FAVORITMU : ");
        Scanner input = new Scanner(System.in);
        warna = input.nextLine();
        warnaCek = warna.toUpperCase();
        
        System.out.print("Nama Kamu : ");
        nama = input.nextLine();
        
        //proses dan output
        
        System.out.println("\n=====HASIL TEST KEPRIBADIAN " + nama + "=====");
        switch(warnaCek){
           case "MERAH" :
                 System.out.println(reset + "WARNA FAVORITMU ADALAH " + merah + warnaCek); 
                 warnaMerah();
                 break;
           case "HIJAU" :
                  System.out.println(reset + "WARNA FAVORITMU ADALAH " + hijau + warnaCek); 
                  warnaHijau();
                  break;
           case "KUNING" :
                   System.out.println(reset + "WARNA FAVORITMU ADALAH " + kuning + warnaCek); 
                   warnaKuning();
                   break;
           case "BIRU" :
                   System.out.println(reset + "WARNA FAVORITMU ADALAH " + biru + warnaCek); 
                   warnaBiru();
                   break;
           case "UNGU" :
                  System.out.println(reset + "WARNA FAVORITMU ADALAH " + ungu + warnaCek); 
                  warnaUngu();
                  break;
           default :
                  System.out.println("Oopss... Belum Terindentifikasi ");
                  break;
        }   
    }
}
