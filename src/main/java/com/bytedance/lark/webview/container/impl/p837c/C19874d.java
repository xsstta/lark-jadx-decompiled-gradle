package com.bytedance.lark.webview.container.impl.p837c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.BridgeHandler;
import com.bytedance.ee.larkwebview.bridge.BridgeReport;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.bytedance.ee.larkwebview.bridge.Status;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitorManager;
import com.bytedance.lark.webview.container.impl.p837c.C19874d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.AbstractC48760b;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;
import com.ss.android.lark.openapi.jsapi.C48764f;
import com.ss.android.lark.openapi.p2397a.C48758b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.lark.webview.container.impl.c.d */
public class C19874d {

    /* renamed from: a */
    protected LarkWebView f48544a;

    /* renamed from: b */
    protected List<String> f48545b = new LinkedList();

    /* renamed from: c */
    public AbstractC48762d f48546c;

    /* renamed from: a */
    public void mo67355a() {
        this.f48544a.getBridge().mo49772b();
    }

    /* renamed from: a */
    public void mo67356a(LarkWebView larkWebView) {
        this.f48544a = larkWebView;
    }

    /* renamed from: a */
    public boolean mo67358a(String str) {
        return this.f48545b.contains(str);
    }

    public C19874d(AbstractC48762d dVar) {
        if (dVar != null) {
            this.f48546c = dVar;
            return;
        }
        throw new IllegalArgumentException("permissionChecker should be passed");
    }

    /* renamed from: a */
    private static <T> Class<T> m72537a(Object obj) {
        Type[] typeArr;
        if (obj == null) {
            return null;
        }
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            typeArr = null;
        } else {
            typeArr = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        if (typeArr == null || typeArr.length <= 0) {
            return null;
        }
        return (Class) typeArr[0];
    }

    /* renamed from: b */
    private static <T> Class<T> m72538b(Object obj) {
        Type[] typeArr;
        if (obj == null) {
            return null;
        }
        Type[] genericInterfaces = obj.getClass().getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length <= 0) {
            typeArr = null;
        } else {
            typeArr = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
        }
        if (typeArr == null || typeArr.length <= 0) {
            return null;
        }
        return (Class) typeArr[0];
    }

    /* renamed from: a */
    public <T> T mo67354a(final String str, final AbstractC19872b<T> bVar) {
        if (TextUtils.isEmpty(str) || bVar == null) {
            Log.m165389i("OpenApiManagerV2", "register handler fail, handler is null" + str);
            return null;
        }
        this.f48544a.getBridge().mo49770a(str, new BridgeHandler<String, LarkWebView>() {
            /* class com.bytedance.lark.webview.container.impl.p837c.C19874d.C198751 */

            @Override // com.bytedance.ee.larkwebview.bridge.BridgeHandler
            /* renamed from: a */
            public boolean mo30817a() {
                return true;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m72544a(JsCallBack gVar, AbstractC48760b bVar) {
                gVar.mo49778a(Status.FAILURE, bVar.mo51069b());
            }

            /* renamed from: a */
            public void mo30815a(String str, JsCallBack gVar, String str2, LarkWebView larkWebView) {
                AbstractC48760b bVar;
                Context context = C19874d.this.f48544a.getContext();
                if (!C19874d.this.f48546c.mo50753a()) {
                    bVar = new C48764f();
                } else {
                    bVar = C19874d.this.f48546c.mo50752a(context, null, str, C19874d.this.f48544a.getUrl());
                }
                if (!str.startsWith("tt")) {
                    WebMonitorManager.f35486a.mo49872a(C19874d.this.f48544a, str, C19874d.this.f48544a.getUrl());
                }
                if (bVar.mo51068a()) {
                    C19874d.this.mo67357a(larkWebView, bVar, str, str2, gVar);
                    Log.m165389i("OpenApiManagerV2", str + "has access permission");
                    return;
                }
                BridgeReport dVar = BridgeReport.f35365a;
                dVar.mo49787a(larkWebView, "wb_lark_webview_bridge_error", 10003, str + " has no access permission");
                C19874d.this.f48544a.post(new Runnable(bVar) {
                    /* class com.bytedance.lark.webview.container.impl.p837c.$$Lambda$d$1$EDNS01p5IrL_xTJVOOLj607VBnA */
                    public final /* synthetic */ AbstractC48760b f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C19874d.C198751.lambda$EDNS01p5IrL_xTJVOOLj607VBnA(JsCallBack.this, this.f$1);
                    }
                });
            }
        });
        this.f48545b.add(str);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.lark.webview.container.impl.c.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> void mo67357a(LarkWebView larkWebView, AbstractC19872b<T> bVar, String str, String str2, JsCallBack gVar) {
        Class a = m72537a(bVar);
        if (a == null) {
            a = m72538b(bVar);
        }
        if (a == null) {
            bVar.mo30815a(null, gVar, str2, larkWebView);
        } else if (a == String.class) {
            bVar.mo30815a(str, gVar, str2, larkWebView);
        } else {
            bVar.mo30815a(C48758b.m192084a(str, a), gVar, str2, larkWebView);
        }
    }
}
