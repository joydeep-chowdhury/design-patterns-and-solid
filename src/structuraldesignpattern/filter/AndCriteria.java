package structuraldesignpattern.filter;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria firstCriteria;
	private Criteria secondCriteria;

	public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Employee> criteria(List<Employee> employeeList) {
		List<Employee> firstCriteriaEmployees = firstCriteria.criteria(employeeList);
		return secondCriteria.criteria(firstCriteriaEmployees);
	}
}
