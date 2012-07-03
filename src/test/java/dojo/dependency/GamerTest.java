package dojo.dependency;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.junit.Test;

public class GamerTest {

	/*
	List<String> expected = new ArrayList<String>() {{
		add("1");
		add("2");
		add("Fizz");
		add("4");
		add("Buzz");
	}};
	*/
	
	StringBuilder sb = new StringBuilder();
	String result = new String();
	
	@Test
	public void testCasePlay() throws FileNotFoundException{
		FakeBufferedReader br = new FakeBufferedReader();
		br.input = "1,5";
		FizzBuzz fizzBuzz = new FizzBuzz();
		FakePrintStream ps = new FakePrintStream();
		Gamer gamer = new Gamer(br,fizzBuzz,ps);
		gamer.play();
		assertEquals("1,2,Fizz,4,Buzz,",result);
		
	}
	
	class FakeBufferedReader extends BufferedReader {
		String input;
		public FakeBufferedReader() {
			super(new InputStreamReader(System.in));
		}
		
		public String readLine(){
			return input;
		}
	}
	
	class FakePrintStream extends PrintStream {

		public FakePrintStream() {
			super(System.out,true);
		}

		@Override
		public PrintStream printf(String format, Object... objects){
			for (Object object : objects){
				sb.append(object);
				sb.append(",");
			}
			result = sb.toString();
			return null;
		}
		
		@Override
		public void println(String s){
			// super.println(s);
		}		
	}
}