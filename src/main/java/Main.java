import ru.netology.services.hw_cycles.CalcService.CalcService;

public class Main {
    public static void main(String[] args) {

        CalcService service = new CalcService();
        int myHoliday = service.calcService(100_000, 60_000, 150_000);
        System.out.println(myHoliday);
    }
}
