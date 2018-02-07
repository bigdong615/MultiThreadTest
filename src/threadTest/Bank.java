package threadTest;

public class Bank {

	//general ledger 
	private int count=0 ;
	//deposit money
	public synchronized void addMoney(int money){
		
		count+=money;
		System.out.println(System.currentTimeMillis() + "存进" + money);
	
	}
	
	//withdraw money
	
	public synchronized void subMoney(int money){
		
		if(count-money<0){
			System.out.println("余额不足");
			return;
		}
		count-=money;
		System.out.println(System.currentTimeMillis() + "取出" + money);
	}
	
	//look money
	public void lookMoney(){
		
		System.out.println("帐户余额"+ count);
		
	}
	
	}


