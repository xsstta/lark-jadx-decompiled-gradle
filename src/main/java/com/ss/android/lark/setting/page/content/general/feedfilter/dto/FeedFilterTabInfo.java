package com.ss.android.lark.setting.page.content.general.feedfilter.dto;

import com.bytedance.lark.pb.feed.v1.FeedFilter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003JQ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "", "isFilterEnabled", "", "usedFilters", "", "Lcom/bytedance/lark/pb/feed/v1/FeedFilter;", "allFilters", "showMute", "showAtAllInAtFilter", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "(ZLjava/util/List;Ljava/util/List;ZZJ)V", "getAllFilters", "()Ljava/util/List;", "setAllFilters", "(Ljava/util/List;)V", "()Z", "setFilterEnabled", "(Z)V", "getShowAtAllInAtFilter", "setShowAtAllInAtFilter", "getShowMute", "setShowMute", "getUsedFilters", "setUsedFilters", "getVersion", "()J", "setVersion", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.dto.b */
public final class FeedFilterTabInfo {

    /* renamed from: a */
    private boolean f134778a;

    /* renamed from: b */
    private List<FeedFilter> f134779b;

    /* renamed from: c */
    private List<FeedFilter> f134780c;

    /* renamed from: d */
    private boolean f134781d;

    /* renamed from: e */
    private boolean f134782e;

    /* renamed from: f */
    private long f134783f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedFilterTabInfo)) {
            return false;
        }
        FeedFilterTabInfo bVar = (FeedFilterTabInfo) obj;
        return this.f134778a == bVar.f134778a && Intrinsics.areEqual(this.f134779b, bVar.f134779b) && Intrinsics.areEqual(this.f134780c, bVar.f134780c) && this.f134781d == bVar.f134781d && this.f134782e == bVar.f134782e && this.f134783f == bVar.f134783f;
    }

    public int hashCode() {
        boolean z = this.f134778a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        List<FeedFilter> list = this.f134779b;
        int i6 = 0;
        int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        List<FeedFilter> list2 = this.f134780c;
        if (list2 != null) {
            i6 = list2.hashCode();
        }
        int i7 = (hashCode + i6) * 31;
        boolean z2 = this.f134781d;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f134782e;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return ((i11 + i) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f134783f);
    }

    public String toString() {
        return "FeedFilterTabInfo(isFilterEnabled=" + this.f134778a + ", usedFilters=" + this.f134779b + ", allFilters=" + this.f134780c + ", showMute=" + this.f134781d + ", showAtAllInAtFilter=" + this.f134782e + ", version=" + this.f134783f + ")";
    }

    /* renamed from: b */
    public final List<FeedFilter> mo186308b() {
        return this.f134779b;
    }

    /* renamed from: c */
    public final List<FeedFilter> mo186310c() {
        return this.f134780c;
    }

    /* renamed from: d */
    public final boolean mo186312d() {
        return this.f134781d;
    }

    /* renamed from: e */
    public final boolean mo186313e() {
        return this.f134782e;
    }

    /* renamed from: a */
    public final boolean mo186307a() {
        return this.f134778a;
    }

    /* renamed from: a */
    public final void mo186306a(boolean z) {
        this.f134778a = z;
    }

    /* renamed from: b */
    public final void mo186309b(boolean z) {
        this.f134781d = z;
    }

    /* renamed from: c */
    public final void mo186311c(boolean z) {
        this.f134782e = z;
    }

    public FeedFilterTabInfo(boolean z, List<FeedFilter> list, List<FeedFilter> list2, boolean z2, boolean z3, long j) {
        Intrinsics.checkParameterIsNotNull(list, "usedFilters");
        Intrinsics.checkParameterIsNotNull(list2, "allFilters");
        this.f134778a = z;
        this.f134779b = list;
        this.f134780c = list2;
        this.f134781d = z2;
        this.f134782e = z3;
        this.f134783f = j;
    }
}
