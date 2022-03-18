package com.ss.android.lark.calendar.impl.features.arrange.base;

import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesSlotMetric;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 X2\u00020\u0001:\u0001XB\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\u000e\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020\u0005J\u0006\u0010N\u001a\u00020JJ\u000e\u0010O\u001a\u00020J2\u0006\u0010P\u001a\u000201J\u001c\u0010Q\u001a\u00020J2\u0014\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020F\u0018\u00010\u0004J\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T2\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010TR&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R-\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R!\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"RL\u0010#\u001a4\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000b0\u0013j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020$0\u000bj\b\u0012\u0004\u0012\u00020$`\r`\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001a\u00100\u001a\u000201X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u001a\u00109\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010 \"\u0004\b;\u0010\"R\u001a\u0010<\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010 \"\u0004\b>\u0010\"R\u001a\u0010?\u001a\u00020@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020F0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\t¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/base/ArrangeBaseModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "()V", "mAttendeeTimeZone", "", "", "getMAttendeeTimeZone", "()Ljava/util/Map;", "setMAttendeeTimeZone", "(Ljava/util/Map;)V", "mAttendees", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "Lkotlin/collections/ArrayList;", "getMAttendees", "()Ljava/util/ArrayList;", "setMAttendees", "(Ljava/util/ArrayList;)V", "mCalendarDisplayNameMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getMCalendarDisplayNameMap", "()Ljava/util/HashMap;", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarEventService;", "mCalendarIds", "getMCalendarIds", "mCalendarService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarInternalService;", "mEndTime", "", "getMEndTime", "()J", "setMEndTime", "(J)V", "mEventChipViewDataMap", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "getMEventChipViewDataMap", "setMEventChipViewDataMap", "(Ljava/util/HashMap;)V", "mEventServerId", "getMEventServerId", "()Ljava/lang/String;", "setMEventServerId", "(Ljava/lang/String;)V", "mInstanceKey", "getMInstanceKey", "setMInstanceKey", "mIsLoadDataError", "", "getMIsLoadDataError", "()Z", "setMIsLoadDataError", "(Z)V", "mOrganizerCalendarId", "getMOrganizerCalendarId", "setMOrganizerCalendarId", "mOriginalTime", "getMOriginalTime", "setMOriginalTime", "mStartTime", "getMStartTime", "setMStartTime", "mViewTimeZone", "Ljava/util/TimeZone;", "getMViewTimeZone", "()Ljava/util/TimeZone;", "setMViewTimeZone", "(Ljava/util/TimeZone;)V", "mWorkHourMap", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "getMWorkHourMap", "setMWorkHourMap", "getBaseEventInstanceData", "", "callback", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadEventInstances;", "getBaseOrganizerCalendarId", "initAttendeeCalendarIds", "setIsLoadDataError", "isLoadDataError", "setWorkHourMap", "workHourMap", "syncGetInstancesLayout", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DayInstancesLayout;", "slotMetrics", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DayInstancesSlotMetric;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.a.a */
public class ArrangeBaseModel extends BaseModel {

    /* renamed from: f */
    public static final Companion f75026f = new Companion(null);

    /* renamed from: a */
    private AbstractC32595g f75027a;

    /* renamed from: b */
    private AbstractC32594f f75028b;

    /* renamed from: c */
    private ArrayList<AbstractC30095b> f75029c = new ArrayList<>();

    /* renamed from: d */
    private long f75030d;

    /* renamed from: e */
    private long f75031e;

    /* renamed from: g */
    private TimeZone f75032g;

    /* renamed from: h */
    private boolean f75033h;

    /* renamed from: i */
    private final HashMap<String, String> f75034i;

    /* renamed from: j */
    private final ArrayList<String> f75035j;

    /* renamed from: k */
    private String f75036k;

    /* renamed from: l */
    private String f75037l;

    /* renamed from: m */
    private String f75038m;

    /* renamed from: n */
    private long f75039n;

    /* renamed from: o */
    private HashMap<String, ArrayList<DayEventChipViewData>> f75040o;

    /* renamed from: p */
    private Map<String, String> f75041p;

    /* renamed from: q */
    private Map<String, CalendarWorkHourSetting> f75042q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/base/ArrangeBaseModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: A */
    public final ArrayList<String> mo108466A() {
        return this.f75035j;
    }

    /* renamed from: B */
    public final String mo108467B() {
        return this.f75036k;
    }

    /* renamed from: C */
    public final HashMap<String, ArrayList<DayEventChipViewData>> mo108468C() {
        return this.f75040o;
    }

    /* renamed from: D */
    public final Map<String, String> mo108469D() {
        return this.f75041p;
    }

    /* renamed from: E */
    public final Map<String, CalendarWorkHourSetting> mo108470E() {
        return this.f75042q;
    }

    /* renamed from: G */
    public final String mo108472G() {
        return this.f75036k;
    }

    /* renamed from: u */
    public final ArrayList<AbstractC30095b> mo108487u() {
        return this.f75029c;
    }

    /* renamed from: v */
    public final long mo108488v() {
        return this.f75030d;
    }

    /* renamed from: w */
    public final long mo108489w() {
        return this.f75031e;
    }

    /* renamed from: x */
    public final TimeZone mo108490x() {
        return this.f75032g;
    }

    /* renamed from: y */
    public final boolean mo108491y() {
        return this.f75033h;
    }

    /* renamed from: z */
    public final HashMap<String, String> mo108492z() {
        return this.f75034i;
    }

    /* renamed from: F */
    public final void mo108471F() {
        Iterator<AbstractC30095b> it = this.f75029c.iterator();
        while (it.hasNext()) {
            AbstractC30095b next = it.next();
            String attendeeCalendarId = next.getAttendeeCalendarId();
            Intrinsics.checkExpressionValueIsNotNull(attendeeCalendarId, "attendee.getAttendeeCalendarId()");
            String localizedDisplayName = next.getLocalizedDisplayName();
            Intrinsics.checkExpressionValueIsNotNull(localizedDisplayName, "attendee.getLocalizedDisplayName()");
            this.f75034i.put(attendeeCalendarId, localizedDisplayName);
            this.f75035j.add(next.getAttendeeCalendarId());
        }
    }

    public ArrangeBaseModel() {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        this.f75032g = timeZone;
        this.f75034i = new HashMap<>();
        this.f75035j = new ArrayList<>();
        this.f75036k = "";
        this.f75037l = "null";
        this.f75038m = "null";
        this.f75039n = -1;
        this.f75040o = new HashMap<>();
        this.f75041p = new HashMap();
        this.f75042q = new HashMap();
        C32583e a = C32583e.m124816a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarService.getInstance()");
        this.f75027a = a;
        C32533b a2 = C32533b.m124620a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarEventService.getInstance()");
        this.f75028b = a2;
    }

    /* renamed from: a */
    public final void mo108473a(long j) {
        this.f75030d = j;
    }

    /* renamed from: b */
    public final void mo108478b(long j) {
        this.f75031e = j;
    }

    /* renamed from: c */
    public final void mo108484c(long j) {
        this.f75039n = j;
    }

    /* renamed from: a */
    public final void mo108474a(Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.f75041p = map;
    }

    /* renamed from: b */
    public final void mo108480b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f75036k = str;
    }

    /* renamed from: c */
    public final void mo108485c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f75037l = str;
    }

    /* renamed from: d */
    public final void mo108486d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f75038m = str;
    }

    /* renamed from: a */
    public final void mo108475a(TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(timeZone, "<set-?>");
        this.f75032g = timeZone;
    }

    /* renamed from: b */
    public final void mo108481b(ArrayList<AbstractC30095b> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f75029c = arrayList;
    }

    /* renamed from: a */
    public final void mo108476a(boolean z) {
        this.f75033h = z;
    }

    /* renamed from: b */
    public final void mo108482b(HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "<set-?>");
        this.f75040o = hashMap;
    }

    /* renamed from: b */
    public final void mo108483b(Map<String, CalendarWorkHourSetting> map) {
        if (map == null) {
            map = new HashMap();
        }
        this.f75042q = map;
    }

    /* renamed from: b */
    public final List<DayInstancesLayout> mo108477b(List<? extends DayInstancesSlotMetric> list) {
        String str;
        String l = Long.toString(new Date().getTime());
        String str2 = "null";
        if (list == null) {
            str = str2;
        } else {
            str = String.valueOf(list.size()) + "";
        }
        Log.m165389i("ArrangeBaseModel", C32673y.m125376b(l, "syncGetInstancesLayout", "days_instance_slot_metrics_size", str));
        ArrayList<DayInstancesLayout> a = this.f75028b.mo118849a((List<DayInstancesSlotMetric>) list);
        if (a != null) {
            str2 = String.valueOf(a.size()) + "";
        }
        Log.m165389i("ArrangeBaseModel", C32673y.m125373a(l, "syncGetInstancesLayout", "days_instance_layout_size", str2));
        return a;
    }

    /* renamed from: b */
    public final void mo108479b(OnLoadEventInstances cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        TimeZone timeZone = this.f75032g;
        CalendarDate calendarDate = new CalendarDate(new Date(this.f75030d * ((long) 1000)), timeZone);
        CalendarDate moveToSameDayStart = calendarDate.moveToSameDayStart();
        CalendarDate moveToSameDayEnd = calendarDate.moveToSameDayEnd();
        Log.m165389i("ArrangeBaseModel", C32673y.m125376b(String.valueOf(new Date().getTime()), "getEventInstanceData", new String[0]));
        Intrinsics.checkExpressionValueIsNotNull(moveToSameDayStart, "startDate");
        int julianDay = moveToSameDayStart.getJulianDay();
        Intrinsics.checkExpressionValueIsNotNull(moveToSameDayEnd, "endDate");
        this.f75027a.mo119038a(this.f75035j, moveToSameDayStart.getTimeInSeconds(), moveToSameDayEnd.getTimeInSeconds(), timeZone.getID(), this.f75035j, new C30096e(this, julianDay, moveToSameDayEnd.getJulianDay(), this.f75037l, this.f75038m, this.f75039n, cVar));
    }
}
