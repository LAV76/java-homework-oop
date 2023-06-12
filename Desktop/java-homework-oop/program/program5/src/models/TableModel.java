public class TableModel implements Model {
    // ...

    /**
     * Поменять бронь столика
     * @param oldReservation Идентификатор старого бронирования
     * @param reservationDate Новая дата бронирования
     * @param tableNo Новый номер столика
     * @param name Новое имя клиента
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        Reservation newReservation = new Reservation(reservationDate, name);

        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    table.getReservations().remove(reservation);
                    table.getReservations().add(newReservation);
                    return;
                }
            }
        }

        throw new RuntimeException("Некорректный идентификатор бронирования.");
    }
}
