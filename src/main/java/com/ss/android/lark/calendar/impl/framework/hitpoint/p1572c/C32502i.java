package com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u001a \u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003\u001a,\u0010\u0007\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005\u001a\u0010\u0010\n\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a \u0010\u000b\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0018\u0010\f\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\r\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0010\u0010\u000e\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a \u0010\u0010\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0018\u0010\u0012\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0010\u0010\u0013\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u001a\u0010\u0014\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u001a\f\u0010\u0016\u001a\u00020\u0003*\u00020\u0005H\u0002¨\u0006\u0017"}, d2 = {"calCalendarShareClick", "", "calendarId", "", "isAdminPlus", "", "clickAction", "calCalendarShareConfirmClick", "withNote", "isCreateInvite", "calCalendarShareConfirmView", "calCalendarShareInviteClick", "calCalendarShareInviteView", "calCalendarShareView", "calQrCodeClick", "calQrCodeView", "calSubscribeInviteCardClick", "isAddedByAdmin", "calSubscribersClick", "calSubscribersView", "checkSendShareCalendarHit", ShareHitPoint.f121868c, "toHitPointString", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.i */
public final class C32502i {
    /* renamed from: a */
    private static final String m124372a(boolean z) {
        return z ? "true" : "false";
    }

    /* renamed from: a */
    public static final void m124373a(String str) {
        new HitPointEvent("cal_calendar_share_confirm_view").mo118758a("calendar_id", str).mo118759a();
    }

    /* renamed from: b */
    public static final void m124379b(String str) {
        new HitPointEvent("cal_calendar_subscribers_view").mo118758a("calendar_id", str).mo118759a();
    }

    /* renamed from: c */
    public static final void m124383c(String str) {
        new HitPointEvent("cal_calendar_qr_code_view").mo118758a("calendar_id", str).mo118759a();
    }

    /* renamed from: d */
    public static final void m124385d(String str) {
        new HitPointEvent("cal_calendar_qr_code_click").mo118758a("calendar_id", str).mo118758a("click", "save_to_album").mo118760b("none").mo118759a();
    }

    /* renamed from: b */
    public static final void m124380b(String str, String str2) {
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != 91600495) {
                if (hashCode == 1224974412 && str2.equals("calendar_share_by_owner")) {
                    m124384c(str, true, "title");
                }
            } else if (str2.equals("calendar_share_by_subscriber")) {
                m124384c(str, false, "title");
            }
        }
    }

    /* renamed from: a */
    public static final void m124374a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "clickAction");
        HitPointEvent a = new HitPointEvent("cal_calendar_subscribers_click").mo118758a("calendar_id", str).mo118758a("click", str2);
        int hashCode = str2.hashCode();
        if (hashCode != -46292327) {
            if (hashCode == 96417 && str2.equals("add")) {
                a.mo118758a("target", "cal_calendar_share_invite_view");
            }
        } else if (str2.equals("individual")) {
            a.mo118758a("target", "cal_calendar_access_setting_view");
        }
        a.mo118759a();
    }

    /* renamed from: b */
    public static final void m124381b(String str, boolean z) {
        new HitPointEvent("cal_calendar_share_invite_view").mo118758a("calendar_id", str).mo118758a("is_admin_plus", m124372a(z)).mo118759a();
    }

    /* renamed from: a */
    public static final void m124377a(String str, boolean z) {
        new HitPointEvent("cal_calendar_share_view").mo118758a("calendar_id", str).mo118758a("is_admin_plus", m124372a(z)).mo118759a();
    }

    /* renamed from: c */
    public static final void m124384c(String str, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "clickAction");
        HitPointEvent a = new HitPointEvent("cal_calendar_subscribe_invite_card_click").mo118758a("calendar_id", str).mo118758a("is_added_by_admin", m124372a(z)).mo118758a("click", str2);
        int hashCode = str2.hashCode();
        if (hashCode != -1631354462) {
            if (hashCode == 110371416 && str2.equals("title")) {
                a.mo118758a("target", "cal_calendar_detail_view");
            }
        } else if (str2.equals("open_cal_check")) {
            a.mo118758a("target", "cal_calendar_main_view");
        }
        a.mo118759a();
    }

    /* renamed from: b */
    public static final void m124382b(String str, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "clickAction");
        HitPointEvent a = new HitPointEvent("cal_calendar_share_invite_click").mo118758a("calendar_id", str).mo118758a("is_admin_plus", m124372a(z)).mo118757a(str2);
        int hashCode = str2.hashCode();
        if (hashCode != 3377907) {
            if (hashCode == 109400031 && str2.equals("share")) {
                a.mo118760b("cal_calendar_detail_view");
            }
        } else if (str2.equals("next")) {
            a.mo118760b("cal_calendar_share_confirm_view");
        }
        a.mo118759a();
    }

    /* renamed from: a */
    public static final void m124378a(String str, boolean z, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "clickAction");
        HitPointEvent kVar = new HitPointEvent("cal_calendar_share_click");
        kVar.mo118758a("calendar_id", str);
        kVar.mo118758a("is_admin_plus", m124372a(z));
        kVar.mo118758a("click", str2);
        switch (str2.hashCode()) {
            case 96417:
                if (str2.equals("add")) {
                    kVar.mo118758a("target", "cal_calendar_share_invite_view");
                    break;
                }
                break;
            case 563217739:
                if (str2.equals("qr_code")) {
                    kVar.mo118758a("target", "cal_calendar_qr_code_view");
                    break;
                }
                break;
            case 841859339:
                if (str2.equals("subscribers")) {
                    kVar.mo118758a("target", "cal_calendar_subscribers_view");
                    break;
                }
                break;
            case 1624473890:
                if (str2.equals("default_access")) {
                    kVar.mo118758a("target", "cal_calendar_default_access_view");
                    break;
                }
                break;
        }
        kVar.mo118759a();
    }

    /* renamed from: a */
    public static final void m124375a(String str, String str2, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str2, "clickAction");
        HitPointEvent a = new HitPointEvent("cal_calendar_share_confirm_click").mo118758a("calendar_id", str).mo118758a("click", str2);
        int hashCode = str2.hashCode();
        if (hashCode != -46292327) {
            if (hashCode == 109400031 && str2.equals("share")) {
                a.mo118758a("target", "cal_calendar_detail_view");
                a.mo118758a("with_note", m124372a(z));
                a.mo118758a("is_create_invite", m124372a(z2));
            }
        } else if (str2.equals("individual")) {
            a.mo118758a("target", "cal_calendar_access_setting_view");
        }
        a.mo118759a();
    }

    /* renamed from: a */
    public static /* synthetic */ void m124376a(String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        m124375a(str, str2, z, z2);
    }
}
