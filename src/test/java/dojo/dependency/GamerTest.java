package dojo.dependency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.util.ArrayList;

import org.junit.Test;

public class GamerTest {

	/*
	ArrayList<String> checkingString = new ArrayList<String>() {{
		add("1");
		add("2");
		add("Fizz");
		add("4");
		add("Buzz");
	}};
	
	*/
	
	ArrayList<String> result = new ArrayList<String>();
	
	@Test
	public void testCasePlay(){
		new Gamer(new FakeBufferedReader(new InputStreamReader(System.in)),new FizzBuzz(),new FakePrintStream(System.out)).play();
		// assertArrayEquals(result,checkingString);
		// TODO : A proper method for assertion needs to be put in place
		System.out.println(result);
	}
	
	class FakeBufferedReader extends BufferedReader {

		public FakeBufferedReader(Reader in) {
			super(in);
			// TODO Auto-generated constructor stub
		}
		
		public String readLine(){
			return "1,5";
		}
	}
	
	class FakePrintStream extends PrintStream {

	
		public FakePrintStream(OutputStream out) {
			super(out);
			// TODO Auto-generated constructor stub
		}

		public void printf(String s){
			result.add(s);
		}
		
		public void println(String s){
			
		}
	}
}

