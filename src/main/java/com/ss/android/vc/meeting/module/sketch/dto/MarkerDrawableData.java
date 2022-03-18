package com.ss.android.vc.meeting.module.sketch.dto;

public class MarkerDrawableData {
    public String id;
    public Coord position;
    public String username;

    public String toString() {
        return "MarkerDrawableData { id: " + this.id + ", position: " + this.position.toString() + "}";
    }

    public MarkerDrawableData(String str, Coord coord, String str2) {
        this.id = str;
        this.position = coord;
        this.username = str2;
    }
}
