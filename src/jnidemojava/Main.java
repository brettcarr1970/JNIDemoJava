/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnidemojava;

/**
 *
 * @author brett
 */
public class Main {
     
    static {
        System.load("C:/Users/brett/Documents/NetBeansProjects/JNIDemoCdl/dist/libJNIDemoCdl.dll");
       }
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       new Main().nativePrint();
       new Resample().runme(null);
    }

    private native void nativePrint();
   
}
