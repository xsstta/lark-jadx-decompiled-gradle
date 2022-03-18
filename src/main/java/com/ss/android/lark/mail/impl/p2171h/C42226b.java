package com.ss.android.lark.mail.impl.p2171h;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.sdk.C53241h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b */
public class C42226b {

    /* renamed from: a */
    private final ScheduledExecutorService f107479a;

    /* renamed from: b */
    private Map<String, Long> f107480b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.h.b$a */
    public static class C42228a {

        /* renamed from: a */
        public static C42226b f107484a = new C42226b();
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.b$b */
    public static class C42229b {

        /* renamed from: a */
        public static String f107485a = "email_apm_create_draft";

        /* renamed from: b */
        public static String f107486b = "email_apm_send_draft";
    }

    /* renamed from: com.ss.android.lark.mail.impl.h.b$c */
    public static class C42230c {

        /* renamed from: a */
        public static String f107487a = "source";

        /* renamed from: b */
        public static String f107488b = "mail_cost_time";

        /* renamed from: c */
        public static String f107489c = "time_cost_ms";

        /* renamed from: d */
        public static String f107490d = "user_id";

        /* renamed from: e */
        public static String f107491e = "mail_message_count";

        /* renamed from: f */
        public static String f107492f = "mail_thread_id";

        /* renamed from: g */
        public static String f107493g = "mail_thread_body_length";

        /* renamed from: h */
        public static String f107494h = "has_big_message";

        /* renamed from: i */
        public static String f107495i = "get_rust_data_cost_time";

        /* renamed from: j */
        public static String f107496j = "parse_html_cost_time";

        /* renamed from: k */
        public static String f107497k = "render_page_cost_time";

        /* renamed from: l */
        public static String f107498l = "get_rust_data_from_net";

        /* renamed from: m */
        public static String f107499m = "first_open_messagelist";

        /* renamed from: n */
        public static String f107500n = "init_webview_cost_time";

        /* renamed from: o */
        public static String f107501o = "from_notification";

        /* renamed from: p */
        public static String f107502p = "is_read";

        /* renamed from: q */
        public static String f107503q = "optimize_feat";

        /* renamed from: r */
        public static String f107504r = "is_pre_unread";
    }

    /* renamed from: a */
    public static C42226b m168638a() {
        return C42228a.f107484a;
    }

    private C42226b() {
        this.f107480b = new HashMap();
        this.f107479a = CoreThreadPool.getDefault().getScheduleThreadPool();
    }

    /* renamed from: b */
    private void m168639b() {
        if (this.f107480b.size() > 500) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<Map.Entry<String, Long>> it = this.f107480b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Long> next = it.next();
                if (next.getValue() != null && currentTimeMillis - next.getValue().longValue() > 30000) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo152310b(String str) {
        if (this.f107480b.containsKey(str)) {
            this.f107480b.remove(str);
        }
    }

    /* renamed from: c */
    public void mo152312c(String str) {
        mo152309a(str, new JSONObject());
    }

    /* renamed from: a */
    public void mo152308a(String str) {
        m168639b();
        this.f107480b.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: b */
    public void mo152311b(final String str, final JSONObject jSONObject) {
        this.f107479a.execute(new Runnable() {
            /* class com.ss.android.lark.mail.impl.p2171h.C42226b.RunnableC422271 */

            public void run() {
                C41816b.m166115a().mo150114D().mo150181a(str, jSONObject);
            }
        });
    }

    /* renamed from: a */
    public void mo152309a(String str, JSONObject jSONObject) {
        Long l;
        if (this.f107480b.containsKey(str) && (l = this.f107480b.get(str)) != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.putOpt(C42230c.f107488b, Long.valueOf(currentTimeMillis));
                jSONObject.putOpt(C42230c.f107489c, Long.valueOf(currentTimeMillis));
            } catch (JSONException unused) {
                C53241h.m205900d("MailMetrics", "set time cost fail, when report event.");
            }
            mo152311b(str, jSONObject);
            this.f107480b.remove(str);
        }
    }
}
