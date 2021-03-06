package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    private static final Comparator<Employee> INJUSTICE_COMPARATOR = new Comparator<Employee>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            int compareAges = Integer.compare(employee1.getAge(), employee2.getAge());
            if (compareAges != 0) {
                return compareAges;
            }
            return employee1.getName().toLowerCase().compareTo(employee2.getName().toLowerCase());
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> employeesSorted = new TreeSet<>(INJUSTICE_COMPARATOR);
        employeesSorted.addAll(employees);
        return employeesSorted;
    }
}
