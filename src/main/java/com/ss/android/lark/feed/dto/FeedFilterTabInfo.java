package com.ss.android.lark.feed.dto;

import com.bytedance.lark.pb.feed.v1.FeedFilter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ss/android/lark/feed/dto/FeedFilterTabInfo;", "", "isFilterEnabled", "", "usedFilters", "", "Lcom/bytedance/lark/pb/feed/v1/FeedFilter;", "allFilters", "showMute", "enableAtAllInAtMeFeed", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "(ZLjava/util/List;Ljava/util/List;ZZJ)V", "getAllFilters", "()Ljava/util/List;", "getEnableAtAllInAtMeFeed", "()Z", "getShowMute", "getUsedFilters", "getVersion", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.dto.c */
public final class FeedFilterTabInfo {

    /* renamed from: a */
    private final boolean f97718a;

    /* renamed from: b */
    private final List<FeedFilter> f97719b;

    /* renamed from: c */
    private final List<FeedFilter> f97720c;

    /* renamed from: d */
    private final boolean f97721d;

    /* renamed from: e */
    private final boolean f97722e;

    /* renamed from: f */
    private final long f97723f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedFilterTabInfo)) {
            return false;
        }
        FeedFilterTabInfo cVar = (FeedFilterTabInfo) obj;
        return this.f97718a == cVar.f97718a && Intrinsics.areEqual(this.f97719b, cVar.f97719b) && Intrinsics.areEqual(this.f97720c, cVar.f97720c) && this.f97721d == cVar.f97721d && this.f97722e == cVar.f97722e && this.f97723f == cVar.f97723f;
    }

    public int hashCode() {
        boolean z = this.f97718a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        List<FeedFilter> list = this.f97719b;
        int i6 = 0;
        int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        List<FeedFilter> list2 = this.f97720c;
        if (list2 != null) {
            i6 = list2.hashCode();
        }
        int i7 = (hashCode + i6) * 31;
        boolean z2 = this.f97721d;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f97722e;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        long j = this.f97723f;
        return ((i11 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "FeedFilterTabInfo(isFilterEnabled=" + this.f97718a + ", usedFilters=" + this.f97719b + ", allFilters=" + this.f97720c + ", showMute=" + this.f97721d + ", enableAtAllInAtMeFeed=" + this.f97722e + ", version=" + this.f97723f + ")";
    }

    /* renamed from: a */
    public final boolean mo139390a() {
        return this.f97718a;
    }

    /* renamed from: b */
    public final List<FeedFilter> mo139391b() {
        return this.f97719b;
    }

    /* renamed from: c */
    public final boolean mo139392c() {
        return this.f97721d;
    }

    /* renamed from: d */
    public final boolean mo139393d() {
        return this.f97722e;
    }

    public FeedFilterTabInfo(boolean z, List<FeedFilter> list, List<FeedFilter> list2, boolean z2, boolean z3, long j) {
        Intrinsics.checkParameterIsNotNull(list, "usedFilters");
        Intrinsics.checkParameterIsNotNull(list2, "allFilters");
        this.f97718a = z;
        this.f97719b = list;
        this.f97720c = list2;
        this.f97721d = z2;
        this.f97722e = z3;
        this.f97723f = j;
    }
}
