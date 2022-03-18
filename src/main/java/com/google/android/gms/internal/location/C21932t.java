package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzj;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.t */
public final class C21932t implements Parcelable.Creator<zzm> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzj zzj = zzm.f53364b;
        List<ClientIdentity> list = zzm.f53363a;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                zzj = (zzj) SafeParcelReader.createParcelable(parcel, readHeader, zzj.CREATOR);
            } else if (fieldId == 2) {
                list = SafeParcelReader.createTypedList(parcel, readHeader, ClientIdentity.CREATOR);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzm(zzj, list, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm[] newArray(int i) {
        return new zzm[i];
    }
}
