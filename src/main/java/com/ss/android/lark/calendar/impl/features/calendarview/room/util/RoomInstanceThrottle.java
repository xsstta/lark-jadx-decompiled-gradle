package com.ss.android.lark.calendar.impl.features.calendarview.room.util;

import com.larksuite.framework.callback.UICallbackExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomInstanceThrottle;", "", "refreshTask", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "consumeTask", "Ljava/lang/Runnable;", "hasRefreshTask", "", "lastRefreshTime", "", "destroy", "refresh", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d.a */
public final class RoomInstanceThrottle {

    /* renamed from: e */
    public static final Companion f78248e = new Companion(null);

    /* renamed from: a */
    public boolean f78249a;

    /* renamed from: b */
    public long f78250b;

    /* renamed from: c */
    public final Runnable f78251c = new RunnableC31050b(this);

    /* renamed from: d */
    public final Function0<Unit> f78252d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomInstanceThrottle$Companion;", "", "()V", "DELAY_RUN_INTERVAL_MAX", "", "DELAY_RUN_INTERVAL_WHEN_ADD", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo112345b() {
        UICallbackExecutor.removeCallbacks(this.f78251c);
    }

    /* renamed from: a */
    public final void mo112344a() {
        UICallbackExecutor.post(new RunnableC31051c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d.a$b */
    static final class RunnableC31050b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceThrottle f78253a;

        RunnableC31050b(RoomInstanceThrottle aVar) {
            this.f78253a = aVar;
        }

        public final void run() {
            if (this.f78253a.f78249a) {
                this.f78253a.f78249a = false;
                this.f78253a.f78252d.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d.a$c */
    public static final class RunnableC31051c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceThrottle f78254a;

        RunnableC31051c(RoomInstanceThrottle aVar) {
            this.f78254a = aVar;
        }

        public final void run() {
            long j = 3000;
            if (System.currentTimeMillis() - this.f78254a.f78250b >= 3000) {
                j = 500;
            }
            this.f78254a.f78250b = System.currentTimeMillis();
            this.f78254a.f78249a = true;
            UICallbackExecutor.executeDelayed(this.f78254a.f78251c, j);
        }
    }

    public RoomInstanceThrottle(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "refreshTask");
        this.f78252d = function0;
    }
}
