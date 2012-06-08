package dojo.legacy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import dojo.legacy.fizzbuzz.FizzBuzz;

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
		String result[] = new String[]{"1","2","Fizz","4","Buzz","Fizz","Flipp","8","Fizz","Buzz","Flopp"};
		assertArrayEquals(fizzBuzz.play(1,11),result);
	}
	
	@Test
	public void testCaseLargeValues(){
		String result[] = new String[]{"FizzFlipp","Flopp","23","Fizz","Buzz","26","Fizz","Flipp","29","FizzBuzz","31","32","FizzFlopp","34","BuzzFlipp"};
		assertArrayEquals(fizzBuzz.play(21,35),result);
	}
	
	@Test
	public void testCaseDivisiblityFor55(){
		String result[] = new String[]{"BuzzFlopp","Flipp"};
		assertArrayEquals(fizzBuzz.play(55,56),result);
	}
	
	@Test
	public void testCaseDivisiblityFor77(){
		String result[] = new String[]{"FlippFlopp","Fizz"};
		assertArrayEquals(fizzBuzz.play(77,78),result);
	}
	
	@Test
	public void testCaseDivisiblityFor1155(){
		String result[] = new String[]{"FizzBuzzFlippFlopp"};
		assertArrayEquals(fizzBuzz.play(1155,1155),result);
	}
}
