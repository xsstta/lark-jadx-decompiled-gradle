package com.larksuite.component.openplatform.core.component.render;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.bytedance.ee.ref.card.p686a.AbstractC13508d;
import com.bytedance.ee.ref.card.p686a.C13505b;
import com.bytedance.ee.ref.card.p686a.C13507c;
import com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a;
import com.tt.refer.common.util.C67866g;

/* renamed from: com.larksuite.component.openplatform.core.component.render.b */
public class C24441b extends AbstractC13508d implements AbstractC24363a {

    /* renamed from: a */
    private IAppContext f60310a;

    /* renamed from: e */
    private Context f60311e;

    @Override // com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a
    /* renamed from: a */
    public void mo87119a(Object obj) {
    }

    @Override // com.larksuite.component.openplatform.api.lifecycle.AbstractC24378a
    /* renamed from: d */
    public void mo87158d() {
    }

    @Override // com.larksuite.component.openplatform.api.lifecycle.AbstractC24378a
    /* renamed from: e */
    public void mo87159e() {
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a
    public View ag_() {
        return this.f35595c;
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a
    /* renamed from: a */
    public void mo87118a() {
        mo50226a((CardAppInfo) null);
    }

    @Override // com.larksuite.component.openplatform.api.lifecycle.AbstractC24378a
    /* renamed from: f */
    public void mo87160f() {
        this.f60311e = null;
        IAppContext iAppContext = this.f60310a;
        if (iAppContext != null) {
            iAppContext.destroy();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d
    /* renamed from: b */
    public String mo50228b() {
        CardAppInfo cardAppInfo;
        if (this.f35595c == null || (cardAppInfo = this.f35595c.getCardAppInfo()) == null) {
            return "";
        }
        return cardAppInfo.getIdentifier();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d
    /* renamed from: a */
    public void mo50226a(CardAppInfo cardAppInfo) {
        if (this.f35595c != null) {
            this.f35595c.mo50236a(cardAppInfo);
            return;
        }
        mo50254a((AbstractC13508d.AbstractC13510b) new AbstractC13508d.AbstractC13510b() {
            /* class com.larksuite.component.openplatform.core.component.render.C24441b.C244421 */

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: a */
            public void mo50261a() {
                AppBrandLogger.m52830i("OPCardRenderImpl", "onLoadSuccess");
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: a */
            public void mo50262a(String str) {
                AppBrandLogger.m52830i("OPCardRenderImpl", "onPageStart:" + str);
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: b */
            public void mo50263b(String str) {
                AppBrandLogger.m52830i("OPCardRenderImpl", "onLoadFailed:" + str);
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: c */
            public void mo50264c(String str) {
                AppBrandLogger.m52830i("OPCardRenderImpl", "onReceivedError:" + str);
            }
        });
        C13507c cVar = new C13507c();
        cVar.mo50249a(cardAppInfo);
        this.f35595c = cVar.mo50248a(this.f60311e, this.f60310a);
        for (AbstractC13508d.AbstractC13510b bVar : this.f35596d) {
            if (bVar != null) {
                this.f35595c.mo50235a(bVar);
            }
        }
    }

    public C24441b(Context context, IAppContext iAppContext) {
        this.f60311e = context;
        this.f60310a = iAppContext;
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a
    /* renamed from: a */
    public void mo87120a(final String str, final Object obj) {
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.component.render.C24441b.RunnableC244443 */

            public void run() {
                String str;
                C13505b bVar = C24441b.this.f35595c;
                String str2 = str;
                Object obj = obj;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = "";
                }
                bVar.mo50238a(str2, str);
            }
        });
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a
    /* renamed from: a */
    public void mo87121a(final byte[] bArr, final Object obj) {
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.component.render.C24441b.RunnableC244432 */

            public void run() {
                String str;
                C13505b bVar = C24441b.this.f35595c;
                byte[] bArr = bArr;
                Object obj = obj;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = "";
                }
                bVar.mo50240a(bArr, str);
            }
        });
    }
}
