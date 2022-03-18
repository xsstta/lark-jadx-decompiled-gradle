package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010?\u001a\u00020@J\u0013\u0010A\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\b\u0010D\u001a\u0004\u0018\u00010\u0010J\u0010\u0010E\u001a\u00020@2\b\u0010F\u001a\u0004\u0018\u00010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001a\u0010&\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001a\u0010)\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R\u001a\u00102\u001a\u000203X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001b\u0010;\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b<\u0010\u0014¨\u0006G"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "Ljava/io/Serializable;", "()V", "mBuildingId", "", "getMBuildingId$calendar_impl_release", "()Ljava/lang/String;", "setMBuildingId$calendar_impl_release", "(Ljava/lang/String;)V", "mCalendarBuildingName", "getMCalendarBuildingName$calendar_impl_release", "setMCalendarBuildingName$calendar_impl_release", "mCalendarId", "getMCalendarId$calendar_impl_release", "setMCalendarId$calendar_impl_release", "mCalendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "mDeletable", "", "getMDeletable$calendar_impl_release", "()Z", "setMDeletable$calendar_impl_release", "(Z)V", "mDisplayText", "getMDisplayText$calendar_impl_release", "setMDisplayText$calendar_impl_release", "mEditable", "getMEditable$calendar_impl_release", "setMEditable$calendar_impl_release", "mEventEndTime", "", "getMEventEndTime$calendar_impl_release", "()J", "setMEventEndTime$calendar_impl_release", "(J)V", "mIsDisabled", "getMIsDisabled$calendar_impl_release", "setMIsDisabled$calendar_impl_release", "mIsExternalEvent", "getMIsExternalEvent$calendar_impl_release", "setMIsExternalEvent$calendar_impl_release", "mIsNeedApproval", "getMIsNeedApproval$calendar_impl_release", "setMIsNeedApproval$calendar_impl_release", "mKey", "getMKey$calendar_impl_release", "setMKey$calendar_impl_release", "mOriginalTime", "getMOriginalTime$calendar_impl_release", "setMOriginalTime$calendar_impl_release", "mStatus", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "getMStatus$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "setMStatus$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;)V", "mTenantId", "getMTenantId$calendar_impl_release", "setMTenantId$calendar_impl_release", "meetingRoomLevelsFG", "getMeetingRoomLevelsFG", "meetingRoomLevelsFG$delegate", "Lkotlin/Lazy;", "buildDisPlayText", "", "equals", "obj", "", "getCalendarResource", "setCalendarResource", "calendarResource", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventMeetingRoomData implements Serializable {
    private String mBuildingId;
    private String mCalendarBuildingName;
    private String mCalendarId;
    private CalendarResource mCalendarResource;
    private boolean mDeletable = true;
    private String mDisplayText;
    private boolean mEditable;
    private long mEventEndTime;
    private boolean mIsDisabled;
    private boolean mIsExternalEvent;
    private boolean mIsNeedApproval;
    private String mKey;
    private long mOriginalTime;
    private CalendarEventAttendee.Status mStatus = CalendarEventAttendee.Status.NEEDS_ACTION;
    private String mTenantId;
    private final Lazy meetingRoomLevelsFG$delegate = LazyKt.lazy(C31619a.INSTANCE);

    private final boolean getMeetingRoomLevelsFG() {
        return ((Boolean) this.meetingRoomLevelsFG$delegate.getValue()).booleanValue();
    }

    public final CalendarResource getCalendarResource() {
        return this.mCalendarResource;
    }

    public final String getMBuildingId$calendar_impl_release() {
        return this.mBuildingId;
    }

    public final String getMCalendarBuildingName$calendar_impl_release() {
        return this.mCalendarBuildingName;
    }

    public final String getMCalendarId$calendar_impl_release() {
        return this.mCalendarId;
    }

    public final boolean getMDeletable$calendar_impl_release() {
        return this.mDeletable;
    }

    public final String getMDisplayText$calendar_impl_release() {
        return this.mDisplayText;
    }

    public final boolean getMEditable$calendar_impl_release() {
        return this.mEditable;
    }

    public final long getMEventEndTime$calendar_impl_release() {
        return this.mEventEndTime;
    }

    public final boolean getMIsDisabled$calendar_impl_release() {
        return this.mIsDisabled;
    }

    public final boolean getMIsExternalEvent$calendar_impl_release() {
        return this.mIsExternalEvent;
    }

    public final boolean getMIsNeedApproval$calendar_impl_release() {
        return this.mIsNeedApproval;
    }

    public final String getMKey$calendar_impl_release() {
        return this.mKey;
    }

    public final long getMOriginalTime$calendar_impl_release() {
        return this.mOriginalTime;
    }

    public final CalendarEventAttendee.Status getMStatus$calendar_impl_release() {
        return this.mStatus;
    }

    public final String getMTenantId$calendar_impl_release() {
        return this.mTenantId;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData$a */
    static final class C31619a extends Lambda implements Function0<Boolean> {
        public static final C31619a INSTANCE = new C31619a();

        C31619a() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return C30022a.f74883b.mo112707o();
        }
    }

    public final void buildDisPlayText() {
        StringBuilder sb = new StringBuilder();
        if (getMeetingRoomLevelsFG()) {
            CalendarResource calendarResource = this.mCalendarResource;
            if (calendarResource != null) {
                sb.append(calendarResource.getName());
                sb.append("(");
                sb.append(calendarResource.getCapacity());
                sb.append(") ");
            }
        } else {
            CalendarResource calendarResource2 = this.mCalendarResource;
            if (calendarResource2 != null) {
                sb.append(calendarResource2.getFloorName());
                sb.append("-");
                sb.append(calendarResource2.getName());
                sb.append("(");
                sb.append(calendarResource2.getCapacity());
                sb.append(") ");
            }
            String str = this.mCalendarBuildingName;
            if (str != null) {
                sb.append(str);
            }
        }
        this.mDisplayText = sb.toString();
    }

    public final void setMBuildingId$calendar_impl_release(String str) {
        this.mBuildingId = str;
    }

    public final void setMCalendarBuildingName$calendar_impl_release(String str) {
        this.mCalendarBuildingName = str;
    }

    public final void setMCalendarId$calendar_impl_release(String str) {
        this.mCalendarId = str;
    }

    public final void setMDeletable$calendar_impl_release(boolean z) {
        this.mDeletable = z;
    }

    public final void setMDisplayText$calendar_impl_release(String str) {
        this.mDisplayText = str;
    }

    public final void setMEditable$calendar_impl_release(boolean z) {
        this.mEditable = z;
    }

    public final void setMEventEndTime$calendar_impl_release(long j) {
        this.mEventEndTime = j;
    }

    public final void setMIsDisabled$calendar_impl_release(boolean z) {
        this.mIsDisabled = z;
    }

    public final void setMIsExternalEvent$calendar_impl_release(boolean z) {
        this.mIsExternalEvent = z;
    }

    public final void setMIsNeedApproval$calendar_impl_release(boolean z) {
        this.mIsNeedApproval = z;
    }

    public final void setMKey$calendar_impl_release(String str) {
        this.mKey = str;
    }

    public final void setMOriginalTime$calendar_impl_release(long j) {
        this.mOriginalTime = j;
    }

    public final void setMTenantId$calendar_impl_release(String str) {
        this.mTenantId = str;
    }

    public final void setMStatus$calendar_impl_release(CalendarEventAttendee.Status status) {
        Intrinsics.checkParameterIsNotNull(status, "<set-?>");
        this.mStatus = status;
    }

    public final void setCalendarResource(CalendarResource calendarResource) {
        this.mCalendarResource = calendarResource;
        if (calendarResource != null) {
            this.mTenantId = calendarResource.getTenantId();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof EventMeetingRoomData) {
            return Intrinsics.areEqual(((EventMeetingRoomData) obj).mCalendarId, this.mCalendarId);
        }
        return false;
    }
}
