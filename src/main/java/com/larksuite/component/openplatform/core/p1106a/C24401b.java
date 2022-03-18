package com.larksuite.component.openplatform.core.p1106a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.component.p607a.p612e.AbstractC12726c;
import com.bytedance.ee.lark.component.p607a.p612e.C12727d;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.plugin_annotation.bean.Scope;
import com.lark.falcon.engine.p1060d.C23972a;
import com.larksuite.component.openplatform.api.AbstractC24365b;
import com.larksuite.component.openplatform.api.AbstractC24367c;
import com.larksuite.component.openplatform.api.p1105d.AbstractC24372a;
import com.larksuite.component.openplatform.api.p1105d.AbstractC24373b;
import com.larksuite.component.openplatform.api.p1105d.AbstractC24374c;
import com.larksuite.component.openplatform.api.p1105d.AbstractC24375d;
import com.larksuite.component.openplatform.core.container.impl.C24491h;
import com.larksuite.component.openplatform.core.p1114c.C24423a;
import com.larksuite.component.openplatform.core.p1121d.C24496a;
import com.larksuite.component.openplatform.core.p1121d.C24498b;
import com.larksuite.component.openplatform.core.p1121d.C24499c;
import com.larksuite.component.openplatform.plugins.config.C25572a;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c;
import com.larksuite.component.openplatform.plugins.p1142a.C25552a;
import com.larksuite.component.openplatform.plugins.p1143b.C25557a;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.core.AbstractC25922a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.openplatform.core.a.b */
public class C24401b extends AbstractC25922a implements AbstractC24367c {

    /* renamed from: e */
    private static AbstractC24367c f60218e;

    /* renamed from: a */
    private final Map<String, AbstractC24365b> f60219a = new ConcurrentHashMap();

    /* renamed from: b */
    private final Map<String, C24491h> f60220b = new ConcurrentHashMap();

    /* renamed from: c */
    private volatile boolean f60221c;

    /* renamed from: d */
    private Context f60222d;

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: b */
    public Context mo49749b() {
        return this.f60222d;
    }

    private C24401b() {
    }

    /* renamed from: c */
    public static AbstractC24367c m89051c() {
        if (f60218e == null) {
            synchronized (C24401b.class) {
                if (f60218e == null) {
                    f60218e = new C24401b();
                }
            }
        }
        return f60218e;
    }

    /* renamed from: d */
    private void m89052d() {
        AbstractC25937e a;
        AbstractC25904o u = mo92183u();
        AbstractC25556c cVar = (AbstractC25556c) C24498b.m89361a().mo87139a(AbstractC25556c.class);
        if (cVar != null && (a = cVar.mo88696a(new C25552a.C25554a().mo88693a(u).mo88691a(Scope.SERVICE).mo88694a())) != null) {
            Log.m165389i("OPApplicationCreatorImpl", "plugin:" + a.getClass().getName());
            u.mo92199a(a);
        }
    }

    /* renamed from: d */
    public C24491h mo87197d(String str) {
        return this.f60220b.get(str);
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24367c
    /* renamed from: a */
    public void mo87132a(LKPluginConfig lKPluginConfig) {
        AbstractC25556c cVar = (AbstractC25556c) C24498b.m89361a().mo87139a(AbstractC25556c.class);
        if (cVar != null) {
            cVar.mo88698a(lKPluginConfig);
        }
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24367c
    /* renamed from: a */
    public AbstractC24365b mo87130a(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("OPApplicationCreatorImpl", "appId is empty!");
            return null;
        }
        synchronized (this.f60219a) {
            if (this.f60219a.containsKey(str)) {
                AppBrandLogger.m52830i("OPApplicationCreatorImpl", "createApplication appId isExist:" + str);
                return this.f60219a.get(str);
            }
            C24379a aVar = new C24379a(str);
            aVar.mo92177a(this);
            this.f60219a.put(str, aVar);
            return aVar;
        }
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24367c
    /* renamed from: b */
    public boolean mo87133b(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("OPApplicationCreatorImpl", "appId is empty!");
            return false;
        }
        synchronized (this.f60219a) {
            AbstractC24365b remove = this.f60219a.remove(str);
            if (remove == null) {
                return false;
            }
            AppBrandLogger.m52830i("OPApplicationCreatorImpl", "remove appId:" + str);
            remove.mo92177a((AbstractC25891b) null);
            remove.ah_();
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo87196c(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("OPApplicationCreatorImpl", "appIdentify is empty!");
            return false;
        }
        synchronized (this.f60220b) {
            C24491h remove = this.f60220b.remove(str);
            if (remove == null) {
                return false;
            }
            AppBrandLogger.m52830i("OPApplicationCreatorImpl", "remove appIdentify:" + str);
            remove.ah_();
            remove.mo92177a((AbstractC25891b) null);
            return true;
        }
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24367c
    /* renamed from: a */
    public void mo87131a(Context context) {
        if (this.f60221c) {
            AppBrandLogger.m52830i("OPApplicationCreatorImpl", "already init.");
            return;
        }
        Log.m165389i("OPApplicationCreatorImpl", "init service");
        this.f60222d = context;
        this.f60221c = true;
        C24423a.m89090a();
        AbstractC24374c a = C24498b.m89361a();
        a.mo87140a(AbstractC24372a.class, new C24496a());
        a.mo87140a(AbstractC24375d.class, new C24499c());
        a.mo87140a(AbstractC25556c.class, new C25557a());
        a.mo87140a(AbstractC24373b.class, new C23972a());
        a.mo87140a(AbstractC12726c.class, new C12727d());
        if (ProcessUtil.isMainProcess(context)) {
            for (LKPluginConfig lKPluginConfig : C25572a.m91282b().mo88695a()) {
                AppBrandLogger.m52830i("OPApplicationCreatorImpl", "externalPlugin:" + lKPluginConfig.mPluginClassName);
                mo87132a(lKPluginConfig);
            }
            m89052d();
        }
    }

    /* renamed from: a */
    public C24491h mo87195a(String str, LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("OPApplicationCreatorImpl", "appIdentify is empty!");
            return null;
        }
        synchronized (this.f60220b) {
            if (this.f60220b.containsKey(str)) {
                AppBrandLogger.m52830i("OPApplicationCreatorImpl", "createFakeAppContainer appIdentify isExist:" + str);
                return this.f60220b.get(str);
            }
            C24491h hVar = new C24491h(str, lKOpenApiAccessConfig);
            hVar.mo92177a(this);
            this.f60220b.put(str, hVar);
            return hVar;
        }
    }
}
