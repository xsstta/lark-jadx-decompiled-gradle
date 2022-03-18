package com.ss.android.vc.entity.tab;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/ss/android/vc/entity/tab/VcTabDetailResponse;", "", "historyId", "", "vcTabDetailInfos", "", "Lcom/ss/android/vc/entity/tab/VcTabDetailInfo;", "meetingNumber", "meetingUrl", "accessInfos", "Lcom/ss/android/vc/entity/tab/AccessInfos;", "calendarEventRule", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/vc/entity/tab/AccessInfos;Ljava/lang/String;)V", "getAccessInfos", "()Lcom/ss/android/vc/entity/tab/AccessInfos;", "getCalendarEventRule", "()Ljava/lang/String;", "getHistoryId", "getMeetingNumber", "getMeetingUrl", "getVcTabDetailInfos", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.tab.g */
public final class VcTabDetailResponse {

    /* renamed from: a */
    private final String f152829a;

    /* renamed from: b */
    private final List<VcTabDetailInfo> f152830b;

    /* renamed from: c */
    private final String f152831c;

    /* renamed from: d */
    private final String f152832d;

    /* renamed from: e */
    private final AccessInfos f152833e;

    /* renamed from: f */
    private final String f152834f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VcTabDetailResponse)) {
            return false;
        }
        VcTabDetailResponse gVar = (VcTabDetailResponse) obj;
        return Intrinsics.areEqual(this.f152829a, gVar.f152829a) && Intrinsics.areEqual(this.f152830b, gVar.f152830b) && Intrinsics.areEqual(this.f152831c, gVar.f152831c) && Intrinsics.areEqual(this.f152832d, gVar.f152832d) && Intrinsics.areEqual(this.f152833e, gVar.f152833e) && Intrinsics.areEqual(this.f152834f, gVar.f152834f);
    }

    public int hashCode() {
        String str = this.f152829a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<VcTabDetailInfo> list = this.f152830b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f152831c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f152832d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AccessInfos aVar = this.f152833e;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str4 = this.f152834f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "VcTabDetailResponse(historyId=" + this.f152829a + ", vcTabDetailInfos=" + this.f152830b + ", meetingNumber=" + this.f152831c + ", meetingUrl=" + this.f152832d + ", accessInfos=" + this.f152833e + ", calendarEventRule=" + this.f152834f + ")";
    }

    /* renamed from: a */
    public final List<VcTabDetailInfo> mo210448a() {
        return this.f152830b;
    }

    /* renamed from: b */
    public final String mo210449b() {
        return this.f152831c;
    }

    /* renamed from: c */
    public final String mo210450c() {
        return this.f152832d;
    }

    /* renamed from: d */
    public final AccessInfos mo210451d() {
        return this.f152833e;
    }

    /* renamed from: e */
    public final String mo210452e() {
        return this.f152834f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.vc.entity.tab.VcTabDetailInfo> */
    /* JADX WARN: Multi-variable type inference failed */
    public VcTabDetailResponse(String str, List<? extends VcTabDetailInfo> list, String str2, String str3, AccessInfos aVar, String str4) {
        this.f152829a = str;
        this.f152830b = list;
        this.f152831c = str2;
        this.f152832d = str3;
        this.f152833e = aVar;
        this.f152834f = str4;
    }
}
