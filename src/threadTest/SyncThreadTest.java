package threadTest;

public class SyncThreadTest {

	public static void main(String[] args) throws InterruptedException {
		final Bank bank = new Bank();

		Thread tadd = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {

					try {

						Thread.sleep(1000);

					} catch (InterruptedException e) {

						e.printStackTrace();
					}

					bank.addMoney(100);
					bank.lookMoney();
					System.out.println("**********");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		});

		Thread tsub = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {

					try {

						Thread.sleep(1000);

					} catch (InterruptedException e) {

						e.printStackTrace();
					}

					bank.subMoney(100);
					bank.lookMoney();
					System.out.println("**********");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		});

		tsub.start();
		tadd.start();

	}
}
