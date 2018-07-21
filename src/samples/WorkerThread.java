package samples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread{
	public static int noOfThreads = 3;
	public static  BufferedReader bufferedReader;
	public static void main(String[] args) 
	{
		try {
			
		 ExecutorService executor = Executors.newFixedThreadPool(noOfThreads);
		 clearDirectory(); 
		 bufferedReader = new BufferedReader(new FileReader("C:/Users/TE1/Desktop/File_Worker_Thread.txt"));
		 for (int i = 0; i < 5; i++) {  
	            Thread worker = new printNames(); 
	            executor.execute(worker);//calling execute method of ExecutorService  
	     }  
	     executor.shutdown();  
	      while(!executor.isTerminated()) {
	    	  
	      }
	   
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void clearDirectory() {
		File directory = new File("C:/Users/TE1/Desktop/PrintFiles");
		for(File f: directory .listFiles()) 
			  f.delete();
	}
}
