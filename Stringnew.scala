object Stringnew
{
	def main(args:Array[String])
	{
		var str:Array[String]=Array("Hello Good Morning","Hello Good Night","Hello Good Afternoon");
		var str1=" ";
		println("Enter string:");
		str1=scala.io.StdIn.readLine();
		var str2=str :+str1;
		for(j<-str2)
		{
			println(j);
		}
	}
}
