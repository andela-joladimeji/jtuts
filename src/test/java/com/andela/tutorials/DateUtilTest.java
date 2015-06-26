package com.andela.tutorials;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testFormatDate() {
		Date date = new Date();
		DateUtil.formatDate(date);
		DateUtil.useCalendar();
		DateUtil.jodaTimeExample();
		//assertEquals(expected, date);
	}

}
