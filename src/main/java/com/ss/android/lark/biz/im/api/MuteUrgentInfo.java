package com.ss.android.lark.biz.im.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/biz/im/api/MuteUrgentInfo;", "", "rankTime", "", "displayTime", "urgentContent", "", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getDisplayTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRankTime", "getUrgentContent", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/ss/android/lark/biz/im/api/MuteUrgentInfo;", "equals", "", "other", "hashCode", "", "toString", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.api.y */
public final class MuteUrgentInfo {

    /* renamed from: a */
    private final Long f74290a;

    /* renamed from: b */
    private final Long f74291b;

    /* renamed from: c */
    private final String f74292c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MuteUrgentInfo)) {
            return false;
        }
        MuteUrgentInfo yVar = (MuteUrgentInfo) obj;
        return Intrinsics.areEqual(this.f74290a, yVar.f74290a) && Intrinsics.areEqual(this.f74291b, yVar.f74291b) && Intrinsics.areEqual(this.f74292c, yVar.f74292c);
    }

    public int hashCode() {
        Long l = this.f74290a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.f74291b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.f74292c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "MuteUrgentInfo(rankTime=" + this.f74290a + ", displayTime=" + this.f74291b + ", urgentContent=" + this.f74292c + ")";
    }

    /* renamed from: a */
    public final Long mo106773a() {
        return this.f74290a;
    }

    /* renamed from: b */
    public final Long mo106774b() {
        return this.f74291b;
    }

    /* renamed from: c */
    public final String mo106775c() {
        return this.f74292c;
    }

    public MuteUrgentInfo(Long l, Long l2, String str) {
        this.f74290a = l;
        this.f74291b = l2;
        this.f74292c = str;
    }
}
