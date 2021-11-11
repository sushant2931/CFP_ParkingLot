package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class ParkingLotSystem {
    @Test
    public void givenVehicle_WhenPark_ShouldReturnTrue() {
        ParkingLot parkingLot = new ParkingLot();
        boolean parkingStatus = parkingLot.parkVehicle(new Object());
        Assertions.assertTrue(parkingStatus);
    }
}
