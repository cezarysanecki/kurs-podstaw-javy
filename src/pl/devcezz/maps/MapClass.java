package pl.devcezz.maps;

import java.util.*;

public class MapClass {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        addSomeElementsToMap(hashMap);
        addSomeElementsToMap(linkedHashMap);
        addSomeElementsToMap(treeMap);

        System.out.println(hashMap);
        System.out.println(linkedHashMap);
        System.out.println(treeMap);

        System.out.println("====");

        Map<Employee, String> employees = new HashMap<>();
        Employee employee = new Employee("John", 4600);
        employees.put(employee, "Oil Company");
        employees.put(new Employee("Andrew", 4600), "Oil Company");

        System.out.println(employees);

        for (Employee e : employees.keySet()) {
            System.out.println(e.hashCode());
        }

        System.out.println("====");

        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "a");
        testMap.put(2, "b");
        System.out.println(testMap.containsKey(2));
        System.out.println(testMap.containsValue("c"));
        System.out.println(testMap.remove(2));
        System.out.println(testMap.size());

        System.out.println("====");

        testMap.put(3, "c");

        for (String s : testMap.values()) {
            System.out.println(s);
        }

        System.out.println("====");

        testMap.put(3, "f");
        System.out.println(testMap);

        for (String s : testMap.values()) {
            System.out.println(s);
        }

        System.out.println("====");

        Map<String, List<Employee>> catalogue = new HashMap<>();
        catalogue.put("Oil Company", new ArrayList<>());
        catalogue.put("Fish Company", Collections.singletonList(new Employee("Jane", 9000)));
        Set<String> companies = catalogue.keySet();
        System.out.println(companies.size());
        catalogue.put("Burger Company", Collections.singletonList(new Employee("Paul", 4850)));
        System.out.println(companies.size());

        System.out.println("====");

        catalogue.get("Oil Company").add(new Employee("Larry", 8670));

        for (String company : catalogue.keySet()) {
            System.out.println(company + "'s employess:");
            for (Employee emp : catalogue.get(company)) {
                System.out.println(" - " + emp);
            }
        }

        System.out.println("====");

        Map<String, Integer> newMap = Map.of(
                "a", 2,
                "b", 3
        );
        System.out.println(newMap.keySet());

        EmployeeCatalogue employeeCatalogue = new EmployeeCatalogue();
        employeeCatalogue.addEmployeeFor("Oil Company", new Employee("Ann", 9088));
        employeeCatalogue.addEmployeeFor("Oil Company", new Employee("Peter", 4512));
        employeeCatalogue.addEmployeeFor("Motor Company", new Employee("Tomas", 4522));

        Collection<Employee> oilCompanyEmployees = employeeCatalogue.getAllEmployeesFor("Oil Company");
        Collection<Employee> motorCompanyEmployees = employeeCatalogue.getAllEmployeesFor("Motor Company");

        System.out.println(oilCompanyEmployees);
        System.out.println(motorCompanyEmployees);

        employeeCatalogue.getCatalogue().put("Oil Company", new HashMap<>());

        Collection<Employee> oilCompanyEmployees1 = employeeCatalogue.getAllEmployeesFor("Oil Company");
        Collection<Employee> motorCompanyEmployees1 = employeeCatalogue.getAllEmployeesFor("Motor Company");

        System.out.println(oilCompanyEmployees1);
        System.out.println(motorCompanyEmployees1);
    }

    public static void addSomeElementsToMap(Map<String, Integer> map) {
        map.put("abc", 3);
        map.put("efg", 1);
        map.put("tgk", 2);
        map.put("eto", 5);
        map.put("pol", 4);
    }
}
