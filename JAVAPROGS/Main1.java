import java.util.*;
class EmployeeData
{
int eid,i;
float bs,da,ns,it,gs;
String name;
Scanner sc=new Scanner(System.in);
Scanner s=new Scanner(System.in);
public void getdata()
{
System.out.println("Enter employee id: ");
eid=sc.nextInt();
System.out.println("Enter employee name: ");
name=s.nextLine();
System.out.println("Enter Basic salary(per month: ");
bs=sc.nextFloat();
cal();
}

public void cal()
{
da=bs * 52/100;
gs=bs+da;
it=gs * 30/100;
ns=gs-it;
}

public void show()
{
System.out.println("EmployeeId: "+eid);
System.out.println("Employee Name: " +name);
System.out.println("Employee basic salary: "+bs);
System.out.println("DA: "+da);
System.out.println("Gross Salary: "+gs);
System.out.println("Income tax: "+it);
System.out.println("Net Salary: "+ns);
}
}

class Main1
{
public static void main(String args[])
{
EmployeeData emp=new EmployeeData();
emp.getdata();
emp.show();
}
}