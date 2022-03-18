package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zzr extends zzaz {
    public static final Parcelable.Creator<zzr> CREATOR = new C21554g();

    /* renamed from: a */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f52378a;

    /* renamed from: b */
    private final Set<Integer> f52379b;

    /* renamed from: c */
    private final int f52380c;

    /* renamed from: d */
    private zzt f52381d;

    /* renamed from: e */
    private String f52382e;

    /* renamed from: f */
    private String f52383f;

    /* renamed from: g */
    private String f52384g;

    public zzr() {
        this.f52379b = new HashSet(3);
        this.f52380c = 1;
    }

    zzr(Set<Integer> set, int i, zzt zzt, String str, String str2, String str3) {
        this.f52379b = set;
        this.f52380c = i;
        this.f52381d = zzt;
        this.f52382e = str;
        this.f52383f = str2;
        this.f52384g = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.f52379b;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.f52380c);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeParcelable(parcel, 2, this.f52381d, i, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeString(parcel, 3, this.f52382e, true);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeString(parcel, 4, this.f52383f, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.writeString(parcel, 5, this.f52384g, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public boolean mo72969a(FastJsonResponse.Field field) {
        return this.f52379b.contains(Integer.valueOf(field.mo73783a()));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public Object mo72970b(FastJsonResponse.Field field) {
        int a = field.mo73783a();
        if (a == 1) {
            return Integer.valueOf(this.f52380c);
        }
        if (a == 2) {
            return this.f52381d;
        }
        if (a == 3) {
            return this.f52382e;
        }
        if (a == 4) {
            return this.f52383f;
        }
        int a2 = field.mo73783a();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(a2);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public /* synthetic */ Map mo72968a() {
        return f52378a;
    }

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f52378a = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.m79041a("authenticatorInfo", 2, zzt.class));
        hashMap.put("signature", FastJsonResponse.Field.m79043b("signature", 3));
        hashMap.put("package", FastJsonResponse.Field.m79043b("package", 4));
    }
}
