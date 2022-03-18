package com.ss.android.lark.appreciablelib;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bA\b\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\u0010\u0017J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\u0015\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0003J\u0015\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0003J\u0015\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0003J\u0015\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010K\u001a\u00020\fHÆ\u0003J\t\u0010L\u001a\u00020\u000eHÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003JÇ\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013HÆ\u0001J\u0013\u0010P\u001a\u00020\f2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020\u000eHÖ\u0001J\t\u0010S\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006T"}, d2 = {"Lcom/ss/android/lark/appreciablelib/TimeCostParams;", "", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "event", "", "latency", "", "page", "needNet", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "lastFrontTimestamp", "backgroundTime", "isInBackground", "latencyDetail", "Ljava/util/concurrent/ConcurrentHashMap;", "extra", "extraMetric", "extraCategory", "(Lcom/ss/android/lark/appreciablelib/Biz;Lcom/ss/android/lark/appreciablelib/Scene;Ljava/lang/String;JLjava/lang/String;ZIJJZLjava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;)V", "getBackgroundTime", "()J", "setBackgroundTime", "(J)V", "getBiz", "()Lcom/ss/android/lark/appreciablelib/Biz;", "setBiz", "(Lcom/ss/android/lark/appreciablelib/Biz;)V", "getEvent", "()Ljava/lang/String;", "setEvent", "(Ljava/lang/String;)V", "getExtra", "()Ljava/util/concurrent/ConcurrentHashMap;", "setExtra", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "getExtraCategory", "setExtraCategory", "getExtraMetric", "setExtraMetric", "()Z", "setInBackground", "(Z)V", "getLastFrontTimestamp", "setLastFrontTimestamp", "getLatency", "setLatency", "getLatencyDetail", "setLatencyDetail", "getNeedNet", "setNeedNet", "getPage", "setPage", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "setScene", "(Lcom/ss/android/lark/appreciablelib/Scene;)V", "getVersion", "()I", "setVersion", "(I)V", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "appreciablelib_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.appreciablelib.g */
public final class TimeCostParams {

    /* renamed from: a */
    private Biz f73131a;

    /* renamed from: b */
    private Scene f73132b;

    /* renamed from: c */
    private String f73133c;

    /* renamed from: d */
    private long f73134d;

    /* renamed from: e */
    private String f73135e;

    /* renamed from: f */
    private boolean f73136f;

    /* renamed from: g */
    private int f73137g;

    /* renamed from: h */
    private long f73138h;

    /* renamed from: i */
    private long f73139i;

    /* renamed from: j */
    private boolean f73140j;

    /* renamed from: k */
    private ConcurrentHashMap<String, Object> f73141k;

    /* renamed from: l */
    private ConcurrentHashMap<String, Object> f73142l;

    /* renamed from: m */
    private ConcurrentHashMap<String, Object> f73143m;

    /* renamed from: n */
    private ConcurrentHashMap<String, Object> f73144n;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TimeCostParams) {
                TimeCostParams gVar = (TimeCostParams) obj;
                if (Intrinsics.areEqual(this.f73131a, gVar.f73131a) && Intrinsics.areEqual(this.f73132b, gVar.f73132b) && Intrinsics.areEqual(this.f73133c, gVar.f73133c)) {
                    if ((this.f73134d == gVar.f73134d) && Intrinsics.areEqual(this.f73135e, gVar.f73135e)) {
                        if (this.f73136f == gVar.f73136f) {
                            if (this.f73137g == gVar.f73137g) {
                                if (this.f73138h == gVar.f73138h) {
                                    if (this.f73139i == gVar.f73139i) {
                                        if (!(this.f73140j == gVar.f73140j) || !Intrinsics.areEqual(this.f73141k, gVar.f73141k) || !Intrinsics.areEqual(this.f73142l, gVar.f73142l) || !Intrinsics.areEqual(this.f73143m, gVar.f73143m) || !Intrinsics.areEqual(this.f73144n, gVar.f73144n)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Biz biz = this.f73131a;
        int i = 0;
        int hashCode = (biz != null ? biz.hashCode() : 0) * 31;
        Scene scene = this.f73132b;
        int hashCode2 = (hashCode + (scene != null ? scene.hashCode() : 0)) * 31;
        String str = this.f73133c;
        int hashCode3 = str != null ? str.hashCode() : 0;
        long j = this.f73134d;
        int i2 = (((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f73135e;
        int hashCode4 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f73136f;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        long j2 = this.f73138h;
        long j3 = this.f73139i;
        int i7 = (((((((hashCode4 + i4) * 31) + this.f73137g) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        boolean z2 = this.f73140j;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        int i8 = (i7 + i3) * 31;
        ConcurrentHashMap<String, Object> concurrentHashMap = this.f73141k;
        int hashCode5 = (i8 + (concurrentHashMap != null ? concurrentHashMap.hashCode() : 0)) * 31;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = this.f73142l;
        int hashCode6 = (hashCode5 + (concurrentHashMap2 != null ? concurrentHashMap2.hashCode() : 0)) * 31;
        ConcurrentHashMap<String, Object> concurrentHashMap3 = this.f73143m;
        int hashCode7 = (hashCode6 + (concurrentHashMap3 != null ? concurrentHashMap3.hashCode() : 0)) * 31;
        ConcurrentHashMap<String, Object> concurrentHashMap4 = this.f73144n;
        if (concurrentHashMap4 != null) {
            i = concurrentHashMap4.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "TimeCostParams(biz=" + this.f73131a + ", scene=" + this.f73132b + ", event=" + this.f73133c + ", latency=" + this.f73134d + ", page=" + this.f73135e + ", needNet=" + this.f73136f + ", version=" + this.f73137g + ", lastFrontTimestamp=" + this.f73138h + ", backgroundTime=" + this.f73139i + ", isInBackground=" + this.f73140j + ", latencyDetail=" + this.f73141k + ", extra=" + this.f73142l + ", extraMetric=" + this.f73143m + ", extraCategory=" + this.f73144n + ")";
    }

    /* renamed from: a */
    public final Biz mo103561a() {
        return this.f73131a;
    }

    /* renamed from: b */
    public final Scene mo103565b() {
        return this.f73132b;
    }

    /* renamed from: c */
    public final String mo103567c() {
        return this.f73133c;
    }

    /* renamed from: d */
    public final long mo103569d() {
        return this.f73134d;
    }

    /* renamed from: e */
    public final String mo103570e() {
        return this.f73135e;
    }

    /* renamed from: f */
    public final boolean mo103572f() {
        return this.f73136f;
    }

    /* renamed from: g */
    public final int mo103573g() {
        return this.f73137g;
    }

    /* renamed from: h */
    public final long mo103574h() {
        return this.f73138h;
    }

    /* renamed from: i */
    public final long mo103576i() {
        return this.f73139i;
    }

    /* renamed from: j */
    public final boolean mo103577j() {
        return this.f73140j;
    }

    /* renamed from: k */
    public final ConcurrentHashMap<String, Object> mo103578k() {
        return this.f73141k;
    }

    /* renamed from: l */
    public final ConcurrentHashMap<String, Object> mo103579l() {
        return this.f73142l;
    }

    /* renamed from: m */
    public final ConcurrentHashMap<String, Object> mo103580m() {
        return this.f73143m;
    }

    /* renamed from: n */
    public final ConcurrentHashMap<String, Object> mo103581n() {
        return this.f73144n;
    }

    /* renamed from: a */
    public final void mo103562a(long j) {
        this.f73134d = j;
    }

    /* renamed from: b */
    public final void mo103566b(long j) {
        this.f73138h = j;
    }

    /* renamed from: c */
    public final void mo103568c(long j) {
        this.f73139i = j;
    }

    /* renamed from: a */
    public final void mo103563a(String str) {
        this.f73135e = str;
    }

    /* renamed from: a */
    public final void mo103564a(boolean z) {
        this.f73140j = z;
    }

    public TimeCostParams(Biz biz, Scene scene, String str, long j, String str2, boolean z, int i, long j2, long j3, boolean z2, ConcurrentHashMap<String, Object> concurrentHashMap, ConcurrentHashMap<String, Object> concurrentHashMap2, ConcurrentHashMap<String, Object> concurrentHashMap3, ConcurrentHashMap<String, Object> concurrentHashMap4) {
        Intrinsics.checkParameterIsNotNull(biz, "biz");
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(str, "event");
        Intrinsics.checkParameterIsNotNull(concurrentHashMap, "latencyDetail");
        Intrinsics.checkParameterIsNotNull(concurrentHashMap2, "extra");
        Intrinsics.checkParameterIsNotNull(concurrentHashMap3, "extraMetric");
        Intrinsics.checkParameterIsNotNull(concurrentHashMap4, "extraCategory");
        this.f73131a = biz;
        this.f73132b = scene;
        this.f73133c = str;
        this.f73134d = j;
        this.f73135e = str2;
        this.f73136f = z;
        this.f73137g = i;
        this.f73138h = j2;
        this.f73139i = j3;
        this.f73140j = z2;
        this.f73141k = concurrentHashMap;
        this.f73142l = concurrentHashMap2;
        this.f73143m = concurrentHashMap3;
        this.f73144n = concurrentHashMap4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TimeCostParams(com.ss.android.lark.appreciablelib.Biz r21, com.ss.android.lark.appreciablelib.Scene r22, java.lang.String r23, long r24, java.lang.String r26, boolean r27, int r28, long r29, long r31, boolean r33, java.util.concurrent.ConcurrentHashMap r34, java.util.concurrent.ConcurrentHashMap r35, java.util.concurrent.ConcurrentHashMap r36, java.util.concurrent.ConcurrentHashMap r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.appreciablelib.TimeCostParams.<init>(com.ss.android.lark.appreciablelib.Biz, com.ss.android.lark.appreciablelib.Scene, java.lang.String, long, java.lang.String, boolean, int, long, long, boolean, java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
