package act

object Addition {
  var add = 0;
  def sum(n:Int):Int={
    if(n>0){
      add = add + n;
      sum(n-1);
    }
    else{
      return add;
    }
    
  }
  
  def main(args:Array[String]){
    print("Enter a number: ");
    var n = scala.io.StdIn.readInt();
    println(sum(n));
  }
}