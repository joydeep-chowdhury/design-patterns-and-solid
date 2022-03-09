package structuraldesignpattern.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	@Override
	public List<Employee> criteria(List<Employee> employeeList) {
		List<Employee> maleEmployees = new ArrayList<>();

		for (Employee employee : employeeList) {
			if (employee.getGender().equalsIgnoreCase("Male")) {
				maleEmployees.add(employee);
			}
		}
		return maleEmployees;
	}
}
