package com.bytedance.geckox.settings;

import android.content.Context;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.policy.p775a.AbstractC14297b;
import com.bytedance.geckox.policy.p775a.C14296a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.SettingsLocal;
import com.bytedance.geckox.settings.p780a.AbstractC14325b;
import com.bytedance.geckox.settings.p780a.C14324a;

/* renamed from: com.bytedance.geckox.settings.a */
public class C14322a {

    /* renamed from: a */
    public Context f37635a;

    /* renamed from: b */
    public GeckoGlobalConfig f37636b;

    /* renamed from: c */
    public GlobalConfigSettings f37637c;

    /* renamed from: d */
    public C14324a f37638d;

    /* renamed from: e */
    public int f37639e;

    /* renamed from: f */
    public C14326b f37640f;

    /* renamed from: g */
    public boolean f37641g = true;

    /* renamed from: h */
    public C14296a f37642h;

    /* renamed from: a */
    public GlobalConfigSettings mo52402a() {
        return this.f37637c;
    }

    /* renamed from: a */
    public void mo52403a(AbstractC14325b bVar) {
        this.f37638d.mo52404a(bVar);
    }

    public C14322a(GeckoGlobalConfig geckoGlobalConfig) {
        String str;
        this.f37636b = geckoGlobalConfig;
        this.f37635a = geckoGlobalConfig.mo52033a();
        this.f37638d = new C14324a();
        C14326b bVar = new C14326b();
        this.f37640f = bVar;
        SettingsLocal b = bVar.mo52407b(this.f37635a);
        String name = this.f37636b.mo52038f().name();
        String e = this.f37636b.mo52037e();
        String str2 = null;
        if (b != null) {
            str2 = b.getEnv();
            str = b.getAppVersion();
        } else {
            str = null;
        }
        this.f37640f.mo52406a(this.f37635a, new SettingsLocal(name, e));
        if (!name.equals(str2) || !e.equals(str)) {
            this.f37640f.mo52408c(this.f37635a);
        } else {
            GlobalConfigSettings a = this.f37640f.mo52405a(this.f37635a);
            this.f37637c = a;
            if (a != null) {
                this.f37639e = a.getVersion();
            }
        }
        this.f37642h = new C14296a(new AbstractC14297b() {
            /* class com.bytedance.geckox.settings.C14322a.C143231 */
        });
    }
}
