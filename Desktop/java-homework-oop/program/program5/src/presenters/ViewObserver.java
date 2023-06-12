package ru.geekbrains.lesson5.presenters;

import java.util.Date;

public interface ViewObserver {
    // ...

    /**
     * Изменение бронирования столика
     * @param oldReservation Идентификатор старого бронирования
     * @param reservationDate Новая дата бронирования
     * @param tableNo Новый номер столика
     * @param name Новое имя клиента
     */
    void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
