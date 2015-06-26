package com.andela.tutorials;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.chrono.GregorianChronology;

public class DateUtil {

	public static void formatDate(Date date) {
		// Locale locale = new Locale("fr_FR");
		Locale locale = new Locale("fr", "FR");
		DateFormat formater = DateFormat.getDateInstance(DateFormat.FULL,
				locale);

		System.out.println("Time is now in French ;" + formater.format(date));
	}

	public static void useCalendar() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2015, 1, 1);
		System.out.println(format.format(calendar.getTime()));
	}

	public static void jodaTimeExample() {
		DateTime dt = new DateTime();
		dt.withYear(2015);
		dt.withMonthOfYear(1);
		dt.plusDays(5);
		System.out.println("The DateTime is " + dt.toString());

		org.joda.time.LocalDate localDate = new org.joda.time.LocalDate();
		LocalTime localTime = new LocalTime();
		LocalDateTime ldt = new LocalDateTime();

		Chronology c = GregorianChronology.getInstance();

		DateTimeZone zone = DateTimeZone.forID("Africa/Tunis");
	}

}
