import java.util.*;
class account{
    
    String customer_name;
    int acc_no;
    String type;
    double balance;
  
    
    account(String name,int no,String type,double balance){
        customer_name=name;
        acc_no=no;
        this.type=type;
        this.balance=balance;

    }
    void deposit(double amount){
        balance+=amount;
    }
    void withdraw(double amount){
        if((balance-amount)>0){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void display(){
        System.out.println("Name:"+customer_name+"\n"+"account number:"+acc_no+"\n"+"Type:"+type+"\n"+"Balance:"+balance);
    }
}
class sav_acc extends account{
    private static double rate=2;
    sav_acc(String name,int acc_no,double balance)
    {
    super(name,acc_no,"savings",balance);
    }
    void interest()
    {
        balance+=balance*(rate)/100;
        System.out.println("balance:"+balance);
    }
}
class curr_acc extends account{
    curr_acc(String name,int acc_no,double balance)
    {
    super(name,acc_no,"current",balance);
    }
    private double minbal=250;
    private double servicecharge=100;
    void checkmin(){
        if(balance<minbal){
            System.out.println("Insufficient balance so serivce charges are subtracted from your balance amount");
            balance-=servicecharge;
            System.out.println("Balance is:"+balance);
        }
    }
}

public class bank {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("SHREE VARNA M:");
        System.out.println("1BM22CS263");
        System.out.println("enter the name :");
        String name=s.next();
        System.out.println("enter the type(current/savings):");
        String type=s.next();
        System.out.println("enter the account number:");
        int acc_no=s.nextInt();
        System.out.println("enter the intial balance:");
        double balance=s.nextDouble();
        int ch;
        double amount1,amount2;
        account acc=new account(name,acc_no,type,balance);
        sav_acc sa=new sav_acc(name,acc_no,balance);
        curr_acc ca=new curr_acc(name,acc_no,balance);
        while(true)
        {
            if(acc.type.equals("savings"))
            {
                System.out.println("\nMenu\n1.Deposit 2.Withdraw 3.Interest 4.Display");
                System.out.println("enter the choice:");
                ch=s.nextInt();
                switch(ch)
                {
                    case 1:System.out.println("enter the amount:");
                        amount1=s.nextInt();
                        sa.deposit(amount1);
                        break;
                    case 2:System.out.println("enter the amount:");
                        amount2=s.nextInt();
                        sa.withdraw(amount2);
                        break;
                    case 3:sa.interest();
                        break;
                    case 4:sa.display();
                        break;
                    default:System.out.println("invalid input");
                            System.exit(0);
                }
            }
            else
            {
                System.out.println("\nMenu\n1.Deposit 2.Withdraw  3.Display");
                System.out.println("enter the choice:");
                ch=s.nextInt();
                switch(ch)
                {
                    case 1:System.out.println("enter the amount:");
                            amount1=s.nextInt();
                            ca.deposit(amount1);
                            break;
                    case 2:System.out.println("enter the amount:");
                            amount2=s.nextInt();
                            ca.withdraw(amount2);
                            ca.checkmin();
                            break;

                    case 3:ca.display();
                            break;
                    default:System.out.println("invalid input");
                            System.exit(0);

                }
            }
        }
    }
}


