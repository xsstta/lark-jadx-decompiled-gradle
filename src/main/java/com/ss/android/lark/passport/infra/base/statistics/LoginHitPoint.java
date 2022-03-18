package com.ss.android.lark.passport.infra.base.statistics;

import com.ss.android.lark.passport.infra.service.ServiceFinder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/statistics/LoginHitPoint;", "", "()V", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.statistics.a */
public final class LoginHitPoint {

    /* renamed from: a */
    public static final Companion f123304a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001f\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0004J\b\u0010\f\u001a\u00020\u0004H\u0004J\b\u0010\r\u001a\u00020\u0004H\u0004J\b\u0010\u000e\u001a\u00020\u0004H\u0004J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0004J\u001c\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0004J\b\u0010\u0016\u001a\u00020\u0004H\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0004J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0004J\b\u0010\u001c\u001a\u00020\u0004H\u0004J\b\u0010\u001d\u001a\u00020\u0004H\u0004J\b\u0010\u001e\u001a\u00020\u0004H\u0004J\b\u0010\u001f\u001a\u00020\u0004H\u0004J\b\u0010 \u001a\u00020\u0004H\u0004J\b\u0010!\u001a\u00020\u0004H\u0004J\u0006\u0010\"\u001a\u00020\u0004J\b\u0010#\u001a\u00020\u0004H\u0004¨\u0006$"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/statistics/LoginHitPoint$Companion;", "", "()V", "sendAccountVerifyNext", "", "sendCreateTeamLoadTime", "url", "", "time", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "sendLoginAppSuccess", "sendLoginClickToRegister", "sendLoginClickVerifyCode", "sendLoginClickVerifyPwd", "sendLoginCreateTeamH5PageEnter", "key", "sendLoginLastFailedPage", "pageName", "errorPageName", "sendLoginRecoverEntryClick", "sendLoginRecoverEntryView", "sendLoginSuccess", "sendLoginSwitchToCode", "sendLoginSwitchToPwd", "sendLoginThirdPartyResult", "params", "Lorg/json/JSONObject;", "sendLoginUnregisterPhoneNumber", "sendPassportCickResendVerifyCode", "sendPrivacyPolicyClick", "sendPwdRecoverEntryClick", "sendPwdRecoverEntryView", "sendRegisterClickVerifyCode", "sendRegisterGuidePage", "sendSetRecoverPhoneNumberNext", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.statistics.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo171394a() {
            ServiceFinder.m193748c().statistics("register_guide_page");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo171399b() {
            ServiceFinder.m193748c().statistics("register_click_verify_code");
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo171400c() {
            ServiceFinder.m193748c().statistics("passport_click_resend_verify_code");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo171401d() {
            ServiceFinder.m193748c().statistics("login_switch_to_pwd");
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final void mo171402e() {
            ServiceFinder.m193748c().statistics("login_switch_to_code");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final void mo171403f() {
            ServiceFinder.m193748c().statistics("passport_click_verify_code");
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final void mo171404g() {
            ServiceFinder.m193748c().statistics("login_account_recovery_entry_view");
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public final void mo171405h() {
            ServiceFinder.m193748c().statistics("login_account_recovery_entry_click");
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public final void mo171406i() {
            ServiceFinder.m193748c().statistics("password_reset_account_recovery_entry_click");
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public final void mo171407j() {
            ServiceFinder.m193748c().statistics("password_reset_account_recovery_entry_view");
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public final void mo171408k() {
            ServiceFinder.m193748c().statistics("account_verify_next");
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public final void mo171409l() {
            ServiceFinder.m193748c().statistics("privacy_policy_click");
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public final void mo171410m() {
            ServiceFinder.m193748c().statistics("set_phone_number_next");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public final void mo171411n() {
            ServiceFinder.m193748c().statistics("login_click_verify_pwd");
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public final void mo171412o() {
            ServiceFinder.m193748c().statistics("login_unregister_phone_number");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo171395a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            ServiceFinder.m193748c().statistics(str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo171398a(JSONObject jSONObject) {
            ServiceFinder.m193748c().statistics("login_third_party_result", jSONObject);
        }

        /* renamed from: a */
        public final void mo171396a(String str, Long l) {
            if (str != null && l != null) {
                ServiceFinder.m193748c().statistics("h5_load_time", new JSONObject().put("load_time", l.longValue()).put("load_url", str));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo171397a(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page_name", str);
            jSONObject.put("error_page_name", str2);
            ServiceFinder.m193748c().statistics("login_last_error_page", jSONObject);
        }
    }
}
