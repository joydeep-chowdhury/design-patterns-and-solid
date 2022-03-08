package behaviouraldesignpattern.iterator;

public class Client {
	public static void main(String[] args) {

		EmployeeRepository employeeRepository = new EmployeeRepository();

		for (Iterator iterator = employeeRepository.getIterator(); iterator.hasNext();) {
			String employee = (String) iterator.next();
			System.out.println("Employee: " + employee);
		}
	}
}
