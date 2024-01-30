import java.util.Scanner;

class wrongAge extends Exception{
    wrongAge( String s){
        super(s);
    }
}

class input{
    
    Scanner s=new Scanner(System.in);
}

class father extends input{
    int fage;
    father() throws wrongAge{
        System.out.println("enter the father age:");
        fage=s.nextInt();
        if(fage<0)
        {
            throw new wrongAge("Age cannot be negative:");
        }
    }
    void display2(){
        System.out.println("father age is"+ fage);
    }
}

class son extends father{
   int sage;
   son() throws wrongAge{
    super();
    System.out.println("enter the son age:");
    sage=s.nextInt();
    if(sage>=fage)
        throw new wrongAge("son's age cannot be greater than father's age");
   
    else if(sage<0)
        throw new wrongAge("Age cannot be negative:");
   }

    void display(){
        System.out.println("Son age is "+sage);
    }
}

class Age{
    public static void main(String[] args) {
        try{
            son s=new son();
            s.display();
            s.display2();
        }
        catch(wrongAge e){
            System.out.println("error"+e.getMessage());
        }
    }
}