package com.ss.android.lark.ug;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.guide.biz.onboarding.tour.p1926a.C38600b;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuideActivity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.attribution.AbstractC57353b;
import com.ss.android.lark.ug.attribution.C57347a;
import com.ss.android.lark.ug.common.ChatOpener;
import com.ss.android.lark.ug.dyflow.common.storage.FlowStorage;
import com.ss.android.lark.ug.dyflow.feat.ReminderManager;
import com.ss.android.lark.ug.dyflow.flows.ObFlowManager;
import com.ss.android.lark.ug.dyflow.handler.StepHandlersRegistry;
import com.ss.android.lark.ug.dyflow.steps.StepsUtils;
import com.ss.android.lark.ug.p2857b.C57361a;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.ug.a */
public class C57345a {

    /* renamed from: a */
    private static volatile AbstractC57392a f141191a;

    /* renamed from: b */
    private AbstractC57353b f141192b;

    /* renamed from: a */
    public static AbstractC57392a m222261a() {
        return f141191a;
    }

    /* renamed from: b */
    public AbstractC57353b mo194456b() {
        return this.f141192b;
    }

    /* renamed from: c */
    public void mo194458c() {
        FlowStorage.m222678a();
    }

    /* renamed from: d */
    public void mo194459d() {
        Log.m165389i("UGModule", "startFlow, go");
        if (!PackageChannelManager.isKABuildPackage(m222261a().mo194672d())) {
            ObFlowManager.m222572e().mo194693b();
        }
    }

    /* renamed from: a */
    public void mo194450a(Context context) {
        C57361a.m222354a(context);
    }

    /* renamed from: b */
    public void mo194457b(final IGetDataCallback<Boolean> iGetDataCallback) {
        mo194452a(new UIGetDataCallback<Bundle>() {
            /* class com.ss.android.lark.ug.C57345a.C573461 */

            /* renamed from: a */
            private void m222274a() {
                C57345a.m222261a().mo194667a("", null);
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                m222274a();
            }

            /* renamed from: a */
            public void onSuccessed(Bundle bundle) {
                boolean z;
                if (bundle == null || bundle.size() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Boolean.valueOf(z));
                }
                if (z) {
                    C57345a.this.mo194459d();
                } else {
                    m222274a();
                }
            }
        });
    }

    public C57345a(AbstractC57392a aVar) {
        f141191a = aVar;
        C57347a a = C57347a.m222308a();
        this.f141192b = a;
        a.mo194488a(f141191a);
        StepHandlersRegistry.f141374a.mo194718a();
    }

    /* renamed from: a */
    public void mo194448a(Activity activity) {
        boolean z;
        Log.m165389i("UGModule", "dispatchMainViewResume, go");
        Intent intent = activity.getIntent();
        if (intent == null || !StepsUtils.f141524a.mo194972a(activity, intent)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            ObFlowManager.m222572e().mo194695c();
        }
        ReminderManager.m222800a().mo194920a(activity);
    }

    /* renamed from: a */
    public void mo194452a(IGetDataCallback<Bundle> iGetDataCallback) {
        Log.m165389i("UGModule", "checkFlowStatus, go");
        if (!PackageChannelManager.isKABuildPackage(m222261a().mo194672d())) {
            ObFlowManager.m222572e().mo194694b(iGetDataCallback);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(new Bundle());
        }
    }

    /* renamed from: a */
    public void mo194454a(List<String> list) {
        C38600b.m152249a().mo141375a(list, (Map<String, String>) null);
    }

    /* renamed from: a */
    public void mo194449a(Activity activity, Intent intent) {
        Log.m165389i("UGModule", "dispatchMainViewOnNewIntent, go");
        StepsUtils.f141524a.mo194972a(activity, intent);
    }

    /* renamed from: a */
    public boolean mo194455a(Context context, Uri uri) {
        return ObFlowManager.m222572e().mo194691a(uri.toString());
    }

    /* renamed from: a */
    public void mo194451a(Context context, boolean z, String str) {
        LdrGuideActivity.m152275a(context, z, str);
    }

    /* renamed from: a */
    public void mo194453a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            ChatOpener.f141337a.mo194685a(str, str2, str3);
        }
    }
}
