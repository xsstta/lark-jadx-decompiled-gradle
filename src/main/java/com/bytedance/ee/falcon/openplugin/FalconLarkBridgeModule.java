package com.bytedance.ee.falcon.openplugin;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.falcon.openplugin.entity.FalconApiCallResult;
import com.bytedance.ee.falcon.openplugin.p605a.AbstractC12706b;
import com.bytedance.ee.falcon.openplugin.p605a.C12705a;
import com.bytedance.ee.falcon.openplugin.p606b.C12710a;
import com.bytedance.ee.falcon.openplugin.p606b.C12711b;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.bridge.ReadableMap;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.lark.falcon.engine.module.JavaBaseModule;
import com.lark.falcon.engine.module.anonotations.FalconMethod;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.component.openplatform.plugins.container.C25577b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import org.json.JSONException;
import org.json.JSONObject;

public class FalconLarkBridgeModule implements JavaBaseModule {

    /* renamed from: a */
    public AbstractC12706b f34001a = new C12705a();

    /* renamed from: b */
    private AbstractC25576a f34002b;

    /* renamed from: c */
    private Activity f34003c;

    /* renamed from: d */
    private AndroidFalconShellHolder f34004d;

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public /* synthetic */ String aliasName() {
        return JavaBaseModule.CC.$default$aliasName(this);
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public /* synthetic */ ReadableMap getConstants() {
        return JavaBaseModule.CC.$default$getConstants(this);
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public /* synthetic */ boolean hasAliasName() {
        return JavaBaseModule.CC.$default$hasAliasName(this);
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public String name() {
        return "Lark_Bridge";
    }

    /* renamed from: b */
    public AbstractC25576a mo48100b() {
        return this.f34002b;
    }

    /* renamed from: c */
    public void mo48101c() {
        this.f34002b = null;
        this.f34003c = null;
        this.f34001a = null;
    }

    /* renamed from: a */
    public AbstractC25904o mo48097a() {
        AbstractC25576a aVar = this.f34002b;
        if (aVar == null) {
            return null;
        }
        return aVar.mo92183u();
    }

    /* renamed from: a */
    public void mo48098a(AbstractC12706b bVar) {
        this.f34001a = bVar;
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public void initialize(AndroidFalconShellHolder androidFalconShellHolder) {
        this.f34004d = androidFalconShellHolder;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m52575a(JavaOnlyMap javaOnlyMap) {
        ((LarkWebViewJavaScriptBridge) this.f34004d.mo86077a(LarkWebViewJavaScriptBridge.class)).nativeCallBack(javaOnlyMap);
    }

    public FalconLarkBridgeModule(Activity activity) {
        this.f34003c = activity;
        this.f34002b = C25577b.m91292a(activity, null);
    }

    @FalconMethod
    public String invokeNative(String str) {
        boolean z;
        OPTrace oPTrace;
        String str2;
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("extra");
            Object opt = jSONObject.opt("callbackID");
            String str4 = null;
            if (optJSONObject2 != null) {
                str4 = optJSONObject2.optString("api_trace");
            }
            if (!TextUtils.isEmpty(str4)) {
                oPTrace = OPTrace.deserialize(str4, optString).subTrace();
                z = false;
            } else {
                Log.m165383e("FalconLarkBridgeModule", "get empty trace id from jssdk");
                oPTrace = this.f34001a.mo48106a(optString);
                z = true;
            }
            AbstractC12706b bVar = this.f34001a;
            AbstractC12706b.C12708a.C12709a a = AbstractC12706b.C12708a.C12709a.m52604a().mo48126a(optString).mo48124a(oPTrace).mo48128a(z);
            if (optJSONObject != null) {
                str2 = optJSONObject.toString();
            } else {
                str2 = "";
            }
            bVar.mo48107a(a.mo48132c(str2).mo48130b(optJSONObject2).mo48125a(opt).mo48131b());
            long currentTimeMillis = System.currentTimeMillis();
            LKEvent a2 = new LKEvent.C25888a().mo92168a(optString).mo92169a(optJSONObject).mo92162a(this.f34003c).mo92171a();
            this.f34001a.mo48109a(a2);
            a2.mo92119a((AbstractC25890a) new AbstractC25890a(a2) {
                /* class com.bytedance.ee.falcon.openplugin.$$Lambda$FalconLarkBridgeModule$RgbaTyRx24ce7qw_1VEeX_gojM8 */
                public final /* synthetic */ LKEvent f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25890a
                public final void executeAsyncApiHandle(String str, Runnable runnable) {
                    FalconLarkBridgeModule.lambda$RgbaTyRx24ce7qw_1VEeX_gojM8(FalconLarkBridgeModule.this, this.f$1, str, runnable);
                }
            });
            a2.mo92122a((AbstractC25894e) new C12704a(opt, a2, currentTimeMillis, oPTrace));
            LKBasePluginResult b = this.f34002b.mo92179b(a2);
            if (b == null || !b.mo92268d()) {
                return FalconApiCallResult.C12713a.m52624a(optString, C25906a.f64078h.f64117J, C25906a.f64078h.f64115H).mo48142a().toString();
            }
            if (b.mo92270e() != null) {
                if (b.mo92267c() == Integer.MIN_VALUE) {
                    str3 = "ok";
                } else {
                    str3 = "fail";
                }
                AbstractC12706b.C12708a b2 = AbstractC12706b.C12708a.C12709a.m52604a().mo48123a(a2).mo48129b(str3).mo48122a(currentTimeMillis).mo48121a(b.mo92267c()).mo48127a(b.mo92270e()).mo48124a(oPTrace).mo48131b();
                this.f34001a.mo48108a(b2, true, true);
                this.f34001a.mo48108a(b2, false, true);
            }
            return C12711b.m52620a(b, optString);
        } catch (JSONException e) {
            Log.m165384e("FalconLarkBridgeModule", "JSONException", e);
            return C12711b.f34032a;
        }
    }

    /* renamed from: com.bytedance.ee.falcon.openplugin.FalconLarkBridgeModule$a */
    private class C12704a implements AbstractC25894e {

        /* renamed from: b */
        private final Object f34006b;

        /* renamed from: c */
        private final LKEvent f34007c;

        /* renamed from: d */
        private final long f34008d;

        /* renamed from: e */
        private final OPTrace f34009e;

        @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
        /* renamed from: a */
        public void mo48104a(int i, JSONObject jSONObject) {
            AbstractC12706b.C12708a b = AbstractC12706b.C12708a.C12709a.m52604a().mo48123a(this.f34007c).mo48129b("ok").mo48122a(this.f34008d).mo48121a(C25906a.f64071a.f64115H).mo48127a(jSONObject).mo48124a(this.f34009e).mo48131b();
            FalconLarkBridgeModule.this.f34001a.mo48108a(b, true, false);
            FalconLarkBridgeModule.this.mo48099a(this.f34006b, jSONObject, "success");
            FalconLarkBridgeModule.this.f34001a.mo48108a(b, false, false);
        }

        @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
        /* renamed from: a */
        public void mo48103a(int i, int i2, JSONObject jSONObject) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("errorCode:");
            sb.append(i2);
            sb.append(" msg:");
            if (jSONObject != null) {
                str = jSONObject.toString();
            } else {
                str = "";
            }
            sb.append(str);
            Log.m165397w("FalconLarkBridgeModule", sb.toString());
            AbstractC12706b.C12708a b = AbstractC12706b.C12708a.C12709a.m52604a().mo48123a(this.f34007c).mo48129b("fail").mo48122a(this.f34008d).mo48121a(i2).mo48127a(jSONObject).mo48124a(this.f34009e).mo48131b();
            FalconLarkBridgeModule.this.f34001a.mo48108a(b, true, false);
            FalconLarkBridgeModule.this.mo48099a(this.f34006b, jSONObject, "failure");
            FalconLarkBridgeModule.this.f34001a.mo48108a(b, false, false);
        }

        public C12704a(Object obj, LKEvent lKEvent, long j, OPTrace oPTrace) {
            this.f34006b = obj;
            this.f34007c = lKEvent;
            this.f34008d = j;
            this.f34009e = oPTrace;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m52576a(LKEvent lKEvent, String str, Runnable runnable) {
        this.f34004d.mo86090b(runnable);
        this.f34001a.mo48110b(lKEvent);
    }

    /* renamed from: a */
    public void mo48099a(Object obj, JSONObject jSONObject, String str) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("callbackID", obj);
        if (jSONObject != null) {
            javaOnlyMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C12710a.m52618a(jSONObject));
        }
        javaOnlyMap.put("callbackType", str);
        this.f34004d.mo86083a(new Runnable(javaOnlyMap) {
            /* class com.bytedance.ee.falcon.openplugin.$$Lambda$FalconLarkBridgeModule$NqKkOrApJLPhc_0kwk638DS6Ok */
            public final /* synthetic */ JavaOnlyMap f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                FalconLarkBridgeModule.m270128lambda$NqKkOrApJLPhc_0kwk638DS6Ok(FalconLarkBridgeModule.this, this.f$1);
            }
        });
    }
}
