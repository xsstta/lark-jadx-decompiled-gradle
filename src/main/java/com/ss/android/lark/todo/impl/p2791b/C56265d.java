package com.ss.android.lark.todo.impl.p2791b;

import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoItemPermission;
import com.bytedance.lark.pb.todo.v1.TodoReminder;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"logInfo", "", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "todo_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.b.d */
public final class C56265d {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.b.d$a */
    static final class C56266a extends Lambda implements Function1<TodoAssignee, String> {
        public static final C56266a INSTANCE = new C56266a();

        C56266a() {
            super(1);
        }

        public final String invoke(TodoAssignee todoAssignee) {
            return todoAssignee.assignee_id + ':' + todoAssignee.assigner_id;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/todo/v1/TodoReminder;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.b.d$b */
    static final class C56267b extends Lambda implements Function1<TodoReminder, String> {
        public static final C56267b INSTANCE = new C56267b();

        C56267b() {
            super(1);
        }

        public final String invoke(TodoReminder todoReminder) {
            StringBuilder sb = new StringBuilder();
            sb.append(todoReminder.time);
            sb.append(':');
            sb.append(todoReminder.is_all_day);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static final String m219605a(Todo todo) {
        Integer num;
        Integer num2;
        Integer num3;
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(todo, "$this$logInfo");
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("Todo{guid=");
            sb.append(todo.guid);
            sb.append(", summary=");
            String str3 = todo.summary;
            Boolean bool = null;
            if (str3 != null) {
                num = Integer.valueOf(str3.length());
            } else {
                num = null;
            }
            sb.append(num);
            sb.append(", description=");
            String str4 = todo.description;
            if (str4 != null) {
                num2 = Integer.valueOf(str4.length());
            } else {
                num2 = null;
            }
            sb.append(num2);
            sb.append(", doc_description=");
            String str5 = todo.doc_description;
            if (str5 != null) {
                num3 = Integer.valueOf(str5.length());
            } else {
                num3 = null;
            }
            sb.append(num3);
            sb.append(", block_id=");
            sb.append(todo.block_id);
            sb.append(", due_time=");
            Long l = todo.due_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "this.due_time");
            sb.append(l.longValue());
            sb.append(", is_all_day=");
            Boolean bool2 = todo.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "this.is_all_day");
            sb.append(bool2.booleanValue());
            sb.append(", completed_milli_time=");
            Long l2 = todo.completed_milli_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "this.completed_milli_time");
            sb.append(l2.longValue());
            sb.append(", deleted_milli_time=");
            Long l3 = todo.deleted_milli_time;
            Intrinsics.checkExpressionValueIsNotNull(l3, "this.deleted_milli_time");
            sb.append(l3.longValue());
            sb.append(", creator_id=");
            sb.append(todo.creator_id);
            sb.append(", create_milli_time=");
            Long l4 = todo.create_milli_time;
            Intrinsics.checkExpressionValueIsNotNull(l4, "this.create_milli_time");
            sb.append(l4.longValue());
            sb.append(", is_not_mine=");
            Boolean bool3 = todo.is_not_mine;
            Intrinsics.checkExpressionValueIsNotNull(bool3, "this.is_not_mine");
            sb.append(bool3.booleanValue());
            sb.append(", item_max_version=");
            sb.append(todo.item_max_version);
            sb.append(", assignees=");
            List<TodoAssignee> list = todo.assignees;
            if (list != null) {
                str = CollectionsKt.joinToString$default(list, null, null, null, 0, null, C56266a.INSTANCE, 31, null);
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", source=");
            sb.append(todo.source);
            sb.append(", reminders=");
            List<TodoReminder> list2 = todo.reminders;
            if (list2 != null) {
                str2 = CollectionsKt.joinToString$default(list2, null, null, null, 0, null, C56267b.INSTANCE, 31, null);
            } else {
                str2 = null;
            }
            sb.append(str2);
            sb.append(", self_permission=");
            TodoItemPermission todoItemPermission = todo.self_permission;
            if (todoItemPermission != null) {
                bool = todoItemPermission.is_editable;
            }
            sb.append(bool);
        } catch (Exception unused) {
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.append('}').toString()");
        return sb2;
    }
}
