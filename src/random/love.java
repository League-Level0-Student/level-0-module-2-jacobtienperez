package random;

import org.jointheleague.graphical.robot.Robot;

public class love {

public static void main(String[] args) {
	Robot nani=new Robot();
  nani.penDown();
  nani.setPenColor(500, 0, 0);
  nani.setSpeed(9999999);
  nani.setPenWidth(21);
     nani.setWindowImage("random/maxresdefault (1).jpg");
  for(int i=0; i<180; i++) {
		 nani.move(1);
		 nani.turn(360/360);
		 }
 {
	 nani.turn(45);
	 nani.move(175);
	 nani.turn(90);
	 nani.move(175);
	 nani.setAngle(0);
	 for(int i=0; i<180; i++) {
		 nani.move(1);
		 nani.turn(360/360);
		 
		 
		
		 }
	
	 }
	 nani.setX(200);
	 nani.setY(200);
	 nani.move(210);
 }
}




	


