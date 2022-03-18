package com.huawei.hms.site.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Poi implements Parcelable {
    public static final Parcelable.Creator<Poi> CREATOR = new Parcelable.Creator<Poi>() {
        /* class com.huawei.hms.site.api.model.Poi.C237441 */

        @Override // android.os.Parcelable.Creator
        public Poi createFromParcel(Parcel parcel) {
            return new Poi(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Poi[] newArray(int i) {
            return new Poi[i];
        }
    };
    public String businessStatus;
    public ChildrenNode[] childrenNodes;
    public String[] hwPoiTypes;
    public String internationalPhone;
    public OpeningHours openingHours;
    public String phone;
    public String[] photoUrls;
    public String[] poiTypes;
    public Integer priceLevel = -1;
    public double rating;
    public String websiteUrl;

    public Poi() {
    }

    public Poi(Parcel parcel) {
        this.poiTypes = parcel.createStringArray();
        this.hwPoiTypes = parcel.createStringArray();
        this.phone = parcel.readString();
        this.internationalPhone = parcel.readString();
        this.rating = parcel.readDouble();
        this.websiteUrl = parcel.readString();
        this.openingHours = (OpeningHours) parcel.readParcelable(OpeningHours.class.getClassLoader());
        this.photoUrls = parcel.createStringArray();
        this.priceLevel = Integer.valueOf(parcel.readInt());
        this.businessStatus = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public ChildrenNode[] getChildrenNodes() {
        return this.childrenNodes;
    }

    public String[] getHwPoiTypes() {
        return this.hwPoiTypes;
    }

    public String getInternationalPhone() {
        return this.internationalPhone;
    }

    public OpeningHours getOpeningHours() {
        return this.openingHours;
    }

    public String getPhone() {
        return this.phone;
    }

    public String[] getPhotoUrls() {
        return this.photoUrls;
    }

    public String[] getPoiTypes() {
        return this.poiTypes;
    }

    public Integer getPriceLevel() {
        return this.priceLevel;
    }

    public double getRating() {
        return this.rating;
    }

    public String getWebsiteUrl() {
        return this.websiteUrl;
    }

    public void setBusinessStatus(String str) {
        this.businessStatus = str;
    }

    public void setChildrenNodes(ChildrenNode[] childrenNodeArr) {
        this.childrenNodes = childrenNodeArr;
    }

    public void setHwPoiTypes(String[] strArr) {
        this.hwPoiTypes = strArr;
    }

    public void setInternationalPhone(String str) {
        this.internationalPhone = str;
    }

    public void setOpeningHours(OpeningHours openingHours2) {
        this.openingHours = openingHours2;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setPhotoUrls(String[] strArr) {
        this.photoUrls = strArr;
    }

    public void setPoiTypes(String[] strArr) {
        this.poiTypes = strArr;
    }

    public void setPriceLevel(Integer num) {
        this.priceLevel = num;
    }

    public void setRating(double d) {
        this.rating = d;
    }

    public void setWebsiteUrl(String str) {
        this.websiteUrl = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.poiTypes);
        parcel.writeStringArray(this.hwPoiTypes);
        parcel.writeString(this.phone);
        parcel.writeString(this.internationalPhone);
        parcel.writeDouble(this.rating);
        parcel.writeString(this.websiteUrl);
        parcel.writeStringArray(this.photoUrls);
        parcel.writeInt(this.priceLevel.intValue());
        parcel.writeString(this.businessStatus);
    }
}
