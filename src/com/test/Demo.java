package com.test;

public class Demo {

// duplicate array problem


    public static void main(String[] args) {

        int numbers[] = {0,0,1,1,1,2,2,3,3,4};
        Demo demo = new Demo();
        demo.get_duplicate_array(numbers);

        



    }


    public int get_duplicate_array(int []num )
    {
        int index = 0 ;
       // int count = 0 ;
         for (int j = index+1 ;j<num.length;j++)
         {
             if (num[index]!=num[j])
             {
                 index++ ;
                 num[index] = num[j] ;
             }

         }

        return index+1 ;
    }






}
