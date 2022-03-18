package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import android.content.Context;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.todo.v1.Commit;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoItemPermission;
import com.bytedance.lark.pb.todo.v1.TodoReminder;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.helper.EndTimeHelper;
import com.ss.android.lark.todo.impl.features.detail.helper.time.DueTimeHelper;
import com.ss.android.lark.todo.impl.features.detail.helper.time.ReminderHelper;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.data.TodoToastUnit;
import com.ss.android.lark.todo.impl.features.setting.data.TodoSettingData;
import com.ss.android.lark.todo.impl.framework.architecture.Event;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0002J\b\u0010\u001e\u001a\u00020\u0007H\u0002J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\tH\u0002J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u0006\u0010%\u001a\u00020\u0007J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0014H\u0002J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010(\u001a\u00020#H\u0002J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020#H\u0002J\b\u0010+\u001a\u00020\u0007H\u0002J\b\u0010,\u001a\u00020\u0007H\u0002J\b\u0010-\u001a\u00020\u0007H\u0002J\u0012\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\tH\u0002¨\u00061"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "createTodoWithTimeCheck", "", "inlineCreate", "", "closeActivity", "deleteTime", "detailTimeClick", "editableState", "", "generateTimeBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeBean;", "generateTimeInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeInfo;", "getReminder", "Lcom/bytedance/lark/pb/todo/v1/TodoReminder;", "goTimeFragmentHitPoint", "handleAction", "action", "actionData", "Lcom/larksuite/framework/section/IActionData;", "hasReminder", "initReminder", "initViewData", "isEditable", "pickTimeClick", "setBuilderIsAllDay", "isAllDay", "setDueTime", "milliTimeWithoutDueTime", "", "milliTimeWithDueTime", "setOtherDayReminder", "setReminder", "reminder", "reminderMinutes", "setReminderCompareCurrentAndDue", "dueTimeMillis", "setTodayDueTimeReminder", "setTodoInitialReminder", "setTomorrowDueTimeReminder", "updateTime", "needUpdateTodo", "TimeEditable", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeViewModel extends ViewModelSection<TodoDetailModel> {
    public static final TimeEditable TimeEditable = new TimeEditable(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeViewModel$TimeEditable;", "", "()V", "CanEdit", "", "NoEditCommon", "NoEditDoc", "EditState", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class TimeEditable {

        @Target({ElementType.TYPE_USE})
        @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeViewModel$TimeEditable$EditState;", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
        public @interface EditState {
        }

        private TimeEditable() {
        }

        public /* synthetic */ TimeEditable(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void setTodoInitialReminder() {
        setReminder(initReminder());
    }

    public final void setOtherDayReminder() {
        setReminderCompareCurrentAndDue(DueTimeHelper.f139699a.mo192308c());
        goTimeFragmentHitPoint();
    }

    private final int editableState() {
        if (isEditable()) {
            return 0;
        }
        if (((TodoDetailModel) getModelStore()).isFromDoc()) {
            return 1;
        }
        return 2;
    }

    private final TodoReminder getReminder() {
        List<TodoReminder> list = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48023e;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    private final boolean hasReminder() {
        TodoReminder reminder = getReminder();
        if (reminder == null) {
            return false;
        }
        Long l = reminder.time;
        if (l != null && l.longValue() == -1) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        ((TodoDetailModel) getModelStore()).getNeedUpdate().mo5925a(new C56733a(this));
    }

    private final void deleteTime() {
        ((TodoDetailModel) getModelStore()).getTodoBuilder().f48028j = 0L;
        setBuilderIsAllDay(false);
        setTodoInitialReminder();
        updateTime$default(this, false, 1, null);
        TodoHitPoint.m221756i(((TodoDetailModel) getModelStore()).getGuid());
    }

    private final TimeBean generateTimeBean() {
        int i;
        Long l;
        Todo.C19637a todoBuilder = ((TodoDetailModel) getModelStore()).getTodoBuilder();
        long longValue = todoBuilder.f48028j.longValue() * ((long) 1000);
        Boolean bool = todoBuilder.f48030l;
        Intrinsics.checkExpressionValueIsNotNull(bool, "is_all_day");
        boolean booleanValue = bool.booleanValue();
        TodoReminder reminder = getReminder();
        if (reminder == null || (l = reminder.time) == null) {
            i = 0;
        } else {
            i = (int) l.longValue();
        }
        return new TimeBean(longValue, booleanValue, i);
    }

    private final void goTimeFragmentHitPoint() {
        boolean z;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        boolean isCreateTodo = adVar.isCreateTodo();
        String str = adVar.getTodoBuilder().f48019a;
        if (adVar.getTodoBuilder().f48028j.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        TodoHitPoint.m221740a(isCreateTodo, str, z, "others");
    }

    private final TodoReminder initReminder() {
        TodoReminder a = new TodoReminder.C19665a().mo66705a(Long.valueOf((long) TodoSettingData.f141010a.mo194067a())).mo66704a(TodoReminder.Type.RELATIVE).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "TodoReminder.Builder()\n …IVE)\n            .build()");
        return a;
    }

    private final void setTodayDueTimeReminder() {
        setDueTime(DueTimeHelper.f139699a.mo192307b(), DueTimeHelper.f139699a.mo192305a());
        updateTime$default(this, false, 1, null);
        TodoHitPoint.m221740a(((TodoDetailModel) getModelStore()).isCreateTodo(), ((TodoDetailModel) getModelStore()).getTodoBuilder().f48019a, false, "today");
    }

    private final void setTomorrowDueTimeReminder() {
        setDueTime(DueTimeHelper.f139699a.mo192309d(), DueTimeHelper.f139699a.mo192308c());
        updateTime$default(this, false, 1, null);
        TodoHitPoint.m221740a(((TodoDetailModel) getModelStore()).isCreateTodo(), ((TodoDetailModel) getModelStore()).getTodoBuilder().f48019a, false, "tomorrow");
    }

    private final void detailTimeClick() {
        Integer num;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        TimeInfo b = adVar.getTimeInfo().mo5927b();
        if (b != null) {
            num = Integer.valueOf(b.mo192777e());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            adVar.getTimeButtonShow().mo5929b((Boolean) true);
        } else if (num != null && num.intValue() == 2) {
            adVar.getToast().mo5929b(new Event<>(new TodoToastUnit(R.string.Todo_Task_NoEditAccess, 4, null, 4, null)));
        } else if (num != null && num.intValue() == 1) {
            adVar.getToast().mo5929b(new Event<>(new TodoToastUnit(R.string.Todo_Task_UnableEditTaskFromDocs, 4, null, 4, null)));
        }
    }

    private final boolean isEditable() {
        Map<Integer, Boolean> map;
        int i;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        TodoItemPermission todoItemPermission = adVar.getTodoBuilder().f48031m;
        if (todoItemPermission == null || (map = todoItemPermission.can_edit_commit_keys) == null) {
            map = MapsKt.emptyMap();
        }
        TodoSource todoSource = adVar.getTodoSource();
        if (todoSource == null || ((i = C56734ab.f140144a[todoSource.ordinal()]) != 1 && i != 2)) {
            return adVar.isEditable();
        }
        Boolean bool = map.get(Integer.valueOf(Commit.Key.TODO_DUE_TIME.getValue()));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void pickTimeClick() {
        Integer num;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        TimeInfo b = adVar.getTimeInfo().mo5927b();
        if (b != null) {
            num = Integer.valueOf(b.mo192777e());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            adVar.getTimeFragment().mo5929b((Boolean) true);
        } else if (num != null && num.intValue() == 1) {
            adVar.getToast().mo5929b(new Event<>(new TodoToastUnit(R.string.Todo_Task_UnableEditTaskFromDocs, 4, null, 4, null)));
        }
    }

    private final TimeInfo generateTimeInfo() {
        long longValue = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48028j.longValue() * ((long) 1000);
        if (longValue <= 0) {
            return new TimeInfo(false, "", false, isEditable(), editableState());
        }
        EndTimeHelper bVar = EndTimeHelper.f139399a;
        Context context = getContext();
        Boolean bool = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48030l;
        Intrinsics.checkExpressionValueIsNotNull(bool, "getModelStore().todoBuilder.is_all_day");
        return new TimeInfo(true, ResUtil.f139261a.mo191778a(R.string.Todo_Task_DueAt2, "time", EndTimeHelper.m219791a(bVar, context, longValue, bool.booleanValue(), TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b(), false, 16, null).getEndTimeStr()), hasReminder(), isEditable(), editableState());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.TimeViewModel$a */
    static final class C56733a<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TimeViewModel f140125a;

        C56733a(TimeViewModel timeViewModel) {
            this.f140125a = timeViewModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140125a.updateTime(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    private final void setReminder(long j) {
        TodoReminder a = new TodoReminder.C19665a().mo66705a(Long.valueOf(j)).mo66704a(TodoReminder.Type.RELATIVE).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "TodoReminder.Builder().t…er.Type.RELATIVE).build()");
        setReminder(a);
    }

    private final void setBuilderIsAllDay(boolean z) {
        TimeZone timeZone;
        String str;
        Todo.C19637a todoBuilder = ((TodoDetailModel) getModelStore()).getTodoBuilder();
        todoBuilder.f48030l = Boolean.valueOf(z);
        if (z) {
            timeZone = TimeZone.getTimeZone("UTC");
            str = "TimeZone.getTimeZone(\"UTC\")";
        } else {
            timeZone = TimeZone.getDefault();
            str = "TimeZone.getDefault()";
        }
        Intrinsics.checkExpressionValueIsNotNull(timeZone, str);
        todoBuilder.f48029k = timeZone.getID();
    }

    private final void setReminder(TodoReminder todoReminder) {
        Todo.C19637a todoBuilder = ((TodoDetailModel) getModelStore()).getTodoBuilder();
        Long l = todoReminder.time;
        if (l != null && l.longValue() == -1) {
            todoBuilder.f48023e = new ArrayList();
        } else if (todoBuilder.f48023e.size() > 0) {
            todoBuilder.f48023e.set(0, todoReminder);
        } else {
            todoBuilder.f48023e = CollectionsKt.mutableListOf(todoReminder);
        }
    }

    private final void setReminderCompareCurrentAndDue(long j) {
        int i;
        if (System.currentTimeMillis() + ((long) (TodoSettingData.f141010a.mo194067a() * 60 * 1000)) > j) {
            i = 0;
        } else {
            i = TodoSettingData.f141010a.mo194067a();
        }
        setReminder((long) i);
    }

    public final void updateTime(boolean z) {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getTimeInfo().mo5929b(generateTimeInfo());
        adVar.getTimeBean().mo5929b(generateTimeBean());
        if (z) {
            adVar.updateTodo();
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i == 1) {
            setTodayDueTimeReminder();
        } else if (i == 2) {
            setTomorrowDueTimeReminder();
        } else if (i == 4) {
            deleteTime();
        } else if (i == 5) {
            goTimeFragmentHitPoint();
        } else if (i == 7) {
            pickTimeClick();
        } else if (i == 8) {
            detailTimeClick();
        } else if (i == 100) {
            createTodoWithTimeCheck$default(this, false, false, 3, null);
        } else if (i == 2002) {
            ((TodoDetailModel) getModelStore()).getTimeBean().mo5929b(generateTimeBean());
        } else if (i == 107) {
            createTodoWithTimeCheck(true, true);
        } else if (i == 108) {
            createTodoWithTimeCheck(true, false);
        }
    }

    private final void setDueTime(long j, long j2) {
        setBuilderIsAllDay(false);
        ((TodoDetailModel) getModelStore()).getTodoBuilder().f48028j = Long.valueOf(j2 / ((long) 1000));
        setReminderCompareCurrentAndDue(j2);
    }

    private final void createTodoWithTimeCheck(boolean z, boolean z2) {
        int i;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        TimeBean generateTimeBean = generateTimeBean();
        if (ReminderHelper.f139700a.mo192311a((long) generateTimeBean.mo193077c(), generateTimeBean.mo193075a(), generateTimeBean.mo193076b())) {
            setReminder(-1);
            if (z) {
                C1177w<Integer> showRemoveReminderDialog = adVar.getShowRemoveReminderDialog();
                if (z2) {
                    i = LocationRequest.PRIORITY_NO_POWER;
                } else {
                    i = 106;
                }
                showRemoveReminderDialog.mo5926a(Integer.valueOf(i));
                return;
            }
            adVar.getShowRemoveReminderDialog().mo5926a((Integer) 101);
        } else if (z) {
            adVar.createKeyBoardTodo(z2);
        } else {
            adVar.createTodo();
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, IActionData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        if (i == 6) {
            if (!(bVar instanceof TimeBean)) {
                bVar = null;
            }
            TimeBean zVar = (TimeBean) bVar;
            if (zVar != null) {
                ((TodoDetailModel) getModelStore()).getTodoBuilder().f48028j = Long.valueOf(zVar.mo193075a() / ((long) 1000));
                setBuilderIsAllDay(zVar.mo193076b());
                TodoReminder a = new TodoReminder.C19665a().mo66705a(Long.valueOf((long) zVar.mo193077c())).mo66704a(TodoReminder.Type.RELATIVE).build();
                Intrinsics.checkExpressionValueIsNotNull(a, "TodoReminder.Builder()\n …                 .build()");
                setReminder(a);
            }
            updateTime$default(this, false, 1, null);
        }
    }

    static /* synthetic */ void updateTime$default(TimeViewModel timeViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        timeViewModel.updateTime(z);
    }

    static /* synthetic */ void createTodoWithTimeCheck$default(TimeViewModel timeViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        timeViewModel.createTodoWithTimeCheck(z, z2);
    }
}
