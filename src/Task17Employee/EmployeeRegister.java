package Task17Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRegister {
    private List<AbstractEmployee> employee = new ArrayList<>();

    void readCSVFile()  {
        try {
            List<String> fileContent = Files.readAllLines(Path.of("resources/Employee.csv"));
            for(String content : fileContent){
                String[] contentDAta = content.split(", ");
                String position = contentDAta[0];
                String name = contentDAta[1];
                String salary = contentDAta[2];
                String customField = contentDAta[3];
                if (position.equals("Tester")){
                    employee.add(new Tester(position,name, salary, customField));
                }else if(position.equals("Developer")){
                    employee.add(new Developer(position,name, salary, customField));
                }else if(position.equals("ExecutiveDirector")){
                    employee.add(new ExecutiveDirector(position,name, salary, customField));
                }else if(position.equals("FinanceAssistant")){
                    employee.add(new ExecutiveDirector(position,name, salary, customField));
                }else if(position.equals("HrAssistant")){
                    employee.add(new ExecutiveDirector(position,name, salary, customField));
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public List<AbstractEmployee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<AbstractEmployee> employee) {
        this.employee = employee;
    }
}
