package ru.geekbrains.lesson5.views;
import ru.geekbrains.lesson5.presenters.View;
import java.util.Date;
public class BookingView implements View {
    // ...

    /**
     * Действие клиента (пользователь нажал на кнопку изменения бронирования столика)
     * @param oldReservation Идентификатор бронирования (старый)
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя
     */

    bookingView.changeReservationTable(1, newReservationDate, newTableNo, newName);

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}
