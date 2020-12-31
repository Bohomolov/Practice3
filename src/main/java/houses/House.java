package houses;

import java.util.Objects;

public class House {
    private int id;
    private int apartmentNumber;
    private double square;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String city;
    private String lifetime;

    public House(int id, int apartmentNumber, double square, int floor, int numberOfRooms, String street, String city, String lifetime) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.square = square;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.city = city;
        this.lifetime = lifetime;
    }

    public int getId() {
        return id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public double getSquare() {
        return square;
    }

    public int getFloor() {
        return floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getLifetime() {
        return lifetime;
    }

    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", square=" + square +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", lifetime='" + lifetime + '\'' + '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return id == house.id &&
                apartmentNumber == house.apartmentNumber &&
                Double.compare(house.square, square) == 0 &&
                floor == house.floor &&
                numberOfRooms == house.numberOfRooms &&
                Objects.equals(street, house.street) &&
                Objects.equals(city, house.city) &&
                Objects.equals(lifetime, house.lifetime);
    }

    public int hashCode() {
        return Objects.hash(id, apartmentNumber, square, floor, numberOfRooms, street, city, lifetime);
    }
}
