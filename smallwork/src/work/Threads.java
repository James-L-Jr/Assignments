package work;

public class Threads {
	public static void main(String[] args) {
		int i;
		long clock1;
		long clock2;
		//long clock3;
		long multiThreadTime;
		long singleThreadTime;
		//long noThreadTime;
		
		TaskOne task1 = new TaskOne();
		TaskTwo task2 = new TaskTwo();
		TaskThree task3 = new TaskThree();
		
		System.out.println("Hello. Let's begin.\n");
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);
		
		clock1 = System.nanoTime();
		t1.start();
		t2.start();
		multiThreadTime = System.nanoTime() - clock1;
		
		clock2 = System.nanoTime();
		t3.start();
		singleThreadTime = System.nanoTime() - clock2;
		
		//clock3 = System.nanoTime();
		//filler spot
		//noThreadTime = System.nanoTime() - clock3;
		
		try { Thread.sleep(1000); } catch(Exception e) {}
		System.out.println("\nMulti: " + multiThreadTime + "\nSingle: " + singleThreadTime);
	}
}

class TaskOne implements Runnable{
	public void run() {
		int j;
		for(int i = 0; i < 50000; i++) {
			j = i;
			//System.out.print(i);
			//try { Thread.sleep(1000); } catch(Exception e) {}
		}
	}
}

class TaskTwo implements Runnable{
	public void run() {
		int j;
		for(int i = 50000; i < 100000; i++) {
			j = i;
			//System.out.print(i);
			//try { Thread.sleep(1000); } catch(Exception e) {}
		}
	}
}

class TaskThree implements Runnable{
	public void run() {
		int j;
		for(int i = 0; i < 100000; i++) {
			j = i;
			//System.out.print(i);
			//try { Thread.sleep(1000); } catch(Exception e) {}
		}
	}
}
