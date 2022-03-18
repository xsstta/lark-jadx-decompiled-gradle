package com.tt.miniapp.render;

import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkwebview.p677e.C13439c;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.C65887g;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.util.C67866g;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Queue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.render.b */
public class C66728b implements RenderViewManager.IRenderManager {

    /* renamed from: a */
    public static String f168459a = "tma_RenderWebViewManager";

    /* renamed from: b */
    private final RenderViewManager f168460b;

    /* renamed from: c */
    private SparseArray<WeakReference<C65887g>> f168461c = new SparseArray<>();

    public C66728b(RenderViewManager renderViewManager) {
        this.f168460b = renderViewManager;
    }

    /* renamed from: a */
    public WebView mo232562a(int i) {
        WeakReference<C65887g> weakReference;
        RenderViewManager.IRender render = this.f168460b.getRender(i);
        if (render != null) {
            Object realRenderView = render.getRealRenderView();
            if (realRenderView instanceof WebView) {
                return (WebView) realRenderView;
            }
        }
        SparseArray<WeakReference<C65887g>> sparseArray = this.f168461c;
        if (sparseArray == null || (weakReference = sparseArray.get(i)) == null || weakReference.get() == null) {
            return null;
        }
        return weakReference.get().getWebView();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m260541a(Queue queue, int i) {
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            mo232564b(i, (String) it.next(), false);
        }
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void addRenderComponent(int i, View view) {
        if (view instanceof C65887g) {
            C65887g gVar = (C65887g) view;
            if (gVar.getWebView() != null) {
                this.f168461c.put(gVar.getWebViewId(), new WeakReference<>(gVar));
            }
        }
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public synchronized void flushPendingJs(int i, Queue<String> queue) {
        AppbrandContext.getMainHandler().postAtFrontOfQueue(new Runnable(queue, i) {
            /* class com.tt.miniapp.render.$$Lambda$b$zb37POBm0Gjbp1UDrY0UTLignVU */
            public final /* synthetic */ Queue f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C66728b.lambda$zb37POBm0Gjbp1UDrY0UTLignVU(C66728b.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m260539a(int i, String str) {
        if (mo232562a(i) != null) {
            mo232562a(i).evaluateJavascript(str, null);
            return;
        }
        AppBrandLogger.m52829e(f168459a, "webView id:", Integer.valueOf(i), "does not exist");
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void olderInvokeHandler(final int i, final int i2, final String str) {
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.render.C66728b.RunnableC667324 */

            public void run() {
                WebView a = C66728b.this.mo232562a(i);
                if (a != null) {
                    String str = "ttJSBridge.invokeHandler('" + i2 + "'," + str + ")";
                    a.loadUrl("javascript:" + Uri.encode(str));
                }
            }
        });
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void publish(final int i, final String str, final String str2) {
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.render.C66728b.RunnableC667291 */

            public void run() {
                WebView a = C66728b.this.mo232562a(i);
                if (a != null) {
                    String str = "ttJSBridge.subscribeHandler('" + str + "'," + str2 + ")";
                    AppBrandLogger.m52828d(C66728b.f168459a, "publish " + str + " , " + a);
                    if (C24512a.m89385a(null)) {
                        C66728b.this.mo232563a(i, str, false);
                    } else {
                        C66728b.this.mo232564b(i, str, false);
                    }
                }
            }
        });
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void invokeHandler(int i, int i2, String str) {
        if (BridgeUniteHelper.f166701a.mo231125a()) {
            m260538a(i, i2, str);
            AppBrandLogger.m52828d(f168459a, "invokeHandler use new bridge");
            return;
        }
        olderInvokeHandler(i, i2, str);
    }

    /* renamed from: a */
    private void m260538a(int i, int i2, String str) {
        AppBrandLogger.m52828d(f168459a, "invokeHandlerByLarkBridge webviewId ", Integer.valueOf(i), " callbackId ", Integer.valueOf(i2), " msg ", str);
        AppbrandContext.getMainHandler().post(new Runnable(str, i2, i) {
            /* class com.tt.miniapp.render.$$Lambda$b$sJH8U4hSKazNj7MtA7MTyh26PI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C66728b.m271554lambda$sJH8U4hSKazNj7MtA7MTyh26PI(C66728b.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: b */
    public void mo232564b(int i, String str, boolean z) {
        $$Lambda$b$BIxIhciUtwg3ywtc7XKq38ArvQ r0 = new Runnable(i, str) {
            /* class com.tt.miniapp.render.$$Lambda$b$BIxIhciUtwg3ywtc7XKq38ArvQ */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C66728b.m271553lambda$BIxIhciUtwg3ywtc7XKq38ArvQ(C66728b.this, this.f$1, this.f$2);
            }
        };
        if (C13439c.m54613b()) {
            r0.run();
        } else if (z) {
            AppbrandContext.getMainHandler().postAtFrontOfQueue(r0);
        } else {
            AppbrandContext.getMainHandler().post(r0);
        }
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void publishDirectly(int i, String str, String str2) {
        WebView a = mo232562a(i);
        if (a != null) {
            String str3 = "ttJSBridge.subscribeHandler('" + str + "'," + str2 + ")";
            a.loadUrl("javascript:" + Uri.encode(str3));
        }
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void publishFrontOfQueue(final int i, final String str, final String str2) {
        if (C67866g.m264030a()) {
            WebView a = mo232562a(i);
            if (a != null) {
                String str3 = "ttJSBridge.subscribeHandler('" + str + "'," + str2 + ")";
                AppBrandLogger.m52828d(f168459a, "publish " + str3 + " , " + a);
                if (C24512a.m89385a(null)) {
                    mo232563a(i, str3, true);
                } else {
                    mo232564b(i, str3, true);
                }
            }
        } else {
            AppbrandContext.getMainHandler().postAtFrontOfQueue(new Runnable() {
                /* class com.tt.miniapp.render.C66728b.RunnableC667313 */

                public void run() {
                    WebView a = C66728b.this.mo232562a(i);
                    if (a != null) {
                        String str = "ttJSBridge.subscribeHandler('" + str + "'," + str2 + ")";
                        AppBrandLogger.m52828d(C66728b.f168459a, "publish " + str + " , " + a);
                        if (C24512a.m89385a(null)) {
                            C66728b.this.mo232563a(i, str, true);
                        } else {
                            C66728b.this.mo232564b(i, str, true);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m260540a(String str, int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            String callBackType = this.f168460b.getCallBackType(str);
            jSONObject.put("callbackID", String.valueOf(i));
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
            jSONObject.put("callbackType", callBackType);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bizDomain", "open_platform");
            jSONObject.put("extra", jSONObject2);
            String format = String.format("LarkWebViewJavaScriptBridge.nativeCallBack(%s)", jSONObject.toString());
            WebView a = mo232562a(i2);
            if (a != null) {
                a.loadUrl("javascript:" + Uri.encode(format));
            }
        } catch (JSONException e) {
            e.printStackTrace();
            AppBrandLogger.m52829e(f168459a, "invokeHandlerByLarkBridge ", e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public synchronized void mo232563a(int i, String str, boolean z) {
        if (this.f168460b.readyToExecuteJs(i)) {
            mo232564b(i, str, z);
        } else {
            this.f168460b.addPendingJs(i, str);
        }
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void publishFirst(final int i, final String str, final String str2, IAppContext iAppContext) {
        final long currentTimeMillis = System.currentTimeMillis();
        AppbrandContext.getMainHandler().postAtFrontOfQueue(new Runnable() {
            /* class com.tt.miniapp.render.C66728b.RunnableC667302 */

            public void run() {
                AppBrandLogger.m52830i(C66728b.f168459a, "publishFirst waitDuration:" + (System.currentTimeMillis() - currentTimeMillis));
                WebView a = C66728b.this.mo232562a(i);
                if (a != null) {
                    String str = "ttJSBridge.subscribeHandler('" + str + "'," + str2 + ")";
                    AppBrandLogger.m52828d(C66728b.f168459a, "publish " + str + " , " + a);
                    if (C24512a.m89385a(null)) {
                        C66728b.this.mo232563a(i, str, true);
                    } else {
                        C66728b.this.mo232564b(i, str, true);
                    }
                }
            }
        });
    }
}
