package edu.iis.mto.bdd.trains.cucumber.steps;


import java.util.List;

import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class CucumberTestClass {

	@Zakładając("że chcę się dostać z \"(.*)\" do \"(.*)\"$")
	public void givenArrivingTrains(@Transform(JodaLocalTimeConverter.class) LocalTime startTime, String lineStart)
	{
		throw new PendingException();

	}

	@I("^następny pociąg odjeżdża o (.*) na linii \"(.)$")
	public void givenOtherTrains(@Transform(JodaLocalTimeConverter.class) LocalTime startTime, String lineStart)
	{
		throw new PendingException();

	}
	
	@Gdy("^zapytam o godzinę przyjazdu$")
	public void whenIAskForTime() {
		throw new PendingException();
	}

	@Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: (.*) $")
	public void shouldBeInformedAbout(@Transform(JodaLocalTimeConverter.class) LocalTime arrivingTime) {
		throw new PendingException();
	}
}
