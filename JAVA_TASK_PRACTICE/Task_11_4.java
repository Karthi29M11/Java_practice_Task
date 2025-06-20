package com.index;

public class Task_11_4 {

	public static void main(String[] args) {

		int[] array1 = {1,2,3,4,5};
		int[] array2 = {1,2,3,4,5};
		
		boolean isEqual = true;
		if(array1.length!=array2.length) {
			isEqual = false;
		}
		else {
			for(int i=0;i<array1.length;i++) {
				if(array1[i] !=array2[i]) {
					isEqual = false;
					break;
				}
			}
		}
		if (isEqual) {
            System.out.println("Two arrays are Equal");
        } else {
            System.out.println("Two arrays are Not Equal");
		
	}

	}
}
