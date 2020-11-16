/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Intel
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int makan, minum, jumlahmakan, jumlahminum, bayarmakan, bayarminum, totalbayar;
        
        Scanner pesan = new Scanner(System.in);
        
        System.out.println("Menu Makanan");
        System.out.println("1. Soto Ayam");
        System.out.println("2. Sate Ayam");
        System.out.println("3. Bubur Ayam");
        System.out.println("4. Ayam Lalapan");
        System.out.println("5. Nila Lalapan");
        System.out.println("");
        System.out.print("Pilih Menu Makanan : ");
        makan = pesan.nextInt();
        System.out.print("Jumlah : ");
        jumlahmakan = pesan.nextInt();
        
        
        System.out.println("");
        System.out.println("Menu Minuman");
        System.out.println("1. Teh Hangat");
        System.out.println("2. Teh Es");
        System.out.println("3. Jeruk Hangat");
        System.out.println("4. Es Jeruk");
        System.out.println("5. Air Putih");
        System.out.println("");
        System.out.print("Pilih Menu Minum : ");
        minum = pesan.nextInt();
        System.out.print("Jumlah : ");
        jumlahminum = pesan.nextInt();
        
        System.out.println("");
        System.out.println("Pembayaran");
        if(makan == 1 && minum == 1 || makan == 1 && minum == 2){
            bayarmakan = 15000 * jumlahmakan;
            bayarminum = 5000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 1 && minum == 3 || makan == 1 && minum == 4){
            bayarmakan = 15000 * jumlahmakan;
            bayarminum = 10000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 1 && minum == 5){
            bayarmakan = 15000 * jumlahmakan;
            bayarminum = 3000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 2 && minum == 1 || makan == 2 && minum == 2){
            bayarmakan = 20000 * jumlahmakan;
            bayarminum = 5000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 2 && minum == 3 || makan == 2 && minum == 4){
            bayarmakan = 20000 * jumlahmakan;
            bayarminum = 10000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 2 && minum == 5){
            bayarmakan = 20000 * jumlahmakan;
            bayarminum = 3000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 3 && minum == 1 || makan == 3 && minum == 2){
            bayarmakan = 10000 * jumlahmakan;
            bayarminum = 5000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 3 && minum == 3 || makan == 3 && minum == 4){
            bayarmakan = 10000 * jumlahmakan;
            bayarminum = 10000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 3 && minum == 5){
            bayarmakan = 10000 * jumlahmakan;
            bayarminum = 3000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 4 || makan == 5 && minum == 1 || makan == 4 || makan == 5 && minum == 2){
            bayarmakan = 25000 * jumlahmakan;
            bayarminum = 5000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 4 || makan == 5 && minum == 3 || makan == 4 || makan == 5 && minum == 4){
            bayarmakan = 25000 * jumlahmakan;
            bayarminum = 10000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 4 || makan == 5 && minum == 5){
            bayarmakan = 25000 * jumlahmakan;
            bayarminum = 3000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan <1 && minum == 1 || makan <1 && minum == 2 || makan >5 && minum == 1 || makan >5 && minum == 2){
            bayarmakan = 0 * jumlahmakan;
            bayarminum = 5000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan <1 && minum == 3 || makan <1 && minum == 4 || makan >5 && minum == 3 || makan >5 && minum == 4){
            bayarmakan = 0 * jumlahmakan;
            bayarminum = 10000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan <1 && minum == 5 || makan >5 && minum == 5){
            bayarmakan = 0 * jumlahmakan;
            bayarminum = 3000 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 1 && minum <1 || makan == 1 && minum >5){
            bayarmakan = 15000 * jumlahmakan;
            bayarminum = 0 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 2 && minum <1 || makan == 2 && minum >5){
            bayarmakan = 20000 * jumlahmakan;
            bayarminum = 0 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 3 && minum <1 || makan == 3 && minum >5){
            bayarmakan = 10000 * jumlahmakan;
            bayarminum = 0 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else if(makan == 4 && minum <1 || makan == 5 && minum <1 && makan == 4 && minum >5 || makan == 5 && minum >5){
            bayarmakan = 25000 * jumlahmakan;
            bayarminum = 0 * jumlahminum;
            totalbayar = bayarmakan + bayarminum;
            System.out.println("Total Bayar : Rp. " + totalbayar);
        }
        else{
            System.out.println("Anda Tidak Memesan apapun");
        }
    }
}
