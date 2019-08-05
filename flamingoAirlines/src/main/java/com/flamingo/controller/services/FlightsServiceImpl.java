package com.flamingo.controller.services;

import java.util.List;

import com.flamingo.dao.Flights;
import com.flamingo.model.Flight;

public class FlightsServiceImpl implements FlightsServices {

	private Flights flightDao;
	
	@Override
	public void insertFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightDao.insert(flight);
		
	}

	@Override
	public void editFlight(Flight flight) {
		// TODO Auto-generated method stub

		Flight dbFlight=findFlightById(flight.getFlightId());
		if(dbFlight!=null)
		{
			dbFlight.setFlightName(flight.getFlightName());
			dbFlight.setCapacity(flight.getCapacity());
			dbFlight.setModel(flight.getModel());
		}
		
	}

	@Override
	public void removeFlight(Flight flight) {
		// TODO Auto-generated method stub

	}

	@Override
	public Flight findFlightById(int flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> findAllFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getFlightCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
