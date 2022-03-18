package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.aa.C51657a;
import com.ss.android.lark.platform.p2494o.C51886a;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.ttwebview.C57299a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Set;

public class InitTTWebViewBusinessTask extends AsyncLaunchTask {
    /* renamed from: g */
    private void m106284g() {
        if (C37239a.m146648b() != null) {
            C51657a.m200381a().mo194407a($$Lambda$InitTTWebViewBusinessTask$b_TiZVsJjujxJhlC8CwMq95M2sU.INSTANCE);
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        m106283b(context);
    }

    /* renamed from: b */
    private void m106283b(Context context) {
        C51995b.m201718a("initWebViewSDK logic", null, 1);
        Log.m165389i("InitTTWebViewBusinessTask", "initWebViewSDK business start");
        C57299a a = C51657a.m200381a();
        if (a.mo194412c(context) || a.mo194415e()) {
            if (C26252ad.m94993b(context)) {
                ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).addDeviceIdChangeListener(new AbstractC49390d.AbstractC49391a(context) {
                    /* class com.ss.android.lark.app.task.$$Lambda$InitTTWebViewBusinessTask$vVz0CfGmNpDhLzmoaWypirA9fE */
                    public final /* synthetic */ Context f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d.AbstractC49391a
                    public final void onDeviceIdChange(String str) {
                        C57299a.this.mo194405a((C57299a) this.f$1, (Context) str);
                    }
                });
            }
            a.mo194409b(context);
            m106284g();
            Log.m165389i("InitTTWebViewBusinessTask", "initWebViewSDK business success");
        }
        Log.m165389i("InitTTWebViewBusinessTask", "initWebViewSDK business end");
        C51995b.m201714a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m106282a(String str, long j, long j2, long j3, Set set) {
        C51886a.m201246a().mo168809a(str, j, j2, set);
    }
}
