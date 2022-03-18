package com.tt.miniapp.jsbridge;

import android.app.Activity;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.DebugHelper;
import com.he.jsbinding.JsScopedContext;
import com.lark.falcon.engine.AbstractC23944a;
import com.lark.falcon.engine.C23948b;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.bridge.WritableMap;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.larksuite.component.openplatform.plugins.p1144c.C25563f;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.C65716a;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.falcon.p3288d.C66063a;
import com.tt.miniapp.falcon.runtime.C66067a;
import com.tt.miniapp.falcon.runtime.IJsRuntime;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3367e.C67460f;

/* renamed from: com.tt.miniapp.jsbridge.d */
public class C66240d {

    /* renamed from: a */
    private static int f167192a = -1;

    /* renamed from: a */
    public static boolean m259242a() {
        int i = f167192a;
        boolean z = false;
        if (i == -1) {
            int intValue = ((Integer) HostDependManager.getInst().getHostData(2023, Integer.valueOf(DebugHelper.FalconDebugConfig.USE_FG.ordinal()), C65716a.f165588a)).intValue();
            if (intValue == DebugHelper.FalconDebugConfig.OPEN_FALCON.ordinal()) {
                f167192a = 1;
                return true;
            } else if (intValue == DebugHelper.FalconDebugConfig.CLOSE_FALCON.ordinal()) {
                f167192a = 0;
                return false;
            } else {
                try {
                    z = HostDependManager.getInst().getFeatureGating("openplatform.gadget.force.falconjsruntime");
                } catch (Exception e) {
                    Log.m165384e("GadgetJSRuntimeFactory", "Exception", e);
                }
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                f167192a = i2;
                return z;
            }
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static FrameLayout m259239a(IAppContext iAppContext) {
        Activity currentActivity = iAppContext.getCurrentActivity();
        ViewGroup viewGroup = (ViewGroup) currentActivity.findViewById(R.id.no_status_bar_slot_view);
        if (viewGroup == null) {
            return (FrameLayout) currentActivity.findViewById(16908290);
        }
        return (FrameLayout) viewGroup;
    }

    /* renamed from: com.tt.miniapp.jsbridge.d$a */
    public static class C66242a {

        /* renamed from: a */
        public AbstractC23944a f167193a;

        /* renamed from: b */
        public C25908c f167194b;

        /* renamed from: a */
        public C25921b mo231613a(String str) {
            C25921b bVar = new C25921b();
            bVar.mIsArrayBuffer = true;
            AbstractC23944a aVar = this.f167193a;
            if (aVar instanceof C66063a) {
                LKBasePluginResult.AbstractC25940a.C25941a aVar2 = new LKBasePluginResult.AbstractC25940a.C25941a();
                aVar2.f64248a = str;
                aVar2.f64249b = (T) ((C66063a) this.f167193a).mo231169f();
                bVar.addArrayBuffer(aVar2);
            } else if (aVar instanceof C23948b) {
                LKBasePluginResult.AbstractC25940a.C25941a aVar3 = new LKBasePluginResult.AbstractC25940a.C25941a();
                aVar3.f64248a = str;
                aVar3.f64249b = (T) ((C23948b) this.f167193a).mo85959f();
                bVar.addArrayBuffer(aVar3);
            }
            return bVar;
        }
    }

    /* renamed from: a */
    public static IJsRuntime m259240a(ContextWrapper contextWrapper, IAppContext iAppContext) {
        if (m259242a()) {
            return new C66067a(iAppContext);
        }
        return new C66244f(contextWrapper, iAppContext);
    }

    /* renamed from: a */
    public static C66242a m259241a(IAppContext iAppContext, LKEvent lKEvent, JSONObject jSONObject, AbstractC25558a aVar) {
        C66242a aVar2 = new C66242a();
        if (!m259242a() || !lKEvent.mo92139f().containsKey("shellHolder")) {
            Object remove = lKEvent.mo92139f().remove("miniAppJsContext");
            if (remove instanceof JsScopedContext) {
                C23948b bVar = new C23948b(iAppContext, aVar);
                aVar2.f167194b = bVar.mo85956a((JsScopedContext) remove, jSONObject, m259239a(iAppContext));
                aVar2.f167193a = bVar;
            }
        } else {
            Object remove2 = lKEvent.mo92139f().remove("shellHolder");
            if (remove2 instanceof AndroidFalconShellHolder) {
                C66063a aVar3 = new C66063a(iAppContext, (AndroidFalconShellHolder) remove2, aVar);
                C25563f.C25565a a = new C25563f.C25565a().mo88715a(jSONObject).mo88719a(iAppContext.getAppId()).mo88713a(m259239a(iAppContext));
                if (iAppContext instanceof C67460f) {
                    C67460f fVar = (C67460f) iAppContext;
                    if (fVar.mo234156a() instanceof C66546p) {
                        a.mo88714a(((C66546p) fVar.mo234156a()).mo232114F());
                    }
                }
                aVar2.f167194b = aVar3.mo231168a((WritableMap) JSON.parseObject(jSONObject.toJSONString(), new TypeReference<JavaOnlyMap>() {
                    /* class com.tt.miniapp.jsbridge.C66240d.C662411 */
                }, new Feature[0]), a);
                aVar2.f167193a = aVar3;
            }
        }
        return aVar2;
    }
}
