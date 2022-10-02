
public class Employee<override> {

	static String name;
	static double salary;
    static int workHours;
	static int hireYear;
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		 
	}
	
	
	public static double tax() {
		
		try {
			if(salary<0)
			{
				return 0;
			}
			else if(salary>1000)
			{
				return (salary*3/100);
			}
			else {
				 return 0;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	 
		 
	}

	
	public static double bonus(){
		try {
			
			if(workHours>40)
			{
				return (double)((workHours-40)*30);
				
			}
			else if(workHours>0&&workHours<=40)
				return 0;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
		 
		
		
	}
	
	public double raiseSalary() 
	{
		double calculateTool=(salary+bonus()-tax());
		if(hireYear<10)
		{
			return (calculateTool*0.05);
		}
		if(hireYear>9&&hireYear<19)
		{
			return (calculateTool*0.10);
		}
		if(hireYear>19)
		{
			return (calculateTool*0.15);
		}
		
		return 0;
	}
	 
	 
	public String toString() 
	{
		 
		return ("isim ve soyisim:"+name+" - Maasi:"+salary+" - Calisma Saati: "+workHours+" Baslangıc Yili:"+(2021-hireYear)+" - Vergi:"+tax()+" - Bonus:"+bonus()+" - Maas Artisi:"+raiseSalary()+" -Vergi Maas Bonus ve Digeri:"+(salary-tax()+bonus()+raiseSalary()));
		 
	}
	 


	public static void main(String[] args) {
		Employee employee=new Employee("Omer DOGU", 1000, 50, 5);
		System.out.println(employee.toString());
	    
	

	 
	}

}
