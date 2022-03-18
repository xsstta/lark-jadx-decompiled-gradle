package com.ss.android.lark.todo.impl.features.common.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import com.bytedance.lark.pb.todo.v1.Commit;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoItemPermission;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.mainview.widget.CompleteImageSpan;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002'(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0004J\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ:\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ$\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper;", "", "()V", "TAG", "", "canCompleteByPermission", "", "targetTodo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "getAssigneeNameInMultiComplete", "", "assignees", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", "operationUserId", "getAssigneeNameOutMultiComplete", "getListItemCompleteType", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "creatorId", "displayCompleteTime", "", "getTodoMultiCompleteTime", "todo", "isEditableField", "editCommitKeys", "", "", "key", "Lcom/bytedance/lark/pb/todo/v1/Commit$Key;", "isMultiCompleteStrategy", "showActiveConfirmDialog", "", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$IMultiCompleteDialogListener;", "showCompleteConfirmDialog", "IMultiCompleteDialogListener", "MultiCompleteType", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MultiCompleteHelper {

    /* renamed from: a */
    public static final MultiCompleteHelper f139390a = new MultiCompleteHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "", "(Ljava/lang/String;I)V", "COMPLETE_USER", "COMPLETE_TODO_WITHOUT_DIALOG", "COMPLETE_TODO_WITH_DIALOG", "NOT_COMPLETE", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum MultiCompleteType {
        COMPLETE_USER,
        COMPLETE_TODO_WITHOUT_DIALOG,
        COMPLETE_TODO_WITH_DIALOG,
        NOT_COMPLETE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$IMultiCompleteDialogListener;", "", "onCancelBtnClicked", "", "onConfirmBtnClicked", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper$a */
    public interface IMultiCompleteDialogListener {
        /* renamed from: a */
        void mo191869a();

        /* renamed from: b */
        void mo191870b();
    }

    private MultiCompleteHelper() {
    }

    /* renamed from: a */
    public final boolean mo191984a(TodoSource todoSource) {
        if (!TodoDependencyHolder.f139242a.mo191731b().mo191934g() || todoSource == TodoSource.DOC) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo191986b(Todo todo) {
        Map<Integer, Boolean> map;
        Intrinsics.checkParameterIsNotNull(todo, "targetTodo");
        TodoItemPermission todoItemPermission = todo.self_permission;
        if (todoItemPermission == null || (map = todoItemPermission.can_edit_commit_keys) == null) {
            return false;
        }
        if (!mo191984a(todo.source)) {
            return m219761a(map, Commit.Key.TODO_COMPLETED_TIME);
        }
        if (m219761a(map, Commit.Key.TODO_COMPLETED_MILLI_TIME) || m219761a(map, Commit.Key.TODO_USERS_COMPLETED_MILLI_TIME)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final long mo191979a(Todo todo) {
        if (todo == null) {
            return 0;
        }
        if (!mo191984a(todo.source)) {
            Long l = todo.completed_milli_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "targetTodo.completed_milli_time");
            return l.longValue();
        }
        Long l2 = todo.display_completed_milli_time;
        Intrinsics.checkExpressionValueIsNotNull(l2, "targetTodo.display_completed_milli_time");
        return l2.longValue();
    }

    /* renamed from: a */
    public final CharSequence mo191981a(List<TodoAssignee> list) {
        int i;
        Intrinsics.checkParameterIsNotNull(list, "assignees");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (list.size() >= 5) {
            i = 3;
        } else {
            i = list.size();
        }
        int i2 = i - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(list.get(i3).name);
            sb.append(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Comma));
        }
        sb.append(list.get(i2).name);
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "result.toString()");
        return sb2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper$b */
    public static final class DialogInterface$OnClickListenerC56328b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMultiCompleteDialogListener f139391a;

        DialogInterface$OnClickListenerC56328b(IMultiCompleteDialogListener aVar) {
            this.f139391a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f139391a.mo191869a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper$c */
    public static final class DialogInterface$OnClickListenerC56329c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMultiCompleteDialogListener f139392a;

        DialogInterface$OnClickListenerC56329c(IMultiCompleteDialogListener aVar) {
            this.f139392a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f139392a.mo191870b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper$d */
    public static final class DialogInterface$OnClickListenerC56330d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMultiCompleteDialogListener f139393a;

        DialogInterface$OnClickListenerC56330d(IMultiCompleteDialogListener aVar) {
            this.f139393a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f139393a.mo191869a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper$e */
    public static final class DialogInterface$OnClickListenerC56331e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IMultiCompleteDialogListener f139394a;

        DialogInterface$OnClickListenerC56331e(IMultiCompleteDialogListener aVar) {
            this.f139394a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f139394a.mo191870b();
        }
    }

    /* renamed from: a */
    private final boolean m219761a(Map<Integer, Boolean> map, Commit.Key key) {
        Boolean bool;
        if (!map.containsKey(Integer.valueOf(key.getValue())) || (bool = map.get(Integer.valueOf(key.getValue()))) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: b */
    public final void mo191985b(Context context, IMultiCompleteDialogListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Todo_CollabTask_CompletedTask)).titleLineCount(2)).message(R.string.Todo_CollabTask_NotCompletedDialog)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Todo_CollabTask_ConfirmComplete, new DialogInterface$OnClickListenerC56330d(aVar))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Todo_CollabTask_CancelButton, new DialogInterface$OnClickListenerC56331e(aVar))).cancelOnTouchOutside(false)).show();
    }

    /* renamed from: a */
    public final CharSequence mo191982a(List<TodoAssignee> list, String str) {
        int i;
        int i2;
        boolean z;
        Long l;
        Intrinsics.checkParameterIsNotNull(list, "assignees");
        Intrinsics.checkParameterIsNotNull(str, "operationUserId");
        if (list.isEmpty()) {
            return "";
        }
        Context a = ResUtil.f139261a.mo191776a();
        if (a == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        List<TodoAssignee> list2 = list;
        ArrayList arrayList2 = new ArrayList();
        for (T t : list2) {
            if (Intrinsics.areEqual(t.assignee_id, str)) {
                arrayList2.add(t);
            }
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t2 = next;
            if ((!Intrinsics.areEqual(t2.assignee_id, str)) && (l = t2.completed_milli_time) != null && l.longValue() == 0) {
                i = 1;
            }
            if (i != 0) {
                arrayList3.add(next);
            }
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (T t3 : list2) {
            T t4 = t3;
            if (!(!Intrinsics.areEqual(t4.assignee_id, str)) || t4.completed_milli_time.longValue() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList4.add(t3);
            }
        }
        arrayList.addAll(arrayList4);
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() >= 5) {
            i2 = 3;
        } else {
            i2 = arrayList.size();
        }
        int i3 = i2 - 1;
        while (i < i3) {
            Object obj = arrayList.get(i);
            Intrinsics.checkExpressionValueIsNotNull(obj, "sortAssignees[i]");
            TodoAssignee todoAssignee = (TodoAssignee) obj;
            sb.append(todoAssignee.name);
            if (todoAssignee.completed_milli_time.longValue() > 0) {
                sb.append("complete_tag");
            }
            sb.append(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Comma));
            i++;
        }
        sb.append(((TodoAssignee) arrayList.get(i3)).name);
        if (((TodoAssignee) arrayList.get(i3)).completed_milli_time.longValue() > 0) {
            sb.append("complete_tag");
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "nameBuilder.toString()");
        String str2 = sb2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        Matcher matcher = Pattern.compile("complete_tag").matcher(str2);
        while (matcher.find()) {
            spannableStringBuilder.setSpan(new CompleteImageSpan(a, R.drawable.todo_svg_icon_yes_outlined), matcher.start(), matcher.end(), 33);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public final void mo191983a(Context context, IMultiCompleteDialogListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Todo_CollabTask_RestoreTask)).titleLineCount(2)).message(R.string.Todo_CollabTask_RestoreTaskDesc)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Todo_CollabTask_ComfirmRestore, new DialogInterface$OnClickListenerC56328b(aVar))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Todo_CollabTask_CancelButton, new DialogInterface$OnClickListenerC56329c(aVar))).cancelOnTouchOutside(false)).show();
    }

    /* renamed from: a */
    public final MultiCompleteType mo191980a(TodoSource todoSource, String str, long j, List<TodoAssignee> list, String str2) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "creatorId");
        Intrinsics.checkParameterIsNotNull(str2, "operationUserId");
        if (!mo191984a(todoSource)) {
            return MultiCompleteType.COMPLETE_TODO_WITHOUT_DIALOG;
        }
        boolean areEqual = Intrinsics.areEqual(str, str2);
        String str3 = null;
        boolean z3 = false;
        if (areEqual) {
            List<TodoAssignee> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return MultiCompleteType.COMPLETE_TODO_WITHOUT_DIALOG;
            }
            if (j <= 0) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    Long l = t2 != null ? t2.completed_milli_time : null;
                    if (l != null && l.longValue() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        arrayList.add(t);
                    }
                }
                list = arrayList;
            }
            if (list.size() == 1) {
                TodoAssignee todoAssignee = list.get(0);
                if (todoAssignee != null) {
                    str3 = todoAssignee.assignee_id;
                }
                if (Intrinsics.areEqual(str3, str2)) {
                    return MultiCompleteType.COMPLETE_USER;
                }
            }
            if (!list.isEmpty()) {
                return MultiCompleteType.COMPLETE_TODO_WITH_DIALOG;
            }
            return MultiCompleteType.COMPLETE_TODO_WITHOUT_DIALOG;
        }
        if (list != null) {
            List<TodoAssignee> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (Intrinsics.areEqual(next != null ? next.assignee_id : null, str2)) {
                        z3 = true;
                        break;
                    }
                }
            }
            if (z3) {
                return MultiCompleteType.COMPLETE_USER;
            }
        }
        return MultiCompleteType.NOT_COMPLETE;
    }
}
