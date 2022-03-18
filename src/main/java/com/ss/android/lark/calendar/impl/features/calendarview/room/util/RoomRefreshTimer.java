package com.ss.android.lark.calendar.impl.features.calendarview.room.util;

import com.larksuite.framework.callback.UICallbackExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004R\u0010\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomRefreshTimer;", "", "refreshTask", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "checkerTimeTask", "com/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomRefreshTimer$checkerTimeTask$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomRefreshTimer$checkerTimeTask$1;", "shutdown", "start", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d.b */
public final class RoomRefreshTimer {

    /* renamed from: b */
    public static final Companion f78255b = new Companion(null);

    /* renamed from: a */
    public final Function0<Unit> f78256a;

    /* renamed from: c */
    private final RunnableC31052b f78257c = new RunnableC31052b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomRefreshTimer$Companion;", "", "()V", "ONE_HOUR", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo112349b() {
        UICallbackExecutor.removeCallbacks(this.f78257c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/util/RoomRefreshTimer$checkerTimeTask$1", "Ljava/lang/Runnable;", "run", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.d.b$b */
    public static final class RunnableC31052b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RoomRefreshTimer f78258a;

        public void run() {
            this.f78258a.f78256a.invoke();
            UICallbackExecutor.executeDelayed(this, 3600000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC31052b(RoomRefreshTimer bVar) {
            this.f78258a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo112348a() {
        UICallbackExecutor.removeCallbacks(this.f78257c);
        UICallbackExecutor.executeDelayed(this.f78257c, 3600000);
    }

    public RoomRefreshTimer(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "refreshTask");
        this.f78256a = function0;
    }
}
