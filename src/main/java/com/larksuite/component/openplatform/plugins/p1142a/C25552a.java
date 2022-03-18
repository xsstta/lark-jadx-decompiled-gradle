package com.larksuite.component.openplatform.plugins.p1142a;

import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.bytedance.ee.lark.plugin_annotation.bean.Scope;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;

/* renamed from: com.larksuite.component.openplatform.plugins.a.a */
public class C25552a {

    /* renamed from: a */
    public final AbstractC25904o f62177a;

    /* renamed from: b */
    public final LKOpenApiAccessConfig f62178b;

    /* renamed from: c */
    public final PluginEnv f62179c;

    /* renamed from: d */
    public final Scope f62180d;

    /* renamed from: com.larksuite.component.openplatform.plugins.a.a$a */
    public static final class C25554a {

        /* renamed from: a */
        public AbstractC25904o f62181a;

        /* renamed from: b */
        public LKOpenApiAccessConfig f62182b;

        /* renamed from: c */
        public PluginEnv f62183c;

        /* renamed from: d */
        public Scope f62184d;

        /* renamed from: a */
        public C25552a mo88694a() {
            return new C25552a(this);
        }

        /* renamed from: a */
        public C25554a mo88690a(PluginEnv pluginEnv) {
            this.f62183c = pluginEnv;
            return this;
        }

        /* renamed from: a */
        public C25554a mo88691a(Scope scope) {
            this.f62184d = scope;
            return this;
        }

        /* renamed from: a */
        public C25554a mo88692a(LKOpenApiAccessConfig lKOpenApiAccessConfig) {
            this.f62182b = lKOpenApiAccessConfig;
            return this;
        }

        /* renamed from: a */
        public C25554a mo88693a(AbstractC25904o oVar) {
            this.f62181a = oVar;
            return this;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("LKCreatePluginConfig{mPm=");
        sb.append(this.f62177a);
        sb.append(", mApiAccessConfig=");
        LKOpenApiAccessConfig lKOpenApiAccessConfig = this.f62178b;
        if (lKOpenApiAccessConfig != null) {
            str = lKOpenApiAccessConfig.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", mPluginEnv=");
        sb.append(this.f62179c);
        sb.append(", mScope=");
        sb.append(this.f62180d);
        sb.append('}');
        return sb.toString();
    }

    private C25552a(C25554a aVar) {
        this.f62177a = aVar.f62181a;
        this.f62178b = aVar.f62182b;
        this.f62179c = aVar.f62183c;
        this.f62180d = aVar.f62184d;
    }
}
