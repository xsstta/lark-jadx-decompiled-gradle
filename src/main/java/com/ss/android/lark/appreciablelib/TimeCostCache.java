package com.ss.android.lark.appreciablelib;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ss/android/lark/appreciablelib/TimeCostCache;", "", "params", "Lcom/ss/android/lark/appreciablelib/TimeCostParams;", "startTimestamp", "", UpdateKey.STATUS, "Lcom/ss/android/lark/appreciablelib/CacheStatus;", "(Lcom/ss/android/lark/appreciablelib/TimeCostParams;JLcom/ss/android/lark/appreciablelib/CacheStatus;)V", "getParams", "()Lcom/ss/android/lark/appreciablelib/TimeCostParams;", "setParams", "(Lcom/ss/android/lark/appreciablelib/TimeCostParams;)V", "getStartTimestamp", "()J", "setStartTimestamp", "(J)V", "getStatus", "()Lcom/ss/android/lark/appreciablelib/CacheStatus;", "setStatus", "(Lcom/ss/android/lark/appreciablelib/CacheStatus;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "appreciablelib_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.appreciablelib.f */
public final class TimeCostCache {

    /* renamed from: a */
    private TimeCostParams f73128a;

    /* renamed from: b */
    private long f73129b;

    /* renamed from: c */
    private CacheStatus f73130c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TimeCostCache) {
                TimeCostCache fVar = (TimeCostCache) obj;
                if (Intrinsics.areEqual(this.f73128a, fVar.f73128a)) {
                    if (!(this.f73129b == fVar.f73129b) || !Intrinsics.areEqual(this.f73130c, fVar.f73130c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        TimeCostParams gVar = this.f73128a;
        int i = 0;
        int hashCode = gVar != null ? gVar.hashCode() : 0;
        long j = this.f73129b;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        CacheStatus cacheStatus = this.f73130c;
        if (cacheStatus != null) {
            i = cacheStatus.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "TimeCostCache(params=" + this.f73128a + ", startTimestamp=" + this.f73129b + ", status=" + this.f73130c + ")";
    }

    /* renamed from: a */
    public final TimeCostParams mo103553a() {
        return this.f73128a;
    }

    /* renamed from: b */
    public final long mo103556b() {
        return this.f73129b;
    }

    /* renamed from: c */
    public final CacheStatus mo103557c() {
        return this.f73130c;
    }

    /* renamed from: a */
    public final void mo103554a(long j) {
        this.f73129b = j;
    }

    /* renamed from: a */
    public final void mo103555a(CacheStatus cacheStatus) {
        Intrinsics.checkParameterIsNotNull(cacheStatus, "<set-?>");
        this.f73130c = cacheStatus;
    }

    public TimeCostCache(TimeCostParams gVar, long j, CacheStatus cacheStatus) {
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        Intrinsics.checkParameterIsNotNull(cacheStatus, UpdateKey.STATUS);
        this.f73128a = gVar;
        this.f73129b = j;
        this.f73130c = cacheStatus;
        gVar.mo103566b(j);
    }
}
