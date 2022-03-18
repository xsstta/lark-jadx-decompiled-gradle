package com.tt.miniapp.falcon.module;

import android.text.TextUtils;
import com.bytedance.ee.falcon.openplugin.p606b.C12710a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lark.falcon.engine.bridge.JavaOnlyArray;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.bridge.ReadableMap;
import com.lark.falcon.engine.bridge.ReadableType;
import com.lark.falcon.engine.bridge.WritableMap;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.lark.falcon.engine.module.JavaBaseModule;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.falcon.jsfunction.TimeFunction;
import com.tt.miniapp.falcon.p3286b.C66050a;
import com.tt.miniapp.falcon.p3286b.C66051b;
import com.tt.miniapp.jsbridge.C66237b;
import com.tt.miniapp.jsbridge.V8ShareManager;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.util.C67053q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class BridgeModule implements JavaBaseModule {

    /* renamed from: a */
    IAppContext f166767a;

    /* renamed from: b */
    C66237b f166768b;

    /* renamed from: c */
    boolean f166769c = true;

    /* renamed from: d */
    private AndroidFalconShellHolder f166770d;

    /* renamed from: e */
    private C66051b f166771e;

    /* renamed from: f */
    private List<String> f166772f = new ArrayList<String>() {
        /* class com.tt.miniapp.falcon.module.BridgeModule.C660661 */

        {
            add("createWorker");
        }
    };

    /* renamed from: g */
    private HashSet<Integer> f166773g = new HashSet<>();

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public String aliasName() {
        return "Lark_Bridge";
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public /* synthetic */ ReadableMap getConstants() {
        return JavaBaseModule.CC.$default$getConstants(this);
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public String name() {
        return "ttJSCore";
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public boolean hasAliasName() {
        return BridgeUniteHelper.f166701a.mo231125a();
    }

    public void onNetworkStatusChange() {
        C67053q.m261324a(this.f166767a);
    }

    public int id() {
        if (V8ShareManager.f167231a.mo231625a()) {
            return 0;
        }
        return -1;
    }

    public void onDocumentReady() {
        ILogger d = C25529d.m91161d(this.f166767a);
        if (d != null) {
            d.mo92224i("BridgeModule", "StartApp JsBridge_onDocumentReady");
        } else {
            AppBrandLogger.m52830i("StartApp", "JsBridge_onDocumentReady");
        }
        LarkInnerEventHelper.mpJsCoreLoadDomReady(this.f166767a);
    }

    @Override // com.lark.falcon.engine.module.JavaBaseModule
    public void initialize(AndroidFalconShellHolder androidFalconShellHolder) {
        Log.m165389i("BridgeModule", "initialize");
        this.f166770d = androidFalconShellHolder;
        this.f166771e = new C66051b(androidFalconShellHolder, this.f166767a, this.f166768b);
    }

    public WritableMap invokeNative(ReadableMap readableMap) {
        String str;
        int i;
        String str2;
        String str3;
        String str4 = "";
        if (readableMap == null) {
            return null;
        }
        try {
            if (!readableMap.hasKey("extra") || !(readableMap instanceof JavaOnlyMap)) {
                str3 = str4;
            } else {
                str3 = new JSONObject((JavaOnlyMap) readableMap.getMap("extra")).toString();
            }
            str = str3;
        } catch (Exception e) {
            e.printStackTrace();
            str = str4;
        }
        String string = readableMap.getString(HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        ReadableMap javaOnlyMap = new JavaOnlyMap();
        try {
            if (readableMap.getType(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == ReadableType.Map) {
                javaOnlyMap = readableMap.getMap(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                str4 = new JSONObject((JavaOnlyMap) javaOnlyMap).toString();
            } else if (readableMap.getType(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == ReadableType.String) {
                str4 = readableMap.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                javaOnlyMap = C12710a.m52618a(new JSONObject(str4));
            }
            i = Integer.parseInt(readableMap.getString("callbackID"));
            str2 = str4;
        } catch (Exception e2) {
            AppBrandLogger.m52829e("BridgeModule", e2);
            str2 = str4;
            i = Integer.MIN_VALUE;
        }
        JavaOnlyMap javaOnlyMap2 = (JavaOnlyMap) javaOnlyMap;
        if (C66718d.m260515a(string, new C66050a(javaOnlyMap2)) != null || this.f166772f.contains(string)) {
            return this.f166771e.mo231151a(string, (WritableMap) javaOnlyMap2, i, str, true);
        }
        String a = this.f166771e.mo231152a(string, str2, i, str, true);
        if (TextUtils.isEmpty(a)) {
            AppBrandLogger.m52830i("BridgeModule", "invokeResponse is null, is async");
            return null;
        }
        JavaOnlyMap javaOnlyMap3 = new JavaOnlyMap();
        javaOnlyMap3.putString("sync_response", a);
        return javaOnlyMap3;
    }

    public String publish2(ReadableMap readableMap) {
        String str;
        Exception e;
        JSONArray optJSONArray;
        String jSONArray;
        String str2 = "";
        if (readableMap == null) {
            return str2;
        }
        String string = readableMap.getString(HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        try {
            if (readableMap.getType(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == ReadableType.Map) {
                str = new JSONObject((JavaOnlyMap) readableMap.getMap(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).toString();
            } else if (readableMap.getType(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == ReadableType.String) {
                str = readableMap.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            } else {
                str = str2;
            }
            try {
                if (readableMap.getType("extra") != ReadableType.Map || !readableMap.getMap("extra").hasKey("webviewIds")) {
                    if (readableMap.getType("extra") == ReadableType.String && (optJSONArray = new JSONObject(readableMap.getString("extra")).optJSONArray("webviewIds")) != null) {
                        str2 = optJSONArray.toString();
                    }
                    return m258716a(string, str, str2);
                }
                ReadableMap map = readableMap.getMap("extra");
                if (map.getType("webviewIds") == ReadableType.String) {
                    jSONArray = map.getString("webviewIds");
                } else {
                    if (map.getType("webviewIds") == ReadableType.Array) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = ((JavaOnlyArray) map.getArray("webviewIds")).iterator();
                        while (it.hasNext()) {
                            jSONArray2.put(it.next());
                        }
                        jSONArray = jSONArray2.toString();
                    }
                    return m258716a(string, str, str2);
                }
                str2 = jSONArray;
                return m258716a(string, str, str2);
            } catch (Exception e2) {
                e = e2;
                AppBrandLogger.m52829e("BridgeModule", e);
                return m258716a(string, str, str2);
            }
        } catch (Exception e3) {
            e = e3;
            str = str2;
            AppBrandLogger.m52829e("BridgeModule", e);
            return m258716a(string, str, str2);
        }
    }

    /* renamed from: a */
    public void mo231180a(int i, long j) {
        this.f166770d.mo86084a(new Runnable(i, j) {
            /* class com.tt.miniapp.falcon.module.$$Lambda$BridgeModule$8hhnTjc2aLF6jabJxFTYECGpOQ */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                BridgeModule.m271547lambda$8hhnTjc2aLF6jabJxFTYECGpOQ(BridgeModule.this, this.f$1, this.f$2);
            }
        }, j);
    }

    public BridgeModule(IAppContext iAppContext, C66237b bVar) {
        this.f166767a = iAppContext;
        this.f166768b = bVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m258718b(int i, long j) {
        if (this.f166773g.contains(Integer.valueOf(i))) {
            ((TimeFunction) this.f166770d.mo86089b(TimeFunction.class)).nativeInvokeTimer("Interval", (long) i);
            mo231180a(i, j);
        }
    }

    public void clearTimer(String str, int i) {
        ILogger d = C25529d.m91161d(this.f166767a);
        if (d != null) {
            d.mo92224i("BridgeModule", "clearTimer timerType ", str, " timerId ", Integer.valueOf(i));
        } else {
            AppBrandLogger.m52830i("BridgeModule", "clearTimer timerType ", str, " timerId ", Integer.valueOf(i));
        }
        this.f166773g.remove(Integer.valueOf(i));
    }

    public String publish(String str, String str2, String str3) {
        return m258716a(str, str2, str3);
    }

    public WritableMap call(String str, ReadableMap readableMap, int i) {
        return this.f166771e.mo231151a(str, (WritableMap) ((JavaOnlyMap) readableMap), i, "", false);
    }

    public String invoke(String str, String str2, int i) {
        if (this.f166768b.mo231609a(str)) {
            return "";
        }
        return this.f166771e.mo231152a(str, str2, i, "", false);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m258717a(int i, String str, long j) {
        if (this.f166773g.contains(Integer.valueOf(i))) {
            ((TimeFunction) this.f166770d.mo86089b(TimeFunction.class)).nativeInvokeTimer(str, (long) i);
            if ("Timeout".equals(str)) {
                this.f166773g.remove(Integer.valueOf(i));
            } else if ("Interval".equals(str)) {
                mo231180a(i, j);
            }
        }
    }

    public void setTimer(String str, int i, long j) {
        ILogger d = C25529d.m91161d(this.f166767a);
        if (d != null) {
            d.mo92224i("BridgeModule", "setTimer timerType ", str, " timerId ", Integer.valueOf(i), "time ", Long.valueOf(j));
        } else {
            AppBrandLogger.m52830i("BridgeModule", "setTimer timerType ", str, " timerId ", Integer.valueOf(i), "time ", Long.valueOf(j));
        }
        this.f166773g.add(Integer.valueOf(i));
        this.f166770d.mo86084a(new Runnable(i, str, j) {
            /* class com.tt.miniapp.falcon.module.$$Lambda$BridgeModule$U8iPkxtCm9P9VP4yJiVUyAw_pJ8 */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                BridgeModule.lambda$U8iPkxtCm9P9VP4yJiVUyAw_pJ8(BridgeModule.this, this.f$1, this.f$2, this.f$3);
            }
        }, j);
    }

    /* renamed from: a */
    private String m258716a(String str, String str2, String str3) {
        int i;
        int i2;
        ILogger d = C25529d.m91161d(this.f166767a);
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
            d.mo92224i("BridgeModule", objArr);
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
            AppBrandLogger.m52830i("BridgeModule", objArr2);
        }
        if (!str2.contains("appDataChange") || !this.f166769c) {
            try {
                JSONArray jSONArray = new JSONArray(str3);
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.f166767a).getRenderViewManager();
                    if (renderViewManager != null) {
                        renderViewManager.publish(jSONArray.getInt(i3), str, str2);
                    } else if (d != null) {
                        d.mo92225w("BridgeModule", "publish webViewManager == null ");
                    } else {
                        AppBrandLogger.m52831w("BridgeModule", "publish webViewManager == null ");
                    }
                }
                return null;
            } catch (Exception e) {
                if (d != null) {
                    d.mo92223e("BridgeModule", "Exception", e);
                    return null;
                }
                AppBrandLogger.stacktrace(6, "BridgeModule", e.getStackTrace());
                return null;
            }
        } else {
            if (d != null) {
                d.mo92224i("BridgeModule", "startup first setData");
            } else {
                AppBrandLogger.m52830i("startup first setData", new Object[0]);
            }
            this.f166769c = false;
            try {
                JSONArray jSONArray2 = new JSONArray(str3);
                int length2 = jSONArray2.length();
                for (int i4 = 0; i4 < length2; i4++) {
                    RenderViewManager renderViewManager2 = AppbrandApplicationImpl.getInst(this.f166767a).getRenderViewManager();
                    if (renderViewManager2 != null) {
                        renderViewManager2.publishFirst(jSONArray2.getInt(i4), str, str2, this.f166767a);
                    } else if (d != null) {
                        d.mo92225w("BridgeModule", "publish webViewManager == null ");
                    } else {
                        AppBrandLogger.m52831w("BridgeModule", "publish webViewManager == null ");
                    }
                }
                return null;
            } catch (Exception e2) {
                if (d != null) {
                    d.mo92223e("BridgeModule", "Exception", e2);
                    return null;
                }
                AppBrandLogger.stacktrace(6, "BridgeModule", e2.getStackTrace());
                return null;
            }
        }
    }
}
