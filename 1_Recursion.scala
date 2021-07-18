package act

object Recursion {
  def prime(n:Int,i:Int=2):Boolean={
    if(n==0 || n==1){
      return false;
    }
    else if(i==n){
      return true;
    }
    else if(n%i==0){
      return false;
    }
    return prime(n,i+1);
  }
  
  def main(args:Array[String]){
    print("Enter a number: ")
    var n=scala.io.StdIn.readInt();
    if(prime(n)){
      println("True");
    }
    else{
      println("False");
    }
  }
}