package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.Arrays;

public class VisibleRegion implements Parcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new Parcelable.Creator<VisibleRegion>() {
        /* class com.huawei.hms.maps.model.VisibleRegion.C237311 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VisibleRegion createFromParcel(Parcel parcel) {
            return new VisibleRegion(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VisibleRegion[] newArray(int i) {
            return new VisibleRegion[i];
        }
    };
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    protected VisibleRegion(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.farLeft = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
        this.farRight = (LatLng) parcelReader.readParcelable(3, LatLng.CREATOR, null);
        this.latLngBounds = (LatLngBounds) parcelReader.readParcelable(4, LatLngBounds.CREATOR, null);
        this.nearLeft = (LatLng) parcelReader.readParcelable(5, LatLng.CREATOR, null);
        this.nearRight = (LatLng) parcelReader.readParcelable(6, LatLng.CREATOR, null);
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds2) {
        this.nearLeft = latLng;
        this.farLeft = latLng3;
        this.nearRight = latLng2;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    public String toString() {
        return "VisibleRegion{farLeft=" + this.farLeft + ", farRight=" + this.farRight + ", latLngBounds=" + this.latLngBounds + ", nearLeft=" + this.nearLeft + ", nearRight=" + this.nearRight + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.farLeft, i, false);
        parcelWrite.writeParcelable(3, this.farRight, i, false);
        parcelWrite.writeParcelable(4, this.latLngBounds, i, false);
        parcelWrite.writeParcelable(5, this.nearLeft, i, false);
        parcelWrite.writeParcelable(6, this.nearRight, i, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
