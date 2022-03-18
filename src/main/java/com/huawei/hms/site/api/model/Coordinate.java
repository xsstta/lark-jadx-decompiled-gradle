package com.huawei.hms.site.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Coordinate implements Parcelable {
    public static final Parcelable.Creator<Coordinate> CREATOR = new Parcelable.Creator<Coordinate>() {
        /* class com.huawei.hms.site.api.model.Coordinate.C237421 */

        @Override // android.os.Parcelable.Creator
        public Coordinate createFromParcel(Parcel parcel) {
            return new Coordinate(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Coordinate[] newArray(int i) {
            return new Coordinate[i];
        }
    };
    public double lat;
    public double lng;

    public Coordinate(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    public Coordinate(Parcel parcel) {
        this.lat = parcel.readDouble();
        this.lng = parcel.readDouble();
    }

    public int describeContents() {
        return 0;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLng() {
        return this.lng;
    }

    public void setLat(double d) {
        this.lat = d;
    }

    public void setLng(double d) {
        this.lng = d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.lat);
        parcel.writeDouble(this.lng);
    }
}
