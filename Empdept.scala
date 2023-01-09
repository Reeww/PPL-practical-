//output included

class Emp(var ename:String,var dept:String){}

object Empdept 
{
	def main(args:Array[String])
	{
		val e1=new Emp("Mr.Satish","Computer Science");
		val e2=new Emp("Mr.Joshi","Computer Science");
		val e3=new Emp("Mrs.Jadhav","Maths");
		val e4=new Emp("Mrs.Meena","Maths");
		val e5=new Emp("Mr.Daya","Statistics");
		var m1:Map[Int,Emp]=Map(1->e1,2->e2,3->e3,4->e4,5->e5);
		
		println("----------------Employee Department Data--------------")
		for((k,v)<-m1)
		{
		 println("Employee - "+v.ename+" Department - "+v.dept)
		}
		println("-------------------------------------------------------")
		println("")
		for((k,v)<-m1)
		{
			//v.print()
			if(v.ename=="Mr.Joshi")
			{
				var dname : String = v.dept
				println("------Employee Working in Same Department as Mr. Joshi------")
				for((k,v)<-m1)
				{
					
					if(v.dept==dname)
					{
						println("Employee :"+v.ename+"\t Works in "+v.dept)
					}
				}
			}
			
			
			
		}
		
	}
}


/*
		OUTPUT
		
ajaz@ajaz-VirtualBox:~/Desktop/Scala/Solved Slips/Slip 1-5$ scalac Empdept.scala
warning: 1 deprecation (since 2.13.0); re-run with -deprecation for details
1 warning
ajaz@ajaz-VirtualBox:~/Desktop/Scala/Solved Slips/Slip 1-5$ scala Empdept
----------------Employee Department Data--------------
Employee - Mr.Daya Department - Statistics
Employee - Mr.Satish Department - Computer Science
Employee - Mr.Joshi Department - Computer Science
Employee - Mrs.Jadhav Department - Maths
Employee - Mrs.Meena Department - Maths
-------------------------------------------------------

------Employee Working in Same Department as Mr. Joshi------
Employee :Mr.Satish	 Works in Computer Science
Employee :Mr.Joshi	 Works in Computer Science

*/
