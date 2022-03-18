package com.ss.android.lark.calendar.impl.features.calendarview;

import android.app.Activity;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.p1430a.C30022a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\f\u001a\u00020\tR\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager;", "", "()V", "checkerTimeTask", "com/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager$checkerTimeTask$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager$checkerTimeTask$1;", "enterTabTime", "", "enterCalendarTab", "", "activity", "Landroid/app/Activity;", "quitCalendarTab", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.b */
public final class CalendarFeelGoodManager {

    /* renamed from: b */
    public static final Companion f76821b = new Companion(null);

    /* renamed from: a */
    public long f76822a = -1;

    /* renamed from: c */
    private final RunnableC30664b f76823c = new RunnableC30664b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager$Companion;", "", "()V", "INVALID_TIME", "", "ONE_SECONDS", "SCENARIO_ID", "", "TEN_SECONDS", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo110713a() {
        this.f76822a = -1;
        C30022a.f74882a.magicDependency().mo108274a("calendar");
        UICallbackExecutor.removeCallbacks(this.f76823c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager$checkerTimeTask$1", "Ljava/lang/Runnable;", "run", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.b$b */
    public static final class RunnableC30664b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarFeelGoodManager f76824a;

        public void run() {
            if (this.f76824a.f76822a != -1) {
                if (System.currentTimeMillis() - this.f76824a.f76822a > 10000) {
                    GeneralHitPoint.m124284z();
                } else {
                    UICallbackExecutor.executeDelayed(this, 1000);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC30664b(CalendarFeelGoodManager bVar) {
            this.f76824a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo110714a(Activity activity) {
        if (activity != null) {
            C30022a.f74882a.magicDependency().mo108275a("calendar", activity);
            this.f76822a = System.currentTimeMillis();
            UICallbackExecutor.removeCallbacks(this.f76823c);
            UICallbackExecutor.executeDelayed(this.f76823c, 1000);
        }
    }
}
