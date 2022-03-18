package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;

public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C21784a();

    /* renamed from: a */
    private final int f53133a;

    /* renamed from: b */
    private final StringToIntConverter f53134b;

    zaa(int i, StringToIntConverter stringToIntConverter) {
        this.f53133a = i;
        this.f53134b = stringToIntConverter;
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f53133a = 1;
        this.f53134b = stringToIntConverter;
    }

    /* renamed from: a */
    public static zaa m79031a(FastJsonResponse.AbstractC21787a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: a */
    public final FastJsonResponse.AbstractC21787a<?, ?> mo73778a() {
        StringToIntConverter stringToIntConverter = this.f53134b;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53133a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f53134b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
