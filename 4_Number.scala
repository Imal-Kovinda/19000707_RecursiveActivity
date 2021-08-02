package act

object Number {
  def num(n:Int){
    if(n>0){
      if(n%2==0){
        println(n + " is an Even number");
        num(n-1);
      }
      else{
        println(n + " is an Odd number");
        num(n-1);
      } 
    }
  }
  
  def main(args:Array[String]){
    print("Enter a number: ");
    var k = scala.io.StdIn.readInt();
    num(k);
  }
}
