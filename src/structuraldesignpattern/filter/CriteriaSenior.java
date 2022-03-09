package structuraldesignpattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSenior implements Criteria {

	@Override
	public List<Employee> criteria(List<Employee> employeeList) {
		List<Employee> seniorEmployees = new ArrayList<>();

		for (Employee employee : employeeList) {
			if (employee.getPosition().equalsIgnoreCase("Senior")) {
				seniorEmployees.add(employee);
			}
		}
		return seniorEmployees;
	}
}
