package com.ss.android.lark.integrator.core;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.text.TextUtils;
import com.larksuite.component.air.C24044a;
import com.larksuite.component.dynamicresources.DynamicResourcesFacade;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.gecko.C38544a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.PackageChannelManager;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.integrator.core.d */
public class C39365d {

    /* renamed from: a */
    private static final C39365d f100688a = new C39365d();

    /* renamed from: b */
    private Resources f100689b;

    /* renamed from: a */
    public static C39365d m155187a() {
        return f100688a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Resources m155186a(Resources resources) {
        return this.f100689b;
    }

    /* renamed from: a */
    private boolean m155188a(LoginInfo loginInfo) {
        if (loginInfo == null || TextUtils.isEmpty(loginInfo.getTenantId())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m155189b(Context context) {
        boolean z;
        boolean z2;
        String str;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(context) {
                /* class com.ss.android.lark.integrator.core.$$Lambda$d$6Qa2AGplzCTl2ZRN9LRm03rCufg */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C39365d.lambda$6Qa2AGplzCTl2ZRN9LRm03rCufg(C39365d.this, this.f$1);
                }
            });
            return;
        }
        boolean z3 = true;
        if (!PackageChannelManager.isKABuildPackage(context) || C37239a.m146648b().mo136951a("lark.ka.dynamicres.check")) {
            z = false;
        } else {
            z = true;
        }
        DynamicResourcesFacade.m88634b(z);
        Log.m165389i("DynamicResourceProcessor", "force enable is " + z + ".");
        if (this.f100689b == null) {
            this.f100689b = MiraModule.m205155a(context);
            Log.m165389i("DynamicResourceProcessor", "store system resource.");
        }
        Log.m165389i("DynamicResourceProcessor", "initDynamicResources");
        if (1 != PackageChannelManager.getDeployMode(context)) {
            DynamicResourcesFacade.m88632a(false);
            return;
        }
        if (!C37239a.m146648b().mo136952a("lark.ka.dynamicres", false)) {
            Log.m165389i("DynamicResourceProcessor", "initDynamicResources: fg closed");
            z2 = false;
        } else {
            z2 = true;
        }
        LoginInfo loginInfo = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginInfo();
        if (m155188a(loginInfo)) {
            Log.m165389i("DynamicResourceProcessor", "initDynamicResources: doesn't login");
            z2 = false;
        }
        String a = DynamicResourcesFacade.m88630a();
        if (z2) {
            str = C38544a.m151996a().mo141230a(context, loginInfo.getTenantId());
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(a)) {
                Log.m165389i("DynamicResourceProcessor", "initDynamicResources: no resources package");
                z2 = false;
            }
        } else {
            str = "";
        }
        Log.m165389i("DynamicResourceProcessor", "initDynamicResources: start init, enable: " + z2);
        Application application = (Application) context.getApplicationContext();
        if (TextUtils.isEmpty(str) || !z2) {
            Log.m165389i("DynamicResourceProcessor", "initDynamicResources: clearing dynamic resources");
            DynamicResourcesFacade.m88631a(context, "");
            MiraModule.m205156a(application, new Function1() {
                /* class com.ss.android.lark.integrator.core.$$Lambda$d$OuCN5t2BHimXDpZzOwzEjhn7KFs */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C39365d.lambda$OuCN5t2BHimXDpZzOwzEjhn7KFs(C39365d.this, (Resources) obj);
                }
            });
            Log.m165389i("DynamicResourceProcessor", "initDynamicResources: replace mira resources to system");
            C24044a.m87852a().mo86281a(null);
            DynamicResourcesFacade.m88632a(false);
            Log.m165389i("DynamicResourceProcessor", "initDynamicResources: init complete, close dynamic resources");
            return;
        }
        DynamicResourcesFacade.m88632a(true);
        DynamicResourcesFacade.m88631a(context, str);
        Boolean a2 = MiraModule.m205156a(application, new Function1(application) {
            /* class com.ss.android.lark.integrator.core.$$Lambda$d$Zq2I6ovYdcL7YghooKgJBSVhQ4 */
            public final /* synthetic */ Application f$0;

            {
                this.f$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C39365d.m270612lambda$Zq2I6ovYdcL7YghooKgJBSVhQ4(this.f$0, (Resources) obj);
            }
        });
        if (a2 == null) {
            Log.m165389i("DynamicResourceProcessor", "initDynamicResources: no mira");
        } else if (!a2.booleanValue()) {
            Log.m165397w("DynamicResourceProcessor", "initDynamicResources: replace miraWrapper resources failed");
            DynamicResourcesFacade.m88632a(false);
            return;
        } else {
            z3 = false;
        }
        DynamicResourcesFacade.m88636c(z3);
        Log.m165389i("DynamicResourceProcessor", "initDynamicResources: init complete");
    }
}
