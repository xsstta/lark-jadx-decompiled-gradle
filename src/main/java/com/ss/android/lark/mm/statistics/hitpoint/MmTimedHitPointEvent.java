package com.ss.android.lark.mm.statistics.hitpoint;

import android.os.SystemClock;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.mm.utils.p2335a.AbstractC47095a;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0015R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent;", "", "timerExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "eventName", "", "durationName", "mmHitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "(Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;)V", "lastMillis", "", "lastStatus", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent$Status;", "getMmHitPointContext", "()Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "setMmHitPointContext", "(Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;)V", "para", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointJSON;", "pause", "", "putPageName", "value", "putParas", "key", "resume", "Status", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmTimedHitPointEvent {

    /* renamed from: a */
    public final C47086i f118548a;

    /* renamed from: b */
    public long f118549b;

    /* renamed from: c */
    public final String f118550c;

    /* renamed from: d */
    public final String f118551d;

    /* renamed from: e */
    private Status f118552e;

    /* renamed from: f */
    private final C47096b f118553f;

    /* renamed from: g */
    private C47084f f118554g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent$Status;", "", "(Ljava/lang/String;I)V", "Started", "Stopped", GrsBaseInfo.CountryCodeSource.UNKNOWN, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Status {
        Started,
        Stopped,
        UNKNOWN
    }

    /* renamed from: c */
    public final C47084f mo165406c() {
        return this.f118554g;
    }

    /* renamed from: b */
    public final synchronized void mo165405b() {
        if (this.f118552e != Status.Stopped) {
            this.f118552e = Status.Stopped;
            this.f118553f.mo165475b(this.f118550c);
            this.f118548a.mo165411a(this.f118551d, SystemClock.elapsedRealtime() - this.f118549b);
            C47083e.m186425a(this.f118554g, this.f118550c, this.f118548a.mo165421c());
        }
    }

    /* renamed from: a */
    public final void mo165403a() {
        if (this.f118552e != Status.Started) {
            this.f118552e = Status.Started;
            this.f118549b = SystemClock.elapsedRealtime();
            this.f118553f.mo165477c(this.f118550c);
        }
    }

    /* renamed from: a */
    public final void mo165404a(C47084f fVar) {
        this.f118554g = fVar;
    }

    /* renamed from: a */
    public final synchronized C47086i mo165401a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.f118548a.mo165413a("page_name", str);
        return this.f118548a;
    }

    /* renamed from: a */
    public final synchronized C47086i mo165402a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        this.f118548a.mo165413a(str, str2);
        return this.f118548a;
    }

    public MmTimedHitPointEvent(C47096b bVar, String str, String str2, C47084f fVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "timerExecutor");
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        Intrinsics.checkParameterIsNotNull(str2, "durationName");
        this.f118553f = bVar;
        this.f118550c = str;
        this.f118551d = str2;
        this.f118554g = fVar;
        C47086i a = C47086i.m186432a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmHitPointJSON.of()");
        this.f118548a = a;
        this.f118552e = Status.UNKNOWN;
        bVar.mo165467a(str, CalendarSearchResultRv.f82652c, CalendarSearchResultRv.f82652c, new AbstractC47095a(this) {
            /* class com.ss.android.lark.mm.statistics.hitpoint.MmTimedHitPointEvent.C470821 */

            /* renamed from: a */
            final /* synthetic */ MmTimedHitPointEvent f118555a;

            {
                this.f118555a = r1;
            }

            @Override // com.ss.android.lark.mm.utils.p2335a.AbstractC47095a
            /* renamed from: a */
            public final void mo161113a(String str, int i) {
                synchronized (this.f118555a) {
                    this.f118555a.f118548a.mo165411a(this.f118555a.f118551d, SystemClock.elapsedRealtime() - this.f118555a.f118549b);
                    C47083e.m186425a(this.f118555a.mo165406c(), this.f118555a.f118550c, this.f118555a.f118548a.mo165421c());
                    this.f118555a.f118549b = SystemClock.elapsedRealtime();
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmTimedHitPointEvent(C47096b bVar, String str, String str2, C47084f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str, str2, (i & 8) != 0 ? null : fVar);
    }
}
