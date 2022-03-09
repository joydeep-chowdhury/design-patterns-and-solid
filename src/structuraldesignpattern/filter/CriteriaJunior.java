package structuraldesignpattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaJunior implements Criteria {

	@Override
	public List<Employee> criteria(List<Employee> employeeList) {
		List<Employee> juniorEmployees = new ArrayList<>();

		for (Employee employee : employeeList) {
			if (employee.getPosition().equalsIgnoreCase("Junior")) {
				juniorEmployees.add(employee);
			}
		}
		return juniorEmployees;
	}
}
