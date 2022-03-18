package com.tt.miniapp.p3294i;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.util.C67049n;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.TimeMeter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.i.a */
public class C66203a {

    /* renamed from: a */
    public Runnable f167103a;

    /* renamed from: b */
    public IAppContext f167104b;

    /* renamed from: c */
    private TimeMeter f167105c;

    /* renamed from: d */
    private Handler f167106d;

    /* renamed from: e */
    private Runnable f167107e = new Runnable() {
        /* class com.tt.miniapp.p3294i.C66203a.RunnableC662041 */

        public void run() {
            AppBrandLogger.m52828d("AppBrandExitManager", "exit callback timeout");
            C67509b.m262587a("mp_close_callback_timeout", 1, new JSONObject(), C66203a.this.f167104b);
            if (C66203a.this.f167103a != null) {
                C66203a.this.f167103a.run();
                C66203a.this.f167103a = null;
            }
        }
    };

    /* renamed from: a */
    public static C66203a m259184a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234286g();
    }

    public C66203a(IAppContext iAppContext) {
        this.f167104b = iAppContext;
        this.f167106d = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public void mo231543a(boolean z) {
        Runnable runnable;
        AppBrandLogger.m52828d("AppBrandExitManager", "onBeforeExitReturn: " + z);
        this.f167106d.removeCallbacks(this.f167107e);
        if (!z && (runnable = this.f167103a) != null) {
            runnable.run();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", TimeMeter.stop(this.f167105c));
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("AppBrandExitManager", "", e);
        }
        C67509b.m262587a("mp_close_callback_timeout", 0, jSONObject, this.f167104b);
        this.f167103a = null;
    }

    /* renamed from: a */
    public void mo231544a(boolean z, Runnable runnable) {
        if (this.f167103a != null) {
            AppBrandLogger.m52828d("AppBrandExitManager", "currently deal with exit");
            return;
        }
        AppBrandLogger.m52828d("AppBrandExitManager", "onBeforeExit");
        this.f167103a = runnable;
        C67049n.m261314a(z, this.f167104b);
        this.f167105c = TimeMeter.newAndStart();
        this.f167106d.postDelayed(this.f167107e, 500);
    }
}
