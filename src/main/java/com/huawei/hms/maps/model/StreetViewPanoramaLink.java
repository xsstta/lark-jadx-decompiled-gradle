package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;

public class StreetViewPanoramaLink implements Parcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new Parcelable.Creator<StreetViewPanoramaLink>() {
        /* class com.huawei.hms.maps.model.StreetViewPanoramaLink.C237231 */

        @Override // android.os.Parcelable.Creator
        public final StreetViewPanoramaLink createFromParcel(Parcel parcel) {
            return new StreetViewPanoramaLink(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreetViewPanoramaLink[] newArray(int i) {
            return new StreetViewPanoramaLink[i];
        }
    };
    public final float bearing;
    public final String panoId;

    protected StreetViewPanoramaLink(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.bearing = parcelReader.readFloat(2, BitmapDescriptorFactory.HUE_RED);
        this.panoId = parcelReader.createString(3, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing);
    }

    public int hashCode() {
        return Objects.hashCode(this.panoId, Float.valueOf(this.bearing));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.panoId).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeFloat(2, this.bearing);
        parcelWrite.writeString(3, this.panoId, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
