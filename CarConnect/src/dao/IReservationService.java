package dao;

import entity.Reservation;

public interface IReservationService {

	Reservation getReservationById(int reservationId);

	Reservation getReservationsByCustomerId(int customerId);

	Reservation createReservation(String reservationData);

	Reservation updateReservation(String reservationData);

	Reservation cancelReservation(int reservationId);

}
