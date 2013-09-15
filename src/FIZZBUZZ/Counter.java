package fizbuz;

public class Counter {
	public Counter (){
		int number=1;
		do {
			if(((number % 3)==0)&&((number % 5)==0))echo("FIZZBUZZ");
			else if((number % 3)==0 )echo("FIZZ");
			else if((number % 3)==0 )echo("BUZZ");
			else echo(Integer.toString(number));
			number++;
		}while(number<=100);
	
	}
	private void echo(String printLine ){
		System.out.println(printLine);
	}
}
