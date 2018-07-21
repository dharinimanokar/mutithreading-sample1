package samples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class printNames extends Thread {

	public static AtomicInteger threadNo = new AtomicInteger(0);
	
	@Override
	public void run() {
		
		try {
			
			File createFile = new File("C:/Users/TE1/Desktop/PrintFiles/"+Thread.currentThread().getName()+"-"+threadNo.incrementAndGet()+".txt");
			createFile.createNewFile();
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(createFile));
			
			synchronized(WorkerThread.bufferedReader) {
				String line = WorkerThread.bufferedReader.readLine();
				if(line != null)
					  bufferedWriter.write(line);
					  bufferedWriter.close();
	       }
				  
			
		} catch (IOException  e) {
			e.printStackTrace();
		} 

	}

}
