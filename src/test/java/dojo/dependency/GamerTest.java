package dojo.dependency;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.junit.Before;
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
	
	private FakeBufferedReader br;
	private Gamer gamer;
	private FakePrintStream ps;
	private String nl = System.getProperty("line.separator");
	
	@Before
	public void setup(){
		br = new FakeBufferedReader();
		FizzBuzz fizzBuzz = new FizzBuzz();
		ps = new FakePrintStream();
		gamer = new Gamer(br,fizzBuzz,ps);
	}
	
	@Test
	public void testCasePlay() throws FileNotFoundException{
		
		br.input = "1,5";
			
		gamer.play();
		assertEquals("fizz buzz: " +nl+ "1 2 Fizz 4 Buzz ",ps.result);
		
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

		private StringBuilder sb = new StringBuilder();
		String result = new String();
		
		public FakePrintStream() {
			super(System.out,true);
		}

		@Override
		public PrintStream printf(String format, Object... objects){
			for (Object object : objects){
				sb.append(object);
				sb.append(" ");
			}
			result = sb.toString();
			return null;
		}
		
		@Override
		public void println(String s){
			sb.append(s + nl);
		}		
	}
}