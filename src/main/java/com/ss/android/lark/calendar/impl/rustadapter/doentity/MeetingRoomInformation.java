package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0002\u0010\u0018J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010C\u001a\u00020\rHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010E\u001a\u00020\rHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010K\u001a\u00020\rHÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J£\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\rHÆ\u0001J\u0013\u0010O\u001a\u00020\r2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0014\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010)\"\u0004\b,\u0010+R\u001a\u0010\u0017\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010)\"\u0004\b-\u0010+R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006T"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomInformation;", "", "floorName", "", "name", "cityName", "buildingName", "capacity", "", "equipments", "", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomEquipment;", "isApproval", "", "remark", "pictureUrl", "resourceStrategy", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;", "resourceRequisition", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;", "isCustomized", "trigger", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ApprovalTrigger;", "isShouldShowSummary", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;ZLcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ApprovalTrigger;Z)V", "getBuildingName", "()Ljava/lang/String;", "setBuildingName", "(Ljava/lang/String;)V", "getCapacity", "()J", "setCapacity", "(J)V", "getCityName", "setCityName", "getEquipments", "()Ljava/util/List;", "setEquipments", "(Ljava/util/List;)V", "getFloorName", "setFloorName", "()Z", "setApproval", "(Z)V", "setCustomized", "setShouldShowSummary", "getName", "setName", "getPictureUrl", "setPictureUrl", "getRemark", "setRemark", "getResourceRequisition", "()Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;", "setResourceRequisition", "(Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;)V", "getResourceStrategy", "()Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;", "setResourceStrategy", "(Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;)V", "getTrigger", "()Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ApprovalTrigger;", "setTrigger", "(Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ApprovalTrigger;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.p */
public final class MeetingRoomInformation {

    /* renamed from: a */
    private String f83630a;

    /* renamed from: b */
    private String f83631b;

    /* renamed from: c */
    private String f83632c;

    /* renamed from: d */
    private String f83633d;

    /* renamed from: e */
    private long f83634e;

    /* renamed from: f */
    private List<MeetingRoomEquipment> f83635f;

    /* renamed from: g */
    private boolean f83636g;

    /* renamed from: h */
    private String f83637h;

    /* renamed from: i */
    private String f83638i;

    /* renamed from: j */
    private SchemaExtraData.ResourceStrategy f83639j;

    /* renamed from: k */
    private SchemaExtraData.ResourceRequisition f83640k;

    /* renamed from: l */
    private boolean f83641l;

    /* renamed from: m */
    private SchemaExtraData.ApprovalTrigger f83642m;

    /* renamed from: n */
    private boolean f83643n;

    public MeetingRoomInformation() {
        this(null, null, null, null, 0, null, false, null, null, null, null, false, null, false, 16383, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeetingRoomInformation)) {
            return false;
        }
        MeetingRoomInformation pVar = (MeetingRoomInformation) obj;
        return Intrinsics.areEqual(this.f83630a, pVar.f83630a) && Intrinsics.areEqual(this.f83631b, pVar.f83631b) && Intrinsics.areEqual(this.f83632c, pVar.f83632c) && Intrinsics.areEqual(this.f83633d, pVar.f83633d) && this.f83634e == pVar.f83634e && Intrinsics.areEqual(this.f83635f, pVar.f83635f) && this.f83636g == pVar.f83636g && Intrinsics.areEqual(this.f83637h, pVar.f83637h) && Intrinsics.areEqual(this.f83638i, pVar.f83638i) && Intrinsics.areEqual(this.f83639j, pVar.f83639j) && Intrinsics.areEqual(this.f83640k, pVar.f83640k) && this.f83641l == pVar.f83641l && Intrinsics.areEqual(this.f83642m, pVar.f83642m) && this.f83643n == pVar.f83643n;
    }

    public int hashCode() {
        String str = this.f83630a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83631b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f83632c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f83633d;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        long j = this.f83634e;
        int i2 = (((hashCode3 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        List<MeetingRoomEquipment> list = this.f83635f;
        int hashCode5 = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.f83636g;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode5 + i4) * 31;
        String str5 = this.f83637h;
        int hashCode6 = (i7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f83638i;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        SchemaExtraData.ResourceStrategy resourceStrategy = this.f83639j;
        int hashCode8 = (hashCode7 + (resourceStrategy != null ? resourceStrategy.hashCode() : 0)) * 31;
        SchemaExtraData.ResourceRequisition resourceRequisition = this.f83640k;
        int hashCode9 = (hashCode8 + (resourceRequisition != null ? resourceRequisition.hashCode() : 0)) * 31;
        boolean z2 = this.f83641l;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode9 + i8) * 31;
        SchemaExtraData.ApprovalTrigger approvalTrigger = this.f83642m;
        if (approvalTrigger != null) {
            i = approvalTrigger.hashCode();
        }
        int i12 = (i11 + i) * 31;
        boolean z3 = this.f83643n;
        if (!z3) {
            i3 = z3 ? 1 : 0;
        }
        return i12 + i3;
    }

    public String toString() {
        return "MeetingRoomInformation(floorName=" + this.f83630a + ", name=" + this.f83631b + ", cityName=" + this.f83632c + ", buildingName=" + this.f83633d + ", capacity=" + this.f83634e + ", equipments=" + this.f83635f + ", isApproval=" + this.f83636g + ", remark=" + this.f83637h + ", pictureUrl=" + this.f83638i + ", resourceStrategy=" + this.f83639j + ", resourceRequisition=" + this.f83640k + ", isCustomized=" + this.f83641l + ", trigger=" + this.f83642m + ", isShouldShowSummary=" + this.f83643n + ")";
    }

    /* renamed from: a */
    public final String mo120141a() {
        return this.f83630a;
    }

    /* renamed from: b */
    public final String mo120149b() {
        return this.f83631b;
    }

    /* renamed from: c */
    public final String mo120152c() {
        return this.f83632c;
    }

    /* renamed from: d */
    public final String mo120155d() {
        return this.f83633d;
    }

    /* renamed from: e */
    public final long mo120157e() {
        return this.f83634e;
    }

    /* renamed from: f */
    public final List<MeetingRoomEquipment> mo120160f() {
        return this.f83635f;
    }

    /* renamed from: g */
    public final boolean mo120162g() {
        return this.f83636g;
    }

    /* renamed from: h */
    public final String mo120163h() {
        return this.f83637h;
    }

    /* renamed from: i */
    public final String mo120165i() {
        return this.f83638i;
    }

    /* renamed from: j */
    public final SchemaExtraData.ResourceStrategy mo120166j() {
        return this.f83639j;
    }

    /* renamed from: k */
    public final SchemaExtraData.ResourceRequisition mo120167k() {
        return this.f83640k;
    }

    /* renamed from: l */
    public final boolean mo120168l() {
        return this.f83641l;
    }

    /* renamed from: m */
    public final SchemaExtraData.ApprovalTrigger mo120169m() {
        return this.f83642m;
    }

    /* renamed from: n */
    public final boolean mo120170n() {
        return this.f83643n;
    }

    /* renamed from: a */
    public final void mo120142a(long j) {
        this.f83634e = j;
    }

    /* renamed from: b */
    public final void mo120150b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83631b = str;
    }

    /* renamed from: c */
    public final void mo120153c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83632c = str;
    }

    /* renamed from: d */
    public final void mo120156d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83633d = str;
    }

    /* renamed from: e */
    public final void mo120158e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83637h = str;
    }

    /* renamed from: f */
    public final void mo120161f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83638i = str;
    }

    /* renamed from: a */
    public final void mo120143a(SchemaExtraData.ApprovalTrigger approvalTrigger) {
        this.f83642m = approvalTrigger;
    }

    /* renamed from: b */
    public final void mo120151b(boolean z) {
        this.f83641l = z;
    }

    /* renamed from: c */
    public final void mo120154c(boolean z) {
        this.f83643n = z;
    }

    /* renamed from: a */
    public final void mo120144a(SchemaExtraData.ResourceRequisition resourceRequisition) {
        this.f83640k = resourceRequisition;
    }

    /* renamed from: a */
    public final void mo120145a(SchemaExtraData.ResourceStrategy resourceStrategy) {
        this.f83639j = resourceStrategy;
    }

    /* renamed from: a */
    public final void mo120146a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83630a = str;
    }

    /* renamed from: a */
    public final void mo120147a(List<MeetingRoomEquipment> list) {
        this.f83635f = list;
    }

    /* renamed from: a */
    public final void mo120148a(boolean z) {
        this.f83636g = z;
    }

    public MeetingRoomInformation(String str, String str2, String str3, String str4, long j, List<MeetingRoomEquipment> list, boolean z, String str5, String str6, SchemaExtraData.ResourceStrategy resourceStrategy, SchemaExtraData.ResourceRequisition resourceRequisition, boolean z2, SchemaExtraData.ApprovalTrigger approvalTrigger, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str, "floorName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "cityName");
        Intrinsics.checkParameterIsNotNull(str4, "buildingName");
        Intrinsics.checkParameterIsNotNull(str5, "remark");
        Intrinsics.checkParameterIsNotNull(str6, "pictureUrl");
        this.f83630a = str;
        this.f83631b = str2;
        this.f83632c = str3;
        this.f83633d = str4;
        this.f83634e = j;
        this.f83635f = list;
        this.f83636g = z;
        this.f83637h = str5;
        this.f83638i = str6;
        this.f83639j = resourceStrategy;
        this.f83640k = resourceRequisition;
        this.f83641l = z2;
        this.f83642m = approvalTrigger;
        this.f83643n = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MeetingRoomInformation(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, long r21, java.util.List r23, boolean r24, java.lang.String r25, java.lang.String r26, com.bytedance.lark.pb.calendar.v1.SchemaExtraData.ResourceStrategy r27, com.bytedance.lark.pb.calendar.v1.SchemaExtraData.ResourceRequisition r28, boolean r29, com.bytedance.lark.pb.calendar.v1.SchemaExtraData.ApprovalTrigger r30, boolean r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomInformation.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List, boolean, java.lang.String, java.lang.String, com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceStrategy, com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceRequisition, boolean, com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ApprovalTrigger, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
