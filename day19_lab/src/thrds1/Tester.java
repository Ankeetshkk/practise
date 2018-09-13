package thrds1;

import java.util.List;
import java.util.Scanner;
import static thrds1.CollectionUtils.*;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get lists of emps
			List<List<Emp>> allEmps = populateData();
			System.out.println("Enter file names to store dept wise data");
			// create IOUtils insts
			IOUtils u1 = new IOUtils(sc.next());
			// create n start thrds
			Thread t1 = new Thread(new DeptHandlerTask(u1, allEmps.get(0)));
			Thread t2 = new Thread(new DeptHandlerTask(u1, allEmps.get(1)));
			Thread t3 = new Thread(new DeptHandlerTask(u1, allEmps.get(2)));
			t1.start();t2.start();t3.start();
			//wait till child thrds finish exec
			t1.join();t2.join();t3.join();
			//clean up
			u1.cleanUp();
			System.out.println("main over....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
