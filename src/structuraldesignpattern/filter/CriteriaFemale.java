package structuraldesignpattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Employee> criteria(List<Employee> employeeList) {
		List<Employee> femaleEmployees = new ArrayList<>();

		for (Employee employee : employeeList) {
			if (employee.getGender().equalsIgnoreCase("Female")) {
				femaleEmployees.add(employee);
			}
		}
		return femaleEmployees;
	}
}
