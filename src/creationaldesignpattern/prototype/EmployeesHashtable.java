package creationaldesignpattern.prototype;

import java.util.Hashtable;

public class EmployeesHashtable {

	private static Hashtable<String, Employee> employeeMap = new Hashtable<String, Employee>();

	public static Employee getEmployee(String id) {
		Employee cacheEmployee = employeeMap.get(id);
		// a cast is needed because the clone() method returns an Object
		return (Employee) cacheEmployee.clone();
	}

	public static void loadCache() {
		// predefined objects to simulate retrieved objects from the database
		Programmer programmer = new Programmer();
		programmer.setId("ETPN1");
		employeeMap.put(programmer.getId(), programmer);

		Janitor janitor = new Janitor();
		janitor.setId("ETJN1");
		employeeMap.put(janitor.getId(), janitor);

		Manager manager = new Manager();
		manager.setId("ETMN1");
		employeeMap.put(manager.getId(), manager);
	}
}
