package com.ss.android.lark.todo.impl.features.mainview2.widget.list.helper;

import com.bytedance.lark.pb.todo.v1.Todo;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.utils.DayCompareUtil;
import java.util.Comparator;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/helper/ListComparatorHelper;", "", "()V", "completeComparator", "Ljava/util/Comparator;", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "Lkotlin/Comparator;", "getCompleteComparator", "()Ljava/util/Comparator;", "createTimeComparator", "getCreateTimeComparator", "dueTimeComparator", "getDueTimeComparator", "compareDifferentAllDay", "", "firstTodo", "secondTodo", "compareSameAllDay", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.b.a */
public final class ListComparatorHelper {

    /* renamed from: a */
    public static final ListComparatorHelper f140757a = new ListComparatorHelper();

    /* renamed from: b */
    private static final Comparator<Todo> f140758b = C57077a.f140761a;

    /* renamed from: c */
    private static final Comparator<Todo> f140759c = C57079c.f140763a;

    /* renamed from: d */
    private static final Comparator<Todo> f140760d = C57078b.f140762a;

    private ListComparatorHelper() {
    }

    /* renamed from: a */
    public final Comparator<Todo> mo193758a() {
        return f140758b;
    }

    /* renamed from: b */
    public final Comparator<Todo> mo193760b() {
        return f140759c;
    }

    /* renamed from: c */
    public final Comparator<Todo> mo193761c() {
        return f140760d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "firstTodo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "kotlin.jvm.PlatformType", "secondTodo", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.b.a$b */
    static final class C57078b<T> implements Comparator<Todo> {

        /* renamed from: a */
        public static final C57078b f140762a = new C57078b();

        C57078b() {
        }

        /* renamed from: a */
        public final int compare(Todo todo, Todo todo2) {
            long j;
            long j2;
            Long l = todo.create_milli_time;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            Long l2 = todo2.create_milli_time;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            int i = ((j - j2) > 0 ? 1 : ((j - j2) == 0 ? 0 : -1));
            if (i > 0) {
                return -1;
            }
            if (i == 0) {
                return 0;
            }
            return 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "firstTodo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "kotlin.jvm.PlatformType", "secondTodo", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.b.a$c */
    static final class C57079c<T> implements Comparator<Todo> {

        /* renamed from: a */
        public static final C57079c f140763a = new C57079c();

        C57079c() {
        }

        /* renamed from: a */
        public final int compare(Todo todo, Todo todo2) {
            if (Intrinsics.areEqual(todo.is_all_day, todo2.is_all_day)) {
                ListComparatorHelper aVar = ListComparatorHelper.f140757a;
                Intrinsics.checkExpressionValueIsNotNull(todo, "firstTodo");
                Intrinsics.checkExpressionValueIsNotNull(todo2, "secondTodo");
                return aVar.mo193757a(todo, todo2);
            }
            ListComparatorHelper aVar2 = ListComparatorHelper.f140757a;
            Intrinsics.checkExpressionValueIsNotNull(todo, "firstTodo");
            Intrinsics.checkExpressionValueIsNotNull(todo2, "secondTodo");
            return aVar2.mo193759b(todo, todo2);
        }
    }

    /* renamed from: a */
    public final int mo193757a(Todo todo, Todo todo2) {
        long j;
        long j2;
        long j3;
        long j4;
        Long l = todo.due_time;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = todo2.due_time;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        int i = ((j - j2) > 0 ? 1 : ((j - j2) == 0 ? 0 : -1));
        if (i <= 0) {
            if (i != 0) {
                return -1;
            }
            Long l3 = todo.create_milli_time;
            if (l3 != null) {
                j3 = l3.longValue();
            } else {
                j3 = 0;
            }
            Long l4 = todo2.create_milli_time;
            if (l4 != null) {
                j4 = l4.longValue();
            } else {
                j4 = 0;
            }
            int i2 = ((j3 - j4) > 0 ? 1 : ((j3 - j4) == 0 ? 0 : -1));
            if (i2 > 0) {
                return -1;
            }
            if (i2 == 0) {
                return 0;
            }
        }
        return 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "firstTodo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "kotlin.jvm.PlatformType", "secondTodo", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.b.a$a */
    static final class C57077a<T> implements Comparator<Todo> {

        /* renamed from: a */
        public static final C57077a f140761a = new C57077a();

        C57077a() {
        }

        /* renamed from: a */
        public final int compare(Todo todo, Todo todo2) {
            if (MultiCompleteHelper.f139390a.mo191979a(todo) - MultiCompleteHelper.f139390a.mo191979a(todo2) >= 0) {
                if (MultiCompleteHelper.f139390a.mo191979a(todo) - MultiCompleteHelper.f139390a.mo191979a(todo2) != 0) {
                    return -1;
                }
                long longValue = todo.create_milli_time.longValue();
                Long l = todo2.create_milli_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "secondTodo.create_milli_time");
                if (longValue - l.longValue() > 0) {
                    return -1;
                }
                long longValue2 = todo.create_milli_time.longValue();
                Long l2 = todo2.create_milli_time;
                Intrinsics.checkExpressionValueIsNotNull(l2, "secondTodo.create_milli_time");
                if (longValue2 - l2.longValue() == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }

    /* renamed from: b */
    public final int mo193759b(Todo todo, Todo todo2) {
        long j;
        Long l = todo.due_time;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = todo2.due_time;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        String str = todo.due_timezone;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        TimeZone timeZone = TimeZone.getTimeZone(str);
        String str3 = todo2.due_timezone;
        if (str3 != null) {
            str2 = str3;
        }
        TimeZone timeZone2 = TimeZone.getTimeZone(str2);
        long j3 = (long) 1000;
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "firstTodoTimeZone");
        int a = DayCompareUtil.f139259a.mo191762a(j * j3, timeZone);
        Intrinsics.checkExpressionValueIsNotNull(timeZone2, "secondTodoTimeZone");
        int a2 = a - DayCompareUtil.f139259a.mo191762a(j2 * j3, timeZone2);
        if (a2 <= 0) {
            if (a2 != 0) {
                return -1;
            }
            Boolean bool = todo.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool, "firstTodo.is_all_day");
            if (!bool.booleanValue() || todo2.is_all_day.booleanValue()) {
                return -1;
            }
        }
        return 1;
    }
}
