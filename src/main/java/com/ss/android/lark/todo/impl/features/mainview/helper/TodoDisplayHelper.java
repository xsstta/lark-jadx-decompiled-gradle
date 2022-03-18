package com.ss.android.lark.todo.impl.features.mainview.helper;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoAssignee;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
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
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoDisplayItem;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import com.ss.android.lark.todo.impl.features.mainview.widget.sort.SortDialog;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\u0014\u001a\u00020\u00152\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\bH\u0002J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\fH\u0002J\u001e\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\nH\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J4\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180'2\u0006\u0010,\u001a\u00020-2\f\u00104\u001a\b\u0012\u0004\u0012\u0002020'2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u000207H\u0002J(\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u0002022\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u0002072\u0006\u0010:\u001a\u00020\bH\u0002JB\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00180'2\f\u00104\u001a\b\u0012\u0004\u0012\u0002020'2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u0002072\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u001cH\u0002JR\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00180'2\f\u00104\u001a\b\u0012\u0004\u0012\u0002020'2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u0002072\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\bH\u0002J\u0018\u0010?\u001a\u00020\u00042\u0006\u0010,\u001a\u00020-2\u0006\u0010@\u001a\u00020\fH\u0002J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u00020(0'2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0002Jd\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180'2\b\u0010,\u001a\u0004\u0018\u00010-2\u000e\u00104\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010'2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u0002072\u0006\u0010C\u001a\u00020D2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\bJ\u0010\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u000202H\u0002J\u0010\u0010G\u001a\u00020\b2\u0006\u00109\u001a\u000202H\u0002J\u0010\u0010H\u001a\u00020\b2\u0006\u00109\u001a\u000202H\u0002J\u0016\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020KJ\u0016\u0010M\u001a\u00020\b2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020KJ\u001e\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020KJh\u0010P\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-28\u0010Q\u001a4\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170Rj\u001e\u0012\u0004\u0012\u00020\f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019`S2\f\u00104\u001a\b\u0012\u0004\u0012\u0002020'2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u000207H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013XT¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/helper/TodoDisplayHelper;", "", "()V", "ASSIGNEE_AVATAR_WIDTH", "", "ASSIGNEE_DISTANCE", "ASSIGNEE_WINDOW_MARGIN", "badgeIncludeAllOApi", "", "firstDayOfWeek", "", "operationUserId", "", "screenWidth", "getScreenWidth", "()I", "screenWidth$delegate", "Lkotlin/Lazy;", "weekMillions", "", "addSubList", "", "result", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem;", "Lkotlin/collections/ArrayList;", "subList", "titleStateMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$TitleType;", ShareHitPoint.f121869d, "stringResId", "needCountBadge", "getAssigneeAndTimeWidth", "assigneeNum", "endTimeStr", "getAssigneeNameStr", "", "assignees", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAssignee;", ShareHitPoint.f121868c, "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "getAssigneeWidth", "context", "Landroid/content/Context;", "num", "getChangeStatus", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoDisplayItem$ChangeStatus;", "todo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "getCompletedSortList", "todoList", "isTwentyFourHour", "currentFilter", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "getDisplayItem", "targetTodo", "showBadge", "getDocsSortList", "getDueTimeSortList", "isShowBadgeOverdue", "isShowBadgeToday", "getEndTimeWidth", "textString", "getSortAssignees", "getTodoDisplayItems", "sortType", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/sort/SortDialog$SortType;", "isCanCheckable", "target", "isCountBadge", "isCreatorOrAssignee", "isInToday", "dueTimeGC", "Ljava/util/GregorianCalendar;", "currentGC", "isInWeek", "isOverDue", "isAllDay", "sortCompletedTodoGroup", "timeMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.b.a */
public final class TodoDisplayHelper {

    /* renamed from: a */
    public static final TodoDisplayHelper f140267a = new TodoDisplayHelper();

    /* renamed from: b */
    private static int f140268b;

    /* renamed from: c */
    private static final boolean f140269c = TodoDependencyHolder.f139242a.mo191731b().mo191936i();

    /* renamed from: d */
    private static final String f140270d = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();

    /* renamed from: e */
    private static final Lazy f140271e = LazyKt.lazy(C56809a.INSTANCE);

    /* renamed from: a */
    private final int m220757a() {
        return ((Number) f140271e.getValue()).intValue();
    }

    private TodoDisplayHelper() {
    }

    /* renamed from: a */
    public final List<TodoDisplayItem> mo193134a(Context context, List<Todo> list, boolean z, TodoFilterType todoFilterType, SortDialog.SortType sortType, HashMap<TodoDisplayItem.TitleType, Boolean> hashMap, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(todoFilterType, "currentFilter");
        Intrinsics.checkParameterIsNotNull(sortType, "sortType");
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty() || context == null) {
            return arrayList;
        }
        if (todoFilterType == TodoFilterType.FROM_DOCS) {
            return m220763a(list, z, todoFilterType, hashMap);
        }
        if (todoFilterType == TodoFilterType.COMPLETED) {
            return m220761a(context, list, z, todoFilterType);
        }
        if (sortType != SortDialog.SortType.CREATE_TIME) {
            return m220764a(list, z, todoFilterType, hashMap, z2, z3);
        }
        for (Todo todo : list) {
            arrayList.add(m220759a(todo, z, todoFilterType, z2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final List<TodoDisplayItem> m220764a(List<Todo> list, boolean z, TodoFilterType todoFilterType, HashMap<TodoDisplayItem.TitleType, Boolean> hashMap, boolean z2, boolean z3) {
        ArrayList arrayList;
        ArrayList<TodoDisplayItem> arrayList2 = new ArrayList<>();
        ArrayList<TodoDisplayItem> arrayList3 = new ArrayList<>();
        ArrayList<TodoDisplayItem> arrayList4 = new ArrayList<>();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        for (Todo todo : list) {
            Boolean bool = todo.is_all_day;
            long longValue = todo.due_time.longValue() * ((long) 1000);
            Boolean bool2 = todo.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "todo.is_all_day");
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(bool2.booleanValue() ? TimeZone.getTimeZone("UTC") : TimeZone.getDefault());
            gregorianCalendar2.setTimeInMillis(longValue);
            if (longValue <= 0) {
                arrayList6.add(m220759a(todo, z, todoFilterType, z2));
            } else {
                Intrinsics.checkExpressionValueIsNotNull(bool, "isAllDay");
                if (mo193136a(bool.booleanValue(), gregorianCalendar2, gregorianCalendar)) {
                    arrayList3.add(m220759a(todo, z, todoFilterType, z2));
                } else if (mo193135a(gregorianCalendar2, gregorianCalendar)) {
                    arrayList4.add(m220759a(todo, z, todoFilterType, z2));
                } else {
                    if (mo193137b(gregorianCalendar2, gregorianCalendar)) {
                        arrayList = arrayList5;
                        arrayList.add(m220759a(todo, z, todoFilterType, z2));
                    } else {
                        arrayList = arrayList5;
                        arrayList6.add(m220759a(todo, z, todoFilterType, z2));
                    }
                    arrayList5 = arrayList;
                    arrayList2 = arrayList2;
                }
            }
            arrayList = arrayList5;
            arrayList5 = arrayList;
            arrayList2 = arrayList2;
        }
        m220767a(arrayList2, arrayList3, hashMap, TodoDisplayItem.TitleType.OVER_DUE, R.string.Todo_Menu_Overdue, todoFilterType == TodoFilterType.ALL && z2);
        m220767a(arrayList2, arrayList4, hashMap, TodoDisplayItem.TitleType.TODAY, R.string.Todo_Menu_Today, todoFilterType == TodoFilterType.ALL && z3);
        m220766a(this, arrayList2, arrayList5, hashMap, TodoDisplayItem.TitleType.IN_WEEK, R.string.Todo_Menu_Next7Days, false, 32, null);
        m220766a(this, arrayList2, arrayList6, hashMap, TodoDisplayItem.TitleType.OTHER, R.string.Todo_Menu_Later, false, 32, null);
        return arrayList2;
    }

    /* renamed from: a */
    private final List<TodoDisplayItem> m220763a(List<Todo> list, boolean z, TodoFilterType todoFilterType, HashMap<TodoDisplayItem.TitleType, Boolean> hashMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Todo todo : list) {
            if (todo.completed_milli_time.longValue() > 0) {
                arrayList3.add(m220759a(todo, z, todoFilterType, false));
            } else {
                arrayList2.add(m220759a(todo, z, todoFilterType, false));
            }
        }
        m220766a(this, arrayList, arrayList2, hashMap, TodoDisplayItem.TitleType.DOING, R.string.Todo_CollabTask_IncompleteTitle, false, 32, null);
        m220766a(this, arrayList, arrayList3, hashMap, TodoDisplayItem.TitleType.DONE, R.string.Todo_CollabTask_CompletedTitle, false, 32, null);
        return arrayList;
    }

    /* renamed from: a */
    static /* synthetic */ void m220766a(TodoDisplayHelper aVar, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap, TodoDisplayItem.TitleType titleType, int i, boolean z, int i2, Object obj) {
        aVar.m220767a(arrayList, arrayList2, hashMap, titleType, i, (i2 & 32) != 0 ? false : z);
    }

    /* renamed from: a */
    private final void m220767a(ArrayList<TodoDisplayItem> arrayList, ArrayList<TodoDisplayItem> arrayList2, HashMap<TodoDisplayItem.TitleType, Boolean> hashMap, TodoDisplayItem.TitleType titleType, int i, boolean z) {
        Boolean bool;
        ArrayList<TodoDisplayItem> arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            if (hashMap == null || (bool = hashMap.get(titleType)) == null) {
                bool = true;
            }
            Intrinsics.checkExpressionValueIsNotNull(bool, "titleStateMap?.get(type) ?: true");
            boolean booleanValue = bool.booleanValue();
            TodoDisplayItem todoDisplayItem = new TodoDisplayItem(null, null, null, false, null, 0, 0, false, null, 0, 0, null, null, false, false, null, false, null, true, titleType, null, booleanValue, ResUtil.f139261a.mo191781c(i), arrayList2.size(), 0, null, false, false, false, false, null, false, -15466497, null);
            if (z) {
                ArrayList arrayList4 = new ArrayList();
                for (T t : arrayList2) {
                    if (t.mo193178n()) {
                        arrayList4.add(t);
                    }
                }
                todoDisplayItem.mo193158a(arrayList4.size());
            }
            arrayList.add(todoDisplayItem);
            if (booleanValue) {
                ArrayList<TodoDisplayItem> arrayList5 = arrayList2;
                ((TodoDisplayItem) CollectionsKt.first((List) arrayList5)).mo193166d(true);
                ((TodoDisplayItem) CollectionsKt.last((List) arrayList5)).mo193164c(true);
                arrayList.addAll(arrayList3);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo193136a(boolean z, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
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
    public final boolean mo193135a(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "dueTimeGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "currentGC");
        return DayCompareUtil.f139259a.mo191764a(gregorianCalendar, gregorianCalendar2) == 0;
    }

    /* renamed from: a */
    private final void m220765a(Context context, LinkedHashMap<String, ArrayList<TodoDisplayItem>> linkedHashMap, List<Todo> list, boolean z, TodoFilterType todoFilterType) {
        String str;
        String c = ResUtil.f139261a.mo191781c(R.string.Todo_Common_ThisWeek);
        String c2 = ResUtil.f139261a.mo191781c(R.string.Todo_Common_LastWeek);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setFirstDayOfWeek(f140268b);
        gregorianCalendar.set(7, f140268b);
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
            ArrayList<TodoDisplayItem> arrayList = linkedHashMap.get(str);
            if (arrayList != null) {
                arrayList.add(f140267a.m220759a(todo, z, todoFilterType, false));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.b.a$a */
    static final class C56809a extends Lambda implements Function0<Integer> {
        public static final C56809a INSTANCE = new C56809a();

        C56809a() {
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
        f140268b = i;
    }

    /* renamed from: a */
    private final boolean m220768a(Todo todo) {
        return MultiCompleteHelper.f139390a.mo191986b(todo);
    }

    /* renamed from: b */
    private final boolean m220769b(Todo todo) {
        if (todo.source != TodoSource.OAPI) {
            return m220770c(todo);
        }
        if (!f140269c) {
            return MultiCompleteHelper.f139390a.mo191986b(todo);
        }
        if (MultiCompleteHelper.f139390a.mo191986b(todo) || m220770c(todo)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m220770c(Todo todo) {
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

    /* renamed from: d */
    private final TodoDisplayItem.ChangeStatus m220771d(Todo todo) {
        String a = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();
        if (TextUtils.equals(todo.creator_id, a) && todo.source != TodoSource.DOC) {
            return TodoDisplayItem.ChangeStatus.DELETE;
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
            return TodoDisplayItem.ChangeStatus.QUIT;
        }
        return TodoDisplayItem.ChangeStatus.UNFOLLOWED;
    }

    /* renamed from: a */
    private final List<TodoAssignee> m220762a(List<TodoAssignee> list) {
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
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(((TodoAssignee) it.next()).assignee_id, f140270d)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.add(0, (TodoAssignee) arrayList.remove(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final float m220755a(int i, String str) {
        Context a = ResUtil.f139261a.mo191776a();
        if (a == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        TodoDisplayHelper aVar = f140267a;
        return ((float) aVar.m220758a(a, i)) + aVar.m220756a(a, str) + ((float) UIUtils.dp2px(a, 18.0f));
    }

    /* renamed from: b */
    public final boolean mo193137b(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "dueTimeGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "currentGC");
        int a = DayCompareUtil.f139259a.mo191764a(gregorianCalendar, gregorianCalendar2);
        if (1 <= a && 7 >= a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final float m220756a(Context context, String str) {
        Paint paint = new Paint();
        paint.setTextSize((float) context.getResources().getDimensionPixelSize(R.dimen.dp_14));
        return paint.measureText(str) + ((float) UIUtils.dp2px(context, 20.0f));
    }

    /* renamed from: a */
    private final int m220758a(Context context, int i) {
        if (i > 4) {
            i = 5;
        }
        return UIUtils.dp2px(context, (((float) i) * 20.0f) + (((float) (i - 1)) * 6.0f) + 88.0f);
    }

    /* renamed from: a */
    private final CharSequence m220760a(List<TodoAssignee> list, TodoSource todoSource) {
        if (!MultiCompleteHelper.f139390a.mo191984a(todoSource)) {
            return MultiCompleteHelper.f139390a.mo191981a(list);
        }
        return MultiCompleteHelper.f139390a.mo191982a(list, f140270d);
    }

    /* renamed from: a */
    private final TodoDisplayItem m220759a(Todo todo, boolean z, TodoFilterType todoFilterType, boolean z2) {
        EndTimeTextAttribute endTimeTextAttribute;
        int endTimeColor;
        boolean z3;
        CustomComplete.Action action;
        boolean z4;
        boolean z5;
        boolean z6;
        List<TodoAssignee> list = todo.assignees;
        Intrinsics.checkExpressionValueIsNotNull(list, "targetTodo.assignees");
        TodoSource todoSource = todo.source;
        Intrinsics.checkExpressionValueIsNotNull(todoSource, "targetTodo.source");
        CharSequence a = m220760a(list, todoSource);
        long a2 = MultiCompleteHelper.f139390a.mo191979a(todo);
        String str = "";
        int i = (a2 > 0 ? 1 : (a2 == 0 ? 0 : -1));
        if (i > 0) {
            endTimeTextAttribute = EndTimeHelper.m219791a(EndTimeHelper.f139399a, ResUtil.f139261a.mo191776a(), a2, false, z, false, 16, null);
            if (endTimeTextAttribute.getEndTimeStr().length() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                str = ResUtil.f139261a.mo191778a(R.string.Todo_Common_DateCompleted, "Time", endTimeTextAttribute.getEndTimeStr());
            }
            endTimeTextAttribute.setEndTimeStr(str);
        } else {
            EndTimeHelper bVar = EndTimeHelper.f139399a;
            Context a3 = ResUtil.f139261a.mo191776a();
            long longValue = ((long) 1000) * todo.due_time.longValue();
            Boolean bool = todo.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool, "targetTodo.is_all_day");
            endTimeTextAttribute = EndTimeHelper.m219791a(bVar, a3, longValue, bool.booleanValue(), z, false, 16, null);
            if (endTimeTextAttribute.getEndTimeStr().length() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                str = ResUtil.f139261a.mo191778a(R.string.Todo_Task_TimeDue, "Time", endTimeTextAttribute.getEndTimeStr());
            }
            endTimeTextAttribute.setEndTimeStr(str);
        }
        boolean b = m220769b(todo);
        if (i > 0) {
            endTimeColor = ResUtil.f139261a.mo191775a(R.color.primary_pri_500);
        } else if (!z2 || b) {
            endTimeColor = endTimeTextAttribute.getEndTimeColor();
        } else {
            endTimeColor = ResUtil.f139261a.mo191775a(R.color.text_placeholder);
        }
        RichText a4 = C56478e.m220168a(todo.rich_summary);
        if (C59035h.m229210a(a4)) {
            a4 = C59029c.m229161b(ResUtil.f139261a.mo191781c(R.string.Todo_Task_NoTitlePlaceholder));
        }
        TodoDisplayItem.ChangeStatus d = m220771d(todo);
        float a5 = m220755a(todo.assignees.size(), endTimeTextAttribute.getEndTimeStr());
        String str2 = todo.guid;
        Intrinsics.checkExpressionValueIsNotNull(str2, "targetTodo.guid");
        Intrinsics.checkExpressionValueIsNotNull(a4, "displayRichText");
        RichContent richContent = todo.rich_summary;
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int size = todo.assignees.size();
        MultiCompleteHelper multiCompleteHelper = MultiCompleteHelper.f139390a;
        TodoSource todoSource2 = todo.source;
        String str3 = todo.creator_id;
        Intrinsics.checkExpressionValueIsNotNull(str3, "targetTodo.creator_id");
        Long l = todo.display_completed_milli_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "targetTodo.display_completed_milli_time");
        MultiCompleteHelper.MultiCompleteType a6 = multiCompleteHelper.mo191980a(todoSource2, str3, l.longValue(), todo.assignees, f140270d);
        CustomComplete customComplete = todo.custom_complete;
        if (customComplete != null) {
            action = customComplete.f175433android;
        } else {
            action = null;
        }
        long longValue2 = ((long) 1000) * todo.due_time.longValue();
        Boolean bool2 = todo.is_all_day;
        Intrinsics.checkExpressionValueIsNotNull(bool2, "targetTodo.is_all_day");
        boolean booleanValue = bool2.booleanValue();
        String endTimeStr = endTimeTextAttribute.getEndTimeStr();
        Long l2 = todo.create_milli_time;
        Intrinsics.checkExpressionValueIsNotNull(l2, "targetTodo.create_milli_time");
        long longValue3 = l2.longValue();
        boolean a7 = m220768a(todo);
        TodoSource todoSource3 = todo.source;
        List<TodoAssignee> a8 = m220762a(todo.assignees);
        if (a5 >= ((float) m220757a())) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new TodoDisplayItem(str2, a4, richContent, z3, a, size, longValue2, booleanValue, endTimeStr, endTimeColor, longValue3, a6, action, a7, b, d, false, null, false, null, null, false, null, 0, 0, todoSource3, false, false, false, false, a8, z4, 1040121856, null);
    }

    /* renamed from: a */
    private final List<TodoDisplayItem> m220761a(Context context, List<Todo> list, boolean z, TodoFilterType todoFilterType) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, ArrayList<TodoDisplayItem>> linkedHashMap = new LinkedHashMap<>();
        m220765a(context, linkedHashMap, list, z, todoFilterType);
        for (Map.Entry<String, ArrayList<TodoDisplayItem>> entry : linkedHashMap.entrySet()) {
            arrayList.add(new TodoDisplayItem(null, null, null, false, null, 0, 0, false, null, 0, 0, null, null, false, false, null, false, null, true, TodoDisplayItem.TitleType.COMPLETED, null, true, entry.getKey(), 0, 0, null, false, false, false, false, null, false, -7077889, null));
            if (!entry.getValue().isEmpty()) {
                ((TodoDisplayItem) CollectionsKt.first((List) entry.getValue())).mo193166d(true);
                ((TodoDisplayItem) CollectionsKt.last((List) entry.getValue())).mo193164c(true);
                arrayList.addAll(entry.getValue());
            }
        }
        return arrayList;
    }
}
