package com.ss.android.lark.todo.impl.features.remind.reminder;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.todo.v1.TodoReminder;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.ding.helper.C36644b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.helper.EndTimeHelper;
import com.ss.android.lark.todo.impl.features.common.listener.DebounceClickListener;
import com.ss.android.lark.todo.impl.features.remind.reminder.entity.OverallReminderData;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001f\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mClickedListener", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderView$OnReminderClickedListener;", "mReminderData", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/entity/OverallReminderData;", "getRelativeAlertTitle", "", "time", "", "title", "(Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "initListener", "", "setReminderClickListener", "clickListener", "setReminderData", "reminderData", "Companion", "OnReminderClickedListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OverallReminderView extends LinearLayout {

    /* renamed from: c */
    public static final Companion f140951c = new Companion(null);

    /* renamed from: a */
    public OnReminderClickedListener f140952a;

    /* renamed from: b */
    public OverallReminderData f140953b;

    /* renamed from: d */
    private HashMap f140954d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderView$OnReminderClickedListener;", "", "onReminderCloseClicked", "", "reminderData", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/entity/OverallReminderData;", "onReminderDetailClicked", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderView$b */
    public interface OnReminderClickedListener {
        /* renamed from: a */
        void mo193999a(OverallReminderData overallReminderData);

        /* renamed from: b */
        void mo194000b(OverallReminderData overallReminderData);
    }

    public OverallReminderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public OverallReminderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo193996a(int i) {
        if (this.f140954d == null) {
            this.f140954d = new HashMap();
        }
        View view = (View) this.f140954d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f140954d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderView$Companion;", "", "()V", "ONE_DAY_MINUTES", "", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m221493a() {
        ((UDButton) mo193996a(R.id.tvCloseReminder)).setOnClickListener(new View$OnClickListenerC57165c(this));
        ((UDButton) mo193996a(R.id.tvReminderDetail)).setOnClickListener(new C57166d(this));
        ((LinearLayout) mo193996a(R.id.layoutDisplay)).setOnClickListener(new C57167e(this));
    }

    public final void setReminderClickListener(OnReminderClickedListener bVar) {
        this.f140952a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderView$initListener$2", "Lcom/ss/android/lark/todo/impl/features/common/listener/DebounceClickListener;", "doClick", "", "v", "Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderView$d */
    public static final class C57166d extends DebounceClickListener {

        /* renamed from: b */
        final /* synthetic */ OverallReminderView f140956b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57166d(OverallReminderView overallReminderView) {
            this.f140956b = overallReminderView;
        }

        @Override // com.ss.android.lark.todo.impl.features.common.listener.DebounceClickListener
        /* renamed from: a */
        public void mo191942a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Log.m165389i("OverallReminderView", LogMessageUtil.f139260a.mo191765a("reminderDetail"));
            OnReminderClickedListener bVar = this.f140956b.f140952a;
            if (bVar != null) {
                bVar.mo194000b(this.f140956b.f140953b);
            }
            C36644b.m144618a().mo135220c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/remind/reminder/OverallReminderView$initListener$3", "Lcom/ss/android/lark/todo/impl/features/common/listener/DebounceClickListener;", "doClick", "", "v", "Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderView$e */
    public static final class C57167e extends DebounceClickListener {

        /* renamed from: b */
        final /* synthetic */ OverallReminderView f140957b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57167e(OverallReminderView overallReminderView) {
            this.f140957b = overallReminderView;
        }

        @Override // com.ss.android.lark.todo.impl.features.common.listener.DebounceClickListener
        /* renamed from: a */
        public void mo191942a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Log.m165389i("OverallReminderView", LogMessageUtil.f139260a.mo191765a("reminderCard"));
            OnReminderClickedListener bVar = this.f140957b.f140952a;
            if (bVar != null) {
                bVar.mo194000b(this.f140957b.f140953b);
            }
            C36644b.m144618a().mo135220c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.remind.reminder.OverallReminderView$c */
    public static final class View$OnClickListenerC57165c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OverallReminderView f140955a;

        View$OnClickListenerC57165c(OverallReminderView overallReminderView) {
            this.f140955a = overallReminderView;
        }

        public final void onClick(View view) {
            Log.m165389i("OverallReminderView", LogMessageUtil.f139260a.mo191765a("reminderClose"));
            OnReminderClickedListener bVar = this.f140955a.f140952a;
            if (bVar != null) {
                bVar.mo193999a(this.f140955a.f140953b);
            }
            C36644b.m144618a().mo135220c();
        }
    }

    public final void setReminderData(OverallReminderData overallReminderData) {
        String str;
        long j;
        Long l;
        Long l2;
        Intrinsics.checkParameterIsNotNull(overallReminderData, "reminderData");
        this.f140953b = overallReminderData;
        if (TextUtils.isEmpty(overallReminderData.getTodoReminder().summary)) {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_Task_NoTitlePlaceholder);
        } else {
            str = overallReminderData.getTodoReminder().summary;
        }
        TodoReminder todoReminder = overallReminderData.getTodoReminder().reminder;
        if (todoReminder == null || (l2 = todoReminder.time) == null) {
            j = 0;
        } else {
            j = l2.longValue();
        }
        if (j > 0) {
            LinearLayout linearLayout = (LinearLayout) mo193996a(R.id.multilineReminder);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "multilineReminder");
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) mo193996a(R.id.singleLineReminder);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "singleLineReminder");
            linearLayout2.setVisibility(0);
            TextView textView = (TextView) mo193996a(R.id.tvTodoReminder);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvTodoReminder");
            TodoReminder todoReminder2 = overallReminderData.getTodoReminder().reminder;
            if (todoReminder2 != null) {
                l = todoReminder2.time;
            } else {
                l = null;
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "title");
            textView.setText(m221492a(l, str));
            return;
        }
        LinearLayout linearLayout3 = (LinearLayout) mo193996a(R.id.multilineReminder);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "multilineReminder");
        linearLayout3.setVisibility(0);
        LinearLayout linearLayout4 = (LinearLayout) mo193996a(R.id.singleLineReminder);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "singleLineReminder");
        linearLayout4.setVisibility(8);
        TextView textView2 = (TextView) mo193996a(R.id.tvReminderTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvReminderTitle");
        ResUtil eVar = ResUtil.f139261a;
        Intrinsics.checkExpressionValueIsNotNull(str, "title");
        textView2.setText(eVar.mo191778a(R.string.Todo_Task_TaskIs, "task", str));
        Boolean bool = overallReminderData.getTodoReminder().is_all_day;
        Intrinsics.checkExpressionValueIsNotNull(bool, "reminderData.todoReminder.is_all_day");
        String endTimeStr = EndTimeHelper.m219791a(EndTimeHelper.f139399a, getContext(), ((long) 1000) * overallReminderData.getTodoReminder().due_time.longValue(), bool.booleanValue(), TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b(), false, 16, null).getEndTimeStr();
        TextView textView3 = (TextView) mo193996a(R.id.tvReminderTime);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "tvReminderTime");
        textView3.setText(ResUtil.f139261a.mo191778a(R.string.Todo_Task_DueAt2, "time", endTimeStr));
    }

    /* renamed from: a */
    private final String m221492a(Long l, String str) {
        if (l == null) {
            return "";
        }
        long longValue = l.longValue();
        long j = (long) CalendarWorkHourUtil.f83805a;
        long j2 = longValue / j;
        long j3 = longValue % j;
        long j4 = (long) 60;
        long j5 = longValue / j4;
        long j6 = longValue % j4;
        HashMap hashMap = new HashMap();
        hashMap.put("Task", str);
        if (j2 > 0 && j3 == 0) {
            hashMap.put("day", String.valueOf(j2));
            return ResUtil.f139261a.mo191779a(R.string.Todo_Notify_AlertTaskDueInDays, hashMap);
        } else if (j5 <= 0 || j6 != 0) {
            hashMap.put("min", String.valueOf(longValue));
            return ResUtil.f139261a.mo191779a(R.string.Todo_Notify_AlertTaskDueInMinutes, hashMap);
        } else {
            hashMap.put("hour", String.valueOf(j5));
            return ResUtil.f139261a.mo191779a(R.string.Todo_Notify_AlertTaskDueInHours, hashMap);
        }
    }

    public OverallReminderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.todo_overall_reminder, this);
        m221493a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OverallReminderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
