package pl.emilia.hotelsapplication.remote.rest.dto.request;

public class HotelReservationDto {

    private Integer Id;
    private Integer RoomId;
    private Integer Days;

    public HotelReservationDto() {
    }

    public HotelReservationDto(Integer id, Integer roomId, Integer days) {
        Id = id;
        RoomId = roomId;
        Days = days;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getRoomId() {
        return RoomId;
    }

    public void setRoomId(Integer roomId) {
        RoomId = roomId;
    }

    public Integer getDays() {
        return Days;
    }

    public void setDays(Integer days) {
        Days = days;
    }
}
