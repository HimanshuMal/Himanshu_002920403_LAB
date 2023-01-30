/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author 18572
 */
public class ArrayProblem {
    
     static int arr[] = {10,20,30,40,50} ;
   public static void main(String []args)
   {   
       
       System.out.println("Input Array ") ;
   
      for(int i=0 ; i<arr.length ; i++)
      {
        System.out.print(arr[i]+" ");
      }
       System.out.println();
   
    for(int i=0; i<arr.length;i++)
    {
      if(i%2==0)
      {
        arr[i] = arr[i]*2 ;
      }
      else
      {
        arr[i] = arr[i]*3 ;
      }
    }
     System.out.println("Output Array ") ;
    for(int i=0 ; i<arr.length ; i++)
    {
       System.out.print(arr[i]+" ");
    }
   
   }
}