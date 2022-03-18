package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.ad */
public final class C22039ad implements Parcelable.Creator<VisibleRegion> {
    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VisibleRegion createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                latLng = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
            } else if (fieldId == 3) {
                latLng2 = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
            } else if (fieldId == 4) {
                latLng3 = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
            } else if (fieldId == 5) {
                latLng4 = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, readHeader, LatLngBounds.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }
}
