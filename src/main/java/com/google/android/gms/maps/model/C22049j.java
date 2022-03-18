package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.google.android.gms.maps.model.j */
public final class C22049j implements Parcelable.Creator<CameraPosition> {
    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f = BitmapDescriptorFactory.HUE_RED;
        LatLng latLng = null;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                latLng = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
            } else if (fieldId == 3) {
                f = SafeParcelReader.readFloat(parcel, readHeader);
            } else if (fieldId == 4) {
                f2 = SafeParcelReader.readFloat(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                f3 = SafeParcelReader.readFloat(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CameraPosition(latLng, f, f2, f3);
    }
}
