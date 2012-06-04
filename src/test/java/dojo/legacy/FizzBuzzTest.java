package dojo.legacy;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testCaseZero(){
		try{
			new FizzBuzz().play(0, 0);
			fail();
		}
		catch(IllegalArgumentException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void testCaseNegativeStart(){
		try{
			new FizzBuzz().play(-2, 42);
			fail();
		}
		catch(IllegalArgumentException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void testCaseNegativeStop(){
		try{
			new FizzBuzz().play(65, -6);
		}
		catch(IllegalArgumentException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void testCaseNegative(){
		try{
			new FizzBuzz().play(-2, -8);
		}
		catch(IllegalArgumentException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void testCasePositive(){
		try{
			new FizzBuzz().play(45, 21);
		}
		catch(IllegalArgumentException e){
			assertTrue(true);
		}
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
