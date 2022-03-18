package com.ss.android.lark.calendar.impl.features.meetingroom.profile.content;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomStatus;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomUnusableReasons;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.data.MeetingRoomProfileBaseData;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.helper.MeetingRoomInfoHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomInformation;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomSubscriptionInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.StatusInformation;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\bJ\b\u0010\u000e\u001a\u00020\bH\u0002J\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0013\u001a\u00020\bH\u0002J\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileContentData;", "", "meetingRoomProfileBaseData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/data/MeetingRoomProfileBaseData;", "statusInformation", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/StatusInformation;", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/data/MeetingRoomProfileBaseData;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/StatusInformation;)V", "getBlockedEventTimeText", "", "getBuildingName", "getCanNotReserveReason", "getCapacity", "", "getDescription", "getEquipmentText", "getEquipments", "getEventBlocker", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "getEventCreator", "getEventTimeText", "getMeetingRoomImageUrl", "getMeetingRoomName", "getMeetingRoomRuleText", "getMeetingRoomState", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomStatus;", "isShowStateInfo", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.a */
public final class ProfileContentData {

    /* renamed from: a */
    private final MeetingRoomProfileBaseData f82148a;

    /* renamed from: b */
    private final StatusInformation f82149b;

    /* renamed from: h */
    public final String mo117241h() {
        return m122206n();
    }

    /* renamed from: j */
    public final String mo117243j() {
        return m122207o();
    }

    /* renamed from: k */
    public final boolean mo117244k() {
        return this.f82148a.mo117299d();
    }

    /* renamed from: e */
    public final long mo117238e() {
        MeetingRoomInformation b = this.f82149b.mo120261b();
        if (b != null) {
            return b.mo120157e();
        }
        return 0;
    }

    /* renamed from: i */
    public final MeetingRoomStatus mo117242i() {
        MeetingRoomStatus a = this.f82149b.mo120256a();
        if (a != null) {
            return a;
        }
        return MeetingRoomStatus.CAN_RESERVE;
    }

    /* renamed from: f */
    public final String mo117239f() {
        String h;
        MeetingRoomInformation b = this.f82149b.mo120261b();
        if (b == null || (h = b.mo120163h()) == null) {
            return "";
        }
        return h;
    }

    /* renamed from: g */
    public final String mo117240g() {
        String i;
        MeetingRoomInformation b = this.f82149b.mo120261b();
        if (b == null || (i = b.mo120165i()) == null) {
            return "";
        }
        return i;
    }

    /* renamed from: o */
    private final String m122207o() {
        MeetingRoomSubscriptionInfo c = this.f82149b.mo120262c();
        if (c == null) {
            return "";
        }
        long j = (long) 1000;
        String a = C32646c.m125251a(c.mo120172a() * j, c.mo120177b() * j, c.mo120184c(), false);
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDateTimeShowUtil…tionInfo.isAllDay, false)");
        return a;
    }

    /* renamed from: a */
    public final String mo117234a() {
        MeetingRoomInformation b = this.f82149b.mo120261b();
        if (b != null) {
            return MeetingRoomInfoHelper.f82177a.mo117317a(this.f82148a.mo117294b(), this.f82148a.mo117302f(), b.mo120162g(), b.mo120170n(), b.mo120166j(), b.mo120167k(), b.mo120168l(), b.mo120169m());
        }
        return "";
    }

    /* renamed from: b */
    public final String mo117235b() {
        MeetingRoomInformation b;
        List<MeetingRoomUnusableReasons.UnusableReason> list;
        StatusInformation zVar = this.f82149b;
        if (zVar == null || (b = zVar.mo120261b()) == null) {
            return "";
        }
        MeetingRoomInfoHelper aVar = MeetingRoomInfoHelper.f82177a;
        long b2 = this.f82148a.mo117294b();
        String f = this.f82148a.mo117302f();
        SchemaExtraData.ResourceStrategy j = b.mo120166j();
        SchemaExtraData.ResourceRequisition k = b.mo120167k();
        SchemaExtraData.ApprovalTrigger m = b.mo120169m();
        MeetingRoomUnusableReasons d = zVar.mo120263d();
        if (d != null) {
            list = d.unusable_reasons;
        } else {
            list = null;
        }
        return aVar.mo117315a(b2, f, j, k, m, list);
    }

    /* renamed from: l */
    public final CalendarEventCreator mo117245l() {
        String str;
        CalendarEventCreator f;
        MeetingRoomSubscriptionInfo c = this.f82149b.mo120262c();
        if (c == null || (f = c.mo120188f()) == null) {
            str = null;
        } else {
            str = f.getChatterId();
        }
        if (!TextUtils.isEmpty(str)) {
            MeetingRoomSubscriptionInfo c2 = this.f82149b.mo120262c();
            if (c2 != null) {
                return c2.mo120188f();
            }
            return null;
        }
        MeetingRoomSubscriptionInfo c3 = this.f82149b.mo120262c();
        if (c3 != null) {
            return c3.mo120186e();
        }
        return null;
    }

    /* renamed from: m */
    public final CalendarEventCreator mo117246m() {
        String str;
        CalendarEventCreator d;
        MeetingRoomSubscriptionInfo c = this.f82149b.mo120262c();
        if (c == null || (d = c.mo120185d()) == null) {
            str = null;
        } else {
            str = d.getChatterId();
        }
        if (!TextUtils.isEmpty(str)) {
            MeetingRoomSubscriptionInfo c2 = this.f82149b.mo120262c();
            if (c2 != null) {
                return c2.mo120185d();
            }
            return null;
        }
        MeetingRoomSubscriptionInfo c3 = this.f82149b.mo120262c();
        if (c3 != null) {
            return c3.mo120186e();
        }
        return null;
    }

    /* renamed from: n */
    private final String m122206n() {
        List<MeetingRoomEquipment> f;
        boolean z;
        boolean z2;
        boolean z3;
        MeetingRoomInformation b = this.f82149b.mo120261b();
        if (b == null || (f = b.mo120160f()) == null) {
            return "";
        }
        List<MeetingRoomEquipment> list = f;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (T t : f) {
            String str = t.i18n_name;
            if (str == null || str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (sb.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    sb.append(" · ");
                }
                sb.append(t.i18n_name);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "equipmentStringBuilder.toString()");
        return sb2;
    }

    /* renamed from: c */
    public final String mo117236c() {
        boolean z;
        MeetingRoomInformation b = this.f82149b.mo120261b();
        if (b == null) {
            return "";
        }
        boolean z2 = true;
        if (b.mo120141a().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (b.mo120149b().length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return b.mo120141a() + '-' + b.mo120149b();
            }
        }
        return b.mo120141a() + b.mo120149b();
    }

    /* renamed from: d */
    public final String mo117237d() {
        boolean z;
        MeetingRoomInformation b = this.f82149b.mo120261b();
        if (b == null) {
            return "";
        }
        boolean z2 = true;
        if (b.mo120152c().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (b.mo120155d().length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return b.mo120152c() + " (" + b.mo120155d() + ')';
            }
        }
        return b.mo120152c() + b.mo120155d();
    }

    public ProfileContentData(MeetingRoomProfileBaseData aVar, StatusInformation zVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "meetingRoomProfileBaseData");
        Intrinsics.checkParameterIsNotNull(zVar, "statusInformation");
        this.f82148a = aVar;
        this.f82149b = zVar;
    }
}
