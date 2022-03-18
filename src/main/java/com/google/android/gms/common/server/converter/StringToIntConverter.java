package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.AbstractC21787a<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C21785b();

    /* renamed from: a */
    private final int f53126a;

    /* renamed from: b */
    private final HashMap<String, Integer> f53127b;

    /* renamed from: c */
    private final SparseArray<String> f53128c;

    /* renamed from: d */
    private final ArrayList<zaa> f53129d;

    StringToIntConverter(int i, ArrayList<zaa> arrayList) {
        this.f53126a = i;
        this.f53127b = new HashMap<>();
        this.f53128c = new SparseArray<>();
        this.f53129d = null;
        ArrayList<zaa> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            zaa zaa2 = arrayList2.get(i2);
            i2++;
            zaa zaa3 = zaa2;
            mo73768a(zaa3.f53130a, zaa3.f53131b);
        }
    }

    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new C21786c();

        /* renamed from: a */
        final String f53130a;

        /* renamed from: b */
        final int f53131b;

        /* renamed from: c */
        private final int f53132c;

        zaa(int i, String str, int i2) {
            this.f53132c = i;
            this.f53130a = str;
            this.f53131b = i2;
        }

        zaa(String str, int i) {
            this.f53132c = 1;
            this.f53130a = str;
            this.f53131b = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.f53132c);
            SafeParcelWriter.writeString(parcel, 2, this.f53130a, false);
            SafeParcelWriter.writeInt(parcel, 3, this.f53131b);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    public StringToIntConverter() {
        this.f53126a = 1;
        this.f53127b = new HashMap<>();
        this.f53128c = new SparseArray<>();
        this.f53129d = null;
    }

    /* renamed from: a */
    public final StringToIntConverter mo73768a(String str, int i) {
        this.f53127b.put(str, Integer.valueOf(i));
        this.f53128c.put(i, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53126a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f53127b.keySet()) {
            arrayList.add(new zaa(str, this.f53127b.get(str).intValue()));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse.AbstractC21787a
    /* renamed from: a */
    public final /* synthetic */ String mo73769a(Integer num) {
        String str = this.f53128c.get(num.intValue());
        return (str != null || !this.f53127b.containsKey("gms_unknown")) ? str : "gms_unknown";
    }
}
