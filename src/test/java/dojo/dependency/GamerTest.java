package dojo.dependency;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GamerTest {

	List<String> checkingString = new ArrayList<String>() {{
		add("1");
		add("2");
		add("Fizz");
		add("4");
		add("Buzz");
	}};
		
	List<String> result = new ArrayList<String>();
	
	private Gamer gamer = new Gamer(new FakeBufferedReader(new InputStreamReader(System.in)),new FizzBuzz(),new FakePrintStream(System.out));
	
	@Test
	public void testCasePlay() throws FileNotFoundException{
		gamer.play();
		assertEquals(result,checkingString);
		
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

		public FakePrintStream(PrintStream ps) {
			super(ps,true);
			// TODO Auto-generated constructor stub
		}

		@Override
		public PrintStream printf(String format, Object... objects){
			for (int i = 0; i < objects.length ; i++){
				result.add(objects[i].toString());
			}
			return null;
		}
		
		@Override
		public void println(String s){
			// super.println(s);
		}
		
		
	}
}

