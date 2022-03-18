package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiBaseNode;", "", "parentNode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "pbWeight", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;J)V", "getParentNode", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "setParentNode", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;)V", "getPbWeight", "()J", "setPbWeight", "(J)V", "getSelectState", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "setSelectState", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.c.a */
public class MultiBaseNode {

    /* renamed from: a */
    private MultiLevelNode f80771a;

    /* renamed from: b */
    private IBuildingContract.SelectState f80772b;

    /* renamed from: c */
    private long f80773c;

    /* renamed from: a */
    public final MultiLevelNode mo115819a() {
        return this.f80771a;
    }

    /* renamed from: b */
    public final IBuildingContract.SelectState mo115823b() {
        return this.f80772b;
    }

    /* renamed from: c */
    public final long mo115824c() {
        return this.f80773c;
    }

    /* renamed from: a */
    public final void mo115820a(long j) {
        this.f80773c = j;
    }

    /* renamed from: a */
    public final void mo115821a(IBuildingContract.SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(selectState, "<set-?>");
        this.f80772b = selectState;
    }

    /* renamed from: a */
    public final void mo115822a(MultiLevelNode bVar) {
        this.f80771a = bVar;
    }

    public MultiBaseNode(MultiLevelNode bVar, IBuildingContract.SelectState selectState, long j) {
        Intrinsics.checkParameterIsNotNull(selectState, "selectState");
        this.f80771a = bVar;
        this.f80772b = selectState;
        this.f80773c = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiBaseNode(MultiLevelNode bVar, IBuildingContract.SelectState selectState, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? IBuildingContract.SelectState.NONE : selectState, (i & 4) != 0 ? 0 : j);
    }
}
