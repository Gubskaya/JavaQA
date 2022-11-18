
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kevin Young", 25000, "Тестировщик");
        Employee employee2 = new Employee("Lucy Harris", 26700, "Frontend-разработчик");
        Employee employee3 = new Employee("Tracy Dean", 100000, "Backend-разработчик");

        Employee employee4 = new Employee("Brendan Archibald", 90000, "Системный аналитик");
        Employee employee5 = new Employee("Derek Calhoun", 36000, "Аналитик данных");
        Employee employee6 = new Employee("Zhess Haig", 85000, "Backend-разработчик");
        Employee employee7 = new Employee("Gemma Croftoon", 25700, "Fullstack-разработчик");

        Employee employee8 = new Employee("Sarah Carter", 50000, "DevOps-инженер");
        Employee employee9 = new Employee("Adam Adams", 27500, "Системный администратор");

        Employee[] employeesFacebook = {employee1, employee2, employee3, null, null};
        /*Employee[] employeesFacebook = new Employee[5];
        employeesFacebook[0] = employee1;
        employeesFacebook[1] = employee2;
        employeesFacebook[2] = employee3;
        employeesFacebook[3] = null;
        employeesFacebook[4] = null;*/

        Employee[] employeesInstagram = {employee4, employee5, employee6, employee7};

        Employee[] employeesWhatsApp = {employee8, employee9, null};

        Company company1 = new Company("Facebook", employeesFacebook, 100000.0, "Mark Zuckerberg");
        Company company2 = new Company("Instagram", employeesInstagram, 20030.0, "Adam Mosser");
        Company company3 = new Company("WhatsApp", employeesWhatsApp, 3500.0, "Will Cathcart");
        //Company company4 = new Company("Oculus", employeesOculus, 128005.0, "Brendan Iribe");

        Company[] companies = {company1, company2, company3};

       Holding holding = new Holding(companies);
       MainMenu.start(holding);

    }
}
