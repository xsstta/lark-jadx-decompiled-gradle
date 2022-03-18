package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.text.TextUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mail.impl.widget.time.CalendarDate;
import com.ss.android.lark.mail.impl.widget.time.EditMultiTimeFragment;
import com.ss.android.lark.mail.impl.widget.time.TimeData;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract;
import com.ss.android.lark.mail.impl.widget.time.mvp.BaseModelCalendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001?B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\bH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0002H\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0015H\u0016J\b\u0010)\u001a\u00020\u0015H\u0016J\b\u0010*\u001a\u00020\u0015H\u0016J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\bH\u0016J\u0010\u0010/\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u0010\u00100\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u00010\u000bJ\u0010\u00102\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u0010\u00103\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0015H\u0016J\u0010\u00104\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\bH\u0016J\u0010\u00105\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u0010\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u0018H\u0016J\b\u00108\u001a\u00020\u001aH\u0016J\b\u00109\u001a\u00020\u001aH\u0016J\u0010\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u0011H\u0016J\b\u0010<\u001a\u00020\u001aH\u0016J\b\u0010=\u001a\u00020\u001aH\u0016J\u0010\u0010>\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeModel;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/BaseModelCalendar;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeModelApi;", "()V", "mAllDayEndCalendar", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "mAllDayEventInterval", "", "mAllDayStartCalendar", "mCheckInvalidTime", "Lcom/ss/android/lark/mail/impl/widget/time/EditMultiTimeFragment$CheckInvalidTime;", "mCurrentCalendar", "mCurrentTime", "mCurrentTimeZone", "Ljava/util/TimeZone;", "mCurrentTimeZoneId", "", "mEndCalendar", "mEventInterval", "mIsAllDay", "", "mStartCalendar", "mType", "", "create", "", "getAllDayEndCalendar", "getAllDayEventInterval", "getAllDayStartCalendar", "getCurrentTimeZone", "getCurrentTimeZoneId", "getEndCalendar", "getNormalEventInterval", "getStartCalendar", "getTimeType", "getViewData", "initDataByTimeData", "timeData", "Lcom/ss/android/lark/mail/impl/widget/time/TimeData;", "isAllDay", "isEventTimeCurrentInvalidate", "isEventTimeInvalidate", "setAllDayEndCalendar", "calendar", "setAllDayEventInterval", "interval", "setAllDayStartCalendar", "setCheckInvalidTime", "checkInvalidTime", "setEndCalendar", "setIsAllDay", "setNormalEventInterval", "setStartCalendar", "setTimeType", ShareHitPoint.f121869d, "updateAllDayCalendarByToggle", "updateCalendarByTimeZone", "updateCurrentTimeZone", "timeZoneId", "updateEventIntervalByTimeZone", "updateNormalCalendarByToggle", "updateTimeDataToCurrent", "EditMultiTimeViewData", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.c */
public final class EditMultiTimeModel extends BaseModelCalendar<EditMultiTimeContract.IEditMultiTimeViewData> implements EditMultiTimeContract.IEditMultiTimeModelApi {

    /* renamed from: a */
    public boolean f111999a;

    /* renamed from: b */
    public CalendarDate f112000b = new CalendarDate();

    /* renamed from: c */
    public CalendarDate f112001c = new CalendarDate();

    /* renamed from: d */
    public CalendarDate f112002d = new CalendarDate();

    /* renamed from: e */
    public CalendarDate f112003e = new CalendarDate();

    /* renamed from: f */
    public CalendarDate f112004f = new CalendarDate();

    /* renamed from: g */
    public int f112005g;

    /* renamed from: h */
    public String f112006h;

    /* renamed from: i */
    public TimeZone f112007i;

    /* renamed from: j */
    public long f112008j;

    /* renamed from: k */
    public EditMultiTimeFragment.CheckInvalidTime f112009k;

    /* renamed from: l */
    private long f112010l;

    /* renamed from: m */
    private long f112011m;

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: b */
    public CalendarDate mo156961b() {
        return this.f112002d;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: c */
    public CalendarDate mo156964c() {
        return this.f112000b;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.mvp.BaseModelCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: d */
    public CalendarDate mo156966d() {
        return this.f112001c;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: e */
    public CalendarDate mo156968e() {
        return this.f112003e;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: h */
    public String mo156971h() {
        return this.f112006h;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: i */
    public TimeZone mo156972i() {
        return this.f112007i;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: j */
    public long mo156973j() {
        return this.f112010l;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: k */
    public int mo156974k() {
        return this.f112005g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeModel$EditMultiTimeViewData;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "(Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeModel;)V", "getAllDayEndCalendar", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "getAllDayStartCalendar", "getCurrentDate", "getCurrentTimeZone", "Ljava/util/TimeZone;", "getCurrentTimeZoneId", "", "getEndCalendar", "getStartCalendar", "getTimeType", "", "isAllDay", "", "isChoosePastTime", "isEventTimeInvalidate", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.c$a */
    public final class EditMultiTimeViewData implements EditMultiTimeContract.IEditMultiTimeViewData {
        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: a */
        public boolean mo156999a() {
            return EditMultiTimeModel.this.f111999a;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: b */
        public CalendarDate mo157000b() {
            return EditMultiTimeModel.this.f112002d;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: c */
        public CalendarDate mo157001c() {
            return EditMultiTimeModel.this.f112000b;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: d */
        public CalendarDate mo157002d() {
            return EditMultiTimeModel.this.f112001c;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: e */
        public CalendarDate mo157003e() {
            return EditMultiTimeModel.this.f112003e;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: i */
        public TimeZone mo157007i() {
            return EditMultiTimeModel.this.f112007i;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: j */
        public String mo157008j() {
            return EditMultiTimeModel.this.f112006h;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: k */
        public int mo157009k() {
            return EditMultiTimeModel.this.f112005g;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: h */
        public CalendarDate mo157006h() {
            int i = EditMultiTimeModel.this.f112005g;
            if (i == 0 || i == 1) {
                return EditMultiTimeModel.this.f112004f;
            }
            EditMultiTimeFragment.CheckInvalidTime aVar = EditMultiTimeModel.this.f112009k;
            if (aVar == null) {
                return new CalendarDate(EditMultiTimeModel.this.f112007i);
            }
            CalendarDate calendarDate = new CalendarDate(EditMultiTimeModel.this.f112007i);
            calendarDate.setTimeInSeconds(aVar.mo150686a() / ((long) 1000));
            return calendarDate;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2 A[RETURN, SYNTHETIC] */
        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo157004f() {
            /*
            // Method dump skipped, instructions count: 177
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeModel.EditMultiTimeViewData.mo157004f():boolean");
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x007d A[RETURN, SYNTHETIC] */
        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo157005g() {
            /*
            // Method dump skipped, instructions count: 153
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeModel.EditMultiTimeViewData.mo157005g():boolean");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public EditMultiTimeViewData() {
        }
    }

    /* renamed from: p */
    public EditMultiTimeContract.IEditMultiTimeViewData mo156858q() {
        return new EditMultiTimeViewData();
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: o */
    public void mo156978o() {
        this.f112010l = this.f112001c.getTimeInSeconds() - this.f112000b.getTimeInSeconds();
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: f */
    public boolean mo156969f() {
        if (this.f111999a) {
            return this.f112003e.before(this.f112002d);
        }
        return this.f112001c.before(this.f112000b);
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: n */
    public void mo156977n() {
        this.f112000b = new CalendarDate(this.f112000b, this.f112007i);
        this.f112001c = new CalendarDate(this.f112001c, this.f112007i);
    }

    public EditMultiTimeModel() {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        this.f112006h = id;
        TimeZone timeZone2 = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getDefault()");
        this.f112007i = timeZone2;
        this.f112008j = System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo156970g() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeModel.mo156970g():boolean");
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: l */
    public void mo156975l() {
        this.f112002d.setYear(this.f112000b.getYear());
        this.f112002d.setMonth(this.f112000b.getMonth());
        this.f112002d.setMonthDay(this.f112000b.getMonthDay());
        this.f112003e.setYear(this.f112001c.getYear());
        this.f112003e.setMonth(this.f112001c.getMonth());
        this.f112003e.setMonthDay(this.f112001c.getMonthDay());
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: m */
    public void mo156976m() {
        this.f112000b.setYear(this.f112002d.getYear());
        this.f112000b.setMonth(this.f112002d.getMonth());
        this.f112000b.setMonthDay(this.f112002d.getMonthDay());
        this.f112001c.setYear(this.f112003e.getYear());
        this.f112001c.setMonth(this.f112003e.getMonth());
        this.f112001c.setMonthDay(this.f112003e.getMonthDay());
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public boolean mo156960a() {
        return this.f111999a;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo156954a(int i) {
        this.f112005g = i;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo156955a(long j) {
        this.f112011m = j;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: b */
    public void mo156962b(long j) {
        this.f112010l = j;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: c */
    public void mo156965c(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "calendar");
        this.f112000b = calendarDate;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: d */
    public void mo156967d(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "calendar");
        this.f112001c = calendarDate;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo156956a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "calendar");
        this.f112002d = calendarDate;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: b */
    public void mo156963b(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "calendar");
        this.f112003e = calendarDate;
    }

    /* renamed from: b */
    private final void m174758b(TimeData timeData) {
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        if (timeData.getStartTime() < currentTimeMillis) {
            timeData.setStartTime(currentTimeMillis);
        }
        if (timeData.getEndTime() < currentTimeMillis) {
            timeData.setEndTime(currentTimeMillis);
        }
    }

    /* renamed from: a */
    public final void mo157010a(EditMultiTimeFragment.CheckInvalidTime aVar) {
        this.f112009k = aVar;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo156958a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        if (!TextUtils.isEmpty(str)) {
            this.f112006h = str;
            TimeZone timeZone = TimeZone.getTimeZone(str);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(mCurrentTimeZoneId)");
            this.f112007i = timeZone;
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo156959a(boolean z) {
        this.f111999a = z;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo156957a(TimeData timeData) {
        Intrinsics.checkParameterIsNotNull(timeData, "timeData");
        this.f112008j = System.currentTimeMillis() / ((long) 1000);
        mo156958a(timeData.getTimeZoneId());
        m174758b(timeData);
        CalendarDate calendarDate = new CalendarDate(this.f112007i);
        this.f112000b = calendarDate;
        calendarDate.setTimeInSeconds(timeData.getStartTime());
        CalendarDate calendarDate2 = new CalendarDate(this.f112007i);
        this.f112001c = calendarDate2;
        calendarDate2.setTimeInSeconds(timeData.getEndTime());
        CalendarDate calendarDate3 = new CalendarDate();
        this.f112002d = calendarDate3;
        calendarDate3.setTimeInSeconds(timeData.getStartTime());
        CalendarDate moveToDayStart = this.f112002d.moveToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "mAllDayStartCalendar.moveToDayStart()");
        this.f112002d = moveToDayStart;
        CalendarDate calendarDate4 = new CalendarDate();
        this.f112003e = calendarDate4;
        calendarDate4.setTimeInSeconds(timeData.getEndTime());
        CalendarDate moveToDayEnd = this.f112003e.moveToDayEnd();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd, "mAllDayEndCalendar.moveToDayEnd()");
        this.f112003e = moveToDayEnd;
        this.f111999a = timeData.isAllDay();
        this.f112010l = this.f112001c.getTimeInSeconds() - this.f112000b.getTimeInSeconds();
        this.f112011m = this.f112003e.getTimeInSeconds() - this.f112002d.getTimeInSeconds();
    }
}
