package org.example;

public class Main {
    public static void main(String[] args) {
        Department dep = new Department();
        dep.setId("1");
        dep.setName("Sales");

        Employee emp = new Employee();
        emp.setId("2");
        emp.setLastName("Ivanov");
        emp.setDepartment(dep);

        EmployeeMapper mapper = new EmployeeMapperImpl();
        EmployeeDto dto = mapper.employeeToEmployeeDTO(emp);
        System.out.println(dto);

        


    }
}