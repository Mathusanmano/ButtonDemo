package episode10;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]guns = {"AKM","AK","AUG","Groza","M416"};
		System.out.println(guns[4]);
		System.out.println(guns[0]);
		System.out.println(guns[1]);
		System.out.println(guns.length);
		
		System.out.println(Arrays.toString(guns));
		
		int[]a = new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		
	}

}
