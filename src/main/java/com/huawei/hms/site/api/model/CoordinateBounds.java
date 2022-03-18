package com.huawei.hms.site.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CoordinateBounds implements Parcelable {
    public static final Parcelable.Creator<CoordinateBounds> CREATOR = new Parcelable.Creator<CoordinateBounds>() {
        /* class com.huawei.hms.site.api.model.CoordinateBounds.C237431 */

        @Override // android.os.Parcelable.Creator
        public CoordinateBounds createFromParcel(Parcel parcel) {
            return new CoordinateBounds(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CoordinateBounds[] newArray(int i) {
            return new CoordinateBounds[i];
        }
    };
    public Coordinate northeast;
    public Coordinate southwest;

    public CoordinateBounds(Parcel parcel) {
        this.northeast = (Coordinate) parcel.readParcelable(Coordinate.class.getClassLoader());
        this.southwest = (Coordinate) parcel.readParcelable(Coordinate.class.getClassLoader());
    }

    public CoordinateBounds(Coordinate coordinate, Coordinate coordinate2) {
        this.northeast = coordinate;
        this.southwest = coordinate2;
    }

    public int describeContents() {
        return 0;
    }

    public Coordinate getNortheast() {
        return this.northeast;
    }

    public Coordinate getSouthwest() {
        return this.southwest;
    }

    public void setNortheast(Coordinate coordinate) {
        this.northeast = coordinate;
    }

    public void setSouthwest(Coordinate coordinate) {
        this.southwest = coordinate;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.northeast, i);
        parcel.writeParcelable(this.southwest, i);
    }
}
