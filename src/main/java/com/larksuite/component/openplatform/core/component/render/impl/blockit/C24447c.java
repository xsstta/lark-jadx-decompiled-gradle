package com.larksuite.component.openplatform.core.component.render.impl.blockit;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.JsonUtil;
import com.bytedance.ee.ref.card.p686a.C13512e;
import com.bytedance.ies.xelement.banner.LynxSwiperView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.block.C24417g;
import com.larksuite.component.openplatform.core.block.C24418h;
import com.larksuite.component.openplatform.core.component.worker.bridge.BlockBridgeModule;
import com.larksuite.component.openplatform.core.container.impl.AbstractC24480a;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.C26906i;
import com.lynx.tasm.C26908k;
import com.lynx.tasm.C26910m;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26622a;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.miniapp.event.lark.C66038a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.p3400a.p3410g.AbstractC67729a;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.component.render.impl.blockit.c */
public class C24447c {

    /* renamed from: a */
    public final String[] f60323a = {"http", "https", "file", "content", "res", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "asset"};

    /* renamed from: b */
    public final IAppContext f60324b;

    /* renamed from: c */
    public OPTrace f60325c;

    /* renamed from: d */
    public boolean f60326d;

    /* renamed from: e */
    public boolean f60327e;

    /* renamed from: f */
    private LynxView f60328f;

    /* renamed from: g */
    private final C24446b f60329g;

    /* renamed from: h */
    private final Context f60330h;

    /* renamed from: i */
    private final FrameLayout f60331i;

    /* renamed from: j */
    public View mo87257j() {
        return this.f60331i;
    }

    /* renamed from: a */
    public C26622a mo87243a() {
        return new C26622a("swiper") {
            /* class com.larksuite.component.openplatform.core.component.render.impl.blockit.C24447c.C244492 */

            /* renamed from: b */
            public LynxSwiperView mo33935a(AbstractC26684l lVar) {
                boolean b = C24447c.this.mo87249b();
                AppBrandLogger.m52830i("OP_SDK_BlockitView", "disableNewSwiper " + b);
                if (b) {
                    return new LynxSwiperView(lVar);
                }
                return new BlockSwiperView(lVar);
            }
        };
    }

    /* renamed from: g */
    public void mo87254g() {
        LynxView lynxView = this.f60328f;
        if (lynxView != null) {
            lynxView.destroy();
        }
    }

    /* renamed from: h */
    public void mo87255h() {
        LynxView lynxView = this.f60328f;
        if (lynxView != null) {
            lynxView.onEnterForeground();
        }
    }

    /* renamed from: i */
    public void mo87256i() {
        LynxView lynxView = this.f60328f;
        if (lynxView != null) {
            lynxView.onEnterBackground();
        }
    }

    /* renamed from: m */
    private boolean m89170m() {
        return HostDependManager.getInst().getFeatureGating("openplatfrom.block.console_enable", false);
    }

    /* renamed from: b */
    public boolean mo87249b() {
        return HostDependManager.getInst().getFeatureGating("openplatform.blockit.disable_new_swiper", false);
    }

    /* renamed from: e */
    public String mo87252e() {
        if (m89169l()) {
            return "openplatform_website_creator_instance_dev";
        }
        return "openplatform_website_block_instance_dev";
    }

    /* renamed from: k */
    private void m89168k() {
        this.f60325c = this.f60324b.getTracingSpan();
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.component.render.impl.blockit.C24447c.RunnableC244481 */

            public void run() {
                C24447c.this.mo87250c();
            }
        });
    }

    /* renamed from: l */
    private boolean m89169l() {
        Bundle bundle = (Bundle) this.f60324b.getExtra("startParams");
        if (bundle != null) {
            return "creator".equals(bundle.getString("componentType"));
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo87253f() {
        Boolean bool = (Boolean) this.f60324b.getExtra("meta_cache");
        Boolean bool2 = (Boolean) this.f60324b.getExtra("package_cache");
        if (bool == null || bool2 == null || !bool.booleanValue() || !bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo87251d() {
        if (this.f60326d && this.f60327e) {
            long currentTimeMillis = System.currentTimeMillis() - ((Long) this.f60324b.getExtra("APP_START")).longValue();
            new C24417g("mp_app_launch_result", C24418h.f60252b, this.f60324b).setResultTypeSuccess().setDuration(currentTimeMillis).flush();
            C66038a.m258620a(mo87252e(), this.f60324b).addCategoryValue("cache", Boolean.toString(mo87253f())).setDuration(currentTimeMillis).setResultTypeSuccess().flush();
        }
    }

    /* renamed from: c */
    public void mo87250c() {
        C26910m b = this.f60329g.mo87242b();
        b.mo95727a("BDLynxModule", BlockBridgeModule.class, this.f60324b);
        AbstractC67729a aVar = (AbstractC67729a) this.f60324b.findServiceByInterface(AbstractC67729a.class);
        String a = this.f60329g.mo87240a();
        boolean m = m89170m();
        if (m && aVar != null) {
            a = C26908k.f66805b;
        }
        AppBrandLogger.m52830i("OP_SDK_BlockitView", "block groupName: " + a);
        b.mo95731b(C13512e.m54911b(a));
        LynxView a2 = b.mo95734a(this.f60330h);
        this.f60328f = a2;
        this.f60331i.addView(a2, new FrameLayout.LayoutParams(-1, -1));
        b.mo95730b(mo87243a());
        this.f60325c = this.f60324b.getTracingSpan();
        if (m && aVar != null) {
            long longValue = this.f60328f.getLynxContext().mo94690l().longValue();
            this.f60325c.mo92224i("OP_SDK_BlockitView", "has logger");
            aVar.mo235100a(LLog.m96412a(new C24445a(aVar, longValue)));
            LLog.m96414a(2);
        }
        this.f60328f.addLynxViewClient(new AbstractC26911n() {
            /* class com.larksuite.component.openplatform.core.component.render.impl.blockit.C24447c.C244503 */

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: a */
            public void mo11457a() {
                super.mo11457a();
                C24447c.this.f60325c.mo92224i("OP_SDK_BlockitView", "onLoadSuccess");
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: d */
            public void mo11463d() {
                super.mo11463d();
                C24447c.this.f60325c.mo92224i("OP_SDK_BlockitView", "onPageUpdate");
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: b */
            public void mo11461b() {
                super.mo11461b();
                C24447c.this.f60325c.mo92224i("OP_SDK_BlockitView", "onFirstScreen");
                new C24417g("mp_webview_load_dom_ready", C24418h.f60250A, C24447c.this.f60324b).setDuration(System.currentTimeMillis() - ((Long) C24447c.this.f60324b.getExtra("LOAD_APP_FILE_START")).longValue()).flush();
                C24447c.this.f60326d = true;
                C24447c.this.mo87251d();
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: c */
            public void mo11462c() {
                super.mo11462c();
                C24447c.this.f60325c.mo92224i("OP_SDK_BlockitView", "onRuntimeReady");
                new C24417g("mp_jscore_load_dom_ready", C24418h.f60276z, C24447c.this.f60324b).setDuration(System.currentTimeMillis() - ((Long) C24447c.this.f60324b.getExtra("LOAD_APP_FILE_START")).longValue()).flush();
                AbstractC24480a aVar = (AbstractC24480a) C24447c.this.f60324b.findServiceByInterface(AbstractC24480a.class);
                if (aVar != null) {
                    C24447c.this.f60325c.mo92224i("OP_SDK_BlockitView", "onWorkerReady");
                    aVar.mo87348a();
                }
                C24447c.this.f60327e = true;
                C24447c.this.mo87251d();
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: a */
            public void mo11460a(String str) {
                super.mo11460a(str);
                OPTrace oPTrace = C24447c.this.f60325c;
                oPTrace.mo92224i("OP_SDK_BlockitView", "onPageStart....url:" + str);
                new C24417g("mp_webview_page_load_start", C24418h.f60274x, C24447c.this.f60324b).setResultTypeSuccess().flush();
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: b */
            public void mo50245b(LynxPerfMetric lynxPerfMetric) {
                super.mo50245b(lynxPerfMetric);
                if (lynxPerfMetric != null) {
                    C24447c.this.mo87244a(lynxPerfMetric, new C24417g("op_block_load_lynx_update_load", C24447c.this.f60324b));
                    return;
                }
                C24447c.this.f60325c.mo92223e("OP_SDK_BlockitView", "onUpdatePerfReady -> LynxPerfMetric is null");
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: c */
            public void mo87261c(C26906i iVar) {
                super.mo87261c(iVar);
                new C24417g("mp_js_runtime_error", C24418h.f60251a, C24447c.this.f60324b).setResultTypeFail().setErrorMessage(iVar.mo95712b()).setErrorCode(String.valueOf(iVar.mo95711a())).flush();
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: d */
            public void mo87262d(C26906i iVar) {
                super.mo87262d(iVar);
                new C24417g("mp_special_error", C24418h.f60251a, C24447c.this.f60324b).setResultTypeFail().setErrorMessage(iVar.mo95712b()).setErrorCode(String.valueOf(iVar.mo95711a())).flush();
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: a */
            public void mo11458a(LynxPerfMetric lynxPerfMetric) {
                super.mo11458a(lynxPerfMetric);
                if (lynxPerfMetric != null) {
                    OPTrace oPTrace = C24447c.this.f60325c;
                    oPTrace.mo92224i("OP_SDK_BlockitView", "onFirstLoadPerfReady -> LynxPerfMetric : " + lynxPerfMetric.toString());
                    C24447c.this.mo87244a(lynxPerfMetric, new C24417g("op_block_load_lynx_first_load", C24447c.this.f60324b));
                    return;
                }
                C24447c.this.f60325c.mo92223e("OP_SDK_BlockitView", "onFirstLoadPerfReady -> LynxPerfMetric is null");
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: a */
            public void mo11459a(C26906i iVar) {
                super.mo11459a(iVar);
                OPTrace oPTrace = C24447c.this.f60325c;
                oPTrace.mo92223e("OP_SDK_BlockitView", "onReceivedError" + iVar);
                int a = iVar.mo95711a();
                if (a == 100 || a == 103) {
                    new C24417g("mp_app_launch_result", C24418h.f60251a, C24447c.this.f60324b).setResultTypeFail().setErrorMessage(iVar.toString()).flush();
                    C66038a.m258620a(C24447c.this.mo87252e(), C24447c.this.f60324b).setDuration(System.currentTimeMillis() - ((Long) C24447c.this.f60324b.getExtra("APP_START")).longValue()).setResultTypeFail().addCategoryValue("cache", Boolean.valueOf(C24447c.this.mo87253f())).flush();
                }
            }

            @Override // com.lynx.tasm.behavior.AbstractC26674h, com.lynx.tasm.AbstractC26911n
            /* renamed from: b */
            public String mo33934b(String str) {
                if (TextUtils.isEmpty(str)) {
                    C24447c.this.f60325c.mo92223e("OP_SDK_BlockitView", "shouldRedirectImageUrl is empty!");
                    return null;
                }
                OPTrace oPTrace = C24447c.this.f60325c;
                oPTrace.mo92224i("OP_SDK_BlockitView", "shouldRedirectImageUrl" + str);
                try {
                    Uri parse = Uri.parse(str);
                    String scheme = parse.getScheme();
                    if (scheme != null && Arrays.asList(C24447c.this.f60323a).contains(scheme)) {
                        return str;
                    }
                    if (!parse.isRelative()) {
                        C24447c.this.f60325c.mo92224i("OP_SDK_BlockitView", "other custom schema!!!");
                    }
                    if (!TextUtils.isEmpty(null)) {
                        return null;
                    }
                    return super.mo33934b(str);
                } catch (Exception e) {
                    OPTrace oPTrace2 = C24447c.this.f60325c;
                    oPTrace2.mo92223e("OP_SDK_BlockitView", "shouldRedirectImageUrl->error:" + e.getMessage());
                }
            }

            @Override // com.lynx.tasm.AbstractC26911n
            /* renamed from: b */
            public void mo87260b(C26906i iVar) {
                super.mo87260b(iVar);
                new C24417g("mp_webview_load_exception", C24418h.f60251a, C24447c.this.f60324b).setResultTypeFail().setErrorMessage(iVar.mo95712b()).setErrorCode(String.valueOf(iVar.mo95711a())).flush();
            }
        });
        new C24417g("mp_app_container_loaded", C24418h.f60269s, this.f60324b).flush();
    }

    /* renamed from: a */
    public void mo87245a(String str) {
        if (this.f60328f != null) {
            mo87248b("onResourceChange", str);
        }
    }

    /* renamed from: a */
    public void mo87246a(String str, String str2) {
        this.f60328f.renderTemplateUrl(str, str2);
    }

    /* renamed from: a */
    public void mo87244a(LynxPerfMetric lynxPerfMetric, C24417g gVar) {
        JSONObject jSONObject = lynxPerfMetric.toJSONObject();
        JSONObject optJSONObject = jSONObject.optJSONObject("timing");
        jSONObject.remove("timing");
        if (optJSONObject != null) {
            gVar.addMap(JsonUtil.m54377a(optJSONObject.toString()));
        }
        gVar.addMap(JsonUtil.m54377a(jSONObject.toString()));
        gVar.flush();
    }

    /* renamed from: a */
    public void mo87247a(byte[] bArr, String str) {
        this.f60328f.renderTemplateWithBaseUrl(bArr, str, "");
    }

    /* renamed from: b */
    public void mo87248b(String str, String str2) {
        if (this.f60328f == null) {
            this.f60325c.mo92223e("OP_SDK_BlockitView", "call js error : no block view");
        } else if (TextUtils.isEmpty(str)) {
            this.f60325c.mo92223e("OP_SDK_BlockitView", "call js error : no event name");
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushString(str);
            javaOnlyArray.pushString(str2);
            OPTrace oPTrace = this.f60325c;
            oPTrace.mo92222d("OP_SDK_BlockitView", "callJS " + str + "  data " + str2);
            this.f60328f.getJSModule("BDLynxAPIModule").mo93988a("trigger", javaOnlyArray);
        }
    }

    public C24447c(Context context, IAppContext iAppContext, C24446b bVar) {
        this.f60330h = context;
        this.f60324b = iAppContext;
        this.f60329g = bVar;
        this.f60331i = new FrameLayout(context);
        m89168k();
    }
}
