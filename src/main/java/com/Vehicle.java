package com;

public class Vehicle {
	 private String id;
	    private String name;
	    private String model;
	    private int year;
	    private double longitude;
	    private double latitude;
	    
	    public Vehicle() {
	        // Default constructor for Spring Boot
	    }

	    public Vehicle(String id, String name, String model, int year, double longitude, double latitude) {
	        this.id = id;
	        this.name = name;
	        this.model = model;
	        this.year = year;
	        this.latitude = latitude;
	        this.longitude = longitude;
	    }

	    // Getters and setters

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

		public double getLongitude() {
			return longitude;
		}

		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}

		public double getLatitude() {
			return latitude;
		}

		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}
	    

}
