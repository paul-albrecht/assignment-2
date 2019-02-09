/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author paul
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ninety_Nine_Bottles_of_Beer();
        
    }
    
    public static void 	Ninety_Nine_Bottles_of_Beer() {
        // TODO code application logic here
        System.out.println("Starting the beer song");
        int beer = 99;
        
        while (beer >0){
        System.out.println(beer + " bottles of beer on the wall");
        System.out.println(beer + " bottles of beer.");
        System.out.println("Take one down.");
        System.out.println("Pass it around.");
        beer --;
        
        
        
        
        }
        
        System.out.println("No more bottles of beer on the wall :(");
    }
    
}
