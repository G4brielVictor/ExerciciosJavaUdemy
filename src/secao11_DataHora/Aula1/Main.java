package src.secao11_DataHora.Aula1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        //Instanciando a data atual do metodo estatico
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        //Instanciando a data e horário atual do metodo estatico
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        Instant d03 = Instant.now();
        System.out.println(d03);

        LocalDate d04 = LocalDate.parse("2026-08-19");
        System.out.println(d04);
        LocalDateTime d05 = LocalDateTime.parse("2026-08-19T15:30:01");
        System.out.println(d05);

        Instant d06 = Instant.parse("2026-08-19T15:30:01Z");
        System.out.println(d06);
        Instant d07 = Instant.parse("2026-08-19T15:30:01-03:00");
        System.out.println(d07);

        LocalDate d08 = LocalDate.parse("08/05/2006", fmt1);
        System.out.println(d08);

        LocalDateTime d09 = LocalDateTime.parse("08/05/2006 10:43:01", fmt2);
        System.out.println(d09);

        LocalDate d10 = LocalDate.of(2025, 3, 1);
        System.out.println(d10);
        LocalDateTime d11 = LocalDateTime.of(2025, 3, 1, 15, 30, 10);
        System.out.println(d11);
    }
}
