import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;



public class flash{
	public static void QA(){
		try{
		File myobj = new File("Questions.txt");
		if(myobj.createNewFile()){
			//System.out.println("file created"+ myobj.getName());
		}
		else{
			//System.out.println("file already exists");
		}
	}catch(IOException e){
		System.out.println("error");
	}
	}
	public void addquestions(){
		try{
	
        FileWriter writing = new FileWriter("Questions.txt");
        
        	writing.write("What is Java?"+"\n");
        	writing.write(" What are the main features of Java?"+"\n");
        	writing.write("What is a Constructor in Java?"+"\n");
        	writing.write("What is the Java Virtual Machine (JVM)?"+"\n");
        	writing.write("What is the difference between ArrayList and LinkedList?"+"\n");
        	writing.close();
        //System.out.println("written to questions.txt");

		}catch(IOException e){
			//System.out.println("file doesn't exist");
		}
	}
	public void answers(){
		try{
		File answers = new File("answers.txt");
		if(answers.createNewFile()){
			//System.out.println("answers.txt added"+answers.getName());
		}
		else{
			//System.out.println("file already exists");
		}
}catch(IOException e){
	System.out.println("error");
}
	}
	public void addanswers(){
		try{
		FileWriter add = new FileWriter("answers.txt");
		add.write("Java is a high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. It is platform-independent due to its write once, run anywhere capability."+"\n"+"\n");
        add.write("Object-Oriented,Platform Independent,Robust and Secure,Multithreaded,High Performance (via JIT compiler),Portable and Distributed"+"\n"+"\n");
        add.write("A constructor is a special method used to initialize objects. It has the same name as the class and does not have a return type."+"\n"+"\n");
        add.write("The JVM is a runtime environment in Java that executes bytecode. It acts as an interpreter between the compiled Java code and the machine code of the operating system."+"\n"+"\n");
        add.write("ArrayList: Uses a dynamic array, faster for accessing elements. while LinkedList: Uses a doubly linked list, faster for insertions and deletions."+"\n"+"\n");
        add.close();
        //System.out.println("added the answers successfully");
}catch(IOException e){
	System.out.println("error");
}
	}
	public void questionanswer(){
		try{
			System.out.println("please type in your answer for the following question");
		Scanner scan = new Scanner (System.in);
		File myobj = new File("Questions.txt");
		File myobj2 = new File("answers.txt");
		Scanner scan1 = new Scanner(myobj);
		Scanner scan2 = new Scanner(myobj2);
		while(scan1.hasNextLine()){
			System.out.println(scan1.nextLine());
			
		     String ans = scan.next();
		     if(ans == scan2.nextLine()){
		     	System.out.println("correct");
		     }
		     else{
		     	System.out.println("not correct");
		     }
		     System.out.println(scan1.nextLine());
		     	
		     String ans1 = scan.next();
		     if(ans1 == scan2.nextLine()){
		     	System.out.println("correct");
		     }
		     else{
		     	System.out.println("not correct");
		     }
		     System.out.println(scan1.nextLine());
		     	
		     String ans2 = scan.next();
		     if(ans2 == scan2.nextLine()){
		     	System.out.println("correct");
		     }
		     else{
		     	System.out.println("not correct");
		     }
		     System.out.println(scan1.nextLine());
		     	
		     String ans3 = scan.next();
		     if(ans3 == scan2.nextLine()){
		     	System.out.println("correct");
		     }
		     else{
		     	System.out.println("not correct");
		     }
		     System.out.println(scan1.nextLine());
		     	
		     String ans4 = scan.next();
		     if(ans4 == scan2.nextLine()){
		     	System.out.println("correct");
		     }
		     else{
		     	System.out.println("not correct");
		     }
		     }
		}catch(FileNotFoundException e){
			System.out.println("error");
		}
		

        }
	

	public static void main(String [] args){
  flash card = new flash();
  card.QA();
  card.addquestions();
  card.answers();
  card.addanswers();
  card.questionanswer();
	}
}