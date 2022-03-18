package com.huawei.hms.site.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.site.C23738a;

public class Site implements Parcelable {
    public static final Parcelable.Creator<Site> CREATOR = new Parcelable.Creator<Site>() {
        /* class com.huawei.hms.site.api.model.Site.C237461 */

        @Override // android.os.Parcelable.Creator
        public Site createFromParcel(Parcel parcel) {
            return new Site(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Site[] newArray(int i) {
            return new Site[i];
        }
    };
    public AddressDetail address;
    public Double distance = Double.valueOf(Double.NaN);
    public String formatAddress;
    public Coordinate location;
    public String name;
    public Poi poi;
    public AutoCompletePrediction prediction;
    public String siteId;
    public Integer utcOffset = 0;
    public CoordinateBounds viewport;

    public Site() {
    }

    public Site(Parcel parcel) {
        this.siteId = parcel.readString();
        this.name = parcel.readString();
        this.formatAddress = parcel.readString();
        this.address = (AddressDetail) parcel.readParcelable(AddressDetail.class.getClassLoader());
        this.location = (Coordinate) parcel.readParcelable(Coordinate.class.getClassLoader());
        this.viewport = (CoordinateBounds) parcel.readParcelable(CoordinateBounds.class.getClassLoader());
        this.distance = Double.valueOf(parcel.readDouble());
        this.poi = (Poi) parcel.readParcelable(Poi.class.getClassLoader());
        this.utcOffset = Integer.valueOf(parcel.readInt());
        this.prediction = (AutoCompletePrediction) parcel.readParcelable(AutoCompletePrediction.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public AddressDetail getAddress() {
        return this.address;
    }

    public Double getDistance() {
        return this.distance;
    }

    public String getFormatAddress() {
        return this.formatAddress;
    }

    public Coordinate getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public Poi getPoi() {
        return this.poi;
    }

    public AutoCompletePrediction getPrediction() {
        return this.prediction;
    }

    public String getSiteId() {
        return this.siteId;
    }

    public Integer getUtcOffset() {
        return this.utcOffset;
    }

    public CoordinateBounds getViewport() {
        return this.viewport;
    }

    public void setAddress(AddressDetail addressDetail) {
        this.address = addressDetail;
    }

    public void setDistance(Double d) {
        this.distance = d;
    }

    public void setFormatAddress(String str) {
        this.formatAddress = str;
    }

    public void setLocation(Coordinate coordinate) {
        this.location = coordinate;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPoi(Poi poi2) {
        this.poi = poi2;
    }

    public void setPrediction(AutoCompletePrediction autoCompletePrediction) {
        this.prediction = autoCompletePrediction;
    }

    public void setSiteId(String str) {
        this.siteId = str;
    }

    public void setUtcOffset(Integer num) {
        this.utcOffset = num;
    }

    public void setViewport(CoordinateBounds coordinateBounds) {
        this.viewport = coordinateBounds;
    }

    public String toString() {
        StringBuilder a = C23738a.m86922a("Site{siteId='");
        a.append(this.siteId);
        a.append('\'');
        a.append(", name='");
        a.append(this.name);
        a.append('\'');
        a.append(", formatAddress='");
        a.append(this.formatAddress);
        a.append('\'');
        a.append(", address=");
        a.append(this.address);
        a.append(", location=");
        a.append(this.location);
        a.append(", viewport=");
        a.append(this.viewport);
        a.append(", distance=");
        a.append(this.distance);
        a.append(", poi=");
        a.append(this.poi);
        a.append(", prediction=");
        a.append(this.prediction);
        a.append(", utcOffset=");
        a.append(this.utcOffset);
        a.append('}');
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.siteId);
        parcel.writeString(this.name);
        parcel.writeString(this.formatAddress);
        parcel.writeParcelable(this.address, i);
        parcel.writeParcelable(this.location, i);
        parcel.writeParcelable(this.viewport, i);
        parcel.writeDouble(this.distance.doubleValue());
        parcel.writeParcelable(this.poi, i);
        parcel.writeValue(this.utcOffset);
        parcel.writeParcelable(this.prediction, i);
    }
}
