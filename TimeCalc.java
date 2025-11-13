public class TimeCalc {
    public static void main(String[] args) {

        String time = args[0];
        int MinutesToAdd = Integer.parseInt(args[1]);
        // פיצול הזמן לשעות ודקות
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        int totalMinutes = (hours * 60 + minutes + MinutesToAdd);
        int newHours = (totalMinutes/60) % 24;
        int newMinutes  = (totalMinutes % 60);

        System.out.printf("%02d:%02d%n", newHours,newMinutes); 
     }
}
