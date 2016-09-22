package com.product.blackdogs.fooder.pojo;

/**
 * Created by Milan Marwadi on 21-09-2016.
 */
public class HotelList {

    String hotelName, hotelImageUrl, hotelLocation;
    double hotelRating, latitude, longitude;

    public HotelList() {
    }

    public HotelList(String hotelName, String hotelImageUrl, String hotelLocation, double hotelRating, double latitude, double longitude) {
        this.hotelName = hotelName;
        this.hotelImageUrl = hotelImageUrl;
        this.hotelLocation = hotelLocation;
        this.hotelRating = hotelRating;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public double getHotelRating() {
        return hotelRating;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }



}