package dojo.legacy;

import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test(expected = IllegalArgumentException.class)
	public void testCaseShouldFailWhenArgumentsBothZero(){
			fizzBuzz.play(0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCaseShouldFailWhenStartIsNegative(){
			fizzBuzz.play(-2, 42);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCaseShouldFailWhenStopIsNegative(){
			fizzBuzz.play(65, -6);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCaseShouldFailWhenArgumentsAreNegative(){
			fizzBuzz.play(-2, -8);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCaseShouldFailWhenStartHigherThanStop(){
			fizzBuzz.play(45, 21);
	}
	
	@Test
	public void testCaseProper(){
		String result[] = new FizzBuzz().play(21, 45);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i] + " ");
		}
	}
	
	@Test
	public void testCase2(){
		String result[] = new FizzBuzz().play(21, 21);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i] + " ");
		}
	}
}
