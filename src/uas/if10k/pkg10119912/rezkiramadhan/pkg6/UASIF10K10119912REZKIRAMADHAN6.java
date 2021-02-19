/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if10k.pkg10119912.rezkiramadhan.pkg6;

/**
 *
 * @author 
 * Nama : Rezki Ramadhan
 * Nim : 10119912 
 * Kelas : IF10K 
 * Tanggal : 19 Februari 2021
 * Nomor soal : 6
 */
public class UASIF10K10119912REZKIRAMADHAN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kalkulator klt = new Kalkulator();
        
        System.out.println("value 1 = 7.0 ");
        klt.setValue1(7.0);
        System.out.println("value 2 = 5.0");
        klt.setValue2(5.0);
        System.out.println("");
        System.out.println("");
        System.out.println("Result multiple is = " + klt.multiplication(7.0, 5.0));

    }
    
}
