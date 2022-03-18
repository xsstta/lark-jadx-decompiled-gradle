package com.bytedance.ee.bear.basesdk.p250a;

import android.content.Context;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.bitable.share.ShareBaseInterceptor;
import com.bytedance.ee.bear.document.bitable.C5673a;
import com.bytedance.ee.bear.document.route.C6089a;
import com.bytedance.ee.bear.document.route.C6093c;
import com.bytedance.ee.bear.document.route.C6094d;
import com.bytedance.ee.bear.drive.p325b.C6320b;
import com.bytedance.ee.bear.integrator.DynamicModuleLoader;
import com.bytedance.ee.bear.integrator.wiki.WikiRouteInterceptorV3;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.list.route.C8704d;
import com.bytedance.ee.bear.list.share.C8726e;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.slide.C11374b;
import com.bytedance.ee.bear.wiki.p578c.C11928b;
import com.bytedance.ee.bear.wikiv2.route.C12340b;
import com.bytedance.ee.bear.wikiv2.route.C12341c;
import com.bytedance.ee.bear.wikiv2.route.C12342d;
import com.bytedance.ee.bear.wikiv2.route.C12343e;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.a.c */
public abstract class AbstractC4354c {

    /* renamed from: a */
    protected C10917c f12988a = new C10917c(new C10929e());

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<AbstractC10738c> mo17006a() {
        ArrayList arrayList = new ArrayList(((DynamicModuleLoader) KoinJavaComponent.m268610a(DynamicModuleLoader.class)).mo30702d());
        C10917c cVar = this.f12988a;
        boolean z = true;
        C6089a aVar = new C6089a(cVar, new C6094d(cVar));
        C8704d dVar = new C8704d(this.f12988a);
        C6093c cVar2 = new C6093c(this.f12988a);
        C10917c cVar3 = this.f12988a;
        C6320b bVar = new C6320b(cVar3, new C6094d(cVar3));
        WikiRouteInterceptorV3 bVar2 = new WikiRouteInterceptorV3(this.f12988a, new AbstractC10738c[0]);
        C12341c cVar4 = new C12341c(this.f12988a);
        C10917c cVar5 = this.f12988a;
        C12340b bVar3 = new C12340b(cVar5, new C6094d(cVar5));
        C12343e eVar = new C12343e(this.f12988a);
        C12342d dVar2 = new C12342d(this.f12988a);
        C11928b bVar4 = new C11928b(this.f12988a);
        ShareBaseInterceptor aVar2 = new ShareBaseInterceptor(this.f12988a);
        arrayList.add(bVar2);
        arrayList.add(cVar4);
        arrayList.add(bVar3);
        arrayList.add(eVar);
        arrayList.add(dVar2);
        arrayList.add(aVar2);
        arrayList.add(bVar4);
        C5673a aVar3 = new C5673a(this.f12988a, new AbstractC10738c[0]);
        if (!((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e() || C4211a.m17514a().mo16536a("ccm.spacekit.bitable.enable", false)) {
            z = false;
        }
        C13479a.m54764b("BaseRouterInterceptorProviders", "enable intercept bitable ？ " + z);
        if (z) {
            arrayList.add(aVar3);
        }
        arrayList.add(new C11374b(this.f12988a, new AbstractC10738c[0]));
        arrayList.add(aVar);
        arrayList.add(dVar);
        arrayList.add(new C8726e(this.f12988a));
        arrayList.add(cVar2);
        arrayList.add(bVar);
        return arrayList;
    }

    public AbstractC4354c(Context context) {
    }
}
