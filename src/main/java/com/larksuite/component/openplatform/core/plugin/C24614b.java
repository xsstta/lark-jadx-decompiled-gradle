package com.larksuite.component.openplatform.core.plugin;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.container.impl.C24491h;
import com.larksuite.component.openplatform.core.utils.ApiMonitorUtil;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.core.AbstractC25929f;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.entity.LKPluginInterceptResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.C65807c;
import com.tt.miniapp.p3323q.C66692i;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67054r;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.miniapphost.util.DebugUtil;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.b */
public class C24614b extends AbstractC25929f {

    /* renamed from: a */
    public IAppContext f60644a;

    /* renamed from: b */
    private C24491h f60645b;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public C24614b(C24491h hVar) {
        this.f60645b = hVar;
        this.f60644a = hVar.mo87113d();
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        gVar.mo92192a("getSystemInfoSync");
        gVar.mo92192a("getSystemInfo");
        gVar.mo92192a("navigateTo");
        gVar.mo92192a("navigateBack");
        gVar.mo92192a("redirectTo");
        gVar.mo92192a("reLaunch");
        gVar.mo92192a("switchTab");
        gVar.mo92192a("gadgetPageRenderProcessGone");
        gVar.mo92192a("render_page_frame_js_load_timeout");
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        if ("getSystemInfo".equals(m) || "getSystemInfoSync".equals(m)) {
            lKEvent.mo92135c("gadgetVersion", C67432a.m262319a(this.f60645b.f60359i).getAppInfo().version);
            lKEvent.mo92135c(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, C67043j.m261283f(lKEvent.mo92145l()));
        }
        return lKEvent.mo92155v();
    }

    @Override // com.larksuite.framework.apiplugin.core.AbstractC25929f, com.larksuite.framework.apiplugin.p1175a.AbstractC25900k
    /* renamed from: a */
    public LKPluginInterceptResult mo87280a(LKEvent lKEvent) {
        C24491h hVar;
        String m = lKEvent.mo92146m();
        JSONObject n = lKEvent.mo92147n();
        if (m.equals("navigateTo") || m.equals("navigateBack") || m.equals("redirectTo") || m.equals("reLaunch") || m.equals("switchTab")) {
            AppBrandLogger.m52828d("OPGadgetContainerPlugin", "Start ", Long.valueOf(System.currentTimeMillis()));
            if (n != null) {
                C66692i.m260474a(C67054r.m261336a(n.toString()).f169027a, this.f60644a);
                m89691a(m, n.toString(), lKEvent.mo92144k(), ApiMonitorUtil.m91097a(lKEvent));
            }
            return mo92255a((JSONObject) null);
        }
        if (TextUtils.equals("gadgetPageRenderProcessGone", m)) {
            C25529d.m91157c();
            if (!this.f60644a.isEmbedContainer()) {
                AbstractC67434b a = ((AbstractC67433a) this.f60644a).mo234156a();
                if (a instanceof AbstractC67497e) {
                    ((AbstractC67497e) a).mo232117a("gadgetPageRenderProcessGone", "gadgetPageRenderProcessGone");
                }
                return mo92255a((JSONObject) null);
            }
            C24491h hVar2 = this.f60645b;
            if (hVar2 != null) {
                hVar2.mo49119a("gadgetPageRenderProcessGone", "gadgetPageRenderProcessGone");
                return mo92255a((JSONObject) null);
            }
        } else if (TextUtils.equals("render_page_frame_js_load_timeout", m) && (hVar = this.f60645b) != null) {
            hVar.mo49119a("render_page_frame_js_load_timeout", "render_page_frame_js_load_timeout");
            return mo92255a((JSONObject) null);
        }
        return super.mo87280a(lKEvent);
    }

    /* renamed from: a */
    public String mo87605a(ApiCallResult.Builder builder, int i) {
        builder.appendResponseData("callbackID", Integer.valueOf(i));
        return builder.build().toString();
    }

    /* renamed from: a */
    private void m89691a(final String str, final String str2, final int i, final String str3) {
        AppBrandLogger.m52828d("OPGadgetContainerPlugin", "mApi : ", str, " mArgs : ", str2);
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.C24614b.RunnableC246151 */

            public void run() {
                C65807c appRouter = AppbrandApplicationImpl.getInst(C24614b.this.f60644a).getAppRouter();
                if (appRouter != null) {
                    ApiCallResult.Builder a = appRouter.mo230503a(str, str2);
                    if (a != null) {
                        IJsBridge jsBridge = AppbrandApplicationImpl.getInst(C24614b.this.f60644a).getJsBridge();
                        int i = i;
                        jsBridge.returnAsyncResult(i, str, C24614b.this.mo87605a(a, i), str3);
                        return;
                    }
                    return;
                }
                AppBrandLogger.m52829e("OPGadgetContainerPlugin", "router == null");
                if (DebugUtil.debug()) {
                    throw new IllegalStateException("router is null");
                }
            }
        });
    }
}
