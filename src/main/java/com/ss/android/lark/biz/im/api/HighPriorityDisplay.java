package com.ss.android.lark.biz.im.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/biz/im/api/HighPriorityDisplay;", "", "content", "", "rankTime", "", "displayTime", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getContent", "()Ljava/lang/String;", "getDisplayTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRankTime", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/ss/android/lark/biz/im/api/HighPriorityDisplay;", "equals", "", "other", "hashCode", "", "toString", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.api.g */
public final class HighPriorityDisplay {

    /* renamed from: a */
    private final String f74245a;

    /* renamed from: b */
    private final Long f74246b;

    /* renamed from: c */
    private final Long f74247c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighPriorityDisplay)) {
            return false;
        }
        HighPriorityDisplay gVar = (HighPriorityDisplay) obj;
        return Intrinsics.areEqual(this.f74245a, gVar.f74245a) && Intrinsics.areEqual(this.f74246b, gVar.f74246b) && Intrinsics.areEqual(this.f74247c, gVar.f74247c);
    }

    public int hashCode() {
        String str = this.f74245a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.f74246b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.f74247c;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "HighPriorityDisplay(content=" + this.f74245a + ", rankTime=" + this.f74246b + ", displayTime=" + this.f74247c + ")";
    }

    /* renamed from: a */
    public final String mo106713a() {
        return this.f74245a;
    }

    /* renamed from: b */
    public final Long mo106714b() {
        return this.f74247c;
    }

    public HighPriorityDisplay(String str, Long l, Long l2) {
        this.f74245a = str;
        this.f74246b = l;
        this.f74247c = l2;
    }
}
