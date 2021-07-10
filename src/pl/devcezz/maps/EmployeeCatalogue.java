package pl.devcezz.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeCatalogue {

    private final Map<String, Map<Integer, Employee>> catalogue = new HashMap<>();

    public void addEmployeeFor(String companyName, Employee employee) {
        if (catalogue.containsKey(companyName)) {
            Map<Integer, Employee> companyCatalogue = catalogue.get(companyName);
            int max = Integer.MIN_VALUE;
            for (Integer id : companyCatalogue.keySet()) {
                if (id > max) {
                    max = id;
                }
            }
            companyCatalogue.put(++max, employee);
        } else {
            Map<Integer, Employee> companyCatalogue = new HashMap<>();
            companyCatalogue.put(1, employee);
            catalogue.put(companyName, companyCatalogue);
        }
    }

    public Collection<Employee> getAllEmployeesFor(String companyName) {
        return catalogue.get(companyName).values();
    }

    public Map<String, Map<Integer, Employee>> getCatalogue() {
        return new HashMap<>(catalogue);
    }
}
