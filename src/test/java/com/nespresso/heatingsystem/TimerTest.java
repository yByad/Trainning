package com.nespresso.heatingsystem;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.nespresso.heatingsystem.Timer;

public class TimerTest {
	
	Timer timer;

	@Before
	public void setUp() throws Exception {
		timer = new Timer(9, 20);
	}

	@Test
	public void testCanSchedule() {
		assertFalse(timer.canSchedule());
	}
	
}
