package com.ss.android.lark.todo.impl.features.remind.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.entity.TodoNotice;
import com.ss.android.lark.todo.impl.features.detail.DetailEntrance;
import com.ss.android.lark.todo.impl.features.detail.TodoDetailActivity;
import com.ss.android.lark.todo.impl.features.remind.reminder.entity.OverallReminderData;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/remind/notification/NotificationHelper;", "", "()V", "OFFLINE_KEY_GUID", "", "TAG", "getIntentForWsChannelOfflinePush", "Landroid/content/Intent;", "bizExtra", "getPendingIntentForReminder", "Landroid/app/PendingIntent;", "todoNotice", "Lcom/ss/android/lark/todo/dependency/entity/TodoNotice;", "getTodoDetailIntent", "context", "Landroid/content/Context;", "getTodoNoticeFromReminder", "overallReminder", "Lcom/ss/android/lark/todo/impl/features/remind/reminder/entity/OverallReminderData;", "routeTodoDetailForOffline", "", "arguments", "Landroid/os/Bundle;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.remind.a.a */
public final class NotificationHelper {

    /* renamed from: a */
    public static final NotificationHelper f140950a = new NotificationHelper();

    private NotificationHelper() {
    }

    /* renamed from: a */
    private final Intent m221487a(Context context) {
        return new Intent(context, TodoDetailActivity.class);
    }

    /* renamed from: a */
    public final Intent mo193993a(String str) {
        boolean z;
        Context a = TodoDependencyHolder.f139242a.mo191730a().settingDependency().mo145427a();
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Intent a2 = m221487a(a);
        a2.addFlags(335544320);
        try {
            String string = new JSONObject(str).getString("todo_detail_key_guid");
            a2.putExtra("todo_detail_key_is_create", false);
            a2.putExtra("todo_detail_key_guid", string);
            return a2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final PendingIntent mo193992a(TodoNotice todoNotice) {
        Intrinsics.checkParameterIsNotNull(todoNotice, "todoNotice");
        Context a = TodoDependencyHolder.f139242a.mo191730a().settingDependency().mo145427a();
        Intent intent = new Intent();
        intent.setClass(a, TodoDetailActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("todo_detail_key_is_create", false);
        intent.putExtra("todo_detail_key_guid", todoNotice.getGuid());
        intent.putExtra("todo_detail_key_from_todo_tab", false);
        return PendingIntent.getActivity(a, (int) SystemClock.uptimeMillis(), intent, 134217728);
    }

    /* renamed from: a */
    public final TodoNotice mo193994a(OverallReminderData overallReminderData) {
        String str;
        Intrinsics.checkParameterIsNotNull(overallReminderData, "overallReminder");
        if (TextUtils.isEmpty(overallReminderData.getTodoReminder().summary)) {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_Task_NoTitlePlaceholder);
        } else {
            str = overallReminderData.getTodoReminder().summary;
        }
        String str2 = overallReminderData.getTodoReminder().guid;
        if (str2 == null) {
            str2 = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "title");
        Long l = overallReminderData.getTodoReminder().due_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "overallReminder.todoReminder.due_time");
        long longValue = l.longValue();
        String str3 = overallReminderData.getTodoReminder().due_timezone;
        Intrinsics.checkExpressionValueIsNotNull(str3, "overallReminder.todoReminder.due_timezone");
        return new TodoNotice(str2, str, longValue, str3);
    }

    /* renamed from: a */
    public final void mo193995a(Context context, Bundle bundle) {
        if (bundle != null && bundle.getBoolean("enter_todo_tab_from_offline_push", false)) {
            String string = bundle.getString("key_offline_push_todo_data");
            if (!TextUtils.isEmpty(string)) {
                try {
                    String string2 = new JSONObject(string).getString("GUID");
                    if (context != null) {
                        DetailEntrance bVar = DetailEntrance.f139694a;
                        Intrinsics.checkExpressionValueIsNotNull(string2, "guid");
                        DetailEntrance.m220107a(bVar, context, string2, false, (String) null, (String) null, (String) null, (String) null, (int) SmEvents.EVENT_NW, (Object) null);
                    }
                } catch (JSONException e) {
                    Log.m165383e("NotificationHelper", "notification click catch = " + e);
                }
                bundle.putBoolean("enter_todo_tab_from_offline_push", false);
                Log.m165389i("NotificationHelper", LogMessageUtil.f139260a.mo191772d("startTodoActivityFromOfflinePush"));
            }
        }
    }
}
