package com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.data.TimeData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeLocalTimeAdapter.AttendeeLocalTimeData;
import com.ss.android.lark.calendar.impl.features.events.edit.utils.EventTimeZoneUtils;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001[B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u0016H\u0016J\b\u00107\u001a\u00020\nH\u0016J\b\u00108\u001a\u00020\u0016H\u0016J\b\u00109\u001a\u00020\u001aH\u0016J\b\u0010:\u001a\u00020\u0010H\u0016J\b\u0010;\u001a\u00020\u0016H\u0016J\u0018\u0010<\u001a\u0012\u0012\u0004\u0012\u00020=0\u001fj\b\u0012\u0004\u0012\u00020=`!H\u0016J\b\u0010>\u001a\u00020\nH\u0016J\b\u0010?\u001a\u00020\u0007H\u0016J\b\u0010@\u001a\u00020\u0005H\u0016J\b\u0010A\u001a\u00020\u0016H\u0016J\b\u0010B\u001a\u00020\u0002H\u0016J\u0010\u0010C\u001a\u0002052\u0006\u0010D\u001a\u00020\u0005H\u0016J\b\u0010E\u001a\u00020\u0007H\u0016J\b\u0010F\u001a\u00020\u0007H\u0016J\b\u0010G\u001a\u00020\u0007H\u0016J\b\u0010H\u001a\u00020\u0007H\u0016J\u0010\u0010I\u001a\u0002052\u0006\u0010J\u001a\u00020\u0016H\u0016J\u0010\u0010K\u001a\u0002052\u0006\u0010L\u001a\u00020\nH\u0016J\u0010\u0010M\u001a\u0002052\u0006\u0010J\u001a\u00020\u0016H\u0016J\u0010\u0010N\u001a\u0002052\u0006\u0010J\u001a\u00020\u0016H\u0016J\u0010\u0010O\u001a\u0002052\u0006\u0010E\u001a\u00020\u0007H\u0016J\u0010\u0010P\u001a\u0002052\u0006\u0010F\u001a\u00020\u0007H\u0016J\u0010\u0010Q\u001a\u0002052\u0006\u0010L\u001a\u00020\nH\u0016J\u0018\u0010R\u001a\u0002052\u0006\u0010D\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0007H\u0016J\u0010\u0010S\u001a\u0002052\u0006\u0010J\u001a\u00020\u0016H\u0016J\b\u0010T\u001a\u000205H\u0016J\b\u0010U\u001a\u000205H\u0016J\u0010\u0010V\u001a\u0002052\u0006\u0010W\u001a\u00020\u0010H\u0016J\b\u0010X\u001a\u000205H\u0016J\b\u0010Y\u001a\u000205H\u0002J\b\u0010Z\u001a\u000205H\u0016R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006\\"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeModelApi;", "mOriginalTimeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;", "mOriginalIsChosenStartTime", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;Z)V", "eventOriginalTime", "", "getEventOriginalTime", "()J", "setEventOriginalTime", "(J)V", "eventRRule", "", "getEventRRule", "()Ljava/lang/String;", "setEventRRule", "(Ljava/lang/String;)V", "mAllDayEndCalendar", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mAllDayEventInterval", "mAllDayStartCalendar", "mCurrentTimeZone", "Ljava/util/TimeZone;", "mCurrentTimeZoneId", "mEndCalendar", "mEventInterval", "mFilteredDisplayAttendeeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "Lkotlin/collections/ArrayList;", "mIsAllDay", "mIsChosenStartTime", "mIsNeedShowGuests", "getMOriginalIsChosenStartTime", "()Z", "setMOriginalIsChosenStartTime", "(Z)V", "getMOriginalTimeData", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;", "setMOriginalTimeData", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;)V", "mStartCalendar", "originalEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "getOriginalEvent", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "setOriginalEvent", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;)V", "create", "", "getAllDayEndCalendar", "getAllDayEventInterval", "getAllDayStartCalendar", "getCurrentTimeZone", "getCurrentTimeZoneId", "getEndCalendar", "getMeetingRoomContainerList", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getNormalEventInterval", "getOriginalIsChosenStartTime", "getOriginalTimeData", "getStartCalendar", "getViewData", "initDataByTimeData", "timeData", "isAllDay", "isChosenStartTime", "isEventTimeInvalidate", "isNeedShowGuests", "setAllDayEndCalendar", "calendar", "setAllDayEventInterval", "interval", "setAllDayStartCalendar", "setEndCalendar", "setIsAllDay", "setIsChosenStartTime", "setNormalEventInterval", "setOriginalData", "setStartCalendar", "updateAllDayCalendarByToggle", "updateCalendarByTimeZone", "updateCurrentTimeZone", "timeZoneId", "updateEventIntervalByTimeZone", "updateIsNeedShowGuest", "updateNormalCalendarByToggle", "EditMultiTimeViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.b */
public final class EditMultiTimeModel extends BaseModelCalendar<EditMultiTimeContract.IEditMultiTimeViewData> implements EditMultiTimeContract.IEditMultiTimeModelApi {

    /* renamed from: a */
    public boolean f80510a;

    /* renamed from: b */
    public CalendarDate f80511b = new CalendarDate();

    /* renamed from: c */
    public CalendarDate f80512c = new CalendarDate();

    /* renamed from: d */
    public CalendarDate f80513d = new CalendarDate();

    /* renamed from: e */
    public CalendarDate f80514e = new CalendarDate();

    /* renamed from: f */
    public boolean f80515f = true;

    /* renamed from: g */
    public boolean f80516g;

    /* renamed from: h */
    public String f80517h;

    /* renamed from: i */
    public TimeZone f80518i;

    /* renamed from: j */
    public ArrayList<UserAttendeeBaseInfo> f80519j;

    /* renamed from: k */
    private long f80520k;

    /* renamed from: l */
    private long f80521l;

    /* renamed from: m */
    private long f80522m;

    /* renamed from: n */
    private String f80523n;

    /* renamed from: o */
    private CalendarEvent f80524o;

    /* renamed from: p */
    private TimeData f80525p;

    /* renamed from: q */
    private boolean f80526q;

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public long mo115357a() {
        return this.f80522m;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: b */
    public String mo115364b() {
        return this.f80523n;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: c */
    public CalendarEvent mo115368c() {
        return this.f80524o;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: d */
    public boolean mo115371d() {
        return this.f80510a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: e */
    public CalendarDate mo115372e() {
        return this.f80513d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: g */
    public CalendarDate mo115373g() {
        return this.f80511b;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: h */
    public CalendarDate mo115374h() {
        return this.f80512c;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: i */
    public CalendarDate mo115375i() {
        return this.f80514e;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: k */
    public String mo115377k() {
        return this.f80517h;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: l */
    public TimeZone mo115378l() {
        return this.f80518i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: m */
    public long mo115379m() {
        return this.f80521l;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: n */
    public long mo115380n() {
        return this.f80520k;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: o */
    public boolean mo115381o() {
        return this.f80515f;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: u */
    public TimeData mo115387u() {
        return this.f80525p;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: v */
    public boolean mo115388v() {
        return this.f80526q;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeModel$EditMultiTimeViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeModel;)V", "getAllDayEndCalendar", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getAllDayStartCalendar", "getAttendeeLocalTimeData", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeLocalTimeAdapter/AttendeeLocalTimeData;", "getCurrentTimeZone", "Ljava/util/TimeZone;", "getCurrentTimeZoneId", "", "getEndCalendar", "getStartCalendar", "isAllDay", "", "isChosenStartTime", "isEventTimeInvalidate", "isNeedShowGuests", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.b$a */
    public final class EditMultiTimeViewData implements EditMultiTimeContract.IEditMultiTimeViewData {
        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: a */
        public boolean mo115412a() {
            return EditMultiTimeModel.this.f80510a;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: b */
        public CalendarDate mo115413b() {
            return EditMultiTimeModel.this.f80513d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: c */
        public CalendarDate mo115414c() {
            return EditMultiTimeModel.this.f80511b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: d */
        public CalendarDate mo115415d() {
            return EditMultiTimeModel.this.f80512c;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: e */
        public CalendarDate mo115416e() {
            return EditMultiTimeModel.this.f80514e;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: g */
        public TimeZone mo115418g() {
            return EditMultiTimeModel.this.f80518i;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: h */
        public String mo115419h() {
            return EditMultiTimeModel.this.f80517h;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: j */
        public boolean mo115421j() {
            return EditMultiTimeModel.this.f80515f;
        }

        /* renamed from: k */
        public boolean mo115444k() {
            EditMultiTimeModel.this.mo115443x();
            return EditMultiTimeModel.this.f80516g;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: f */
        public boolean mo115417f() {
            if (EditMultiTimeModel.this.f80510a) {
                return EditMultiTimeModel.this.f80514e.before(EditMultiTimeModel.this.f80513d);
            }
            return EditMultiTimeModel.this.f80512c.before(EditMultiTimeModel.this.f80511b);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeViewData
        /* renamed from: i */
        public List<AttendeeLocalTimeData> mo115420i() {
            boolean z;
            ArrayList arrayList = new ArrayList();
            if (!mo115444k()) {
                return arrayList;
            }
            List<List<UserAttendeeBaseInfo>> c = EventTimeZoneUtils.f80188a.mo114874c(EditMultiTimeModel.this.f80519j, EditMultiTimeModel.this.f80511b.getTimeInMilliSeconds());
            if (CollectionUtils.isEmpty(c)) {
                return arrayList;
            }
            AttendeeLocalTimeData aVar = new AttendeeLocalTimeData(EditMultiTimeModel.this.f80511b.getTimeInMilliSeconds(), EditMultiTimeModel.this.f80512c.getTimeInMilliSeconds(), true, c.get(0), null, false, 48, null);
            aVar.mo115447a(!C26279i.m95157a(EditMultiTimeModel.this.f80511b.getTimeInMilliSeconds(), EditMultiTimeModel.this.f80512c.getTimeInMilliSeconds(), TimeZone.getDefault()));
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            String id = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
            aVar.mo115446a(id);
            arrayList.add(aVar);
            int size = c.size();
            for (int i = 1; i < size; i++) {
                if (!CollectionUtils.isEmpty(c.get(i))) {
                    AttendeeLocalTimeData aVar2 = new AttendeeLocalTimeData(EditMultiTimeModel.this.f80511b.getTimeInMilliSeconds(), EditMultiTimeModel.this.f80512c.getTimeInMilliSeconds(), false, c.get(i), null, false, 48, null);
                    String timeZoneId = c.get(i).get(0).getTimeZoneId();
                    String str = timeZoneId;
                    if (str == null || str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        aVar2.mo115446a(timeZoneId);
                        aVar2.mo115447a(!C26279i.m95157a(EditMultiTimeModel.this.f80511b.getTimeInMilliSeconds(), EditMultiTimeModel.this.f80512c.getTimeInMilliSeconds(), TimeZone.getTimeZone(timeZoneId)));
                    }
                    arrayList.add(aVar2);
                }
            }
            return arrayList;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public EditMultiTimeViewData() {
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: t */
    public ArrayList<CalendarEventAttendee> mo115386t() {
        return this.f80525p.getChosenMeetingRoomList();
    }

    /* renamed from: w */
    public EditMultiTimeContract.IEditMultiTimeViewData mo109793f() {
        return new EditMultiTimeViewData();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: s */
    public void mo115385s() {
        this.f80520k = this.f80512c.getTimeInSeconds() - this.f80511b.getTimeInSeconds();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: j */
    public boolean mo115376j() {
        if (this.f80510a) {
            return this.f80514e.before(this.f80513d);
        }
        return this.f80512c.before(this.f80511b);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: r */
    public void mo115384r() {
        this.f80511b = new CalendarDate(this.f80511b, this.f80518i);
        this.f80512c = new CalendarDate(this.f80512c, this.f80518i);
    }

    /* renamed from: x */
    public final void mo115443x() {
        boolean z = false;
        if (this.f80510a || CollectionUtils.isEmpty(this.f80519j)) {
            this.f80516g = false;
            return;
        }
        boolean a = EventTimeZoneUtils.f80188a.mo114872a(this.f80519j, this.f80511b.getTimeInSeconds());
        String str = this.f80517h;
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        if ((!Intrinsics.areEqual(str, timeZone.getID())) || a) {
            z = true;
        }
        this.f80516g = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: p */
    public void mo115382p() {
        this.f80513d.setYear(this.f80511b.getYear());
        this.f80513d.setMonth(this.f80511b.getMonth());
        this.f80513d.setMonthDay(this.f80511b.getMonthDay());
        this.f80514e.setYear(this.f80512c.getYear());
        this.f80514e.setMonth(this.f80512c.getMonth());
        this.f80514e.setMonthDay(this.f80512c.getMonthDay());
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: q */
    public void mo115383q() {
        this.f80511b.setYear(this.f80513d.getYear());
        this.f80511b.setMonth(this.f80513d.getMonth());
        this.f80511b.setMonthDay(this.f80513d.getMonthDay());
        this.f80512c.setYear(this.f80514e.getYear());
        this.f80512c.setMonth(this.f80514e.getMonth());
        this.f80512c.setMonthDay(this.f80514e.getMonthDay());
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo115358a(long j) {
        this.f80521l = j;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: b */
    public void mo115365b(long j) {
        this.f80520k = j;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: c */
    public void mo115369c(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "calendar");
        this.f80511b = calendarDate;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: d */
    public void mo115370d(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "calendar");
        this.f80512c = calendarDate;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo115359a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "calendar");
        this.f80513d = calendarDate;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: b */
    public void mo115366b(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "calendar");
        this.f80514e = calendarDate;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: b */
    public void mo115367b(boolean z) {
        this.f80515f = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo115362a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        if (!TextUtils.isEmpty(str)) {
            this.f80517h = str;
            TimeZone timeZone = TimeZone.getTimeZone(str);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(mCurrentTimeZoneId)");
            this.f80518i = timeZone;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo115363a(boolean z) {
        this.f80510a = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo115360a(TimeData timeData) {
        Intrinsics.checkParameterIsNotNull(timeData, "timeData");
        mo115362a(timeData.getTimeZoneId());
        CalendarDate calendarDate = new CalendarDate(this.f80518i);
        this.f80511b = calendarDate;
        calendarDate.setTimeInSeconds(timeData.getStartTime());
        CalendarDate calendarDate2 = new CalendarDate(this.f80518i);
        this.f80512c = calendarDate2;
        calendarDate2.setTimeInSeconds(timeData.getEndTime());
        CalendarDate calendarDate3 = new CalendarDate();
        this.f80513d = calendarDate3;
        calendarDate3.setTimeInSeconds(timeData.getStartTime());
        CalendarDate moveToDayStart = this.f80513d.moveToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "mAllDayStartCalendar.moveToDayStart()");
        this.f80513d = moveToDayStart;
        CalendarDate calendarDate4 = new CalendarDate();
        this.f80514e = calendarDate4;
        calendarDate4.setTimeInSeconds(timeData.getEndTime());
        CalendarDate moveToDayEnd = this.f80514e.moveToDayEnd();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd, "mAllDayEndCalendar.moveToDayEnd()");
        this.f80514e = moveToDayEnd;
        this.f80510a = timeData.isAllDay();
        this.f80520k = this.f80512c.getTimeInSeconds() - this.f80511b.getTimeInSeconds();
        this.f80521l = this.f80514e.getTimeInSeconds() - this.f80513d.getTimeInSeconds();
        this.f80519j = timeData.getFilterDisplayAttendeeList();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.EditMultiTimeContract.IEditMultiTimeModelApi
    /* renamed from: a */
    public void mo115361a(TimeData timeData, boolean z) {
        Intrinsics.checkParameterIsNotNull(timeData, "timeData");
        this.f80525p = timeData;
        this.f80526q = z;
    }

    public EditMultiTimeModel(TimeData timeData, boolean z) {
        Intrinsics.checkParameterIsNotNull(timeData, "mOriginalTimeData");
        this.f80525p = timeData;
        this.f80526q = z;
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        this.f80517h = id;
        TimeZone timeZone2 = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getDefault()");
        this.f80518i = timeZone2;
        this.f80519j = new ArrayList<>();
        this.f80522m = this.f80525p.getEventOriginalTime();
        this.f80523n = this.f80525p.getEventRRule();
        this.f80524o = this.f80525p.getOriginalEvent();
        mo115360a(this.f80525p);
        mo115367b(this.f80526q);
    }
}
