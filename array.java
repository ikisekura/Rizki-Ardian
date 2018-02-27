/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAnalog;

/**
 *
 * @author Rizki Ardian
 */
public class array {
    public static void main(String[] args) {
        //T0D0 code application logic here
        int nilai [][] = new int [][]
        {
//kolom -----------
        {78,87,76,90,69},  //baris
        {89,67,78,66,80},  //|
        {82,90,89,75,84},  //|
        {75,70,88,77,82}};  //|
            
        int b, k;
        //b = baris // kolom
        for ( b=0;b<4; b++){  //menampilkan elemen atau index dari baris
            for ( k=0;k<5; k++){  //menampilkan elemen atau index dari kolom
          System.out.print(nilai[b][k]+" ");
            }
            System.out.println(""); //membuat baris baru atau spasi

        }        
    }
}
