/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3and5simpleiterativesolution;

/**
 *
 * @author Michael
 */
public class Main {

    public static int sum(int a, int b, int max){
        int sum = 0;
        
        for(int i = 0; i < max; i++){
            if(i%a==0||i%b==0){
                sum+=i;
            }
        }
        
        return sum;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        System.out.println(sum(3, 5, 1000));
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) );
    }
    
}
