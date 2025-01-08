package OOPS;

	class Pen{
		
		String color;
		int tip;
		
		void changeColor(String newColor){
			color = newColor;
		}
		
		void changeTip(int newTip){
			tip = newTip;
		}
		
	}

	class Student{
		
		int phy = 30;
		int chem = 50;
		int bio = 60;
		int perc;
		
		void per(int chem,int phy,int bio){
		
		 perc = (phy + chem + bio)/3;
		//System.out.println(per);
		}
		
	}

	public class ClassAndObject {
		
		public static void main(String[] args) {
		
			Pen p1 = new Pen();
			p1.changeColor("blue");
			System.out.println(p1.color);
			
			Student s1 = new Student();
			s1.per(30, 40, 10);
			System.out.println(s1.perc);
			
			
		}

	}
