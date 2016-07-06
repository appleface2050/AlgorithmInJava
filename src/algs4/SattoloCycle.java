//package algs4;

import java.util.Random;

/**
 * Created by Andy on 2016/7/6.
 */

/**
 * Created by Andy on 2016/7/5.
 */
public class SattoloCycle {
    public  SattoloCycle( int[] items){
//        System.out.println(a);
        int i = items.length;
        while ( i > 1){
            i--;
            Random r = new Random();
            int j = r.nextInt(i);
            int tmp = items[i];
            items[i] = items[j];
            items[j] = tmp;
        }
        for(int q=0;q<items.length;q++){
            System.out.println(items[q]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        SattoloCycle sc = new SattoloCycle(a);
    }

}
