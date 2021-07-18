package act

object AddEven {
  var evAdd = 0;
  def add(n:Int){
    if(n>0){
      if(n%2==0){
        evAdd += n;
        add(n-1);
      }
      else{
        add(n-1);
      }
    }
    else{
      println("Addition of Even numbers: " + evAdd);
    }
  }
  
  
  def main(args:Array[String]){
    print("Enter a number: ");
    var k = scala.io.StdIn.readInt();
    add(k);
  }
}