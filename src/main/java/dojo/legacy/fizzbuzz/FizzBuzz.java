package dojo.legacy.fizzbuzz;

public class FizzBuzz {
	 public String[] play(int start, int stop) {
		 if (start > 0 && start <= stop) {
		     int length = stop - start + 1;
		     String[] result = new String[length];
		     for (int i = 0; i < length; i++) {
		        int currentNumber = start + i;
		        result[i] = "";
				if (isDivisibleBy(currentNumber,3)) {
					result[i]+="Fizz";
		        }
				if (isDivisibleBy(currentNumber,5)) {
					result[i]+="Buzz";
		        } 
				if (isDivisibleBy(currentNumber,7)){
					result[i]+="Flipp";
				}
		        if (isDivisibleBy(currentNumber,11)){
		                 result[i]+="Flopp";
		        }
		        if(result[i].isEmpty()){
		        	result[i] += "" + currentNumber; 
		        }
		     }
		     return result;
		 } else {
		     throw new IllegalArgumentException();
		 }
	 }
	 
	 private boolean isDivisibleBy(int dividend, int divisor){
		return (dividend % divisor == 0)?true:false;
	 }
}