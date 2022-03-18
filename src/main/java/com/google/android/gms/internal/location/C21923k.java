package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.google.android.gms.internal.location.k */
public final class C21923k implements Parcelable.Creator<zzbh> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = BitmapDescriptorFactory.HUE_RED;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    s = SafeParcelReader.readShort(parcel, readHeader);
                    break;
                case 4:
                    d = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 5:
                    d2 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 6:
                    f = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbh(str, i, s, d, d2, f, j, i2, i3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh[] newArray(int i) {
        return new zzbh[i];
    }
}
