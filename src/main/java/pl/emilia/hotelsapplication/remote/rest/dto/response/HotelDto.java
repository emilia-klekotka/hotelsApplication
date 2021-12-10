package pl.emilia.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class HotelDto {

    private Integer Id;
    private String Name;
    private List<RoomDto> rooms;

    public HotelDto() {
    }

    public HotelDto(Integer id, String name, List<RoomDto> rooms) {
        Id = id;
        Name = name;
        this.rooms = rooms;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<RoomDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDto> rooms) {
        this.rooms = rooms;
    }
}
