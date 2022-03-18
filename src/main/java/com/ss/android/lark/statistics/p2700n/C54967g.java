package com.ss.android.lark.statistics.p2700n;

import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.statistics.n.g */
public class C54967g {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.statistics.n.g$a */
    public static class C54969a {

        /* renamed from: a */
        private String f135843a;

        /* renamed from: b */
        private String f135844b;

        /* renamed from: c */
        private String f135845c;

        /* renamed from: d */
        private String f135846d;

        /* renamed from: e */
        private List<String> f135847e;

        private C54969a() {
        }

        /* renamed from: a */
        public JSONObject mo187640a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ShareHitPoint.f121869d, this.f135843a);
                jSONObject.put("messageId", this.f135844b);
                if (!TextUtils.isEmpty(this.f135845c)) {
                    jSONObject.put("parentMessageId", this.f135845c);
                }
                if (!TextUtils.isEmpty(this.f135846d)) {
                    jSONObject.put("unReadChatterId", this.f135846d);
                }
                List<String> list = this.f135847e;
                if (list != null && !list.isEmpty()) {
                    jSONObject.put("unReadChatterIds", this.f135847e);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: a */
        public C54969a mo187638a(String str) {
            this.f135843a = str;
            return this;
        }

        /* renamed from: b */
        public C54969a mo187641b(String str) {
            this.f135844b = str;
            return this;
        }

        /* renamed from: c */
        public C54969a mo187642c(String str) {
            this.f135845c = str;
            return this;
        }

        /* renamed from: d */
        public C54969a mo187643d(String str) {
            this.f135846d = str;
            return this;
        }

        /* renamed from: a */
        public C54969a mo187639a(List<String> list) {
            this.f135847e = list;
            return this;
        }
    }

    /* renamed from: a */
    public static void m213395a(String str) {
        m213399a("message_read_issue_my_continuous", new C54969a().mo187638a("readCount").mo187641b(str).mo187640a());
    }

    /* renamed from: b */
    public static void m213400b(String str) {
        m213399a("message_read_issue_read_detail", new C54969a().mo187638a("responseError").mo187641b(str).mo187640a());
    }

    /* renamed from: c */
    public static void m213404c(String str, String str2) {
        m213399a("message_read_issue_recall", new C54969a().mo187638a("readCount").mo187641b(str).mo187643d(str2).mo187640a());
    }

    /* renamed from: d */
    public static void m213406d(String str, String str2) {
        m213399a("message_read_issue_feed_to_chat", new C54969a().mo187638a("readCount").mo187641b(str).mo187643d(str2).mo187640a());
    }

    /* renamed from: e */
    public static void m213408e(String str, String str2) {
        m213399a("message_read_issue_feed_to_chat", new C54969a().mo187638a("readAt").mo187641b(str).mo187643d(str2).mo187640a());
    }

    /* renamed from: a */
    public static void m213396a(String str, String str2) {
        m213399a("message_read_issue_pin", new C54969a().mo187638a("readCount").mo187641b(str).mo187643d(str2).mo187640a());
    }

    /* renamed from: b */
    public static void m213401b(String str, String str2) {
        m213399a("message_read_issue_pin", new C54969a().mo187638a("readAt").mo187641b(str).mo187643d(str2).mo187640a());
    }

    /* renamed from: c */
    public static void m213405c(String str, List<String> list) {
        if (list != null && !list.isEmpty()) {
            m213399a("message_read_issue_near", new C54969a().mo187638a("readCount").mo187641b(str).mo187639a(list).mo187640a());
        }
    }

    /* renamed from: d */
    public static void m213407d(String str, List<String> list) {
        if (list != null && !list.isEmpty()) {
            m213399a("message_read_issue_near", new C54969a().mo187638a("readAt").mo187641b(str).mo187639a(list).mo187640a());
        }
    }

    /* renamed from: e */
    public static void m213409e(String str, List<String> list) {
        if (list != null && !list.isEmpty()) {
            m213399a("message_read_issue_read_detail", new C54969a().mo187638a("readCount").mo187641b(str).mo187639a(list).mo187640a());
        }
    }

    /* renamed from: f */
    public static void m213410f(String str, List<String> list) {
        if (list != null && !list.isEmpty()) {
            m213399a("message_read_issue_read_detail", new C54969a().mo187638a("readAt").mo187641b(str).mo187639a(list).mo187640a());
        }
    }

    /* renamed from: a */
    public static void m213398a(String str, List<String> list) {
        if (list != null && !list.isEmpty()) {
            m213399a("message_read_issue_reaction", new C54969a().mo187638a("readCount").mo187641b(str).mo187639a(list).mo187640a());
        }
    }

    /* renamed from: b */
    public static void m213403b(String str, List<String> list) {
        if (list != null && !list.isEmpty()) {
            m213399a("message_read_issue_reaction", new C54969a().mo187638a("readAt").mo187641b(str).mo187639a(list).mo187640a());
        }
    }

    /* renamed from: a */
    private static void m213399a(String str, JSONObject jSONObject) {
        ApmAgent.monitorEvent(str, null, jSONObject, null);
        Log.m165388i("tracked msg read issue: " + str + " " + jSONObject.toString());
    }

    /* renamed from: a */
    public static void m213397a(String str, String str2, String str3) {
        m213399a("message_read_issue_reply", new C54969a().mo187638a("readCount").mo187641b(str).mo187642c(str2).mo187643d(str3).mo187640a());
    }

    /* renamed from: b */
    public static void m213402b(String str, String str2, String str3) {
        m213399a("message_read_issue_reply", new C54969a().mo187638a("readAt").mo187641b(str).mo187642c(str2).mo187643d(str3).mo187640a());
    }
}
