package arrays;

import java.util.ArrayList;

public class Genomgångarrays {

	public static void main(String[] args) {
		// Array
		int[] intArray = new int[15];
		intArray[0] = 12313;
		intArray[1] = 12589;
		intArray[3] = 890890;
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);

		ArrayList arrayList = new ArrayList();
		int[] intArray2 = { 215, 548, 123123, 66666 };
		System.out.println(intArray2[1]);
		System.out.println(intArray2[2]);

		System.out.println("Length: " + intArray2.length);

		// Araylist
		ArrayList arraylist = new ArrayList();
		arrayList.add(12341);
		arrayList.add(12342);
		arrayList.add(12343);
		arrayList.add(12344);
		arrayList.add(12341);
		arrayList.add(12342);
		arrayList.add(12343);
		arrayList.add(12344);
		arrayList.add(12341);
		arrayList.add(12342);
		arrayList.add(12343);
		arrayList.add(12344);
		arrayList.add(12341);
		arrayList.add(12342);
		arrayList.add(12343);
		arrayList.add(12344);
		System.out.println("Size: " + arrayList.size());
		System.out.println("Get: " + arrayList.get(0));
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Loop Array List(index: " + i + ", Value " + arrayList.get(i) + ")");
		}
			for (int i = 0; i < intArray.length; i++) {
				System.out.println("Loop Array(index: " + i + ", Value " + intArray[i] + ")");
			}
		}
	}

