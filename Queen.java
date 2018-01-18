import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Queen extends Pieces{
	
	public static boolean validate(String color, int[] from, int[] to){

		return Rook.validate(color, from, to) || Bishop.validate(color, from, to);
	}

	public static boolean checkUnitCollision(int[] from, int[] to){
		return Bishop.checkUnitCollision(from, to) || Rook.checkUnitCollision(from, to); 
	}


	public String toString(){
		return "";
	}

}