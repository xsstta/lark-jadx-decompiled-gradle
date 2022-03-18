package com.ss.android.lark.todo.impl.features.mainview.schedule;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainViewModel;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\fR\u0014\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/schedule/TodoListSchedule;", "", "()V", "mListScheduledFuture", "Ljava/util/concurrent/ScheduledFuture;", "viewModel", "Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel;", "getViewModel$todo_release", "()Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel;", "setViewModel$todo_release", "(Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoMainViewModel;)V", "cancelScheduleRefreshMaskView", "", "getStartMillis", "", "startScheduleRefreshMaskView", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.d.a */
public final class TodoListSchedule {

    /* renamed from: a */
    public static final Companion f140273a = new Companion(null);

    /* renamed from: b */
    private ScheduledFuture<?> f140274b;

    /* renamed from: c */
    private TodoMainViewModel f140275c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/schedule/TodoListSchedule$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final TodoMainViewModel mo193141a() {
        return this.f140275c;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.d.a$b */
    public static final class RunnableC56810b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoListSchedule f140276a;

        RunnableC56810b(TodoListSchedule aVar) {
            this.f140276a = aVar;
        }

        public final void run() {
            TodoMainViewModel a = this.f140276a.mo193141a();
            if (a != null) {
                a.refreshListEndTime();
            }
        }
    }

    /* renamed from: d */
    private final long m220782d() {
        Calendar instance = Calendar.getInstance(TimeZone.getDefault());
        Intrinsics.checkExpressionValueIsNotNull(instance, "nowTime");
        Date time = instance.getTime();
        Intrinsics.checkExpressionValueIsNotNull(time, "nowTime.time");
        long time2 = time.getTime();
        instance.add(12, 1);
        instance.set(13, 0);
        instance.set(14, 0);
        Date time3 = instance.getTime();
        Intrinsics.checkExpressionValueIsNotNull(time3, "nowTime.time");
        return time3.getTime() - time2;
    }

    /* renamed from: b */
    public final void mo193143b() {
        Log.m165383e("TodoListSchedule", LogMessageUtil.f139260a.mo191772d("startScheduleRefreshMaskView"));
        ScheduledFuture<?> scheduledFuture = this.f140274b;
        if (scheduledFuture == null || scheduledFuture == null || scheduledFuture.isCancelled()) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            this.f140274b = coreThreadPool.getScheduleThreadPool().scheduleAtFixedRate(new RunnableC56810b(this), m220782d(), 60000, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public final void mo193144c() {
        Log.m165383e("TodoListSchedule", LogMessageUtil.f139260a.mo191772d("cancelScheduleRefreshMaskView"));
        ScheduledFuture<?> scheduledFuture = this.f140274b;
        if (scheduledFuture == null) {
            return;
        }
        if (scheduledFuture == null || !scheduledFuture.isCancelled()) {
            ScheduledFuture<?> scheduledFuture2 = this.f140274b;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(true);
            }
            this.f140274b = null;
        }
    }

    /* renamed from: a */
    public final void mo193142a(TodoMainViewModel fVar) {
        this.f140275c = fVar;
    }
}
