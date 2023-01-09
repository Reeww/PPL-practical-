abstract class Shape
{
	def volume():Double;
	def display();
}

class Cylinder(var r:Int,var h:Int) extends Shape
{
	def volume():Double=
	{
		return 3.14*r*r*h;	
	}

	def display()
	{
		println("Volume Cylinder :"+volume());
	}
}

class Cube(var s:Int) extends Shape
{
	def volume():Double=
	{
		return s*s*s;
	}

	def display()
	{
		println("Volume of cube:"+volume());
	}
}

object Shapes
{
	def main(args:Array[String])
	{
		val cyl=new Cylinder(1,1);
		cyl.display();
		
		val cub=new Cube(3);
		cub.display();
	}
}		
		
