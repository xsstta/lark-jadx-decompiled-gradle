package com.bytedance.ee.bear.contract;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u001b\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u001b\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003Ji\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\u0006\u0010#\u001a\u00020\u001eJ\t\u0010$\u001a\u00020\u001eHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/contract/DebugRequest;", "Landroid/os/Parcelable;", "time", "", "url", "", "requestHeaders", "", "", "logId", "responseHeader", "response", "(JLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getLogId", "()Ljava/lang/String;", "getRequestHeaders", "()Ljava/util/Map;", "getResponse", "getResponseHeader", "getTime", "()J", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "getResultCode", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "debug-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DebugRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C5063a();

    /* renamed from: a */
    private final long f14768a;

    /* renamed from: b */
    private final String f14769b;

    /* renamed from: c */
    private final Map<String, List<String>> f14770c;

    /* renamed from: d */
    private final String f14771d;

    /* renamed from: e */
    private final Map<String, List<String>> f14772e;

    /* renamed from: f */
    private final String f14773f;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.contract.DebugRequest$a */
    public static class C5063a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String readString;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            long readLong = parcel.readLong();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (true) {
                readString = parcel.readString();
                if (readInt == 0) {
                    break;
                }
                linkedHashMap.put(readString, parcel.createStringArrayList());
                readInt--;
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            while (true) {
                String readString3 = parcel.readString();
                if (readInt2 == 0) {
                    return new DebugRequest(readLong, readString2, linkedHashMap, readString, linkedHashMap2, readString3);
                }
                linkedHashMap2.put(readString3, parcel.createStringArrayList());
                readInt2--;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DebugRequest[i];
        }
    }

    public DebugRequest() {
        this(0, null, null, null, null, null, 63, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DebugRequest) {
                DebugRequest debugRequest = (DebugRequest) obj;
                if (!(this.f14768a == debugRequest.f14768a) || !Intrinsics.areEqual(this.f14769b, debugRequest.f14769b) || !Intrinsics.areEqual(this.f14770c, debugRequest.f14770c) || !Intrinsics.areEqual(this.f14771d, debugRequest.f14771d) || !Intrinsics.areEqual(this.f14772e, debugRequest.f14772e) || !Intrinsics.areEqual(this.f14773f, debugRequest.f14773f)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f14768a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f14769b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        Map<String, List<String>> map = this.f14770c;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.f14771d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, List<String>> map2 = this.f14772e;
        int hashCode4 = (hashCode3 + (map2 != null ? map2.hashCode() : 0)) * 31;
        String str3 = this.f14773f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "DebugRequest(time=" + this.f14768a + ", url=" + this.f14769b + ", requestHeaders=" + this.f14770c + ", logId=" + this.f14771d + ", responseHeader=" + this.f14772e + ", response=" + this.f14773f + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeLong(this.f14768a);
        parcel.writeString(this.f14769b);
        Map<String, List<String>> map = this.f14770c;
        parcel.writeInt(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeStringList(entry.getValue());
        }
        parcel.writeString(this.f14771d);
        Map<String, List<String>> map2 = this.f14772e;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, List<String>> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeStringList(entry2.getValue());
        }
        parcel.writeString(this.f14773f);
    }

    /* renamed from: b */
    public final String mo20046b() {
        return this.f14769b;
    }

    /* renamed from: c */
    public final Map<String, List<String>> mo20047c() {
        return this.f14770c;
    }

    /* renamed from: d */
    public final String mo20048d() {
        return this.f14771d;
    }

    /* renamed from: e */
    public final Map<String, List<String>> mo20050e() {
        return this.f14772e;
    }

    /* renamed from: f */
    public final String mo20052f() {
        return this.f14773f;
    }

    /* renamed from: a */
    public final int mo20045a() {
        try {
            return new JSONObject(this.f14773f).optInt("code");
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugRequest(long j, String str, Map<String, ? extends List<String>> map, String str2, Map<String, ? extends List<String>> map2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(map, "requestHeaders");
        Intrinsics.checkParameterIsNotNull(str2, "logId");
        Intrinsics.checkParameterIsNotNull(map2, "responseHeader");
        Intrinsics.checkParameterIsNotNull(str3, "response");
        this.f14768a = j;
        this.f14769b = str;
        this.f14770c = map;
        this.f14771d = str2;
        this.f14772e = map2;
        this.f14773f = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DebugRequest(long r9, java.lang.String r11, java.util.Map r12, java.lang.String r13, java.util.Map r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L_0x0007
            r0 = 0
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r16 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0010
            r2 = r3
            goto L_0x0011
        L_0x0010:
            r2 = r11
        L_0x0011:
            r4 = r16 & 4
            if (r4 == 0) goto L_0x001d
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Map r4 = (java.util.Map) r4
            goto L_0x001e
        L_0x001d:
            r4 = r12
        L_0x001e:
            r5 = r16 & 8
            if (r5 == 0) goto L_0x0024
            r5 = r3
            goto L_0x0025
        L_0x0024:
            r5 = r13
        L_0x0025:
            r6 = r16 & 16
            if (r6 == 0) goto L_0x0031
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map r6 = (java.util.Map) r6
            goto L_0x0032
        L_0x0031:
            r6 = r14
        L_0x0032:
            r7 = r16 & 32
            if (r7 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r3 = r15
        L_0x0038:
            r9 = r8
            r10 = r0
            r12 = r2
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r3
            r9.<init>(r10, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.contract.DebugRequest.<init>(long, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
