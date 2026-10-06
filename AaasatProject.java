/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aaasat.project;

/**
 *
 * @author LENOVO
 */
public class AaasatProject {

    public static void main(String[] args) {
        String nama = "aaasat-68";
        String prodi = "Teknik Informatika";
        String fakultas = "Saint & Teknologi";
        biodata(nama,prodi,fakultas);
        
        double sudutDerajat = 75.5;
        Trigonometri(sudutDerajat);

        int hasil = penjumlahan (130,400,90);
        System.out.println("ini hasil penjumlahan " + hasil);
        
        hasil = perkalian (500,30);
        System.out.println("ini hasil perkalian " +hasil);
        
        hasil = pengurangan (700,397);
        System.out.println("ini hasil pengurangan " +hasil);
        
        hasil = pembagian (456,90);
        System.out.println("ini hasil pembagian " +hasil);
        
        hasil = perkalianpengurangan(37,40,180);
        System.out.println("ini hasil perkalian pengurangan "+hasil);
        
        hasil = penjumlahanpembagian(409,23,57);
        System.out.println("ini hasil penjumlahan pembagian "+hasil);
    }
    
     public static void biodata(String nama,String prodi,String fakultas){
        System.out.println("......");
        System.out.println("Nama :"+nama);
        System.out.println("Prodi :"+prodi);
        System.out.println("Fakultas :"+fakultas);
    }
     
    
     public static int penjumlahan(int a, int b, int c){
         return a+b+c;
     }
     
     public static int perkalian(int a, int b){
         return a*b;
     }
     
     public static int pengurangan(int a, int b){
         return a-b;
     }
     
     public static int pembagian(int a, int b){
         return a/b;
     }
     
      public static int perkalianpengurangan(int a, int b, int c){
         return a*b-c;
     }
      
      public static int penjumlahanpembagian(int a, int b, int c){
         return a+b/c;
     }
      public static void Trigonometri(double sudutDerajat){   
        double sudutRadian = Math.toRadians(sudutDerajat);
        
        double nilaiSin = Math.sin(sudutRadian);
        double nilaiCos = Math.cos(sudutRadian);
        double nilaiTan = Math.tan(sudutRadian);
        
        System.out.println("hasil Sin: " +nilaiSin);
        System.out.println("hasil Cos: " +nilaiCos);
        System.out.println("hasil Tan: " +nilaiTan);
    }
}
    

