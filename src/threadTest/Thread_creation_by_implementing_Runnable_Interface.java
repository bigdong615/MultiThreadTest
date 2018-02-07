package threadTest;

public class Thread_creation_by_implementing_Runnable_Interface implements
		Runnable {
	final Bank bank = new Bank();

	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			bank.addMoney(100);
			bank.lookMoney();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {

		Thread_creation_by_implementing_Runnable_Interface obj = new Thread_creation_by_implementing_Runnable_Interface();

		Thread t = new Thread(obj);

		t.start();
		
		//OPTIMAL METHOD
		
		//(new Thread(new Thread_creation_by_implementing_Runnable_Interface())).start();

	}
}