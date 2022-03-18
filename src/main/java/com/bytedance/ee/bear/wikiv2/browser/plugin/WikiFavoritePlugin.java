package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.content.Intent;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePluginV2;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.document.FragmentHostAbility;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.DoFavoriteEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeObserver;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.FavoritePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.UnfavoritePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiAction;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiTips;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

public class WikiFavoritePlugin extends BasePluginV2 implements AbstractC7664b {
    private C68289a disposables = new C68289a();
    private WikiViewModel wikiViewModel;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void favorite() {
        boolean z;
        WikiReportV2.m50909a("file_star", this.wikiViewModel.getWikiToken(), this.wikiViewModel.getWikiToken(), Integer.valueOf(this.wikiViewModel.getObjTypeValue()));
        String spaceId = this.wikiViewModel.getSpaceId();
        String wikiToken = this.wikiViewModel.getWikiToken();
        if (this.wikiViewModel.getWikiMeta() == null || !this.wikiViewModel.getWikiMeta().isShortcut()) {
            z = false;
        } else {
            z = true;
        }
        WikiReportV2.m50913a("star_page", "none", spaceId, wikiToken, Boolean.valueOf(z), this.wikiViewModel.getObjToken(), this.wikiViewModel.getObjTypeValueString());
        this.disposables.mo237937a(C12455c.m51801l((NetService) KoinJavaComponent.m268610a(NetService.class)).pull(new FavoritePuller.Params(this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken())).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiFavoritePlugin$OvnAiLj8mt23ENqNs_wB4BgE1U */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiFavoritePlugin.this.lambda$favorite$0$WikiFavoritePlugin((Boolean) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiFavoritePlugin$8CZMdP2WzJwMiv_OaWpFMTmcLM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiFavoritePlugin.this.lambda$favorite$1$WikiFavoritePlugin((Throwable) obj);
            }
        }));
    }

    public void unfavorite() {
        boolean z;
        WikiReportV2.m50909a("file_unstar", this.wikiViewModel.getWikiToken(), this.wikiViewModel.getWikiToken(), Integer.valueOf(this.wikiViewModel.getObjTypeValue()));
        String spaceId = this.wikiViewModel.getSpaceId();
        String wikiToken = this.wikiViewModel.getWikiToken();
        if (this.wikiViewModel.getWikiMeta() == null || !this.wikiViewModel.getWikiMeta().isShortcut()) {
            z = false;
        } else {
            z = true;
        }
        WikiReportV2.m50913a("unstar_page", "none", spaceId, wikiToken, Boolean.valueOf(z), this.wikiViewModel.getObjToken(), this.wikiViewModel.getObjTypeValueString());
        this.disposables.mo237937a(C12455c.m51800k((NetService) KoinJavaComponent.m268610a(NetService.class)).pull(new UnfavoritePuller.Params(this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken())).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiFavoritePlugin$TekvAcj2SC8IaG7XKfluEYOf4A */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiFavoritePlugin.this.lambda$unfavorite$2$WikiFavoritePlugin((Boolean) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiFavoritePlugin$pUM1qkMe5MzdMDiFHDhGfZbgYGs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiFavoritePlugin.this.lambda$unfavorite$3$WikiFavoritePlugin((Throwable) obj);
            }
        }));
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        this.disposables.mo237935a();
    }

    public /* synthetic */ void lambda$favorite$0$WikiFavoritePlugin(Boolean bool) throws Exception {
        notifyDoFavorite(true);
        Toast.showSuccessText(getHost().mo19562e(), WikiTips.f33454a.mo47516b(WikiAction.FAVORITE));
    }

    public /* synthetic */ void lambda$favorite$1$WikiFavoritePlugin(Throwable th) throws Exception {
        C13479a.m54759a("WikiStarPlugin", "wiki favorite fail. ", th);
        Toast.showFailureText(getHost().mo19562e(), WikiTips.f33454a.mo47515a(WikiAction.FAVORITE, th));
    }

    public /* synthetic */ void lambda$unfavorite$2$WikiFavoritePlugin(Boolean bool) throws Exception {
        notifyDoFavorite(false);
        Toast.showSuccessText(getHost().mo19562e(), WikiTips.f33454a.mo47516b(WikiAction.UNFAVORITE));
    }

    public /* synthetic */ void lambda$unfavorite$3$WikiFavoritePlugin(Throwable th) throws Exception {
        C13479a.m54759a("WikiStarPlugin", "wiki unfavorite fail. ", th);
        Toast.showFailureText(getHost().mo19562e(), WikiTips.f33454a.mo47515a(WikiAction.UNFAVORITE, th));
    }

    private void notifyDoFavorite(boolean z) {
        TreeNode wikiMeta = this.wikiViewModel.getWikiMeta();
        if (wikiMeta != null) {
            wikiMeta.is_star = z;
        }
        WikiTreeObserver.f33320a.mo47312d().mo47278a(new DoFavoriteEvent(this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken(), z));
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        C13479a.m54764b("WikiStarPlugin", "onAttachToHost. ");
        this.wikiViewModel = (WikiViewModel) C4950k.m20479a(eVar, WikiViewModel.class, WikiViewModel.newFactory(((FragmentHostAbility) getHostAbility(FragmentHostAbility.class)).mo23794b().getArguments()));
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
    }
}
