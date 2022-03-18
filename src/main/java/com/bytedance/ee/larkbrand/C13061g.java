package com.bytedance.ee.larkbrand;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.p650e.C12992a;
import com.bytedance.ee.larkbrand.p650e.C12995c;
import com.bytedance.ee.larkbrand.p650e.C12996d;
import com.bytedance.ee.larkbrand.p650e.C12997e;
import com.bytedance.ee.larkbrand.p650e.C12998f;
import com.bytedance.ee.larkbrand.p650e.C12999g;
import com.bytedance.ee.larkbrand.p650e.C13000h;
import com.bytedance.ee.larkbrand.p650e.C13001i;
import com.bytedance.ee.larkbrand.p650e.C13002j;
import com.bytedance.ee.larkbrand.p650e.C13004k;
import com.bytedance.ee.larkbrand.p650e.C13013l;
import com.bytedance.ee.larkbrand.p650e.C13015m;
import com.bytedance.ee.larkbrand.p650e.C13016n;
import com.bytedance.ee.larkbrand.p650e.C13018o;
import com.bytedance.ee.larkbrand.p650e.C13019p;
import com.bytedance.ee.larkbrand.p650e.C13021q;
import com.bytedance.ee.larkbrand.p650e.C13023r;
import com.bytedance.ee.larkbrand.p650e.C13024s;
import com.bytedance.ee.larkbrand.p650e.C13032t;
import com.bytedance.ee.larkbrand.p650e.C13035u;
import com.bytedance.ee.larkbrand.p650e.C13037v;
import com.bytedance.ee.larkbrand.p650e.C13038w;
import com.bytedance.ee.larkbrand.utils.C13378v;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.IAppbrandInitializer;
import com.tt.option.C67600c;
import com.tt.p3255a.AbstractC65677b;

/* renamed from: com.bytedance.ee.larkbrand.g */
public class C13061g implements LarkHostDepend, IAppbrandInitializer {

    /* renamed from: a */
    private AbstractC41371j f34716a;

    @Override // com.bytedance.ee.larkbrand.LarkHostDepend
    /* renamed from: b */
    public AbstractC41371j mo48919b() {
        return this.f34716a;
    }

    @Override // com.tt.miniapphost.IAppbrandInitializer
    public AbstractC65677b createEssentialDepend() {
        return new C12992a();
    }

    @Override // com.tt.miniapphost.IAppbrandInitializer
    public boolean isDebug() {
        return C12941a.m53326b();
    }

    @Override // com.bytedance.ee.larkbrand.LarkHostDepend
    /* renamed from: a */
    public EnvInfo mo48917a() {
        EnvInfo g = this.f34716a.mo149022g();
        if (g == null) {
            AppBrandLogger.m52829e("LarkMiniAppInitializer", " envInfo is null");
        }
        return g;
    }

    @Override // com.tt.miniapphost.IAppbrandInitializer
    public C67600c createOptionDepend() {
        C67600c cVar = new C67600c();
        cVar.mo234819a(new C13021q());
        cVar.mo234825a(new C13038w());
        cVar.mo234824a(new C13037v());
        cVar.mo234820a(new C13023r());
        cVar.mo234823a(new C13035u());
        cVar.mo234818a(new C13016n());
        cVar.mo234810a(new C12995c());
        cVar.mo234812a(new C13018o());
        cVar.mo234813a(new C13019p());
        cVar.mo234809a(new C12997e());
        cVar.mo234808a(new C13004k());
        cVar.mo234811a(new C12996d());
        cVar.mo234816a(new C13002j());
        cVar.mo234807a(new C12999g());
        cVar.mo234821a(new C13024s());
        cVar.mo234805a(new C13013l());
        cVar.mo234806a(new C12998f());
        cVar.mo234817a(new C13015m());
        cVar.mo234815a(new C13001i());
        cVar.mo234814a(new C13000h());
        cVar.mo234822a(new C13032t());
        return cVar;
    }

    public C13061g(AbstractC41371j jVar) {
        this.f34716a = jVar;
    }

    @Override // com.bytedance.ee.larkbrand.LarkHostDepend
    /* renamed from: a */
    public String mo48918a(String str) {
        return this.f34716a.mo149023g(str);
    }

    @Override // com.bytedance.ee.larkbrand.LarkHostDepend
    /* renamed from: a */
    public int mo48915a(String str, String str2) {
        return C13378v.m54427a(AppbrandContext.getInst().getApplicationContext(), str, str2);
    }

    @Override // com.bytedance.ee.larkbrand.LarkHostDepend
    /* renamed from: a */
    public Drawable mo48916a(Context context, int i) {
        return context.getResources().getDrawable(i);
    }
}
