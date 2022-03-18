package com.lark.falcon.engine;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.google.firebase.messaging.Constants;
import com.lark.falcon.engine.p1057a.AbstractC23947a;
import com.larksuite.component.openplatform.api.p1105d.AbstractC24373b;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.larksuite.component.openplatform.core.p1121d.C24498b;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25562e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.OpenPlatform;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.sdk.C53241h;
import com.tt.miniapp.jsbridge.C66240d;
import java.util.HashMap;
import java.util.Map;

public class CreateWorkerPlugin extends OPPlugin {
    private final AbstractC24373b mBizWorkerManagerProvider;
    private final Map<String, AbstractC23944a> mJsWorker = new HashMap();

    public static class Request extends C25920a {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public JSONObject mData;
        @JSONField(name = "key")
        @LKRequiredParam
        public String mKey;
    }

    public CreateWorkerPlugin() {
        HostInterface hostInterface;
        AbstractC24373b bVar = (AbstractC24373b) C24498b.m89361a().mo87139a(AbstractC24373b.class);
        this.mBizWorkerManagerProvider = bVar;
        if (bVar != null && (hostInterface = HostExtensionManager.getInstance().getHostInterface()) != null) {
            bVar.mo86075a(hostInterface.getAllBizWorkerProviders());
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
        for (AbstractC23944a aVar : this.mJsWorker.values()) {
            if (aVar != null) {
                aVar.mo85945b();
            }
        }
        this.mJsWorker.clear();
    }

    private C25921b callbackFail(C25908c cVar) {
        C25921b bVar = new C25921b();
        bVar.mErrorCode = cVar.f64115H;
        bVar.mErrorMessage = cVar.f64117J;
        return bVar;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        super.addEvents(gVar);
        gVar.mo92192a("onActivityResult");
        gVar.mo92192a("onAppSessionChanged");
        gVar.mo92192a("onBackGround");
        gVar.mo92192a("onForeGround");
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        if ("onActivityResult".equals(m)) {
            org.json.JSONObject n = lKEvent.mo92147n();
            Map<String, Object> f = lKEvent.mo92139f();
            if (!(n == null || f == null)) {
                OpenPlatform.Requests.OnActivityResult onActivityResult = (OpenPlatform.Requests.OnActivityResult) JSON.parseObject(n.toString(), OpenPlatform.Requests.OnActivityResult.class);
                if (f.containsKey("intentData")) {
                    Intent intent = (Intent) f.remove("intentData");
                    if (this.mJsWorker.size() > 0) {
                        C53241h.m205898b("CreateWorkerPlugin", "worker handle activity result");
                        for (AbstractC23944a aVar : this.mJsWorker.values()) {
                            AbstractC25562e i = aVar.mo85962i();
                            if (i instanceof AbstractC23947a) {
                                AbstractC25576a pluginManagerContainer = ((AbstractC23947a) i).getPluginManagerContainer();
                                if (pluginManagerContainer != null) {
                                    pluginManagerContainer.mo87111a(onActivityResult.mRequestCode, onActivityResult.mResultCode, intent);
                                } else {
                                    C53241h.m205898b("CreateWorkerPlugin", "pm release");
                                }
                            }
                        }
                        return lKEvent.mo92154u();
                    }
                } else {
                    C53241h.m205894a("CreateWorkerPlugin", "onActivity result event not data");
                }
            }
        } else if ("onAppSessionChanged".equals(m)) {
            if (!this.mJsWorker.isEmpty()) {
                for (AbstractC23944a aVar2 : this.mJsWorker.values()) {
                    aVar2.mo85947c();
                }
                return lKEvent.mo92154u();
            }
            C53241h.m205894a("CreateWorkerPlugin", "notify session change without worker");
        } else if ("onBackGround".equals(m)) {
            if (!this.mJsWorker.isEmpty()) {
                for (AbstractC23944a aVar3 : this.mJsWorker.values()) {
                    aVar3.mo85948d();
                }
            } else {
                C53241h.m205894a("CreateWorkerPlugin", "notify app background without worker");
            }
            return lKEvent.mo92155v();
        } else if ("onForeGround".equals(m)) {
            if (!this.mJsWorker.isEmpty()) {
                for (AbstractC23944a aVar4 : this.mJsWorker.values()) {
                    aVar4.mo85949e();
                }
            } else {
                C53241h.m205894a("CreateWorkerPlugin", "notify app foreground without worker");
            }
            return lKEvent.mo92155v();
        }
        return super.handleEvent(lKEvent);
    }

    @LKPluginFunction(eventName = {"createWorker"})
    public C25921b createWorkerSync(Request request, LKEvent lKEvent) {
        if (C24512a.m89390d()) {
            C53241h.m205894a("CreateWorkerPlugin", "worker module disabled");
            return callbackFail(C25906a.f64078h);
        } else if (this.mBizWorkerManagerProvider == null) {
            C53241h.m205894a("CreateWorkerPlugin", "provider manager is null");
            return callbackFail(C25906a.f64080j);
        } else {
            String str = request.mKey;
            if (this.mJsWorker.containsKey(str)) {
                return callbackFail(C25913h.f64154G);
            }
            AbstractC25558a a = this.mBizWorkerManagerProvider.mo86073a(str);
            if (a == null) {
                C53241h.m205894a("CreateWorkerPlugin", "provider manager is null");
                return callbackFail(C25906a.f64080j);
            }
            for (String str2 : a.mo88703d()) {
                if (!request.mData.containsKey(str2)) {
                    C53241h.m205898b("CreateWorkerPlugin", "data have not key:" + str2);
                    return callbackFail(C25906a.f64072b);
                }
            }
            C66240d.C66242a a2 = C66240d.m259241a(getAppContext(), lKEvent, request.mData, a);
            if (!(a2.f167194b == null || a2.f167194b.f64115H == C25906a.f64071a.f64115H)) {
                return callbackFail(a2.f167194b);
            }
            if (a2.f167193a != null) {
                this.mJsWorker.put(str, a2.f167193a);
                C53241h.m205898b("CreateWorkerPlugin", "worker key:" + str + " init success");
                return a2.mo231613a(str);
            }
            C53241h.m205894a("CreateWorkerPlugin", "jsContext error");
            return callbackFail(C25906a.f64080j);
        }
    }
}
