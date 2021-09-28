/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task4angelina;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Angelina
 */
public class SKTVp20Task4Angelina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        
        for (int i=0; i < array.length; i++) {
            do {
                array[i] = random.nextInt(101);
            } while (array[i]%2==0 || array[i]==0);    
        }
        
        System.out.println("Выводим одномерный массив с нечетными числами:");
        int count = 0;
        
        for(int i=0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
            count++;
            if (count%10==0) {
                System.out.println("");
            }
        }
        
        System.out.println("");
        Arrays.sort(array);
        
        System.out.println("Выводим отсортированный одномерный массив с нечетными числами:");
        int count2 = 0;
        
        for(int i=0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
            count2++;
            if (count2%10==0) {
                System.out.println("");
            }
        }
        
        System.out.println("");
        
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Cреднее арифметическое всех чисел массива: " + (sum/100));
        
    }
    
}
