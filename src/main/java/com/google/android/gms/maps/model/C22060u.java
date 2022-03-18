package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.u */
public final class C22060u implements Parcelable.Creator<PolylineOptions> {
    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolylineOptions createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        float f = BitmapDescriptorFactory.HUE_RED;
        int i = 0;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, LatLng.CREATOR);
                    break;
                case 3:
                    f = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 4:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    f2 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 6:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    cap = (Cap) SafeParcelReader.createParcelable(parcel, readHeader, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) SafeParcelReader.createParcelable(parcel, readHeader, Cap.CREATOR);
                    break;
                case 11:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PolylineOptions(arrayList, f, i, f2, z, z2, z3, cap, cap2, i2, arrayList2);
    }
}
