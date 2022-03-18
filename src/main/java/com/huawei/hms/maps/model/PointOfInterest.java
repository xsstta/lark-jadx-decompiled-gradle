package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

public class PointOfInterest implements Parcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new Parcelable.Creator<PointOfInterest>() {
        /* class com.huawei.hms.maps.model.PointOfInterest.C237191 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PointOfInterest createFromParcel(Parcel parcel) {
            return new PointOfInterest(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PointOfInterest[] newArray(int i) {
            return new PointOfInterest[i];
        }
    };
    public final LatLng latLng;
    public final String name;
    public final String placeId;

    protected PointOfInterest(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.latLng = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
        this.name = parcelReader.createString(3, null);
        this.placeId = parcelReader.createString(4, null);
    }

    public PointOfInterest(LatLng latLng2, String str, String str2) {
        this.latLng = latLng2;
        this.placeId = str;
        this.name = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.latLng, i, false);
        parcelWrite.writeString(3, this.name, false);
        parcelWrite.writeString(4, this.placeId, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
