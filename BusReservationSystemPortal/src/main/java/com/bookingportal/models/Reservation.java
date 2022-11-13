package com.bookingportal.models;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer reservationId;
	private String reservationStatus;
	
	private LocalDate reservationDate;
	private LocalTime reservationTime;
	private String source;
	private String destination;
	private LocalDate journeyDate;
	private Integer noOfSeatsBooked;
	private Integer fare;
	
	//it is unidiractnal relationship between reservation to bus
	//RESERVATION ------> BUS (MANY TO ONE)
	
	@ManyToOne
	private Bus bus;
	
	//it is bidiractnal relationship between reservation to use
	//RESERVATION <------> USER (MANY TO ONE)
	@ManyToOne
	private User user;
	
	
}
