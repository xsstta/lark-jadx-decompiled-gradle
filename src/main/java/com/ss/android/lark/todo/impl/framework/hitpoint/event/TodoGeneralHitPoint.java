package com.ss.android.lark.todo.impl.framework.hitpoint.event;

import android.text.TextUtils;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b=\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0002J\u001e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\rJ\u000e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010!\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\"\u001a\u00020\rJ\u0006\u0010#\u001a\u00020\rJ\u000e\u0010$\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010%\u001a\u00020\rJ\u000e\u0010&\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\bJ\u000e\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020\bJ\u0016\u0010*\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bJ&\u0010+\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\bJ\u0016\u0010-\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bJ\u0006\u0010.\u001a\u00020\rJ\u000e\u0010/\u001a\u00020\r2\u0006\u0010(\u001a\u00020\bJ\u000e\u00100\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u00101\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u00102\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0019J\u0006\u00105\u001a\u00020\rJ\u000e\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0019J\u0006\u00108\u001a\u00020\rJ\u0006\u00109\u001a\u00020\rJ\u000e\u0010:\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ&\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u0019J\u0006\u0010@\u001a\u00020\rJ\u000e\u0010A\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u0016\u0010B\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0019J\u0016\u0010D\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0019J\u0016\u0010E\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0019J\"\u0010F\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\b\b\u0002\u0010H\u001a\u00020\u0019H\u0007J\u000e\u0010I\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010J\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010K\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010L\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u0019J\u0006\u0010M\u001a\u00020\rJ\u0006\u0010N\u001a\u00020\rJ\u000e\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u0019J\u0006\u0010Q\u001a\u00020\rJ\u0006\u0010R\u001a\u00020\rJ\u000e\u0010S\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010T\u001a\u00020\rJ\u0018\u0010U\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\b¨\u0006V"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/hitpoint/event/TodoGeneralHitPoint;", "", "()V", "getFilterType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "filterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "getFilterValueByType", "", "getRemindValueBy", "remindTime", "", "safeSendEvent", "", "eventKey", "param", "Lorg/json/JSONObject;", "publicParamVal", "sendEventCardClickCheckBox", "taskId", "statusValue", "targetValue", "sendEventCardClickEnterDetail", "sendEventCardClickFollow", "isTargetFollow", "", "sendEventCardClickMore", "sendEventCardClickOpenProfile", "sendEventCenterClickAddTask", "sendEventCenterClickClassify", "sendEventCenterClickCompleted", "isTargetFinish", "sendEventCenterClickDeleteOrLeave", "sendEventCenterClickEnterDetail", "sendEventCenterClickHelp", "sendEventCenterClickSetting", "sendEventCenterClickShare", "sendEventCenterClickSort", "sendEventCenterListView", "sendEventChatTodoListClickAdd", "chatId", "sendEventChatTodoListClickConfirm", "sendEventChatTodoListClickDetail", "sendEventChatTodoListClickDone", "isTargetDone", "sendEventChatTodoListClickJumpChat", "sendEventChatTodoListClickViewMore", "sendEventChatTodoListView", "sendEventNotificationCheckMore", "sendEventNotificationClickClose", "sendEventNotificationView", "sendEventSettingClickAllowBadge", "onOrOff", "sendEventSettingClickBadge", "sendEventSettingClickBadgeType", "includeToday", "sendEventSettingTodoBadgeView", "sendEventSettingTodoView", "sendEventTodoCardCheckMoreClick", "sendEventTodoDetailCreateClickCreate", "isTitleAt", "isHaveRemark", "isRemarkAt", "isRemarkDoc", "sendEventTodoDetailCreateView", "sendEventTodoDetailDeleteExecutorClick", "sendEventTodoDetailDoneAllTaskClick", "isComplete", "sendEventTodoDetailDoneMyTaskClick", "sendEventTodoDetailDoneOtherTaskClick", "sendEventTodoDetailEditClick", "clickValue", "isFinish", "sendEventTodoDetailEditView", "sendEventTodoMsgCreateSendClick", "sendEventTodoMsgCreateSendView", "sendEventTodoQuickCreateClickCreate", "sendEventTodoQuickCreateClickUnFold", "sendEventTodoQuickCreateView", "sendEventTodoSettingDailyRemindClick", "isTargetOpen", "sendEventTodoSettingReminderCancelClick", "sendEventTodoSettingReminderClick", "sendEventTodoSettingReminderConfirmClick", "sendEventTodoSettingReminderView", "sendEventTodoTaskHistoryView", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.c.b.a */
public final class TodoGeneralHitPoint {

    /* renamed from: a */
    public static final TodoGeneralHitPoint f141070a = new TodoGeneralHitPoint();

    /* renamed from: b */
    private final String m221672b(int i) {
        return i != -1 ? i != 0 ? i != 5 ? i != 15 ? i != 30 ? i != 60 ? i != 120 ? i != 1440 ? i != 2880 ? "no_alert" : "alert_2day_before" : "alert_1day_before" : "alert_2hour_before" : "alert_1hour_before" : "alert_30min_before" : "alert_15min_before" : "alert_5min_before" : "alert_task_due" : "no_alert";
    }

    private TodoGeneralHitPoint() {
    }

    /* renamed from: a */
    public final void mo194175a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "share").put("target", "public_share_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…oValue.PUBLIC_SHARE_VIEW)");
        m221670a("todo_center_task_list_click", put, str);
    }

    /* renamed from: a */
    public final void mo194180a(String str, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        Intrinsics.checkParameterIsNotNull(str2, "targetValue");
        JSONObject put = new JSONObject().put("click", str2).put("target", "none").put(UpdateKey.STATUS, z ? "undone_to_done" : "done_to_undone");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…TodoValue.DONE_TO_UNDONE)");
        m221670a("todo_center_task_list_click", put, str);
    }

    /* renamed from: a */
    public final void mo194179a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "follow").put("target", "none").put(UpdateKey.STATUS, z ? "unfollow_to_follow" : "follow_to_unfollow");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…Value.FOLLOW_TO_UNFOLLOW)");
        m221670a("todo_card_click", put, str);
    }

    /* renamed from: a */
    public final void mo194177a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        Intrinsics.checkParameterIsNotNull(str2, "statusValue");
        Intrinsics.checkParameterIsNotNull(str3, "targetValue");
        JSONObject put = new JSONObject().put("click", str3).put("target", "none").put(UpdateKey.STATUS, str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…aram.STATUS, statusValue)");
        m221670a("todo_card_click", put, str);
    }

    /* renamed from: a */
    public final void mo194178a(String str, String str2, boolean z, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        Intrinsics.checkParameterIsNotNull(str3, "targetValue");
        JSONObject put = new JSONObject().put("click", str3).put(UpdateKey.STATUS, z ? "undone_to_done" : "done_to_undone").put("target", "none").put("chat_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…odoParam.CHAT_ID, chatId)");
        m221670a("todo_im_chat_todo_list_click", put, str);
    }

    /* renamed from: a */
    public final void mo194176a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        JSONObject put = new JSONObject().put("click", "click_task").put("target", "todo_task_detail_view").put("chat_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…odoParam.CHAT_ID, chatId)");
        m221670a("todo_im_chat_todo_list_click", put, str);
    }

    /* renamed from: a */
    public final void mo194182a(boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        String str2;
        String str3 = "true";
        JSONObject put = new JSONObject().put("click", "create").put("target", "none").put("is_title_at_someone", z ? str3 : "false");
        if (z2) {
            str = str3;
        } else {
            str = "false";
        }
        JSONObject put2 = put.put("is_have_remark", str);
        if (z3) {
            str2 = str3;
        } else {
            str2 = "false";
        }
        JSONObject put3 = put2.put("is_remark_at_someone", str2);
        if (!z4) {
            str3 = "false";
        }
        JSONObject put4 = put3.put("is_remark_have_doc", str3);
        Intrinsics.checkExpressionValueIsNotNull(put4, "JSONObject().put(TodoPar…RUE else TodoValue.FALSE)");
        m221667a(this, "todo_create_click", put4, null, 4, null);
    }

    /* renamed from: a */
    public final void mo194181a(boolean z) {
        JSONObject put = new JSONObject().put("click", "create").put("target", "none").put("is_title_at_someone", z ? "true" : "false");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…RUE else TodoValue.FALSE)");
        m221667a(this, "todo_quick_create_click", put, null, 4, null);
    }

    /* renamed from: b */
    public final void mo194188b(boolean z) {
        JSONObject put = new JSONObject().put("click", "task_alert").put("target", "setting_todo_view").put(UpdateKey.STATUS, z ? "off_to_on" : "on_to_off");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…else TodoValue.ON_TO_OFF)");
        m221667a(this, "setting_todo_click", put, null, 4, null);
    }

    /* renamed from: b */
    public final void mo194187b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "done_my_task").put("target", "none").put(UpdateKey.STATUS, z ? "undone_to_done" : "done_to_undone");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…TodoValue.DONE_TO_UNDONE)");
        m221670a("todo_task_detail_click", put, str);
    }

    /* renamed from: g */
    public final void mo194202g() {
        m221667a(this, "todo_create_view", new JSONObject(), null, 4, null);
    }

    /* renamed from: h */
    public final void mo194204h() {
        m221667a(this, "todo_quick_create_view", new JSONObject(), null, 4, null);
    }

    /* renamed from: k */
    public final void mo194210k() {
        m221667a(this, "setting_todo_default_alert_time_view", new JSONObject(), null, 4, null);
    }

    /* renamed from: m */
    public final void mo194214m() {
        m221667a(this, "setting_todo_view", null, null, 6, null);
    }

    /* renamed from: o */
    public final void mo194218o() {
        m221667a(this, "setting_todo_badge_view", null, null, 6, null);
    }

    /* renamed from: a */
    public final void mo194171a() {
        JSONObject put = new JSONObject().put("click", "help").put("target", "none");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…m.TARGET, TodoValue.NONE)");
        m221667a(this, "todo_center_task_list_click", put, null, 4, null);
    }

    /* renamed from: d */
    public final void mo194194d() {
        JSONObject put = new JSONObject().put("click", "add_task").put("target", "todo_quick_create_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…e.TODO_QUICK_CREATE_VIEW)");
        m221667a(this, "todo_center_task_list_click", put, null, 4, null);
    }

    /* renamed from: e */
    public final void mo194198e() {
        JSONObject put = new JSONObject().put("click", "check_more").put("target", "todo_center_task_list_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…DO_CENTER_TASK_LIST_VIEW)");
        m221667a(this, "todo_bot_list_card_click", put, null, 4, null);
    }

    /* renamed from: f */
    public final void mo194200f() {
        JSONObject put = new JSONObject().put("click", "check_more").put("target", "todo_center_task_list_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…DO_CENTER_TASK_LIST_VIEW)");
        m221667a(this, "todo_im_chat_todo_list_click", put, null, 4, null);
    }

    /* renamed from: i */
    public final void mo194206i() {
        JSONObject put = new JSONObject().put("click", "unfold").put("target", "todo_create_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…doValue.TODO_CREATE_VIEW)");
        m221667a(this, "todo_quick_create_click", put, null, 4, null);
    }

    /* renamed from: j */
    public final void mo194208j() {
        JSONObject put = new JSONObject().put("click", "default_alert_time").put("target", "setting_todo_default_alert_time_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…_DEFAULT_ALERT_TIME_VIEW)");
        m221667a(this, "setting_todo_click", put, null, 4, null);
    }

    /* renamed from: l */
    public final void mo194212l() {
        JSONObject put = new JSONObject().put("click", "cancel").put("target", "setting_todo_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…oValue.SETTING_TODO_VIEW)");
        m221667a(this, "setting_todo_default_alert_time_click", put, null, 4, null);
    }

    /* renamed from: n */
    public final void mo194216n() {
        JSONObject put = new JSONObject().put("click", "task_badge_setting").put("target", "setting_todo_badge_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar….SETTING_TODO_BADGE_VIEW)");
        m221667a(this, "setting_todo_click", put, null, 4, null);
    }

    /* renamed from: c */
    public final void mo194189c() {
        JSONObject put = new JSONObject().put("click", "setting").put("target", "setting_todo_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…oValue.SETTING_TODO_VIEW)");
        m221667a(this, "todo_center_task_list_click", put, null, 4, null);
    }

    /* renamed from: b */
    public final void mo194183b() {
        JSONObject put = new JSONObject().put("click", "sort").put("target", "todo_sort_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…TodoValue.TODO_SORT_VIEW)");
        m221667a(this, "todo_center_task_list_click", put, null, 4, null);
    }

    /* renamed from: i */
    public final void mo194207i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        m221670a("todo_task_detail_view", new JSONObject(), str);
    }

    /* renamed from: j */
    public final void mo194209j(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        m221670a("todo_msg_create_confirm_view", new JSONObject(), str);
    }

    /* renamed from: f */
    public final void mo194201f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        JSONObject put = new JSONObject().put("chat_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.CHAT_ID, chatId)");
        m221667a(this, "todo_im_chat_todo_list_view", put, null, 4, null);
    }

    /* renamed from: m */
    public final void mo194215m(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        m221670a("todo_event_notification_view", new JSONObject(), str);
    }

    /* renamed from: b */
    private final TodoFilterType m221671b(TodoListView.Type type) {
        switch (C57208b.f141072b[type.ordinal()]) {
            case 1:
                return TodoFilterType.ALL;
            case 2:
                return TodoFilterType.ASSIGN_TO_ME;
            case 3:
                return TodoFilterType.ASSIGN_FROM_ME;
            case 4:
                return TodoFilterType.FOLLOWED;
            case 5:
                return TodoFilterType.COMPLETED;
            case 6:
                return TodoFilterType.FROM_DOCS;
            default:
                return TodoFilterType.ALL;
        }
    }

    /* renamed from: c */
    private final String m221673c(TodoFilterType todoFilterType) {
        switch (C57208b.f141071a[todoFilterType.ordinal()]) {
            case 1:
                return "ongoing";
            case 2:
                return "received";
            case 3:
                return "assigned";
            case 4:
                return "following";
            case 5:
                return "completed";
            case 6:
                return "from_doc";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: g */
    public final void mo194203g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        JSONObject put = new JSONObject().put("click", "add_task").put("target", "todo_quick_create_view").put("chat_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…odoParam.CHAT_ID, chatId)");
        m221667a(this, "todo_im_chat_todo_list_click", put, null, 4, null);
    }

    /* renamed from: h */
    public final void mo194205h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        JSONObject put = new JSONObject().put("click", "create_task").put("target", "none").put("chat_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…odoParam.CHAT_ID, chatId)");
        m221667a(this, "todo_im_chat_todo_list_click", put, null, 4, null);
    }

    /* renamed from: k */
    public final void mo194211k(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "send").put("target", "im_chat_main_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…oValue.IM_CHAT_MAIN_VIEW)");
        m221670a("todo_msg_create_confirm_click", put, str);
    }

    /* renamed from: o */
    public final void mo194219o(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "close").put("target", "none");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…m.TARGET, TodoValue.NONE)");
        m221670a("todo_event_notification_click", put, str);
    }

    /* renamed from: p */
    public final void mo194220p(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "check_more").put("target", "todo_center_task_list_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…DO_CENTER_TASK_LIST_VIEW)");
        m221670a("todo_card_click", put, str);
    }

    /* renamed from: d */
    public final void mo194195d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "detail").put("target", "todo_task_detail_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…ue.TODO_TASK_DETAIL_VIEW)");
        m221670a("todo_card_click", put, str);
    }

    /* renamed from: e */
    public final void mo194199e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "profile").put("target", "profile_main_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…oValue.PROFILE_MAIN_VIEW)");
        m221670a("todo_card_click", put, str);
    }

    /* renamed from: l */
    public final void mo194213l(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "delete_tasker").put("target", "none");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…m.TARGET, TodoValue.NONE)");
        m221670a("todo_task_detail_click", put, str);
    }

    /* renamed from: n */
    public final void mo194217n(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "check_more_detail").put("target", "todo_task_detail_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…ue.TODO_TASK_DETAIL_VIEW)");
        m221670a("todo_event_notification_click", put, str);
    }

    /* renamed from: c */
    public final void mo194190c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "click_task").put("target", "todo_task_detail_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…ue.TODO_TASK_DETAIL_VIEW)");
        m221670a("todo_center_task_list_click", put, str);
    }

    /* renamed from: a */
    public final void mo194172a(int i) {
        JSONObject put = new JSONObject().put("click", "complete").put("target", "setting_todo_view").put(UpdateKey.STATUS, m221672b(i));
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…emindValueBy(remindTime))");
        m221667a(this, "setting_todo_default_alert_time_click", put, null, 4, null);
    }

    /* renamed from: b */
    public final void mo194184b(TodoFilterType todoFilterType) {
        Intrinsics.checkParameterIsNotNull(todoFilterType, "filterType");
        JSONObject put = new JSONObject().put("click", m221673c(todoFilterType)).put("target", "center_task_list_view");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…ue.CENTER_TASK_LIST_VIEW)");
        m221667a(this, "todo_center_task_list_click", put, null, 4, null);
    }

    /* renamed from: d */
    public final void mo194197d(boolean z) {
        String str;
        JSONObject put = new JSONObject().put("click", "badge_type").put("target", "none");
        if (z) {
            str = "overdue_or_due_today";
        } else {
            str = "overdue";
        }
        JSONObject put2 = put.put(UpdateKey.STATUS, str);
        Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject().put(TodoPar…Y else TodoValue.OVERDUE)");
        m221667a(this, "setting_todo_badge_click", put2, null, 4, null);
    }

    /* renamed from: a */
    public final void mo194173a(TodoListView.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "filterType");
        mo194174a(m221671b(type));
    }

    /* renamed from: b */
    public final void mo194185b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "leave_task").put("target", "none");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…m.TARGET, TodoValue.NONE)");
        m221670a("todo_center_task_list_click", put, str);
    }

    /* renamed from: a */
    public final void mo194174a(TodoFilterType todoFilterType) {
        Intrinsics.checkParameterIsNotNull(todoFilterType, "filterType");
        JSONObject put = new JSONObject().put("tab", m221673c(todoFilterType));
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…             filterType))");
        m221667a(this, "todo_center_task_list_view", put, null, 4, null);
    }

    /* renamed from: c */
    public final void mo194193c(boolean z) {
        String str;
        JSONObject put = new JSONObject().put("click", "allow_badge").put("target", "none");
        if (z) {
            str = "off_to_on";
        } else {
            str = "on_to_off";
        }
        JSONObject put2 = put.put(UpdateKey.STATUS, str);
        Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject().put(TodoPar…else TodoValue.ON_TO_OFF)");
        m221667a(this, "setting_todo_badge_click", put2, null, 4, null);
    }

    /* renamed from: d */
    public final void mo194196d(String str, boolean z) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "done_other_task").put("target", "none");
        if (z) {
            str2 = "undone_to_done";
        } else {
            str2 = "done_to_undone";
        }
        JSONObject put2 = put.put(UpdateKey.STATUS, str2);
        Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject().put(TodoPar…TodoValue.DONE_TO_UNDONE)");
        m221670a("todo_task_detail_click", put2, str);
    }

    /* renamed from: c */
    public final void mo194191c(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str2)) {
            str2 = "none";
        }
        JSONObject put = jSONObject.put("chat_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…doValue.NONE else chatId)");
        m221670a("todo_task_history_view", put, str);
    }

    /* renamed from: c */
    public final void mo194192c(String str, boolean z) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        JSONObject put = new JSONObject().put("click", "done_all_task").put("target", "none");
        if (z) {
            str2 = "undone_to_done";
        } else {
            str2 = "done_to_undone";
        }
        JSONObject put2 = put.put(UpdateKey.STATUS, str2);
        Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject().put(TodoPar…TodoValue.DONE_TO_UNDONE)");
        m221670a("todo_task_detail_click", put2, str);
    }

    /* renamed from: b */
    public final void mo194186b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        JSONObject put = new JSONObject().put("click", "jump_to_chat").put("target", "im_chat_main_view").put("chat_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…odoParam.CHAT_ID, chatId)");
        m221670a("todo_im_chat_todo_list_click", put, str);
    }

    /* renamed from: a */
    private final void m221670a(String str, JSONObject jSONObject, String str2) {
        boolean z;
        try {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jSONObject.put("task_id", str2);
            }
            TodoDependencyHolder.f139242a.mo191730a().statisticsDependency().mo145430a(str, jSONObject);
            Log.m165379d("TodoGeneralHitPoint", "eventKey:" + str + " param:" + jSONObject);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r5.equals("leave_task") != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r5.equals("done_task") != false) goto L_0x006a;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m221668a(java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint.m221668a(java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m221669a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        m221668a(str, str2, z);
    }

    /* renamed from: a */
    static /* synthetic */ void m221667a(TodoGeneralHitPoint aVar, String str, JSONObject jSONObject, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            jSONObject = new JSONObject();
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        aVar.m221670a(str, jSONObject, str2);
    }
}
