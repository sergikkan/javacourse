package javastart.hotelBooking.services;

import javastart.hotelBooking.Bill;
import javastart.hotelBooking.Client;
import javastart.hotelBooking.Hotel;
import javastart.hotelBooking.Room;

public class BookingService {

    public void book(Hotel hotel, Client client, int numberOfPerson){
        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for (Room r:rooms){
            if (r.isFree()){
                isFreeRooms = true;
            }
        }

        if (!isFreeRooms){
            System.out.println("Свободных номеров в отеле: "+ hotel.getName()+" нет");
        }

        bookRoom(client, numberOfPerson, rooms);
    }

    private void bookRoom(Client client, int numberOfPerson, Room[] rooms){
        boolean success = false;
        String сlientName = client.getName();
        for (Room room:rooms){
            if (room.getNumberOfPerson() == numberOfPerson){
                success = true;
                System.out.println("Нашелся номер для клиента: " + сlientName +" "+client.getSurname());
                if (client.getBill().getAmount()>= room.getCost()){
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount()- room.getCost());
                    room.setFree(false);
                    System.out.println("Номер был успешно забронирован клиентом: " + сlientName +" "+client.getSurname());
                }else System.out.println("У клиента недостаточно денег на счету");
            }
        }

        if (!success) System.out.println("Не нашлось нужного номера для клиента: " + сlientName +" "+client.getSurname());
    }

}
