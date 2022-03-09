package structuraldesignpattern.filter;

import java.util.List;

public interface Criteria {
	public List<Employee> criteria(List<Employee> employeeList);
}
