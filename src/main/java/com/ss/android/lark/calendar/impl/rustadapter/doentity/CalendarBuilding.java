package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import java.util.List;

public class CalendarBuilding implements Serializable {
    private List<CalendarResource> calendarResources;
    private float latitude = 360.0f;
    private float longitude = 360.0f;
    private String mDescription;
    private String mId;
    private String mName;
    private int mWeight;

    public List<CalendarResource> getCalendarResources() {
        return this.calendarResources;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getId() {
        return this.mId;
    }

    public float getLatitude() {
        return this.latitude;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public String getName() {
        return this.mName;
    }

    public int getWeight() {
        return this.mWeight;
    }

    public void setCalendarResources(List<CalendarResource> list) {
        this.calendarResources = list;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setLatitude(float f) {
        this.latitude = f;
    }

    public void setLongitude(float f) {
        this.longitude = f;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setWeight(int i) {
        this.mWeight = i;
    }
}
