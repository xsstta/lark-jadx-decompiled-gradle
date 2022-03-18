package com.ss.android.lark.invitation.v2.statistic;

import android.content.Intent;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class InvHitPoint extends BaseHitPoint {

    /* renamed from: a */
    private static String f102935a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShareMethod {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShareType {
    }

    /* renamed from: a */
    public static void m160361a(boolean z, String str) {
        try {
            Statistics.sendEvent("invite_people_external_view", ah(str).put(UpdateKey.STATUS, z ? 1 : 0));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: a */
    public static void m160360a(boolean z) {
        try {
            Statistics.sendEvent("invite_people_external_import_invite_cancel", m160324D().put("change_to", z ? 1 : 0));
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m160358a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ShareHitPoint.f121869d, str);
            jSONObject.put("method", str2);
            jSONObject.put("unique_id", str3);
            jSONObject.put("platform", "android");
            Statistics.sendEvent("invite_people_h5_share", jSONObject);
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", "failed to invitePeopleH5Share, e:" + e);
        }
    }

    /* renamed from: a */
    public static void m160359a(String str, boolean z) {
        try {
            Statistics.sendEvent("bind_invite_start", ah(str).put("usertype", z ? "admin" : "member"));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: A */
    public static void m160320A() {
        Statistics.sendEvent("onboarding_guide_addmember_next");
    }

    /* renamed from: D */
    private static JSONObject m160324D() {
        return ah(f102935a);
    }

    /* renamed from: a */
    public static void m160349a() {
        Statistics.sendEvent("invitation_enter_choose_show");
    }

    /* renamed from: b */
    public static void m160362b() {
        Statistics.sendEvent("invitation_choose_external_click");
    }

    /* renamed from: c */
    public static void m160369c() {
        Statistics.sendEvent("invitation_choose_internal_click");
    }

    /* renamed from: d */
    public static void m160375d() {
        Statistics.sendEvent("invite_people_member_CTA_view");
    }

    /* renamed from: e */
    public static void m160378e() {
        Statistics.sendEvent("invite_people_member_CTA_click");
    }

    /* renamed from: v */
    public static void m160412v() {
        Statistics.sendEvent("bind_invite_comfirm_transmit_click");
    }

    /* renamed from: w */
    public static void m160414w() {
        Statistics.sendEvent("onboarding_guide_addmember_show");
    }

    /* renamed from: x */
    public static void m160416x() {
        Statistics.sendEvent("onboarding_guide_addmember_save");
    }

    /* renamed from: y */
    public static void m160418y() {
        Statistics.sendEvent("onboarding_guide_addmember_share");
    }

    /* renamed from: z */
    public static void m160420z() {
        Statistics.sendEvent("onboarding_guide_addmember_invitemore");
    }

    /* renamed from: f */
    public static void m160380f() {
        Statistics.sendEvent("jointeam_wechate_click", m160324D());
    }

    /* renamed from: g */
    public static void m160382g() {
        Statistics.sendEvent("invite_people_external_import_add", m160324D());
    }

    /* renamed from: h */
    public static void m160384h() {
        Statistics.sendEvent("invite_people_external_import_invite_view", m160324D());
    }

    /* renamed from: i */
    public static void m160386i() {
        Statistics.sendEvent("invite_people_external_search_add", m160324D());
    }

    /* renamed from: j */
    public static void m160388j() {
        Statistics.sendEvent("membersbatch_format_feedback_dialog_show", m160324D());
    }

    /* renamed from: k */
    public static void m160390k() {
        Statistics.sendEvent("membersbatch_format_dialog_continue_click", m160324D());
    }

    /* renamed from: l */
    public static void m160392l() {
        Statistics.sendEvent("membersbatch_format_dialog_cancel_click", m160324D());
    }

    /* renamed from: m */
    public static void m160394m() {
        Statistics.sendEvent("membersbatch_feedback_dialog_confirm_click", m160324D());
    }

    /* renamed from: n */
    public static void m160396n() {
        Statistics.sendEvent("addressbook_usinglark_click", m160324D());
    }

    /* renamed from: o */
    public static void m160398o() {
        Statistics.sendEvent("addressbook_unusinglark_click", m160324D());
    }

    /* renamed from: p */
    public static void m160400p() {
        Statistics.sendEvent("addressbook_search_click", m160324D());
    }

    /* renamed from: q */
    public static void m160402q() {
        Statistics.sendEvent("addressbook_usinglark_add_click", m160324D());
    }

    /* renamed from: r */
    public static void m160404r() {
        Statistics.sendEvent("addressbook_usinglark_invite_click", m160324D());
    }

    /* renamed from: s */
    public static void m160406s() {
        Statistics.sendEvent("core_contact_home_school_contact_invite_parents_click", m160324D());
    }

    /* renamed from: t */
    public static void m160408t() {
        Statistics.sendEvent("core_contact_home_school_contact_inactivated_click", m160324D());
    }

    /* renamed from: u */
    public static void m160410u() {
        try {
            Statistics.sendEvent("message_forward_single_click", new JSONObject().put("from_source", "bind_invite"));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: A */
    public static void m160321A(String str) {
        Statistics.sendEvent("add_member_skip", ah(str));
    }

    /* renamed from: B */
    public static void m160322B(String str) {
        Statistics.sendEvent("add_member_channel_show", ah(str));
    }

    /* renamed from: C */
    public static void m160323C(String str) {
        Statistics.sendEvent("add_member_add_by_phone_click", ah(str));
    }

    /* renamed from: D */
    public static void m160325D(String str) {
        Statistics.sendEvent("add_member_add_by_email_click", ah(str));
    }

    /* renamed from: E */
    public static void m160326E(String str) {
        Statistics.sendEvent("add_member_add_by_phone_or_email_click", ah(str));
    }

    /* renamed from: F */
    public static void m160327F(String str) {
        Statistics.sendEvent("add_member_wechat_invite_click", ah(str));
    }

    /* renamed from: G */
    public static void m160328G(String str) {
        Statistics.sendEvent("add_member_view_team_code_click", ah(str));
    }

    /* renamed from: H */
    public static void m160329H(String str) {
        Statistics.sendEvent("add_member_team_code_show", ah(str));
    }

    /* renamed from: I */
    public static void m160330I(String str) {
        Statistics.sendEvent("add_member_team_code_copy_click", ah(str));
    }

    /* renamed from: J */
    public static void m160331J(String str) {
        Statistics.sendEvent("add_member_team_code_manual_click", ah(str));
    }

    /* renamed from: K */
    public static void m160332K(String str) {
        Statistics.sendEvent("add_member_invite_team_code_click", ah(str));
    }

    /* renamed from: L */
    public static void m160333L(String str) {
        Statistics.sendEvent("add_member_lark_invite_click", ah(str));
    }

    /* renamed from: M */
    public static void m160334M(String str) {
        Statistics.sendEvent("invite_people_help_click", m160324D());
    }

    /* renamed from: N */
    public static void m160335N(String str) {
        Statistics.sendEvent("invite_people_external_switchto_Qrcode", ah(str));
    }

    /* renamed from: O */
    public static void m160336O(String str) {
        Statistics.sendEvent("invite_people_external_switchto_link", ah(str));
    }

    /* renamed from: P */
    public static void m160337P(String str) {
        Statistics.sendEvent("invite_people_external_search_nomatch_search", ah(str));
    }

    /* renamed from: Q */
    public static void m160338Q(String str) {
        Statistics.sendEvent("invite_people_external_search_nomatch_invite", ah(str));
    }

    /* renamed from: R */
    public static void m160339R(String str) {
        Statistics.sendEvent("invite_people_external_search_invite_view", ah(str));
    }

    /* renamed from: S */
    public static void m160340S(String str) {
        Statistics.sendEvent("invite_people_external_save_qrcode", ah(str));
    }

    /* renamed from: T */
    public static void m160341T(String str) {
        Statistics.sendEvent("invite_people_external_copy_link", ah(str));
    }

    /* renamed from: U */
    public static void m160342U(String str) {
        Statistics.sendEvent("invite_people_external_privacy", ah(str));
    }

    /* renamed from: W */
    public static void m160344W(String str) {
        Statistics.sendEvent("membersbatch_send_click", ah(str));
    }

    /* renamed from: Z */
    public static void m160347Z(String str) {
        Statistics.sendEvent("addressbook_enter", ah(str));
    }

    /* renamed from: a */
    public static void m160354a(String str) {
        Statistics.sendEvent("add_member_send_show", ah(str));
    }

    public static void aa(String str) {
        Statistics.sendEvent("invite_people_external_guide_view", ah(str));
    }

    public static void ab(String str) {
        Statistics.sendEvent("invite_people_external_guide_click", ah(str));
    }

    public static void ac(String str) {
        Statistics.sendEvent("invite_people_external_qrcode_click", ah(str));
    }

    public static void ad(String str) {
        Statistics.sendEvent("invite_people_external_Scan_QRCode_click", ah(str));
    }

    public static void ae(String str) {
        Statistics.sendEvent("invite_people_external_qrcode_show", ah(str));
    }

    public static void af(String str) {
        Statistics.sendEvent("add_member_help_click", ah(str));
    }

    public static void ag(String str) {
        Statistics.sendEvent("invite_people_external_guide_close", ah(str));
    }

    /* renamed from: b */
    public static void m160365b(String str) {
        Statistics.sendEvent("add_member_send_click", ah(str));
    }

    /* renamed from: c */
    public static void m160371c(String str) {
        Statistics.sendEvent("add_member_input_phone", ah(str));
    }

    /* renamed from: d */
    public static void m160376d(String str) {
        Statistics.sendEvent("add_member_input_email", ah(str));
    }

    /* renamed from: e */
    public static void m160379e(String str) {
        Statistics.sendEvent("add_member_input_name", ah(str));
    }

    /* renamed from: u */
    public static void m160411u(String str) {
        Statistics.sendEvent("add_member_invite_success_dialog_more_click", ah(str));
    }

    /* renamed from: v */
    public static void m160413v(String str) {
        Statistics.sendEvent("add_member_invite_approve_dialog_show", ah(str));
    }

    /* renamed from: w */
    public static void m160415w(String str) {
        Statistics.sendEvent("add_member_invite_approve_dialog_done_click", ah(str));
    }

    /* renamed from: x */
    public static void m160417x(String str) {
        Statistics.sendEvent("add_member_invite_approve_dialog_more_click", ah(str));
    }

    /* renamed from: y */
    public static void m160419y(String str) {
        Statistics.sendEvent("add_member_go_back_click", ah(str));
    }

    /* renamed from: z */
    public static void m160421z(String str) {
        Statistics.sendEvent("add_member_link_qrcode_invite_go_back_click", ah(str));
    }

    /* renamed from: X */
    public static void m160345X(String str) {
        try {
            Statistics.sendEvent("membersbatch_feedback_dialog_show", m160324D().put("result", str));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: Y */
    public static void m160346Y(String str) {
        try {
            Statistics.sendEvent("add_member_contactbatch_invite_click", m160324D().put("scenes", str));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: a */
    public static void m160350a(int i) {
        try {
            Statistics.sendEvent("invite_people_external_import_check", m160324D().put("result", i));
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", e.getMessage());
        }
    }

    private static JSONObject ah(String str) {
        try {
            f102935a = str;
            return new JSONObject().put(ShareHitPoint.f121868c, str);
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public static void m160363b(int i) {
        try {
            Statistics.sendEvent("invite_people_external_search", m160324D().put("result", i));
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m160370c(int i) {
        try {
            Statistics.sendEvent("core_contact_home_school_contact_invite_more_parents_click", m160324D().put("invite_type", i));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: d */
    public static void m160377d(boolean z) {
        int i;
        try {
            JSONObject D = m160324D();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            Statistics.sendEvent("invite_people_external_search_invite_cancel", D.put("change_to", i));
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", e.getMessage());
        }
    }

    /* renamed from: f */
    public static void m160381f(String str) {
        Statistics.sendEvent("import_contacts_choose_show", ah(str));
    }

    /* renamed from: g */
    public static void m160383g(String str) {
        Statistics.sendEvent("import_contacts_choose_click", ah(str));
    }

    /* renamed from: h */
    public static void m160385h(String str) {
        Statistics.sendEvent("add_member_link_invite_click", ah(str));
    }

    /* renamed from: i */
    public static void m160387i(String str) {
        Statistics.sendEvent("add_member_qrcode_invite_click", ah(str));
    }

    /* renamed from: j */
    public static void m160389j(String str) {
        Statistics.sendEvent("add_member_switch_to_email_click", ah(str));
    }

    /* renamed from: k */
    public static void m160391k(String str) {
        Statistics.sendEvent("add_member_switch_to_phone_click", ah(str));
    }

    /* renamed from: l */
    public static void m160393l(String str) {
        Statistics.sendEvent("add_member_link_invite_show", ah(str));
    }

    /* renamed from: m */
    public static void m160395m(String str) {
        Statistics.sendEvent("add_member_qrcode_invite_show", ah(str));
    }

    /* renamed from: n */
    public static void m160397n(String str) {
        Statistics.sendEvent("add_member_link_invite_copy_click", ah(str));
    }

    /* renamed from: o */
    public static void m160399o(String str) {
        Statistics.sendEvent("add_member_qrcode_invite_save_click", ah(str));
    }

    /* renamed from: p */
    public static void m160401p(String str) {
        Statistics.sendEvent("add_member_switch_link_qrcode_click", ah(str));
    }

    /* renamed from: q */
    public static void m160403q(String str) {
        Statistics.sendEvent("add_member_invite_refresh_confirm_click", ah(str));
    }

    /* renamed from: r */
    public static void m160405r(String str) {
        Statistics.sendEvent("add_member_invite_refresh_cancel_click", ah(str));
    }

    /* renamed from: s */
    public static void m160407s(String str) {
        Statistics.sendEvent("add_member_invite_success_dialog_show", ah(str));
    }

    /* renamed from: t */
    public static void m160409t(String str) {
        Statistics.sendEvent("add_member_invite_success_dialog_done_click", ah(str));
    }

    /* renamed from: V */
    public static void m160343V(String str) {
        try {
            Statistics.sendEvent("Scan_QRCode_Contacts", ah(str).put("origination", "invite_external_contacts_scan").put(ShareHitPoint.f121868c, "add_external_contact"));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: a */
    private static String m160348a(ShareActionType shareActionType) {
        if (ShareActionType.WX.equals(shareActionType)) {
            return "wechat";
        }
        if (ShareActionType.WB.equals(shareActionType)) {
            return "weibo";
        }
        if (ShareActionType.QQ.equals(shareActionType)) {
            return "qq";
        }
        if (ShareActionType.SYS.equals(shareActionType)) {
            return "system";
        }
        return "unknown";
    }

    /* renamed from: c */
    public static void m160373c(boolean z) {
        String str;
        try {
            JSONObject D = m160324D();
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            Statistics.sendEvent("invite_people_external_search_invite_send", D.put("result", str));
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m160367b(boolean z) {
        int i;
        try {
            JSONObject D = m160324D();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            Statistics.sendEvent("invite_people_external_import_invite_send", D.put("change_to", i));
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m160364b(ShareActionType shareActionType, String str) {
        try {
            Statistics.sendEvent("invite_people_external_share_link", ah(str).put("method", m160348a(shareActionType)));
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m160372c(String str, ShareActionType shareActionType) {
        try {
            Statistics.sendEvent("add_member_team_code_share_click", ah(str).put("method", m160348a(shareActionType)));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: a */
    public static void m160351a(int i, int i2) {
        try {
            Statistics.sendEvent("core_contact_home_school_contact_qr_link_invite", m160324D().put("invite_source", i).put("b_name", i2));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: b */
    public static void m160366b(String str, ShareActionType shareActionType) {
        try {
            Statistics.sendEvent("add_member_qrcode_invite_share_click", ah(str).put("method", m160348a(shareActionType)));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: a */
    public static void m160352a(Intent intent, String str) {
        ArrayList<String> arrayList;
        int i;
        ArrayList<String> arrayList2 = null;
        if (intent != null) {
            try {
                arrayList = intent.getStringArrayListExtra("key_result_p2p_share_chatter_ids");
            } catch (JSONException e) {
                Log.m165386e("InvitationModule", e);
                return;
            }
        } else {
            arrayList = null;
        }
        if (intent != null) {
            arrayList2 = intent.getStringArrayListExtra("key_result_totle_share_chatter_ids");
        }
        int i2 = 0;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (arrayList2 != null) {
            i2 = arrayList2.size();
        }
        Statistics.sendEvent("add_member_lark_forward", ah(str).put("user_count", i).put("group_count", i2 - i));
    }

    /* renamed from: c */
    public static void m160374c(boolean z, String str) {
        String str2;
        try {
            JSONObject ah = ah(str);
            if (z) {
                str2 = "share_to_external_contacts";
            } else {
                str2 = "invite_external_contacts";
            }
            Statistics.sendEvent("Visited_Privacy_Setting", ah.put("origination", str2));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: a */
    public static void m160353a(ShareActionType shareActionType, String str) {
        try {
            Statistics.sendEvent("invite_people_external_share_Qrcode", ah(str).put("method", m160348a(shareActionType)));
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m160368b(boolean z, String str) {
        try {
            Statistics.sendEvent("invite_people_external_import", ah(str).put("access", z));
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m160355a(String str, ShareActionType shareActionType) {
        try {
            Statistics.sendEvent("add_member_link_invite_share_click", ah(str).put("method", m160348a(shareActionType)));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: a */
    public static void m160356a(String str, String str2) {
        try {
            Statistics.sendEvent("add_member_invite_refresh_click", ah(str).put("add_member_tab", str2));
        } catch (JSONException e) {
            Log.m165386e("InvitationModule", e);
        }
    }

    /* renamed from: a */
    public static void m160357a(String str, String str2, ShareActionType shareActionType, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ShareHitPoint.f121869d, str);
            jSONObject.put("method", str2);
            jSONObject.put("channel", m160348a(shareActionType));
            jSONObject.put("unique_id", str3);
            jSONObject.put("platform", "android");
            Statistics.sendEvent("invite_people_h5_share", jSONObject);
        } catch (JSONException e) {
            Log.m165383e("InvitationModule", "failed to invitePeopleH5Share, e:" + e);
        }
    }
}
