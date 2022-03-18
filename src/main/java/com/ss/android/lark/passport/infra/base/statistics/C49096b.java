package com.ss.android.lark.passport.infra.base.statistics;

import android.text.TextUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.p2425b.C49038b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.passport.infra.base.statistics.b */
public class C49096b {

    /* renamed from: a */
    public static final PassportLog f123305a = PassportLog.f123351c.mo171474a();

    /* renamed from: com.ss.android.lark.passport.infra.base.statistics.b$b */
    public static class C49098b {

        /* renamed from: a */
        private final JSONObject f123308a = new JSONObject();

        /* renamed from: a */
        public JSONObject mo171416a() {
            return this.f123308a;
        }

        /* renamed from: a */
        public C49098b mo171415a(String str, Object obj) {
            try {
                this.f123308a.put(str, obj);
            } catch (JSONException e) {
                PassportLog passportLog = C49096b.f123305a;
                passportLog.mo171471d("LoginHitPointHelper", "put k=" + str + "; v=" + obj + ". error=" + e.toString());
            }
            return this;
        }
    }

    /* renamed from: c */
    public static void m193584c() {
        LoginHitPoint.f123304a.mo171399b();
    }

    /* renamed from: d */
    public static void m193586d() {
        LoginHitPoint.f123304a.mo171400c();
    }

    /* renamed from: e */
    public static void m193588e() {
        LoginHitPoint.f123304a.mo171401d();
    }

    /* renamed from: f */
    public static void m193590f() {
        LoginHitPoint.f123304a.mo171402e();
    }

    /* renamed from: g */
    public static void m193592g() {
        LoginHitPoint.f123304a.mo171403f();
    }

    /* renamed from: h */
    public static void m193594h() {
        LoginHitPoint.f123304a.mo171404g();
    }

    /* renamed from: j */
    public static void m193598j() {
        LoginHitPoint.f123304a.mo171407j();
    }

    /* renamed from: k */
    public static void m193599k() {
        LoginHitPoint.f123304a.mo171408k();
    }

    /* renamed from: l */
    public static void m193600l() {
        LoginHitPoint.f123304a.mo171409l();
    }

    /* renamed from: m */
    public static void m193601m() {
        LoginHitPoint.f123304a.mo171410m();
    }

    /* renamed from: n */
    public static void m193602n() {
        LoginHitPoint.f123304a.mo171406i();
    }

    /* renamed from: o */
    public static void m193603o() {
        LoginHitPoint.f123304a.mo171411n();
    }

    /* renamed from: p */
    public static void m193604p() {
        LoginHitPoint.f123304a.mo171412o();
    }

    /* renamed from: a */
    public static void m193572a() {
        C49038b.m193165a().mo171217a("tea_last_real_fail_page");
    }

    /* renamed from: i */
    public static void m193597i() {
        LoginHitPoint.f123304a.mo171405h();
    }

    /* renamed from: q */
    public static void m193605q() {
        ServiceFinder.m193748c().statistics("login_click_password_reset");
    }

    /* renamed from: r */
    public static void m193606r() {
        ServiceFinder.m193748c().statistics("password_reset_next");
    }

    /* renamed from: s */
    public static void m193607s() {
        ServiceFinder.m193748c().statistics("verify_code_verify_fail");
    }

    /* renamed from: t */
    public static void m193608t() {
        ServiceFinder.m193748c().statistics("verify_code_click_resend");
    }

    /* renamed from: u */
    public static void m193609u() {
        ServiceFinder.m193748c().statistics("idp_login_errormsg");
    }

    /* renamed from: v */
    public static void m193610v() {
        ServiceFinder.m193748c().statistics("idp_notice");
    }

    /* renamed from: w */
    public static void m193611w() {
        ServiceFinder.m193748c().statistics("idp_notice_button");
    }

    /* renamed from: x */
    private static String m193612x() {
        return ServiceFinder.m193749d().getUserUnit();
    }

    /* renamed from: com.ss.android.lark.passport.infra.base.statistics.b$a */
    public static class C49097a {

        /* renamed from: a */
        private final C49098b f123306a = new C49098b();

        /* renamed from: b */
        private final String f123307b;

        /* renamed from: a */
        public void mo171414a() {
            if (!TextUtils.isEmpty(this.f123307b)) {
                JSONObject a = this.f123306a.mo171416a();
                if (a.length() == 0) {
                    C49096b.m193595h(this.f123307b);
                } else {
                    C49096b.m193577a(this.f123307b, a);
                }
            }
        }

        public C49097a(String str) {
            this.f123307b = str;
        }

        /* renamed from: a */
        public C49097a mo171413a(String str, Object obj) {
            this.f123306a.mo171415a(str, obj);
            return this;
        }
    }

    /* renamed from: b */
    public static void m193580b() {
        String b = C49038b.m193165a().mo171219b("tea_last_fail_page", null);
        String b2 = C49038b.m193165a().mo171219b("tea_last_real_fail_page", null);
        if (!TextUtils.isEmpty(b) || !TextUtils.isEmpty(b2)) {
            LoginHitPoint.f123304a.mo171397a(b, b2);
        }
        m193581b(null);
        m193572a();
    }

    /* renamed from: i */
    public static C49097a m193596i(String str) {
        return new C49097a(str);
    }

    /* renamed from: c */
    public static void m193585c(String str) {
        LoginHitPoint.f123304a.mo171395a(str);
    }

    /* renamed from: d */
    public static void m193587d(String str) {
        if (str != null) {
            C49038b.m193165a().mo171218a("tea_last_real_fail_page_v3", str);
        }
    }

    /* renamed from: h */
    public static void m193595h(String str) {
        ServiceFinder.m193748c().statistics(str);
    }

    /* renamed from: a */
    public static void m193575a(String str) {
        if (str != null) {
            C49038b.m193165a().mo171218a("tea_last_real_fail_page", str);
        }
    }

    /* renamed from: b */
    public static void m193581b(String str) {
        if (str == null) {
            C49038b.m193165a().mo171217a("tea_last_fail_page");
        } else {
            C49038b.m193165a().mo171218a("tea_last_fail_page", str);
        }
    }

    /* renamed from: a */
    public static void m193573a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_type", i);
        } catch (Exception e) {
            PassportLog passportLog = f123305a;
            passportLog.mo171462a("LoginHitPointHelper", "sendClickBack error: " + e.toString(), e);
        }
        ServiceFinder.m193748c().statistics("verify_code_verify_success", jSONObject);
    }

    /* renamed from: e */
    public static void m193589e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", str);
        } catch (Exception e) {
            PassportLog passportLog = f123305a;
            passportLog.mo171462a("LoginHitPointHelper", "sendClickBack error: " + e.toString(), e);
        }
        ServiceFinder.m193748c().statistics("click_back", jSONObject);
    }

    /* renamed from: f */
    public static void m193591f(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(ShareHitPoint.f121868c, str);
            }
        } catch (Exception e) {
            PassportLog passportLog = f123305a;
            passportLog.mo171462a("LoginHitPointHelper", "sendDispatchNextClickJoinTenant error: " + e.toString(), e);
        }
        ServiceFinder.m193748c().statistics("dispatch_next_click_personal_use", jSONObject);
    }

    /* renamed from: g */
    public static void m193593g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(ShareHitPoint.f121868c, str);
            }
        } catch (Exception e) {
            PassportLog passportLog = f123305a;
            passportLog.mo171462a("LoginHitPointHelper", "sendDispatchNextClickCreateTeam error: " + e.toString(), e);
        }
        ServiceFinder.m193748c().statistics("dispatch_next_click_create_team");
    }

    /* renamed from: a */
    public static void m193577a(String str, JSONObject jSONObject) {
        ServiceFinder.m193748c().statistics(str, jSONObject);
    }

    /* renamed from: a */
    public static void m193574a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("url_path", str);
        } catch (Exception e) {
            PassportLog passportLog = f123305a;
            passportLog.mo171462a("LoginHitPointHelper", "sendApiBizCode error: " + e.toString(), e);
        }
        ServiceFinder.m193748c().statistics("api_biz_code", jSONObject);
    }

    /* renamed from: b */
    public static void m193582b(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("api_type", str).put("env", m193612x()).put("time_consuming", j);
        } catch (Exception e) {
            PassportLog passportLog = f123305a;
            passportLog.mo171462a("LoginHitPointHelper", "sendPassport error: " + e.toString(), e);
        }
        ServiceFinder.m193748c().statistics("passport_v2", jSONObject);
    }

    /* renamed from: a */
    public static void m193576a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("api_type", str).put("env", m193612x()).put("time_consuming", j);
        } catch (Exception e) {
            PassportLog passportLog = f123305a;
            passportLog.mo171462a("LoginHitPointHelper", "sendCaptchaToken error: " + e.toString(), e);
        }
        ServiceFinder.m193748c().statistics("captcha_token_v2", jSONObject);
    }

    /* renamed from: b */
    public static void m193583b(String str, boolean z) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", str);
            if (z) {
                str2 = "success";
            } else {
                str2 = "fail";
            }
            jSONObject.put("result", str2);
        } catch (Exception e) {
            PassportLog passportLog = f123305a;
            passportLog.mo171462a("LoginHitPointHelper", "sendClickBack error: " + e.toString(), e);
        }
        ServiceFinder.m193748c().statistics("face_verification_result", jSONObject);
    }

    /* renamed from: a */
    public static void m193578a(String str, boolean z) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", str);
            if (z) {
                str2 = "success";
            } else {
                str2 = "fail";
            }
            jSONObject.put("result", str2);
        } catch (Exception e) {
            PassportLog passportLog = f123305a;
            passportLog.mo171462a("LoginHitPointHelper", "sendClickBack error: " + e.toString(), e);
        }
        ServiceFinder.m193748c().statistics("account_verify_result", jSONObject);
    }

    /* renamed from: a */
    public static void m193579a(boolean z, boolean z2, String str, int i) {
        String str2;
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "sdk";
            } else {
                str2 = "webview";
            }
            jSONObject.put("method", str2);
            if (z2) {
                str3 = "success";
            } else {
                str3 = "fail";
            }
            jSONObject.put("result", str3);
            jSONObject.put("source_type", i);
            jSONObject.put(ShareHitPoint.f121869d, str);
            LoginHitPoint.f123304a.mo171398a(jSONObject);
        } catch (Exception e) {
            PassportLog passportLog = f123305a;
            passportLog.mo171471d("LoginHitPointHelper", "sendLoginThirdPartyResult " + e.getMessage());
        }
    }
}
