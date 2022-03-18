package com.ss.android.lark.platform.network.ttnet;

import android.app.Application;
import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.p741a.C13979a;
import com.bytedance.frameworks.baselib.network.http.p741a.C13981b;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.http.HttpRequestInfo;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.lark.platform.network.ttnet.g */
public class C51883g {
    /* renamed from: a */
    private static boolean m201228a() {
        return false;
    }

    /* renamed from: b */
    private static Locale m201229b() {
        return C36235a.m142710a().mo148282c().mo148297b();
    }

    /* renamed from: a */
    public static void m201227a(Context context) {
        if (m201230b(context)) {
            m201231c(context);
        }
    }

    /* renamed from: b */
    public static boolean m201230b(Context context) {
        File file = new File(context.getFilesDir(), "ttnet_fg");
        File file2 = new File(context.getFilesDir(), "ttnet_lark_fg");
        if (file.exists() || file2.exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static void m201231c(Context context) {
        C518841 r2 = new NetworkParams.AbstractC13968b<HttpRequestInfo>() {
            /* class com.ss.android.lark.platform.network.ttnet.C51883g.C518841 */

            @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13968b
            /* renamed from: a */
            public String mo51364a(String str, boolean z, Object... objArr) {
                return null;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13968b
            /* renamed from: a */
            public Map<String, String> mo51365a(int i) {
                return null;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13968b
            /* renamed from: a */
            public void mo51366a() {
            }

            /* renamed from: a */
            public void mo51367a(String str, long j, HttpRequestInfo httpRequestInfo) {
            }

            /* renamed from: a */
            public void mo51368a(String str, Throwable th, long j, HttpRequestInfo httpRequestInfo) {
            }

            @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13968b
            /* renamed from: a */
            public void mo51369a(Map<String, String> map, boolean z) {
            }

            @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13968b
            /* renamed from: a */
            public String mo51363a(String str, boolean z) {
                return AppLogProxy.addNetCommonParams(LarkContext.getApplication(), str, z);
            }
        };
        C518852 r3 = new NetworkParams.AbstractC13974h<HttpRequestInfo>() {
            /* class com.ss.android.lark.platform.network.ttnet.C51883g.C518852 */

            /* renamed from: a */
            public void mo51379a(long j, long j2, String str, String str2, HttpRequestInfo httpRequestInfo) {
            }

            /* renamed from: a */
            public void mo51380a(long j, long j2, String str, String str2, HttpRequestInfo httpRequestInfo, Throwable th) {
            }
        };
        try {
            C51875a.m201177a();
            TTNetInit.setTTNetDepend(new C51877c(context));
            TTNetInit.trySetDefaultUserAgent(C57824f.m224460a(context, null, m201229b()));
            TTNetInit.triggerGetDomain(context, true);
            if (!C26252ad.m94993b(context)) {
                C13981b.m56538a().mo51398a(C13979a.m56522a().mo51395a(true).mo51396a());
            }
            TTNetInit.tryInitTTNet(context, (Application) context.getApplicationContext(), r2, r3, null, m201228a(), true);
            TTNetInit.preInitCronetKernel();
        } catch (Throwable th) {
            Log.m165385e("TTNET_INIT", "initTTNet", th, true);
        }
    }
}
