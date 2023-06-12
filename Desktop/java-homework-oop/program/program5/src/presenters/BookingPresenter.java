package ru.geekbrains.lesson5.presenters;

public class BookingPresenter implements ViewObserver {
    // ...

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        try {
            tableModel.changeReservationTable(oldReservation, reservationDate, tableNo, name);
            printChangeReservationTableResult();
        } catch (RuntimeException e) {
            printChangeReservationTableError(e.getMessage());
        }
    }

    private void printChangeReservationTableResult() {
        System.out.println("Бронь столика успешно изменена.");
    }

    private void printChangeReservationTableError(String errorMessage) {
        System.out.printf("Невозможно изменить бронь столика. \n%s\n", errorMessage);
    }
}
