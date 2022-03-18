package com.huawei.hms.site.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AddressDetail implements Parcelable {
    public static final Parcelable.Creator<AddressDetail> CREATOR = new Parcelable.Creator<AddressDetail>() {
        /* class com.huawei.hms.site.api.model.AddressDetail.C237391 */

        @Override // android.os.Parcelable.Creator
        public AddressDetail createFromParcel(Parcel parcel) {
            return new AddressDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public AddressDetail[] newArray(int i) {
            return new AddressDetail[i];
        }
    };
    public String adminArea;
    public String country;
    public String countryCode;
    public String locality;
    public String postalCode;
    public String streetNumber;
    public String subAdminArea;
    public String subLocality;
    public String tertiaryAdminArea;
    public String thoroughfare;

    public AddressDetail() {
    }

    public AddressDetail(Parcel parcel) {
        this.countryCode = parcel.readString();
        this.country = parcel.readString();
        this.adminArea = parcel.readString();
        this.subAdminArea = parcel.readString();
        this.locality = parcel.readString();
        this.subLocality = parcel.readString();
        this.thoroughfare = parcel.readString();
        this.streetNumber = parcel.readString();
        this.postalCode = parcel.readString();
        this.tertiaryAdminArea = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String getAdminArea() {
        return this.adminArea;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getLocality() {
        return this.locality;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getStreetNumber() {
        return this.streetNumber;
    }

    public String getSubAdminArea() {
        return this.subAdminArea;
    }

    public String getSubLocality() {
        return this.subLocality;
    }

    public String getTertiaryAdminArea() {
        return this.tertiaryAdminArea;
    }

    public String getThoroughfare() {
        return this.thoroughfare;
    }

    public void setAdminArea(String str) {
        this.adminArea = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setLocality(String str) {
        this.locality = str;
    }

    public void setPostalCode(String str) {
        this.postalCode = str;
    }

    public void setStreetNumber(String str) {
        this.streetNumber = str;
    }

    public void setSubAdminArea(String str) {
        this.subAdminArea = str;
    }

    public void setSubLocality(String str) {
        this.subLocality = str;
    }

    public void setTertiaryAdminArea(String str) {
        this.tertiaryAdminArea = str;
    }

    public void setThoroughfare(String str) {
        this.thoroughfare = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.countryCode);
        parcel.writeString(this.country);
        parcel.writeString(this.adminArea);
        parcel.writeString(this.subAdminArea);
        parcel.writeString(this.locality);
        parcel.writeString(this.subLocality);
        parcel.writeString(this.thoroughfare);
        parcel.writeString(this.streetNumber);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.tertiaryAdminArea);
    }
}
