package pl.emilia.hotelsapplication.remote.rest.dto.request;

import pl.emilia.hotelsapplication.remote.rest.dto.response.RoomDto;

import java.math.BigDecimal;

public class AddRoomDto {

    private RoomDto room;
    private BigDecimal price;

    public AddRoomDto() {
    }

    public AddRoomDto(RoomDto room, BigDecimal price) {
        this.room = room;
        this.price = price;
    }

    public RoomDto getRoom() {
        return room;
    }

    public void setRoom(RoomDto room) {
        this.room = room;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
