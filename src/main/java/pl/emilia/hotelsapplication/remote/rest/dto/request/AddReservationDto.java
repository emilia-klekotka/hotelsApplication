package pl.emilia.hotelsapplication.remote.rest.dto.request;

import java.util.List;

public class AddReservationDto {

    private PersonReservationDto person;
    private List<HotelReservationDto> pizzas;

    public AddReservationDto() {
    }

    public AddReservationDto(PersonReservationDto person, List<HotelReservationDto> pizzas) {
        this.person = person;
        this.pizzas = pizzas;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }

    public List<HotelReservationDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<HotelReservationDto> pizzas) {
        this.pizzas = pizzas;
    }
}
