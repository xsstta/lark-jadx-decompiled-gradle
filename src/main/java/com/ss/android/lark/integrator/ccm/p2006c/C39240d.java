package com.ss.android.lark.integrator.ccm.p2006c;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.ee.bear.p391g.C7804b;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.ApiUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.integrator.ccm.c.d */
public class C39240d {

    /* renamed from: a */
    private final Handler f100551a = new Handler(CoreThreadPool.getSerialTaskHandler().getLooper()) {
        /* class com.ss.android.lark.integrator.ccm.p2006c.C39240d.HandlerC392411 */

        public void handleMessage(Message message) {
            if (message.what == 6401) {
                C39240d.this.mo143069a();
            }
        }
    };

    C39240d() {
    }

    /* renamed from: a */
    public void mo143069a() {
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        if (iPassportApi.isLogin() || iPassportApi.getAccountManager().mo172423d()) {
            C7804b.m31284b();
        } else {
            C53241h.m205898b("DocSdkPreloader", "preloadDocSdk, not login, return. ");
        }
    }

    /* renamed from: a */
    public void mo143070a(Context context, int i) {
        C53241h.m205898b("DocSdkPreloader", "preloadDocSdk, delayLoadTime: " + i);
        if (i <= 0) {
            mo143069a();
            return;
        }
        this.f100551a.removeMessages(6401);
        this.f100551a.sendEmptyMessageDelayed(6401, (long) i);
    }
}
