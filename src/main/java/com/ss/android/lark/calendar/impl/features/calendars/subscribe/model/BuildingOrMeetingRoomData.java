package com.ss.android.lark.calendar.impl.features.calendars.subscribe.model;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/BuildingOrMeetingRoomData;", "", "()V", ShareHitPoint.f121869d, "", "(I)V", "buildingData", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;)V", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;)V", "getBuildingData", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "dataType", "getDataType", "()I", "getMeetingRoomData", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "isBuildingData", "", "isLoadingData", "isMeetingRoomData", "isNoneData", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b.a */
public final class BuildingOrMeetingRoomData {

    /* renamed from: a */
    public static final Companion f76564a = new Companion(null);

    /* renamed from: b */
    private final int f76565b;

    /* renamed from: c */
    private final SubscribeCalendarBuildingData f76566c;

    /* renamed from: d */
    private final SubscribeMeetingRoomData f76567d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/BuildingOrMeetingRoomData$Companion;", "", "()V", "DATA_TYPE_BUILDING", "", "DATA_TYPE_LOADING", "DATA_TYPE_LOAD_ERR", "DATA_TYPE_MEETING_ROOM", "DATA_TYPE_NO_DATA", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo110425a() {
        return this.f76565b;
    }

    /* renamed from: b */
    public final SubscribeCalendarBuildingData mo110426b() {
        return this.f76566c;
    }

    /* renamed from: c */
    public final SubscribeMeetingRoomData mo110427c() {
        return this.f76567d;
    }

    public BuildingOrMeetingRoomData() {
        this.f76566c = null;
        this.f76567d = null;
    }

    /* renamed from: d */
    public final boolean mo110428d() {
        if (this.f76565b == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo110429e() {
        if (this.f76565b == 3) {
            return true;
        }
        return false;
    }

    public BuildingOrMeetingRoomData(int i) {
        this.f76565b = i;
        this.f76566c = null;
        this.f76567d = null;
    }

    public BuildingOrMeetingRoomData(SubscribeCalendarBuildingData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "buildingData");
        this.f76565b = 3;
        this.f76566c = cVar;
        this.f76567d = null;
    }

    public BuildingOrMeetingRoomData(SubscribeMeetingRoomData eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "meetingRoomData");
        this.f76565b = 2;
        this.f76566c = null;
        this.f76567d = eVar;
    }
}
