package src.secao11_DataHora.Aula2;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.parse("2025-03-15");
        LocalDateTime d2 = LocalDateTime.parse("2025-03-15T15:30:00");
        Instant d3 = Instant.parse("2025-03-15T15:30:00Z");

        LocalDate pastWeekLocalDate = d1.minusDays(7);
        LocalDate nextWeekLocalDate = d1.plusDays(7);

        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d2.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d2.plusDays(7);

        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);

        Instant pastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d2);
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d1.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, d3);
        Duration t4 = Duration.between(d3, pastWeekInstant);

        System.out.println("t1 dias = "+ t1.toDays());
        System.out.println("t2 dias = "+ t2.toDays());
        System.out.println("t3 dias = "+ t3.toDays());
        System.out.println("t4 dias = "+ t4.toDays());
    }
}
