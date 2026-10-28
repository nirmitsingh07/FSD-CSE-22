class Bank{
    float balance=10000.0f;
    synchronized void withdraw(float amount){
        System.out.println(Thread.currentThread().getName()+"money withdrawl");
        if(balance>=amount){

            balance=balance-amount;
            System.out.println("Current balance="+balance);
        }
        else{
            System.out.println("insufficient balance");
        }
    }
}
class MyThread extends Thread{
    Bank b;
    float amount;
    MyThread(Bank b,float amount,String name){
        super(name);
        this.b=b;
        this.amount=amount;
    }
    public void run(){
        b.withdraw(amount);
    }
}
public class BankThreadEx {
    static void main(String args[]) {
        Bank b=new Bank();
        MyThread t1=new MyThread(b,7000,"Thread1");
        MyThread t2=new MyThread(b,3000,"Thread2");
        t1.start();
        t2.start();

    }
}
