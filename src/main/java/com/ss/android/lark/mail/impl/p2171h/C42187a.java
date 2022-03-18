package com.ss.android.lark.mail.impl.p2171h;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.network.NetworkChangeListener;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.view.undo.AbstractC43977b;
import com.ss.android.lark.mail.impl.view.undo.SendUndoProcess;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.a */
public class C42187a {

    /* renamed from: com.ss.android.lark.mail.impl.h.a$a */
    public static class C42189a {

        /* renamed from: A */
        public static String f107344A = "txt_rows";

        /* renamed from: B */
        public static String f107345B = "switch_type";

        /* renamed from: C */
        public static String f107346C = "instance_count";

        /* renamed from: D */
        public static String f107347D = "memory_difference";

        /* renamed from: E */
        public static String f107348E = "current";

        /* renamed from: F */
        public static String f107349F = "enable";

        /* renamed from: G */
        public static String f107350G = "thread_ids";

        /* renamed from: H */
        public static String f107351H = "is_multiSelected";

        /* renamed from: I */
        public static String f107352I = "name";

        /* renamed from: J */
        public static String f107353J = "ret";

        /* renamed from: K */
        public static String f107354K = "time";

        /* renamed from: L */
        public static String f107355L = "threadid";

        /* renamed from: M */
        public static String f107356M = "time_cost_ms";

        /* renamed from: N */
        public static String f107357N = "page";

        /* renamed from: O */
        public static String f107358O = "show_type";

        /* renamed from: P */
        public static String f107359P = "thread_item";

        /* renamed from: Q */
        public static String f107360Q = "thread_biz_id";

        /* renamed from: R */
        public static String f107361R = "message_id";

        /* renamed from: S */
        public static String f107362S = "timestamp";

        /* renamed from: T */
        public static String f107363T = "unread_count";

        /* renamed from: U */
        public static String f107364U = "unread_state";

        /* renamed from: a */
        public static String f107365a = "flag";

        /* renamed from: b */
        public static String f107366b = "type";

        /* renamed from: c */
        public static String f107367c = "threadid";

        /* renamed from: d */
        public static String f107368d = "originMessageId";

        /* renamed from: e */
        public static String f107369e = "draftid";

        /* renamed from: f */
        public static String f107370f = "from";

        /* renamed from: g */
        public static String f107371g = "to";

        /* renamed from: h */
        public static String f107372h = "messageid";

        /* renamed from: i */
        public static String f107373i = "location";

        /* renamed from: j */
        public static String f107374j = "currentfilter";

        /* renamed from: k */
        public static String f107375k = "scene";

        /* renamed from: l */
        public static String f107376l = "source";

        /* renamed from: m */
        public static String f107377m = "is_multiselect";

        /* renamed from: n */
        public static String f107378n = "action";

        /* renamed from: o */
        public static String f107379o = "thread_count";

        /* renamed from: p */
        public static String f107380p = "search_session";

        /* renamed from: q */
        public static String f107381q = "start_timestamp";

        /* renamed from: r */
        public static String f107382r = "end_timestamp";

        /* renamed from: s */
        public static String f107383s = "client_language";

        /* renamed from: t */
        public static String f107384t = "search_finish_type";

        /* renamed from: u */
        public static String f107385u = "search_result_count";

        /* renamed from: v */
        public static String f107386v = "select_rank";

        /* renamed from: w */
        public static String f107387w = "duration_ms";

        /* renamed from: x */
        public static String f107388x = "status_type";

        /* renamed from: y */
        public static String f107389y = "has_image";

        /* renamed from: z */
        public static String f107390z = "has_onlytxt";
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.a$b */
    public static class C42190b {

        /* renamed from: A */
        public static String f107391A = "share";

        /* renamed from: B */
        public static String f107392B = "share_create_new_chat";

        /* renamed from: C */
        public static String f107393C = "create_folder";

        /* renamed from: D */
        public static String f107394D = "edit_folder";

        /* renamed from: E */
        public static String f107395E = "select_folder_location";

        /* renamed from: F */
        public static String f107396F = "move_to_folder";

        /* renamed from: G */
        public static String f107397G = "conversation_mode_setting";

        /* renamed from: a */
        public static String f107398a = "thread_list";

        /* renamed from: b */
        public static String f107399b = "message_list";

        /* renamed from: c */
        public static String f107400c = "sidebar_label_list";

        /* renamed from: d */
        public static String f107401d = "search";

        /* renamed from: e */
        public static String f107402e = "edit_collaborator_list";

        /* renamed from: f */
        public static String f107403f = "invite_collaborator_list";

        /* renamed from: g */
        public static String f107404g = "confirm_collaborator_list";

        /* renamed from: h */
        public static String f107405h = "move_to_label";

        /* renamed from: i */
        public static String f107406i = "change_label";

        /* renamed from: j */
        public static String f107407j = "edit_label";

        /* renamed from: k */
        public static String f107408k = "create_label";

        /* renamed from: l */
        public static String f107409l = "mange_label";

        /* renamed from: m */
        public static String f107410m = "select_label_location";

        /* renamed from: n */
        public static String f107411n = "mail_editor";

        /* renamed from: o */
        public static String f107412o = "mail_setting";

        /* renamed from: p */
        public static String f107413p = "send_to_im";

        /* renamed from: q */
        public static String f107414q = "signature_setting";

        /* renamed from: r */
        public static String f107415r = "signature_editor";

        /* renamed from: s */
        public static String f107416s = "enterprise_signature_setting";

        /* renamed from: t */
        public static String f107417t = "auto_reply_setting";

        /* renamed from: u */
        public static String f107418u = "reply_language_setting";

        /* renamed from: v */
        public static String f107419v = "auto_reply_editor";

        /* renamed from: w */
        public static String f107420w = "migration_detail";

        /* renamed from: x */
        public static String f107421x = "recall_detail";

        /* renamed from: y */
        public static String f107422y = "send_status_detail";

        /* renamed from: z */
        public static String f107423z = "notification_setting";
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.a$c */
    public static class C42191c {

        /* renamed from: A */
        public static String f107424A = "email_body";

        /* renamed from: B */
        public static String f107425B = "search_bar";

        /* renamed from: C */
        public static String f107426C = "toolbar";

        /* renamed from: D */
        public static String f107427D = "thread_action";

        /* renamed from: E */
        public static String f107428E = "message_quick_action";

        /* renamed from: F */
        public static String f107429F = "Settings";

        /* renamed from: G */
        public static String f107430G = "Banner";

        /* renamed from: H */
        public static String f107431H = "switch_type";

        /* renamed from: I */
        public static String f107432I = "CloseBtn";

        /* renamed from: J */
        public static String f107433J = "Save";

        /* renamed from: K */
        public static String f107434K = "thread_action";

        /* renamed from: L */
        public static String f107435L = "thread_item_action";

        /* renamed from: M */
        public static String f107436M = "shareIcon";

        /* renamed from: N */
        public static String f107437N = "messageMenu";

        /* renamed from: O */
        public static String f107438O = "sendToChat";

        /* renamed from: P */
        public static String f107439P = "folder_manage";

        /* renamed from: Q */
        public static String f107440Q = "mobile_moveto";

        /* renamed from: R */
        public static String f107441R = "thread_action";

        /* renamed from: S */
        public static String f107442S = "LABEL";

        /* renamed from: T */
        public static String f107443T = "FOLDER";

        /* renamed from: U */
        public static String f107444U = "FORWARD_CARD";

        /* renamed from: V */
        public static String f107445V = "sendToChat";

        /* renamed from: W */
        public static String f107446W = "important";

        /* renamed from: X */
        public static String f107447X = "other";

        /* renamed from: Y */
        public static String f107448Y = "enable";

        /* renamed from: Z */
        public static String f107449Z = "disable";

        /* renamed from: a */
        public static String f107450a = "enter";
        public static String aa = "rightMenu";
        public static String ab = "Drag";
        public static String ac = "threadAction";
        public static String ad = "true";
        public static String ae = "false";

        /* renamed from: b */
        public static String f107451b = "leave";

        /* renamed from: c */
        public static String f107452c = "compose";

        /* renamed from: d */
        public static String f107453d = "reply";

        /* renamed from: e */
        public static String f107454e = "replyall";

        /* renamed from: f */
        public static String f107455f = "forward";

        /* renamed from: g */
        public static String f107456g = "delete";

        /* renamed from: h */
        public static String f107457h = "archive";

        /* renamed from: i */
        public static String f107458i = "spam";

        /* renamed from: j */
        public static String f107459j = "markread";

        /* renamed from: k */
        public static String f107460k = "markunread";

        /* renamed from: l */
        public static String f107461l = "undelete";

        /* renamed from: m */
        public static String f107462m = "unarchive";

        /* renamed from: n */
        public static String f107463n = "unspam";

        /* renamed from: o */
        public static String f107464o = "threadlist";

        /* renamed from: p */
        public static String f107465p = "threadtop";

        /* renamed from: q */
        public static String f107466q = "message";

        /* renamed from: r */
        public static String f107467r = "more";

        /* renamed from: s */
        public static String f107468s = "longclick";

        /* renamed from: t */
        public static String f107469t = "inbox";

        /* renamed from: u */
        public static String f107470u = "draft";

        /* renamed from: v */
        public static String f107471v = "sent";

        /* renamed from: w */
        public static String f107472w = "archive";

        /* renamed from: x */
        public static String f107473x = "trash";

        /* renamed from: y */
        public static String f107474y = "spam";

        /* renamed from: z */
        public static String f107475z = "email";
    }

    /* renamed from: a */
    public static void m168479a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107452c);
            jSONObject.put(C42189a.f107369e, str);
        } catch (JSONException unused) {
        }
        m168522d("email_edit", jSONObject);
    }

    /* renamed from: a */
    public static void m168485a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107453d);
            jSONObject.put(C42189a.f107367c, str);
            jSONObject.put(C42189a.f107368d, str2);
            jSONObject.put(C42189a.f107369e, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_edit", jSONObject);
    }

    /* renamed from: b */
    public static void m168505b(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107454e);
            jSONObject.put(C42189a.f107367c, str);
            jSONObject.put(C42189a.f107368d, str2);
            jSONObject.put(C42189a.f107369e, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_edit", jSONObject);
    }

    /* renamed from: a */
    public static void m168488a(String str, boolean z, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, str);
            jSONObject.put("is_multiselect", z ? 1 : 0);
            jSONObject.put("thread_count", i);
        } catch (JSONException unused) {
        }
        m168522d("email_scheduledSend_time", jSONObject);
    }

    /* renamed from: a */
    public static void m168490a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_type", z ? "clear" : "cancel");
        } catch (JSONException unused) {
        }
        m168522d("email_restriction_popup_click", jSONObject);
    }

    /* renamed from: a */
    public static void m168493a(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, str);
        } catch (JSONException unused) {
        }
        m168522d(z ? "email_cancle_send_separately" : "email_add_send_separately", jSONObject);
    }

    /* renamed from: a */
    public static void m168486a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107456g);
            jSONObject.put(C42189a.f107372h, str2);
            m168489a(jSONObject, str, str3, str4);
        } catch (JSONException unused) {
        }
        m168522d("email_move", jSONObject);
    }

    /* renamed from: a */
    public static void m168480a(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107380p, str);
            jSONObject.put("search_index", i);
        } catch (JSONException unused) {
        }
        m168522d("email_search_result_selected", jSONObject);
    }

    /* renamed from: a */
    public static void m168476a(MailDraft mailDraft, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("draft_id", mailDraft.mo151321a());
            jSONObject.put("image_count", C43785p.m173534a(mailDraft.mo151358k()));
            jSONObject.put("attachment_count", C43785p.m173534a(mailDraft.mo151355i()));
            jSONObject.put("to_count", C43785p.m173534a(mailDraft.mo151339d()));
            jSONObject.put("cc_count", C43785p.m173534a(mailDraft.mo151343e()));
            jSONObject.put("bcc_count", C43785p.m173534a(mailDraft.mo151347f()));
            jSONObject.put("hasGroupChat", C43785p.m173535a(mailDraft.mo151339d(), mailDraft.mo151343e(), mailDraft.mo151347f()));
            jSONObject.put("has_subject", !TextUtils.isEmpty(mailDraft.mo151350g()));
            jSONObject.put(C42189a.f107376l, str);
        } catch (JSONException unused) {
        }
        m168522d("email_draft_send", jSONObject);
    }

    /* renamed from: b */
    public static void m168509b(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, str);
            jSONObject.put(C42189a.f107377m, z);
        } catch (JSONException unused) {
        }
        m168522d("email_draft_discard", jSONObject);
    }

    /* renamed from: a */
    public static void m168492a(boolean z, int i, boolean z2, String str) {
        Log.m165389i("BusinessStatistics", "threadRead");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C42189a.f107379o, i);
            jSONObject.put(C42189a.f107377m, z2 ? 1 : 0);
            jSONObject.put(C42189a.f107376l, str);
            if (z) {
                m168522d("email_thread_markasread", jSONObject);
            } else {
                m168522d("email_thread_markasunread", jSONObject);
            }
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "threadRead", e);
        }
    }

    /* renamed from: a */
    public static void m168482a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C42189a.f107377m, 0);
            jSONObject.put(C42189a.f107376l, str2);
            m168522d(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m168508b(boolean z) {
        Log.m165389i("BusinessStatistics", "messageClick");
        if (z) {
            m168522d("email_message_expand", (JSONObject) null);
        } else {
            m168522d("email_message_collapse", (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static void m168494a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107388x, !z ? "off" : z2 ? "pc" : "mobile");
        } catch (JSONException unused) {
        }
        m168522d("email_signature_turnon", jSONObject);
    }

    /* renamed from: a */
    public static void m168495a(boolean z, boolean z2, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107389y, z);
            jSONObject.put(C42189a.f107390z, z2);
            jSONObject.put(C42189a.f107344A, String.valueOf(i));
        } catch (JSONException unused) {
        }
        m168522d("email_signature_save", jSONObject);
    }

    /* renamed from: a */
    public static void m168487a(String str, JSONObject jSONObject) {
        Log.m165389i("BusinessStatistics", "sendMessageListTrace");
        try {
            m168522d(str, jSONObject);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "sendMessageListTrace", e);
        }
    }

    /* renamed from: b */
    public static void m168506b(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107371g, str);
            jSONObject.put(C42189a.f107376l, str2);
            jSONObject.put(C42189a.f107350G, str3);
            jSONObject.put(C42189a.f107351H, str4);
        } catch (JSONException unused) {
        }
        m168522d("email_smartinbox_label_change", jSONObject);
    }

    /* renamed from: a */
    public static void m168483a(String str, String str2, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107360Q, str2);
            jSONObject.put(C42189a.f107361R, str);
            jSONObject.put("reply_count", 3);
            jSONObject.put("select_reply_id", i);
            jSONObject.put(C42189a.f107362S, System.currentTimeMillis());
            Locale m = C41816b.m166115a().mo150146m();
            if (m != null) {
                jSONObject.put(C42189a.f107383s, m.getLanguage());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("email_smart_reply_select", jSONObject);
    }

    /* renamed from: a */
    public static void m168481a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107355L, str);
            jSONObject.put(C42189a.f107356M, j);
        } catch (JSONException unused) {
        }
        m168522d("email_thread_display", jSONObject);
    }

    /* renamed from: a */
    public static void m168475a(WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            m168474a(webResourceRequest.getUrl());
        }
    }

    /* renamed from: a */
    private static void m168474a(final Uri uri) {
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.p2171h.C42187a.RunnableC421881 */

            public void run() {
                Uri uri = uri;
                if (uri != null && "welcomeLarkMail".equals(uri.getFragment())) {
                    Log.m165389i("BusinessStatistics", "reportUrlClick WelcomeLink");
                    C42187a.m168522d("email_welcomeletter_link_click", (JSONObject) null);
                }
            }
        });
    }

    /* renamed from: a */
    private static void m168489a(JSONObject jSONObject, String str, String str2, String str3) {
        try {
            jSONObject.put(C42189a.f107367c, str);
            jSONObject.put(C42189a.f107373i, str2);
            jSONObject.put(C42189a.f107374j, str3);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public static void m168507b(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("BusinessStatistics", "messageListTrack empty key");
        } else {
            m168522d(str, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m168477a(AbstractC43977b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("file_id", str);
            jSONObject.put("mail_undo_type", bVar instanceof SendUndoProcess ? "send" : "delete");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_undo_display", jSONObject);
    }

    /* renamed from: a */
    public static void m168478a(AbstractC43977b bVar, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("file_id", str);
            jSONObject.put("mail_undo_type", bVar instanceof SendUndoProcess ? "send" : "delete");
            jSONObject.put("action_result", z ? "success" : "failure");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_undo_result", jSONObject);
    }

    /* renamed from: a */
    public static void m168484a(String str, String str2, int i, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_id", str);
            jSONObject.put("message_id", str2);
            jSONObject.put("move_to_spam", i);
            jSONObject.put("is_success", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_unsubscribe_confirmed", jSONObject);
    }

    /* renamed from: a */
    public static void m168491a(boolean z, int i, int i2, long j, long j2, int i3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("repeat_download", z ? 1 : 0);
            jSONObject.put("repeat_download_count", i2);
            jSONObject.put("repeat_download_size", (double) Long.valueOf(j).floatValue());
            jSONObject.put("download_count", i);
            jSONObject.put("download_size", j2);
            jSONObject.put("download_count_affected_by_repeat_image", i3);
            Log.m165379d("BusinessStatistics", "messageListDownloadImage: " + jSONObject.toString());
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "messageListDownloadImage", e);
        }
        m168522d("email_message_list_download_image", jSONObject);
    }

    /* renamed from: a */
    public static void m168473a(long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mail_cost_time", j);
            jSONObject.put("is_cache", z ? 1 : 0);
            jSONObject.put("is_send", "1");
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "reportComposeImageCacheHit", e);
        }
        m168522d("mail_editor_image_cache_hit", jSONObject);
    }

    /* renamed from: w */
    public static void m168575w() {
        m168522d("email_home_more", (JSONObject) null);
    }

    /* renamed from: A */
    public static void m168457A() {
        Log.m165389i("BusinessStatistics", "shareExit");
        m168522d("share_exit", (JSONObject) null);
    }

    /* renamed from: B */
    public static void m168458B() {
        Log.m165389i("BusinessStatistics", "shareRemove");
        m168522d("share_remove", (JSONObject) null);
    }

    /* renamed from: D */
    public static void m168460D() {
        m168522d("email_folder_editSave", new JSONObject());
    }

    /* renamed from: b */
    public static void m168496b() {
        m168522d("email_draft_scheduledSend", new JSONObject());
    }

    /* renamed from: c */
    public static void m168510c() {
        m168522d("email_draft_scheduledSend_success", new JSONObject());
    }

    /* renamed from: d */
    public static void m168518d() {
        m168522d("email_thread_scheduledSend_undo", new JSONObject());
    }

    /* renamed from: e */
    public static void m168524e() {
        m168522d("email_restriction_popup_show", new JSONObject());
    }

    /* renamed from: f */
    public static void m168529f() {
        m168522d("email_send_separately_result", new JSONObject());
    }

    /* renamed from: m */
    public static void m168554m() {
        Log.m165389i("BusinessStatistics", "showRecipientDetail");
        m168522d("email_message_detailreceiver", (JSONObject) null);
    }

    /* renamed from: o */
    public static void m168559o() {
        Log.m165389i("BusinessStatistics", "previewAttachment");
        m168522d("email_message_attachment_preview", (JSONObject) null);
    }

    /* renamed from: q */
    public static void m168563q() {
        Log.m165389i("BusinessStatistics", "shareUpdatePermission");
        m168522d("email_share_update_permission", (JSONObject) null);
    }

    /* renamed from: x */
    public static void m168577x() {
        Log.m165389i("BusinessStatistics", "shareCurrently");
        m168522d("share_currently", (JSONObject) null);
    }

    /* renamed from: y */
    public static void m168578y() {
        Log.m165389i("BusinessStatistics", "shareIncoming");
        m168522d("share_incoming", (JSONObject) null);
    }

    /* renamed from: z */
    public static void m168579z() {
        Log.m165389i("BusinessStatistics", "shareStop");
        m168522d("share_stop", (JSONObject) null);
    }

    /* renamed from: C */
    public static void m168459C() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, C42191c.f107439P);
        } catch (JSONException unused) {
        }
        m168522d("email_folder_edit", jSONObject);
    }

    /* renamed from: E */
    public static void m168461E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, C42191c.f107439P);
        } catch (JSONException unused) {
        }
        m168522d("email_folder_editPosition", jSONObject);
    }

    /* renamed from: F */
    public static void m168462F() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, C42191c.f107439P);
        } catch (JSONException unused) {
        }
        m168522d("email_label_delete", jSONObject);
    }

    /* renamed from: a */
    public static void m168464a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107365a, C42191c.f107451b);
        } catch (JSONException unused) {
        }
        m168522d("email_launch", jSONObject);
    }

    /* renamed from: g */
    public static void m168534g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, C42191c.f107425B);
        } catch (JSONException unused) {
        }
        m168522d("email_search_enter", jSONObject);
    }

    /* renamed from: h */
    public static void m168538h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, C42191c.f107426C);
        } catch (JSONException unused) {
        }
        m168522d("email_draft_add_attachment", jSONObject);
    }

    /* renamed from: i */
    public static void m168542i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, C42191c.f107426C);
        } catch (JSONException unused) {
        }
        m168522d("email_draft_add_image", jSONObject);
    }

    /* renamed from: j */
    public static void m168545j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, C42191c.f107427D);
        } catch (JSONException unused) {
        }
        m168522d("email_label_create", jSONObject);
    }

    /* renamed from: k */
    public static void m168548k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, C42191c.f107427D);
        } catch (JSONException unused) {
        }
        m168522d("email_label_delete", jSONObject);
    }

    /* renamed from: l */
    public static void m168551l() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, "thread_list");
            C41816b.m166115a().mo150114D().mo150182b("email_thread_emptyTrash", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public static void m168557n() {
        Log.m165389i("BusinessStatistics", "copyAddress");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C42189a.f107376l, "mail_address_menu");
            m168522d("email_message_copy_address", jSONObject);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "copyAddress", e);
        }
    }

    /* renamed from: p */
    public static void m168561p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("click", "delete_search_record");
        } catch (JSONException unused) {
        }
        m168522d("search_contact_result", jSONObject);
    }

    /* renamed from: r */
    public static void m168565r() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107375k, C42191c.f107475z);
            jSONObject.put(C42189a.f107373i, C42191c.f107424A);
        } catch (JSONException unused) {
        }
        m168522d("link_clicked", jSONObject);
    }

    /* renamed from: s */
    public static void m168567s() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107375k, "homepage");
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "homePageFail", e);
        }
        m168522d("email_page_fail", jSONObject);
    }

    /* renamed from: t */
    public static void m168569t() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107375k, "changelabel");
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "threadListChangeLabelFail", e);
        }
        m168522d("email_page_fail", jSONObject);
    }

    /* renamed from: u */
    public static void m168571u() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107375k, "labellist");
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "labelListFail", e);
        }
        m168522d("email_page_fail", jSONObject);
    }

    /* renamed from: v */
    public static void m168573v() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107375k, "messagelist");
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "messageListFail", e);
        }
        m168522d("email_page_fail", jSONObject);
    }

    /* renamed from: G */
    public static void m168463G() {
        int i;
        NetworkChangeListener.NetworkLevel a = C41816b.m166115a().mo150112B().mo150174a();
        if (a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (a == NetworkChangeListener.NetworkLevel.EXCELLENT) {
                    i = 0;
                } else {
                    i = 1;
                }
                jSONObject.put("is_weak_network", i);
            } catch (Exception e) {
                Log.m165384e("BusinessStatistics", "reportComposeNetworkState", e);
            }
            m168522d("mail_editor_bad_network_draft", jSONObject);
        }
    }

    /* renamed from: a */
    public static void m168465a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
        } catch (JSONException unused) {
        }
        m168522d("email_draft_scheduledSend_failure", jSONObject);
    }

    /* renamed from: i */
    public static void m168543i(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, str);
        } catch (JSONException unused) {
        }
        m168522d("email_ooo_settings_show", jSONObject);
    }

    /* renamed from: j */
    public static void m168546j(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, str);
        } catch (JSONException unused) {
        }
        m168522d("email_ooo_settings_close", jSONObject);
    }

    /* renamed from: n */
    public static void m168558n(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107348E, str);
        } catch (JSONException unused) {
        }
        m168522d("email_smartinbox_preview_click", jSONObject);
    }

    /* renamed from: r */
    public static void m168566r(String str) {
        if (!TextUtils.isEmpty(str)) {
            m168474a(Uri.parse(str));
        }
    }

    /* renamed from: v */
    public static void m168574v(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, str);
        } catch (JSONException unused) {
        }
        m168522d("email_folder_create_click", jSONObject);
    }

    /* renamed from: w */
    public static void m168576w(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, str);
        } catch (JSONException unused) {
        }
        m168522d("email_thread_move_to_folder", jSONObject);
    }

    /* renamed from: b */
    public static void m168497b(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("email_webview_http_error", jSONObject);
    }

    /* renamed from: c */
    public static void m168511c(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mail_body_length", i);
        } catch (Exception unused) {
        }
        C42226b.m168638a().mo152309a(C42226b.C42229b.f107486b, jSONObject);
    }

    /* renamed from: d */
    public static void m168519d(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action_type", str);
            jSONObject.put("action_source", "email_card_message");
        } catch (JSONException unused) {
        }
        m168522d("email_invitation_click", jSONObject);
    }

    /* renamed from: e */
    public static void m168525e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107380p, str);
        } catch (JSONException unused) {
        }
        m168522d("email_search_result_show", jSONObject);
    }

    /* renamed from: f */
    public static void m168530f(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, C42191c.f107426C);
            jSONObject.put(C42189a.f107378n, str);
        } catch (JSONException unused) {
        }
        m168522d("email_draft_toolbar", jSONObject);
    }

    /* renamed from: m */
    public static void m168555m(String str) {
        m168522d(str, new JSONObject());
    }

    /* renamed from: o */
    public static void m168560o(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107349F, str);
        } catch (JSONException unused) {
        }
        m168522d("email_smartinbox_usable_change", jSONObject);
    }

    /* renamed from: q */
    public static void m168564q(String str) {
        if ("wce-a4403d04-a35c-434a-b449-81b7d6f5b383".equals(str)) {
            Log.m165389i("BusinessStatistics", "openWelcomeLetter");
            m168522d("email_welcomeletter_read", (JSONObject) null);
        }
    }

    /* renamed from: g */
    public static void m168535g(String str) {
        Log.m165389i("BusinessStatistics", "threadFlag");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C42189a.f107377m, 0);
            jSONObject.put(C42189a.f107376l, str);
            m168522d("email_thread_flag", jSONObject);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "threadFlag", e);
        }
    }

    /* renamed from: h */
    public static void m168539h(String str) {
        Log.m165389i("BusinessStatistics", "threadRead");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C42189a.f107376l, str);
            m168522d("email_thread_selected", jSONObject);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "threadRead", e);
        }
    }

    /* renamed from: k */
    public static void m168549k(String str) {
        Log.m165389i("BusinessStatistics", "shareOpen");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, str);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "shareOpen", e);
        }
        m168522d("email_share_open", jSONObject);
    }

    /* renamed from: l */
    public static void m168552l(String str) {
        Log.m165389i("BusinessStatistics", "shareConfirm");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("share_type", str);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "shareConfirm", e);
        }
        m168522d("email_share_confirm", jSONObject);
    }

    /* renamed from: p */
    public static void m168562p(String str) {
        if (!C41816b.m166115a().mo150148o()) {
            Log.m165388i(" mailTab Not visible, but " + str + " showed");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107357N, str);
        } catch (JSONException unused) {
        }
        m168522d("email_page_view", jSONObject);
    }

    /* renamed from: s */
    public static void m168568s(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("email_multiselect_threadlist", jSONObject);
    }

    /* renamed from: t */
    public static void m168570t(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107360Q, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_auto_translation_message_count", jSONObject);
    }

    /* renamed from: u */
    public static void m168572u(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107376l, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_compose_unhandled_rejection", jSONObject);
    }

    /* renamed from: c */
    public static void m168513c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action_source", "email_card_message");
            jSONObject.put("cal_event_rsvp", str);
        } catch (JSONException unused) {
        }
        m168522d("cal_reply_event", jSONObject);
    }

    /* renamed from: b */
    public static void m168500b(long j) {
        if (j > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("distance", j);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            m168522d("mail_draft_scroll_distance_dev", jSONObject);
        }
    }

    /* renamed from: e */
    public static void m168528e(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_success", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("email_attachment_share_confirm", jSONObject);
    }

    /* renamed from: f */
    public static void m168533f(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "enable";
        } else {
            str = "disable";
        }
        try {
            jSONObject.put("enable", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_setting_undo_send_state_change", jSONObject);
    }

    /* renamed from: g */
    public static void m168537g(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "PublicMailbox";
        } else {
            str = "BusinessEmail";
        }
        try {
            jSONObject.put("target", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("email_public_mailbox_switch", jSONObject);
    }

    /* renamed from: h */
    public static void m168541h(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107358O, C42191c.f107441R);
            if (z) {
                str = C42191c.f107444U;
            } else {
                str = C42330c.m169061b(C43374f.m172264f().mo155130r());
            }
            jSONObject.put(C42189a.f107359P, str);
        } catch (JSONException e) {
            Log.m165389i("BusinessStatistics", "JSONException e:" + e.getMessage());
        }
        m168522d("email_message_list_search_click", jSONObject);
    }

    /* renamed from: d */
    public static void m168523d(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        try {
            jSONObject.put("result", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_send_uploadimg_result", jSONObject);
    }

    /* renamed from: a */
    public static void m168470a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("attachment_size_byte", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("email_attachment_share", jSONObject);
    }

    /* renamed from: b */
    public static void m168502b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107367c, str);
        } catch (JSONException unused) {
        }
        m168522d("email_view", jSONObject);
    }

    /* renamed from: c */
    public static void m168517c(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = C42189a.f107345B;
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            jSONObject.put(str2, str);
        } catch (JSONException unused) {
        }
        m168522d("email_ooo_settings_saved", jSONObject);
    }

    /* renamed from: a */
    public static void m168466a(int i, float f) {
        Log.m165389i("BusinessStatistics", "sendMessageListMemoryTrace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107346C, i);
            jSONObject.put(C42189a.f107347D, (double) f);
        } catch (JSONException unused) {
        }
        try {
            m168522d("mail_dev_message_list_memory_diff", jSONObject);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "sendMessageListTrace", e);
        }
    }

    /* renamed from: b */
    public static void m168498b(int i, boolean z) {
        int i2;
        Log.m165389i("BusinessStatistics", "threadDeleteLabel");
        if (i > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = C42189a.f107377m;
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put(str, i2);
                jSONObject.put(C42189a.f107376l, C42191c.f107434K);
                for (int i3 = 0; i3 < i; i3++) {
                    m168522d("email_thread_deletelabel", jSONObject);
                }
            } catch (Exception e) {
                Log.m165384e("BusinessStatistics", "threadDeleteLabel", e);
            }
        }
    }

    /* renamed from: d */
    public static void m168520d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107360Q, str);
            jSONObject.put(C42189a.f107361R, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_translation_single_message_btn_viewed", jSONObject);
    }

    /* renamed from: e */
    public static void m168526e(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_id", str);
            jSONObject.put("message_id", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_unsubscribe_btn_displayed", jSONObject);
    }

    /* renamed from: f */
    public static void m168531f(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_id", str);
            jSONObject.put("message_id", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_unsubscribe_btn_clicked", jSONObject);
    }

    /* renamed from: a */
    public static void m168467a(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107365a, C42191c.f107450a);
            jSONObject.put(C42189a.f107363T, i);
            jSONObject.put(C42189a.f107364U, i2);
        } catch (JSONException unused) {
        }
        m168522d("email_launch", jSONObject);
    }

    /* renamed from: a */
    public static void m168468a(int i, boolean z) {
        int i2;
        Log.m165389i("BusinessStatistics", "threadAddLabel");
        if (i > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = C42189a.f107377m;
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put(str, i2);
                jSONObject.put(C42189a.f107376l, C42191c.f107434K);
                for (int i3 = 0; i3 < i; i3++) {
                    m168522d("email_thread_addlabel", jSONObject);
                }
            } catch (Exception e) {
                Log.m165384e("BusinessStatistics", "threadAddLabel", e);
            }
        }
    }

    /* renamed from: c */
    public static void m168514c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107360Q, str);
            jSONObject.put(C42189a.f107361R, str2);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "translateButtonClick", e);
        }
        m168522d("mail_translation_single_message_btn", jSONObject);
    }

    /* renamed from: d */
    public static void m168522d(String str, JSONObject jSONObject) {
        C41816b.m166115a().mo150114D().mo150182b(str, jSONObject);
    }

    /* renamed from: b */
    public static void m168501b(AbstractC43977b bVar, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("file_id", str);
            if (bVar instanceof SendUndoProcess) {
                str2 = "send";
            } else {
                str2 = "delete";
            }
            jSONObject.put("mail_undo_type", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m168522d("mail_undo_click", jSONObject);
    }

    /* renamed from: c */
    public static void m168516c(String str, JSONObject jSONObject) {
        C41816b.m166115a().mo150114D().mo150181a(str, jSONObject);
    }

    /* renamed from: b */
    public static void m168503b(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mail_body_length", i);
            jSONObject.put(C42226b.C42230c.f107487a, str);
        } catch (Exception unused) {
        }
        C42226b.m168638a().mo152309a(C42226b.C42229b.f107485a, jSONObject);
    }

    /* renamed from: a */
    public static void m168472a(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject.put("current", currentTimeMillis);
            jSONObject.put("scheduled", j);
            jSONObject.put("offset", j - currentTimeMillis);
            Date date = new Date(j);
            jSONObject.put("hour", date.getHours());
            jSONObject.put("week", date.getDay());
            jSONObject.put("local", TimeZone.getDefault().getID());
            jSONObject.put("select", str);
        } catch (JSONException unused) {
        }
        m168522d("email_scheduledSend_time", jSONObject);
    }

    /* renamed from: b */
    public static void m168504b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", str2);
            jSONObject.put("page_name", str);
        } catch (JSONException unused) {
        }
        m168522d("email_page_empty_error", jSONObject);
    }

    /* renamed from: c */
    public static void m168512c(int i, boolean z, String str) {
        int i2;
        Log.m165389i("BusinessStatistics", "threadSpam");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C42189a.f107379o, i);
            String str2 = C42189a.f107377m;
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put(str2, i2);
            jSONObject.put(C42189a.f107376l, str);
            m168522d("email_thread_spam", jSONObject);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "threadSpam", e);
        }
    }

    /* renamed from: i */
    public static void m168544i(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107460k);
            m168489a(jSONObject, str, str2, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_move", jSONObject);
    }

    /* renamed from: j */
    public static void m168547j(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107461l);
            m168489a(jSONObject, str, str2, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_move", jSONObject);
    }

    /* renamed from: m */
    public static void m168556m(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107360Q, str);
            jSONObject.put(C42189a.f107361R, str2);
            jSONObject.put("target_language", str3);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "selectTargetLanguage", e);
        }
        m168522d("mail_translation_single_message_target_language", jSONObject);
    }

    /* renamed from: b */
    public static void m168499b(int i, boolean z, String str) {
        int i2;
        Log.m165389i("BusinessStatistics", "threadTrash");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C42189a.f107379o, i);
            String str2 = C42189a.f107377m;
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put(str2, i2);
            jSONObject.put(C42189a.f107376l, str);
            m168522d("email_thread_trash", jSONObject);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "threadTrash", e);
        }
    }

    /* renamed from: d */
    public static void m168521d(String str, String str2, String str3) {
        if (str == null || str2 == null || !str.equals(str2)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C42189a.f107370f, str);
                jSONObject.put(C42189a.f107371g, str2);
                jSONObject.put(C42189a.f107366b, str3);
            } catch (JSONException unused) {
            }
            m168522d("email_filter", jSONObject);
        }
    }

    /* renamed from: e */
    public static void m168527e(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107456g);
            m168489a(jSONObject, str, str2, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_move", jSONObject);
    }

    /* renamed from: f */
    public static void m168532f(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107457h);
            m168489a(jSONObject, str, str2, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_move", jSONObject);
    }

    /* renamed from: g */
    public static void m168536g(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107458i);
            m168489a(jSONObject, str, str2, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_move", jSONObject);
    }

    /* renamed from: h */
    public static void m168540h(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107459j);
            m168489a(jSONObject, str, str2, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_move", jSONObject);
    }

    /* renamed from: k */
    public static void m168550k(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107462m);
            m168489a(jSONObject, str, str2, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_move", jSONObject);
    }

    /* renamed from: l */
    public static void m168553l(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107463n);
            m168489a(jSONObject, str, str2, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_move", jSONObject);
    }

    /* renamed from: a */
    public static void m168469a(int i, boolean z, String str) {
        int i2;
        Log.m165389i("BusinessStatistics", "threadArchive");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C42189a.f107379o, i);
            String str2 = C42189a.f107377m;
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put(str2, i2);
            jSONObject.put(C42189a.f107376l, str);
            m168522d("email_thread_archive", jSONObject);
        } catch (Exception e) {
            Log.m165384e("BusinessStatistics", "archive", e);
        }
    }

    /* renamed from: c */
    public static void m168515c(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42189a.f107366b, C42191c.f107455f);
            jSONObject.put(C42189a.f107367c, str);
            jSONObject.put(C42189a.f107368d, str2);
            jSONObject.put(C42189a.f107369e, str3);
        } catch (JSONException unused) {
        }
        m168522d("email_edit", jSONObject);
    }

    /* renamed from: a */
    public static void m168471a(long j, int i, boolean z, int i2, boolean z2, String str) {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject.put(C42189a.f107380p, String.valueOf(j));
            jSONObject.put(C42189a.f107381q, j);
            jSONObject.put(C42189a.f107382r, currentTimeMillis);
            jSONObject.put(C42189a.f107387w, currentTimeMillis - j);
            Locale m = C41816b.m166115a().mo150146m();
            String str4 = "";
            if (m != null) {
                str4 = m.getLanguage();
                if (!TextUtils.isEmpty(m.getCountry())) {
                    str4 = str4 + "-" + m.getCountry();
                }
            }
            jSONObject.put(C42189a.f107383s, str4);
            String str5 = C42189a.f107376l;
            if (z2) {
                str2 = "local";
            } else {
                str2 = "network";
            }
            jSONObject.put(str5, str2);
            jSONObject.put(C42189a.f107385u, i);
            String str6 = C42189a.f107384t;
            if (z) {
                str3 = "hit";
            } else {
                str3 = "abort";
            }
            jSONObject.put(str6, str3);
            jSONObject.put("click", "finish_search");
            jSONObject.put("target", "none");
            jSONObject.put("select_contact_type", str);
            jSONObject.put(C42189a.f107386v, i2);
        } catch (JSONException unused) {
        }
        m168522d("search_contact_result", jSONObject);
    }
}
