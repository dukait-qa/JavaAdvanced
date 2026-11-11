package exercise_6;

public class JavaProgram  implements AlarmListener {
    public static void main(String[] args) {

        JavaProgram javaProgram = new JavaProgram();
        JavaProgram javaProgram1 = new JavaProgram();
        JavaProgram javaProgram2 = new JavaProgram();
        Alarm alarm = new Alarm();
        alarm.addListener(javaProgram);
        alarm.addListener(javaProgram1);
        alarm.addListener(javaProgram2);
        alarm.setTimeFromNow(2000);
    }

    @Override
    public void alarmRang(AlarmEvent event) {
        System.out.println(event.message);
        System.out.println("Wake up !!!");
    }
}
