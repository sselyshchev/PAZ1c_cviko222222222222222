package sk.upjs.paz;

public record Attendance(Long id, LocalDate date, Subject subject, List<User> attendees) {

    static void main(){
        System.out.printf("" + LocaDate.now());
        System.out.printf(""+ LocalDateTime.now());
    }
}
