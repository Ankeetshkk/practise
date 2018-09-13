package thrds1;

import java.util.List;

public class DeptHandlerTask implements Runnable {
	private IOUtils u;
	private List<Emp> list;
	public DeptHandlerTask(IOUtils u,List<Emp> l1) {
		this.u=u;
		list=l1;
	}

	@Override
	public void run() {
		//invoke IOUtils method
		System.out.println("thrd "+Thread.currentThread().getName()+" strted");
		synchronized(u) {u.writeData(list);}
		System.out.println("thrd "+Thread.currentThread().getName()+" over");

	}

}
