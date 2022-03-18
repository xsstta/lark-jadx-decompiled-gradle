package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\u00020\u0001:\u00019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u00103\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u00105\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u000208H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u0011\u0010!\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u000eR\u0011\u0010#\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u0011\u0010%\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006:"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "buildingData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/IBuildingData;", "itemPosition", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/IBuildingData;I)V", "getBuildingData", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/IBuildingData;", "calendarId", "", "getCalendarId", "()Ljava/lang/String;", "capacity", "getCapacity", "getData", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "dataType", "getDataType$calendar_impl_release", "()I", "setDataType$calendar_impl_release", "(I)V", "isDisableApprovalMeetingRoom", "", "isDisableApprovalMeetingRoom$calendar_impl_release", "()Z", "setDisableApprovalMeetingRoom$calendar_impl_release", "(Z)V", "isFree", "getItemPosition", "setItemPosition", "meetingRoomBuildingName", "getMeetingRoomBuildingName", "meetingRoomFloorName", "getMeetingRoomFloorName", "meetingRoomName", "getMeetingRoomName", "selectMode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "getSelectMode$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "setSelectMode$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;)V", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "getSelectState$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "setSelectState$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;)V", "isContentSame", "diffable", "isItemSame", ShareHitPoint.f121869d, "typeFactory", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/ITypeFactory;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b.i */
public final class MeetingRoomModel implements ItemModel {

    /* renamed from: a */
    public static final Companion f80753a = new Companion(null);

    /* renamed from: b */
    private boolean f80754b;

    /* renamed from: c */
    private int f80755c;

    /* renamed from: d */
    private IBuildingContract.ResourceSelectMode f80756d;

    /* renamed from: e */
    private IBuildingContract.SelectState f80757e;

    /* renamed from: f */
    private final EventMeetingRoomData f80758f;

    /* renamed from: g */
    private final IBuildingData f80759g;

    /* renamed from: h */
    private int f80760h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomModel$Companion;", "", "()V", "TYPE_BUILDING", "", "TYPE_DEFAULT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public final boolean mo115791g() {
        return this.f80754b;
    }

    /* renamed from: h */
    public final int mo115792h() {
        return this.f80755c;
    }

    /* renamed from: i */
    public final IBuildingContract.ResourceSelectMode mo115793i() {
        return this.f80756d;
    }

    /* renamed from: j */
    public final IBuildingContract.SelectState mo115794j() {
        return this.f80757e;
    }

    /* renamed from: k */
    public final EventMeetingRoomData mo115795k() {
        return this.f80758f;
    }

    /* renamed from: l */
    public final IBuildingData mo115796l() {
        return this.f80759g;
    }

    /* renamed from: c */
    public final String mo115787c() {
        String mCalendarBuildingName$calendar_impl_release = this.f80758f.getMCalendarBuildingName$calendar_impl_release();
        if (mCalendarBuildingName$calendar_impl_release != null) {
            return mCalendarBuildingName$calendar_impl_release;
        }
        return "";
    }

    /* renamed from: f */
    public final String mo115790f() {
        String mCalendarId$calendar_impl_release = this.f80758f.getMCalendarId$calendar_impl_release();
        if (mCalendarId$calendar_impl_release != null) {
            return mCalendarId$calendar_impl_release;
        }
        return "";
    }

    /* renamed from: b */
    public final String mo115784b() {
        String name;
        CalendarResource calendarResource = this.f80758f.getCalendarResource();
        if (calendarResource == null || (name = calendarResource.getName()) == null) {
            return "";
        }
        return name;
    }

    /* renamed from: d */
    public final String mo115788d() {
        String floorName;
        CalendarResource calendarResource = this.f80758f.getCalendarResource();
        if (calendarResource == null || (floorName = calendarResource.getFloorName()) == null) {
            return "";
        }
        return floorName;
    }

    /* renamed from: e */
    public final String mo115789e() {
        Integer num;
        CalendarResource calendarResource = this.f80758f.getCalendarResource();
        if (calendarResource != null) {
            num = Integer.valueOf(calendarResource.getCapacity());
        } else {
            num = null;
        }
        return String.valueOf(num);
    }

    /* renamed from: a */
    public final boolean mo115782a() {
        CalendarResource.Status status;
        CalendarResource calendarResource = this.f80758f.getCalendarResource();
        if (calendarResource != null) {
            status = calendarResource.getStatus();
        } else {
            status = null;
        }
        if (status == CalendarResource.Status.FREE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo115778a(int i) {
        this.f80755c = i;
    }

    /* renamed from: b */
    public final void mo115785b(int i) {
        this.f80760h = i;
    }

    /* renamed from: a */
    public final void mo115779a(IBuildingContract.ResourceSelectMode resourceSelectMode) {
        Intrinsics.checkParameterIsNotNull(resourceSelectMode, "<set-?>");
        this.f80756d = resourceSelectMode;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel
    /* renamed from: a */
    public int mo115745a(ITypeFactory aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "typeFactory");
        return aVar.mo115884a(this);
    }

    /* renamed from: a */
    public final void mo115780a(IBuildingContract.SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(selectState, "<set-?>");
        this.f80757e = selectState;
    }

    /* renamed from: a */
    public final void mo115781a(boolean z) {
        this.f80754b = z;
    }

    /* renamed from: b */
    public boolean isContentSame(ItemModel dVar) {
        if (dVar instanceof MeetingRoomModel) {
            return Intrinsics.areEqual(((MeetingRoomModel) dVar).f80758f, this.f80758f);
        }
        return false;
    }

    /* renamed from: a */
    public boolean isItemSame(ItemModel dVar) {
        return Intrinsics.areEqual(dVar, this);
    }

    public MeetingRoomModel(EventMeetingRoomData eventMeetingRoomData, IBuildingData cVar, int i) {
        Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(cVar, "buildingData");
        this.f80758f = eventMeetingRoomData;
        this.f80759g = cVar;
        this.f80760h = i;
        this.f80756d = IBuildingContract.ResourceSelectMode.SINGLE;
        this.f80757e = IBuildingContract.SelectState.NONE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MeetingRoomModel(EventMeetingRoomData eventMeetingRoomData, IBuildingData cVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventMeetingRoomData, cVar, (i2 & 4) != 0 ? 0 : i);
    }
}
