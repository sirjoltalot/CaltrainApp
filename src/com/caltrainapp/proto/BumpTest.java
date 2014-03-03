package com.caltrainapp.proto;

import com.caltrainapp.proto.Bump;
import com.caltrainapp.proto.Bump.BumpReport;

import static org.junit.Assert.*;

import org.junit.Test;

public class BumpTest {

	@Test
	public void testBasicBuild() {
		BumpReport.Builder builder = Bump.BumpReport.newBuilder();
		builder.setDirection(Bump.BumpReport.Direction.NORTH_BOUND);
		builder.setStationName("San Carlos");
		builder.setTrainId("277");
		builder.setNumBumped(2);
		builder.setTimestampMillis(System.currentTimeMillis());
		BumpReport report = builder.build();
		assertEquals(BumpReport.Direction.NORTH_BOUND, report.getDirection());
		assertEquals("San Carlos", report.getStationName());
		assertEquals("277", report.getTrainId());
		assertEquals(2, report.getNumBumped());
	}

}
