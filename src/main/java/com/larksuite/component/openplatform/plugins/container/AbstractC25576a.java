package com.larksuite.component.openplatform.plugins.container;

import android.content.Context;
import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.larksuite.component.openplatform.plugins.config.C25572a;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c;
import com.larksuite.component.openplatform.plugins.p1142a.C25552a;
import com.larksuite.component.openplatform.plugins.p1143b.C25557a;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.core.AbstractC25922a;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.component.openplatform.plugins.container.a */
public abstract class AbstractC25576a extends AbstractC25922a {

    /* renamed from: a */
    protected LKOpenApiAccessConfig f62220a;

    /* renamed from: b */
    private AbstractC25556c f62221b;

    /* renamed from: c */
    private Context f62222c;

    /* renamed from: d */
    public abstract boolean mo87313d();

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: b */
    public Context mo49749b() {
        return this.f62222c;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b, com.larksuite.framework.apiplugin.core.AbstractC25922a
    public void ah_() {
        super.ah_();
        this.f62222c = null;
    }

    /* renamed from: c */
    private void mo87312c() {
        this.f62221b = new C25557a();
        if (mo87313d()) {
            for (LKPluginConfig lKPluginConfig : C25572a.m91282b().mo88695a()) {
                this.f62221b.mo88698a(lKPluginConfig);
            }
        }
    }

    /* renamed from: a */
    private void m91288a(PluginEnv pluginEnv) {
        C25552a.C25554a a = new C25552a.C25554a().mo88693a(mo92183u()).mo88690a(pluginEnv);
        LKOpenApiAccessConfig lKOpenApiAccessConfig = this.f62220a;
        if (lKOpenApiAccessConfig != null) {
            a.mo88692a(lKOpenApiAccessConfig);
        } else {
            Log.m165383e("AbsPluginManagerContainer", "open api access config is null");
        }
        AbstractC25937e a2 = this.f62221b.mo88696a(a.mo88694a());
        if (a2 != null) {
            mo92183u().mo92199a(a2);
        }
    }

    public AbstractC25576a(Context context, LKOpenApiAccessConfig lKOpenApiAccessConfig, PluginEnv pluginEnv) {
        this.f62222c = context;
        this.f62220a = lKOpenApiAccessConfig;
        mo87312c();
        if (pluginEnv == null) {
            Log.m165389i("AbsPluginManagerContainer", "plugin env is null ,so inject all plugins");
            m91288a((PluginEnv) null);
        } else if (pluginEnv != PluginEnv.APP_ENV || !C26252ad.m94993b(context)) {
            m91288a(pluginEnv);
        } else {
            Log.m165389i("AbsPluginManagerContainer", "plugin env is appEnv and in mainProcess, so inject all plugin");
            m91288a((PluginEnv) null);
        }
    }
}
