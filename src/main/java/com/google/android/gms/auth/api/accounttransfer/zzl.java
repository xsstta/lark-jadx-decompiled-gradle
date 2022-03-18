package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new C21551d();

    /* renamed from: a */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f52365a;

    /* renamed from: b */
    private final Set<Integer> f52366b;

    /* renamed from: c */
    private final int f52367c;

    /* renamed from: d */
    private ArrayList<zzr> f52368d;

    /* renamed from: e */
    private int f52369e;

    /* renamed from: f */
    private zzo f52370f;

    zzl(Set<Integer> set, int i, ArrayList<zzr> arrayList, int i2, zzo zzo) {
        this.f52366b = set;
        this.f52367c = i;
        this.f52368d = arrayList;
        this.f52369e = i2;
        this.f52370f = zzo;
    }

    public zzl() {
        this.f52366b = new HashSet(1);
        this.f52367c = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.f52366b;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.f52367c);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel, 2, this.f52368d, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.f52369e);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel, 4, this.f52370f, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public final boolean mo72969a(FastJsonResponse.Field field) {
        return this.f52366b.contains(Integer.valueOf(field.mo73783a()));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public final Object mo72970b(FastJsonResponse.Field field) {
        int a = field.mo73783a();
        if (a == 1) {
            return Integer.valueOf(this.f52367c);
        }
        if (a == 2) {
            return this.f52368d;
        }
        if (a == 4) {
            return this.f52370f;
        }
        int a2 = field.mo73783a();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(a2);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public final /* synthetic */ Map mo72968a() {
        return f52365a;
    }

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f52365a = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.m79044b("authenticatorData", 2, zzr.class));
        hashMap.put("progress", FastJsonResponse.Field.m79041a("progress", 4, zzo.class));
    }
}
