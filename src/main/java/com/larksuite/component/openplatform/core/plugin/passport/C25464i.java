package com.larksuite.component.openplatform.core.plugin.passport;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.framework.apiplugin.LKEvent;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.jsbridge.C66254h;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3367e.C67460f;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.passport.i */
public class C25464i {

    /* renamed from: d */
    public static String f62053d = "LoginProxy";

    /* renamed from: a */
    public AbstractC25468c f62054a;

    /* renamed from: b */
    public C67460f f62055b;

    /* renamed from: c */
    public final OPTrace f62056c = this.f62055b.getTracingSpan().subTrace();

    /* renamed from: e */
    private final LoginAsyncHandler f62057e = new LoginAsyncHandler("login", this.f62055b);

    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.i$c */
    public interface AbstractC25468c {
        /* renamed from: a */
        void mo88614a(String str);

        /* renamed from: a */
        void mo88615a(JSONObject jSONObject);
    }

    /* renamed from: a */
    public void mo88612a() {
        this.f62057e.mo230470b(C67701b.C67703a.m263358a("login", new C67704c(new JSONObject())).mo234993a(new C25466a(this.f62055b)).mo234992a(new AbstractC65805h() {
            /* class com.larksuite.component.openplatform.core.plugin.passport.C25464i.C254651 */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h
            public void callback(ApiCallResult apiCallResult) {
                String str = C25464i.f62053d;
                AppBrandLogger.m52830i(str, "call login use login proxy：" + apiCallResult.toString());
                JSONObject json = apiCallResult.getJson();
                if (!apiCallResult.isFail()) {
                    OPMonitorUtils.monitorOriginResultCallback(C25464i.this.f62055b, "login", C25464i.this.f62056c, apiCallResult, false);
                    if (C25464i.this.f62054a != null) {
                        C25464i.this.f62054a.mo88614a(json.optString("code"));
                    }
                } else if (C25464i.this.f62054a != null) {
                    C25464i.this.f62054a.mo88615a(json);
                }
            }
        }).mo234994a(this.f62055b.getAppType()).mo234996a());
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.i$b */
    public class HandlerC25467b extends Handler {
        public void handleMessage(Message message) {
            if (message.what != 1) {
                String str = C25464i.f62053d;
                AppBrandLogger.m52829e(str, "no this case" + message.what);
                return;
            }
            C66254h hVar = (C66254h) message.obj;
            if (hVar == null) {
                AppBrandLogger.m52829e(C25464i.f62053d, "nativeApiEvent is null");
            } else if (hVar.f167227f != null) {
                hVar.f167227f.run();
            } else {
                AppBrandLogger.m52829e(C25464i.f62053d, "mRunnable is null");
            }
        }

        public HandlerC25467b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.i$a */
    public class C25466a implements AbstractC65806i {

        /* renamed from: b */
        private IAppContext f62060b;

        /* renamed from: c */
        private HandlerThread f62061c;

        /* renamed from: d */
        private HandlerC25467b f62062d;

        /* renamed from: a */
        public static HandlerThread m91020a(String str) {
            return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
        }

        public C25466a(IAppContext iAppContext) {
            HandlerThread a = m91020a("async#api");
            this.f62061c = a;
            a.start();
            this.f62060b = iAppContext;
        }

        @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i
        public void executeAsyncApiHandle(String str, Runnable runnable) {
            if (this.f62062d == null) {
                this.f62062d = new HandlerC25467b(this.f62061c.getLooper());
            }
            this.f62062d.obtainMessage(1, new C66254h(runnable, (LKEvent) null, false)).sendToTarget();
        }
    }

    public C25464i(Context context, String str, AbstractC25468c cVar) {
        this.f62055b = new C67460f(context);
        this.f62055b.mo234157a(C67440a.m262344a(AppType.GadgetAPP, str));
        this.f62055b.setAppId(str);
        this.f62054a = cVar;
    }
}
