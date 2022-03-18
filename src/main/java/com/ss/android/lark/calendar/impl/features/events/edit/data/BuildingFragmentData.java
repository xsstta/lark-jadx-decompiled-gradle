package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nB\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0005j\b\u0012\u0004\u0012\u00020\u0015`\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010\u0016\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0019\"\u0004\b&\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0005j\b\u0012\u0004\u0012\u00020\u0015`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#¨\u00066"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;", "Ljava/io/Serializable;", "canAddMultiItems", "", "chosenMeetingRooms", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "Lkotlin/collections/ArrayList;", "isShowUsableContainer", "isEditEvent", "(ZLjava/util/ArrayList;ZZ)V", "isShowUsableBoardroom", "startTime", "", "endTime", "rRule", "", "originalTime", "requestResultType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "requestBuildings", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "isShowMultiSelect", "(ZLjava/util/ArrayList;ZZJJLjava/lang/String;JLcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;Ljava/util/ArrayList;ZZ)V", "getCanAddMultiItems", "()Z", "setCanAddMultiItems", "(Z)V", "getChosenMeetingRooms", "()Ljava/util/ArrayList;", "setChosenMeetingRooms", "(Ljava/util/ArrayList;)V", "getEndTime", "()J", "setEndTime", "(J)V", "setEditEvent", "setShowMultiSelect", "setShowUsableBoardroom", "setShowUsableContainer", "getOriginalTime", "setOriginalTime", "getRRule", "()Ljava/lang/String;", "setRRule", "(Ljava/lang/String;)V", "getRequestBuildings", "setRequestBuildings", "getRequestResultType", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "setRequestResultType", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;)V", "getStartTime", "setStartTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BuildingFragmentData implements Serializable {
    private boolean canAddMultiItems;
    private ArrayList<EventMeetingRoomData> chosenMeetingRooms;
    private long endTime;
    private boolean isEditEvent;
    private boolean isShowMultiSelect;
    private boolean isShowUsableBoardroom;
    private boolean isShowUsableContainer;
    private long originalTime;
    private String rRule;
    private ArrayList<CalendarBuilding> requestBuildings;
    private IEditContract.RequestBuildingResultType requestResultType;
    private long startTime;

    public final boolean getCanAddMultiItems() {
        return this.canAddMultiItems;
    }

    public final ArrayList<EventMeetingRoomData> getChosenMeetingRooms() {
        return this.chosenMeetingRooms;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getOriginalTime() {
        return this.originalTime;
    }

    public final String getRRule() {
        return this.rRule;
    }

    public final ArrayList<CalendarBuilding> getRequestBuildings() {
        return this.requestBuildings;
    }

    public final IEditContract.RequestBuildingResultType getRequestResultType() {
        return this.requestResultType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean isEditEvent() {
        return this.isEditEvent;
    }

    public final boolean isShowMultiSelect() {
        return this.isShowMultiSelect;
    }

    public final boolean isShowUsableBoardroom() {
        return this.isShowUsableBoardroom;
    }

    public final boolean isShowUsableContainer() {
        return this.isShowUsableContainer;
    }

    public final void setCanAddMultiItems(boolean z) {
        this.canAddMultiItems = z;
    }

    public final void setEditEvent(boolean z) {
        this.isEditEvent = z;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setOriginalTime(long j) {
        this.originalTime = j;
    }

    public final void setShowMultiSelect(boolean z) {
        this.isShowMultiSelect = z;
    }

    public final void setShowUsableBoardroom(boolean z) {
        this.isShowUsableBoardroom = z;
    }

    public final void setShowUsableContainer(boolean z) {
        this.isShowUsableContainer = z;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setChosenMeetingRooms(ArrayList<EventMeetingRoomData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.chosenMeetingRooms = arrayList;
    }

    public final void setRRule(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.rRule = str;
    }

    public final void setRequestBuildings(ArrayList<CalendarBuilding> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.requestBuildings = arrayList;
    }

    public final void setRequestResultType(IEditContract.RequestBuildingResultType requestBuildingResultType) {
        Intrinsics.checkParameterIsNotNull(requestBuildingResultType, "<set-?>");
        this.requestResultType = requestBuildingResultType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BuildingFragmentData(boolean z, ArrayList<EventMeetingRoomData> arrayList, boolean z2, boolean z3) {
        this(z, arrayList, z2, false, 0, 0, "", 0, IEditContract.RequestBuildingResultType.NO_RESULT, new ArrayList(), z3, false);
        Intrinsics.checkParameterIsNotNull(arrayList, "chosenMeetingRooms");
    }

    public BuildingFragmentData(boolean z, ArrayList<EventMeetingRoomData> arrayList, boolean z2, boolean z3, long j, long j2, String str, long j3, IEditContract.RequestBuildingResultType requestBuildingResultType, ArrayList<CalendarBuilding> arrayList2, boolean z4, boolean z5) {
        Intrinsics.checkParameterIsNotNull(arrayList, "chosenMeetingRooms");
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        Intrinsics.checkParameterIsNotNull(requestBuildingResultType, "requestResultType");
        Intrinsics.checkParameterIsNotNull(arrayList2, "requestBuildings");
        this.canAddMultiItems = z;
        this.chosenMeetingRooms = arrayList;
        this.isShowUsableContainer = z2;
        this.isShowUsableBoardroom = z3;
        this.startTime = j;
        this.endTime = j2;
        this.rRule = str;
        this.originalTime = j3;
        this.requestResultType = requestBuildingResultType;
        this.requestBuildings = arrayList2;
        this.isEditEvent = z4;
        this.isShowMultiSelect = z5;
    }
}
