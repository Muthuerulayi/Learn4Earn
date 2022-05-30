package com.learn4earn.arrays;

public class ObjectArray {

	public static void main(String[] args) {

		// One Dimensional Object array
		Object obj[] = {1, "Hello", true, 'm'};
		
		System.out.println(obj.length);
		System.out.println(obj[2]);
		
		Object objref[] = new Object[3];
		
		objref[0] = 6;
		//objref[1] = '#';
		objref[2] = "Wow";
		
		System.out.println(objref.length);
		System.out.println(objref[1]);
		System.out.println();

		// Multi Dimensional Object array
		Object objArr[][] = new Object[3][2];
		
		objArr[0][0] = "Name";
		objArr[0][1] = true;
		objArr[1][0] = 'A';
		objArr[1][1] = 35f;
		objArr[2][0] = 24L;
		objArr[2][1] = 40d;
		
		for(int row =0; row < objArr.length; row++) {
			for(int col = 0; col < objArr[0].length; col++) {
				//System.out.print(row + " " + col + " ");
				System.out.print(objArr[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
