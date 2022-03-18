package com.ss.android.lark.calendar.api.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/api/entity/PoiInfo;", "", "name", "", "address", "longitude", "", "latitude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getAddress", "()Ljava/lang/String;", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/ss/android/lark/calendar/api/entity/PoiInfo;", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.api.entity.c */
public final class PoiInfo {

    /* renamed from: a */
    private final String f74905a;

    /* renamed from: b */
    private final String f74906b;

    /* renamed from: c */
    private final Double f74907c;

    /* renamed from: d */
    private final Double f74908d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiInfo)) {
            return false;
        }
        PoiInfo cVar = (PoiInfo) obj;
        return Intrinsics.areEqual(this.f74905a, cVar.f74905a) && Intrinsics.areEqual(this.f74906b, cVar.f74906b) && Intrinsics.areEqual(this.f74907c, cVar.f74907c) && Intrinsics.areEqual(this.f74908d, cVar.f74908d);
    }

    public int hashCode() {
        String str = this.f74905a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f74906b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Double d = this.f74907c;
        int hashCode3 = (hashCode2 + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.f74908d;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "PoiInfo(name=" + this.f74905a + ", address=" + this.f74906b + ", longitude=" + this.f74907c + ", latitude=" + this.f74908d + ")";
    }

    /* renamed from: a */
    public final String mo108406a() {
        return this.f74905a;
    }

    /* renamed from: b */
    public final String mo108407b() {
        return this.f74906b;
    }

    /* renamed from: c */
    public final Double mo108408c() {
        return this.f74907c;
    }

    /* renamed from: d */
    public final Double mo108409d() {
        return this.f74908d;
    }

    public PoiInfo(String str, String str2, Double d, Double d2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f74905a = str;
        this.f74906b = str2;
        this.f74907c = d;
        this.f74908d = d2;
    }
}
