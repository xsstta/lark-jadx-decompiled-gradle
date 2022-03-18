package com.ss.android.lark.calendar.impl.features.events.edit.part;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.data.RepeatEndFragmentData;
import com.ss.android.lark.calendar.impl.utils.C32632ac;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.EventRecurrence;
import com.ss.android.lark.calendar.impl.utils.RepeatMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 K2\u00020\u0001:\u0001KB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0018J\u0010\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0018H\u0002J\u000e\u0010-\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0018J\u0006\u0010.\u001a\u00020\u0018J\b\u0010/\u001a\u000200H\u0002J\u0006\u00101\u001a\u00020\u0018J\u0006\u00102\u001a\u00020\u0018J \u00103\u001a\u0002042\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000108J\u0006\u00109\u001a\u00020\u0018J\u0006\u0010:\u001a\u00020\u0018J\u0006\u0010;\u001a\u00020\nJ\u0006\u0010<\u001a\u00020\nJ\b\u0010=\u001a\u00020*H\u0002J\u0010\u0010>\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000100J\u0006\u0010?\u001a\u00020\nJ\u0018\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u0002002\b\u00107\u001a\u0004\u0018\u000100J\u000e\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020DJ\u0016\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u0002002\u0006\u0010G\u001a\u000200J\u0010\u0010H\u001a\u00020*2\u0006\u0010C\u001a\u00020\u0018H\u0002J\u0006\u0010I\u001a\u00020*J\u0010\u0010J\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u000100R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\b¨\u0006L"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditRepeatPart;", "", "()V", "day", "", "getDay$calendar_impl_release", "()I", "setDay$calendar_impl_release", "(I)V", "isNeverEnd", "", "isNeverEnd$calendar_impl_release", "()Z", "setNeverEnd$calendar_impl_release", "(Z)V", "mCustomRepeatMode", "Lcom/ss/android/lark/calendar/impl/utils/RepeatMode;", "getMCustomRepeatMode$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/utils/RepeatMode;", "setMCustomRepeatMode$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/utils/RepeatMode;)V", "mHasCustomRule", "mRepeatRules", "Ljava/util/ArrayList;", "", "kotlin.jvm.PlatformType", "month", "getMonth$calendar_impl_release", "setMonth$calendar_impl_release", "rRuleHasCount", "getRRuleHasCount$calendar_impl_release", "setRRuleHasCount$calendar_impl_release", "repeatChosenIndex", "getRepeatChosenIndex$calendar_impl_release", "setRepeatChosenIndex$calendar_impl_release", "repeatDescs", "getRepeatDescs$calendar_impl_release", "()Ljava/util/ArrayList;", "year", "getYear$calendar_impl_release", "setYear$calendar_impl_release", "createRRuleForEdit", "", "rRule", "createRRuleForEditWithoutCount", "createRepeatEndForEdit", "getDateRRuleString", "getMeetingRoomLimitDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getRepeatEndRule", "getRepeatEndStr", "getRepeatFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/RepeatEndFragmentData;", "eventStartDate", "chosenMeetingRoomListSize", "meetingRoomLimitDate", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/MeetingRoomLimitData;", "getRepeatRRule", "getRepeatRuleShowStr", "hasCustomRepeat", "hasSetRepeatRule", "initRepeatDescriptions", "isEndDateValidate", "isHaveChosenMultiMonthRepeat", "isRepeatLimitEndBeforeStart", "originalEventStartDate", "updateCustomRepeat", "customRRule", "Lcom/ss/android/lark/calendar/impl/utils/EventRecurrence;", "updateCustomRepeatByStartTime", "curStartCalendar", "lastStartCalendar", "updateCustomRepeatData", "updateRRuleHasGoogleCount", "updateRepeatEndLimit", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.part.e */
public final class EditRepeatPart {

    /* renamed from: a */
    public static final Companion f81314a = new Companion(null);

    /* renamed from: b */
    private final ArrayList<String> f81315b = new ArrayList<>();

    /* renamed from: c */
    private int f81316c;

    /* renamed from: d */
    private boolean f81317d;

    /* renamed from: e */
    private boolean f81318e;

    /* renamed from: f */
    private final ArrayList<String> f81319f = new ArrayList<>(Arrays.asList("", "FREQ=DAILY;INTERVAL=1", "FREQ=WEEKLY;INTERVAL=1", "FREQ=MONTHLY;INTERVAL=1", "FREQ=YEARLY;INTERVAL=1", "FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR"));

    /* renamed from: g */
    private RepeatMode f81320g;

    /* renamed from: h */
    private boolean f81321h = true;

    /* renamed from: i */
    private int f81322i;

    /* renamed from: j */
    private int f81323j;

    /* renamed from: k */
    private int f81324k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditRepeatPart$Companion;", "", "()V", "BY_MONTH_DAY_TAG", "", "FAKE_REPEAT_FREQ", "ONE_DAY_SECONDS", "", "REPEAT_END_MAX_AVAILABLE_DAYS", "", "RULE_GOOGLE_COUNT_TAG", "RULE_LEFT_TAG", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.part.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final ArrayList<String> mo116307a() {
        return this.f81315b;
    }

    /* renamed from: b */
    public final int mo116314b() {
        return this.f81316c;
    }

    /* renamed from: d */
    public final RepeatMode mo116321d() {
        return this.f81320g;
    }

    /* renamed from: m */
    public final boolean mo116331m() {
        return this.f81318e;
    }

    /* renamed from: c */
    public final boolean mo116320c() {
        return this.f81317d;
    }

    /* renamed from: h */
    public final boolean mo116326h() {
        if (this.f81316c != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final String mo116325g() {
        if (this.f81316c >= this.f81319f.size()) {
            return "";
        }
        String str = this.f81319f.get(this.f81316c);
        Intrinsics.checkExpressionValueIsNotNull(str, "mRepeatRules[repeatChosenIndex]");
        return str;
    }

    /* renamed from: j */
    public final String mo116328j() {
        if (this.f81321h) {
            return "";
        }
        return ";UNTIL=" + mo116329k();
    }

    public EditRepeatPart() {
        m121208n();
    }

    /* renamed from: n */
    private final void m121208n() {
        this.f81315b.add(C32634ae.m125182b(R.string.Calendar_Detail_NoRepeat));
        int size = this.f81319f.size();
        for (int i = 1; i < size; i++) {
            this.f81315b.add(C32632ac.m125172c(this.f81319f.get(i)));
        }
    }

    /* renamed from: e */
    public final void mo116323e() {
        if (this.f81316c < this.f81319f.size()) {
            String str = this.f81319f.get(this.f81316c);
            Intrinsics.checkExpressionValueIsNotNull(str, "mRepeatRules[repeatChosenIndex]");
            this.f81317d = StringsKt.contains$default((CharSequence) str, (CharSequence) ";COUNT=", false, 2, (Object) null);
        }
    }

    /* renamed from: f */
    public final String mo116324f() {
        if (!mo116326h() || this.f81316c >= this.f81315b.size()) {
            return "";
        }
        String str = this.f81315b.get(this.f81316c);
        Intrinsics.checkExpressionValueIsNotNull(str, "repeatDescs[repeatChosenIndex]");
        return str;
    }

    /* renamed from: i */
    public final String mo116327i() {
        if (this.f81321h) {
            String b = C32634ae.m125182b(R.string.Calendar_RRule_NeverEnds);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…Calendar_RRule_NeverEnds)");
            return b;
        }
        String d = C32632ac.m125173d("FREQ=DAILY;INTERVAL=1" + mo116328j());
        Intrinsics.checkExpressionValueIsNotNull(d, "RepeatModeUtils.getRepeatEndTime(rRule)");
        return d;
    }

    /* renamed from: k */
    public final String mo116329k() {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setYear(this.f81322i);
        calendarDate.setMonth(this.f81323j);
        calendarDate.setMonthDay(this.f81324k);
        calendarDate.setHour(23);
        calendarDate.setMinute(59);
        calendarDate.setSecond(59);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(calendarDate.getTime()) + "Z";
    }

    /* renamed from: l */
    public final boolean mo116330l() {
        String str;
        if (this.f81316c >= this.f81319f.size()) {
            return false;
        }
        String str2 = this.f81319f.get(this.f81316c);
        Intrinsics.checkExpressionValueIsNotNull(str2, "mRepeatRules[repeatChosenIndex]");
        if (StringsKt.indexOf$default((CharSequence) str2, "BYMONTHDAY=", 0, false, 4, (Object) null) == -1) {
            return false;
        }
        String str3 = this.f81319f.get(this.f81316c);
        if (str3 == null || (str = StringsKt.substringAfter$default(str3, "BYMONTHDAY=", (String) null, 2, (Object) null)) == null) {
            str = "";
        }
        if (StringsKt.indexOf$default((CharSequence) str, ",", 0, false, 4, (Object) null) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo116319c(int i) {
        this.f81323j = i;
    }

    /* renamed from: a */
    public final void mo116308a(int i) {
        this.f81316c = i;
    }

    /* renamed from: b */
    public final void mo116315b(int i) {
        this.f81322i = i;
    }

    /* renamed from: d */
    public final void mo116322d(int i) {
        this.f81324k = i;
    }

    /* renamed from: a */
    public final void mo116311a(boolean z) {
        this.f81321h = z;
    }

    /* renamed from: a */
    public final void mo116309a(EventRecurrence eventRecurrence) {
        Intrinsics.checkParameterIsNotNull(eventRecurrence, "customRRule");
        this.f81320g = new RepeatMode(eventRecurrence);
        String eventRecurrence2 = eventRecurrence.toString();
        Intrinsics.checkExpressionValueIsNotNull(eventRecurrence2, "customRRule.toString()");
        m121206c(eventRecurrence2);
    }

    /* renamed from: b */
    public final void mo116316b(CalendarDate calendarDate) {
        this.f81321h = false;
        if (calendarDate != null) {
            this.f81322i = calendarDate.getYear();
            this.f81323j = calendarDate.getMonth();
            this.f81324k = calendarDate.getMonthDay();
        }
    }

    /* renamed from: c */
    private final void m121206c(String str) {
        if (this.f81318e) {
            ArrayList<String> arrayList = this.f81319f;
            arrayList.remove(arrayList.size() - 1);
            ArrayList<String> arrayList2 = this.f81315b;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.f81319f.add(str);
        this.f81315b.add(C32632ac.m125172c(str));
        this.f81316c = this.f81319f.size() - 1;
        this.f81318e = true;
    }

    /* renamed from: b */
    public final void mo116317b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        CalendarDate a = C32632ac.m125170a(str);
        if (a == null) {
            this.f81321h = true;
            return;
        }
        this.f81321h = false;
        this.f81322i = a.getYear();
        this.f81323j = a.getMonth();
        this.f81324k = a.getMonthDay();
    }

    /* renamed from: d */
    private final void m121207d(String str) {
        String c = C32632ac.m125172c(str);
        if (this.f81315b.contains(c)) {
            this.f81316c = this.f81315b.indexOf(c);
            return;
        }
        String str2 = str;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) ";UNTIL=", false, 2, (Object) null)) {
            ArrayList<String> arrayList = this.f81319f;
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, ";UNTIL=", 0, false, 6, (Object) null);
            if (str != null) {
                String substring = str.substring(0, indexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            this.f81319f.add(str);
        }
        this.f81316c = this.f81319f.size() - 1;
        this.f81315b.add(c);
        this.f81320g = C32632ac.m125174e(str);
        this.f81318e = true;
    }

    /* renamed from: a */
    public final void mo116310a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) ";COUNT=", false, 2, (Object) null)) {
            this.f81317d = true;
            this.f81315b.add(C32632ac.m125171b(str));
            this.f81319f.add(str);
            this.f81316c = this.f81315b.size() - 1;
            this.f81320g = C32632ac.m125174e(str);
            this.f81318e = true;
            return;
        }
        this.f81317d = false;
        m121207d(str);
    }

    /* renamed from: a */
    public final boolean mo116312a(CalendarDate calendarDate) {
        if (calendarDate == null) {
            return true;
        }
        if (mo116326h() && this.f81321h) {
            return false;
        }
        CalendarDate calendarDate2 = new CalendarDate();
        calendarDate2.setTimeInSeconds((calendarDate2.getTimeInSeconds() / 86400) * 86400);
        calendarDate2.setYear(this.f81322i);
        calendarDate2.setMonth(this.f81323j);
        calendarDate2.setMonthDay(this.f81324k);
        if (calendarDate.getJulianDay() >= calendarDate2.getJulianDay()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo116318b(CalendarDate calendarDate, CalendarDate calendarDate2) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "originalEventStartDate");
        if (calendarDate2 == null || calendarDate2.getJulianDay() >= calendarDate.getJulianDay()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo116313a(com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate r7, com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate r8) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.part.EditRepeatPart.mo116313a(com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate, com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate):boolean");
    }

    /* renamed from: a */
    public final RepeatEndFragmentData mo116306a(CalendarDate calendarDate, int i, MeetingRoomLimitData iVar) {
        CalendarDate calendarDate2;
        String str;
        Intrinsics.checkParameterIsNotNull(calendarDate, "eventStartDate");
        if (iVar != null) {
            calendarDate2 = iVar.mo116397a();
        } else {
            calendarDate2 = null;
        }
        if (iVar != null) {
            str = iVar.mo116398b();
        } else {
            str = null;
        }
        return new RepeatEndFragmentData(calendarDate, calendarDate2, str, i, this.f81321h, this.f81322i, this.f81323j, this.f81324k);
    }
}
