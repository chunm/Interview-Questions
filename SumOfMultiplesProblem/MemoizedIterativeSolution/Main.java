/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3and5memoizediterativesolution;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Michael
 */
public class Main {
    
    public static int sum(int a, int max, Set memo){
        int sum = 0;
        for(int i = 0; i < max; i+=a){
            if(!memo.contains(i)){
                if(i%a==0){
                    memo.add(i);
                    sum+=i;
                }
            }
        }
        return sum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int answer = 0;
        Set<Integer> set = new HashSet<Integer>();
        answer += sum(3, 1000, set);
        answer += sum(5, 1000, set);
        System.out.println(answer);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) );
    }
    
}
