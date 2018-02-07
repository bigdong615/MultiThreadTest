package threadTest;

public class Bank {

	//general ledger 
	private int count=0 ;
	//deposit money
	public synchronized void addMoney(int money){
		
		count+=money;
		System.out.println(System.currentTimeMillis() + "���" + money);
	
	}
	
	//withdraw money
	
	public synchronized void subMoney(int money){
		
		if(count-money<0){
			System.out.println("����");
			return;
		}
		count-=money;
		System.out.println(System.currentTimeMillis() + "ȡ��" + money);
	}
	
	//look money
	public void lookMoney(){
		
		System.out.println("�ʻ����"+ count);
		
	}
	
	}


