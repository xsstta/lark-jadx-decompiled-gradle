package com.ss.android.lark.todo.impl.features.detail.time;

import com.bytedance.lark.pb.todo.v1.TodoReminder;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.helper.EndTimeHelper;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/time/TodoReminderItems;", "", "()V", "allDayReminders", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAllDayReminders", "()Ljava/util/ArrayList;", "dayMinutes", "hourMinutes", "normalReminders", "getNormalReminders", "weekMinutes", "generateStrByTime", "", "Minutes", "", "getAllDayReminderString", "minutes", "getNormalReminderString", "getReminderText", "reminder", "Lcom/bytedance/lark/pb/todo/v1/TodoReminder;", "isAllDay", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.time.c */
public final class TodoReminderItems {

    /* renamed from: a */
    public static final TodoReminderItems f140115a = new TodoReminderItems();

    /* renamed from: b */
    private static final ArrayList<Integer> f140116b;

    /* renamed from: c */
    private static final ArrayList<Integer> f140117c = CollectionsKt.arrayListOf(-1, -540, 900, 2340, 9540);

    private TodoReminderItems() {
    }

    /* renamed from: a */
    public final ArrayList<Integer> mo192735a() {
        return f140116b;
    }

    /* renamed from: b */
    public final ArrayList<Integer> mo192737b() {
        return f140117c;
    }

    static {
        ArrayList<Integer> arrayList;
        boolean n = TodoDependencyHolder.f139242a.mo191731b().mo191941n();
        Integer valueOf = Integer.valueOf((int) CalendarWorkHourUtil.f83805a);
        Integer valueOf2 = Integer.valueOf((int) SmEvents.EVENT_NW);
        if (n) {
            arrayList = CollectionsKt.arrayListOf(-1, 0, 5, 15, 30, 60, valueOf2, valueOf, 2880, 10080);
        } else {
            arrayList = CollectionsKt.arrayListOf(-1, 0, 5, 15, 30, 60, valueOf2, valueOf, 2880);
        }
        f140116b = arrayList;
    }

    /* renamed from: a */
    private final String m220592a(long j) {
        Date date = new Date(j * ((long) 60) * ((long) 1000));
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191595a("UTC");
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191599b(!TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b());
        return TimeFormatUtils.m219287d(TodoDependencyHolder.f139242a.mo191730a().settingDependency().mo145427a(), date, aVar);
    }

    /* renamed from: b */
    public final String mo192736b(int i) {
        if (i == 0) {
            return ResUtil.f139261a.mo191781c(R.string.Todo_Task_AlertTimeAtTimeOfEvent);
        }
        if (i < 0) {
            return ResUtil.f139261a.mo191781c(R.string.Todo_Task_AlertTimeNoAlert);
        }
        int i2 = i / 10080;
        int i3 = i % 10080;
        int i4 = i / CalendarWorkHourUtil.f83805a;
        int i5 = i % CalendarWorkHourUtil.f83805a;
        int i6 = i / 60;
        int i7 = i % 60;
        if (i2 > 0 && i3 == 0) {
            return ResUtil.f139261a.mo191777a(R.plurals.Todo_Task_AlertTimeNWeeksBefore, i2);
        }
        if (i4 > 0) {
            if (i5 == 0) {
                return ResUtil.f139261a.mo191777a(R.plurals.Todo_Task_AlertTimeNDaysBefore, i4);
            }
            if (i5 != 0 && i2 > 0) {
                return ResUtil.f139261a.mo191777a(R.plurals.Todo_Task_AlertTimeNDaysBefore, i4 + 1);
            }
        }
        if (i6 > 0) {
            if (i7 == 0) {
                return ResUtil.f139261a.mo191777a(R.plurals.Todo_Task_AlertTimeNHoursBefore, i6);
            }
            if (i7 != 0 && i4 > 0) {
                return ResUtil.f139261a.mo191777a(R.plurals.Todo_Task_AlertTimeNHoursBefore, i6 + 1);
            }
        }
        return ResUtil.f139261a.mo191777a(R.plurals.Todo_Task_AlertTimeNMinutesBefore, i);
    }

    /* renamed from: a */
    public final String mo192732a(int i) {
        String str;
        if (i <= 0) {
            return ResUtil.f139261a.mo191778a(R.string.Todo_Task_AlertTimeOnTheDayAt, "time", m220592a(-((long) i)));
        }
        boolean z = true;
        int i2 = (i / CalendarWorkHourUtil.f83805a) + 1;
        int i3 = (i2 * CalendarWorkHourUtil.f83805a) - i;
        int i4 = i2 / 7;
        if (i2 % 7 != 0) {
            z = false;
        }
        if (!z || i4 <= 0) {
            str = ResUtil.f139261a.mo191777a(R.plurals.Todo_Task_AlertTimeNDaysBefore, i2);
        } else {
            str = ResUtil.f139261a.mo191777a(R.plurals.Todo_Task_AlertTimeNWeeksBefore, i4);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("TimeBefore", str);
        hashMap.put("Time", m220592a((long) i3));
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Todo_Task_AlertTimeXBeforeAt, hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…TimeXBeforeAt, formatMap)");
        return mustacheFormat;
    }

    /* renamed from: a */
    public final String mo192734a(TodoReminder todoReminder) {
        Intrinsics.checkParameterIsNotNull(todoReminder, "reminder");
        TodoReminder.Type type = todoReminder.type;
        if (type != null && C56719d.f140118a[type.ordinal()] == 1) {
            Boolean bool = todoReminder.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool, "reminder.is_all_day");
            return EndTimeHelper.m219791a(EndTimeHelper.f139399a, ResUtil.f139261a.mo191776a(), todoReminder.time.longValue() * ((long) 1000), bool.booleanValue(), TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b(), false, 16, null).getEndTimeStr();
        }
        Boolean bool2 = todoReminder.is_all_day;
        Intrinsics.checkExpressionValueIsNotNull(bool2, "reminder.is_all_day");
        return mo192733a((int) todoReminder.time.longValue(), bool2.booleanValue());
    }

    /* renamed from: a */
    public final String mo192733a(int i, boolean z) {
        if (i == -1) {
            return ResUtil.f139261a.mo191781c(R.string.Todo_Task_AlertTimeNoAlert);
        }
        if (z) {
            return mo192732a(i);
        }
        return mo192736b(i);
    }
}
