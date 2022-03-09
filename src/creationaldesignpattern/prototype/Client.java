package creationaldesignpattern.prototype;

public class Client {
	public static void main(String[] args) {
		EmployeesHashtable.loadCache();

		Employee cloned1 = (Employee) EmployeesHashtable.getEmployee("ETPN1");
		Employee cloned2 = (Employee) EmployeesHashtable.getEmployee("ETJN1");
		Employee cloned3 = (Employee) EmployeesHashtable.getEmployee("ETMN1");

		System.out.println("Employee: " + cloned1.getPosition() + " ID:" + cloned1.getId());
		System.out.println("Employee: " + cloned2.getPosition() + " ID:" + cloned2.getId());
		System.out.println("Employee: " + cloned3.getPosition() + " ID:" + cloned3.getId());
	}
}
