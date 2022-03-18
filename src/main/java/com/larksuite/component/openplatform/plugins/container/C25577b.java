package com.larksuite.component.openplatform.plugins.container;

import android.content.Context;
import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;

/* renamed from: com.larksuite.component.openplatform.plugins.container.b */
public class C25577b extends AbstractC25576a {
    @Override // com.larksuite.component.openplatform.plugins.container.AbstractC25576a
    /* renamed from: d */
    public boolean mo87313d() {
        return true;
    }

    /* renamed from: a */
    public static AbstractC25576a m91292a(Context context, LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        return new C25577b(context, lKOpenApiAccessConfig, null);
    }

    public C25577b(Context context, LKOpenApiAccessConfig lKOpenApiAccessConfig, PluginEnv pluginEnv) {
        super(context, lKOpenApiAccessConfig, pluginEnv);
        if (PluginEnv.APP_ENV == pluginEnv || pluginEnv == null) {
            mo92183u().mo92199a(new DefaultContainerPlugin(this));
        }
    }
}
