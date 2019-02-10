package day1;

import org.testng.annotations.Test;

public class Day1Coding {

	@Test
	public void test001() {
		System.out.println("Hello, World!");
		
	}

	@Test
	public void test002() {
		String helloText = "text";
		System.out.println(helloText);
		
	}
	
	@Test
	public void test003() {
	boolean b;
	boolean toBe = false;
	
	b = toBe || !toBe;
	if (b) {
	    System.out.println(toBe);
	}

	}
	
	@Test
	public void test006() {
		boolean isElementVisible =true;
		
		if(isElementVisible) {
		System.out.println("click element");
		}
		else {
			System.out.println("element is not visible");
		}
	
	}
	
	@Test
	public void printEvenNumbers() {
		
		int arr[]= {
	            951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544, 
	            615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941, 
	            386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345, 
	            399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217, 
	            815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717, 
	            958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470, 
	            743, 527};
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]==237)
			{
				break;
			}
			int arrB = arr[i]%2;
			if (arrB==0)
			{
				System.out.println(arr[i]);
			}
			
		}
		
		
	}
	
	@Test
	public void printEvenNumbersFromWebsite() {
		
		int[] numbers = {
	            951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544, 
	            615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941, 
	            386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345, 
	            399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217, 
	            815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717, 
	            958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470, 
	            743, 527};
	        
	        for (int i = 0; i < numbers.length; i++) {
	            int el = numbers[i];

	            if (el == 237) {
	                break;
	            }

	            // using the division remainder operator %
	            if (el % 2 == 0) {
	                System.out.println(el);
	            }

	        }
	    }
		
		
	}

