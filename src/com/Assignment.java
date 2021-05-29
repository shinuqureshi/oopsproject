package com;

public class Assignment {

    // crate a method

    public static int  add (String number )
    {
         if (number==null)
              return  0 ;


         else {

              if (number=="-")
              {
                 throw new NegativeArraySizeException();
              }
             String[] items = number.split(",");
             int sum = 0;
             for (int i = 0; i < items.length; i++) {
                 sum += Integer.parseInt(items[i]);

             }
             return  sum ;
         }





//        int sum =  Integer.parseInt(String.valueOf(number.split(",")));

    }

    public   static int remove_dup( int [] nums)
    {
       var index = 0 ;
        for ( var j = index + 1 ; j<nums.length ; j++)
        {
            if (nums[index]!=nums[j])
            {   index ++ ;
                nums[index] = nums[j] ;
            }
        }

        return  index+1 ;
    }

    public static int  max_profit(int[] prices)
    {    var profit = 0 ;
         var buy_on_days    = 0  ;
         var   sell_on_days = 0 ;
          if (prices==null) {
              return 0;
          }
         for(int i = 0 ; i<prices.length ; i++)
         {
           var diff = prices[i] -prices[i-1] ;
            if (diff>0)
                profit +=diff ;
          }

        return   profit;
    }


    // sell and buy stocks

//    Input: [7,1,5,3,6,4]
//    Output: 7
//    Explanation: Buy on day 2 (price = 1) and
//    sell on day 3 (price = 5), profit = 5-1 = 4.
//    Then buy on day 4 (price = 3) and sell on day 5 (price = 6),
//    profit = 6-3 = 3


     public static int  maxProfit( int prices[])
     {

           var diff = 0 ;

            for (int i = 1 ; i<prices.length ; i++ )
            {
              if (prices[i] >prices[i-1])
              {
                  diff += prices[i] -prices[i-1] ;
              }
            }

          return  diff ;
     }



    public static void main(String[] args) {
       int [] nums = {0,0,1,1,1,2,2,3,3,4} ;
       int prices[] = {7,1,5,3,6,4} ;

        System.out.println( Assignment.maxProfit(prices) );

    }



}
