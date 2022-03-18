package com.ss.android.lark.calendar.impl.features.calendarview.entity;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.DeclineState;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.LightSkinTypeState;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.MaybeState;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.NeedActionState;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.NormalState;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.features.common.helper.CalendarEventCommonHelper;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SkinColor;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.aj;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;

public class EventChipViewData implements Serializable, Comparable<EventChipViewData> {
    private static final long serialVersionUID = 1;
    private int mAttachedDay;
    private transient EventChipView mChipView;
    private CalendarEventInstance mInstance;
    private boolean mIsGrayAttributes;
    protected boolean mIsNeedForbidMask;
    protected boolean mIsTitleShowCalendarName = true;
    private int mSpan;

    public boolean needShowThirdLind() {
        return false;
    }

    public void setGrayAttributes() {
        this.mIsGrayAttributes = true;
    }

    public CalendarEventInstance getCalendarEventInstance() {
        return this.mInstance;
    }

    public EventChipView getChipView() {
        return this.mChipView;
    }

    public int getSpan() {
        return this.mSpan;
    }

    public String getCalendarId() {
        return this.mInstance.getCalendarId();
    }

    public int getEndDay() {
        return this.mInstance.getEndDay();
    }

    public int getEndMinute() {
        return this.mInstance.getEndMinute();
    }

    public long getEndTime() {
        return this.mInstance.getEndTime();
    }

    public String getEventId() {
        return this.mInstance.getEventId();
    }

    public String getEventLocation() {
        return getEventLocationActual();
    }

    public String getEventTitle() {
        return getEventTitleActual();
    }

    public String getId() {
        return this.mInstance.getId();
    }

    public String getKey() {
        return this.mInstance.getKey();
    }

    public long getOriginalTime() {
        return this.mInstance.getOriginalTime();
    }

    public int getStartDay() {
        return this.mInstance.getStartDay();
    }

    public int getStartMinute() {
        return this.mInstance.getStartMinute();
    }

    public long getStartTime() {
        return this.mInstance.getStartTime();
    }

    public C30802a getThirdLineData() {
        return new C30802a();
    }

    public boolean isAllDay() {
        return this.mInstance.isAllDay();
    }

    public boolean isEditable() {
        return this.mInstance.isEditable();
    }

    public boolean isDuration24Hour() {
        if (getDurationMinutes() >= 1440) {
            return true;
        }
        return false;
    }

    public boolean isExchangeEventInstance() {
        if (this.mInstance.getSource() == CalendarEvent.Source.EXCHANGE) {
            return true;
        }
        return false;
    }

    public boolean isGoogleEventInstance() {
        if (this.mInstance.getSource() == CalendarEvent.Source.GOOGLE) {
            return true;
        }
        return false;
    }

    public boolean isLocalEventInstance() {
        if (this.mInstance.getSource() == CalendarEvent.Source.ANDROID) {
            return true;
        }
        return false;
    }

    public BaseEventChipViewAttribute getAttribute() {
        return getAttributeActual(this.mInstance.getSelfAttendeeStatus(), this.mInstance.getDisplayType());
    }

    public int getEventCardColor() {
        SkinColor a = CalendarSkinColorTool.m124921a(this.mInstance.getmEventColor(), C30022a.f74884c.mo108456c().getSkinType());
        if (a != null) {
            return a.getSelectColor();
        }
        return getEventColor();
    }

    public boolean isCrossDay() {
        if (this.mInstance.getStartDay() != this.mInstance.getEndDay()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData$1 */
    public static /* synthetic */ class C308011 {

        /* renamed from: a */
        static final /* synthetic */ int[] f77458a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee$Status[] r0 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData.C308011.f77458a = r0
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee$Status r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee.Status.NEEDS_ACTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData.C308011.f77458a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee$Status r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee.Status.ACCEPT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData.C308011.f77458a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee$Status r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee.Status.TENTATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData.C308011.f77458a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee$Status r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee.Status.DECLINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData.C308011.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData$a */
    public static class C30802a {

        /* renamed from: a */
        public String f77459a;

        /* renamed from: b */
        public String f77460b;

        /* renamed from: c */
        public String f77461c;

        /* renamed from: d */
        public String f77462d;

        /* renamed from: e */
        public String f77463e;

        /* renamed from: f */
        public EventChipView.C31086a f77464f;

        /* renamed from: g */
        public EventChipView.C31086a f77465g;

        /* renamed from: h */
        public EventChipView.C31086a f77466h;

        /* renamed from: i */
        public ArrayList<String> f77467i;

        /* renamed from: j */
        public ArrayList<String> f77468j;

        /* renamed from: k */
        public ArrayList<String> f77469k;

        /* renamed from: l */
        public boolean f77470l;

        public C30802a() {
            this.f77459a = "";
            this.f77460b = "";
            this.f77461c = "";
            this.f77462d = "";
            this.f77463e = "";
            this.f77464f = new EventChipView.C31086a(-1, -1);
            this.f77465g = new EventChipView.C31086a(-1, -1);
            this.f77466h = new EventChipView.C31086a(-1, -1);
            this.f77467i = new ArrayList<>();
            this.f77468j = new ArrayList<>();
            this.f77469k = new ArrayList<>();
            this.f77470l = false;
        }

        public C30802a(String str, String str2, String str3, String str4, String str5, EventChipView.C31086a aVar, EventChipView.C31086a aVar2, EventChipView.C31086a aVar3, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, boolean z) {
            this.f77459a = str;
            this.f77460b = str2;
            this.f77461c = str3;
            this.f77462d = str4;
            this.f77463e = str5;
            this.f77464f = aVar;
            this.f77465g = aVar2;
            this.f77466h = aVar3;
            this.f77467i = arrayList;
            this.f77468j = arrayList2;
            this.f77469k = arrayList3;
            this.f77470l = z;
        }
    }

    /* access modifiers changed from: protected */
    public int getCalendarColor() {
        if (CalendarEventCommonHelper.m116172a(this.mInstance.getCategory())) {
            return CalendarSkinColorTool.m124930d();
        }
        SkinColor a = CalendarSkinColorTool.m124921a(this.mInstance.getCalMappingColor(), C30022a.f74884c.mo108456c().getSkinType());
        if (this.mInstance.isLimitAccessRole()) {
            return a.getBgColorBySkin(CalendarEventAttendee.Status.ACCEPT);
        }
        return a.getBgColorBySkin(this.mInstance.getSelfAttendeeStatus());
    }

    public long getDurationMinutes() {
        return (1440 - ((long) this.mInstance.getStartMinute())) + (((long) ((this.mInstance.getEndDay() - this.mInstance.getStartDay()) - 1)) * 1440) + ((long) this.mInstance.getEndMinute());
    }

    /* access modifiers changed from: protected */
    public int getEventColor() {
        if (CalendarEventCommonHelper.m116172a(this.mInstance.getCategory())) {
            return CalendarSkinColorTool.m124930d();
        }
        SkinColor a = CalendarSkinColorTool.m124921a(this.mInstance.getmEventColor(), C30022a.f74884c.mo108456c().getSkinType());
        SkinColor a2 = CalendarSkinColorTool.m124921a(this.mInstance.getCalMappingColor(), C30022a.f74884c.mo108456c().getSkinType());
        if (this.mInstance.isLimitAccessRole()) {
            return a2.getBgColorBySkin(CalendarEventAttendee.Status.ACCEPT);
        }
        return a.getBgColorBySkin(this.mInstance.getSelfAttendeeStatus());
    }

    public String getEventDetailTitle() {
        CalendarEvent.DisplayType displayType = this.mInstance.getDisplayType();
        String summary = this.mInstance.getSummary();
        if (CalendarEvent.Category.RESOURCE_REQUISITION.equals(this.mInstance.getCategory())) {
            return C32634ae.m125182b(R.string.Calendar_Edit_MeetingRoomInactiveCantReserve);
        }
        if (CalendarEvent.Category.RESOURCE_STRATEGY.equals(this.mInstance.getCategory())) {
            return C32634ae.m125182b(R.string.Calendar_MeetingView_MeetingRoomCantReservePeriod);
        }
        if (displayType == CalendarEvent.DisplayType.LIMITED) {
            return C32634ae.m125182b(R.string.Calendar_Detail_Busy);
        }
        if (TextUtils.isEmpty(summary)) {
            return C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
        }
        return summary;
    }

    /* access modifiers changed from: protected */
    public String getEventLocationActual() {
        CalendarEvent.DisplayType displayType = this.mInstance.getDisplayType();
        String location = this.mInstance.getCalendarLocation().getLocation();
        String meetingRoomActual = getMeetingRoomActual(displayType, this.mInstance.getMeetingRooms());
        if (displayType == CalendarEvent.DisplayType.LIMITED) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (!aj.m125201a(meetingRoomActual)) {
            sb.append(meetingRoomActual);
            if (!aj.m125201a(location)) {
                sb.append(", ");
            }
        }
        if (!aj.m125201a(location)) {
            sb.append(location);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public int getTitleColor() {
        if (CalendarEventCommonHelper.m116172a(this.mInstance.getCategory())) {
            return CalendarSkinColorTool.m124931e();
        }
        SkinColor a = CalendarSkinColorTool.m124921a(this.mInstance.getmEventColor(), C30022a.f74884c.mo108456c().getSkinType());
        SkinColor a2 = CalendarSkinColorTool.m124921a(this.mInstance.getCalMappingColor(), C30022a.f74884c.mo108456c().getSkinType());
        if (this.mInstance.isLimitAccessRole()) {
            return a2.getTitleColorBySkin(CalendarEventAttendee.Status.ACCEPT);
        }
        return a.getTitleColorBySkin(this.mInstance.getSelfAttendeeStatus());
    }

    public boolean isShowInAllDay() {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setTimeInSeconds(getStartTime());
        CalendarDate calendarDate2 = new CalendarDate();
        calendarDate2.setTimeInSeconds(getEndTime());
        long timeInSeconds = calendarDate2.getTimeInSeconds() - calendarDate.getTimeInSeconds();
        if (!calendarDate.sameDay(calendarDate2) || calendarDate.getHour() != 0 || calendarDate.getMinute() != 0 || calendarDate.getSecond() != 0 || timeInSeconds < 86340 || timeInSeconds >= 86400) {
            return false;
        }
        return true;
    }

    public boolean needDrawEventFinishedMask() {
        if (this.mIsNeedForbidMask || !C30022a.f74884c.mo108456c().isShowPastEventsMask()) {
            return false;
        }
        CalendarEventInstance calendarEventInstance = this.mInstance;
        if (calendarEventInstance == null || !calendarEventInstance.isAllDay()) {
            long j = 0;
            CalendarEventInstance calendarEventInstance2 = this.mInstance;
            if (calendarEventInstance2 != null) {
                j = calendarEventInstance2.getEndTime();
            }
            if (j * 1000 < System.currentTimeMillis()) {
                return true;
            }
            return false;
        } else if (new CalendarDate(new Date((this.mInstance.getEndTime() * 1000) - 1000), new SimpleTimeZone(0, "UTC")).getJulianDay() < new CalendarDate().getJulianDay()) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public String getEventTitleActual() {
        CalendarEvent.DisplayType displayType = this.mInstance.getDisplayType();
        String summary = this.mInstance.getSummary();
        this.mInstance.getImportanceScore();
        C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
        if (displayType == CalendarEvent.DisplayType.LIMITED) {
            StringBuilder sb = new StringBuilder();
            if (this.mIsTitleShowCalendarName) {
                String a = C30076a.m111290a().mo108421a(getCalendarId());
                if (!TextUtils.isEmpty(a)) {
                    sb.append(a);
                    sb.append(", ");
                }
            }
            Calendar b = C30076a.m111290a().mo108428b(getCalendarId());
            if (b == null || !(b.getType() == Calendar.Type.RESOURCES || b.getType() == Calendar.Type.GOOGLE_RESOURCE)) {
                sb.append(C32634ae.m125182b(R.string.Calendar_Detail_Busy));
            } else if (CalendarEvent.Category.RESOURCE_REQUISITION.equals(this.mInstance.getCategory())) {
                sb.append(C32634ae.m125182b(R.string.Calendar_Edit_MeetingRoomInactiveCantReserve));
            } else if (CalendarEvent.Category.RESOURCE_STRATEGY.equals(this.mInstance.getCategory())) {
                sb.append(C32634ae.m125182b(R.string.Calendar_MeetingView_MeetingRoomCantReservePeriod));
            } else {
                sb.append(C32634ae.m125182b(R.string.Calendar_View_Reserved));
            }
            return sb.toString();
        } else if (TextUtils.isEmpty(summary)) {
            return C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
        } else {
            return summary;
        }
    }

    public void setAttachedDay(int i) {
        this.mAttachedDay = i;
    }

    public void setChipView(EventChipView eventChipView) {
        this.mChipView = eventChipView;
    }

    public void setIsNeedForbidMask(boolean z) {
        this.mIsNeedForbidMask = z;
    }

    public void setIsTitleShowCalendarName(boolean z) {
        this.mIsTitleShowCalendarName = z;
    }

    public void setSpan(int i) {
        this.mSpan = i;
    }

    public EventChipViewData(CalendarEventInstance calendarEventInstance) {
        this.mInstance = calendarEventInstance;
    }

    public EventChipViewData(EventChipViewData eventChipViewData) {
        this.mSpan = eventChipViewData.mSpan;
        this.mIsGrayAttributes = eventChipViewData.mIsGrayAttributes;
        this.mAttachedDay = eventChipViewData.mAttachedDay;
        this.mIsNeedForbidMask = eventChipViewData.mIsNeedForbidMask;
        this.mIsTitleShowCalendarName = eventChipViewData.mIsTitleShowCalendarName;
        this.mInstance = eventChipViewData.mInstance;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof EventChipViewData)) {
            return false;
        }
        CalendarEventInstance calendarEventInstance = ((EventChipViewData) obj).getCalendarEventInstance();
        CalendarEventInstance calendarEventInstance2 = this.mInstance;
        if (calendarEventInstance2 == null || calendarEventInstance == null || !calendarEventInstance2.getCalendarId().equals(calendarEventInstance.getCalendarId()) || !this.mInstance.getKey().equals(calendarEventInstance.getKey()) || this.mInstance.getOriginalTime() != calendarEventInstance.getOriginalTime() || this.mInstance.getStartTime() != calendarEventInstance.getStartTime()) {
            return false;
        }
        return true;
    }

    public int compareTo(EventChipViewData eventChipViewData) {
        int i;
        int i2;
        if (this == eventChipViewData) {
            return 0;
        }
        if (isAllDay() || isDuration24Hour()) {
            i = 0;
        } else {
            i = 1;
        }
        if (eventChipViewData.isAllDay() || eventChipViewData.isDuration24Hour()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int i3 = i - i2;
        if (i3 != 0) {
            return i3;
        }
        if (getStartTime() != eventChipViewData.getStartTime()) {
            if (getStartTime() - eventChipViewData.getStartTime() < 0) {
                return -1;
            }
            return 1;
        } else if (eventChipViewData.getEndTime() != getEndTime()) {
            if (eventChipViewData.getEndTime() - getEndTime() < 0) {
                return -1;
            }
            return 1;
        } else if (getEventId().equals(eventChipViewData.getEventId())) {
            return 0;
        } else {
            if (getEventId().compareTo(eventChipViewData.getEventId()) < 0) {
                return -1;
            }
            return 1;
        }
    }

    private String getMeetingRoomActual(CalendarEvent.DisplayType displayType, List<String> list) {
        if (list == null || displayType == CalendarEvent.DisplayType.LIMITED) {
            return "";
        }
        int size = list.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            if (!aj.m125201a(str)) {
                sb.append(str);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }

    private BaseEventChipViewAttribute getAttributeActual(CalendarEventAttendee.Status status, CalendarEvent.DisplayType displayType) {
        if (this.mIsGrayAttributes) {
            int b = CalendarSkinColorTool.m124926b();
            return new LightSkinTypeState(CalendarSkinColorTool.m124928c(), CalendarSkinColorTool.m124928c(), b);
        }
        int eventColor = getEventColor();
        int calendarColor = getCalendarColor();
        int titleColor = getTitleColor();
        if (status == null || displayType == CalendarEvent.DisplayType.LIMITED) {
            return new NormalState(eventColor, calendarColor, titleColor);
        }
        int i = C308011.f77458a[status.ordinal()];
        if (i == 1) {
            return new NeedActionState(eventColor, calendarColor, titleColor);
        }
        if (i == 2) {
            return new NormalState(eventColor, calendarColor, titleColor);
        }
        if (i == 3) {
            return new MaybeState(eventColor, calendarColor, titleColor);
        }
        if (i != 4) {
            return new NormalState(eventColor, calendarColor, titleColor);
        }
        return new DeclineState(eventColor, calendarColor, titleColor);
    }
}
