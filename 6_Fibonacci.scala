package act

object Fibonacci {
  def fibo(n:Int):Int={
    if(n==0){
      return 0;
    }
    else if(n==1){
      return 1;
    }
    else{
      return fibo(n-1) + fibo(n-2);
    }
  }
  
  def main(args:Array[String]){
    print("Enter a number: ");
    var n = scala.io.StdIn.readInt();
    var i=0;
    for(i<- 0 to n){
      print(fibo(i)+" ");
    }
  }
}