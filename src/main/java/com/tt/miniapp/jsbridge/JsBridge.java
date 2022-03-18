package com.tt.miniapp.jsbridge;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import com.he.jsbinding.JsContext;
import com.he.jsbinding.JsObject;
import com.he.jsbinding.JsScopedContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.utils.ApiMonitorUtil;
import com.larksuite.component.openplatform.core.utils.C25527b;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25893d;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25898i;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25903n;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.JsRuntime;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.jsbridge.JsBridge;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapp.p3258a.AbstractC65718b;
import com.tt.miniapp.p3258a.C65719c;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i;
import com.tt.miniapp.p3324r.C66713b;
import com.tt.miniapp.p3324r.C66717c;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.p3331t.C66890j;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.ext.AbstractC67620f;
import com.tt.option.ext.AbstractC67621g;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsBridge implements IJsBridge {
    private List<String> ARRAY_BUFFER_CALL_EVENT = new ArrayList<String>() {
        /* class com.tt.miniapp.jsbridge.JsBridge.C662211 */

        {
            add("createWorker");
        }
    };
    protected IAppContext appContext;
    boolean firstSetData = true;
    public AbstractC67620f mApiHandlerCallBack = new AbstractC67620f() {
        /* class com.tt.miniapp.jsbridge.JsBridge.C662233 */

        @Override // com.tt.option.ext.AbstractC67620f
        /* renamed from: a */
        public void mo231157a(AbstractC67621g gVar) {
            JsBridge.this.returnAsyncResult(gVar.mo231587a(), gVar.mo231590c(), gVar.mo231589b(), (String) gVar.mo231588a("inner_tracing_id"));
        }

        @Override // com.tt.option.ext.AbstractC67619e
        public void callback(int i, String str) {
            JsBridge.this.returnAsyncResult(i, null, str, null);
        }
    };
    private AbstractC67709b mApiService;
    public List<C66254h> mBlockNativeApiEventList = new ArrayList();
    private boolean mDisableUseNewPlugin;
    public final List<String> mInterceptEventListWhenBackgroundOverLimitTime = Arrays.asList("createInnerRequestTask", "createRequestTask", "createDownloadTask", "createSocketTask", "createUploadTask");
    public volatile boolean mIsBlockingJsInvokeNativeApi;
    private HandlerC66234e mJsMsgHandler;
    private HandlerThread mJsMsgHandlerThread;
    private final JsRuntime mJsRuntime;
    private volatile HandlerC66251g mJsTimerHanlder;
    public final List<String> mNotBlockAsyncApiListWhenBackground = Arrays.asList("setBgAudioState", "getBgAudioState", "operateBgAudio", "reportTimelinePoints", "systemLog", "operateSocketTask");
    private AbstractC65718b<AbstractC66715a> mStrategy = new C65719c();

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.jsbridge.JsBridge$b */
    public interface AbstractC66231b {
        JsObject generate(JsScopedContext jsScopedContext);
    }

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: com.tt.miniapp.jsbridge.JsBridge$a */
    private static class C66230a implements AbstractC67621g {

        /* renamed from: a */
        private int f167174a;

        /* renamed from: b */
        private String f167175b;

        /* renamed from: c */
        private String f167176c;

        /* renamed from: d */
        private String f167177d;

        @Override // com.tt.option.ext.AbstractC67621g
        /* renamed from: a */
        public int mo231587a() {
            return this.f167174a;
        }

        @Override // com.tt.option.ext.AbstractC67621g
        /* renamed from: b */
        public String mo231589b() {
            return this.f167175b;
        }

        @Override // com.tt.option.ext.AbstractC67621g
        /* renamed from: c */
        public String mo231590c() {
            return this.f167177d;
        }

        @Override // com.tt.option.ext.AbstractC67621g
        /* renamed from: a */
        public <T> T mo231588a(String str) {
            if ("inner_tracing_id".equals(str)) {
                return (T) this.f167176c;
            }
            return null;
        }

        private C66230a(int i, String str, String str2, String str3) {
            this.f167174a = i;
            this.f167175b = str2;
            this.f167176c = str3;
            this.f167177d = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.jsbridge.JsBridge$f */
    public static class C66235f {

        /* renamed from: a */
        private OPTrace f167186a;

        /* renamed from: b */
        private boolean f167187b;

        private C66235f() {
        }

        /* renamed from: a */
        public OPTrace mo231592a() {
            return this.f167186a;
        }

        /* renamed from: b */
        public boolean mo231595b() {
            return this.f167187b;
        }

        /* renamed from: a */
        public void mo231593a(OPTrace oPTrace) {
            this.f167186a = oPTrace;
        }

        /* renamed from: a */
        public void mo231594a(boolean z) {
            this.f167187b = z;
        }
    }

    @Jscore(jsfunctionname = "onNetworkStatusChange")
    public void onNetworkStatusChange() {
        C67053q.m261324a(this.appContext);
    }

    @Jscore(jsfunctionname = "id")
    public int id() {
        if (V8ShareManager.f167231a.mo231625a()) {
            return 0;
        }
        return -1;
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void release() {
        getJsMsgHandler().sendEmptyMessage(2);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void removeHandler() {
        if (this.mJsTimerHanlder != null) {
            this.mJsTimerHanlder.removeCallbacksAndMessages(null);
        }
    }

    private void initBlockJsInvokeNativeApiFeature() {
        AppbrandApplicationImpl.getInst(this.appContext).getForeBackgroundManager().mo231958a(new C66420d.C66427b() {
            /* class com.tt.miniapp.jsbridge.JsBridge.C662222 */

            @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
            /* renamed from: b */
            public void mo88041b() {
                ILogger d = C25529d.m91161d(JsBridge.this.appContext);
                if (d != null) {
                    d.mo92224i("tma_JsBridge", "onBackground");
                } else {
                    AppBrandLogger.m52830i("tma_JsBridge", "onBackground");
                }
                if (!JsBridge.this.mIsBlockingJsInvokeNativeApi) {
                    synchronized (JsBridge.this) {
                        JsBridge.this.mIsBlockingJsInvokeNativeApi = true;
                    }
                }
                if (d != null) {
                    d.mo92224i("tma_JsBridge", "mIsBlockingJsInvokeNativeApi", Boolean.valueOf(JsBridge.this.mIsBlockingJsInvokeNativeApi));
                    return;
                }
                AppBrandLogger.m52830i("tma_JsBridge", "mIsBlockingJsInvokeNativeApi", Boolean.valueOf(JsBridge.this.mIsBlockingJsInvokeNativeApi));
            }

            @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
            /* renamed from: a */
            public void mo88040a() {
                ILogger d = C25529d.m91161d(JsBridge.this.appContext);
                if (d != null) {
                    d.mo92224i("tma_JsBridge", "onForeground");
                } else {
                    AppBrandLogger.m52830i("tma_JsBridge", "onForeground");
                }
                if (JsBridge.this.mIsBlockingJsInvokeNativeApi) {
                    synchronized (JsBridge.this) {
                        JsBridge.this.mIsBlockingJsInvokeNativeApi = false;
                        for (C66254h hVar : JsBridge.this.mBlockNativeApiEventList) {
                            JsBridge.this.asyncJsInvoke(hVar);
                        }
                        JsBridge.this.mBlockNativeApiEventList.clear();
                    }
                }
                if (d != null) {
                    d.mo92224i("tma_JsBridge", "mIsBlockingJsInvokeNativeApi", Boolean.valueOf(JsBridge.this.mIsBlockingJsInvokeNativeApi));
                    return;
                }
                AppBrandLogger.m52830i("tma_JsBridge", "mIsBlockingJsInvokeNativeApi", Boolean.valueOf(JsBridge.this.mIsBlockingJsInvokeNativeApi));
            }
        });
    }

    private HandlerC66234e getJsMsgHandler() {
        if (this.mJsMsgHandler == null) {
            synchronized (HandlerC66234e.class) {
                if (this.mJsMsgHandler == null) {
                    this.mJsMsgHandler = new HandlerC66234e(this.mJsMsgHandlerThread.getLooper(), this.appContext);
                }
            }
        }
        return this.mJsMsgHandler;
    }

    private HandlerC66251g getJsTimerHandler() {
        if (this.mJsTimerHanlder == null) {
            synchronized (HandlerC66251g.class) {
                if (this.mJsTimerHanlder == null) {
                    HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("jstimer#");
                    new_android_os_HandlerThread_by_knot.start();
                    this.mJsTimerHanlder = new HandlerC66251g(new_android_os_HandlerThread_by_knot.getLooper(), this.mJsRuntime);
                }
            }
        }
        return this.mJsTimerHanlder;
    }

    @Jscore(jsfunctionname = "onDocumentReady")
    public void onDocumentReady() {
        ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            d.mo92224i("tma_JsBridge", "StartApp JsBridge_onDocumentReady");
        } else {
            AppBrandLogger.m52830i("StartApp", "JsBridge_onDocumentReady");
        }
        LarkInnerEventHelper.mpJsCoreLoadDomReady(this.appContext);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void onHide() {
        ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            d.mo92224i("tma_JsBridge", "onHide");
        } else {
            AppBrandLogger.m52830i("tma_JsBridge", "onHide");
        }
        if (this.mJsTimerHanlder != null) {
            this.mJsTimerHanlder.mo231622b();
        }
        C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(this.appContext).getRouteEventCtrl();
        if (routeEventCtrl != null) {
            routeEventCtrl.mo232875d();
        }
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void onShow() {
        ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            d.mo92224i("tma_JsBridge", "onShow");
        } else {
            AppBrandLogger.m52830i("tma_JsBridge", "onShow");
        }
        if (this.mJsTimerHanlder != null) {
            this.mJsTimerHanlder.mo231619a();
        }
        C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(this.appContext).getRouteEventCtrl();
        if (routeEventCtrl != null) {
            routeEventCtrl.mo232874c();
        }
    }

    private boolean interceptByBackground(String str) {
        if (!this.mInterceptEventListWhenBackgroundOverLimitTime.contains(str) || !AppbrandApplicationImpl.getInst(this.appContext).getForeBackgroundManager().mo231963e()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.jsbridge.JsBridge$d */
    public class C66233d implements AbstractC65805h {

        /* renamed from: b */
        private int f167181b;

        /* renamed from: c */
        private String f167182c;

        /* renamed from: d */
        private OPTrace f167183d;

        /* renamed from: e */
        private long f167184e;

        @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h
        public void callback(ApiCallResult apiCallResult) {
            OPMonitorUtils.monitorOriginResult(JsBridge.this.appContext, this.f167182c, this.f167183d, apiCallResult, this.f167184e);
            JsBridge.this.mApiHandlerCallBack.callback(this.f167181b, apiCallResult.toString());
            OPMonitorUtils.monitorOriginResultCallback(JsBridge.this.appContext, this.f167182c, this.f167183d, apiCallResult, false);
        }

        public C66233d(int i, String str, OPTrace oPTrace, long j) {
            this.f167181b = i;
            this.f167182c = str;
            this.f167183d = oPTrace;
            this.f167184e = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.jsbridge.JsBridge$e */
    public static class HandlerC66234e extends Handler {

        /* renamed from: a */
        private IAppContext f167185a;

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                C66254h hVar = (C66254h) message.obj;
                Runnable asyncApiRunnable = JsBridge.getAsyncApiRunnable(hVar, this.f167185a);
                if (asyncApiRunnable != null) {
                    asyncApiRunnable.run();
                } else {
                    new C66713b(hVar, this.f167185a).mo232443a();
                }
            } else if (i == 2) {
                AbstractC65746a.m257747a(this.f167185a).mo230379b();
            }
        }

        private HandlerC66234e(Looper looper, IAppContext iAppContext) {
            super(looper);
            this.f167185a = iAppContext;
        }
    }

    @Jscore(jsfunctionname = "publish2")
    public String publish2(JsObject jsObject) {
        String str = "";
        if (jsObject == null) {
            return str;
        }
        String string = jsObject.getString(HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        JsObject object = jsObject.getObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            JSONArray optJSONArray = new JSONObject(jsObject.getObject("extra").toJSON()).optJSONArray("webviewIds");
            if (optJSONArray != null) {
                str = optJSONArray.toString();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return executePublish(string, object.toJSON(), str);
    }

    private void showTestToast(String str) {
        if (!new ArrayList<String>() {
            /* class com.tt.miniapp.jsbridge.JsBridge.C662277 */

            {
                add("navigateTo");
                add("redirectTo");
                add("reLaunch");
                add("switchTab");
                add("navigateBack");
            }
        }.contains(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("title", "This API is not adapter Plugin，eventName:" + str + " isNewContainer:" + C25529d.m91158c(this.appContext));
            } catch (JSONException e) {
                AppBrandLogger.m52829e("tma_JsBridge", "JSONException", e);
            }
            this.appContext.sendEvent(new LKEvent.C25888a().mo92168a("showToast").mo92169a(jSONObject).mo92171a());
        }
    }

    public void asyncJsInvoke(C66254h hVar) {
        String str;
        ILogger d = C25529d.m91161d(this.appContext);
        if (!TextUtils.isEmpty(hVar.f167222a)) {
            str = hVar.f167222a;
        } else if (hVar.f167228g != null) {
            str = hVar.f167228g.mo92146m();
        } else {
            str = "";
        }
        getJsMsgHandler().obtainMessage(1, hVar).sendToTarget();
        if (d != null) {
            d.mo92224i("tma_JsBridge", "api: " + str + " -> dispatch by handler");
        }
    }

    @Jscore(jsfunctionname = "invokeNative")
    public JsObject invokeNative(JsObject jsObject) {
        int i;
        if (jsObject == null) {
            return null;
        }
        String str = "";
        try {
            JSONObject optJSONObject = new JSONObject(jsObject.toJSON()).optJSONObject("extra");
            if (optJSONObject != null) {
                str = optJSONObject.toString();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String string = jsObject.getString(HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        JsObject object = jsObject.getObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            i = Integer.parseInt(jsObject.getString("callbackID"));
        } catch (NumberFormatException e2) {
            AppBrandLogger.m52829e("tma_JsBridge", e2);
            i = Integer.MIN_VALUE;
        }
        if (C66718d.m260515a(string, new C66717c(object)) != null || this.ARRAY_BUFFER_CALL_EVENT.contains(string)) {
            return executeCall(string, object, i, str, true);
        }
        String excuteInvoke = excuteInvoke(string, object.toJSON(), i, str, true);
        if (TextUtils.isEmpty(excuteInvoke)) {
            AppBrandLogger.m52830i("tma_JsBridge", "invokeResponse is null, is async");
            return null;
        }
        JsObject createObject = jsObject.getScopedContext().createObject();
        createObject.set("sync_response", excuteInvoke);
        return createObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.jsbridge.JsBridge$c */
    public class C66232c implements AbstractC65806i {

        /* renamed from: b */
        private OPTrace f167179b;

        public C66232c(OPTrace oPTrace) {
            this.f167179b = oPTrace;
        }

        @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i
        public void executeAsyncApiHandle(String str, Runnable runnable) {
            C66254h hVar = new C66254h(str, runnable, this.f167179b, false);
            if (!JsBridge.this.mIsBlockingJsInvokeNativeApi || JsBridge.this.mNotBlockAsyncApiListWhenBackground.contains(str)) {
                JsBridge.this.asyncJsInvoke(hVar);
                return;
            }
            ILogger d = C25529d.m91161d(JsBridge.this.appContext);
            if (d != null) {
                d.mo92224i("tma_JsBridge", "api ", str, "is block....");
            } else {
                AppBrandLogger.m52830i("tma_JsBridge", "api ", str, "is block....");
            }
            JsBridge.this.mBlockNativeApiEventList.add(hVar);
        }
    }

    public /* synthetic */ void lambda$usePluginSystemSendEvent$1$JsBridge(LKEvent lKEvent, boolean z) {
        if (!z) {
            OPMonitorUtils.monitorNativeStart(this.appContext, lKEvent, true);
        }
    }

    public static Runnable getAsyncApiRunnable(C66254h hVar, IAppContext iAppContext) {
        if (hVar == null) {
            C67509b.m262589a("mp_special_error", "nativeApiEvent is null", "", iAppContext);
            return null;
        }
        LKEvent lKEvent = hVar.f167228g;
        if (lKEvent != null) {
            OPMonitorUtils.monitorNativeStart(iAppContext, lKEvent, hVar.f167229h);
        } else {
            OPTrace oPTrace = hVar.f167230i;
            String str = hVar.f167222a;
            if (oPTrace != null && !TextUtils.isEmpty(str)) {
                OPMonitorUtils.monitorOriginNativeStart(iAppContext, str, oPTrace, hVar.f167229h);
            }
        }
        return hVar.f167227f;
    }

    @Jscore(jsfunctionname = "clearTimer")
    public void clearTimer(String str, int i) {
        ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            d.mo92224i("tma_JsBridge", "clearTimer timerType ", str, " timerId ", Integer.valueOf(i));
        } else {
            AppBrandLogger.m52830i("tma_JsBridge", "clearTimer timerType ", str, " timerId ", Integer.valueOf(i));
        }
        getJsTimerHandler().mo231620a(str, i);
    }

    public JsBridge(JsRuntime jsRuntime, IAppContext iAppContext) {
        this.mJsRuntime = jsRuntime;
        this.appContext = iAppContext;
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("jsmsg#");
        this.mJsMsgHandlerThread = new_android_os_HandlerThread_by_knot;
        new_android_os_HandlerThread_by_knot.start();
        boolean featureGating = HostDependManager.getInst().getFeatureGating("openplatform.disable.plugin.forgadget");
        this.mDisableUseNewPlugin = featureGating;
        if (!featureGating && !C25529d.m91166g(iAppContext)) {
            C25529d.m91151b(iAppContext);
        }
        initBlockJsInvokeNativeApiFeature();
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore(final String str, final String str2) {
        if (str2 != null && str2.contains("fail")) {
            monitorInvokeApiFailed(str, "subscribeHandler2", "api internal fail", 1);
        }
        final ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            d.mo92224i("tma_JsBridge", "event:" + str);
            d.mo92222d("tma_JsBridge", "data ", str2);
        } else {
            AppBrandLogger.m52830i("tma_JsBridge", "event:" + str);
            AppBrandLogger.m52828d("tma_JsBridge", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
        }
        if (!C25529d.m91154b(this.appContext, str)) {
            AppBrandLogger.m52828d("tma_JsBridge", "publishToServer event ", str, " data ", str2);
            this.mJsRuntime.executeInJsThread(new JsContext.ScopeCallback() {
                /* class com.tt.miniapp.jsbridge.JsBridge.C662255 */

                @Override // com.he.jsbinding.JsContext.ScopeCallback
                public void run(JsScopedContext jsScopedContext) {
                    try {
                        if (BridgeUniteHelper.f166701a.mo231125a()) {
                            JsBridge.this.callNewMethod(jsScopedContext, str, str2, Integer.MIN_VALUE);
                            AppBrandLogger.m52828d("tma_JsBridge", "sendMsgToJsCore use new bridge");
                            return;
                        }
                        JsObject object = jsScopedContext.global().getObject("ttJSBridge");
                        jsScopedContext.push(str);
                        jsScopedContext.push(str2);
                        object.callMethod("subscribeHandler", 2);
                    } catch (Exception e) {
                        ILogger aVar = d;
                        if (aVar != null) {
                            aVar.mo92223e("tma_JsBridge", "sendMsgToJsCoreCall2 fail", e);
                        } else {
                            DebugUtil.outputError("tma_JsBridge", "sendMsgToJsCoreCall2 fail", e);
                        }
                        JsBridge.this.monitorInvokeApiFailed(str, "subscribeHandler", Log.getStackTraceString(e), 1);
                    }
                }
            });
        } else if (d != null) {
            d.mo92224i("tma_JsBridge", "intercept:" + str);
        } else {
            AppBrandLogger.m52830i("tma_JsBridge", "intercept:" + str);
        }
    }

    @Jscore(jsfunctionname = "publish")
    public String publish(String str, String str2, String str3) {
        return executePublish(str, str2, str3);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore(String str, String str2, int i) {
        sendMsgToJsCore(str, str2, i, false);
    }

    static /* synthetic */ JsObject lambda$invokeApi$4(LKBasePluginResult lKBasePluginResult, String str, JsScopedContext jsScopedContext) {
        return (JsObject) C25527b.m91120a(lKBasePluginResult, new C66717c(jsScopedContext), str);
    }

    static /* synthetic */ JsObject lambda$invokeApi$5(String str, AbstractC25903n nVar, JsScopedContext jsScopedContext) {
        return (JsObject) C66718d.m260516a(str, nVar, new C66717c(jsScopedContext));
    }

    @Jscore(jsfunctionname = "call")
    public JsObject call(String str, JsObject jsObject, int i) {
        return executeCall(str, jsObject, i, "", false);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    @Jscore(jsfunctionname = "invoke")
    public String invoke(String str, String str2, int i) {
        return excuteInvoke(str, str2, i, "", false);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void invokeApi(String str, AbstractC25903n nVar, int i) {
        invokeArrayBufferApi(str, i, new AbstractC66231b(str, nVar) {
            /* class com.tt.miniapp.jsbridge.$$Lambda$JsBridge$vvbHnV3yR8UnrQiOcaKqDDL3pA */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ AbstractC25903n f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.tt.miniapp.jsbridge.JsBridge.AbstractC66231b
            public final JsObject generate(JsScopedContext jsScopedContext) {
                return JsBridge.lambda$invokeApi$5(this.f$0, this.f$1, jsScopedContext);
            }
        });
    }

    private void asyncJsInvoke(String str, String str2, int i) {
        C66254h hVar = new C66254h(str, str2, i, this.mApiHandlerCallBack);
        if (!this.mIsBlockingJsInvokeNativeApi || this.mNotBlockAsyncApiListWhenBackground.contains(str)) {
            asyncJsInvoke(hVar);
        } else {
            this.mBlockNativeApiEventList.add(hVar);
        }
    }

    /* access modifiers changed from: protected */
    public void asyncJsInvokeV2(String str, IApiInputParam iApiInputParam, int i) {
        C66254h hVar = new C66254h(str, iApiInputParam, i);
        if (!this.mIsBlockingJsInvokeNativeApi || this.mNotBlockAsyncApiListWhenBackground.contains(str)) {
            asyncJsInvoke(hVar);
        } else {
            this.mBlockNativeApiEventList.add(hVar);
        }
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void invokeApi(String str, LKBasePluginResult lKBasePluginResult, int i) {
        invokeArrayBufferApi(str, i, new AbstractC66231b(str) {
            /* class com.tt.miniapp.jsbridge.$$Lambda$JsBridge$fp8N2mOqLtI5vwPkIsZiJ9jx04 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.tt.miniapp.jsbridge.JsBridge.AbstractC66231b
            public final JsObject generate(JsScopedContext jsScopedContext) {
                return JsBridge.lambda$invokeApi$4(LKBasePluginResult.this, this.f$1, jsScopedContext);
            }
        });
    }

    private void invokeArrayBufferApi(String str, int i, AbstractC66231b bVar) {
        ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            d.mo92224i("tma_JsBridge", "invokeApi eventName：" + str);
        }
        this.mJsRuntime.executeInJsThread(new JsContext.ScopeCallback(bVar, str, i, d) {
            /* class com.tt.miniapp.jsbridge.$$Lambda$JsBridge$pOeVsB7cx8AEMhT_YSrP061SHc */
            public final /* synthetic */ JsBridge.AbstractC66231b f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ ILogger f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public final void run(JsScopedContext jsScopedContext) {
                JsBridge.this.lambda$invokeArrayBufferApi$3$JsBridge(this.f$1, this.f$2, this.f$3, this.f$4, jsScopedContext);
            }
        });
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore2(final String str, final IApiOutputParam iApiOutputParam, boolean z) {
        final ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            d.mo92224i("tma_JsBridge", "sendMsgToJsCore2 event:" + str);
        }
        this.mJsRuntime.executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.miniapp.jsbridge.JsBridge.C662299 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                try {
                    JsObject jsObject = (JsObject) C66718d.m260516a(str, iApiOutputParam, new C66717c(jsScopedContext));
                    if (jsObject != null) {
                        String string = jsObject.getString(ApiHandler.API_CALLBACK_ERRMSG);
                        if (!TextUtils.isEmpty(string) && string.contains("fail")) {
                            JsBridge.this.monitorInvokeApiFailed(str, "subscribeHandler2", string, 2);
                        }
                    }
                    JsObject object = jsScopedContext.global().getObject("ttJSBridge");
                    jsScopedContext.push(str);
                    jsScopedContext.push(jsObject);
                    object.callMethod("subscribeHandler", 2);
                } catch (Exception e) {
                    ILogger aVar = d;
                    if (aVar != null) {
                        aVar.mo92223e("tma_JsBridge", "Exception", e);
                    } else {
                        AppBrandLogger.m52829e("tma_JsBridge", e);
                    }
                    JsBridge.this.monitorInvokeApiFailed(str, "subscribeHandler2", Log.getStackTraceString(e), 2);
                }
            }
        }, z);
    }

    public void invokeHandlerByLarkBridge(JsScopedContext jsScopedContext, int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.appContext).getRenderViewManager();
            String str2 = "failure";
            if (renderViewManager != null) {
                str2 = renderViewManager.getCallBackType(str);
            }
            JsObject createObject = jsScopedContext.createObject();
            createObject.set("callbackID", i);
            createObject.set(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
            createObject.set("callbackType", str2);
            createObject.set("extra", jSONObject.toString());
            JsObject object = jsScopedContext.global().getObject("LarkWebViewJavaScriptBridge");
            jsScopedContext.push(createObject);
            object.callMethod("nativeCallBack", 1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$usePluginSystemSendEvent$2$JsBridge(LKEvent lKEvent, String str, Runnable runnable) {
        C66254h hVar = new C66254h(runnable, lKEvent, true);
        ILogger a = C25529d.m91135a(lKEvent);
        if (!this.mIsBlockingJsInvokeNativeApi || this.mNotBlockAsyncApiListWhenBackground.contains(str)) {
            asyncJsInvoke(hVar);
            return;
        }
        if (a != null) {
            a.mo92224i("tma_JsBridge", "is blocking api:" + this.mIsBlockingJsInvokeNativeApi + " event:" + str);
        } else {
            AppBrandLogger.m52830i("tma_JsBridge", "is blocking api:" + this.mIsBlockingJsInvokeNativeApi + " event:" + str);
        }
        this.mBlockNativeApiEventList.add(hVar);
    }

    @Jscore(jsfunctionname = "setTimer")
    public void setTimer(String str, int i, long j) {
        ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            d.mo92224i("tma_JsBridge", "setTimer timerType ", str, " timerId ", Integer.valueOf(i), "time ", Long.valueOf(j));
        } else {
            AppBrandLogger.m52830i("tma_JsBridge", "setTimer timerType ", str, " timerId ", Integer.valueOf(i), "time ", Long.valueOf(j));
        }
        getJsTimerHandler().mo231621a(str, i, j);
    }

    private C66235f generateTraceFromJSSDK(String str, String str2, boolean z) {
        OPTrace oPTrace;
        boolean z2 = false;
        if (z) {
            try {
                String optString = new JSONObject(str2).optString("api_trace");
                if (!TextUtils.isEmpty(optString)) {
                    oPTrace = OPTrace.deserialize(optString, str).subTrace();
                } else {
                    AppBrandLogger.m52829e("tma_JsBridge", "get empty trace id from jssdk, extra: " + str2);
                    oPTrace = null;
                    z2 = true;
                }
            } catch (JSONException unused) {
                AppBrandLogger.m52829e("tma_JsBridge", "parse json error, invalid extra: " + str2);
            }
        } else {
            oPTrace = null;
        }
        if (oPTrace == null) {
            if (ProcessUtil.isMiniappProcess()) {
                oPTrace = AppbrandContext.getInst().getTracing().subTrace(str);
            } else {
                oPTrace = this.appContext.getTracingSpan().subTrace(str);
            }
        }
        C66235f fVar = new C66235f();
        fVar.mo231593a(oPTrace);
        fVar.mo231594a(z2);
        return fVar;
    }

    private String executePublish(String str, String str2, String str3) {
        int i;
        int i2;
        ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            Object[] objArr = new Object[6];
            objArr[0] = "event ";
            objArr[1] = str;
            objArr[2] = " param ";
            if (str2 == null) {
                i2 = 0;
            } else {
                i2 = str2.length();
            }
            objArr[3] = Integer.valueOf(i2);
            objArr[4] = " webviewIds ";
            objArr[5] = str3;
            d.mo92224i("tma_JsBridge", objArr);
        } else {
            Object[] objArr2 = new Object[6];
            objArr2[0] = "event ";
            objArr2[1] = str;
            objArr2[2] = " param ";
            if (str2 == null) {
                i = 0;
            } else {
                i = str2.length();
            }
            objArr2[3] = Integer.valueOf(i);
            objArr2[4] = " webviewIds ";
            objArr2[5] = str3;
            AppBrandLogger.m52830i("tma_JsBridge", objArr2);
        }
        if (!str2.contains("appDataChange") || !this.firstSetData) {
            try {
                JSONArray jSONArray = new JSONArray(str3);
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.appContext).getRenderViewManager();
                    if (renderViewManager != null) {
                        renderViewManager.publish(jSONArray.getInt(i3), str, str2);
                    } else if (d != null) {
                        d.mo92225w("tma_JsBridge", "publish webViewManager == null ");
                    } else {
                        AppBrandLogger.m52831w("tma_JsBridge", "publish webViewManager == null ");
                    }
                }
                return null;
            } catch (Exception e) {
                if (d != null) {
                    d.mo92223e("tma_JsBridge", "Exception", e);
                    return null;
                }
                AppBrandLogger.stacktrace(6, "tma_JsBridge", e.getStackTrace());
                return null;
            }
        } else {
            if (d != null) {
                d.mo92224i("tma_JsBridge", "startup first setData");
            } else {
                AppBrandLogger.m52830i("startup first setData", new Object[0]);
            }
            this.firstSetData = false;
            try {
                JSONArray jSONArray2 = new JSONArray(str3);
                int length2 = jSONArray2.length();
                for (int i4 = 0; i4 < length2; i4++) {
                    RenderViewManager renderViewManager2 = AppbrandApplicationImpl.getInst(this.appContext).getRenderViewManager();
                    if (renderViewManager2 != null) {
                        renderViewManager2.publishFirst(jSONArray2.getInt(i4), str, str2, this.appContext);
                    } else if (d != null) {
                        d.mo92225w("tma_JsBridge", "publish webViewManager == null ");
                    } else {
                        AppBrandLogger.m52831w("tma_JsBridge", "publish webViewManager == null ");
                    }
                }
                return null;
            } catch (Exception e2) {
                if (d != null) {
                    d.mo92223e("tma_JsBridge", "Exception", e2);
                    return null;
                }
                AppBrandLogger.stacktrace(6, "tma_JsBridge", e2.getStackTrace());
                return null;
            }
        }
    }

    private LKBasePluginResult usePluginSystemSendEvent(final String str, final LKEvent lKEvent, final OPTrace oPTrace, final long j) {
        OPMonitorUtils.monitorNativePMStart(this.appContext, lKEvent);
        lKEvent.mo92121a((AbstractC25893d) new AbstractC25893d(str, oPTrace, j, lKEvent) {
            /* class com.tt.miniapp.jsbridge.$$Lambda$JsBridge$2BwZj0LkqirHIkjn2QCZkhPQCw */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ OPTrace f$2;
            public final /* synthetic */ long f$3;
            public final /* synthetic */ LKEvent f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25893d
            public final void callback(int i, LKPluginHandleResult lKPluginHandleResult) {
                JsBridge.this.lambda$usePluginSystemSendEvent$0$JsBridge(this.f$1, this.f$2, this.f$3, this.f$4, i, lKPluginHandleResult);
            }
        });
        lKEvent.mo92123a((AbstractC25898i) new AbstractC25898i(lKEvent) {
            /* class com.tt.miniapp.jsbridge.$$Lambda$JsBridge$gSrpejqHsbYlFQJzu_LRC66lY */
            public final /* synthetic */ LKEvent f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25898i
            public final void onEventHandleStart(boolean z) {
                JsBridge.this.lambda$usePluginSystemSendEvent$1$JsBridge(this.f$1, z);
            }
        });
        lKEvent.mo92119a((AbstractC25890a) new AbstractC25890a(lKEvent) {
            /* class com.tt.miniapp.jsbridge.$$Lambda$JsBridge$yd3Nm6ID5gx7Z8z7RTsTlZ_tIEw */
            public final /* synthetic */ LKEvent f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25890a
            public final void executeAsyncApiHandle(String str, Runnable runnable) {
                JsBridge.this.lambda$usePluginSystemSendEvent$2$JsBridge(this.f$1, str, runnable);
            }
        });
        lKEvent.mo92122a((AbstractC25894e) new AbstractC25894e() {
            /* class com.tt.miniapp.jsbridge.JsBridge.C662288 */

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
            /* renamed from: a */
            public void mo48104a(int i, JSONObject jSONObject) {
                String str;
                ILogger a = C25529d.m91135a(lKEvent);
                a.mo92224i("tma_JsBridge", "onSuccess eventId:" + i);
                if (JsBridge.this.mApiHandlerCallBack != null) {
                    Object remove = jSONObject.remove("inner_tracing_id");
                    if (remove instanceof String) {
                        str = (String) remove;
                    } else {
                        str = null;
                    }
                    OPMonitorUtils.monitorPMResult(JsBridge.this.appContext, lKEvent, j, "ok", C25906a.f64071a.f64115H, C25906a.f64071a.f64115H, C25906a.f64071a.f64117J, C25906a.f64071a.f64117J, false);
                    AbstractC67620f fVar = JsBridge.this.mApiHandlerCallBack;
                    String str2 = str;
                    fVar.mo231157a(new C66230a(i, str2, ApiCallResult.Builder.createOk(str2).responseData(jSONObject).build().toString(), str));
                    OPMonitorUtils.monitorResultCallback(JsBridge.this.appContext, str, oPTrace, "ok", C25906a.f64071a.f64115H, C25906a.f64071a.f64115H, C25906a.f64071a.f64117J, C25906a.f64071a.f64117J, false);
                }
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
            /* renamed from: a */
            public void mo48103a(int i, int i2, JSONObject jSONObject) {
                String str;
                ILogger a = C25529d.m91135a(lKEvent);
                a.mo92224i("tma_JsBridge", "eventName:" + str + " errorCode:" + i2);
                if (JsBridge.this.mApiHandlerCallBack != null) {
                    Object remove = jSONObject.remove("inner_tracing_id");
                    if (remove instanceof String) {
                        str = (String) remove;
                    } else {
                        str = null;
                    }
                    int a2 = C25529d.m91125a(i2, jSONObject);
                    String optString = jSONObject.optString(ApiHandler.API_CALLBACK_ERRMSG);
                    String a3 = C25529d.m91141a(jSONObject);
                    OPMonitorUtils.monitorPMResult(JsBridge.this.appContext, lKEvent, j, "fail", i2, a2, optString, a3, false);
                    JsBridge.this.mApiHandlerCallBack.mo231157a(new C66230a(i, str, ApiCallResult.Builder.createFail(str).errorCode(i2).responseData(jSONObject).build().toString(), str));
                    OPMonitorUtils.monitorResultCallback(JsBridge.this.appContext, str, oPTrace, "fail", i2, a2, optString, a3, false);
                }
            }
        });
        LKBasePluginResult a = C25529d.m91131a(this.appContext, lKEvent);
        if (a != null) {
            return a;
        }
        ILogger a2 = C25529d.m91135a(lKEvent);
        a2.mo92224i("tma_JsBridge", "eventName:" + str + " PM No handle this event!");
        return lKEvent.mo92155v();
    }

    public void callNewMethod(JsScopedContext jsScopedContext, String str, String str2, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (i != Integer.MIN_VALUE) {
                jSONObject.put("webviewId", i);
            }
            JsObject createObject = jsScopedContext.createObject();
            createObject.set("callbackID", str);
            createObject.set(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
            createObject.set("callbackType", "continued");
            createObject.set("extra", jSONObject.toString());
            JsObject object = jsScopedContext.global().getObject("LarkWebViewJavaScriptBridge");
            jsScopedContext.push(createObject);
            object.callMethod("nativeCallBack", 1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void monitorInvokeApiFailed(String str, String str2, String str3, int i) {
        ILogger d = C25529d.m91161d(this.appContext);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventName", str);
            jSONObject.put("invokeMethodName", str2);
            jSONObject.put("errorMessage", str3);
            jSONObject.put("apiVersion", i);
            C67509b.m262587a("mp_invoke_api_failed", 7000, jSONObject, this.appContext);
            LarkInnerEventHelper.statusRate("mp_invoke_api_failed", 7000, jSONObject, this.appContext);
            if (d != null) {
                d.mo92223e("tma_JsBridge", "invoke api failed: " + jSONObject.toString());
                return;
            }
            AppBrandLogger.m52829e("tma_JsBridge", "invoke api failed: " + jSONObject.toString());
        } catch (Exception e) {
            if (d != null) {
                d.mo92223e("tma_JsBridge", "Exception", e);
                return;
            }
            AppBrandLogger.m52829e("tma_JsBridge", e);
        }
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void returnAsyncResult(final int i, String str, final String str2, final String str3) {
        if (!TextUtils.isEmpty(str2) && str2.contains("fail")) {
            monitorInvokeApiFailed("returnAsyncResult", "invokeHandler2", "api internal fail", 1);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            d.mo92224i("tma_JsBridge", "callbackId:" + i);
            d.mo92222d("tma_JsBridge", " data ", str2, "tracingId:" + str3);
        } else {
            AppBrandLogger.m52830i("tma_JsBridge", "callbackId:" + i);
            AppBrandLogger.m52828d("tma_JsBridge", " data ", str2, "tracingId:" + str3);
        }
        this.mJsRuntime.executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.miniapp.jsbridge.JsBridge.C662244 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                long currentTimeMillis = System.currentTimeMillis();
                ApiMonitorUtil.m91100a(str3, currentTimeMillis, currentTimeMillis - currentTimeMillis);
                try {
                    if (BridgeUniteHelper.f166701a.mo231125a()) {
                        JsBridge.this.invokeHandlerByLarkBridge(jsScopedContext, i, str2);
                        AppBrandLogger.m52828d("tma_JsBridge", "returnAsyncResult use new bridge");
                        return;
                    }
                    JsObject object = jsScopedContext.global().getObject("ttJSBridge");
                    jsScopedContext.push(i);
                    jsScopedContext.push(str2);
                    object.callMethod("invokeHandler", 2);
                } catch (Exception e) {
                    ILogger aVar = d;
                    if (aVar != null) {
                        aVar.mo92223e("tma_JsBridge", "returnAsyncResult fail", e);
                    } else {
                        DebugUtil.outputError("tma_JsBridge", "returnAsyncResult fail", e);
                    }
                    JsBridge.this.monitorInvokeApiFailed("returnAsyncResult", "invokeHandler2", Log.getStackTraceString(e), 1);
                }
            }
        }, false, false, this.mJsRuntime.getApiQuickCalledManager().mo231610a(this.appContext.getAppId(), str));
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore(final String str, final String str2, final int i, boolean z) {
        if (str2 != null && str2.contains("fail")) {
            monitorInvokeApiFailed(str, "subscribeHandler3", "api internal fail", 1);
        }
        final ILogger d = C25529d.m91161d(this.appContext);
        if (d != null) {
            d.mo92224i("tma_JsBridge", "event:" + str + " webview id:" + i + " forceFront:" + z);
            d.mo92222d("tma_JsBridge", "data ", str2);
        } else {
            AppBrandLogger.m52830i("tma_JsBridge", "event:" + str + " webview id:" + i + " forceFront:" + z);
            AppBrandLogger.m52828d("tma_JsBridge", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
        }
        if (C25529d.m91154b(this.appContext, str)) {
            AppBrandLogger.m52828d("tma_JsBridge", "shouldInterceptSendEventToJs ", str, " data ", str2);
            return;
        }
        AppBrandLogger.m52828d("tma_JsBridge", "publishToServer event ", str, " data ", str2);
        this.mJsRuntime.executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.miniapp.jsbridge.JsBridge.C662266 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                try {
                    JsObject object = jsScopedContext.global().getObject("ttJSBridge");
                    jsScopedContext.push(str);
                    jsScopedContext.push(str2);
                    jsScopedContext.push(i);
                    object.callMethod("subscribeHandler", 3);
                } catch (Exception e) {
                    ILogger aVar = d;
                    if (aVar != null) {
                        aVar.mo92223e("tma_JsBridge", "sendMsgToJsCoreCall3 fail", e);
                    } else {
                        DebugUtil.outputError("tma_JsBridge", "sendMsgToJsCoreCall3 fail", e);
                    }
                    JsBridge.this.monitorInvokeApiFailed(str, "subscribeHandler3", Log.getStackTraceString(e), 1);
                }
            }
        }, false, z);
    }

    private void monitorSyncResult(String str, OPTrace oPTrace, long j, LKEvent lKEvent, LKBasePluginResult lKBasePluginResult) {
        String str2;
        JSONObject e = lKBasePluginResult.mo92270e();
        e.remove("inner_tracing_id");
        int c = lKBasePluginResult.mo92267c();
        if (c == Integer.MIN_VALUE) {
            str2 = "ok";
        } else {
            str2 = "fail";
        }
        int a = C25529d.m91125a(c, e);
        String optString = e.optString(ApiHandler.API_CALLBACK_ERRMSG);
        String a2 = C25529d.m91141a(e);
        OPMonitorUtils.monitorPMResult(this.appContext, lKEvent, j, str2, c, a, optString, a2, true);
        OPMonitorUtils.monitorResultCallback(this.appContext, str, oPTrace, str2, c, a, optString, a2, true);
    }

    public /* synthetic */ void lambda$invokeArrayBufferApi$3$JsBridge(AbstractC66231b bVar, String str, int i, ILogger aVar, JsScopedContext jsScopedContext) {
        try {
            JsObject generate = bVar.generate(jsScopedContext);
            if (generate != null) {
                String string = generate.getString(ApiHandler.API_CALLBACK_ERRMSG);
                if (!TextUtils.isEmpty(string) && string.contains("fail")) {
                    monitorInvokeApiFailed(str, "callHandler", string, 2);
                }
            }
            JsObject object = jsScopedContext.global().getObject("ttJSBridge");
            jsScopedContext.push(i);
            jsScopedContext.push(generate);
            object.callMethod("callHandler", 2);
        } catch (Exception e) {
            if (aVar != null) {
                aVar.mo92223e("tma_JsBridge", "Exception", e);
            } else {
                DebugUtil.outputError("tma_JsBridge", "returnAsyncResult fail", e);
            }
            monitorInvokeApiFailed(str, "callHandler", Log.getStackTraceString(e), 2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0183 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0190 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.he.jsbinding.JsObject executeCall(java.lang.String r25, com.he.jsbinding.JsObject r26, int r27, java.lang.String r28, boolean r29) {
        /*
        // Method dump skipped, instructions count: 942
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.jsbridge.JsBridge.executeCall(java.lang.String, com.he.jsbinding.JsObject, int, java.lang.String, boolean):com.he.jsbinding.JsObject");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x0239 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String excuteInvoke(java.lang.String r24, java.lang.String r25, int r26, java.lang.String r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 1717
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.jsbridge.JsBridge.excuteInvoke(java.lang.String, java.lang.String, int, java.lang.String, boolean):java.lang.String");
    }

    public /* synthetic */ void lambda$usePluginSystemSendEvent$0$JsBridge(String str, OPTrace oPTrace, long j, LKEvent lKEvent, int i, LKPluginHandleResult lKPluginHandleResult) {
        monitorSyncResult(str, oPTrace, j, lKEvent, lKPluginHandleResult);
        invokeApi(str, lKPluginHandleResult, i);
    }
}
