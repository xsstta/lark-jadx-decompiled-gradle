package com.ss.android.lark.platform.network;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.DeprecatedConfig;
import com.bytedance.lark.pb.basic.v1.InitLogUpload;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.bytedance.lark.sdk.Sdk;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.language.service.AbstractC41118a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.sdk.AbstractC53239f;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.C53254m;
import com.ss.android.lark.simple.C54866b;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57881t;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.platform.network.c */
public class C51860c {
    /* renamed from: a */
    public void mo178030a() {
        C53254m.m205925a(new AbstractC53239f() {
            /* class com.ss.android.lark.platform.network.C51860c.C518611 */

            @Override // com.ss.android.lark.sdk.AbstractC53239f
            /* renamed from: a */
            public void mo103037a(String str, String str2) {
                Log.m165383e(str, str2);
            }

            @Override // com.ss.android.lark.sdk.AbstractC53239f
            /* renamed from: b */
            public void mo103039b(String str, String str2) {
                Log.m165389i(str, str2);
            }

            @Override // com.ss.android.lark.sdk.AbstractC53239f
            /* renamed from: c */
            public void mo103040c(String str, String str2) {
                Log.m165379d(str, str2);
            }

            @Override // com.ss.android.lark.sdk.AbstractC53239f
            /* renamed from: d */
            public void mo103041d(String str, String str2) {
                Log.m165397w(str, str2);
            }

            @Override // com.ss.android.lark.sdk.AbstractC53239f
            /* renamed from: a */
            public void mo103038a(String str, String str2, String str3) {
                Log.debug(str, str2, str3, (Map<String, String>) null);
            }
        });
    }

    /* renamed from: b */
    private String m201128b() {
        AbstractC41118a c = C36235a.m142710a().mo148282c();
        return c.mo148296b(c.mo148297b());
    }

    /* renamed from: a */
    private String m201126a(String str) {
        String string = C57744a.m224104a().getString("key_user_agent");
        if (TextUtils.isEmpty(string)) {
            string = "Mozilla/5.0 (Linux; Android 7.0; FRD-AL00 Build/HUAWEIFRD-AL00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.91 Mobile Safari/537.36";
        }
        String str2 = string + " Lark/" + str;
        Log.m165389i("InitImSdkSimpleTask", "getWschannelUA is " + str2);
        return str2;
    }

    /* renamed from: a */
    public void mo178031a(Context context, int i, int i2, String str) {
        try {
            String b = m201128b();
            int a = C51866f.m201151a();
            String a2 = C26246a.m94977a(context);
            m201127a(context, i, i2, str, a2, m201126a(a2), b, a, C29410a.m108287a().mo104277a());
            Sdk.addPushObserver(C53248k.m205912a());
            Sdk.notifyEndInitSdk();
        } catch (Exception e) {
            Log.m165383e("InitImSdkSimpleTask", "initInternal catch exception: " + e);
        }
    }

    /* renamed from: a */
    private void m201127a(Context context, int i, int i2, String str, String str2, String str3, String str4, int i3, int i4) {
        InitSDKRequest.C15029a aVar = new InitSDKRequest.C15029a();
        InitSDKRequest.EnvType fromValue = InitSDKRequest.EnvType.fromValue(i);
        InitSDKRequest.EnvV2 envV2 = new InitSDKRequest.EnvV2(InitSDKRequest.EnvV2.Type.fromValue(i2), str, "");
        InitLogUpload.C15019a aVar2 = new InitLogUpload.C15019a();
        boolean a = C54866b.m212765a().mo187076a(context);
        Log.m165389i("InitImSdkSimpleTask", "start init sdk");
        aVar.mo54914a(C57881t.m224642n(context)).mo54922f(C57881t.m224616a(context)).mo54925i(DynamicConfigModule.m145555d()).mo54905a(fromValue).mo54906a(envV2).mo54904a(InitSDKRequest.DataSynchronismStrategy.SUBSCRIBE).mo54921e(str4).mo54917b(str2).mo54919c(str3).mo54903a(aVar2.build()).mo54912a((Boolean) true).mo54916b((Boolean) false).mo54902a(new DeprecatedConfig.C14862a().mo54505a(false).build()).mo54907a(InitSDKRequest.PackageId.fromValue(i3)).mo54913a(Long.valueOf(Looper.getMainLooper().getThread().getId())).mo54920d(String.valueOf(i4)).mo54924h(TimeZone.getDefault().getID()).mo54918c(Boolean.valueOf(a));
        C36083a.m141486a().getEnvDependency().mo132693a(aVar);
        Sdk.getInstance().initSDK(context, aVar);
        Log.m165389i("InitImSdkSimpleTask", "end init sdk");
    }
}
