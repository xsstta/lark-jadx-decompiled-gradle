package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OtherVideoMeetingConfigs;", "", "customizedDescription", "", "iconType", "Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$OtherVideoMeetingConfigs$IconType;", "(Ljava/lang/String;Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$OtherVideoMeetingConfigs$IconType;)V", "getCustomizedDescription", "()Ljava/lang/String;", "setCustomizedDescription", "(Ljava/lang/String;)V", "getIconType", "()Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$OtherVideoMeetingConfigs$IconType;", "setIconType", "(Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$OtherVideoMeetingConfigs$IconType;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.t */
public final class OtherVideoMeetingConfigs {

    /* renamed from: a */
    private String f83667a;

    /* renamed from: b */
    private EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType f83668b;

    public OtherVideoMeetingConfigs() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherVideoMeetingConfigs)) {
            return false;
        }
        OtherVideoMeetingConfigs tVar = (OtherVideoMeetingConfigs) obj;
        return Intrinsics.areEqual(this.f83667a, tVar.f83667a) && Intrinsics.areEqual(this.f83668b, tVar.f83668b);
    }

    public int hashCode() {
        String str = this.f83667a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType = this.f83668b;
        if (iconType != null) {
            i = iconType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "OtherVideoMeetingConfigs(customizedDescription=" + this.f83667a + ", iconType=" + this.f83668b + ")";
    }

    /* renamed from: a */
    public final String mo120213a() {
        return this.f83667a;
    }

    /* renamed from: b */
    public final EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType mo120216b() {
        return this.f83668b;
    }

    /* renamed from: a */
    public final void mo120214a(EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType) {
        Intrinsics.checkParameterIsNotNull(iconType, "<set-?>");
        this.f83668b = iconType;
    }

    /* renamed from: a */
    public final void mo120215a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83667a = str;
    }

    public OtherVideoMeetingConfigs(String str, EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType) {
        Intrinsics.checkParameterIsNotNull(str, "customizedDescription");
        Intrinsics.checkParameterIsNotNull(iconType, "iconType");
        this.f83667a = str;
        this.f83668b = iconType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtherVideoMeetingConfigs(String str, EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.DEFAULT : iconType);
    }
}
