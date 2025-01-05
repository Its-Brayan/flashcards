import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class flash{
	public static void QA(){
		try{
		File myobj = new File("Questions.txt");
		if(myobj.createNewFile()){
			System.out.println("file created"+ myobj.getName());
		}
		else{
			System.out.println("file already exists");
		}
	}catch(IOException e){
		System.out.println("error");
	}
	}


	public static void main(String [] args){
  flash card = new flash();
  card.QA();
	}
}