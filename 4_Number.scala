package act

object Number {
  def num(n:Int){
    if(n%2==0){
      println(n + " is an Even number");
    }
    else{
      println(n + " is an Odd number");
    }
  }
  
  def main(args:Array[String]){
    print("Enter a number: ");
    var k = scala.io.StdIn.readInt();
    num(k);
  }
}