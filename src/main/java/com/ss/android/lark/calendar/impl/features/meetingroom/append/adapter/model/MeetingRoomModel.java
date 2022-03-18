package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32064b;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32065c;
import com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001:\u00019B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003JG\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u00101\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\tHÖ\u0001J\u0012\u00105\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u00107\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0016J\t\u00108\u001a\u00020\u0012HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 ¨\u0006:"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "resourceData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "approvalDisableType", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "selectMode", "", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "showType", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel$MeetingRoomShowType;", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;Lkotlin/Pair;ILcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel$MeetingRoomShowType;)V", "getApprovalDisableType", "()Lkotlin/Pair;", "capacity", "", "getCapacity", "()Ljava/lang/String;", "isMultiSelectMode", "()Z", "isShowApprovalLabel", "isValid", "meetingRoomDisplayName", "getMeetingRoomDisplayName", "meetingRoomName", "getMeetingRoomName", "getResourceData", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "getSelectMode", "()I", "setSelectMode", "(I)V", "getSelectState", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "setSelectState", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;)V", "getShowType", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel$MeetingRoomShowType;", "viewType", "getViewType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "isContentSame", "diffable", "isItemSame", "toString", "MeetingRoomShowType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingRoomModel implements BaseModel {

    /* renamed from: a */
    private final int f81826a;

    /* renamed from: b */
    private final AppendResourceData f81827b;

    /* renamed from: c */
    private final Pair<Boolean, NeedApprovalType> f81828c;

    /* renamed from: d */
    private int f81829d;

    /* renamed from: e */
    private IBuildingContract.SelectState f81830e;

    /* renamed from: f */
    private final MeetingRoomShowType f81831f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel$MeetingRoomShowType;", "", "(Ljava/lang/String;I)V", "TYPE_SEARCH", "TYPE_BUILDING", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum MeetingRoomShowType {
        TYPE_SEARCH,
        TYPE_BUILDING
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeetingRoomModel)) {
            return false;
        }
        MeetingRoomModel meetingRoomModel = (MeetingRoomModel) obj;
        return Intrinsics.areEqual(this.f81827b, meetingRoomModel.f81827b) && Intrinsics.areEqual(this.f81828c, meetingRoomModel.f81828c) && this.f81829d == meetingRoomModel.f81829d && Intrinsics.areEqual(this.f81830e, meetingRoomModel.f81830e) && Intrinsics.areEqual(this.f81831f, meetingRoomModel.f81831f);
    }

    public int hashCode() {
        AppendResourceData aVar = this.f81827b;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Pair<Boolean, NeedApprovalType> pair = this.f81828c;
        int hashCode2 = (((hashCode + (pair != null ? pair.hashCode() : 0)) * 31) + this.f81829d) * 31;
        IBuildingContract.SelectState selectState = this.f81830e;
        int hashCode3 = (hashCode2 + (selectState != null ? selectState.hashCode() : 0)) * 31;
        MeetingRoomShowType meetingRoomShowType = this.f81831f;
        if (meetingRoomShowType != null) {
            i = meetingRoomShowType.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "MeetingRoomModel(resourceData=" + this.f81827b + ", approvalDisableType=" + this.f81828c + ", selectMode=" + this.f81829d + ", selectState=" + this.f81830e + ", showType=" + this.f81831f + ")";
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel
    /* renamed from: a */
    public int mo116760a() {
        return this.f81826a;
    }

    /* renamed from: g */
    public final AppendResourceData mo116770g() {
        return this.f81827b;
    }

    /* renamed from: h */
    public final Pair<Boolean, NeedApprovalType> mo116771h() {
        return this.f81828c;
    }

    /* renamed from: i */
    public final IBuildingContract.SelectState mo116773i() {
        return this.f81830e;
    }

    /* renamed from: j */
    public final MeetingRoomShowType mo116774j() {
        return this.f81831f;
    }

    /* renamed from: b */
    public final boolean mo116763b() {
        if (this.f81829d == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final String m121765k() {
        String str = this.f81827b.mo116888b().name;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: d */
    public final boolean mo116766d() {
        return C32065c.m121948a(this.f81827b.mo116888b());
    }

    /* renamed from: c */
    public final boolean mo116765c() {
        if (!C32064b.m121943a(this.f81827b.mo116888b()) || this.f81828c.getFirst().booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo116769f() {
        String valueOf;
        Integer num = this.f81827b.mo116888b().capacity;
        if (num == null || (valueOf = String.valueOf(num.intValue())) == null) {
            return "";
        }
        return valueOf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r0 != null) goto L_0x0032;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo116767e() {
        /*
            r2 = this;
            com.ss.android.lark.calendar.impl.features.meetingroom.append.data.a r0 = r2.f81827b
            com.bytedance.lark.pb.calendar.v1.CalendarResource r0 = r0.mo116888b()
            java.lang.String r0 = r0.floor_name
            if (r0 == 0) goto L_0x0030
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 45
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            if (r0 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            java.lang.String r0 = ""
        L_0x0032:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r2.m121765k()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MeetingRoomModel.mo116767e():java.lang.String");
    }

    /* renamed from: a */
    public final void mo116761a(IBuildingContract.SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(selectState, "<set-?>");
        this.f81830e = selectState;
    }

    /* renamed from: a */
    public boolean isItemSame(BaseModel baseModel) {
        if (!(baseModel instanceof MeetingRoomModel)) {
            return false;
        }
        return Intrinsics.areEqual(this.f81827b.mo116888b().calendar_id, ((MeetingRoomModel) baseModel).f81827b.mo116888b().calendar_id);
    }

    /* renamed from: b */
    public boolean isContentSame(BaseModel baseModel) {
        if ((baseModel instanceof MeetingRoomModel) && Intrinsics.areEqual(this, baseModel) && Intrinsics.areEqual(this.f81827b.mo116888b().toString(), ((MeetingRoomModel) baseModel).f81827b.mo116888b().toString())) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.Pair<java.lang.Boolean, ? extends com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType> */
    /* JADX WARN: Multi-variable type inference failed */
    public MeetingRoomModel(AppendResourceData aVar, Pair<Boolean, ? extends NeedApprovalType> pair, int i, IBuildingContract.SelectState selectState, MeetingRoomShowType meetingRoomShowType) {
        Intrinsics.checkParameterIsNotNull(aVar, "resourceData");
        Intrinsics.checkParameterIsNotNull(pair, "approvalDisableType");
        Intrinsics.checkParameterIsNotNull(selectState, "selectState");
        Intrinsics.checkParameterIsNotNull(meetingRoomShowType, "showType");
        this.f81827b = aVar;
        this.f81828c = pair;
        this.f81829d = i;
        this.f81830e = selectState;
        this.f81831f = meetingRoomShowType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MeetingRoomModel(AppendResourceData aVar, Pair pair, int i, IBuildingContract.SelectState selectState, MeetingRoomShowType meetingRoomShowType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, pair, i, (i2 & 8) != 0 ? IBuildingContract.SelectState.NONE : selectState, (i2 & 16) != 0 ? MeetingRoomShowType.TYPE_BUILDING : meetingRoomShowType);
    }
}
