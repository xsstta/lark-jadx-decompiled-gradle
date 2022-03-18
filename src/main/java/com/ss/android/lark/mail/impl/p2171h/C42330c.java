package com.ss.android.lark.mail.impl.p2171h;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.lark.pb.email.client.v1.FilterType;
import com.bytedance.lark.pb.email.client.v1.Label;
import com.bytedance.lark.pb.email.client.v1.MessagesSummary;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.ContactSearchType;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.SearchRet;
import com.ss.android.lark.mail.impl.entity.SendState;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43785p;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.c */
public class C42330c {

    /* renamed from: a */
    public static boolean f107632a;

    /* renamed from: com.ss.android.lark.mail.impl.h.c$a */
    public static class C42332a {

        /* renamed from: a */
        public static String f107633a = "right_click";

        /* renamed from: b */
        public static String f107634b = "thread_bar";

        /* renamed from: c */
        public static String f107635c = "thread_hover";

        /* renamed from: d */
        public static String f107636d = "thread_slide";
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.c$b */
    public static class C42333b {

        /* renamed from: A */
        public static String f107637A = "smart_reply";

        /* renamed from: B */
        public static String f107638B = "reply_all";

        /* renamed from: C */
        public static String f107639C = "forward";

        /* renamed from: D */
        public static String f107640D = "cancel_time_send";

        /* renamed from: E */
        public static String f107641E = "cancel_time_send_all";

        /* renamed from: F */
        public static String f107642F = "edit_again";

        /* renamed from: G */
        public static String f107643G = "download_email";

        /* renamed from: H */
        public static String f107644H = "translate_email";

        /* renamed from: I */
        public static String f107645I = "move_to_folder";

        /* renamed from: J */
        public static String f107646J = "report_spam";

        /* renamed from: K */
        public static String f107647K = "move_to_spam";

        /* renamed from: a */
        public static String f107648a = "smartbox_always_move";

        /* renamed from: b */
        public static String f107649b = "smartinbox_label_change";

        /* renamed from: c */
        public static String f107650c = "archive";

        /* renamed from: d */
        public static String f107651d = "trash";

        /* renamed from: e */
        public static String f107652e = "spam";

        /* renamed from: f */
        public static String f107653f = "not_spam";

        /* renamed from: g */
        public static String f107654g = "marksread";

        /* renamed from: h */
        public static String f107655h = "marksunread";

        /* renamed from: i */
        public static String f107656i = "changelabel";

        /* renamed from: j */
        public static String f107657j = "addlabel";

        /* renamed from: k */
        public static String f107658k = "deletelabel";

        /* renamed from: l */
        public static String f107659l = "flag";

        /* renamed from: m */
        public static String f107660m = "unflag";

        /* renamed from: n */
        public static String f107661n = "move_to";

        /* renamed from: o */
        public static String f107662o = "move_to_inbox";

        /* renamed from: p */
        public static String f107663p = "delete_clean";

        /* renamed from: q */
        public static String f107664q = "outbox_delete";

        /* renamed from: r */
        public static String f107665r = "outbox_edit";

        /* renamed from: s */
        public static String f107666s = "print";

        /* renamed from: t */
        public static String f107667t = "create_filter";

        /* renamed from: u */
        public static String f107668u = "email_share";

        /* renamed from: v */
        public static String f107669v = "move_to_other";

        /* renamed from: w */
        public static String f107670w = "move_to_important";

        /* renamed from: x */
        public static String f107671x = "draft_abort";

        /* renamed from: y */
        public static String f107672y = "reply";

        /* renamed from: z */
        public static String f107673z = "mail_recall";
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.c$c */
    public static class C42334c {

        /* renamed from: a */
        public static String f107674a = "new_mail_hint";

        /* renamed from: b */
        public static String f107675b = "banner_hint";

        /* renamed from: c */
        public static String f107676c = "im_hint";

        /* renamed from: d */
        public static String f107677d = "search_request";

        /* renamed from: e */
        public static String f107678e = "result_click";

        /* renamed from: f */
        public static String f107679f = "mail_signature";

        /* renamed from: g */
        public static String f107680g = "change_signature";

        /* renamed from: h */
        public static String f107681h = "send";

        /* renamed from: i */
        public static String f107682i = "close";

        /* renamed from: j */
        public static String f107683j = "confirm";

        /* renamed from: k */
        public static String f107684k = "cancel";
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.c$d */
    public static class C42335d {

        /* renamed from: a */
        public static String f107685a = "new_mail";

        /* renamed from: b */
        public static String f107686b = "message_list";

        /* renamed from: c */
        public static String f107687c = "reply";

        /* renamed from: d */
        public static String f107688d = "reply_all";

        /* renamed from: e */
        public static String f107689e = "forward";

        /* renamed from: f */
        public static String f107690f = "edit_again";

        /* renamed from: g */
        public static String f107691g = "smart_reply";

        /* renamed from: h */
        public static String f107692h = "open_draft";

        /* renamed from: i */
        public static String f107693i = "mail_to";
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.c$e */
    public static class C42336e {

        /* renamed from: A */
        public static String f107694A = "offset";

        /* renamed from: B */
        public static String f107695B = "feature";

        /* renamed from: C */
        public static String f107696C = "message_id";

        /* renamed from: D */
        public static String f107697D = "thread_id";

        /* renamed from: E */
        public static String f107698E = "open_type";

        /* renamed from: F */
        public static String f107699F = "time";

        /* renamed from: G */
        public static String f107700G = "search_id";

        /* renamed from: H */
        public static String f107701H = "mail_search_type";

        /* renamed from: I */
        public static String f107702I = "entity_id";

        /* renamed from: J */
        public static String f107703J = "result_type";

        /* renamed from: K */
        public static String f107704K = "pos";

        /* renamed from: L */
        public static String f107705L = "result";

        /* renamed from: M */
        public static String f107706M = "result_click_action";

        /* renamed from: N */
        public static String f107707N = "is_active";

        /* renamed from: O */
        public static String f107708O = "label_items";

        /* renamed from: P */
        public static String f107709P = "tag";

        /* renamed from: Q */
        public static String f107710Q = "query_type";

        /* renamed from: R */
        public static String f107711R = "attachment";

        /* renamed from: S */
        public static String f107712S = "large_attachment";

        /* renamed from: T */
        public static String f107713T = "request_timestamp";

        /* renamed from: U */
        public static String f107714U = "search_session_id";

        /* renamed from: V */
        public static String f107715V = "scene";

        /* renamed from: W */
        public static String f107716W = "scene_type";

        /* renamed from: X */
        public static String f107717X = "status";

        /* renamed from: Y */
        public static String f107718Y = "signature_type";

        /* renamed from: Z */
        public static String f107719Z = "is_conversational";

        /* renamed from: a */
        public static String f107720a = "label_item";
        public static String aa = "result_hint_from";
        public static String ab = "mail_display_mode";

        /* renamed from: b */
        public static String f107721b = "click";

        /* renamed from: c */
        public static String f107722c = "target";

        /* renamed from: d */
        public static String f107723d = "target_label_item";

        /* renamed from: e */
        public static String f107724e = "thread_list_type";

        /* renamed from: f */
        public static String f107725f = "is_multi_selected";

        /* renamed from: g */
        public static String f107726g = "action_position";

        /* renamed from: h */
        public static String f107727h = "action_type";

        /* renamed from: i */
        public static String f107728i = "edit_type";

        /* renamed from: j */
        public static String f107729j = "entry_action";

        /* renamed from: k */
        public static String f107730k = "mail_display_type";

        /* renamed from: l */
        public static String f107731l = "search_bar";

        /* renamed from: m */
        public static String f107732m = "search_location";

        /* renamed from: n */
        public static String f107733n = "query_length";

        /* renamed from: o */
        public static String f107734o = "query_id";

        /* renamed from: p */
        public static String f107735p = "is_filter";

        /* renamed from: q */
        public static String f107736q = "filter_status";

        /* renamed from: r */
        public static String f107737r = "impr_id";

        /* renamed from: s */
        public static String f107738s = "is_result";

        /* renamed from: t */
        public static String f107739t = "id_list";

        /* renamed from: u */
        public static String f107740u = "send_status";

        /* renamed from: v */
        public static String f107741v = "is_schedule";

        /* renamed from: w */
        public static String f107742w = "is_separately";

        /* renamed from: x */
        public static String f107743x = "to";

        /* renamed from: y */
        public static String f107744y = "cc";

        /* renamed from: z */
        public static String f107745z = "bcc";
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.c$f */
    public static class C42337f {

        /* renamed from: a */
        public static String f107746a = "accurate";

        /* renamed from: b */
        public static String f107747b = "partial";
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.c$h */
    public static class C42339h {

        /* renamed from: A */
        public static String f107748A = "check";

        /* renamed from: B */
        public static String f107749B = "uncheck";

        /* renamed from: C */
        public static String f107750C = "list_mode";

        /* renamed from: D */
        public static String f107751D = "local_file";

        /* renamed from: E */
        public static String f107752E = "eml_attachment";

        /* renamed from: F */
        public static String f107753F = "email_share";

        /* renamed from: G */
        public static String f107754G = "thread_click";

        /* renamed from: H */
        public static String f107755H = "all_success";

        /* renamed from: I */
        public static String f107756I = "all_failed";

        /* renamed from: J */
        public static String f107757J = "partial_success";

        /* renamed from: K */
        public static String f107758K = "unknown";

        /* renamed from: L */
        public static String f107759L = "change_signature";

        /* renamed from: M */
        public static String f107760M = "signature_setting";

        /* renamed from: a */
        public static String f107761a = "none";

        /* renamed from: b */
        public static String f107762b = "create_new_email";

        /* renamed from: c */
        public static String f107763c = "email_email_edit_view";

        /* renamed from: d */
        public static String f107764d = "label_item_click";

        /* renamed from: e */
        public static String f107765e = "email_thread_list_view";

        /* renamed from: f */
        public static String f107766f = "all_mail";

        /* renamed from: g */
        public static String f107767g = "unread_mail";

        /* renamed from: h */
        public static String f107768h = "thread_action";

        /* renamed from: i */
        public static String f107769i = "send_status";

        /* renamed from: j */
        public static String f107770j = "click_thread";

        /* renamed from: k */
        public static String f107771k = "message_quick_aciton";

        /* renamed from: l */
        public static String f107772l = "message_aciton";

        /* renamed from: m */
        public static String f107773m = "download_attachment";

        /* renamed from: n */
        public static String f107774n = "send";

        /* renamed from: o */
        public static String f107775o = "time_send";

        /* renamed from: p */
        public static String f107776p = "traditional";

        /* renamed from: q */
        public static String f107777q = "conversational";

        /* renamed from: r */
        public static String f107778r = "emails";

        /* renamed from: s */
        public static String f107779s = "click";

        /* renamed from: t */
        public static String f107780t = "email";

        /* renamed from: u */
        public static String f107781u = "key_words";

        /* renamed from: v */
        public static String f107782v = "email_message_list_view";

        /* renamed from: w */
        public static String f107783w = "single_click_on_item";

        /* renamed from: x */
        public static String f107784x = "null";

        /* renamed from: y */
        public static String f107785y = "mail_message";

        /* renamed from: z */
        public static String f107786z = "component";
    }

    /* renamed from: b */
    private static String m169060b(int i) {
        return i != 2 ? i != 3 ? i != 4 ? "to" : "separately" : "bcc" : "cc";
    }

    /* renamed from: a */
    public static void m169046a(MailLabelEntity mailLabelEntity) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107730k, C43350d.m172098a().mo155056v() ? C42339h.f107777q : C42339h.f107776p);
            jSONObject.put(C42336e.f107721b, C42339h.f107764d);
            jSONObject.put(C42336e.f107722c, C42339h.f107765e);
            jSONObject.put(C42336e.f107723d, m169061b(mailLabelEntity));
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_label_list_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169058a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107730k, C43350d.m172098a().mo155056v() ? C42339h.f107777q : C42339h.f107776p);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            jSONObject.put(C42336e.f107724e, z ? C42339h.f107767g : C42339h.f107766f);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_thread_list_view", jSONObject);
    }

    /* renamed from: a */
    public static void m169059a(boolean z, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107730k, C43350d.m172098a().mo155056v() ? C42339h.f107777q : C42339h.f107776p);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            jSONObject.put(C42336e.f107724e, C43374f.m172264f().mo155135w() == FilterType.UNREAD ? C42339h.f107767g : C42339h.f107766f);
            jSONObject.put(C42336e.f107721b, C42339h.f107768h);
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
            jSONObject.put(C42336e.f107725f, z ? "true" : "false");
            jSONObject.put(C42336e.f107726g, str);
            jSONObject.put(C42336e.f107727h, str2);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_thread_list_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169054a(String str, String str2, String str3, String str4) {
        String str5;
        JSONObject jSONObject = new JSONObject();
        if ("come_from_eml_local".equals(str2)) {
            str5 = C42339h.f107751D;
        } else if ("come_from_eml_other".equals(str2)) {
            str5 = C42339h.f107752E;
        } else if ("come_from_forward".equals(str2)) {
            str5 = C42339h.f107753F;
        } else {
            str5 = C42339h.f107754G;
        }
        try {
            jSONObject.put(C42336e.f107730k, C43350d.m172098a().mo155056v() ? C42339h.f107777q : C42339h.f107776p);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            jSONObject.put(C42336e.f107697D, str);
            jSONObject.put(C42336e.f107698E, str5);
            jSONObject.put(C42336e.aa, str3);
            jSONObject.put(C42336e.f107724e, C43374f.m172264f().mo155135w());
            jSONObject.put(C42336e.f107714U, str4);
            jSONObject.put(C42336e.ab, C42339h.f107750C);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_message_list_view", jSONObject);
    }

    /* renamed from: a */
    public static void m169053a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            jSONObject.put(C42336e.f107697D, str);
            jSONObject.put(C42336e.aa, str2);
            jSONObject.put(C42336e.f107724e, C43374f.m172264f().mo155135w());
            jSONObject.put(C42336e.f107714U, str3);
            jSONObject.put(C42336e.ab, C42339h.f107750C);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_message_list_closed_view", jSONObject);
    }

    /* renamed from: a */
    public static void m169048a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107730k, C43350d.m172098a().mo155056v() ? C42339h.f107777q : C42339h.f107776p);
            jSONObject.put(C42336e.f107721b, C42339h.f107771k);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
            jSONObject.put(C42336e.f107727h, str);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_message_list_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169047a(SendState sendState) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107730k, C43350d.m172098a().mo155056v() ? C42339h.f107777q : C42339h.f107776p);
            jSONObject.put(C42336e.f107721b, C42339h.f107769i);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
            jSONObject.put(C42336e.f107717X, sendState.toString());
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_message_list_click", jSONObject);
    }

    /* renamed from: b */
    public static void m169069b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107717X, z ? "success" : "failed");
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_send_status_toast_view", jSONObject);
    }

    /* renamed from: a */
    public static void m169045a(long j, int i, boolean z, int i2, boolean z2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject.put(C42187a.C42189a.f107380p, String.valueOf(j));
            jSONObject.put(C42187a.C42189a.f107381q, j);
            jSONObject.put(C42187a.C42189a.f107382r, currentTimeMillis);
            jSONObject.put(C42187a.C42189a.f107387w, currentTimeMillis - j);
            Locale m = C41816b.m166115a().mo150146m();
            String str2 = "";
            if (m != null) {
                str2 = m.getLanguage();
                if (!TextUtils.isEmpty(m.getCountry())) {
                    str2 = str2 + "-" + m.getCountry();
                }
            }
            jSONObject.put(C42187a.C42189a.f107383s, str2);
            jSONObject.put(C42187a.C42189a.f107376l, z2 ? "local" : "network");
            jSONObject.put(C42187a.C42189a.f107385u, i);
            jSONObject.put(C42187a.C42189a.f107384t, z ? "hit" : "abort");
            jSONObject.put("click", "finish_search");
            jSONObject.put("target", "none");
            jSONObject.put("select_contact_type", str);
            jSONObject.put(C42187a.C42189a.f107386v, i2);
        } catch (JSONException unused) {
        }
        m169055a("email_search_contact_result_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169051a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, str);
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
            jSONObject.put("value", str2);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_email_edit_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169049a(String str, MailDraft mailDraft, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, str);
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
            jSONObject.put(C42336e.f107740u, C42339h.f107761a);
            jSONObject.put(C42336e.f107741v, mailDraft.mo151319D() > 0);
            jSONObject.put(C42336e.f107742w, mailDraft.mo151366s());
            jSONObject.put(C42336e.f107743x, C43785p.m173534a(mailDraft.mo151339d()));
            jSONObject.put(C42336e.f107744y, C43785p.m173534a(mailDraft.mo151343e()));
            jSONObject.put(C42336e.f107745z, C43785p.m173534a(mailDraft.mo151347f()));
            jSONObject.put(C42336e.f107711R, C43785p.m173534a(mailDraft.mo151355i()));
            jSONObject.put(C42336e.f107712S, mailDraft.mo151374y());
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_email_edit_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169052a(String str, String str2, int i, String str3, String str4, List<String> list, String str5, Integer num, SearchRet.C42082a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, str2);
            jSONObject.put(C42336e.f107732m, C42339h.f107778r);
            jSONObject.put(C42336e.f107733n, i);
            jSONObject.put(C42336e.f107734o, m169082h(str3));
            jSONObject.put(C42336e.f107716W, C42339h.f107786z);
            jSONObject.put(C42336e.f107713T, System.currentTimeMillis());
            jSONObject.put(C42336e.f107714U, str);
            if (TextUtils.equals(str2, C42334c.f107677d)) {
                jSONObject.put(C42336e.f107722c, C42339h.f107761a);
                jSONObject.put(C42336e.f107701H, C42339h.f107781u);
            } else if (TextUtils.equals(str2, C42334c.f107678e)) {
                jSONObject.put(C42336e.f107722c, C42339h.f107782v);
                jSONObject.put(C42336e.f107702I, str4);
                jSONObject.put(C42336e.f107703J, C42339h.f107778r);
                jSONObject.put(C42336e.f107708O, m169039a(list, ";"));
                jSONObject.put(C42336e.aa, C42338g.m169084a(aVar));
                jSONObject.put(C42336e.f107710Q, str5);
                jSONObject.put(C42336e.f107709P, C42339h.f107761a);
                jSONObject.put(C42336e.f107704K, num);
                jSONObject.put(C42336e.f107706M, C42339h.f107783w);
            } else if (TextUtils.equals(str2, C42334c.f107682i)) {
                jSONObject.put(C42336e.f107722c, C42339h.f107761a);
                jSONObject.put(C42336e.f107707N, "true");
            }
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("asl_search_click", jSONObject);
    }

    /* renamed from: b */
    public static void m169068b(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("is_large", z ? "true" : " false"));
        m169072c(str, arrayList);
    }

    /* renamed from: a */
    public static void m169057a(List<Pair<String, Integer>> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, C42339h.f107760M);
            jSONObject.put(C42336e.f107722c, "none");
            for (Pair<String, Integer> pair : list) {
                jSONObject.putOpt((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        m169055a("email_lark_setting_signature_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169050a(String str, Boolean bool) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, str);
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
            if (bool != null) {
                jSONObject.put(C42336e.f107719Z, String.valueOf(bool));
            }
        } catch (JSONException unused) {
        }
        m169055a("email_conversational_onboarding_toast_click", jSONObject);
    }

    /* renamed from: f */
    public static void m169078f() {
        m169055a("email_select_contact_from_picker_view", new JSONObject());
    }

    /* renamed from: g */
    public static void m169080g() {
        m169055a("email_lark_setting_signature_view", new JSONObject());
    }

    /* renamed from: h */
    public static void m169083h() {
        m169055a("email_conversational_onboarding_toast_view", new JSONObject());
    }

    /* renamed from: e */
    public static void m169076e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, "cancel_send");
            jSONObject.put(C42336e.f107722c, "none");
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_mail_cancel_send_click", jSONObject);
    }

    /* renamed from: c */
    public static void m169070c() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            String str3 = C42336e.f107730k;
            if (C43350d.m172098a().mo155056v()) {
                str = C42339h.f107777q;
            } else {
                str = C42339h.f107776p;
            }
            jSONObject.put(str3, str);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            String str4 = C42336e.f107724e;
            if (C43374f.m172264f().mo155135w() == FilterType.UNREAD) {
                str2 = C42339h.f107767g;
            } else {
                str2 = C42339h.f107766f;
            }
            jSONObject.put(str4, str2);
            jSONObject.put(C42336e.f107721b, C42339h.f107770j);
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_thread_list_click", jSONObject);
    }

    /* renamed from: d */
    public static void m169074d() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = C42336e.f107730k;
            if (C43350d.m172098a().mo155056v()) {
                str = C42339h.f107777q;
            } else {
                str = C42339h.f107776p;
            }
            jSONObject.put(str2, str);
            jSONObject.put(C42336e.f107721b, C42339h.f107773m);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_message_list_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169040a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = C42336e.f107730k;
            if (C43350d.m172098a().mo155056v()) {
                str = C42339h.f107777q;
            } else {
                str = C42339h.f107776p;
            }
            jSONObject.put(str2, str);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_label_list_view", jSONObject);
    }

    /* renamed from: b */
    public static void m169063b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, C42339h.f107762b);
            jSONObject.put(C42336e.f107722c, C42339h.f107763c);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_new_mail_click", jSONObject);
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.c$g */
    public static class C42338g {
        /* renamed from: a */
        public static String m169084a(SearchRet.C42082a aVar) {
            ArrayList arrayList = new ArrayList();
            if (aVar.mo151770b(1)) {
                arrayList.add("mail_title");
            }
            if (aVar.mo151770b(4)) {
                arrayList.add("mail_file");
            }
            if (arrayList.isEmpty()) {
                arrayList.add("mail_other");
            }
            return C42330c.m169039a(arrayList, ";");
        }
    }

    /* renamed from: b */
    public static String m169061b(MailLabelEntity mailLabelEntity) {
        if (f107632a) {
            return "SEARCH";
        }
        if (mailLabelEntity == null) {
            return "INBOX";
        }
        if (mailLabelEntity.mo151494a() == 2) {
            return "FLODER";
        }
        if (mailLabelEntity.mo151529m()) {
            return mailLabelEntity.mo151527k();
        }
        return "LABEL";
    }

    /* renamed from: d */
    public static void m169075d(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (Exception unused) {
            i = 0;
        }
        String str2 = C42339h.f107758K;
        if (i == 2 || i == 3) {
            str2 = C42339h.f107755H;
        } else if (i == 4) {
            str2 = C42339h.f107756I;
        } else if (i == 5) {
            str2 = C42339h.f107757J;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107705L, str2);
        } catch (Exception unused2) {
        }
        m169055a("email_mail_recall_result_banner_view", jSONObject);
    }

    /* renamed from: f */
    public static void m169079f(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, str);
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_email_edit_click", jSONObject);
    }

    /* renamed from: h */
    private static String m169082h(String str) {
        if (str == null) {
            return null;
        }
        try {
            return String.format("%032x", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8))));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public static void m169077e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107728i, str);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_email_edit_view", jSONObject);
    }

    /* renamed from: g */
    public static void m169081g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107729j, C42339h.f107779s);
            jSONObject.put(C42336e.f107731l, C42339h.f107780t);
            jSONObject.put(C42336e.f107732m, C42339h.f107778r);
            jSONObject.put(C42336e.f107716W, C42339h.f107786z);
            jSONObject.put(C42336e.f107713T, System.currentTimeMillis());
            jSONObject.put(C42336e.f107714U, str);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("asl_search_view", jSONObject);
    }

    /* renamed from: c */
    public static void m169071c(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            String str3 = C42336e.f107730k;
            if (C43350d.m172098a().mo155056v()) {
                str2 = C42339h.f107777q;
            } else {
                str2 = C42339h.f107776p;
            }
            jSONObject.put(str3, str2);
            jSONObject.put(C42336e.f107721b, C42339h.f107768h);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
            jSONObject.put(C42336e.f107726g, C42332a.f107634b);
            jSONObject.put(C42336e.f107727h, str);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_message_list_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169041a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            String b = m169060b(i);
            jSONObject.put(C42336e.f107721b, "add_picker");
            jSONObject.put(C42336e.f107722c, "email_select_contact_from_picker_view");
            jSONObject.put("contact_position", b);
        } catch (JSONException unused) {
        }
        m169055a("email_email_edit_click", jSONObject);
    }

    /* renamed from: b */
    public static void m169064b(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            String str3 = C42336e.f107730k;
            if (C43350d.m172098a().mo155056v()) {
                str2 = C42339h.f107777q;
            } else {
                str2 = C42339h.f107776p;
            }
            jSONObject.put(str3, str2);
            jSONObject.put(C42336e.f107721b, C42339h.f107772l);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
            jSONObject.put(C42336e.f107727h, str);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_message_list_click", jSONObject);
    }

    /* renamed from: c */
    public static void m169073c(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, "at_confirm");
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
            jSONObject.put("is_add_recipient", z);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_email_edit_click", jSONObject);
    }

    /* renamed from: a */
    private static void m169055a(String str, JSONObject jSONObject) {
        C41816b.m166115a().mo150114D().mo150182b(str, jSONObject);
    }

    /* renamed from: a */
    public static void m169056a(String str, boolean z) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (z) {
            str2 = "true";
        } else {
            str2 = " false";
        }
        arrayList.add(new Pair("is_large", str2));
        m169067b(str, arrayList);
    }

    /* renamed from: a */
    public static String m169038a(String str, List<String> list) {
        if (!(str == null || list == null)) {
            for (String str2 : list) {
                if (str2 != null && str2.contains(str)) {
                    return C42337f.f107746a;
                }
            }
        }
        return C42337f.f107747b;
    }

    /* renamed from: c */
    public static void m169072c(String str, List<Pair<String, Object>> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, str);
            for (Pair<String, Object> pair : list) {
                jSONObject.put((String) pair.first, pair.second);
            }
            jSONObject.put(C42336e.f107722c, "none");
        } catch (JSONException unused) {
        }
        m169055a("email_email_edit_click", jSONObject);
    }

    /* renamed from: a */
    public static String m169039a(List<String> list, String str) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static List<Map<String, Object>> m169062b(List<MessagesSummary> list, String str) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MessagesSummary messagesSummary : list) {
            if (messagesSummary != null) {
                SearchRet searchRet = new SearchRet(messagesSummary, str);
                HashSet hashSet = new HashSet(messagesSummary.labels);
                if (messagesSummary.label_items != null) {
                    for (Label label : messagesSummary.label_items) {
                        if (label.name != null) {
                            hashSet.add(label.name);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(messagesSummary.from);
                arrayList2.add(messagesSummary.msg_summary);
                arrayList2.add(messagesSummary.subject);
                arrayList.add(new HashMap<String, Object>(messagesSummary, hashSet, str, arrayList2, searchRet) {
                    /* class com.ss.android.lark.mail.impl.p2171h.C42330c.C423311 */
                    final /* synthetic */ String val$keyword;
                    final /* synthetic */ Set val$label_items;
                    final /* synthetic */ MessagesSummary val$msg;
                    final /* synthetic */ SearchRet val$searchRet;
                    final /* synthetic */ List val$textArr;

                    {
                        this.val$msg = r2;
                        this.val$label_items = r3;
                        this.val$keyword = r4;
                        this.val$textArr = r5;
                        this.val$searchRet = r6;
                        put(C42336e.f107702I, r2.thread_id);
                        put(C42336e.f107703J, C42339h.f107785y);
                        put(C42336e.f107709P, C42339h.f107784x);
                        put(C42336e.f107708O, C42330c.m169039a(new ArrayList(r3), ";"));
                        put(C42336e.f107710Q, C42330c.m169038a(r4, r5));
                        put(C42336e.aa, C42338g.m169084a(r6.mo151759K()));
                    }
                });
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m169065b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, str);
            jSONObject.put(C42336e.f107717X, str2);
            jSONObject.put(C42336e.f107722c, C42339h.f107761a);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("email_lark_setting_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169044a(int i, Map<ContactSearchType, Integer> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            String b = m169060b(i);
            jSONObject.put(C42336e.f107721b, "add_confirm");
            jSONObject.put(C42336e.f107722c, "none");
            for (Map.Entry<ContactSearchType, Integer> entry : map.entrySet()) {
                jSONObject.put(entry.getKey().getLabel(), entry.getValue());
            }
            jSONObject.put("contact_position", b);
        } catch (JSONException unused) {
        }
        m169055a("email_select_contact_from_picker_click", jSONObject);
    }

    /* renamed from: b */
    public static void m169067b(String str, List<Pair<String, Object>> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, str);
            for (Pair<String, Object> pair : list) {
                jSONObject.put((String) pair.first, pair.second);
            }
            jSONObject.put(C42336e.f107722c, "none");
        } catch (JSONException unused) {
        }
        m169055a("email_message_list_click", jSONObject);
    }

    /* renamed from: b */
    public static void m169066b(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107721b, str);
            jSONObject.put(C42336e.f107720a, m169061b(C43374f.m172264f().mo155130r()));
            jSONObject.put(C42336e.f107718Y, str2);
            jSONObject.put(C42336e.f107715V, str3);
        } catch (JSONException unused) {
        }
        m169055a("email_email_edit_click", jSONObject);
    }

    /* renamed from: a */
    public static void m169042a(int i, String str, int i2, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107699F, i);
            jSONObject.put(C42336e.f107732m, C42339h.f107778r);
            jSONObject.put(C42336e.f107700G, str);
            jSONObject.put(C42336e.f107733n, i2);
            jSONObject.put(C42336e.f107716W, C42339h.f107786z);
            jSONObject.put(C42336e.f107713T, System.currentTimeMillis());
            jSONObject.put(C42336e.f107714U, str2);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("asl_search_time_dev", jSONObject);
    }

    /* renamed from: a */
    public static void m169043a(int i, String str, boolean z, List<MessagesSummary> list, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42336e.f107732m, C42339h.f107778r);
            jSONObject.put(C42336e.f107733n, i);
            jSONObject.put(C42336e.f107734o, str);
            jSONObject.put(C42336e.f107738s, z);
            jSONObject.put(C42336e.f107739t, m169062b(list, str2));
            jSONObject.put(C42336e.f107695B, C42339h.f107784x);
            jSONObject.put(C42336e.f107716W, C42339h.f107786z);
            jSONObject.put(C42336e.f107713T, System.currentTimeMillis());
            jSONObject.put(C42336e.f107714U, str3);
        } catch (Exception e) {
            Log.m165389i("NewStatistics", "Exception e:" + e.getMessage());
        }
        m169055a("asl_search_show", jSONObject);
    }
}
