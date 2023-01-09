object Stringop
{
	def main(args:Array[String])
	{
		var str1:Set[String]=Set("Hello","good","Morning");
		var str2:Set[String]=Set("Hello","good","night");
		var str3=str1.diff(str2);
		println("First Set"+str1);
		println("Second Set"+str2);
		println("str1-str2"+str3);
		var str4=str2.diff(str1);
		println("str2-str1"+str4);
		str3++=str4;
		println("Merged Set "+str3)
	}
}
