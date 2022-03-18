package com.ss.android.lark.integrator.ccm.config.p2010d;

import com.bytedance.ee.bear.appsetting.p243b.AbstractC4217a;
import com.bytedance.ee.bear.appsetting.p243b.C4218b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Locale;

/* renamed from: com.ss.android.lark.integrator.ccm.config.d.a */
public class C39259a {

    /* renamed from: a */
    private static final Object f100586a = new Object();

    /* renamed from: b */
    private static volatile boolean f100587b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.ccm.config.d.a$a */
    public static class C39261a extends AbstractC4217a {
        @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
        /* renamed from: a */
        public void mo16546a() {
        }

        private C39261a() {
        }

        @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
        /* renamed from: a */
        public boolean mo16548a(String str, boolean z, boolean z2) {
            boolean z3;
            if (z2) {
                z3 = C37239a.m146648b().mo136951a(str);
            } else {
                z3 = C37239a.m146648b().mo136954b(str);
            }
            C13479a.m54764b("LarkFGRepository", "getBoolean, key = " + str + ", value = " + z3 + ", consistent = " + z2);
            return z3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.ccm.config.d.a$b */
    public static class C39262b implements C4218b.AbstractC4223a {
        private C39262b() {
        }

        @Override // com.bytedance.ee.bear.appsetting.p243b.C4218b.AbstractC4223a
        /* renamed from: g */
        public String mo16565g() {
            return DynamicConfigModule.m145551a(DomainSettings.Alias.DOCS_API);
        }

        @Override // com.bytedance.ee.bear.appsetting.p243b.C4218b.AbstractC4223a
        /* renamed from: a */
        public String mo16559a() {
            return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSession();
        }

        @Override // com.bytedance.ee.bear.appsetting.p243b.C4218b.AbstractC4223a
        /* renamed from: b */
        public Locale mo16560b() {
            return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLanguageSetting();
        }

        @Override // com.bytedance.ee.bear.appsetting.p243b.C4218b.AbstractC4223a
        /* renamed from: d */
        public String mo16562d() {
            return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
        }

        @Override // com.bytedance.ee.bear.appsetting.p243b.C4218b.AbstractC4223a
        /* renamed from: e */
        public String mo16563e() {
            return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
        }

        @Override // com.bytedance.ee.bear.appsetting.p243b.C4218b.AbstractC4223a
        /* renamed from: f */
        public String mo16564f() {
            return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantId();
        }

        @Override // com.bytedance.ee.bear.appsetting.p243b.C4218b.AbstractC4223a
        /* renamed from: c */
        public boolean mo16561c() {
            int oldSdkEnv = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).oldSdkEnv();
            if (oldSdkEnv == InitSDKRequest.EnvType.OVERSEA_STAGING.getValue() || oldSdkEnv == InitSDKRequest.EnvType.STAGING.getValue()) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m154857a() {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.ccm.config.p2010d.C39259a.m154857a():void");
    }
}
