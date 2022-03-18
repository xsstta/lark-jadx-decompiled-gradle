package com.ss.android.lark.todo.impl.features.common.screenshot.helper;

import com.alibaba.fastjson.JSON;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoItemPermission;
import com.bytedance.lark.pb.todo.v1.TodoReminder;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.bytedance.lark.pb.todo.v1.TodoUser;
import com.bytedance.lark.sdk.Sdk;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.common.screenshot.entity.AssignerEntity;
import com.ss.android.lark.todo.impl.features.common.screenshot.entity.ReminderEntity;
import com.ss.android.lark.todo.impl.features.common.screenshot.entity.ReminderList;
import com.ss.android.lark.todo.impl.features.common.screenshot.entity.SelfPermissionEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/screenshot/helper/TodoDetailLogHelper;", "", "()V", "TAG", "", "getAssignerStr", "assigner", "Lcom/bytedance/lark/pb/todo/v1/TodoUser;", "getReminderList", "reminders", "", "Lcom/bytedance/lark/pb/todo/v1/TodoReminder;", "getSelfPermissionStr", "todo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "logTodoDetailOnScreenShot", "", "scenario", "messageId", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.c.b.a */
public final class TodoDetailLogHelper {

    /* renamed from: a */
    public static final TodoDetailLogHelper f139384a = new TodoDetailLogHelper();

    private TodoDetailLogHelper() {
    }

    /* renamed from: a */
    private final String m219750a(TodoUser todoUser) {
        if (todoUser == null) {
            return "";
        }
        String jSONString = JSON.toJSONString(new AssignerEntity(todoUser.user_id));
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSON.toJSONString(Assign…r_id = assigner.user_id))");
        return jSONString;
    }

    /* renamed from: a */
    private final String m219749a(Todo todo) {
        boolean z;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        TodoItemPermission todoItemPermission = todo.self_permission;
        boolean z3 = false;
        if (todoItemPermission == null || (bool3 = todoItemPermission.is_editable) == null) {
            z = false;
        } else {
            z = bool3.booleanValue();
        }
        TodoItemPermission todoItemPermission2 = todo.self_permission;
        if (todoItemPermission2 == null || (bool2 = todoItemPermission2.is_assignable) == null) {
            z2 = false;
        } else {
            z2 = bool2.booleanValue();
        }
        TodoItemPermission todoItemPermission3 = todo.self_permission;
        if (!(todoItemPermission3 == null || (bool = todoItemPermission3.is_readable) == null)) {
            z3 = bool.booleanValue();
        }
        String jSONString = JSON.toJSONString(new SelfPermissionEntity(z, z2, z3));
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSON.toJSONString(\n     …n?.is_readable ?: false))");
        return jSONString;
    }

    /* renamed from: a */
    private final String m219751a(List<TodoReminder> list) {
        String str;
        if (list == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            TodoReminder.Type type = t.type;
            if (type != null) {
                int i = C56323b.f139385a[type.ordinal()];
                if (i == 1) {
                    str = "ABSOLUTE";
                } else if (i == 2) {
                    str = "RELATIVE";
                } else if (i == 3) {
                    str = "FLOATING";
                }
                Long l = t.time;
                Intrinsics.checkExpressionValueIsNotNull(l, "it.time");
                arrayList.add(new ReminderEntity(str, l.longValue()));
            }
            str = "";
            Long l2 = t.time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "it.time");
            arrayList.add(new ReminderEntity(str, l2.longValue()));
        }
        String jSONString = JSON.toJSONString(new ReminderList(arrayList));
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSON.toJSONString(ReminderList(reminderList))");
        return jSONString;
    }

    /* renamed from: a */
    public final void mo191962a(Todo todo, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkParameterIsNotNull(todo, "todo");
        Intrinsics.checkParameterIsNotNull(str, "scenario");
        Intrinsics.checkParameterIsNotNull(str2, "messageId");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject put = jSONObject.put("scenario", str).put("message_id", str2);
            String str8 = todo.guid;
            if (str8 == null) {
                str8 = "";
            }
            JSONObject put2 = put.put("guid", str8).put("reminders", m219751a(todo.reminders));
            TodoSource todoSource = todo.source;
            if (todoSource == null) {
                todoSource = TodoSource.UNKNOWN_SOURCE;
            }
            JSONObject put3 = put2.put(ShareHitPoint.f121868c, todoSource);
            String str9 = todo.block_id;
            if (str9 == null) {
                str9 = "";
            }
            JSONObject put4 = put3.put("block_id", str9);
            Long l = todo.start_time;
            String str10 = null;
            if (l != null) {
                str3 = String.valueOf(l.longValue());
            } else {
                str3 = null;
            }
            JSONObject put5 = put4.put("start_time", str3);
            String str11 = todo.start_timezone;
            if (str11 == null) {
                str11 = "";
            }
            JSONObject put6 = put5.put("start_timezone", str11);
            Long l2 = todo.due_time;
            if (l2 != null) {
                str4 = String.valueOf(l2.longValue());
            } else {
                str4 = null;
            }
            JSONObject put7 = put6.put("due_time", str4);
            String str12 = todo.due_timezone;
            if (str12 == null) {
                str12 = "";
            }
            JSONObject put8 = put7.put("due_timezone", str12);
            Boolean bool = todo.is_all_day;
            if (bool != null) {
                str5 = String.valueOf(bool.booleanValue());
            } else {
                str5 = null;
            }
            JSONObject put9 = put8.put("is_all_day", str5).put("self_permission", m219749a(todo));
            Long l3 = todo.completed_milli_time;
            if (l3 != null) {
                str6 = String.valueOf(l3.longValue());
            } else {
                str6 = null;
            }
            JSONObject put10 = put9.put("completed_milli_time", str6);
            String str13 = todo.creator_id;
            if (str13 == null) {
                str13 = "";
            }
            JSONObject put11 = put10.put("creator_id", str13);
            Long l4 = todo.create_milli_time;
            if (l4 != null) {
                str7 = String.valueOf(l4.longValue());
            } else {
                str7 = null;
            }
            JSONObject put12 = put11.put("create_milli_time", str7);
            Boolean bool2 = todo.is_not_mine;
            if (bool2 != null) {
                str10 = String.valueOf(bool2.booleanValue());
            }
            put12.put("is_not_mine", str10).put("assigner", m219750a(todo.assigner));
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "jsonObject.toString()");
            Log.m165389i("TodoScreenShotLog", jSONObject2);
            Sdk.log("", "user screenshot accompanying infos: " + jSONObject2);
        } catch (Throwable th) {
            Log.m165383e("TodoDetailLogHelper", "ScreenShot error : " + th.getMessage());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m219752a(TodoDetailLogHelper aVar, Todo todo, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        aVar.mo191962a(todo, str, str2);
    }
}
