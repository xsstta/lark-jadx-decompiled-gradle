package com.ss.android.lark.calendar.impl.features.events.edit.part;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.helper.ReminderHelper;
import com.ss.android.lark.calendar.impl.features.events.detail.C31240c;
import com.ss.android.lark.calendar.impl.features.events.edit.data.ReminderFragmentData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30034ad;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020 J \u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00100\fj\b\u0012\u0004\u0012\u00020\u0010`\r2\u0006\u0010\u001f\u001a\u00020 H\u0002J0\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u00102\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020 J\b\u0010*\u001a\u00020\u001cH\u0002J\u000e\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020\u001cH\u0002J\u0006\u0010/\u001a\u00020 J\u0006\u00100\u001a\u00020 J\u0006\u00101\u001a\u00020\u001cJ\u0006\u00102\u001a\u00020\u001cJ\u000e\u00103\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 J\u001c\u00104\u001a\u00020\u001c2\f\u00105\u001a\b\u0012\u0004\u0012\u00020'0\u000f2\u0006\u0010\u001f\u001a\u00020 J.\u00106\u001a\u00020\u001c2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u00050\fj\b\u0012\u0004\u0012\u00020\u0005`\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00020'0\u000fH\u0002J\b\u00108\u001a\u00020\u001cH\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\fj\b\u0012\u0004\u0012\u00020\u0005`\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00050\fj\b\u0012\u0004\u0012\u00020\u0005`\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00050\fj\b\u0012\u0004\u0012\u00020\u0005`\rX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00100\fj\b\u0012\u0004\u0012\u00020\u0010`\rX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00050\fj\b\u0012\u0004\u0012\u00020\u0005`\rX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00100\fj\b\u0012\u0004\u0012\u00020\u0010`\rX\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditReminderPart;", "", "()V", "chosenIndexs", "", "", "getChosenIndexs$calendar_impl_release", "()[Ljava/lang/Integer;", "setChosenIndexs$calendar_impl_release", "([Ljava/lang/Integer;)V", "[Ljava/lang/Integer;", "mAllDayReminderMinutes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mAllDayReminderTexts", "", "", "mDefaultAllDayReminder", "mDefaultAllDayReminderIndex", "mDefaultReminder", "mDefaultReminderIndex", "mReminderMinutes", "mRemindersTexts", "mShowAllDayReminderMinutes", "mShowAllDayReminderTexts", "mShowReminderMinutes", "mShowReminderTexts", "addAllDayReminder", "", "minutes", "getReminderContainerStr", "isAllDay", "", "getReminderDefaultRemindTimeIndex", "getReminderFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ReminderFragmentData;", "isSingleSelect", "getReminderShowList", "getSubmitReminders", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventReminder;", "chooseCalendarId", "originalReminders", "initAllDayReminderShowTexts", "initReminderBySetting", "calendarSetting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "initReminderShowTexts", "isHaveChosenMultiReminder", "isReminderContainerVisible", "refreshReminderChosenIndexes", "setNoneReminder", "updateChosenIndexForCreate", "updateChosenRemindersForEdit", "reminders", "updateChosenText", "reminderMinutes", "updateDefaultReminder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.part.d */
public final class EditReminderPart {

    /* renamed from: a */
    private Integer[] f81301a = new Integer[0];

    /* renamed from: b */
    private final ArrayList<Integer> f81302b;

    /* renamed from: c */
    private final List<String> f81303c;

    /* renamed from: d */
    private final ArrayList<Integer> f81304d;

    /* renamed from: e */
    private final List<String> f81305e;

    /* renamed from: f */
    private final ArrayList<Integer> f81306f;

    /* renamed from: g */
    private final ArrayList<String> f81307g;

    /* renamed from: h */
    private final ArrayList<Integer> f81308h;

    /* renamed from: i */
    private final ArrayList<String> f81309i;

    /* renamed from: j */
    private int f81310j;

    /* renamed from: k */
    private int f81311k;

    /* renamed from: l */
    private int f81312l;

    /* renamed from: m */
    private int f81313m;

    /* renamed from: a */
    public final void mo116296a() {
        this.f81301a = new Integer[0];
    }

    /* renamed from: b */
    public final boolean mo116302b() {
        boolean z;
        if (this.f81301a.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* renamed from: c */
    public final void mo116304c() {
        Integer[] numArr = new Integer[1];
        for (int i = 0; i < 1; i++) {
            numArr[i] = Integer.valueOf(this.f81301a[0].intValue());
        }
        this.f81301a = numArr;
    }

    /* renamed from: e */
    private final void m121191e() {
        Integer num = this.f81304d.get(this.f81310j);
        Intrinsics.checkExpressionValueIsNotNull(num, "mAllDayReminderMinutes[m…faultAllDayReminderIndex]");
        this.f81311k = num.intValue();
        Integer num2 = this.f81302b.get(this.f81312l);
        Intrinsics.checkExpressionValueIsNotNull(num2, "mReminderMinutes[mDefaultReminderIndex]");
        this.f81313m = num2.intValue();
    }

    /* renamed from: f */
    private final void m121192f() {
        this.f81307g.clear();
        Iterator<Integer> it = this.f81306f.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            ArrayList<String> arrayList = this.f81307g;
            AbstractC30034ad adVar = C30022a.f74882a.settingDependency();
            Intrinsics.checkExpressionValueIsNotNull(adVar, "CalendarDependencyHolder…dency.settingDependency()");
            Context a = adVar.mo108177a();
            Intrinsics.checkExpressionValueIsNotNull(next, "minute");
            arrayList.add(C31240c.m116937b(a, next.intValue()));
        }
    }

    /* renamed from: g */
    private final void m121193g() {
        this.f81309i.clear();
        int size = this.f81308h.size();
        for (int i = 0; i < size; i++) {
            Integer num = this.f81308h.get(i);
            Intrinsics.checkExpressionValueIsNotNull(num, "mShowAllDayReminderMinutes[i]");
            int intValue = num.intValue();
            ArrayList<String> arrayList = this.f81309i;
            AbstractC30034ad adVar = C30022a.f74882a.settingDependency();
            Intrinsics.checkExpressionValueIsNotNull(adVar, "CalendarDependencyHolder…dency.settingDependency()");
            arrayList.add(C31240c.m116935a(adVar.mo108177a(), intValue));
        }
    }

    /* renamed from: d */
    public final boolean mo116305d() {
        boolean z;
        Integer[] numArr = this.f81301a;
        if (numArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z) || numArr.length <= 1) {
            return false;
        }
        return true;
    }

    public EditReminderPart() {
        ArrayList<Integer> arrayListOf = CollectionsKt.arrayListOf(0, 5, 15, 30, 60, Integer.valueOf((int) SmEvents.EVENT_NW), Integer.valueOf((int) CalendarWorkHourUtil.f83805a), 2880, 10080);
        this.f81302b = arrayListOf;
        this.f81303c = ReminderHelper.m116193a();
        ArrayList<Integer> arrayListOf2 = CollectionsKt.arrayListOf(-480, -540, -600, 960, 900, 840);
        this.f81304d = arrayListOf2;
        this.f81305e = ReminderHelper.m116195b();
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f81306f = arrayList;
        this.f81307g = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        this.f81308h = arrayList2;
        this.f81309i = new ArrayList<>();
        this.f81310j = 1;
        this.f81312l = 3;
        arrayList.addAll(arrayListOf);
        m121192f();
        arrayList2.addAll(arrayListOf2);
        m121193g();
        m121191e();
    }

    /* renamed from: c */
    public final int mo116303c(boolean z) {
        if (z) {
            return this.f81310j;
        }
        return this.f81312l;
    }

    /* renamed from: a */
    public final void mo116300a(Integer[] numArr) {
        Intrinsics.checkParameterIsNotNull(numArr, "<set-?>");
        this.f81301a = numArr;
    }

    /* renamed from: d */
    private final ArrayList<String> m121190d(boolean z) {
        if (z) {
            return new ArrayList<>(this.f81309i);
        }
        return new ArrayList<>(this.f81307g);
    }

    /* renamed from: a */
    public final void mo116297a(CalendarSetting calendarSetting) {
        Intrinsics.checkParameterIsNotNull(calendarSetting, "calendarSetting");
        int indexOf = this.f81302b.indexOf(Integer.valueOf(calendarSetting.getDefaultNoneAllDayReminder()));
        if (indexOf != -1 && indexOf < this.f81303c.size()) {
            this.f81312l = indexOf;
        }
        int indexOf2 = this.f81304d.indexOf(Integer.valueOf(calendarSetting.getDefaultAllDayReminder()));
        if (indexOf2 != -1 && indexOf2 < this.f81305e.size()) {
            this.f81310j = indexOf2;
        }
        m121191e();
    }

    /* renamed from: b */
    public final String mo116301b(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (this.f81301a.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : this.f81301a) {
            int intValue = num.intValue();
            ArrayList<String> d = m121190d(z);
            if (intValue < d.size()) {
                if (!z3) {
                    sb.append(C32634ae.m125182b(R.string.Calendar_Common_Comma));
                }
                sb.append(d.get(intValue));
                z3 = false;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "stringBuilder.toString()");
        return sb2;
    }

    /* renamed from: a */
    private final void m121188a(int i) {
        int i2;
        int size = this.f81308h.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = 0;
                break;
            } else if (Intrinsics.compare(this.f81308h.get(i3).intValue(), 0) > 0) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 > 0) {
            ArrayList arrayList = new ArrayList(this.f81308h.subList(0, i3));
            ArrayList<Integer> arrayList2 = this.f81308h;
            ArrayList arrayList3 = new ArrayList(arrayList2.subList(i3, arrayList2.size()));
            if (i > 0) {
                arrayList3.add(Integer.valueOf(i));
                ArrayList arrayList4 = arrayList3;
                CollectionsKt.sort(arrayList4);
                CollectionsKt.reverse(arrayList4);
                i2 = arrayList.size() + arrayList3.indexOf(Integer.valueOf(i));
            } else {
                arrayList.add(Integer.valueOf(i));
                ArrayList arrayList5 = arrayList;
                CollectionsKt.sort(arrayList5);
                CollectionsKt.reverse(arrayList5);
                i2 = arrayList.indexOf(Integer.valueOf(i));
            }
            this.f81308h.add(i2, Integer.valueOf(i));
            return;
        }
        this.f81308h.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo116299a(boolean z) {
        int i;
        Integer[] numArr = new Integer[1];
        for (int i2 = 0; i2 < 1; i2++) {
            numArr[i2] = 0;
        }
        this.f81301a = numArr;
        if (z) {
            i = this.f81308h.indexOf(Integer.valueOf(this.f81311k));
        } else {
            i = this.f81306f.indexOf(Integer.valueOf(this.f81313m));
        }
        numArr[0] = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final ReminderFragmentData mo116294a(boolean z, boolean z2) {
        return new ReminderFragmentData(m121190d(z), (HashSet) C69043h.m265757b((Object[]) this.f81301a, (Collection) new HashSet()), z2);
    }

    /* renamed from: a */
    private final void m121189a(ArrayList<Integer> arrayList, List<? extends CalendarEventReminder> list) {
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            CalendarEventReminder calendarEventReminder = (CalendarEventReminder) list.get(i);
            if (arrayList.contains(Integer.valueOf(calendarEventReminder.getMinutes()))) {
                arrayList2.add(Integer.valueOf(arrayList.indexOf(Integer.valueOf(calendarEventReminder.getMinutes()))));
            }
        }
        int length = this.f81301a.length;
        Integer[] numArr = new Integer[length];
        for (int i2 = 0; i2 < length; i2++) {
            numArr[i2] = 0;
        }
        Object[] array = arrayList2.toArray(numArr);
        Intrinsics.checkExpressionValueIsNotNull(array, "chooseIndexs.toArray(Arr…chosenIndexs.size) { 0 })");
        this.f81301a = (Integer[]) array;
    }

    /* renamed from: a */
    public final void mo116298a(List<? extends CalendarEventReminder> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "reminders");
        this.f81306f.clear();
        this.f81306f.addAll(this.f81302b);
        this.f81308h.clear();
        this.f81308h.addAll(this.f81304d);
        int i = 0;
        if (z) {
            int size = list.size();
            while (i < size) {
                CalendarEventReminder calendarEventReminder = (CalendarEventReminder) list.get(i);
                if (!this.f81308h.contains(Integer.valueOf(calendarEventReminder.getMinutes()))) {
                    m121188a(calendarEventReminder.getMinutes());
                }
                i++;
            }
            m121193g();
            m121189a(this.f81308h, list);
            return;
        }
        int size2 = list.size();
        while (i < size2) {
            CalendarEventReminder calendarEventReminder2 = (CalendarEventReminder) list.get(i);
            if (!this.f81306f.contains(Integer.valueOf(calendarEventReminder2.getMinutes()))) {
                this.f81306f.add(Integer.valueOf(calendarEventReminder2.getMinutes()));
            }
            i++;
        }
        CollectionsKt.sort(this.f81306f);
        m121192f();
        m121189a(this.f81306f, list);
    }

    /* renamed from: a */
    public final List<CalendarEventReminder> mo116295a(String str, List<? extends CalendarEventReminder> list, boolean z) {
        boolean z2;
        ArrayList<Integer> arrayList;
        boolean z3;
        if (this.f81301a.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(!z2)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            arrayList = this.f81308h;
        } else {
            arrayList = this.f81306f;
        }
        int length = this.f81301a.length;
        for (int i = 0; i < length; i++) {
            if (this.f81301a[i].intValue() < arrayList.size()) {
                Integer num = arrayList.get(this.f81301a[i].intValue());
                Intrinsics.checkExpressionValueIsNotNull(num, "chooseTimes[chosenIndexs[i]]");
                int intValue = num.intValue();
                int i2 = 0;
                if (list != null) {
                    while (true) {
                        if (i2 >= list.size()) {
                            break;
                        } else if (((CalendarEventReminder) list.get(i2)).getMinutes() == intValue) {
                            z3 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                z3 = false;
                if (!z3) {
                    CalendarEventReminder calendarEventReminder = new CalendarEventReminder();
                    calendarEventReminder.setCalendarEventId(str);
                    calendarEventReminder.setMethod(CalendarEventReminder.Method.DEFAULT);
                    calendarEventReminder.setMinutes(intValue);
                    arrayList2.add(calendarEventReminder);
                } else if (list != null) {
                    arrayList2.add(list.get(i2));
                }
            }
        }
        return arrayList2;
    }
}
