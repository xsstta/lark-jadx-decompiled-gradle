package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C21799k();

    /* renamed from: a */
    private final int f53167a;

    /* renamed from: b */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f53168b;

    /* renamed from: c */
    private final String f53169c;

    zak(int i, ArrayList<zal> arrayList, String str) {
        this.f53167a = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = arrayList.get(i2);
            String str2 = zal.f53170a;
            HashMap hashMap2 = new HashMap();
            int size2 = zal.f53171b.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = zal.f53171b.get(i3);
                hashMap2.put(zam.f53173a, zam.f53174b);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f53168b = hashMap;
        this.f53169c = (String) Preconditions.checkNotNull(str);
        mo73805a();
    }

    /* renamed from: a */
    public final void mo73805a() {
        for (String str : this.f53168b.keySet()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f53168b.get(str);
            for (String str2 : map.keySet()) {
                map.get(str2).mo73785a(this);
            }
        }
    }

    /* renamed from: a */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo73804a(String str) {
        return this.f53168b.get(str);
    }

    /* renamed from: b */
    public final String mo73806b() {
        return this.f53169c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f53168b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f53168b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53167a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f53168b.keySet()) {
            arrayList.add(new zal(str, this.f53168b.get(str)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.f53169c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
