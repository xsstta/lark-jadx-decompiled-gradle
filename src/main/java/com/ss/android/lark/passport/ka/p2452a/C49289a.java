package com.ss.android.lark.passport.ka.p2452a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.AppActivityManager;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.ka.C49298b;
import com.ss.android.lark.passport.ka.KaLoginActivity;
import com.ss.android.lark.passport.ka.model.InnerIdentify;
import com.ss.android.lark.passport.ka.model.KaIdentity;
import com.ss.android.lark.passport.ka.model.KaSsoStepInfo;
import com.ss.android.lark.util.share_preference.C57744a;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.lark.passport.ka.a.a */
public class C49289a {

    /* renamed from: a */
    public static boolean f123738a;

    /* renamed from: b */
    private static C49289a f123739b;

    /* renamed from: c */
    private final PassportLog f123740c = PassportLog.f123351c.mo171474a();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.ka.a.a$a */
    public static class C49291a extends BroadcastReceiver {
        private C49291a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C49289a.f123738a = intent.getBooleanExtra("isLoadingUrlOpen", C49289a.f123738a);
            }
        }
    }

    /* renamed from: a */
    public static C49289a m194212a() {
        if (f123739b == null) {
            synchronized (C49289a.class) {
                if (f123739b == null) {
                    f123739b = new C49289a();
                }
            }
        }
        return f123739b;
    }

    /* renamed from: b */
    public void mo171899b(Context context) {
        C49298b.m194253a().mo171923b();
    }

    /* renamed from: c */
    private void m194216c(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("loading.url.open");
        C49291a aVar = new C49291a();
        m194211a(context, aVar, intentFilter);
        m194213a(context, aVar);
    }

    /* renamed from: a */
    private void m194215a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f123740c.mo171465b("IDPLoginService", "securityId is null");
            return;
        }
        f123738a = true;
        C57744a.m224104a().putString("passport_security_id", str);
    }

    /* renamed from: a */
    public void mo171896a(Context context) {
        C49296c.m194232a().mo171914b((KaIdentity) null);
        C49296c.m194232a().mo171907a((InnerIdentify) null);
        C49296c.m194232a().mo171915b((String) null);
    }

    /* renamed from: a */
    public boolean mo171898a(Context context, boolean z) {
        if (context == null) {
            return false;
        }
        KaLoginActivity.m194175a(context, z);
        return true;
    }

    /* renamed from: a */
    private void m194213a(final Context context, final BroadcastReceiver broadcastReceiver) {
        if (context instanceof Activity) {
            AppActivityManager.m193864a((Activity) context, new Function0<Unit>() {
                /* class com.ss.android.lark.passport.ka.p2452a.C49289a.C492901 */

                /* renamed from: a */
                public Unit invoke() {
                    context.unregisterReceiver(broadcastReceiver);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* renamed from: a */
    private void m194214a(Context context, String str) {
        Uri parse = Uri.parse(str);
        if (parse == null) {
            this.f123740c.mo171471d("IDPLoginService", "contentUrl is null");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(parse);
        try {
            this.f123740c.mo171465b("IDPLoginService", "startDefaultBrowser");
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            this.f123740c.mo171462a("IDPLoginService", "startDefaultBrowser failed", e);
        }
    }

    /* renamed from: a */
    public void mo171897a(Context context, JSONObject jSONObject) {
        String str;
        this.f123740c.mo171465b("n_action_idp_auth_goto_web", "goto login web start");
        if (jSONObject == null) {
            this.f123740c.mo171471d("n_action_idp_auth_goto_web", "gotoLoginWeb data == null");
            return;
        }
        KaSsoStepInfo kaSsoStepInfo = (KaSsoStepInfo) C38760a.m153056a(jSONObject.toJSONString(), KaSsoStepInfo.class);
        if (kaSsoStepInfo != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("open_with", kaSsoStepInfo.openWith);
            this.f123740c.mo171467b("n_action_idp_auth_goto_web", "web open with", hashMap);
            if (kaSsoStepInfo.preConfig == null || kaSsoStepInfo.preConfig.internal == null) {
                this.f123740c.mo171465b("n_action_idp_auth_goto_web", "empty userAgent");
                str = "";
            } else {
                str = kaSsoStepInfo.preConfig.internal.userAgent;
                this.f123740c.mo171465b("n_action_idp_auth_goto_web", "userAgent updated");
            }
            if (!"browser".equals(kaSsoStepInfo.openWith) || TextUtils.isEmpty(kaSsoStepInfo.landUrl)) {
                this.f123740c.mo171465b("n_action_idp_auth_goto_web", "do internal idp verify");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("browser_type", "internal");
                WatcherHelper.m193665a(null, C40654u.f103198u, hashMap2);
                C49298b.m194253a().mo171922a(context, kaSsoStepInfo.url, str, true);
            } else {
                Uri parse = Uri.parse(kaSsoStepInfo.landUrl);
                if (parse == null) {
                    this.f123740c.mo171471d("n_action_idp_auth_goto_web", "landUrl is null");
                    return;
                }
                this.f123740c.mo171465b("n_action_idp_auth_goto_web", "jump to external browser and do idp verify.");
                String builder = parse.buildUpon().appendQueryParameter("loadingpage", "true").toString();
                if (!TextUtils.isEmpty(builder)) {
                    C49298b.m194253a().mo171922a(context, builder, str, false);
                    m194215a(kaSsoStepInfo.securityId);
                    m194216c(context);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("browser_type", "external");
                    WatcherHelper.m193665a(null, C40654u.f103198u, hashMap3);
                    m194214a(context, kaSsoStepInfo.url);
                } else {
                    this.f123740c.mo171471d("n_action_idp_auth_goto_web", "jump to external browse, loading url is null");
                }
            }
            C49296c.m194232a().mo171917c(C38760a.m153057a(kaSsoStepInfo.preConfig));
            C49296c.m194232a().mo171919d(kaSsoStepInfo.url);
            return;
        }
        this.f123740c.mo171471d("n_action_idp_auth_goto_web", "sso step info is null");
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m194211a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
