package com.ss.android.lark.todo.impl.features.remind.reminder;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderView;
import com.ss.android.lark.todo.impl.features.remind.reminder.entity.OverallReminderData;
import com.ss.android.lark.widget.floatwindow.AbstractC58451a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderHandler;", "Lcom/ss/android/lark/widget/floatwindow/BaseHandler;", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/entity/OverallReminderData;", "mClickListener", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderView$OnReminderClickedListener;", "(Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderView$OnReminderClickedListener;)V", "mReminderData", "mReminderView", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderView;", "getId", "", "getShowTime", "", "getType", "", "isValid", "", "needAutoClose", "onCreateView", "Landroid/view/View;", "context", "Landroid/content/Context;", "setData", "", "reminderData", "updateViewData", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.b */
public final class OverallReminderHandler implements AbstractC58451a<OverallReminderData> {

    /* renamed from: a */
    public static final Companion f140965a = new Companion(null);

    /* renamed from: b */
    private OverallReminderData f140966b;

    /* renamed from: c */
    private OverallReminderView f140967c;

    /* renamed from: d */
    private final OverallReminderView.OnReminderClickedListener f140968d;

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    public /* synthetic */ boolean aB_() {
        return AbstractC58451a.CC.$default$aB_(this);
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: b */
    public int mo117932b() {
        return R.id.todo_reminder_handler_type_overall;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: d */
    public boolean mo117934d() {
        return false;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: e */
    public long mo117935e() {
        return 1800000;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderHandler$Companion;", "", "()V", "HALF_HOUR_MILLIS_SECONDS", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: c */
    public boolean mo117933c() {
        OverallReminderData overallReminderData = this.f140966b;
        if (overallReminderData == null || SystemClock.elapsedRealtime() - overallReminderData.getArriveTime() > 1800000) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: a */
    public String mo117929a() {
        OverallReminderData overallReminderData = this.f140966b;
        if (overallReminderData == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(overallReminderData.getTodoReminder().guid);
        sb.append("_");
        sb.append(overallReminderData.getTodoReminder().summary);
        sb.append("_");
        Long l = overallReminderData.getTodoReminder().due_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "data.todoReminder.due_time");
        sb.append(l.longValue());
        sb.append("_");
        sb.append(overallReminderData.getTodoReminder().due_timezone);
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().append(d….due_timezone).toString()");
        return sb2;
    }

    /* renamed from: a */
    public void mo194006a(OverallReminderData overallReminderData) {
        this.f140966b = overallReminderData;
    }

    public OverallReminderHandler(OverallReminderView.OnReminderClickedListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mClickListener");
        this.f140968d = bVar;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: a */
    public View mo117928a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        OverallReminderView overallReminderView = new OverallReminderView(context, null, 0, 6, null);
        this.f140967c = overallReminderView;
        OverallReminderData overallReminderData = this.f140966b;
        if (overallReminderData != null) {
            if (overallReminderView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReminderView");
            }
            overallReminderView.setReminderData(overallReminderData);
        }
        OverallReminderView overallReminderView2 = this.f140967c;
        if (overallReminderView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReminderView");
        }
        overallReminderView2.setReminderClickListener(this.f140968d);
        OverallReminderView overallReminderView3 = this.f140967c;
        if (overallReminderView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReminderView");
        }
        return overallReminderView3;
    }
}
