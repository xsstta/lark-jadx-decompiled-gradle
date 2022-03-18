package com.tt.remotedebug.p3437a;

import android.content.ContextWrapper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.he.jsbinding.JsContext;
import com.he.jsbinding.JsScopedContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.utils.C26246a;
import com.tt.miniapp.AbstractC66328m;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.JsRuntime;
import com.tt.miniapp.debug.VConsoleManager;
import com.tt.miniapp.settings.v2.handler.C66790o;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.remotedebug.p3438b.C67965b;
import com.tt.remotedebug.p3439c.AbstractC67966a;
import com.tt.remotedebug.p3439c.C67967b;
import java.lang.ref.WeakReference;
import okhttp3.Response;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.remotedebug.a.d */
public class C67959d extends JsRuntime {

    /* renamed from: a */
    public C67958c f171215a;

    /* renamed from: b */
    public ContextWrapper f171216b;

    /* renamed from: c */
    public AbstractC67966a f171217c;

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.AbstractC66259k
    public String getJsCoreFileName() {
        return null;
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void loadSubPackageMainJs(AbstractC66328m mVar, String str) {
    }

    @Override // com.tt.miniapp.JsRuntime, com.he.JsRunLoop.SetupCallback
    public void cleanup() {
        this.mLoader.cleanupV2();
    }

    /* renamed from: com.tt.remotedebug.a.d$a */
    private class C67961a extends AbstractC12821d {

        /* renamed from: a */
        public WeakReference<C67959d> f171220a;

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48408a() {
            AppBrandLogger.m52829e("VscJsRuntime", "socket onReconnect");
            super.mo48408a();
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48413a(ByteString byteString) {
            super.mo48413a(byteString);
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48410a(final String str) {
            super.mo48410a(str);
            AppBrandLogger.m52830i("VscJsRuntime", "Receive RemoteJs sdk Msg: " + str);
            if (!TextUtils.isEmpty(str) && this.f171220a.get() != null) {
                final C67952b bVar = (C67952b) this.f171220a.get().getJsBridge();
                if (TextUtils.equals(JSON.parseObject(str).getString("name"), "inspector")) {
                    String string = JSON.parseObject(str).getString("event");
                    if (string.equals("paused")) {
                        this.f171220a.get().f171217c.mo235824b(C67959d.this.appContext.getCurrentActivity());
                    } else if (string.equals("resumed")) {
                        this.f171220a.get().f171217c.mo235825c(C67959d.this.appContext.getCurrentActivity());
                    } else if (string.equals("end")) {
                        this.f171220a.get().f171217c.mo235826d(C67959d.this.appContext.getCurrentActivity());
                    }
                } else {
                    this.f171220a.get().mJsThreadHandler.post(new Runnable() {
                        /* class com.tt.remotedebug.p3437a.C67959d.C67961a.RunnableC679632 */

                        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
                            if (r4.equals("invoke") == false) goto L_0x003a;
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void run() {
                            /*
                            // Method dump skipped, instructions count: 374
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.tt.remotedebug.p3437a.C67959d.C67961a.RunnableC679632.run():void");
                        }
                    });
                }
            }
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48412a(Response response) {
            AppBrandLogger.m52830i("VscJsRuntime", "webSocket Open");
            new C67500a(C67965b.f171227b, C67959d.this.appContext).flush();
            if (this.f171220a.get() == null) {
                AppBrandLogger.m52829e("VscJsRuntime", "js runtime null ");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                String a = C66790o.m260656a(C67959d.this.appContext.getApplicationContext()).mo232700a("sdk_version");
                jSONObject3.put("url", C66790o.m260656a(C67959d.this.appContext.getApplicationContext()).mo232700a("latest_sdk_url"));
                jSONObject3.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, a);
                jSONObject4.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, C26246a.m94977a(C67959d.this.f171216b));
                jSONObject5.put("debug", ((VConsoleManager) AppbrandApplicationImpl.getInst(C67959d.this.appContext).getService(VConsoleManager.class)).isVConsoleSwitchOn());
                jSONObject5.put("platform", "android");
                jSONObject2.put("jssdk", jSONObject3);
                jSONObject2.put("device", jSONObject4);
                jSONObject2.put("nativeTMAConfig", jSONObject5);
                jSONObject.put("name", "initWorker");
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
                new C67500a(C67965b.f171231f, C67959d.this.appContext).addCategoryValue("jssdk_version", a).flush();
            } catch (JSONException e) {
                AppBrandLogger.m52829e("VscJsRuntime", "put init worker data err ", e);
            }
            AppBrandLogger.m52829e("VscJsRuntime", "init work data " + jSONObject.toString());
            this.f171220a.get().f171215a.mo235818a(jSONObject.toString());
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.remotedebug.p3437a.C67959d.C67961a.RunnableC679621 */

                public void run() {
                    if (C67961a.this.f171220a.get() != null) {
                        C67961a.this.f171220a.get().f171217c.mo235823a(C67959d.this.appContext.getCurrentActivity());
                    }
                }
            });
        }

        public C67961a(C67959d dVar) {
            this.f171220a = new WeakReference<>(dVar);
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: b */
        public void mo48414b(int i, String str) {
            AppBrandLogger.m52829e("VscJsRuntime", "socket onClosed");
            super.mo48414b(i, str);
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48409a(int i, String str) {
            AppBrandLogger.m52829e("VscJsRuntime", "socket onClosing");
            super.mo48409a(i, str);
            this.f171220a.get().f171217c.mo235826d(C67959d.this.appContext.getCurrentActivity());
            new C67500a(C67965b.f171229d, C67959d.this.appContext).flush();
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48411a(Throwable th, Response response) {
            AppBrandLogger.m52829e("VscJsRuntime", "socket onFailure");
            super.mo48411a(th, response);
            this.f171220a.get().mJsSdkLoadState = 1;
            this.f171220a.get().f171217c.mo235827e(C67959d.this.appContext.getCurrentActivity());
            new C67500a(C67965b.f171228c, C67959d.this.appContext).flush();
        }
    }

    /* renamed from: a */
    public void mo235820a(String str) {
        this.f171215a.mo235818a(str);
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void loadMainJs(final AbstractC66328m mVar) {
        this.mJsSdkLoadState = 0;
        executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.remotedebug.p3437a.C67959d.C679601 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                AppBrandLogger.m52830i("VscJsRuntime", "load MainJs");
                mVar.mo87263a();
                mVar.mo87265b();
            }
        });
    }

    @Override // com.he.jsbinding.JsContext.ScopeCallback, com.tt.miniapp.JsRuntime
    public void run(JsScopedContext jsScopedContext) {
        if (HostDependManager.getInst().getSettingsProvider() != null) {
            this.mLoader.setup(this.f171216b, HostDependManager.getInst().getSettingsProvider());
        } else {
            this.mLoader.setup(this.f171216b, this);
        }
        setupLoader();
        this.f171215a.mo235816a();
    }

    public C67959d(ContextWrapper contextWrapper, IAppContext iAppContext) {
        super(contextWrapper, iAppContext);
        C67958c cVar = new C67958c(iAppContext);
        this.f171215a = cVar;
        cVar.mo235817a(new C67961a(this));
        this.f171216b = contextWrapper;
        this.mJsBridge = new C67952b(this, iAppContext);
        this.f171217c = new C67967b(this.f171215a, iAppContext);
        start();
    }
}
