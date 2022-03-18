package com.ss.android.lark.platform.network;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.bytedance.lark.sdk.Sdk;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.appstate.C29223a;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.language.service.AbstractC41118a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p2989x.p2991b.AbstractC59337a;
import com.ss.android.lark.p2989x.p2991b.C59350b;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.p2482c.C51791b;
import com.ss.android.lark.platform.p2510z.C52066a;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.Locale;

/* renamed from: com.ss.android.lark.platform.network.b */
public class C51858b {
    /* renamed from: b */
    private Locale m201121b() {
        return C36235a.m142710a().mo148282c().mo148297b();
    }

    /* renamed from: a */
    private String m201118a() {
        AbstractC41118a c = C36235a.m142710a().mo148282c();
        return c.mo148296b(c.mo148297b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m201120a(InitSDKRequest.C15029a aVar) {
        C36083a.m141486a().getEnvDependency().mo132693a(aVar);
    }

    /* renamed from: a */
    private String m201119a(Context context) {
        String J = C57881t.m224611J(context);
        Log.m165389i("ImSdkInit", "Rust avatar path is:" + J);
        C26311p.m95289i(J);
        return J;
    }

    /* renamed from: a */
    public void mo178027a(final Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            C52066a.m201979a().mo201661b().mo201665a(context, str2, str, str3, m201118a(), m201119a(context), new AbstractC59337a.AbstractC59338a() {
                /* class com.ss.android.lark.platform.network.C51858b.C518591 */

                @Override // com.ss.android.lark.p2989x.p2991b.AbstractC59337a.AbstractC59338a
                /* renamed from: a */
                public void mo178029a() {
                    C29223a a = C51791b.m200791a();
                    C36083a.m141486a().getCalendarDependency().mo132734a(context);
                    a.mo103630a().mo103634a(AppLifecycle.m200904a().mo177975e());
                    PassThroughCommands.f128879a.mo178034a();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo178026a(Context context, String str, int i, int i2, String str2, String str3) {
        mo178028b(context, str, i, i2, str2, str3);
    }

    /* renamed from: b */
    public void mo178028b(Context context, String str, int i, int i2, String str2, String str3) {
        try {
            C51995b.m201717a("init_rust_sdk", (String) null);
            AbstractC49389b m = C36083a.m141486a().getPassportDependency().mo133094m();
            String c = m.mo172422c();
            String e = m.mo172424e();
            if (m.mo172428i()) {
                LoginInfo a = m.mo172419a();
                if (PackageChannelManager.isKABuildPackage(context) && PackageChannelManager.getDeployMode(context) != 1 && !TextUtils.equals(a.getIdpType(), PackageChannelManager.getBuildPackageChannel(context))) {
                    c = null;
                    e = null;
                }
            }
            C52066a.m201979a().mo201661b().mo201664a(context, new C59350b.C59352a().mo201693a(context).mo201692a(i).mo201697b(i2).mo201700c(str2).mo201698b(str3).mo201695a(m201118a()).mo201702d(C57824f.m224460a(context, null, m201121b())).mo201703e(C57881t.m224642n(context)).mo201704f(C57881t.m224616a(context)).mo201705g(C57881t.m224632e(context)).mo201699c(C51866f.m201151a()).mo201701d(C29410a.m108287a().mo104277a()).mo201694a($$Lambda$b$Zd5MQHuhMxAWa7As4mWj5JZlxFo.INSTANCE).mo201696a());
            Log.m165379d("ImSdkInit", "deviceId = " + str);
            if (!TextUtils.isEmpty(str)) {
                C36083a.m141486a().getPassportDependency().mo133097p().setDeviceId(str);
            }
            mo178027a(context, e, c, null);
            C51995b.m201714a();
        } finally {
            Sdk.notifyEndInitSdk();
        }
    }
}
