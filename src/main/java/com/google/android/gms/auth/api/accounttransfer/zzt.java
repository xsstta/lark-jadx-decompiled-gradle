package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C0513a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class zzt extends zzaz {
    public static final Parcelable.Creator<zzt> CREATOR = new C21555h();

    /* renamed from: a */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f52385a;

    /* renamed from: b */
    private final Set<Integer> f52386b;

    /* renamed from: c */
    private final int f52387c;

    /* renamed from: d */
    private String f52388d;

    /* renamed from: e */
    private int f52389e;

    /* renamed from: f */
    private byte[] f52390f;

    /* renamed from: g */
    private PendingIntent f52391g;

    /* renamed from: h */
    private DeviceMetaData f52392h;

    zzt(Set<Integer> set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f52386b = set;
        this.f52387c = i;
        this.f52388d = str;
        this.f52389e = i2;
        this.f52390f = bArr;
        this.f52391g = pendingIntent;
        this.f52392h = deviceMetaData;
    }

    public zzt() {
        this.f52386b = new C0513a(3);
        this.f52387c = 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.f52386b;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.f52387c);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeString(parcel, 2, this.f52388d, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.f52389e);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeByteArray(parcel, 4, this.f52390f, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.writeParcelable(parcel, 5, this.f52391g, i, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.writeParcelable(parcel, 6, this.f52392h, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public boolean mo72969a(FastJsonResponse.Field field) {
        return this.f52386b.contains(Integer.valueOf(field.mo73783a()));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public Object mo72970b(FastJsonResponse.Field field) {
        int a = field.mo73783a();
        if (a == 1) {
            return Integer.valueOf(this.f52387c);
        }
        if (a == 2) {
            return this.f52388d;
        }
        if (a == 3) {
            return Integer.valueOf(this.f52389e);
        }
        if (a == 4) {
            return this.f52390f;
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
        return f52385a;
    }

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f52385a = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.m79043b("accountType", 2));
        hashMap.put(UpdateKey.STATUS, FastJsonResponse.Field.m79040a(UpdateKey.STATUS, 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.m79046d("transferBytes", 4));
    }
}
