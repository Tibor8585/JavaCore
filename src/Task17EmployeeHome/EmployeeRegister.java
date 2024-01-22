package Task17EmployeeHome;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRegister {
    List<Employee> EmployeeList = new ArrayList<>();

    void readCSVFile(){
        try {
            List<String> lines = Files.readAllLines(Paths.get("resources/Employee.csv"));
            for (String employeeData : lines) {
                String[] employee = employeeData.split(",");
                String position = employee[0];
                String name = employee[1];
                String salary = employee[2];
                String customField = employee[3];
                if (position.equals("Tester")){
                Tester tester = new Tester(position, name, salary, customField);
                EmployeeList.add(tester);
                }else if(position.equals("Developer")){
                    Developer developer = new Developer(position, name, salary, customField);
                    EmployeeList.add(developer);
                }else if(position.equals("ExecutiveDirector")) {
                    ExecutiveDirector executiveDirector = new ExecutiveDirector(position, name, salary, customField);
                    EmployeeList.add(executiveDirector);
                }else if(position.equals("FinanceAssistant")) {
                    FinanceAssistant financeAssistant = new FinanceAssistant(position, name, salary, customField);
                    EmployeeList.add(financeAssistant);
                }else if(position.equals("HrAssistant")) {
                    HrAssistant hrAssistant = new HrAssistant(position, name, salary, customField);
                    EmployeeList.add(hrAssistant);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Employee> getEmployeeList() {
        return EmployeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        EmployeeList = employeeList;
    }
}
