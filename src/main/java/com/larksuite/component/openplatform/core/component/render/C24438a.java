package com.larksuite.component.openplatform.core.component.render;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a;
import com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24368a;
import com.larksuite.component.openplatform.core.component.render.impl.blockit.C24446b;
import com.larksuite.component.openplatform.core.component.render.impl.blockit.C24447c;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.util.C67866g;

/* renamed from: com.larksuite.component.openplatform.core.component.render.a */
public class C24438a implements AbstractC24363a, AbstractC24364a {

    /* renamed from: a */
    public C24447c f60301a;

    /* renamed from: b */
    private IAppContext f60302b;

    /* renamed from: c */
    private Context f60303c;

    @Override // com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a
    /* renamed from: b */
    public void mo87125b() {
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a
    /* renamed from: a */
    public void mo87118a() {
        m89129g();
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a
    public View ag_() {
        return this.f60301a.mo87257j();
    }

    @Override // com.larksuite.component.openplatform.api.lifecycle.AbstractC24378a
    /* renamed from: d */
    public void mo87158d() {
        C24447c cVar = this.f60301a;
        if (cVar != null) {
            cVar.mo87255h();
        }
    }

    @Override // com.larksuite.component.openplatform.api.lifecycle.AbstractC24378a
    /* renamed from: e */
    public void mo87159e() {
        C24447c cVar = this.f60301a;
        if (cVar != null) {
            cVar.mo87256i();
        }
    }

    @Override // com.larksuite.component.openplatform.api.lifecycle.AbstractC24378a
    /* renamed from: f */
    public void mo87160f() {
        this.f60301a.mo87254g();
        this.f60303c = null;
    }

    /* renamed from: g */
    private void m89129g() {
        if (this.f60301a == null) {
            C24446b bVar = new C24446b();
            if (this.f60302b == null || !HostDependManager.getInst().getFeatureGating("openplatform.block.enable.multicontext", false)) {
                bVar.mo87241a(String.valueOf(C25529d.m91128a()));
            } else {
                bVar.mo87241a(this.f60302b.getAppIdentify());
            }
            this.f60301a = bVar.mo87239a(this.f60303c, this.f60302b);
        }
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a
    /* renamed from: a */
    public void mo87123a(AbstractC24368a aVar) {
        if (aVar != null) {
            aVar.mo87134a();
        }
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a
    /* renamed from: a */
    public void mo87119a(Object obj) {
        if (obj == null) {
            AppBrandLogger.m52829e("OP_SDK_OPBlockitRenderImpl", "updateData error : no data");
            return;
        }
        C24447c cVar = this.f60301a;
        if (cVar != null) {
            cVar.mo87245a(obj.toString());
        }
    }

    public C24438a(Context context, IAppContext iAppContext) {
        this.f60303c = context;
        this.f60302b = iAppContext;
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a
    /* renamed from: a */
    public void mo87120a(final String str, final Object obj) {
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.component.render.C24438a.RunnableC244402 */

            public void run() {
                String str;
                C24447c cVar = C24438a.this.f60301a;
                String str2 = str;
                Object obj = obj;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = "";
                }
                cVar.mo87246a(str2, str);
            }
        });
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a
    /* renamed from: a */
    public void mo87124a(String str, String str2) {
        C24447c cVar = this.f60301a;
        if (cVar != null) {
            cVar.mo87248b(str, str2);
        }
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a
    /* renamed from: a */
    public void mo87121a(final byte[] bArr, final Object obj) {
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.component.render.C24438a.RunnableC244391 */

            public void run() {
                String str;
                AppBrandLogger.m52830i("OP_SDK_OPBlockitRenderImpl", "initWorkerData:", obj);
                C24447c cVar = C24438a.this.f60301a;
                byte[] bArr = bArr;
                Object obj = obj;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = "";
                }
                cVar.mo87247a(bArr, str);
            }
        });
    }
}
