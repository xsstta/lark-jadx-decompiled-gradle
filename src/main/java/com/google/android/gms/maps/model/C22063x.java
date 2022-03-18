package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.x */
public final class C22063x implements Parcelable.Creator<StreetViewPanoramaLocation> {
    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaLocation[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaLocation createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) SafeParcelReader.createTypedArray(parcel, readHeader, StreetViewPanoramaLink.CREATOR);
            } else if (fieldId == 3) {
                latLng = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, str);
    }
}
