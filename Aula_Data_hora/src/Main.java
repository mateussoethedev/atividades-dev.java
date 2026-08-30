import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.SimpleTimeZone;
import java.util.function.LongToDoubleFunction;

public class Main{
    static void main() throws ParseException {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;


        LocalDate dt1 = LocalDate.parse("29-08-2026", fmt1);
        LocalDateTime dt2 = LocalDateTime.parse("29-08-2026 20:10", fmt2);
        Instant dt3 = Instant.parse("2026-08-29T20:10:30Z");


        System.out.println(dt1.format(fmt1));
        System.out.println(dt2.format(fmt2));
        System.out.println(dt3);
        System.out.println("---------------");
        System.out.println("");

        LocalDate r1 = LocalDate.ofInstant(dt3, ZoneId.systemDefault());
        System.out.println("r1 = " + r1.format(fmt1));

        LocalDate r2 = LocalDate.ofInstant(dt3, ZoneId.of("Portugal"));
        System.out.println("r2 = " + r2.format(fmt1));

        LocalDateTime r3 = LocalDateTime.ofInstant(dt3, ZoneId.systemDefault());
        System.out.println("r3  = " + r3.format(fmt2));

        LocalDateTime r4= LocalDateTime.ofInstant(dt3, ZoneId.of("Portugal"));
        System.out.println("r4 = " + r4.format(fmt2));

        LocalDateTime r6 = LocalDateTime.ofInstant(dt3, ZoneId.systemDefault());
        System.out.println("r6  = " + r6.format(fmt3));

        System.out.println("----------------");
        System.out.println("");
        LocalDate pastWeek = dt1.minusDays(7);
        LocalDate nextWeek = dt1.plusYears(10);

        LocalDateTime pastWeekTime = dt2.minusDays(7);
        LocalDateTime nextWeekTime = dt2.plusWeeks(10);

        Instant pastWeekInstant = dt3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = dt3.plus(10, ChronoUnit.DAYS);

        System.out.println("-------- Week--------");
        System.out.println("");
        System.out.println("pastWeek :" + pastWeek);
        System.out.println("nextWeek :" + nextWeek);
        System.out.println("");
        System.out.println("--------- Week Local Date Time -------");
        System.out.println("");
        System.out.println("pastWeekTime :" + pastWeekTime);
        System.out.println("nextWeekTime :" + nextWeekTime);
        System.out.println("");
        System.out.println("------- Week Instant---------");
        System.out.println("");
        System.out.println("pastWeekInstant :" + pastWeekInstant);
        System.out.println("nextWeekInstant :" + nextWeekInstant);
        System.out.println("");
        System.out.println("-----------Local Date Durantion-----------");
        Duration t2 = Duration.between(pastWeek.atStartOfDay(), dt1.atStartOfDay());
        System.out.println("t2 dias = " + t2.toDays());

        System.out.println("-----------Local Date Time Durantion-----------");
        Duration t1 = Duration.between(pastWeekTime, dt2);
        System.out.println("t1 dias = " + t1.toDays());

        System.out.println("-----------Instant Time Durantion Positive-----------");
        Duration t3 = Duration.between(pastWeekInstant, dt3);
        System.out.println("t3 dias = " + t3.toDays());


        System.out.println("-----------Instant Time Durantion Negative-----------");
        Duration t4 = Duration.between(dt3, pastWeekInstant);
        System.out.println("t3 dias = " + t4.toDays());

        System.out.println("");
        System.out.println("-------------");
        System.out.println();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(SimpleTimeZone.getTimeZone("GMT"));

        Date s1 = sdf1.parse("29/08/2026");
        Date s2 = sdf2.parse("29/08/2026 21:00:00");

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60 * 60 * 5);
        Date s3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));


        //Data Extensa
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();

        // Data Simplificada
        System.out.println("s1: " + sdf2.format(s1));
        System.out.println("s2: " + sdf2.format(s2));

        // Data Instant
        System.out.println();
        System.out.println("x1: " + sdf2.format(x1));

        // Data Instant
        System.out.println("-------------");
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("s3: " + sdf2.format(s3));
        System.out.println();
        System.out.println("-------------");
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("s3: " + sdf3.format(s3));
        System.out.println("-------------");
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("s3: " + s3);

        System.out.println();

        Date d = Date.from(Instant.parse("2026-08-29T15:42:07Z"));

        System.out.println(sdf2.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        int minutes = cal.get(Calendar.MINUTE);
        System.out.println("esse sao os minutos: "+ minutes);
        int mes = 1 + cal.get(Calendar.MONTH);
        System.out.println("esse e o mes: " + mes);
        System.out.println(sdf2.format(d));
    }
}