package structuraldesignpattern.filter;

import java.util.List;

public class OrCriteria implements Criteria {
	private Criteria firstCriteria;
	private Criteria secondCriteria;

	public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Employee> criteria(List<Employee> employeeList) {
		List<Employee> firstCriteriaEmployees = firstCriteria.criteria(employeeList);
		List<Employee> secondCriteriaEmployees = secondCriteria.criteria(employeeList);

		for (Employee employee : secondCriteriaEmployees) {
			if (!firstCriteriaEmployees.contains(employee)) {
				firstCriteriaEmployees.add(employee);
			}
		}
		return firstCriteriaEmployees;
	}
}
