package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model;

import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ChosenMeetingRoomModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;)V", "displayText", "", "getDisplayText", "()Ljava/lang/CharSequence;", "isDeletable", "", "()Z", "isDisabled", "isEditable", "getMeetingRoomData", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "setMeetingRoomData", "getData", "isContentSame", "diffable", "isItemSame", ShareHitPoint.f121869d, "", "typeFactory", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/ITypeFactory;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b.a */
public final class ChosenMeetingRoomModel implements ItemModel {

    /* renamed from: a */
    private EventMeetingRoomData f80746a;

    /* renamed from: b */
    public boolean isContentSame(ItemModel dVar) {
        return false;
    }

    /* renamed from: e */
    public final EventMeetingRoomData mo115752e() {
        return this.f80746a;
    }

    /* renamed from: b */
    public final boolean mo115748b() {
        EventMeetingRoomData eventMeetingRoomData = this.f80746a;
        if (eventMeetingRoomData != null) {
            return eventMeetingRoomData.getMDeletable$calendar_impl_release();
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo115750c() {
        EventMeetingRoomData eventMeetingRoomData = this.f80746a;
        if (eventMeetingRoomData != null) {
            return eventMeetingRoomData.getMIsDisabled$calendar_impl_release();
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo115751d() {
        EventMeetingRoomData eventMeetingRoomData = this.f80746a;
        if (eventMeetingRoomData != null) {
            return eventMeetingRoomData.getMEditable$calendar_impl_release();
        }
        return false;
    }

    /* renamed from: a */
    public final CharSequence mo115746a() {
        String str;
        EventMeetingRoomData eventMeetingRoomData = this.f80746a;
        if (eventMeetingRoomData == null || (str = eventMeetingRoomData.getMDisplayText$calendar_impl_release()) == null) {
            str = "";
        }
        return str;
    }

    public ChosenMeetingRoomModel(EventMeetingRoomData eventMeetingRoomData) {
        this.f80746a = eventMeetingRoomData;
    }

    /* renamed from: a */
    public boolean isItemSame(ItemModel dVar) {
        return Intrinsics.areEqual(this, dVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel
    /* renamed from: a */
    public int mo115745a(ITypeFactory aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "typeFactory");
        return aVar.mo115878a(this);
    }
}
