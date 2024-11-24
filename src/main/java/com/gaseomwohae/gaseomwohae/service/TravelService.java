package com.gaseomwohae.gaseomwohae.service;

import java.util.List;

import com.gaseomwohae.gaseomwohae.dto.Travel;
import com.gaseomwohae.gaseomwohae.dto.travel.CreateTravelRequestDto;
import com.gaseomwohae.gaseomwohae.dto.travel.TravelDetailResponseDto;
import com.gaseomwohae.gaseomwohae.dto.travel.UpdateTravelRequestDto;

public interface TravelService {
	public TravelDetailResponseDto getTravel(Long userId, Long travelId);
	
	public List<Travel> getTravelList(Long userId);

	public void createTravel(Long userId, CreateTravelRequestDto createTravelRequestDto);

	public void updateTravel(Long travelId, UpdateTravelRequestDto updateTravelRequestDto);

	public void deleteTravel(Long userId, Long travelId);
}
