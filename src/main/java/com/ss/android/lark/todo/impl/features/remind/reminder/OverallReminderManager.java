package com.ss.android.lark.todo.impl.features.remind.reminder;

import android.content.Context;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.todo.v1.PushTodoReminder;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IZenModeDependency;
import com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderController;
import com.ss.android.lark.todo.impl.features.remind.reminder.entity.OverallReminderData;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack;
import com.ss.android.lark.todo.impl.rustadapter.push.TodoPushProcess;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u000e\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderManager;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mOverallReminderController", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderController;", "mTodoReminderPushListener", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "mZenModeDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IZenModeDependency;", "registerPush", "", "registerTodoReminderPush", "unRegisterPush", "unRegisterTodoReminderPush", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.c */
public final class OverallReminderManager {

    /* renamed from: c */
    public static final Companion f140969c = new Companion(null);

    /* renamed from: a */
    public final IZenModeDependency f140970a = TodoDependencyHolder.f139242a.mo191730a().zenModeDependency();

    /* renamed from: b */
    public final OverallReminderController f140971b;

    /* renamed from: d */
    private TodoPushHandleCallBack f140972d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderManager$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderManager$mOverallReminderController$1", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderController$OverallReminderListener;", "notifyCloseTodoReminder", "", "overallReminderData", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/entity/OverallReminderData;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.c$b */
    public static final class C57170b implements OverallReminderController.OverallReminderListener {
        @Override // com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderController.OverallReminderListener
        /* renamed from: a */
        public void mo194004a(OverallReminderData overallReminderData) {
        }

        C57170b() {
        }
    }

    /* renamed from: a */
    public final void mo194007a() {
        m221511c();
    }

    /* renamed from: b */
    public final void mo194008b() {
        m221512d();
    }

    /* renamed from: d */
    private final void m221512d() {
        if (this.f140972d != null) {
            TodoPushProcess.f141135a.mo194372b(Command.PUSH_TODO_REMINDER_NOTIFICATION, this.f140972d);
        }
    }

    /* renamed from: c */
    private final void m221511c() {
        this.f140972d = new C57171c(this);
        TodoPushProcess.f141135a.mo194371a(Command.PUSH_TODO_REMINDER_NOTIFICATION, this.f140972d);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderManager$registerTodoReminderPush$1", "Lcom/ss/android/lark/todo/impl/rustadapter/push/TodoPushHandleCallBack;", "onPush", "", "pushData", "Lcom/alibaba/fastjson/JSONObject;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.c$c */
    public static final class C57171c implements TodoPushHandleCallBack {

        /* renamed from: a */
        final /* synthetic */ OverallReminderManager f140973a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57171c(OverallReminderManager cVar) {
            this.f140973a = cVar;
        }

        @Override // com.ss.android.lark.todo.impl.rustadapter.push.TodoPushHandleCallBack
        /* renamed from: a */
        public void mo191795a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "pushData");
            Log.m165389i("OverallReminderManager", LogMessageUtil.f139260a.mo191769b("pushReminder"));
            Object obj = jSONObject.get("todo_overall_reminder");
            if (!(obj instanceof PushTodoReminder)) {
                obj = null;
            }
            PushTodoReminder pushTodoReminder = (PushTodoReminder) obj;
            if (pushTodoReminder != null) {
                OverallReminderData overallReminderData = new OverallReminderData(pushTodoReminder, SystemClock.elapsedRealtime());
                if (!this.f140973a.f140970a.mo145436a()) {
                    this.f140973a.f140971b.mo194002a(overallReminderData);
                    return;
                }
                return;
            }
            Log.m165383e("OverallReminderManager", LogMessageUtil.f139260a.mo191769b("overallReminder_is_null"));
        }
    }

    public OverallReminderManager(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f140971b = new OverallReminderController(context, new C57170b());
    }
}
