package session4Assignment3;

public class reverseStr {

	public static void main(String[] args) {
		 String original = "Acadgild";
		 String reverse = "";
		//length = 8
		int length = original.length();
		//for loop initialized to last index value of original
		for (int index = length - 1; index>=0;index--){
			reverse = reverse + original.charAt(index);
			
		}
		//realReverse take the last know value referenced by reverse and treats the other 
		//values generated at runtime as garbage
		String realReverse = reverse;
		System.out.println("The reversed String is: "+realReverse);

		
	}
}

