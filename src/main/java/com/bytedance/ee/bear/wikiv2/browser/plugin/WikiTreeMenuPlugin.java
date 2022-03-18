package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePluginV2;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;
import com.bytedance.ee.bear.document.FragmentHostAbility;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.p588b.C12194a;
import com.bytedance.ee.bear.wikiv2.p588b.C12198b;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.TitleChangeEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeObserver;
import com.bytedance.ee.bear.wikiv2.wikitreev2.panel.WikiTreePanelDialog;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12480j;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ee.util.p718t.C13737d;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import org.koin.java.KoinJavaComponent;

public class WikiTreeMenuPlugin extends BasePluginV2 implements AbstractC7664b {
    private final C1177w<Boolean> cached = new C1177w<>();
    private final C1177w<Boolean> enable = new C1177w<>();
    private final SimpleListDataChangeCallback listRenameHandler = new SimpleListDataChangeCallback() {
        /* class com.bytedance.ee.bear.wikiv2.browser.plugin.WikiTreeMenuPlugin.BinderC122071 */

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onRename(String str, String str2) {
            if (TextUtils.equals(str, WikiTreeMenuPlugin.this.wikiViewModel.getObjToken())) {
                C13479a.m54764b("WikiTreeMenuPlugin", "List rename found");
                WikiTreeMenuPlugin.this.updateWikiTitle(str2);
            }
        }
    };
    private final C1177w<Integer> loadState = new C1177w<>();
    private LiveData<ConnectionService.NetworkState> networkState;
    private Runnable onBoardingTask;
    private final C1177w<Boolean> showingHistory = new C1177w<>();
    private View treeItemView;
    private C12194a wikiTreeMenuOnBoarding;
    private WikiTreePanelDialog wikiTreePanel;
    public WikiViewModel wikiViewModel;

    private void registerTreeMenuExt() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            WikiTreeMenuExtension.m50884b((BaseActivity) activity).mo46727a(this.wikiViewModel);
        }
    }

    private void init() {
        this.networkState = C5084ad.m20847d().mo20037a();
        this.showingHistory.mo5929b((Boolean) false);
        this.loadState.mo5929b((Integer) 0);
        this.enable.mo5929b((Boolean) true);
        AbstractC68307f<Boolean> a = C12480j.m51929a(this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken()).mo237985a(C11678b.m48481e());
        C1177w<Boolean> wVar = this.cached;
        wVar.getClass();
        a.mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$OcKU0diqEUYDjYL49oa_0iBWLSY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1177w.this.mo5929b((Boolean) obj);
            }
        }, $$Lambda$WikiTreeMenuPlugin$sMVnWFABtzvG5O0_ahai5tlpAg.INSTANCE);
    }

    private void observerTreeMenuEnable() {
        this.networkState.mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiTreeMenuPlugin$OXE_91LgCg1TBrgJdjNM5C7A9rQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                WikiTreeMenuPlugin.this.lambda$observerTreeMenuEnable$1$WikiTreeMenuPlugin((ConnectionService.NetworkState) obj);
            }
        });
        this.showingHistory.mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiTreeMenuPlugin$bkgbBTFIBZfGV4Guy8Tj6tPdLdk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                WikiTreeMenuPlugin.this.lambda$observerTreeMenuEnable$2$WikiTreeMenuPlugin((Boolean) obj);
            }
        });
        this.loadState.mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiTreeMenuPlugin$9l8S1KgnUcBV3wx7adhbuLD1r6I */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                WikiTreeMenuPlugin.this.lambda$observerTreeMenuEnable$3$WikiTreeMenuPlugin((Integer) obj);
            }
        });
        this.enable.mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiTreeMenuPlugin$lHdjzjgIaONupt2hSxexjevogwI */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                WikiTreeMenuPlugin.this.lambda$observerTreeMenuEnable$4$WikiTreeMenuPlugin((Boolean) obj);
            }
        });
        this.cached.mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiTreeMenuPlugin$MyLjwmImYsbge5scukt1h2W0ETs */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                WikiTreeMenuPlugin.this.lambda$observerTreeMenuEnable$5$WikiTreeMenuPlugin((Boolean) obj);
            }
        });
    }

    private View setupTreeMenu() {
        MenuItem menuItem = new MenuItem();
        menuItem.setClickListener(new MenuItem.AbstractC4937a() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$WikiTreeMenuPlugin$w1Y5wQ0J7CK07KDvorvu46TmT4Y */

            @Override // com.bytedance.ee.bear.browser.plugin.MenuItem.AbstractC4937a
            public final void onMenuItemClick(MenuItem menuItem, View view) {
                WikiTreeMenuPlugin.this.lambda$setupTreeMenu$6$WikiTreeMenuPlugin(menuItem, view);
            }
        });
        menuItem.setEnable(C5084ad.m20847d().mo20038b().mo20041b());
        menuItem.setId("wiki_tree_action");
        menuItem.setIcon(C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_treelist_outlined, (int) R.color.facade_selector_icon_n1));
        getTitleBar().mo19514a(Collections.singletonList(menuItem), TitleBar.MenuType.Left);
        return getTitleBar().mo19507a("wiki_tree_action");
    }

    public void showWikiTree() {
        boolean z;
        C13479a.m54764b("WikiTreeMenuPlugin", "showWikiTree. ");
        WikiReportV2.m50926d();
        String spaceId = this.wikiViewModel.getSpaceId();
        if (TextUtils.isEmpty(spaceId)) {
            C13479a.m54764b("WikiTreeMenuPlugin", "showWikiTree, empty spaceId. return. ");
            return;
        }
        if (C12198b.m50805a() || !this.wikiTreeMenuOnBoarding.mo46651b()) {
            z = false;
        } else {
            z = true;
        }
        C13479a.m54764b("WikiTreeMenuPlugin", "showWikiTree, needOnBoarding= " + z);
        this.wikiTreePanel = WikiTreePanelDialog.m51621a(getActivity(), this.wikiViewModel.getSpaceName(), spaceId, this.wikiViewModel.getWikiToken(), z);
    }

    private void updateTreeMenu() {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        if (this.treeItemView != null) {
            boolean equals = Boolean.TRUE.equals(this.showingHistory.mo5927b());
            if (this.networkState.mo5927b() == null || !this.networkState.mo5927b().mo20041b()) {
                z = false;
            } else {
                z = true;
            }
            if (this.loadState.mo5927b() == null || this.loadState.mo5927b().intValue() == -8010 || this.loadState.mo5927b().intValue() == 920004002 || this.loadState.mo5927b().intValue() == -100001) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean equals2 = Boolean.TRUE.equals(this.enable.mo5927b());
            boolean equals3 = Boolean.TRUE.equals(this.cached.mo5927b());
            if (equals || !z2 || !equals2 || (!z && !equals3)) {
                z3 = false;
            } else {
                z3 = true;
            }
            C13479a.m54764b("WikiTreeMenuPlugin", String.format("updateEnableTreeMenu (history:%b,network:%b,loadState:%b,enable:%b)", Boolean.valueOf(equals), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(equals2)));
            if (equals) {
                this.treeItemView.setVisibility(8);
            } else {
                this.treeItemView.setVisibility(0);
                this.treeItemView.setEnabled(z3);
                View view = this.treeItemView;
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                view.setAlpha(f);
            }
            if (z3 && !C12194a.m50787a()) {
                this.onBoardingTask = this.wikiTreeMenuOnBoarding.mo46649a(getUIContainer(), getActivity());
            }
        }
    }

    public /* synthetic */ void lambda$observerTreeMenuEnable$1$WikiTreeMenuPlugin(ConnectionService.NetworkState networkState2) {
        updateTreeMenu();
    }

    public /* synthetic */ void lambda$observerTreeMenuEnable$2$WikiTreeMenuPlugin(Boolean bool) {
        updateTreeMenu();
    }

    public /* synthetic */ void lambda$observerTreeMenuEnable$3$WikiTreeMenuPlugin(Integer num) {
        updateTreeMenu();
    }

    public /* synthetic */ void lambda$observerTreeMenuEnable$4$WikiTreeMenuPlugin(Boolean bool) {
        updateTreeMenu();
    }

    public /* synthetic */ void lambda$observerTreeMenuEnable$5$WikiTreeMenuPlugin(Boolean bool) {
        updateTreeMenu();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        C13479a.m54764b("WikiTreeMenuPlugin", "onDetachFromHost. ");
    }

    public void setEnable(boolean z) {
        this.enable.mo5929b(Boolean.valueOf(z));
    }

    public void setLoadState(int i) {
        this.loadState.mo5929b(Integer.valueOf(i));
    }

    public void setShowingHistory(boolean z) {
        this.showingHistory.mo5929b(Boolean.valueOf(z));
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        C13479a.m54764b("WikiTreeMenuPlugin", "onAttachToHost. ");
        WikiViewModel hVar = (WikiViewModel) C4950k.m20479a(eVar, WikiViewModel.class, WikiViewModel.newFactory(((FragmentHostAbility) getHostAbility(FragmentHostAbility.class)).mo23794b().getArguments()));
        this.wikiViewModel = hVar;
        this.wikiTreeMenuOnBoarding = new C12194a(this, hVar);
        init();
        observerTreeMenuEnable();
    }

    public void updateWikiTitle(String str) {
        if (str == null) {
            C13479a.m54775e("WikiTreeMenuPlugin", "updateWikiTitle, wiki title is null");
            return;
        }
        C13479a.m54772d("WikiTreeMenuPlugin", "updateWikiTitle, title= " + C13721c.m55650d(str));
        WikiTreeObserver.f33320a.mo47313e().mo47278a(new TitleChangeEvent(this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken(), str));
    }

    public /* synthetic */ void lambda$setupTreeMenu$6$WikiTreeMenuPlugin(MenuItem menuItem, View view) {
        if (C13737d.m55692a()) {
            showWikiTree();
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31508b(this.listRenameHandler);
        Runnable runnable = this.onBoardingTask;
        if (runnable != null) {
            C13742g.m55710c(runnable);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        this.wikiTreePanel = WikiTreePanelDialog.m51620a(getActivity());
        this.treeItemView = setupTreeMenu();
        registerTreeMenuExt();
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31483a(this.listRenameHandler);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
        C13479a.m54764b("WikiTreeMenuPlugin", "onActivityResult. requestCode: " + i + ", resultCode: " + i2);
        WikiTreePanelDialog aVar = this.wikiTreePanel;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }
}
