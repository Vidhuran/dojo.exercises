package dojo.dependency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Gamer {

    public static void main(String... args) {
            new Gamer(new BufferedReader(new InputStreamReader(System.in)),new FizzBuzz(),new PrintStream(System.out)).play();
    }

	private BufferedReader br;
	private FizzBuzz fizzBuzz;
	private PrintStream out;

    public Gamer(BufferedReader br, FizzBuzz fizzBuzz, PrintStream out){
    	this.br = br;
    	this.fizzBuzz = fizzBuzz;
    	this.out = out;
    }
    
    public void play() {
            String input = read();
            // FizzBuzz fizzBuzz = new FizzBuzz();
            int pos = input.indexOf(',');
            int start = Integer.parseInt(input.substring(0, pos));
            int stop = Integer.parseInt(input.substring(pos + 1));
            for (String element : fizzBuzz.play(start, stop)) {
                    out.printf("%s", element);
            }
    }

    public String read() {
            out.println("fizz buzz: ");
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                    return br.readLine();
            } catch (IOException ioe) {
                    return null;
            }
    }
}