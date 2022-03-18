package com.ss.android.lark.todo.impl.features.mainview2.widget.list.schedule;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.listener.IListScheduledListener;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/schedule/TodoListSchedule;", "", "listener", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListScheduledListener;", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/listener/IListScheduledListener;)V", "mListScheduledFuture", "Ljava/util/concurrent/ScheduledFuture;", "cancelScheduleRefreshMaskView", "", "getStartMillis", "", "startScheduleRefreshMaskView", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d.a */
public final class TodoListSchedule {

    /* renamed from: b */
    public static final Companion f140777b = new Companion(null);

    /* renamed from: a */
    public final IListScheduledListener f140778a;

    /* renamed from: c */
    private ScheduledFuture<?> f140779c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/schedule/TodoListSchedule$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.d.a$b */
    static final class RunnableC57098b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TodoListSchedule f140780a;

        RunnableC57098b(TodoListSchedule aVar) {
            this.f140780a = aVar;
        }

        public final void run() {
            this.f140780a.f140778a.mo193641a();
        }
    }

    /* renamed from: c */
    private final long m221324c() {
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

    /* renamed from: a */
    public final void mo193808a() {
        Log.m165383e("TodoListSchedule", LogMessageUtil.f139260a.mo191772d("startScheduleRefreshMaskView"));
        ScheduledFuture<?> scheduledFuture = this.f140779c;
        if (scheduledFuture == null || scheduledFuture == null || scheduledFuture.isCancelled()) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            this.f140779c = coreThreadPool.getScheduleThreadPool().scheduleWithFixedDelay(new RunnableC57098b(this), m221324c(), 60000, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: b */
    public final void mo193809b() {
        Log.m165383e("TodoListSchedule", LogMessageUtil.f139260a.mo191772d("cancelScheduleRefreshMaskView"));
        ScheduledFuture<?> scheduledFuture = this.f140779c;
        if (scheduledFuture == null) {
            return;
        }
        if (scheduledFuture == null || !scheduledFuture.isCancelled()) {
            ScheduledFuture<?> scheduledFuture2 = this.f140779c;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(true);
            }
            this.f140779c = null;
        }
    }

    public TodoListSchedule(IListScheduledListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f140778a = bVar;
    }
}
