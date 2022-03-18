package com.ss.android.lark.contact.feat.statistics;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0007J\b\u0010\u0016\u001a\u00020\u000fH\u0007J\b\u0010\u0017\u001a\u00020\u000fH\u0007J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\nH\u0007J\b\u0010\u001d\u001a\u00020\u000fH\u0007J\b\u0010\u001e\u001a\u00020\u000fH\u0007J\b\u0010\u001f\u001a\u00020\u000fH\u0007J\b\u0010 \u001a\u00020\u000fH\u0007J\b\u0010!\u001a\u00020\u000fH\u0007J\b\u0010\"\u001a\u00020\u000fH\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006#"}, d2 = {"Lcom/ss/android/lark/contact/feat/statistics/ContactMobileHitPoint;", "", "()V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "isEmail", "", "()Z", "setEmail", "(Z)V", "contactExternalLetterClick", "", "getCommonParams", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "getLocation", "inviteMemberImportContact", "isChecked", "inviteMemberImportContactDelete", "inviteMemberImportContactIndex", "inviteMemberImportContactSave", "number", "", "inviteMemberImportContactSearch", "isMatch", "invitePeopleExternalImportIndex", "invitePeopleExternalImportSearch", "membersbatchChooseClick", "membersbatchChooseClickCancel", "sendOnBoardingSysInvite", "userExitTeamEntrance", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.c.b */
public final class ContactMobileHitPoint {

    /* renamed from: a */
    public static final ContactMobileHitPoint f91565a = new ContactMobileHitPoint();

    /* renamed from: b */
    private static String f91566b;

    /* renamed from: c */
    private static boolean f91567c;

    private ContactMobileHitPoint() {
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m138540h() {
        Statistics.sendEvent("onboarding_system_invite");
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m138541i() {
        Statistics.sendEvent("contact_external_letter_click");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m138530a() {
        Statistics.sendEvent("invite_people_external_import_index", f91565a.m138542j());
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m138532b() {
        Statistics.sendEvent("invite_member_import_contact_index", f91565a.m138542j());
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m138534c() {
        Statistics.sendEvent("invite_member_import_contact_delete", f91565a.m138542j());
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m138536d() {
        Statistics.sendEvent("invite_people_external_import_search", f91565a.m138542j());
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m138537e() {
        Statistics.sendEvent("membersbatch_choose_click", f91565a.m138542j());
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m138538f() {
        Statistics.sendEvent("user_exit_team_entrance", f91565a.m138542j());
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m138539g() {
        Statistics.sendEvent("membersbatch_choose_click_cancel", f91565a.m138542j());
    }

    /* renamed from: k */
    private final String m138543k() {
        if (f91567c) {
            return "email";
        }
        return "phone";
    }

    /* renamed from: j */
    private final JSONObject m138542j() {
        return new JSONObject().put("from", f91566b).put("location", m138543k());
    }

    /* renamed from: a */
    public final void mo130727a(String str) {
        f91566b = str;
    }

    /* renamed from: a */
    public final void mo130728a(boolean z) {
        f91567c = z;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m138531a(int i) {
        Statistics.sendEvent("invite_member_import_contact_save", f91565a.m138542j().put("number", i));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m138533b(boolean z) {
        Statistics.sendEvent("invite_member_import_contact_search", f91565a.m138542j().put("match", z));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m138535c(boolean z) {
        String str;
        if (z) {
            str = "invite_member_import_contact_check";
        } else {
            str = "invite_member_import_contact_uncheck";
        }
        Statistics.sendEvent(str, f91565a.m138542j());
    }
}
