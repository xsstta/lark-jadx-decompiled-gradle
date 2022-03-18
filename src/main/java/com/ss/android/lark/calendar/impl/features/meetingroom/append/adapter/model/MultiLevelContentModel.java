package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MultiLevelContentModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "levelNode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;)V", "getLevelNode", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "viewType", "", "getViewType", "()I", "isContentSame", "", "diffable", "isItemSame", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.f */
public final class MultiLevelContentModel implements BaseModel {

    /* renamed from: a */
    private final int f81843a = 8;

    /* renamed from: b */
    private final MultiLevelNode f81844b;

    /* renamed from: b */
    public boolean isContentSame(BaseModel baseModel) {
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel
    /* renamed from: a */
    public int mo116760a() {
        return this.f81843a;
    }

    /* renamed from: b */
    public final MultiLevelNode mo116802b() {
        return this.f81844b;
    }

    public MultiLevelContentModel(MultiLevelNode bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "levelNode");
        this.f81844b = bVar;
    }

    /* renamed from: a */
    public boolean isItemSame(BaseModel baseModel) {
        if (!(baseModel instanceof MultiLevelContentModel)) {
            return false;
        }
        return Intrinsics.areEqual(((MultiLevelContentModel) baseModel).f81844b.mo115830f().level_id, this.f81844b.mo115830f().level_id);
    }
}
