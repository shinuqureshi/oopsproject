package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Main main = new Main();
        System.out.println(main.reverse_string("Dummy"));
        System.out.println(main.palindrome_string("mom"));
        int [] nums = {10,5,2,3};
        main.search_double_of_num(nums) ;
        

    }


    public int remove_duplicate_sorted_array(int []numbers)
    {
        var i = 0 ;
        for (var j = 1;  j<numbers.length;j++)
        {
            if (numbers[i]!=numbers[j])
            {
                i++ ;

                numbers[i] = numbers[j] ;
            }
        }
        return i+1;
    }

    public String  reverse_string(String str)
    {
        String temp ="" ;

        if(str==null)

            return   null ;
        for (var i = str.length()-1 ; i>=0 ; i--)
        {
            temp = temp+str.charAt(i) ;
        }

        return  temp ;
    }

    public  String palindrome_string(String str)
    {
        String palindrome = " ";


        if (str==null)
            return  null ;
        for (var i = str.length()-1 ; i>0 ; i--)
        {
            palindrome = palindrome +str.charAt(i) ;
        }


         if (palindrome.equals(str)) {
             return "string are palindrome";
         }
         else
             return "string are not palindrome" ;

     }

     //   write solution to convert string to interger

    public int  convert_string(String str)
    {
        int len = str.length() ;
        int index = 0 ;
         var neg_flag = true ;
         var result =0 ;
         var fact = 1 ;

        var first_char = str.charAt(index) ;
         if (first_char< '0')
         {
             if (first_char=='-')

                 neg_flag = true ;


             else if (first_char!='+') throw  new NumberFormatException();

             index ++ ;

         }
          for (var i = str.length()-1; i>=0 ;i--)
          {
              result = (str.charAt(i)-'0') * fact ;
              fact*=10 ;
          }
        return   neg_flag?-1*result:result;

    }

    // search double of  nums like int [] nums = {10,5,2,3}
     // {1,2,3,4} ,{1,2,3}
    public boolean search_double_of_num(int[]number)
    {
        Set<Integer> numbers = new HashSet<>() ;
        for (int i = 0 ; i< number.length ; i++)
        {
            if (numbers.contains(number[i]*2) || ( number[i]%2 ==0 && numbers.contains(number[i]/2)))
            {
                return true ;
            }
            numbers.add(number[i]);


        }

        return  false ;
    }




}

