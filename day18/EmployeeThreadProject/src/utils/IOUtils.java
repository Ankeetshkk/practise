package utils;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import core.Emp;

public class IOUtils {
	private PrintWriter pw;

	public IOUtils(String file) throws Exception {
		pw = new PrintWriter(new FileWriter(file));
	}

	public void cleanUp() {
		if (pw != null)
			pw.close();
	}

	public void writeData(List<Emp> l1) {
		l1.forEach(e -> {
			try {
				pw.println(e);
				Thread.sleep(50);
			} catch (Exception e1) {
				System.out.println("err in " + Thread.currentThread().getName() + " " + e1);
			}

		});
	}

}