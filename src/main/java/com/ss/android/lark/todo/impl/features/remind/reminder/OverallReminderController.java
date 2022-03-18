package com.ss.android.lark.todo.impl.features.remind.reminder;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.ding.helper.C36644b;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.helper.EndTimeHelper;
import com.ss.android.lark.todo.impl.features.detail.DetailEntrance;
import com.ss.android.lark.todo.impl.features.remind.notification.NotificationHelper;
import com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderView;
import com.ss.android.lark.todo.impl.features.remind.reminder.entity.OverallReminderData;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderController;", "", "mContext", "Landroid/content/Context;", "mOverallReminderListener", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderController$OverallReminderListener;", "(Landroid/content/Context;Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderController$OverallReminderListener;)V", "mOverallReminderData", "", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/entity/OverallReminderData;", "mOverallReminderHandlers", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderHandler;", "getSameEventPastReminderIndex", "", "overallReminderData", "removeUnitAndHandlerInList", "", "setOverallReminderData", "reminderData", "OverallReminderListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.a */
public final class OverallReminderController {

    /* renamed from: a */
    public final Context f140958a;

    /* renamed from: b */
    public final OverallReminderListener f140959b;

    /* renamed from: c */
    private final List<OverallReminderData> f140960c = new ArrayList();

    /* renamed from: d */
    private final List<OverallReminderHandler> f140961d = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderController$OverallReminderListener;", "", "notifyCloseTodoReminder", "", "overallReminderData", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/entity/OverallReminderData;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.a$a */
    public interface OverallReminderListener {
        /* renamed from: a */
        void mo194004a(OverallReminderData overallReminderData);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderController$setOverallReminderData$handler$1", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderView$OnReminderClickedListener;", "onReminderCloseClicked", "", "reminderData", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/entity/OverallReminderData;", "onReminderDetailClicked", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.a$b */
    public static final class C57168b implements OverallReminderView.OnReminderClickedListener {

        /* renamed from: a */
        final /* synthetic */ OverallReminderController f140962a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.a$b$a */
        static final class RunnableC57169a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C57168b f140963a;

            /* renamed from: b */
            final /* synthetic */ OverallReminderData f140964b;

            RunnableC57169a(C57168b bVar, OverallReminderData overallReminderData) {
                this.f140963a = bVar;
                this.f140964b = overallReminderData;
            }

            public final void run() {
                DetailEntrance bVar = DetailEntrance.f139694a;
                Context context = this.f140963a.f140962a.f140958a;
                String str = this.f140964b.getTodoReminder().guid;
                Intrinsics.checkExpressionValueIsNotNull(str, "reminderData.todoReminder.guid");
                DetailEntrance.m220107a(bVar, context, str, false, (String) null, (String) null, (String) null, (String) null, (int) SmActions.ACTION_CALLING_EXIT, (Object) null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57168b(OverallReminderController aVar) {
            this.f140962a = aVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderView.OnReminderClickedListener
        /* renamed from: a */
        public void mo193999a(OverallReminderData overallReminderData) {
            if (overallReminderData != null) {
                TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
                String str = overallReminderData.getTodoReminder().guid;
                Intrinsics.checkExpressionValueIsNotNull(str, "reminderData.todoReminder.guid");
                aVar.mo194219o(str);
                this.f140962a.mo194003b(overallReminderData);
                this.f140962a.f140959b.mo194004a(overallReminderData);
            }
        }

        @Override // com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderView.OnReminderClickedListener
        /* renamed from: b */
        public void mo194000b(OverallReminderData overallReminderData) {
            if (overallReminderData != null) {
                TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
                String str = overallReminderData.getTodoReminder().guid;
                Intrinsics.checkExpressionValueIsNotNull(str, "reminderData.todoReminder.guid");
                aVar.mo194217n(str);
                this.f140962a.mo194003b(overallReminderData);
                this.f140962a.f140959b.mo194004a(overallReminderData);
                UICallbackExecutor.executeDelayed(new RunnableC57169a(this, overallReminderData), 300);
            }
        }
    }

    /* renamed from: b */
    public final void mo194003b(OverallReminderData overallReminderData) {
        int indexOf = this.f140960c.indexOf(overallReminderData);
        if (indexOf != -1) {
            this.f140960c.remove(indexOf);
            this.f140961d.remove(indexOf);
        }
    }

    /* renamed from: a */
    public final void mo194002a(OverallReminderData overallReminderData) {
        String str;
        Intrinsics.checkParameterIsNotNull(overallReminderData, "reminderData");
        OverallReminderHandler bVar = new OverallReminderHandler(new C57168b(this));
        bVar.mo194006a(overallReminderData);
        C36644b a = C36644b.m144618a();
        Intrinsics.checkExpressionValueIsNotNull(a, "FloatDialogHelper.getInstance()");
        if (a.mo135221d() == 0) {
            this.f140960c.clear();
            this.f140961d.clear();
        }
        if (!(!this.f140960c.isEmpty()) || !this.f140960c.contains(overallReminderData)) {
            C36644b.m144618a().mo135214a(bVar);
            this.f140960c.add(overallReminderData);
            this.f140961d.add(bVar);
            TodoGeneralHitPoint aVar = TodoGeneralHitPoint.f141070a;
            String str2 = overallReminderData.getTodoReminder().guid;
            Intrinsics.checkExpressionValueIsNotNull(str2, "reminderData.todoReminder.guid");
            aVar.mo194215m(str2);
            String valueOf = String.valueOf(Math.abs(overallReminderData.getTodoReminder().guid.hashCode()));
            EndTimeHelper bVar2 = EndTimeHelper.f139399a;
            Context context = this.f140958a;
            long longValue = overallReminderData.getTodoReminder().due_time.longValue() * ((long) 1000);
            Boolean bool = overallReminderData.getTodoReminder().is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool, "reminderData.todoReminder.is_all_day");
            String a2 = ResUtil.f139261a.mo191778a(R.string.Todo_Task_DueAt2, "time", EndTimeHelper.m219791a(bVar2, context, longValue, bool.booleanValue(), TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b(), false, 16, null).getEndTimeStr());
            if (TextUtils.isEmpty(overallReminderData.getTodoReminder().summary)) {
                str = ResUtil.f139261a.mo191781c(R.string.Todo_Task_NoTitlePlaceholder);
            } else {
                str = overallReminderData.getTodoReminder().summary;
            }
            ResUtil eVar = ResUtil.f139261a;
            Intrinsics.checkExpressionValueIsNotNull(str, "titleStr");
            TodoDependencyHolder.f139242a.mo191730a().pushDependency().mo145423a(NotificationHelper.f140950a.mo193994a(overallReminderData), valueOf, a2, eVar.mo191778a(R.string.Todo_Task_TaskIs, "task", str));
        }
    }

    public OverallReminderController(Context context, OverallReminderListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mOverallReminderListener");
        this.f140958a = context;
        this.f140959b = aVar;
    }
}
