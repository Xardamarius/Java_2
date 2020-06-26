import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //При решении данной задачи можно было бы обойтись и без интерфейсов и цикле просто указать необходимый тип профессии
        //но нужно выполнить именно при помощи интерфейсов для того, чтобы закрепить знания о них

        Programmer programmer1 = new Programmer("Иван");
        Programmer programmer2 = new Programmer("Николай");
        Programmer programmer3 = new Programmer("Алена");
        Driver driver1 = new Driver("Сергей");
        Driver driver2 = new Driver("Костя");
        Driver driver3 = new Driver("Лера");
        Cooker cooker1 = new Cooker("Вадим");
        Cooker cooker2 = new Cooker("Виктор");
        Cooker cooker3 = new Cooker("Максим");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(cooker1);
        employees.add(cooker2);
        employees.add(cooker3);
        for (Employee employee : employees) {
            employee.voice();
        }

        ArrayList<CodeWritable> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);
        for (CodeWritable programmer : programmers) {
            programmer.writeCode();
        }

        ArrayList<Drivable> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for (Drivable driver : drivers) {
            driver.drive();
        }

        ArrayList<Cookable> cookers = new ArrayList<>();
        cookers.add(cooker1);
        cookers.add(cooker2);
        cookers.add(cooker3);
        for (Cookable cookable : cookers) {
            cookable.cook();
        }
    }
}
