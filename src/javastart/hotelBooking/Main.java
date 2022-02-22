package javastart.hotelBooking;

import javastart.hotelBooking.services.BookingService;

public class Main {
    public static void main(String[] args) {
        Bill loriBill = new Bill(10000);
        Client loriClient = new Client("Cat", "Lori", "4343434", "lori@mail", loriBill);

        Bill baxBill = new Bill(12000);
        Client baxClient = new Client("Cat", "Bax", "4343433434", "bax@mail", baxBill);

        Room[] californiaHotelRooms = new Room[]{new Room(1, 1500, true), new Room(3, 3500, true),
                new Room(2, 2500, true)};

        Hotel californiaHotel = new Hotel("California", californiaHotelRooms);

        Room[] sanFranciscoHotelRooms = new Room[]{new Room(2, 2000, true), new Room(3, 14000, true),
                new Room(1, 2000, true)};
        Hotel sanFranciscoHotel = new Hotel("San Francisco", sanFranciscoHotelRooms);

        BookingService bookingService = new BookingService();
        bookingService.book(californiaHotel, loriClient, 2);
        System.out.println("\n");
        bookingService.book(californiaHotel, loriClient, 4);
        System.out.println("\n");
        bookingService.book(sanFranciscoHotel, baxClient, 3);

    }
}
