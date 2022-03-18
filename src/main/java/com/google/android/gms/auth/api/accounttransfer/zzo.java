package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;

public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new C21553f();

    /* renamed from: a */
    private static final ArrayMap<String, FastJsonResponse.Field<?, ?>> f52371a;

    /* renamed from: b */
    private final int f52372b;

    /* renamed from: c */
    private List<String> f52373c;

    /* renamed from: d */
    private List<String> f52374d;

    /* renamed from: e */
    private List<String> f52375e;

    /* renamed from: f */
    private List<String> f52376f;

    /* renamed from: g */
    private List<String> f52377g;

    public zzo() {
        this.f52372b = 1;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public boolean mo72969a(FastJsonResponse.Field field) {
        return true;
    }

    zzo(int i, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.f52372b = i;
        this.f52373c = list;
        this.f52374d = list2;
        this.f52375e = list3;
        this.f52376f = list4;
        this.f52377g = list5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52372b);
        SafeParcelWriter.writeStringList(parcel, 2, this.f52373c, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.f52374d, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.f52375e, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.f52376f, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f52377g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo72968a() {
        return f52371a;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public Object mo72970b(FastJsonResponse.Field field) {
        switch (field.mo73783a()) {
            case 1:
                return Integer.valueOf(this.f52372b);
            case 2:
                return this.f52373c;
            case 3:
                return this.f52374d;
            case 4:
                return this.f52375e;
            case 5:
                return this.f52376f;
            case 6:
                return this.f52377g;
            default:
                int a = field.mo73783a();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
        }
    }

    static {
        ArrayMap<String, FastJsonResponse.Field<?, ?>> arrayMap = new ArrayMap<>();
        f52371a = arrayMap;
        arrayMap.put("registered", FastJsonResponse.Field.m79045c("registered", 2));
        arrayMap.put("in_progress", FastJsonResponse.Field.m79045c("in_progress", 3));
        arrayMap.put("success", FastJsonResponse.Field.m79045c("success", 4));
        arrayMap.put("failed", FastJsonResponse.Field.m79045c("failed", 5));
        arrayMap.put("escrowed", FastJsonResponse.Field.m79045c("escrowed", 6));
    }
}
