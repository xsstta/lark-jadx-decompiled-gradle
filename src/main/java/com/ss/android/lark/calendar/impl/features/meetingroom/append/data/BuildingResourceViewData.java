package com.ss.android.lark.calendar.impl.features.meetingroom.append.data;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/BuildingResourceViewData;", "", "validResourceItems", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "allResourceItems", "selectAllState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "(Ljava/util/List;Ljava/util/List;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;)V", "getAllResourceItems", "()Ljava/util/List;", "getSelectAllState", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "getValidResourceItems", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.c */
public final class BuildingResourceViewData {

    /* renamed from: a */
    private final List<BaseModel> f81857a;

    /* renamed from: b */
    private final List<BaseModel> f81858b;

    /* renamed from: c */
    private final IBuildingContract.SelectState f81859c;

    /* renamed from: a */
    public final List<BaseModel> mo116893a() {
        return this.f81857a;
    }

    /* renamed from: b */
    public final List<BaseModel> mo116894b() {
        return this.f81858b;
    }

    /* renamed from: c */
    public final IBuildingContract.SelectState mo116895c() {
        return this.f81859c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public BuildingResourceViewData(List<? extends BaseModel> list, List<? extends BaseModel> list2, IBuildingContract.SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(list, "validResourceItems");
        Intrinsics.checkParameterIsNotNull(list2, "allResourceItems");
        Intrinsics.checkParameterIsNotNull(selectState, "selectAllState");
        this.f81857a = list;
        this.f81858b = list2;
        this.f81859c = selectState;
    }
}
