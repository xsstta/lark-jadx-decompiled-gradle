package com.ss.android.lark.calendar.impl.features.meetingroom.profile;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomStatus;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomUnusableReasons;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.data.MeetingRoomProfileBaseData;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.helper.MeetingRoomInfoHelper;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomInformation;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomSubscriptionInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.StatusInformation;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u0002H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u0016J\u0010\u0010%\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomModelApi;", "extras", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "meetingRoomInformation", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomInformation;", "getMeetingRoomInformation", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomInformation;", "setMeetingRoomInformation", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomInformation;)V", "meetingRoomProfileBaseData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/data/MeetingRoomProfileBaseData;", "statusInformation", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/StatusInformation;", "getStatusInformation", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/StatusInformation;", "setStatusInformation", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/StatusInformation;)V", "subscriptionInfo", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomSubscriptionInfo;", "getSubscriptionInfo", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomSubscriptionInfo;", "setSubscriptionInfo", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomSubscriptionInfo;)V", "getCanNotReserveReason", "", "getEquipmentText", "getEventTimeText", "getMeetingRoomBaseData", "getMeetingRoomRuleText", "getViewData", "onSaveInstanceState", "", "outState", "updateStatusInformation", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.c */
public final class MeetingRoomProfileModel extends BaseModelCalendar<MeetingRoomProfileContract.IMeetingRoomViewData> implements MeetingRoomProfileContract.IMeetingRoomModelApi {

    /* renamed from: a */
    public MeetingRoomProfileBaseData f82172a;

    /* renamed from: b */
    private StatusInformation f82173b;

    /* renamed from: c */
    private MeetingRoomInformation f82174c;

    /* renamed from: d */
    private MeetingRoomSubscriptionInfo f82175d;

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomModelApi
    /* renamed from: a */
    public MeetingRoomProfileBaseData mo117267a() {
        return this.f82172a;
    }

    /* renamed from: b */
    public final StatusInformation mo117306b() {
        return this.f82173b;
    }

    /* renamed from: c */
    public final MeetingRoomInformation mo117307c() {
        return this.f82174c;
    }

    /* renamed from: d */
    public final MeetingRoomSubscriptionInfo mo117308d() {
        return this.f82175d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileModel$getViewData$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewData;", "getBlockedEventTimeText", "", "getBuildingName", "getCanNotReserveReason", "getCapacity", "", "getDescription", "getEquipments", "getEventBlocker", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "getEventCreator", "getMeetingRoomImageUrl", "getMeetingRoomName", "getMeetingRoomRuleText", "getMeetingRoomState", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomStatus;", "isShowStateInfo", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.c$a */
    public static final class C32144a implements MeetingRoomProfileContract.IMeetingRoomViewData {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomProfileModel f82176a;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: d */
        public String mo117279d() {
            return this.f82176a.mo117309e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: g */
        public String mo117282g() {
            return this.f82176a.mo117311h();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: i */
        public String mo117284i() {
            return this.f82176a.mo117310g();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: j */
        public String mo117285j() {
            return this.f82176a.mo117312i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: c */
        public long mo117278c() {
            MeetingRoomInformation c = this.f82176a.mo117307c();
            if (c != null) {
                return c.mo120157e();
            }
            return 0;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: k */
        public boolean mo117286k() {
            return this.f82176a.f82172a.mo117299d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: e */
        public String mo117280e() {
            String h;
            MeetingRoomInformation c = this.f82176a.mo117307c();
            if (c == null || (h = c.mo120163h()) == null) {
                return "";
            }
            return h;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: f */
        public String mo117281f() {
            String i;
            MeetingRoomInformation c = this.f82176a.mo117307c();
            if (c == null || (i = c.mo120165i()) == null) {
                return "";
            }
            return i;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: h */
        public MeetingRoomStatus mo117283h() {
            MeetingRoomStatus a;
            StatusInformation b = this.f82176a.mo117306b();
            if (b == null || (a = b.mo120256a()) == null) {
                return MeetingRoomStatus.CAN_RESERVE;
            }
            return a;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: l */
        public CalendarEventCreator mo117287l() {
            String str;
            CalendarEventCreator f;
            MeetingRoomSubscriptionInfo d = this.f82176a.mo117308d();
            if (d == null || (f = d.mo120188f()) == null) {
                str = null;
            } else {
                str = f.getChatterId();
            }
            if (!TextUtils.isEmpty(str)) {
                MeetingRoomSubscriptionInfo d2 = this.f82176a.mo117308d();
                if (d2 != null) {
                    return d2.mo120188f();
                }
                return null;
            }
            MeetingRoomSubscriptionInfo d3 = this.f82176a.mo117308d();
            if (d3 != null) {
                return d3.mo120186e();
            }
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: m */
        public CalendarEventCreator mo117288m() {
            String str;
            CalendarEventCreator d;
            MeetingRoomSubscriptionInfo d2 = this.f82176a.mo117308d();
            if (d2 == null || (d = d2.mo120185d()) == null) {
                str = null;
            } else {
                str = d.getChatterId();
            }
            if (!TextUtils.isEmpty(str)) {
                MeetingRoomSubscriptionInfo d3 = this.f82176a.mo117308d();
                if (d3 != null) {
                    return d3.mo120185d();
                }
                return null;
            }
            MeetingRoomSubscriptionInfo d4 = this.f82176a.mo117308d();
            if (d4 != null) {
                return d4.mo120186e();
            }
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: a */
        public String mo117276a() {
            MeetingRoomInformation b;
            boolean z;
            StatusInformation b2 = this.f82176a.mo117306b();
            if (b2 == null || (b = b2.mo120261b()) == null) {
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

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewData
        /* renamed from: b */
        public String mo117277b() {
            MeetingRoomInformation b;
            boolean z;
            StatusInformation b2 = this.f82176a.mo117306b();
            if (b2 == null || (b = b2.mo120261b()) == null) {
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

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32144a(MeetingRoomProfileModel cVar) {
            this.f82176a = cVar;
        }
    }

    /* renamed from: j */
    public MeetingRoomProfileContract.IMeetingRoomViewData mo109793f() {
        return new C32144a(this);
    }

    /* renamed from: e */
    public final String mo117309e() {
        MeetingRoomInformation pVar = this.f82174c;
        if (pVar != null) {
            return MeetingRoomInfoHelper.f82177a.mo117317a(this.f82172a.mo117294b(), this.f82172a.mo117302f(), pVar.mo120162g(), pVar.mo120170n(), pVar.mo120166j(), pVar.mo120167k(), pVar.mo120168l(), pVar.mo120169m());
        }
        return "";
    }

    /* renamed from: g */
    public final String mo117310g() {
        MeetingRoomInformation b;
        List<MeetingRoomUnusableReasons.UnusableReason> list;
        StatusInformation zVar = this.f82173b;
        if (zVar == null || (b = zVar.mo120261b()) == null) {
            return "";
        }
        MeetingRoomInfoHelper aVar = MeetingRoomInfoHelper.f82177a;
        long b2 = this.f82172a.mo117294b();
        String f = this.f82172a.mo117302f();
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

    /* renamed from: i */
    public final String mo117312i() {
        MeetingRoomSubscriptionInfo qVar = this.f82175d;
        if (qVar == null) {
            return "";
        }
        long j = (long) 1000;
        String a = C32646c.m125251a(qVar.mo120172a() * j, qVar.mo120177b() * j, qVar.mo120184c(), false);
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDateTimeShowUtil…tionInfo.isAllDay, false)");
        return a;
    }

    /* renamed from: h */
    public final String mo117311h() {
        List<MeetingRoomEquipment> f;
        boolean z;
        boolean z2;
        boolean z3;
        MeetingRoomInformation pVar = this.f82174c;
        if (pVar == null || (f = pVar.mo120160f()) == null) {
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

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomModelApi
    /* renamed from: a */
    public void mo117268a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        this.f82172a.mo117291a(bundle);
    }

    public MeetingRoomProfileModel(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "extras");
        this.f82172a = MeetingRoomProfileBaseData.f82165a.mo117305a(bundle);
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomModelApi
    /* renamed from: a */
    public void mo117269a(StatusInformation zVar) {
        Intrinsics.checkParameterIsNotNull(zVar, "statusInformation");
        this.f82173b = zVar;
        this.f82174c = zVar.mo120261b();
        this.f82175d = zVar.mo120262c();
    }
}
