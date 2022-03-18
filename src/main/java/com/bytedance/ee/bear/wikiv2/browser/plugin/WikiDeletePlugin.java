package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.content.Intent;
import android.view.View;
import com.bytedance.ee.bear.bizwidget.C4878c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePluginV2;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.document.FragmentHostAbility;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.DelNodePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiAction;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiTips;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiDialogs;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70022d;

public class WikiDeletePlugin extends BasePluginV2 implements AbstractC7664b {
    private C68289a disposables = new C68289a();
    private C4878c loadingDialog;
    private WikiDialogs wikiDialogs;
    private WikiViewModel wikiViewModel;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public /* synthetic */ void lambda$null$1$WikiDeletePlugin() throws Exception {
        this.loadingDialog.mo19130b();
    }

    public void delete() {
        boolean z;
        if (this.wikiViewModel.getWikiMeta() == null || !this.wikiViewModel.getWikiMeta().isShortcut()) {
            z = false;
        } else {
            z = true;
        }
        String spaceId = this.wikiViewModel.getSpaceId();
        String wikiToken = this.wikiViewModel.getWikiToken();
        WikiReportV2.m50909a("click_delete_in_more", wikiToken, wikiToken, Integer.valueOf(this.wikiViewModel.getObjTypeValue()));
        WikiReportV2.m50913a("delete", "ccm_wiki_delete_confirm_view", spaceId, wikiToken, Boolean.valueOf(z), this.wikiViewModel.getObjToken(), this.wikiViewModel.getObjTypeValueString());
        this.wikiDialogs.mo47800a(getContext(), z, new View.OnClickListener(wikiToken, spaceId) {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiDeletePlugin$TC_sJjNa7Wy7goemuEIZFRSmQrg */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                WikiDeletePlugin.this.lambda$delete$4$WikiDeletePlugin(this.f$1, this.f$2, view);
            }
        });
    }

    public /* synthetic */ void lambda$null$0$WikiDeletePlugin(AbstractC70022d dVar) throws Exception {
        this.loadingDialog.mo19132c();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        this.disposables.mo237935a();
    }

    public /* synthetic */ void lambda$null$2$WikiDeletePlugin(DelNodePuller.Result result) throws Exception {
        Toast.showSuccessText(getContext(), WikiTips.f33454a.mo47516b(WikiAction.DEL));
        getActivity().finish();
    }

    public /* synthetic */ void lambda$null$3$WikiDeletePlugin(Throwable th) throws Exception {
        Toast.showFailureText(getContext(), WikiTips.f33454a.mo47515a(WikiAction.DEL, th));
        C13479a.m54759a("WikiDeletePlugin", "WikiTreeModel.remove, remove fail. ", th);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        C13479a.m54764b("WikiDeletePlugin", "onAttachToHost. ");
        this.wikiViewModel = (WikiViewModel) C4950k.m20479a(eVar, WikiViewModel.class, WikiViewModel.newFactory(((FragmentHostAbility) getHostAbility(FragmentHostAbility.class)).mo23794b().getArguments()));
        this.wikiDialogs = new WikiDialogs();
        C4878c cVar = new C4878c(getContext());
        this.loadingDialog = cVar;
        cVar.mo19131b(WikiTips.f33454a.mo47514a(WikiAction.DEL));
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
    }

    public /* synthetic */ void lambda$delete$4$WikiDeletePlugin(String str, String str2, View view) {
        WikiReportV2.m50909a("confirm_delete", str, str, Integer.valueOf(this.wikiViewModel.getObjTypeValue()));
        this.disposables.mo237937a(C12455c.m51792c((NetService) KoinJavaComponent.m268610a(NetService.class)).pull(new DelNodePuller.Params(str2, str, String.valueOf(System.currentTimeMillis()))).mo238013c(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiDeletePlugin$a3IAsP9tQfdqQofqNp0aAw62SqI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiDeletePlugin.this.lambda$null$0$WikiDeletePlugin((AbstractC70022d) obj);
            }
        }).mo237995a(new AbstractC68309a() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiDeletePlugin$TZG6QXgZxUGvXLs8TozbRZjLDzE */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                WikiDeletePlugin.this.lambda$null$1$WikiDeletePlugin();
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiDeletePlugin$GWiJ5vPGdskhJhP5sj91iH7pRE0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiDeletePlugin.this.lambda$null$2$WikiDeletePlugin((DelNodePuller.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiDeletePlugin$CzRlBPlFOmUft2LdT7lUQCeTdXg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiDeletePlugin.this.lambda$null$3$WikiDeletePlugin((Throwable) obj);
            }
        }));
    }
}
