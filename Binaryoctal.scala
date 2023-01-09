object Binaryoctal
{
	def binary(num:Int)
	{
		var bstr=" ";//binary String
		var rem=0;	
		//print("Binary of "+num);
		var n1=num;
		while(n1>0)
		{
			rem=n1%2;
			n1=n1/2;
			bstr= rem+bstr;
		}
	println("Binary of "+num+" is "+bstr);
	}
	def octal(num:Int)
	{
		var ostr=" ";//binary String
		var rem=0;
		var n1=num;
		while(n1>0)
		{
			rem=n1%8;
			n1=n1/8;
			ostr= rem+ostr;
		}
		println("Octal of "+num+" is "+ostr);
	}


	
def main(args:Array[String])
{
	var i=0;
	val r=new scala.util.Random;
	for(i<-1 to 5)
	{
		binary(r.nextInt(15))
		octal(r.nextInt(15))
	}
}
}
