package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C21800l();

    /* renamed from: a */
    final String f53170a;

    /* renamed from: b */
    final ArrayList<zam> f53171b;

    /* renamed from: c */
    private final int f53172c;

    zal(int i, String str, ArrayList<zam> arrayList) {
        this.f53172c = i;
        this.f53170a = str;
        this.f53171b = arrayList;
    }

    zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f53172c = 1;
        this.f53170a = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, map.get(str2)));
            }
        }
        this.f53171b = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53172c);
        SafeParcelWriter.writeString(parcel, 2, this.f53170a, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f53171b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
