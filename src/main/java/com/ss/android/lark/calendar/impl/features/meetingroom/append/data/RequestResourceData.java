package com.ss.android.lark.calendar.impl.features.meetingroom.append.data;

import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/RequestResourceData;", "Ljava/io/Serializable;", "requestResultType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "requestBuildings", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "resourceMultiLevelMap", "", "", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;Ljava/util/List;Ljava/util/Map;)V", "getRequestBuildings", "()Ljava/util/List;", "getRequestResultType", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "getResourceMultiLevelMap", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RequestResourceData implements Serializable {
    private final List<CalendarBuilding> requestBuildings;
    private final IEditContract.RequestBuildingResultType requestResultType;
    private final Map<String, LevelRelatedInfo> resourceMultiLevelMap;

    public RequestResourceData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.RequestResourceData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestResourceData copy$default(RequestResourceData requestResourceData, IEditContract.RequestBuildingResultType requestBuildingResultType, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            requestBuildingResultType = requestResourceData.requestResultType;
        }
        if ((i & 2) != 0) {
            list = requestResourceData.requestBuildings;
        }
        if ((i & 4) != 0) {
            map = requestResourceData.resourceMultiLevelMap;
        }
        return requestResourceData.copy(requestBuildingResultType, list, map);
    }

    public final IEditContract.RequestBuildingResultType component1() {
        return this.requestResultType;
    }

    public final List<CalendarBuilding> component2() {
        return this.requestBuildings;
    }

    public final Map<String, LevelRelatedInfo> component3() {
        return this.resourceMultiLevelMap;
    }

    public final RequestResourceData copy(IEditContract.RequestBuildingResultType requestBuildingResultType, List<CalendarBuilding> list, Map<String, LevelRelatedInfo> map) {
        Intrinsics.checkParameterIsNotNull(requestBuildingResultType, "requestResultType");
        Intrinsics.checkParameterIsNotNull(list, "requestBuildings");
        Intrinsics.checkParameterIsNotNull(map, "resourceMultiLevelMap");
        return new RequestResourceData(requestBuildingResultType, list, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestResourceData)) {
            return false;
        }
        RequestResourceData requestResourceData = (RequestResourceData) obj;
        return Intrinsics.areEqual(this.requestResultType, requestResourceData.requestResultType) && Intrinsics.areEqual(this.requestBuildings, requestResourceData.requestBuildings) && Intrinsics.areEqual(this.resourceMultiLevelMap, requestResourceData.resourceMultiLevelMap);
    }

    public int hashCode() {
        IEditContract.RequestBuildingResultType requestBuildingResultType = this.requestResultType;
        int i = 0;
        int hashCode = (requestBuildingResultType != null ? requestBuildingResultType.hashCode() : 0) * 31;
        List<CalendarBuilding> list = this.requestBuildings;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, LevelRelatedInfo> map = this.resourceMultiLevelMap;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "RequestResourceData(requestResultType=" + this.requestResultType + ", requestBuildings=" + this.requestBuildings + ", resourceMultiLevelMap=" + this.resourceMultiLevelMap + ")";
    }

    public final List<CalendarBuilding> getRequestBuildings() {
        return this.requestBuildings;
    }

    public final IEditContract.RequestBuildingResultType getRequestResultType() {
        return this.requestResultType;
    }

    public final Map<String, LevelRelatedInfo> getResourceMultiLevelMap() {
        return this.resourceMultiLevelMap;
    }

    public RequestResourceData(IEditContract.RequestBuildingResultType requestBuildingResultType, List<CalendarBuilding> list, Map<String, LevelRelatedInfo> map) {
        Intrinsics.checkParameterIsNotNull(requestBuildingResultType, "requestResultType");
        Intrinsics.checkParameterIsNotNull(list, "requestBuildings");
        Intrinsics.checkParameterIsNotNull(map, "resourceMultiLevelMap");
        this.requestResultType = requestBuildingResultType;
        this.requestBuildings = list;
        this.resourceMultiLevelMap = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RequestResourceData(IEditContract.RequestBuildingResultType requestBuildingResultType, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IEditContract.RequestBuildingResultType.NO_RESULT : requestBuildingResultType, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
