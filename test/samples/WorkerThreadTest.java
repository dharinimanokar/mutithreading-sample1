package samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;


class WorkerThreadTest {

	@Test
	void testMain() throws IOException{
	    WorkerThread.main(null);
	    File directory = new File("C:/Users/TE1/Desktop/PrintFiles");
		assertEquals(directory.listFiles().length ,5);
	}

}
