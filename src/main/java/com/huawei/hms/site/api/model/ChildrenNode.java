package com.huawei.hms.site.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ChildrenNode implements Parcelable {
    public static final Parcelable.Creator<ChildrenNode> CREATOR = new Parcelable.Creator<ChildrenNode>() {
        /* class com.huawei.hms.site.api.model.ChildrenNode.C237411 */

        @Override // android.os.Parcelable.Creator
        public ChildrenNode createFromParcel(Parcel parcel) {
            return new ChildrenNode(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ChildrenNode[] newArray(int i) {
            return new ChildrenNode[i];
        }
    };
    public String depAndArr;
    public String domeAndInt;
    public String formatAddress;
    public String[] hwPoiTypes;
    public Coordinate location;
    public String name;
    public String siteId;

    public ChildrenNode() {
    }

    public ChildrenNode(Parcel parcel) {
        this.siteId = parcel.readString();
        this.name = parcel.readString();
        this.formatAddress = parcel.readString();
        this.location = (Coordinate) parcel.readParcelable(Coordinate.class.getClassLoader());
        this.hwPoiTypes = parcel.createStringArray();
        this.domeAndInt = parcel.readString();
        this.depAndArr = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String getDepAndArr() {
        return this.depAndArr;
    }

    public String getDomeAndInt() {
        return this.domeAndInt;
    }

    public String getFormatAddress() {
        return this.formatAddress;
    }

    public String[] getHwPoiTypes() {
        return this.hwPoiTypes;
    }

    public Coordinate getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public String getSiteId() {
        return this.siteId;
    }

    public void resetChildrenInfo() {
        this.name = null;
        this.formatAddress = null;
        this.location = null;
        this.hwPoiTypes = null;
        this.domeAndInt = null;
        this.depAndArr = null;
    }

    public void setDepAndArr(String str) {
        this.depAndArr = str;
    }

    public void setDomeAndInt(String str) {
        this.domeAndInt = str;
    }

    public void setFormatAddress(String str) {
        this.formatAddress = str;
    }

    public void setHwPoiTypes(String[] strArr) {
        this.hwPoiTypes = strArr;
    }

    public void setLocation(Coordinate coordinate) {
        this.location = coordinate;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSiteId(String str) {
        this.siteId = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.siteId);
        parcel.writeString(this.name);
        parcel.writeString(this.formatAddress);
        parcel.writeParcelable(this.location, i);
        parcel.writeStringArray(this.hwPoiTypes);
        parcel.writeString(this.domeAndInt);
        parcel.writeString(this.depAndArr);
    }
}
