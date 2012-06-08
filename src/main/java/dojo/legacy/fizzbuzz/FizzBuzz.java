package dojo.legacy.fizzbuzz;

public class FizzBuzz {
	 public String[] play(int start, int stop) {
		 if (start > 0 && start <= stop) {
		     int length = stop - start + 1;
		     String[] array = new String[length];
		     for (int i = 0; i < length; i++) {
		        int seriesValue = start + i;
		        array[i] = "";
				if (divideByTester(seriesValue,3)) {
					array[i]+="Fizz";
		        }
				if (divideByTester(seriesValue,5)) {
					array[i]+="Buzz";
		        } 
				if (divideByTester(seriesValue,7)){
					array[i]+="Flipp";
				}
		        if (divideByTester(seriesValue,11)){
		                 array[i]+="Flopp";
		        }
		        if(array[i].length() == 0){
		        	array[i] += "" + seriesValue; 
		        }
		     }
		     return array;
		 } else {
		     throw new IllegalArgumentException();
		 }
	 }
	 
	 private boolean divideByTester(int dividend, int divisor){
		return (dividend % divisor == 0)?true:false;
	 }
}