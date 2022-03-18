package com.ss.android.lark.integrator.ccm.config.p2013g;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.bear.contract.route.parcelable.AbstractC5226b;
import com.bytedance.ee.bear.integrator.wiki.C7926a;
import com.bytedance.ee.bear.lark.tab.wiki.WikiNavigationTabView;
import com.bytedance.ee.bear.lark.tab.wiki.WikiTabView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.al;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.integrator.ccm.p2006c.C39242e;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57840j;

/* renamed from: com.ss.android.lark.integrator.ccm.config.g.b */
public class C39269b implements AbstractC44552i, AbstractC44552i.AbstractC44555c {

    /* renamed from: a */
    public C7926a f100592a;

    /* renamed from: b */
    public WikiTabView f100593b;

    /* renamed from: c */
    private Context f100594c;

    /* renamed from: d */
    private int f100595d = 1;

    /* renamed from: e */
    private WikiNavigationTabView f100596e;

    /* renamed from: f */
    private AbstractC44548e f100597f;

    /* renamed from: g */
    private ITitleController f100598g;

    /* renamed from: h */
    private AbstractC44552i.AbstractC44553a f100599h = new AbstractC44552i.AbstractC44553a() {
        /* class com.ss.android.lark.integrator.ccm.config.p2013g.C39269b.C392701 */

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            boolean equals = TextUtils.equals("wiki", str);
            boolean equals2 = TextUtils.equals("wiki", str2);
            if (equals2 && !TextUtils.equals(str, str2)) {
                TabType tabType = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getTabType("wiki");
                if (C39269b.this.f100592a != null) {
                    C39269b.this.f100592a.mo30784a(tabType);
                }
                C13479a.m54764b("WikiTabPageSec", "afterPageSwitch enter wiki ");
            }
            if (C39269b.this.f100593b != null) {
                if (equals && !equals2) {
                    C39269b.this.f100593b.mo110683b();
                }
                if (!equals && equals2) {
                    C39269b.this.f100593b.mo110677a();
                }
            }
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m154886a(Boolean bool) throws Exception {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "wiki";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
        this.f100592a = null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44555c
    /* renamed from: s */
    public void mo103434s() {
        this.f100592a = null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return this.f100595d;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f100599h;
    }

    /* renamed from: o */
    private WikiTabView m154887o() {
        return new WikiTabView(this.f100594c);
    }

    /* renamed from: p */
    private WikiNavigationTabView m154888p() {
        return new WikiNavigationTabView(this.f100594c);
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        if (this.f100593b == null) {
            this.f100593b = m154887o();
        }
        return this.f100593b;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        if (this.f100596e == null) {
            this.f100596e = m154888p();
        }
        return this.f100596e;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
        C13479a.m54764b("WikiTabPageSec", "reload");
        mo31318i().mo30785b();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        C7926a aVar = this.f100592a;
        if (aVar == null || aVar.mo30781a() == null) {
            return null;
        }
        return this.f100592a.mo30781a();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m154889q() {
        al.m95028a().mo93366a("key_wiki_search_title", this.f100598g.mo99195c());
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openSearchMainPageFromWiki(this.f100594c, "", "key_wiki_search_title", this.f100598g.mo99189a());
    }

    /* renamed from: a */
    public C7926a mo31318i() {
        C39242e.m154771a().mo143080a(this.f100594c, 0);
        if (this.f100592a == null) {
            this.f100592a = new C7926a();
            C57840j.m224506b().mo196190b("doc").subscribe($$Lambda$b$Wb9Yf6snzZX49VsKWVZOV7mkNGk.INSTANCE);
            this.f100592a.mo30783a(this.f100598g);
            this.f100592a.mo30782a(new AbstractC5226b.AbstractC5227a() {
                /* class com.ss.android.lark.integrator.ccm.config.p2013g.$$Lambda$b$WtxS8H20p72ZYYw2Sdkylnd91Fk */

                @Override // com.bytedance.ee.bear.contract.route.parcelable.AbstractC5226b.AbstractC5227a
                public final void onClickSearchBtn() {
                    C39269b.this.m154889q();
                }
            });
        }
        return this.f100592a;
    }

    public C39269b(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        this.f100594c = context;
        this.f100597f = eVar;
        this.f100598g = iTitleController;
    }
}
