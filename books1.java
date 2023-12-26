import java.util.*;
class books{
	String name; 
	String author;
	int price;
	int numpages;
	books(String name,String author,int price,int numpages)
	{	
		this.name=name;
		this.author=author;
		this.price=price;
		this.numpages=numpages;
	}
public String toString()
{
	String name,author,price,numpages;
	name="Book name:"+this.name+"\n";
	author="Author name:"+this.author+"\n";
	price="price:"+this.price+"\n";
	numpages="number of pages:"+this.numpages+"\n";
	return name+author+price+numpages;
}	
}
public class books1
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n;
	String name;
	String author;
	int price;
	int numpages;
	System.out.println("enter the number of books");
	n=s.nextInt();
	books b[];
	b=new books[n];
	int i;

for (i=0;i<n;i++)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name author price numpages:");
	name=sc.next();
	author=sc.next();
	price=sc.nextInt();
	numpages=sc.nextInt();
	b[i]=new books(name,author,price,numpages);
}
for(i=0;i<n;i++)
{
	System.out.println(b[i].toString());
}
}
}