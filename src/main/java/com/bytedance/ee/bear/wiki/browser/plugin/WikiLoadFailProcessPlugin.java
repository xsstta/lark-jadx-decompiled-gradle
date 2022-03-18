package com.bytedance.ee.bear.wiki.browser.plugin;

import android.content.Context;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.route.parcelable.WikiRouteBean;
import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.loading.LoadingFailedPlugin;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wiki.AbstractC11940d;
import com.bytedance.ee.bear.wiki.C12008i;
import com.bytedance.ee.bear.wiki.p578c.C11927a;
import com.bytedance.ee.bear.wiki.wikitree.C12076c;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

public class WikiLoadFailProcessPlugin extends LoadingFailedPlugin {
    private C12008i wikiViewModel;

    static /* synthetic */ void lambda$syncNodeRemove$2(AbstractC11940d dVar) throws Exception {
    }

    private Context appContext() {
        return getContext().getApplicationContext();
    }

    public void syncNodeRemove() {
        ((C6095s) getHost()).mo19549a(WikiTreeMenuPlugin.class, new AbstractC4942d() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$WikiLoadFailProcessPlugin$h9mRPgPXQ8ODHp5O07F2Fgi2bI */

            @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
            public final void onPluginFound(AbstractC4941c cVar) {
                WikiLoadFailProcessPlugin.this.lambda$syncNodeRemove$0$WikiLoadFailProcessPlugin((WikiTreeMenuPlugin) cVar);
            }
        });
        C12076c.m49998a(appContext(), this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken());
        Disposable b = ((C6095s) getHost()).mo24601p().mo41505a(AbstractC11940d.class, C11678b.m48479c()).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$WikiLoadFailProcessPlugin$3INGbJrfpm_jqAoiaWVgs5mJG0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiLoadFailProcessPlugin.this.lambda$syncNodeRemove$1$WikiLoadFailProcessPlugin((AbstractC11940d) obj);
            }
        }).mo238001b($$Lambda$WikiLoadFailProcessPlugin$PlR4GyG_ZYuA4ztsocglNEiwnV4.INSTANCE, $$Lambda$WikiLoadFailProcessPlugin$iS2EIS4bYFnUZmBSuntKmTth2xs.INSTANCE);
        C13479a.m54764b("WikiFailRetryPlugin", "disposable = " + b);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.browser.plugin.WikiLoadFailProcessPlugin$a */
    public class C11915a extends AbstractC5887o.C5889b {
        private C11915a() {
        }

        @Override // com.bytedance.ee.bear.document.AbstractC5887o.C5889b, com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
        public void onLoadFail(int i, Throwable th) {
            if (i == -8010 || i == 920004002) {
                WikiLoadFailProcessPlugin.this.syncNodeRemove();
            }
        }
    }

    public /* synthetic */ void lambda$syncNodeRemove$1$WikiLoadFailProcessPlugin(AbstractC11940d dVar) throws Exception {
        dVar.notifyWikiNodeRemoved(this.wikiViewModel.getWikiToken(), this.wikiViewModel.getSpaceId());
    }

    public /* synthetic */ void lambda$syncNodeRemove$0$WikiLoadFailProcessPlugin(WikiTreeMenuPlugin wikiTreeMenuPlugin) {
        if (wikiTreeMenuPlugin.wikiTreePanel != null) {
            C13479a.m54764b("WikiFailRetryPlugin", "syncNodeRemove wikiToken=" + C13721c.m55650d(this.wikiViewModel.getWikiToken()));
            wikiTreeMenuPlugin.wikiTreePanel.mo46211c(this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken());
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.wikiViewModel = (C12008i) C4950k.m20479a(sVar, C12008i.class, C12008i.newFactory(((C6095s) getHost()).mo24597l().getArguments()));
        sVar.mo24600o().mo23796a(new C11915a());
    }

    @Override // com.bytedance.ee.bear.document.loading.LoadingFailedPlugin, com.bytedance.ee.bear.document.loading.LoadingLayout.AbstractC5864a
    public void onFailedRetry(int i) {
        if (i == 920004002) {
            HomePage homePage = this.wikiViewModel.getHomePage();
            C13479a.m54764b("WikiFailRetryPlugin", "Handle wiki not exist , has home page?" + homePage);
            if (homePage != null) {
                gotoWikiHome(this.wikiViewModel.getSpaceId(), homePage.getWikiToken());
                return;
            }
            return;
        }
        super.onFailedRetry(i);
    }

    private void gotoWikiHome(String str, String str2) {
        C13479a.m54764b("WikiFailRetryPlugin", "gotoWikiHome");
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(C11927a.m49455a(str2), new WikiRouteBean(str, false));
    }
}
