package com.ss.android.lark.integrator.ccm.config.p2013g;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.lark.AbstractC8027d;
import com.bytedance.ee.bear.lark.C7983b;
import com.bytedance.ee.bear.lark.tab.AbstractC8129a;
import com.bytedance.ee.bear.list.p422a.C8143b;
import com.bytedance.ee.bear.list.preload.C8672e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.al;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.integrator.ccm.p2006c.C39242e;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57840j;
import io.reactivex.functions.Consumer;

/* renamed from: com.ss.android.lark.integrator.ccm.config.g.a */
public class C39267a extends AbstractC8129a implements AbstractC44552i.AbstractC44555c {

    /* renamed from: e */
    private AbstractC8027d f100590e;

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44555c
    /* renamed from: s */
    public void mo103434s() {
        this.f100590e = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m154879o() {
        C8672e.m36232a(this.f21707a).mo33678a((C8672e.AbstractC8673a) null);
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i, com.bytedance.ee.bear.lark.tab.AbstractC8129a
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        AbstractC8027d dVar = this.f100590e;
        if (dVar == null) {
            return null;
        }
        return dVar.mo30958a();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i, com.bytedance.ee.bear.lark.tab.AbstractC8129a
    /* renamed from: n */
    public void mo31323n() {
        C13479a.m54764b("DocTabPageSpec", "reload");
        if (mo31318i() instanceof AbstractC8027d) {
            this.f100590e.mo30964b();
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i, com.bytedance.ee.bear.lark.tab.AbstractC8129a
    /* renamed from: i */
    public Fragment mo31318i() {
        C39242e.m154771a().mo143080a(this.f21707a, 0);
        C8143b.m32605a().mo31462a("doc_sdk_init");
        if (this.f100590e == null) {
            this.f100590e = new C7983b();
            if (this.f21709c != null) {
                this.f100590e.mo30962a(this.f21709c, new View.OnClickListener() {
                    /* class com.ss.android.lark.integrator.ccm.config.p2013g.$$Lambda$a$xWeDMtKgbB57h8O6SB1qfA4UBjk */

                    public final void onClick(View view) {
                        C39267a.lambda$xWeDMtKgbB57h8O6SB1qfA4UBjk(C39267a.this, view);
                    }
                });
            }
            CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
                /* class com.ss.android.lark.integrator.ccm.config.p2013g.$$Lambda$a$1EEWrjhCPpnjYpl5N7ArzgLidA0 */

                public final void run() {
                    C39267a.lambda$1EEWrjhCPpnjYpl5N7ArzgLidA0(C39267a.this);
                }
            });
            C57840j.m224506b().mo196190b("doc").subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.integrator.ccm.config.p2013g.C39267a.C392681 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                }
            });
        }
        AbstractC8027d dVar = this.f100590e;
        if (dVar instanceof Fragment) {
            return (Fragment) dVar;
        }
        C13479a.m54764b("DocTabPageSpec", "getPageContent()...docMainTabFragment = " + this.f100590e);
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i, com.bytedance.ee.bear.lark.tab.AbstractC8129a
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
        if (bundle != null) {
            mo31318i();
            bundle.getInt("key_doc_tab_index", -1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m154878a(View view) {
        al.m95028a().mo93366a("key_space_search_title", this.f21709c.mo99195c());
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openSearchMainPageFromSpace(this.f21707a, "", "key_space_search_title", this.f21709c.mo99189a());
    }

    public C39267a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        super(context, eVar, iTitleController);
    }
}
