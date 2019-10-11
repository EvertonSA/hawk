package in.arakaki.hawk.dto.mapper;

import in.arakaki.hawk.dto.model.bus.TripScheduleDto;
import in.arakaki.hawk.model.bus.Trip;
import in.arakaki.hawk.model.bus.TripSchedule;

/**
 * Created by Everton Arakaki.
 */
public class TripScheduleMapper {
    public static TripScheduleDto toTripScheduleDto(TripSchedule tripSchedule) {
        Trip tripDetails = tripSchedule.getTripDetail();
        return new TripScheduleDto()
                .setId(tripSchedule.getId())
                .setTripId(tripDetails.getId())
                .setBusCode(tripDetails.getBus().getCode())
                .setAvailableSeats(tripSchedule.getAvailableSeats())
                .setFare(tripDetails.getFare())
                .setJourneyTime(tripDetails.getJourneyTime())
                .setSourceStop(tripDetails.getSourceStop().getName())
                .setDestinationStop(tripDetails.getDestStop().getName());
    }
}
