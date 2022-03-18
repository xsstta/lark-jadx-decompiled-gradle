package com.larksuite.component.openplatform.core.loader.jsbundle.p1126a;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24526a;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24537c;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24541e;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import com.tt.miniapphost.util.TimeMeter;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.a.a */
public class C24513a extends AbstractC67457c implements AbstractC24540d {

    /* renamed from: a */
    public AbstractC24537c f60448a;

    /* renamed from: b */
    public AbstractC24527b f60449b;

    /* renamed from: c */
    public IMonitorCreator f60450c;

    /* renamed from: e */
    private IAppContext f60451e;

    /* renamed from: f */
    private AbstractC24541e f60452f;

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    @Override // com.tt.miniapphost.p3362a.p3367e.AbstractC67457c, com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.f60451e;
    }

    public C24513a(IAppContext iAppContext) {
        this.f60451e = iAppContext;
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d
    /* renamed from: a */
    public void mo87367a(Context context) {
        this.f60448a.mo87429a();
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d
    /* renamed from: b */
    public String mo87371b(Context context) {
        return this.f60448a.mo87428a(context);
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d
    /* renamed from: c */
    public File mo87372c(Context context) {
        return this.f60448a.mo87436b(context);
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d
    /* renamed from: e */
    public void mo87374e(Context context) {
        AbstractC24527b bVar = this.f60449b;
        if (bVar != null) {
            bVar.mo87405a(context);
        }
        this.f60448a.mo87438c(context);
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d
    /* renamed from: a */
    public Map<String, ReadyJSComponent> mo87366a(List<String> list) {
        AbstractC24527b bVar = this.f60449b;
        if (bVar != null) {
            return bVar.mo87404a(list);
        }
        AppBrandLogger.m52829e("js_bundle_manager", "fetchJsComponentsSync->mJSComponentManager is null!");
        return Collections.EMPTY_MAP;
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d
    /* renamed from: d */
    public void mo87373d(final Context context) {
        if (this.f60452f != null) {
            final TimeMeter newAndStart = TimeMeter.newAndStart();
            LarkInnerEventHelper.mpJsSDKRequestStart(this.f60450c);
            this.f60452f.mo87392a(getAppContext(), new AbstractC24541e.AbstractC24542a() {
                /* class com.larksuite.component.openplatform.core.loader.jsbundle.p1126a.C24513a.C245141 */

                @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24541e.AbstractC24542a
                /* renamed from: a */
                public void mo87376a(JSONObject jSONObject) {
                    List<String> a;
                    AppBrandLogger.m52830i("js_bundle_manager", "setting fetch success");
                    C24513a.this.f60448a.mo87432a(context, jSONObject, newAndStart);
                    if (C24513a.this.f60449b != null && (a = C24513a.this.f60449b.mo87403a(context, jSONObject)) != null && !a.isEmpty()) {
                        C24513a.this.f60449b.mo87406a(context, a, 1);
                    }
                }

                @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24541e.AbstractC24542a
                /* renamed from: a */
                public void mo87375a(String str, String str2) {
                    AppBrandLogger.m52829e("js_bundle_manager", "setting fetch failed: code->", str, " message:", str2);
                    LarkInnerEventHelper.mpJsSDKRequestResult(C24513a.this.f60450c, false, "", "", str, str2, TimeMeter.stop(newAndStart));
                }
            });
        }
    }

    /* renamed from: a */
    public void mo87370a(AbstractC24526a aVar) {
        this.f60448a = aVar.mo87379c();
        this.f60449b = aVar.mo87378b();
        this.f60452f = aVar.mo87377a();
        IMonitorCreator d = aVar.mo87380d();
        this.f60450c = d;
        AbstractC24537c cVar = this.f60448a;
        if (cVar != null) {
            cVar.mo87433a(d);
        }
        AbstractC24527b bVar = this.f60449b;
        if (bVar != null) {
            bVar.mo87415a(this.f60450c);
        }
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d
    /* renamed from: a */
    public void mo87368a(Context context, List<String> list, int i) {
        AbstractC24527b bVar = this.f60449b;
        if (bVar != null) {
            bVar.mo87406a(context, list, i);
            return;
        }
        AppBrandLogger.m52829e("js_bundle_manager", "downloadAndInstallJsComponents->mJSComponentManager is null!");
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d
    /* renamed from: a */
    public void mo87369a(Context context, List<String> list, IJSComponentManager.AbstractC24523a aVar) {
        AbstractC24527b bVar = this.f60449b;
        if (bVar != null) {
            bVar.mo87407a(context, list, aVar);
            return;
        }
        AppBrandLogger.m52829e("js_bundle_manager", "fetchJsComponentsAsync->mJSComponentManager is null!");
    }
}
