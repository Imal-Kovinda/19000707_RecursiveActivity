package act

object Recur_Seq {
  def seq(n:Int,i:Int=2){
    if(n==0 || n==1){
      println(" ");
    }
    else if(i==n){
      print(n + ", ");
      //println(n + " is a prime number!");
      seq(n-1,i=2);
    }
    else if(n%i==0){
      seq(n-1,i=2);
    }
    else{
      seq(n,i+1);
    }
  }
  
  
  
  def main(args:Array[String]){
    print("Enter a number: ")
    var n=scala.io.StdIn.readInt();
    seq(n);
  }
}