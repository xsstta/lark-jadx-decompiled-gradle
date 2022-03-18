package com.ss.android.lark.todo.impl.framework.hitpoint.event;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoSceneType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Deprecated(message = "Old hit points will be deleted!", replaceWith = @ReplaceWith(expression = "TodoGeneralHitPoint", imports = {}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b3\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u001f\u001a\u00020\rJ\u0010\u0010 \u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000bH\u0007J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J*\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u000e\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020#J\u0006\u0010(\u001a\u00020\rJ \u0010)\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020#J\u0006\u0010+\u001a\u00020\rJ\u0010\u0010,\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0004H\u0007J\u0006\u0010/\u001a\u00020\rJ\u0016\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004J\u0016\u00103\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004J\u0018\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0004H\u0007J\u0018\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0004H\u0007J\u0018\u00104\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004H\u0007J\u0010\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020#H\u0007J\b\u00108\u001a\u00020\rH\u0007J\u0018\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u001a\u0010;\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020#H\u0007JD\u0010=\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020#2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010C\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010D\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010E\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010F\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010G\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010H\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010I\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0018\u0010J\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J \u0010K\u001a\u00020\r2\u0006\u0010:\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010L\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\b\u0010M\u001a\u00020\rH\u0007J\u0010\u0010N\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\b\u0010O\u001a\u00020\rH\u0007J\u0010\u0010P\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u0004H\u0007J\u0010\u0010R\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0004H\u0007J\u0018\u0010S\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u0010\u0010T\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010U\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¨\u0006V"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/hitpoint/event/TodoHitPoint;", "", "()V", "checkSource", "", "todoSceneType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoSceneType;", "checkSubSource", "getValueByFilterType", "filterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "safeSendEvent", "", "eventKey", "param", "Lorg/json/JSONObject;", "sendEventAddAssignee", "typeStr", "sourceStr", "sendEventClickBackToDialog", "todoId", "scenarioTypeStr", "sendEventClickFollow", ShareHitPoint.f121868c, "taskId", "sendEventClickFollowCancel", "userId", "sendEventComment", "action", "guid", "sendEventCreateSuspend", "sendEventCreateTodo", "sendEventDateClick", "isCreate", "", "hasSetTime", "timeType", "sendEventInputBoxExpandClick", "expand", "sendEventMultiMessageExpand", "sendEventPersonClick", "hasAssignee", "sendEventRevokeClick", "sendEventSendCardToChat", "sendEventSwitchClick", "sourceValue", "sendEventTitleAtSomebody", "sendEventTodoCenterListClick", "clickValue", "targetValue", "sendEventTodoCenterMoreClick", "sendEventTodoClick", "todoGuid", "sendEventTodoDailyReminderSettings", "isToggleOn", "sendEventTodoDetailAssigneeClick", "sendEventTodoDetailBack", "isTodoCreate", "sendEventTodoDetailClick", "isFinish", "sendEventTodoDetailCreateClick", "isAtSomebody", "isNoteIncluded", "isNoteIncludeText", "isNoteIncludeDoc", "isNoteIncludeAt", "sendEventTodoDetailDelete", "sendEventTodoDetailDeleteCancel", "sendEventTodoDetailDeleteConfirm", "sendEventTodoDetailHistory", "sendEventTodoDetailHistoryBack", "sendEventTodoDetailMember", "sendEventTodoDetailMemberBack", "sendEventTodoDetailMemberDelete", "sendEventTodoDetailPersonSelect", "sendEventTodoDetailTaskComplete", "sendEventTodoDetailTimeClick", "sendEventTodoDetailTimeDelete", "sendEventTodoDetailTimeUpdate", "sendEventTodoMainEntrance", "tabValue", "sendEventTodoShare", "sendEventTodoTaskComplete", "sendEventTodoTaskUnComplete", "sendEventTodoView", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.c.b.c */
public final class TodoHitPoint {

    /* renamed from: a */
    public static final TodoHitPoint f141073a = new TodoHitPoint();

    private TodoHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221736a(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TodoSceneType todoSceneType) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("task_id", str);
        jSONObject.put("if_at_somebody", z ? 1 : 0);
        jSONObject.put("if_note_included", z2);
        jSONObject.put("if_note_include_text", z3);
        jSONObject.put("if_note_include_doc", z4);
        jSONObject.put("if_note_include_at", z5);
        TodoHitPoint cVar = f141073a;
        String a = cVar.m221724a(todoSceneType);
        if (a != null) {
            jSONObject.put(ShareHitPoint.f121868c, a);
        }
        String b = cVar.m221742b(todoSceneType);
        if (b != null) {
            jSONObject.put("sub_source", b);
        }
        if (todoSceneType == TodoSceneType.MESSAGE_TOOLBAR || todoSceneType == TodoSceneType.INPUT_BOX) {
            jSONObject.put("ab_version", "inline");
        }
        cVar.m221733a("todo_create_confirm", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221739a(boolean z, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "guid");
        if (z) {
            TodoHitPoint cVar = f141073a;
            JSONObject put = new JSONObject().put("select_user_id", str);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.SELECT_USER_ID, userId)");
            cVar.m221733a("todo_create_person_select", put);
            return;
        }
        TodoHitPoint cVar2 = f141073a;
        JSONObject put2 = new JSONObject().put("select_user_id", str).put("task_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put2, "JSONObject().put(TodoPar…(TodoParam.TASK_ID, guid)");
        cVar2.m221733a("todo_task_members_add", put2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221738a(boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        if (z) {
            f141073a.m221762o("todo_create_cancel");
            return;
        }
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TASK_ID, guid)");
        cVar.m221733a("todo_task_close", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221740a(boolean z, String str, boolean z2, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "timeType");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put(ShareHitPoint.f121868c, z ? "create" : "detail").put("task_id", str).put("state", z2 ? "yes" : "no").put("time_type", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…aram.TIME_TYPE, timeType)");
        cVar.m221733a("todo_date_click", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221737a(boolean z) {
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("is_on", z ? "true" : "false");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…RUE else TodoValue.FALSE)");
        cVar.m221733a("todo_daily_reminder_settings", put);
    }

    /* renamed from: a */
    public static /* synthetic */ void m221735a(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        m221734a(str, z);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m221734a(java.lang.String r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint.m221734a(java.lang.String, boolean):void");
    }

    /* renamed from: a */
    public final void mo194221a(boolean z, String str, boolean z2) {
        JSONObject put = new JSONObject().put(ShareHitPoint.f121868c, z ? "create" : "detail").put("task_id", str).put("state", z2 ? "yes" : "no");
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…else TodoCommentValue.NO)");
        m221733a("todo_person_click", put);
    }

    /* renamed from: a */
    private final void m221733a(String str, JSONObject jSONObject) {
        try {
            TodoDependencyHolder.f139242a.mo191730a().statisticsDependency().mo145430a(str, jSONObject);
            Log.m165379d("GeneralHitPoint", "eventKey:" + str + " param:" + jSONObject);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221725a() {
        f141073a.m221762o("todo_create_person_click");
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m221743b() {
        f141073a.m221762o("todo_create_date_click");
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m221746c() {
        f141073a.m221762o("todo_create_date_select");
    }

    /* renamed from: d */
    public final void mo194224d() {
        m221762o("todo_im_multi_select_message_expand");
    }

    /* renamed from: f */
    public final void mo194227f() {
        m221762o("todo_revoke_click");
    }

    /* renamed from: g */
    public final void mo194228g() {
        m221762o("todo_create_suspend");
    }

    /* renamed from: e */
    public final void mo194225e() {
        JSONObject put = new JSONObject().put("is_assignee", 1);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.IS_ASSIGNEE, 1)");
        m221733a("todo_title_at_somebody", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221726a(TodoListView.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "filterType");
        m221757j(f141073a.mo194222b(type));
    }

    /* renamed from: b */
    private final String m221742b(TodoSceneType todoSceneType) {
        if (todoSceneType != null) {
            int i = C57209d.f141077d[todoSceneType.ordinal()];
            if (i == 1) {
                return "single_message";
            }
            if (i == 2) {
                return "multiple_messages";
            }
            if (i != 3) {
                return null;
            }
            return "message_after_forwarding";
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m221747c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TASK_ID, guid)");
        cVar.m221733a("todo_task_delete", put);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m221749d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TASK_ID, guid)");
        cVar.m221733a("todo_task_delete_confirm", put);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m221751e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TASK_ID, guid)");
        cVar.m221733a("todo_task_delete_cancel", put);
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m221752f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TASK_ID, guid)");
        cVar.m221733a("todo_task_history_click", put);
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m221754g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TASK_ID, guid)");
        cVar.m221733a("todo_task_history_back", put);
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m221755h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TASK_ID, guid)");
        cVar.m221733a("todo_task_members", put);
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m221756i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TASK_ID, guid)");
        cVar.m221733a("todo_task_date_delete", put);
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m221757j(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sourceStr");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put(ShareHitPoint.f121868c, str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.SOURCE, sourceStr)");
        cVar.m221733a("todo_create", put);
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m221758k(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sourceStr");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put(ShareHitPoint.f121868c, str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.SOURCE, sourceStr)");
        cVar.m221733a("todo_view", put);
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m221759l(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sourceValue");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put(ShareHitPoint.f121868c, str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.SOURCE, sourceValue)");
        cVar.m221733a("todo_task_share", put);
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m221760m(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sourceValue");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("page", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.PAGE, sourceValue)");
        cVar.m221733a("todo_switch_click", put);
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m221761n(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TASK_ID, guid)");
        cVar.m221733a("todo_send_to_conversation", put);
    }

    /* renamed from: a */
    private final String m221724a(TodoSceneType todoSceneType) {
        if (todoSceneType != null) {
            switch (C57209d.f141076c[todoSceneType.ordinal()]) {
                case 1:
                    return "my_task_all";
                case 2:
                    return "my_task_from_me";
                case 3:
                    return "my_task_done";
                case 4:
                    return "followed_by_me";
                case 5:
                    return "message_toolbar";
                case 6:
                    return "input_box";
                case 7:
                case 8:
                case 9:
                    return "message_add";
                case 10:
                    return "chat_todo_list";
            }
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m221741b(TodoFilterType todoFilterType) {
        Intrinsics.checkParameterIsNotNull(todoFilterType, "filterType");
        int i = C57209d.f141074a[todoFilterType.ordinal()];
        if (i == 1) {
            return "my_task_all";
        }
        if (i == 2) {
            return "my_task_from_me";
        }
        if (i == 3) {
            return "my_task_to_me";
        }
        if (i == 4) {
            return "following";
        }
        if (i != 5) {
            return "";
        }
        return "my_task_done";
    }

    /* renamed from: o */
    private final void m221762o(String str) {
        try {
            TodoDependencyHolder.f139242a.mo191730a().statisticsDependency().mo145429a(str);
            Log.m165379d("GeneralHitPoint", "eventKey:" + str);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221728a(TodoFilterType todoFilterType) {
        Intrinsics.checkParameterIsNotNull(todoFilterType, "filterType");
        m221757j(m221741b(todoFilterType));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m221744b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TASK_ID, guid)");
        cVar.m221733a("todo_task_status_not_done", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221730a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tabValue");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("tab", str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoParam.TAB, tabValue)");
        cVar.m221733a("todo_center_task_list_view", put);
    }

    /* renamed from: b */
    public final String mo194222b(TodoListView.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "filterType");
        int i = C57209d.f141075b[type.ordinal()];
        if (i == 1) {
            return "my_task_all";
        }
        if (i == 2) {
            return "my_task_from_me";
        }
        if (i == 3) {
            return "my_task_to_me";
        }
        if (i == 4) {
            return "following";
        }
        if (i != 5) {
            return "";
        }
        return "my_task_done";
    }

    /* renamed from: b */
    public final void mo194223b(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "yes";
        } else {
            str = "no";
        }
        JSONObject put = jSONObject.put(ShareHitPoint.f121869d, str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…else TodoCommentValue.NO)");
        m221733a("todo_input_box_expand_click", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221727a(TodoListView.Type type, String str) {
        Intrinsics.checkParameterIsNotNull(type, "filterType");
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        m221748c(f141073a.mo194222b(type), str);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m221748c(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "sourceValue");
        Intrinsics.checkParameterIsNotNull(str2, "todoGuid");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put(ShareHitPoint.f121868c, str).put("task_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…oParam.TASK_ID, todoGuid)");
        cVar.m221733a("todo_task_click", put);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m221750d(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "typeStr");
        Intrinsics.checkParameterIsNotNull(str2, "sourceStr");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put(ShareHitPoint.f121869d, str).put(ShareHitPoint.f121868c, str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…oParam.SOURCE, sourceStr)");
        cVar.m221733a("todo_add_performer", put);
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m221753f(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str2).put(ShareHitPoint.f121868c, str);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…TodoParam.SOURCE, source)");
        cVar.m221733a("todo_task_follow", put);
    }

    /* renamed from: g */
    public final void mo194229g(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        JSONObject put = new JSONObject().put("action", str).put(ShareHitPoint.f121868c, "task_detail").put("task_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…(TodoParam.TASK_ID, guid)");
        m221733a("todo_comment", put);
    }

    /* renamed from: h */
    public final void mo194230h(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "clickValue");
        Intrinsics.checkParameterIsNotNull(str2, "targetValue");
        JSONObject put = new JSONObject().put("click", str).put("target", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…aram.TARGET, targetValue)");
        m221733a("todo_center_task_list_more_click", put);
    }

    /* renamed from: i */
    public final void mo194231i(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "clickValue");
        Intrinsics.checkParameterIsNotNull(str2, "targetValue");
        JSONObject put = new JSONObject().put("click", str).put("target", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…aram.TARGET, targetValue)");
        m221733a("todo_center_task_list_click", put);
    }

    /* renamed from: e */
    public final void mo194226e(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "todoId");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioTypeStr");
        JSONObject put = new JSONObject().put("task_id", str).put("scenario_type", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…IO_TYPE, scenarioTypeStr)");
        m221733a("todo_click_back_to_dialog", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221729a(TodoFilterType todoFilterType, String str) {
        Intrinsics.checkParameterIsNotNull(todoFilterType, "filterType");
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        m221748c(m221741b(todoFilterType), str);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m221745b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str).put("select_user_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…m.SELECT_USER_ID, userId)");
        cVar.m221733a("todo_task_members_delete", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221731a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str).put(ShareHitPoint.f121868c, str2);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…TodoParam.SOURCE, source)");
        cVar.m221733a("todo_task_status_done", put);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m221732a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(str3, "userId");
        TodoHitPoint cVar = f141073a;
        JSONObject put = new JSONObject().put("task_id", str2).put(ShareHitPoint.f121869d, str).put("select_user_id", str3);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(TodoPar…m.SELECT_USER_ID, userId)");
        cVar.m221733a("todo_task_follow_cancel", put);
    }
}
