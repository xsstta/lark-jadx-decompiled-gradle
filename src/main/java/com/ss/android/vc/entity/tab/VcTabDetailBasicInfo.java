package com.ss.android.vc.entity.tab;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/entity/tab/VcTabDetailBasicInfo;", "", "meetingNumber", "", "meetingUrl", "accessInfos", "Lcom/ss/android/vc/entity/tab/AccessInfos;", "calendarEventRule", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/vc/entity/tab/AccessInfos;Ljava/lang/String;)V", "getAccessInfos", "()Lcom/ss/android/vc/entity/tab/AccessInfos;", "getCalendarEventRule", "()Ljava/lang/String;", "getMeetingNumber", "getMeetingUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.tab.f */
public final class VcTabDetailBasicInfo {

    /* renamed from: a */
    private final String f152825a;

    /* renamed from: b */
    private final String f152826b;

    /* renamed from: c */
    private final AccessInfos f152827c;

    /* renamed from: d */
    private final String f152828d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VcTabDetailBasicInfo)) {
            return false;
        }
        VcTabDetailBasicInfo fVar = (VcTabDetailBasicInfo) obj;
        return Intrinsics.areEqual(this.f152825a, fVar.f152825a) && Intrinsics.areEqual(this.f152826b, fVar.f152826b) && Intrinsics.areEqual(this.f152827c, fVar.f152827c) && Intrinsics.areEqual(this.f152828d, fVar.f152828d);
    }

    public int hashCode() {
        String str = this.f152825a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f152826b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AccessInfos aVar = this.f152827c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str3 = this.f152828d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "VcTabDetailBasicInfo(meetingNumber=" + this.f152825a + ", meetingUrl=" + this.f152826b + ", accessInfos=" + this.f152827c + ", calendarEventRule=" + this.f152828d + ")";
    }

    /* renamed from: a */
    public final String mo210441a() {
        return this.f152825a;
    }

    /* renamed from: b */
    public final String mo210442b() {
        return this.f152826b;
    }

    /* renamed from: c */
    public final AccessInfos mo210443c() {
        return this.f152827c;
    }

    /* renamed from: d */
    public final String mo210444d() {
        return this.f152828d;
    }

    public VcTabDetailBasicInfo(String str, String str2, AccessInfos aVar, String str3) {
        this.f152825a = str;
        this.f152826b = str2;
        this.f152827c = aVar;
        this.f152828d = str3;
    }
}
