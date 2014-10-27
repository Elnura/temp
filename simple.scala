object Simple {
/*
 * HW-01
 * Elnura Arslan 180201039
 */

def main(args: Array[String]) {
      val numList = Array(1,2,3);
      val result1=(x:Int) => x*2
      val result2=(x:Int) => x*3
      
      for( a <- numList ){
         if(a%2 == 0) println(result1(a)) else println(result2(a))
      } 
   }
 
 
} 

