package pl.emilia.hotelsapplication.remote.rest.dto.response;

import java.math.BigDecimal;

public class RoomDto {

    private Integer Id;
    private RoomDto room;
    private BigDecimal price;

    public RoomDto() {
    }

    public RoomDto(Integer id, RoomDto room, BigDecimal price) {
        Id = id;
        this.room = room;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
