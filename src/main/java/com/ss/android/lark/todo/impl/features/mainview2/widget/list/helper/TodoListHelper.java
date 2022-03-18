package com.ss.android.lark.todo.impl.features.mainview2.widget.list.helper;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.entity.EndTimeTextAttribute;
import com.ss.android.lark.todo.impl.features.common.helper.EndTimeHelper;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56478e;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarBean;
import com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData;
import com.ss.android.lark.todo.impl.utils.DayCompareUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\u0014\u001a\u00020\u00152\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\bH\u0002J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\fH\u0002J\u0018\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\nH\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J8\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180-2\u0006\u0010%\u001a\u00020&2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020+0-2\u0006\u0010/\u001a\u00020\b2\n\u00100\u001a\u000601j\u0002`2H\u0002JF\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020+0-2\u0006\u0010/\u001a\u00020\b2\n\u00100\u001a\u000601j\u0002`22\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u001cH\u0002JV\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020+0-2\u0006\u0010/\u001a\u00020\b2\n\u00100\u001a\u000601j\u0002`22\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\bH\u0002J\u0018\u00107\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&2\u0006\u00108\u001a\u00020\fH\u0002J,\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020+2\u0006\u0010/\u001a\u00020\b2\n\u00100\u001a\u000601j\u0002`22\u0006\u0010;\u001a\u00020\bH\u0002J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020=0-2\u0006\u0010*\u001a\u00020+H\u0002Jh\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180-2\b\u0010%\u001a\u0004\u0018\u00010&2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010-2\u0006\u0010/\u001a\u00020\b2\n\u00100\u001a\u000601j\u0002`22\u0006\u0010?\u001a\u00020@2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\bJ\u0010\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020+H\u0002J\u0010\u0010C\u001a\u00020\b2\u0006\u0010:\u001a\u00020+H\u0002J\u0010\u0010D\u001a\u00020\b2\u0006\u0010:\u001a\u00020+H\u0002J\u0016\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020GJ\u0016\u0010I\u001a\u00020\b2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020GJ\u001e\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020GJl\u0010L\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&28\u0010M\u001a4\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170Nj\u001e\u0012\u0004\u0012\u00020\f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019`O2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020+0-2\u0006\u0010/\u001a\u00020\b2\n\u00100\u001a\u000601j\u0002`2H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013XT¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/helper/TodoListHelper;", "", "()V", "ASSIGNEE_AVATAR_WIDTH", "", "ASSIGNEE_DISTANCE", "ASSIGNEE_WINDOW_MARGIN", "badgeIncludeAllOApi", "", "firstDayOfWeek", "", "operationUserId", "", "screenWidth", "getScreenWidth", "()I", "screenWidth$delegate", "Lkotlin/Lazy;", "weekMillions", "", "addSubList", "", "result", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData;", "Lkotlin/collections/ArrayList;", "subList", "titleStateMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", ShareHitPoint.f121869d, "stringResId", "needCountBadge", "getAssigneeAndTimeWidth", "assigneeNum", "endTimeStr", "getAssigneeWidth", "context", "Landroid/content/Context;", "num", "getBehindDeleteStatus", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;", "todo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "getCompletedSortList", "", "todoList", "isTwentyFourHour", "currentFilter", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "getDocsSortList", "getDueTimeSortList", "isShowBadgeOverdue", "isShowBadgeToday", "getEndTimeWidth", "textString", "getItemViewData", "targetTodo", "showBadge", "getShowAssigneeAvatar", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarBean;", "getTodoItemViewDataList", "sortType", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "isCanCheckable", "target", "isCountBadge", "isCreatorOrAssignee", "isInToday", "dueTimeGC", "Ljava/util/GregorianCalendar;", "currentGC", "isInWeek", "isOverDue", "isAllDay", "sortCompletedTodoGroup", "timeMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.b.b */
public final class TodoListHelper {

    /* renamed from: a */
    public static final TodoListHelper f140764a = new TodoListHelper();

    /* renamed from: b */
    private static int f140765b;

    /* renamed from: c */
    private static final String f140766c = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();

    /* renamed from: d */
    private static final Lazy f140767d = LazyKt.lazy(C57080a.INSTANCE);

    /* renamed from: e */
    private static final boolean f140768e = TodoDependencyHolder.f139242a.mo191731b().mo191936i();

    /* renamed from: a */
    private final int m221282a() {
        return ((Number) f140767d.getValue()).intValue();
    }

    private TodoListHelper() {
    }

    /* renamed from: a */
    public final List<TodoItemViewData> mo193768a(Context context, List<Todo> list, boolean z, TodoListView.Type type, TodoSortType todoSortType, HashMap<TodoItemViewData.TitleType, Boolean> hashMap, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(type, "currentFilter");
        Intrinsics.checkParameterIsNotNull(todoSortType, "sortType");
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty() || context == null) {
            return arrayList;
        }
        if (type == TodoListView.Type.FROM_DOC) {
            return m221287a(list, z, type, hashMap);
        }
        if (type == TodoListView.Type.COMPLETED) {
            return m221285a(context, list, z, type);
        }
        if (todoSortType != TodoSortType.CREATE_TIME) {
            return m221288a(list, z, type, hashMap, z2, z3);
        }
        for (Todo todo : list) {
            arrayList.add(m221284a(todo, z, type, z2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final List<TodoItemViewData> m221288a(List<Todo> list, boolean z, TodoListView.Type type, HashMap<TodoItemViewData.TitleType, Boolean> hashMap, boolean z2, boolean z3) {
        TimeZone timeZone;
        ArrayList arrayList;
        ArrayList<TodoItemViewData> arrayList2 = new ArrayList<>();
        ArrayList<TodoItemViewData> arrayList3 = new ArrayList<>();
        ArrayList<TodoItemViewData> arrayList4 = new ArrayList<>();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        for (Todo todo : list) {
            Boolean bool = todo.is_all_day;
            long longValue = todo.due_time.longValue() * ((long) 1000);
            Boolean bool2 = todo.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "todo.is_all_day");
            if (bool2.booleanValue()) {
                timeZone = TimeZone.getTimeZone("UTC");
            } else {
                timeZone = TimeZone.getDefault();
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setTimeInMillis(longValue);
            if (longValue <= 0) {
                arrayList6.add(m221284a(todo, z, type, z2));
            } else {
                Intrinsics.checkExpressionValueIsNotNull(bool, "isAllDay");
                if (mo193770a(bool.booleanValue(), gregorianCalendar2, gregorianCalendar)) {
                    arrayList3.add(m221284a(todo, z, type, z2));
                } else if (mo193769a(gregorianCalendar2, gregorianCalendar)) {
                    arrayList4.add(m221284a(todo, z, type, z2));
                } else {
                    if (mo193771b(gregorianCalendar2, gregorianCalendar)) {
                        arrayList = arrayList5;
                        arrayList.add(m221284a(todo, z, type, z2));
                    } else {
                        arrayList = arrayList5;
                        arrayList6.add(m221284a(todo, z, type, z2));
                    }
                    arrayList5 = arrayList;
                    arrayList2 = arrayList2;
                }
            }
            arrayList = arrayList5;
            arrayList5 = arrayList;
            arrayList2 = arrayList2;
        }
        m221291a(arrayList2, arrayList3, hashMap, TodoItemViewData.TitleType.OVER_DUE, R.string.Todo_Menu_Overdue, type == TodoListView.Type.ALL && z2);
        m221291a(arrayList2, arrayList4, hashMap, TodoItemViewData.TitleType.TODAY, R.string.Todo_Menu_Today, type == TodoListView.Type.ALL && z3);
        m221290a(this, arrayList2, arrayList5, hashMap, TodoItemViewData.TitleType.IN_WEEK, R.string.Todo_Menu_Next7Days, false, 32, null);
        m221290a(this, arrayList2, arrayList6, hashMap, TodoItemViewData.TitleType.OTHER, R.string.Todo_Menu_Later, false, 32, null);
        return arrayList2;
    }

    /* renamed from: a */
    static /* synthetic */ void m221290a(TodoListHelper bVar, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap, TodoItemViewData.TitleType titleType, int i, boolean z, int i2, Object obj) {
        bVar.m221291a(arrayList, arrayList2, hashMap, titleType, i, (i2 & 32) != 0 ? false : z);
    }

    /* renamed from: a */
    private final void m221291a(ArrayList<TodoItemViewData> arrayList, ArrayList<TodoItemViewData> arrayList2, HashMap<TodoItemViewData.TitleType, Boolean> hashMap, TodoItemViewData.TitleType titleType, int i, boolean z) {
        Boolean bool;
        ArrayList<TodoItemViewData> arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            if (hashMap == null || (bool = hashMap.get(titleType)) == null) {
                bool = true;
            }
            Intrinsics.checkExpressionValueIsNotNull(bool, "titleStateMap?.get(type) ?: true");
            boolean booleanValue = bool.booleanValue();
            TodoItemViewData todoItemViewData = new TodoItemViewData(null, true, new TodoItemViewData.TitleViewData(titleType, ResUtil.f139261a.mo191781c(i), arrayList2.size(), booleanValue, 0, 16, null), null, null, null, null, null, null, null, 1017, null);
            if (z) {
                TodoItemViewData.TitleViewData c = todoItemViewData.mo193837c();
                ArrayList arrayList4 = new ArrayList();
                for (T t : arrayList2) {
                    if (t.mo193842g().mo193881d()) {
                        arrayList4.add(t);
                    }
                }
                c.mo193887a(arrayList4.size());
            }
            arrayList.add(todoItemViewData);
            if (booleanValue) {
                ArrayList<TodoItemViewData> arrayList5 = arrayList2;
                ((TodoItemViewData) CollectionsKt.first((List) arrayList5)).mo193845i().mo193866c(true);
                ((TodoItemViewData) CollectionsKt.last((List) arrayList5)).mo193845i().mo193868d(true);
                arrayList.addAll(arrayList3);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo193770a(boolean z, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "dueTimeGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "currentGC");
        if (!z) {
            return gregorianCalendar.getTimeInMillis() < gregorianCalendar2.getTimeInMillis();
        }
        if (DayCompareUtil.f139259a.mo191764a(gregorianCalendar, gregorianCalendar2) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo193769a(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "dueTimeGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "currentGC");
        return DayCompareUtil.f139259a.mo191764a(gregorianCalendar, gregorianCalendar2) == 0;
    }

    /* renamed from: a */
    private final void m221289a(Context context, LinkedHashMap<String, ArrayList<TodoItemViewData>> linkedHashMap, List<Todo> list, boolean z, TodoListView.Type type) {
        String str;
        String c = ResUtil.f139261a.mo191781c(R.string.Todo_Common_ThisWeek);
        String c2 = ResUtil.f139261a.mo191781c(R.string.Todo_Common_LastWeek);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setFirstDayOfWeek(f140765b);
        gregorianCalendar.set(7, f140765b);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        for (Todo todo : list) {
            long a = MultiCompleteHelper.f139390a.mo191979a(todo);
            if (a >= gregorianCalendar.getTimeInMillis()) {
                str = c;
            } else if (gregorianCalendar.getTimeInMillis() - a < 604800000) {
                str = c2;
            } else {
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                gregorianCalendar2.setTime(new Date(a));
                Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
                TimeZone timeZone = TimeZone.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
                String id = timeZone.getID();
                Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
                aVar.mo191595a(id);
                aVar.mo191591a(DatePreciseness.MONTH);
                aVar.mo191592a(DisplayPattern.ABSOLUTE);
                if (gregorianCalendar2.get(1) == gregorianCalendar3.get(1)) {
                    aVar.mo191593a(LengthType.SHORT);
                } else {
                    aVar.mo191593a(LengthType.LONG);
                }
                str = TimeFormatUtils.m219289e(context, new Date(a), aVar);
            }
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, new ArrayList<>());
            }
            ArrayList<TodoItemViewData> arrayList = linkedHashMap.get(str);
            if (arrayList != null) {
                arrayList.add(m221284a(todo, z, type, false));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.b.b$a */
    static final class C57080a extends Lambda implements Function0<Integer> {
        public static final C57080a INSTANCE = new C57080a();

        C57080a() {
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

    static {
        int i;
        if (TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145413c()) {
            i = 1;
        } else {
            i = 2;
        }
        f140765b = i;
    }

    /* renamed from: b */
    private final boolean m221292b(Todo todo) {
        return MultiCompleteHelper.f139390a.mo191986b(todo);
    }

    /* renamed from: c */
    private final boolean m221293c(Todo todo) {
        if (todo.source != TodoSource.OAPI) {
            return m221294d(todo);
        }
        if (!f140768e) {
            return MultiCompleteHelper.f139390a.mo191986b(todo);
        }
        if (MultiCompleteHelper.f139390a.mo191986b(todo) || m221294d(todo)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m221294d(Todo todo) {
        ArrayList arrayList = new ArrayList();
        List<TodoAssignee> list = todo.assignees;
        Intrinsics.checkExpressionValueIsNotNull(list, "targetTodo.assignees");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().assignee_id);
        }
        arrayList.add(todo.creator_id);
        return arrayList.contains(TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a());
    }

    /* renamed from: e */
    private final TodoItemViewData.BehindDeleteStatus m221295e(Todo todo) {
        String a = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        if (TextUtils.equals(todo.creator_id, a) && todo.source != TodoSource.DOC) {
            return TodoItemViewData.BehindDeleteStatus.DELETE;
        }
        List<TodoAssignee> list = todo.assignees;
        Intrinsics.checkExpressionValueIsNotNull(list, "todo.assignees");
        List<TodoAssignee> list2 = list;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(it.next().assignee_id, a)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            return TodoItemViewData.BehindDeleteStatus.QUIT;
        }
        return TodoItemViewData.BehindDeleteStatus.UNFOLLOW;
    }

    /* renamed from: a */
    private final List<AssigneeAvatarBean> m221286a(Todo todo) {
        boolean z;
        List<TodoAssignee> arrayList = new ArrayList();
        List<TodoAssignee> list = todo.assignees;
        if (list != null) {
            for (T t : list) {
                if (t.completed_milli_time.longValue() <= 0) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    arrayList.add(t);
                }
            }
        }
        List<TodoAssignee> list2 = todo.assignees;
        if (list2 != null) {
            for (T t2 : list2) {
                if (t2.completed_milli_time.longValue() > 0) {
                    Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                    arrayList.add(t2);
                }
            }
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(((TodoAssignee) it.next()).assignee_id, f140766c)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.add(0, (TodoAssignee) arrayList.remove(i));
        }
        if (todo.assignees.size() > 4) {
            arrayList = arrayList.subList(0, 4);
        }
        ArrayList arrayList2 = new ArrayList();
        for (TodoAssignee todoAssignee : arrayList) {
            String str = todoAssignee.assignee_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.assignee_id");
            String str2 = todoAssignee.avatar_key;
            Intrinsics.checkExpressionValueIsNotNull(str2, "it.avatar_key");
            if (todoAssignee.completed_milli_time.longValue() <= 0 || !MultiCompleteHelper.f139390a.mo191984a(todo.source)) {
                z = false;
            } else {
                z = true;
            }
            arrayList2.add(new AssigneeAvatarBean(str, str2, z));
        }
        return arrayList2;
    }

    /* renamed from: a */
    private final float m221280a(int i, String str) {
        Context a = ResUtil.f139261a.mo191776a();
        if (a == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        TodoListHelper bVar = f140764a;
        return ((float) bVar.m221283a(a, i)) + bVar.m221281a(a, str) + ((float) UIUtils.dp2px(a, 18.0f));
    }

    /* renamed from: b */
    public final boolean mo193771b(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "dueTimeGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "currentGC");
        int a = DayCompareUtil.f139259a.mo191764a(gregorianCalendar, gregorianCalendar2);
        if (1 <= a && 7 >= a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final float m221281a(Context context, String str) {
        Paint paint = new Paint();
        paint.setTextSize((float) context.getResources().getDimensionPixelSize(R.dimen.dp_14));
        return paint.measureText(str) + ((float) UIUtils.dp2px(context, 20.0f));
    }

    /* renamed from: a */
    private final int m221283a(Context context, int i) {
        if (i > 4) {
            i = 5;
        }
        return UIUtils.dp2px(context, (((float) i) * 20.0f) + (((float) (i - 1)) * 6.0f) + 88.0f);
    }

    /* renamed from: a */
    private final List<TodoItemViewData> m221285a(Context context, List<Todo> list, boolean z, TodoListView.Type type) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, ArrayList<TodoItemViewData>> linkedHashMap = new LinkedHashMap<>();
        m221289a(context, linkedHashMap, list, z, type);
        for (Iterator<Map.Entry<String, ArrayList<TodoItemViewData>>> it = linkedHashMap.entrySet().iterator(); it.hasNext(); it = it) {
            Map.Entry<String, ArrayList<TodoItemViewData>> next = it.next();
            arrayList.add(new TodoItemViewData(null, true, new TodoItemViewData.TitleViewData(TodoItemViewData.TitleType.COMPLETED, next.getKey(), 0, true, 0, 20, null), null, null, null, null, null, null, null, 1017, null));
            if (!next.getValue().isEmpty()) {
                ((TodoItemViewData) CollectionsKt.first((List) next.getValue())).mo193845i().mo193866c(true);
                ((TodoItemViewData) CollectionsKt.last((List) next.getValue())).mo193845i().mo193868d(true);
                arrayList.addAll(next.getValue());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final TodoItemViewData m221284a(Todo todo, boolean z, TodoListView.Type type, boolean z2) {
        EndTimeTextAttribute endTimeTextAttribute;
        int endTimeColor;
        boolean z3;
        boolean z4;
        CustomComplete.Action action;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        boolean z8;
        String str2;
        long a = MultiCompleteHelper.f139390a.mo191979a(todo);
        String str3 = "";
        int i = (a > 0 ? 1 : (a == 0 ? 0 : -1));
        if (i > 0) {
            endTimeTextAttribute = EndTimeHelper.m219791a(EndTimeHelper.f139399a, ResUtil.f139261a.mo191776a(), a, false, z, false, 16, null);
            if (endTimeTextAttribute.getEndTimeStr().length() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                str2 = str3;
            } else {
                str2 = ResUtil.f139261a.mo191778a(R.string.Todo_Common_DateCompleted, "Time", endTimeTextAttribute.getEndTimeStr());
            }
            endTimeTextAttribute.setEndTimeStr(str2);
        } else {
            EndTimeHelper bVar = EndTimeHelper.f139399a;
            Context a2 = ResUtil.f139261a.mo191776a();
            long longValue = todo.due_time.longValue() * ((long) 1000);
            Boolean bool = todo.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool, "targetTodo.is_all_day");
            endTimeTextAttribute = EndTimeHelper.m219791a(bVar, a2, longValue, bool.booleanValue(), z, false, 16, null);
            if (endTimeTextAttribute.getEndTimeStr().length() == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                str = str3;
            } else {
                str = ResUtil.f139261a.mo191778a(R.string.Todo_Task_TimeDue, "Time", endTimeTextAttribute.getEndTimeStr());
            }
            endTimeTextAttribute.setEndTimeStr(str);
        }
        boolean c = m221293c(todo);
        if (i > 0) {
            endTimeColor = ResUtil.f139261a.mo191775a(R.color.primary_pri_500);
        } else if (!z2 || c) {
            endTimeColor = endTimeTextAttribute.getEndTimeColor();
        } else {
            endTimeColor = ResUtil.f139261a.mo191775a(R.color.text_placeholder);
        }
        RichText a3 = C56478e.m220168a(todo.rich_summary);
        if (C59035h.m229210a(a3)) {
            a3 = C59029c.m229161b(ResUtil.f139261a.mo191781c(R.string.Todo_Task_NoTitlePlaceholder));
        }
        int size = todo.assignees.size();
        if (size > 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("+");
            sb.append(size - 4);
            str3 = sb.toString();
        }
        float a4 = m221280a(todo.assignees.size(), endTimeTextAttribute.getEndTimeStr());
        Intrinsics.checkExpressionValueIsNotNull(a3, "displayRichText");
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        TodoItemViewData.SummaryViewData dVar = new TodoItemViewData.SummaryViewData(a3, z3, todo.rich_summary);
        if (i > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean b = m221292b(todo);
        TodoSource todoSource = todo.source;
        Intrinsics.checkExpressionValueIsNotNull(todoSource, "targetTodo.source");
        CustomComplete customComplete = todo.custom_complete;
        if (customComplete != null) {
            action = customComplete.f175433android;
        } else {
            action = null;
        }
        TodoItemViewData.CheckBoxViewData bVar2 = new TodoItemViewData.CheckBoxViewData(z4, b, todoSource, action);
        boolean isNotEmpty = CollectionUtils.isNotEmpty(todo.assignees);
        if (size > 4) {
            z5 = true;
        } else {
            z5 = false;
        }
        List<AssigneeAvatarBean> a5 = m221286a(todo);
        MultiCompleteHelper multiCompleteHelper = MultiCompleteHelper.f139390a;
        TodoSource todoSource2 = todo.source;
        String str4 = todo.creator_id;
        Intrinsics.checkExpressionValueIsNotNull(str4, "targetTodo.creator_id");
        Long l = todo.display_completed_milli_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "targetTodo.display_completed_milli_time");
        TodoItemViewData.AssigneeViewData aVar = new TodoItemViewData.AssigneeViewData(isNotEmpty, z5, str3, a5, multiCompleteHelper.mo191980a(todoSource2, str4, l.longValue(), todo.assignees, f140766c));
        boolean z9 = !TextUtils.isEmpty(endTimeTextAttribute.getEndTimeStr());
        String endTimeStr = endTimeTextAttribute.getEndTimeStr();
        if (a4 >= ((float) m221282a())) {
            z6 = true;
        } else {
            z6 = false;
        }
        TodoItemViewData.TimeViewData eVar = new TodoItemViewData.TimeViewData(z9, endTimeStr, endTimeColor, c, z6);
        String str5 = todo.guid;
        Intrinsics.checkExpressionValueIsNotNull(str5, "targetTodo.guid");
        return new TodoItemViewData(str5, false, null, dVar, bVar2, aVar, eVar, m221295e(todo), todo.source, null, 516, null);
    }

    /* renamed from: a */
    private final List<TodoItemViewData> m221287a(List<Todo> list, boolean z, TodoListView.Type type, HashMap<TodoItemViewData.TitleType, Boolean> hashMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Todo todo : list) {
            if (todo.completed_milli_time.longValue() > 0) {
                arrayList3.add(m221284a(todo, z, type, false));
            } else {
                arrayList2.add(m221284a(todo, z, type, false));
            }
        }
        m221290a(this, arrayList, arrayList2, hashMap, TodoItemViewData.TitleType.DOING, R.string.Todo_CollabTask_IncompleteTitle, false, 32, null);
        m221290a(this, arrayList, arrayList3, hashMap, TodoItemViewData.TitleType.DONE, R.string.Todo_CollabTask_CompletedTitle, false, 32, null);
        return arrayList;
    }
}
