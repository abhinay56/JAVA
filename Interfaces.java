interface Payment {
    void pay();
        
}
class Upi implements Payment {
    public void pay() {
        System.out.println("Transaction is successfull completed using UPI");
    }
}
class CreditCard implements Payment {
    public void pay() {
        System.out.println("Transaction is successfull completed using CreditCard");
    }
}
class NetBanking implements Payment {
    public void pay() {
        System.out.println("Transaction is successfull completed using NetBanking");
    }
}
public class Interfaces
{
	public static void main(String[] args) {
		Upi u = new Upi();
		u.pay();
		CreditCard c = new CreditCard();
		c.pay();
		NetBanking n = new NetBanking();
		n.pay();
	}
}