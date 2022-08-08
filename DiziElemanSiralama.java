/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizielemansiralama;

import com.sun.jdi.connect.spi.TransportService;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class DiziElemanSiralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz:");
        int boyut=input.nextInt();
        System.out.println("Dizinin Elemanlarini Giriniz:");
        int[]liste=new int[boyut];
        for(int i=0;i<boyut;i++){
            System.out.print((i+1)+". Elemani:");
            liste[i]=input.nextInt();
        }
        
        
        Arrays.sort(liste);
            
        
        System.out.println(Arrays.toString(liste));
        
    }
    
}
