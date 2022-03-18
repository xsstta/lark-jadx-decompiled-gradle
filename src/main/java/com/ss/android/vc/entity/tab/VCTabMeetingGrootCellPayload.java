package com.ss.android.vc.entity.tab;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/entity/tab/VCTabMeetingGrootCellPayload;", "", "changeinfos", "", "Lcom/ss/android/vc/entity/tab/VCTabMeetingChangeInfo;", "(Ljava/util/List;)V", "getChangeinfos", "()Ljava/util/List;", "setChangeinfos", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.tab.d */
public final class VCTabMeetingGrootCellPayload {

    /* renamed from: a */
    private List<? extends VCTabMeetingChangeInfo> f152819a;

    public VCTabMeetingGrootCellPayload() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof VCTabMeetingGrootCellPayload) && Intrinsics.areEqual(this.f152819a, ((VCTabMeetingGrootCellPayload) obj).f152819a);
        }
        return true;
    }

    public int hashCode() {
        List<? extends VCTabMeetingChangeInfo> list = this.f152819a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "VCTabMeetingGrootCellPayload(changeinfos=" + this.f152819a + ")";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.vc.entity.tab.VCTabMeetingChangeInfo>, java.util.List<com.ss.android.vc.entity.tab.VCTabMeetingChangeInfo> */
    /* renamed from: a */
    public final List<VCTabMeetingChangeInfo> mo210428a() {
        return this.f152819a;
    }

    /* renamed from: a */
    public final void mo210429a(List<? extends VCTabMeetingChangeInfo> list) {
        this.f152819a = list;
    }

    public VCTabMeetingGrootCellPayload(List<? extends VCTabMeetingChangeInfo> list) {
        this.f152819a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VCTabMeetingGrootCellPayload(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
