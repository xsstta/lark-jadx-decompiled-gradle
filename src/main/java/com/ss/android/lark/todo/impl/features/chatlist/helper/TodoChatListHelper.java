package com.ss.android.lark.todo.impl.features.chatlist.helper;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.todo.v1.ChatTodoInfo;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoItemPermission;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.entity.EndTimeTextAttribute;
import com.ss.android.lark.todo.impl.features.common.helper.EndTimeHelper;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56478e;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoChatItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u001e\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00162\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\nH\u0002J\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\b\u0010&\u001a\u0004\u0018\u00010'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010/\u001a\u00020\u00182\"\u00100\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001801j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0018`22\f\u00103\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0018J(\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020,2\u0006\u0010/\u001a\u00020\u00182\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0018H\u0002J\u0018\u00108\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'2\u0006\u00109\u001a\u00020\bH\u0002J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020\"0\u00162\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0016H\u0002J\u0010\u0010;\u001a\u00020\u00182\u0006\u0010<\u001a\u00020=H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006>"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/chatlist/helper/TodoChatListHelper;", "", "()V", "ASSIGNEE_AVATAR_WIDTH", "", "ASSIGNEE_DISTANCE", "ASSIGNEE_WINDOW_MARGIN", "operationUserId", "", "screenWidth", "", "getScreenWidth", "()I", "screenWidth$delegate", "Lkotlin/Lazy;", "addSubList", "", "result", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "Lkotlin/collections/ArrayList;", "subList", "", "isExpand", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChatListTitleType;", "stringResId", "getAssigneeAndTimeWidth", "assigneeNum", "endTimeStr", "getAssigneeNameStr", "", "assignees", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", ShareHitPoint.f121868c, "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "getAssigneeWidth", "context", "Landroid/content/Context;", "num", "getChatTodoDisplayItems", "assignToMeList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/lark/pb/todo/v1/ChatTodoInfo;", "assignToOtherList", "completedList", "isTwentyFourHour", "midTitleState", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "addedTodoDisplayItem", "chatId", "chatIsThread", "getDisplayItem", "chatTodoInfo", "getEndTimeWidth", "textString", "getSortAssignees", "isCanCheckable", "target", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.chatlist.b.a */
public final class TodoChatListHelper {

    /* renamed from: a */
    public static final TodoChatListHelper f139310a = new TodoChatListHelper();

    /* renamed from: b */
    private static final String f139311b = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();

    /* renamed from: c */
    private static final Lazy f139312c = LazyKt.lazy(C56281a.INSTANCE);

    /* renamed from: a */
    private final int m219670a() {
        return ((Number) f139312c.getValue()).intValue();
    }

    private TodoChatListHelper() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x006f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem> mo191825a(android.content.Context r18, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.lark.pb.todo.v1.ChatTodoInfo> r19, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.lark.pb.todo.v1.ChatTodoInfo> r20, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.lark.pb.todo.v1.ChatTodoInfo> r21, boolean r22, java.util.HashMap<com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem.ChatListTitleType, java.lang.Boolean> r23, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.lark.pb.todo.v1.ChatTodoInfo> r24, java.lang.String r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 556
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.chatlist.helper.TodoChatListHelper.mo191825a(android.content.Context, java.util.concurrent.CopyOnWriteArrayList, java.util.concurrent.CopyOnWriteArrayList, java.util.concurrent.CopyOnWriteArrayList, boolean, java.util.HashMap, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, boolean):java.util.List");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.chatlist.b.a$a */
    static final class C56281a extends Lambda implements Function0<Integer> {
        public static final C56281a INSTANCE = new C56281a();

        C56281a() {
            super(0);
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Context a = ResUtil.f139261a.mo191776a();
            if (a != null) {
                return DeviceUtils.getScreenWidth(a);
            }
            return 0;
        }
    }

    /* renamed from: a */
    private final boolean m219676a(Todo todo) {
        return MultiCompleteHelper.f139390a.mo191986b(todo);
    }

    /* renamed from: a */
    private final List<TodoAssignee> m219674a(List<TodoAssignee> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (T t : list) {
                if (t.completed_milli_time.longValue() <= 0) {
                    arrayList.add(t);
                }
            }
        }
        if (list != null) {
            for (T t2 : list) {
                if (t2.completed_milli_time.longValue() > 0) {
                    arrayList.add(t2);
                }
            }
        }
        int i = -1;
        if (list != null) {
            Iterator<TodoAssignee> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (Intrinsics.areEqual(it.next().assignee_id, f139311b)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (i >= 0) {
            arrayList.add(0, (TodoAssignee) arrayList.remove(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final float m219668a(int i, String str) {
        Context a = ResUtil.f139261a.mo191776a();
        if (a == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        TodoChatListHelper aVar = f139310a;
        return ((float) aVar.m219671a(a, i)) + aVar.m219669a(a, str) + ((float) UIUtils.dp2px(a, 18.0f));
    }

    /* renamed from: a */
    private final float m219669a(Context context, String str) {
        Paint paint = new Paint();
        paint.setTextSize((float) context.getResources().getDimensionPixelSize(R.dimen.dp_14));
        return paint.measureText(str) + ((float) UIUtils.dp2px(context, 20.0f));
    }

    /* renamed from: a */
    private final int m219671a(Context context, int i) {
        if (i > 4) {
            i = 5;
        }
        return UIUtils.dp2px(context, (((float) i) * 20.0f) + (((float) (i - 1)) * 6.0f) + 88.0f);
    }

    /* renamed from: a */
    private final CharSequence m219673a(List<TodoAssignee> list, TodoSource todoSource) {
        if (!MultiCompleteHelper.f139390a.mo191984a(todoSource)) {
            return MultiCompleteHelper.f139390a.mo191981a(list);
        }
        return MultiCompleteHelper.f139390a.mo191982a(list, f139311b);
    }

    /* renamed from: a */
    private final TodoDisplayItem m219672a(ChatTodoInfo chatTodoInfo, boolean z, String str, boolean z2) {
        EndTimeTextAttribute endTimeTextAttribute;
        int i;
        boolean z3;
        CharSequence charSequence;
        boolean z4;
        CustomComplete.Action action;
        boolean z5;
        boolean z6;
        String str2;
        int i2;
        boolean z7;
        Boolean bool;
        String str3;
        boolean z8;
        String str4;
        boolean z9;
        String str5;
        Todo todo = chatTodoInfo.todo;
        if (todo == null) {
            return new TodoDisplayItem(null, null, null, false, null, 0, 0, false, null, 0, 0, null, null, false, false, null, false, null, false, null, null, false, null, 0, 0, null, false, false, false, false, null, false, -1, null);
        }
        List<TodoAssignee> list = todo.assignees;
        Intrinsics.checkExpressionValueIsNotNull(list, "targetTodo.assignees");
        TodoSource todoSource = todo.source;
        Intrinsics.checkExpressionValueIsNotNull(todoSource, "targetTodo.source");
        CharSequence a = m219673a(list, todoSource);
        long a2 = MultiCompleteHelper.f139390a.mo191979a(todo);
        String str6 = "";
        int i3 = (a2 > 0 ? 1 : (a2 == 0 ? 0 : -1));
        if (i3 > 0) {
            endTimeTextAttribute = EndTimeHelper.m219791a(EndTimeHelper.f139399a, ResUtil.f139261a.mo191776a(), a2, false, z, false, 16, null);
            if (endTimeTextAttribute.getEndTimeStr().length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                str5 = str6;
            } else {
                str5 = ResUtil.f139261a.mo191778a(R.string.Todo_Common_DateCompleted, "Time", endTimeTextAttribute.getEndTimeStr());
            }
            endTimeTextAttribute.setEndTimeStr(str5);
        } else {
            EndTimeHelper bVar = EndTimeHelper.f139399a;
            Context a3 = ResUtil.f139261a.mo191776a();
            long longValue = ((long) 1000) * todo.due_time.longValue();
            Boolean bool2 = todo.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "targetTodo.is_all_day");
            endTimeTextAttribute = EndTimeHelper.m219791a(bVar, a3, longValue, bool2.booleanValue(), z, false, 16, null);
            if (endTimeTextAttribute.getEndTimeStr().length() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                str4 = str6;
            } else {
                str4 = ResUtil.f139261a.mo191778a(R.string.Todo_Task_TimeDue, "Time", endTimeTextAttribute.getEndTimeStr());
            }
            endTimeTextAttribute.setEndTimeStr(str4);
        }
        if (i3 > 0) {
            i = ResUtil.f139261a.mo191775a(R.color.primary_pri_500);
        } else {
            i = endTimeTextAttribute.getEndTimeColor();
        }
        RichText a4 = C56478e.m220168a(todo.rich_summary);
        if (C59035h.m229210a(a4)) {
            a4 = C59029c.m229161b(ResUtil.f139261a.mo191781c(R.string.Todo_Task_NoTitlePlaceholder));
        }
        HashMap hashMap = new HashMap();
        String str7 = chatTodoInfo.message_id;
        Intrinsics.checkExpressionValueIsNotNull(str7, "chatTodoInfo.message_id");
        if (str7.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            HashMap hashMap2 = hashMap;
            Chatter chatter = chatTodoInfo.sender;
            if (chatter == null || (str3 = chatter.localized_name) == null) {
                str3 = str6;
            }
            hashMap2.put("sender", str3);
            Context a5 = ResUtil.f139261a.mo191776a();
            if (a5 != null) {
                charSequence = a;
                String g = TimeFormatUtils.m219292g(a5, new Date(((long) 1000) * chatTodoInfo.send_time.longValue()), new Options(null, DisplayPattern.RELATIVE, LengthType.SHORT, null, TimePreciseness.MINUTE, false, !z, false, false, 425, null));
                if (g != null) {
                    str6 = g;
                }
            } else {
                charSequence = a;
            }
            hashMap2.put("date", str6);
            str6 = ResUtil.f139261a.mo191779a(R.string.Todo_Chat_SenderSentAtTimeDesc, hashMap2);
        } else {
            charSequence = a;
        }
        float a6 = m219668a(todo.assignees.size(), endTimeTextAttribute.getEndTimeStr());
        String str8 = todo.guid;
        Intrinsics.checkExpressionValueIsNotNull(str8, "targetTodo.guid");
        Intrinsics.checkExpressionValueIsNotNull(a4, "displayRichText");
        if (i3 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int size = todo.assignees.size();
        MultiCompleteHelper multiCompleteHelper = MultiCompleteHelper.f139390a;
        TodoSource todoSource2 = todo.source;
        String str9 = todo.creator_id;
        Intrinsics.checkExpressionValueIsNotNull(str9, "targetTodo.creator_id");
        Long l = todo.display_completed_milli_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "targetTodo.display_completed_milli_time");
        MultiCompleteHelper.MultiCompleteType a7 = multiCompleteHelper.mo191980a(todoSource2, str9, l.longValue(), todo.assignees, f139311b);
        TodoSource todoSource3 = todo.source;
        CustomComplete customComplete = todo.custom_complete;
        if (customComplete != null) {
            action = customComplete.f175433android;
        } else {
            action = null;
        }
        long longValue2 = ((long) 1000) * todo.due_time.longValue();
        Boolean bool3 = todo.is_all_day;
        Intrinsics.checkExpressionValueIsNotNull(bool3, "targetTodo.is_all_day");
        boolean booleanValue = bool3.booleanValue();
        String endTimeStr = endTimeTextAttribute.getEndTimeStr();
        Long l2 = todo.create_milli_time;
        Intrinsics.checkExpressionValueIsNotNull(l2, "targetTodo.create_milli_time");
        long longValue3 = l2.longValue();
        boolean a8 = m219676a(todo);
        TodoItemPermission todoItemPermission = todo.self_permission;
        if (todoItemPermission == null || (bool = todoItemPermission.is_editable) == null) {
            z5 = false;
        } else {
            z5 = bool.booleanValue();
        }
        String str10 = chatTodoInfo.message_id;
        Intrinsics.checkExpressionValueIsNotNull(str10, "chatTodoInfo.message_id");
        if (str10.length() > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z2) {
            str2 = chatTodoInfo.message_id;
        } else {
            str2 = str;
        }
        Intrinsics.checkExpressionValueIsNotNull(str2, "if (chatIsThread) chatTo…fo.message_id else chatId");
        Integer num = chatTodoInfo.message_position;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        TodoChatItem aVar = new TodoChatItem(z6, str6, str2, z2, i2);
        List<TodoAssignee> a9 = m219674a(todo.assignees);
        if (a6 >= ((float) m219670a())) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new TodoDisplayItem(str8, a4, null, z4, charSequence, size, longValue2, booleanValue, endTimeStr, i, longValue3, a7, action, a8, false, null, z5, aVar, false, null, null, false, null, 0, 0, todoSource3, false, false, false, false, a9, z7, 1039974404, null);
    }

    /* renamed from: a */
    private final void m219675a(ArrayList<TodoDisplayItem> arrayList, List<TodoDisplayItem> list, boolean z, TodoDisplayItem.ChatListTitleType chatListTitleType, int i) {
        List<TodoDisplayItem> list2 = list;
        if (!list2.isEmpty()) {
            arrayList.add(new TodoDisplayItem(null, null, null, false, null, 0, 0, false, null, 0, 0, null, null, false, false, null, false, null, true, null, chatListTitleType, z, ResUtil.f139261a.mo191781c(i), list.size(), 0, null, false, false, false, false, null, false, -15990785, null));
            if (z) {
                ((TodoDisplayItem) CollectionsKt.first((List) list)).mo193166d(true);
                ((TodoDisplayItem) CollectionsKt.last((List) list)).mo193164c(true);
                arrayList.addAll(list2);
            }
        }
    }
}
