package com.bytedance.ee.bear.wiki.browser.plugin;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;
import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.wiki.C12008i;
import com.bytedance.ee.bear.wiki.p577b.C11905a;
import com.bytedance.ee.bear.wiki.p577b.C11909b;
import com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b;
import com.bytedance.ee.bear.wiki.wikitree.C12076c;
import com.bytedance.ee.bear.wiki.wikitree.DialogInterface$OnDismissListenerC12118j;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12136e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import java.util.Collections;
import org.koin.java.KoinJavaComponent;

public class WikiTreeMenuPlugin extends DocumentPlugin implements AbstractC7664b {
    public final C1177w<Boolean> enable = new C1177w<>();
    private final SimpleListDataChangeCallback listRenameHandler = new SimpleListDataChangeCallback() {
        /* class com.bytedance.ee.bear.wiki.browser.plugin.WikiTreeMenuPlugin.BinderC119181 */

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onRename(String str, String str2) {
            if (TextUtils.equals(str, WikiTreeMenuPlugin.this.getDocViewModel().getToken())) {
                C13479a.m54764b("WikiTreeMenuPlugin", "List rename found");
                WikiTreeMenuPlugin.this.updateWikiTitle(str2);
            }
        }
    };
    public final C1177w<Integer> loadState = new C1177w<>();
    private LiveData<ConnectionService.NetworkState> networkState;
    private Runnable onBoardingTask;
    private final C1177w<Boolean> showingHistory = new C1177w<>();
    private View treeItemView;
    private boolean wikiInfoLoadCompleted;
    private C11905a wikiTreeOnBoarding;
    AbstractC12071b wikiTreePanel;
    private C12008i wikiViewModel;

    private Context appContext() {
        return getContext().getApplicationContext();
    }

    public static class WikiTreeItemEnableInfo implements NonProguard {
        public boolean enable;

        public String toString() {
            return "WikiTreeItemEnableInfo{enable=" + this.enable + '}';
        }
    }

    private View setupTreeMenu() {
        MenuItem menuItem = new MenuItem();
        menuItem.setClickListener(new MenuItem.AbstractC4937a() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$WikiTreeMenuPlugin$GIn4PAr8egYvxfy1nHJU_JkxHv0 */

            @Override // com.bytedance.ee.bear.browser.plugin.MenuItem.AbstractC4937a
            public final void onMenuItemClick(MenuItem menuItem, View view) {
                WikiTreeMenuPlugin.this.lambda$setupTreeMenu$5$WikiTreeMenuPlugin(menuItem, view);
            }
        });
        menuItem.setEnable(C5084ad.m20847d().mo20038b().mo20041b());
        menuItem.setId("wiki_tree_action");
        menuItem.setIcon(C13747j.m55724a(getContext(), (int) R.drawable.ud_icon_treelist_outlined, (int) R.color.facade_selector_icon_n1));
        getTitleBar().mo19514a(Collections.singletonList(menuItem), TitleBar.MenuType.Left);
        return getTitleBar().mo19507a("wiki_tree_action");
    }

    /* access modifiers changed from: package-private */
    public void treeSync() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("treeSync, send tree changed, wikiTreePanel is null= ");
        if (this.wikiTreePanel == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("WikiTreeMenuPlugin", sb.toString());
        AbstractC12071b bVar = this.wikiTreePanel;
        if (bVar == null || !bVar.mo46212d(this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken())) {
            C12076c.m49999a(appContext(), this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken(), (C12136e) null);
        } else {
            C12076c.m49999a(appContext(), this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken(), this.wikiTreePanel.mo46203a(this.wikiViewModel.getSpaceId()));
        }
    }

    private void updateTreeMenu() {
        boolean z;
        boolean z2;
        boolean z3;
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
        if (equals || !z || !z2 || !equals2) {
            z3 = false;
        } else {
            z3 = true;
        }
        C13479a.m54764b("WikiTreeMenuPlugin", String.format("updateEnableTreeMenu (history:%b,network:%b,loadState:%b,enable:%b)", Boolean.valueOf(equals), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(equals2)));
        if (equals) {
            this.treeItemView.setVisibility(8);
        } else {
            this.treeItemView.setVisibility(0);
            this.treeItemView.setEnabled(equals2);
        }
        if (z3 && !C11905a.m49372a() && this.treeItemView != null) {
            this.onBoardingTask = this.wikiTreeOnBoarding.mo45783a(getUIContainer(), getActivity());
        }
    }

    public void showWikiTree() {
        boolean z;
        C13479a.m54764b("WikiTreeMenuPlugin", "showPanelView wikiTreePanel=" + this.wikiTreePanel);
        if (this.wikiTreePanel == null) {
            DialogInterface$OnDismissListenerC12118j jVar = new DialogInterface$OnDismissListenerC12118j((BaseActivity) getActivity(), ((C6095s) getHost()).mo24601p(), this.wikiViewModel);
            this.wikiTreePanel = jVar;
            jVar.mo46204a();
            this.wikiTreePanel.mo46206a(new AbstractC12071b.AbstractC12072a() {
                /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$WikiTreeMenuPlugin$j9wsiYKjtSfreLpTxJAZsME00NA */

                @Override // com.bytedance.ee.bear.wiki.wikitree.AbstractC12071b.AbstractC12072a
                public final void onHomePageChange(HomePage homePage) {
                    WikiTreeMenuPlugin.this.lambda$showWikiTree$1$WikiTreeMenuPlugin(homePage);
                }
            });
        }
        boolean z2 = true;
        if (C11905a.m49372a()) {
            z = !C11909b.m49389a();
        } else {
            if (!this.wikiInfoLoadCompleted || C11909b.m49389a()) {
                z2 = false;
            }
            z = z2;
        }
        C13479a.m54764b("WikiTreeMenuPlugin", "needSwipeLeftOnBoarding= " + z);
        if (z) {
            this.wikiTreePanel.mo46210b(this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken());
        } else {
            this.wikiTreePanel.mo46207a(this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken());
        }
    }

    public /* synthetic */ void lambda$observerTreeMenuEnable$2$WikiTreeMenuPlugin(ConnectionService.NetworkState networkState2) {
        updateTreeMenu();
    }

    public /* synthetic */ void lambda$observerTreeMenuEnable$3$WikiTreeMenuPlugin(Integer num) {
        updateTreeMenu();
    }

    public /* synthetic */ void lambda$observerTreeMenuEnable$4$WikiTreeMenuPlugin(Boolean bool) {
        updateTreeMenu();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.browser.plugin.WikiTreeMenuPlugin$a */
    public class C11920a implements AbstractC7945d<WikiTreeItemEnableInfo> {
        private C11920a() {
        }

        /* renamed from: a */
        public void handle(WikiTreeItemEnableInfo wikiTreeItemEnableInfo, AbstractC7947h hVar) {
            C13479a.m54764b("WikiTreeMenuPlugin", "SetWikiTreeEnable:" + wikiTreeItemEnableInfo);
            if (wikiTreeItemEnableInfo != null) {
                WikiTreeMenuPlugin.this.enable.mo5929b(Boolean.valueOf(wikiTreeItemEnableInfo.enable));
            }
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$0$WikiTreeMenuPlugin(Void r2) {
        C13479a.m54764b("WikiTreeMenuPlugin", "onWikiInfoLoadCompleted, hidePanel now. ");
        this.wikiInfoLoadCompleted = true;
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        treeSync();
    }

    private void observerTreeMenuEnable(C6095s sVar) {
        LiveData<ConnectionService.NetworkState> a = C5084ad.m20847d().mo20037a();
        this.networkState = a;
        a.mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$WikiTreeMenuPlugin$k7m8ELjjVIJ8L8RaF8juLLdprRM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                WikiTreeMenuPlugin.this.lambda$observerTreeMenuEnable$2$WikiTreeMenuPlugin((ConnectionService.NetworkState) obj);
            }
        });
        sVar.mo24600o().mo23796a(new AbstractC5887o.C5889b() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.WikiTreeMenuPlugin.C119192 */

            @Override // com.bytedance.ee.bear.document.AbstractC5887o.C5889b, com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
            public void onLoadSuccess() {
                WikiTreeMenuPlugin.this.loadState.mo5929b((Integer) 0);
            }

            @Override // com.bytedance.ee.bear.document.AbstractC5887o.C5889b, com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
            public void onLoadFail(int i, Throwable th) {
                WikiTreeMenuPlugin.this.loadState.mo5929b(Integer.valueOf(i));
            }
        });
        this.loadState.mo5929b((Integer) 0);
        this.loadState.mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$WikiTreeMenuPlugin$G_BxGTnBHMe0IPwBBB3TzTMnr4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                WikiTreeMenuPlugin.this.lambda$observerTreeMenuEnable$3$WikiTreeMenuPlugin((Integer) obj);
            }
        });
        this.enable.mo5929b((Boolean) true);
        this.enable.mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$WikiTreeMenuPlugin$UCaLu8P58Vnk1B6XLurdjkmWLc */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                WikiTreeMenuPlugin.this.lambda$observerTreeMenuEnable$4$WikiTreeMenuPlugin((Boolean) obj);
            }
        });
        C1177w<Boolean> isShowingHistory = sVar.mo24598m().isShowingHistory();
        LifecycleOwner lifecycleOwner = getLifecycleOwner();
        C1177w<Boolean> wVar = this.showingHistory;
        wVar.getClass();
        isShowingHistory.mo5923a(lifecycleOwner, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$VDSDoDPA22BjY3wGSGGBrrOftgc */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C1177w.this.mo5929b((Boolean) obj);
            }
        });
        this.showingHistory.mo5929b((Boolean) false);
    }

    public /* synthetic */ void lambda$showWikiTree$1$WikiTreeMenuPlugin(HomePage homePage) {
        if (TextUtils.equals(this.wikiViewModel.getSpaceId(), homePage.getSpaceId())) {
            this.wikiViewModel.setHomePage(homePage);
            C13479a.m54764b("WikiTreeMenuPlugin", "onHomePageChange, set homepage success. ");
        } else {
            C13479a.m54764b("WikiTreeMenuPlugin", "onHomePageChange, ignore set homepage. ");
        }
        if (TextUtils.isEmpty(this.wikiViewModel.getSpaceId())) {
            C13479a.m54764b("WikiTreeMenuPlugin", "onHomePageChange, set space success. ");
            this.wikiViewModel.setSpaceId(homePage.getSpaceId());
            return;
        }
        C13479a.m54764b("WikiTreeMenuPlugin", "onHomePageChange, ignore set space id. ");
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C12008i iVar = (C12008i) C4950k.m20479a(sVar, C12008i.class, C12008i.newFactory(((C6095s) getHost()).mo24597l().getArguments()));
        this.wikiViewModel = iVar;
        this.wikiTreeOnBoarding = new C11905a(this, iVar);
        this.wikiViewModel.getWikiInfoLoadCompletedLiveData().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$WikiTreeMenuPlugin$GZrn_xqpOrFaizkGjC6gxcKmhJw */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                WikiTreeMenuPlugin.this.lambda$onAttachToHost$0$WikiTreeMenuPlugin((Void) obj);
            }
        });
        observerTreeMenuEnable(sVar);
        bindBridgeHandler("biz.wiki.setWikiTreeEnable", new C11920a());
        treeSync();
    }

    public void updateWikiTitle(String str) {
        if (str == null) {
            C13479a.m54775e("WikiTreeMenuPlugin", "updateWikiTitle, wiki title is null");
            return;
        }
        C13479a.m54772d("WikiTreeMenuPlugin", "updateWikiTitle, title= " + C13721c.m55650d(str));
        C12076c.m50000a(appContext(), this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken(), str);
        AbstractC12071b bVar = this.wikiTreePanel;
        if (bVar != null) {
            bVar.mo46208a(this.wikiViewModel.getSpaceId(), this.wikiViewModel.getWikiToken(), str);
        } else {
            C13479a.m54764b("WikiTreeMenuPlugin", "updateWikiTitle, update wiki title, wiki tree panel not opened. ");
        }
    }

    public /* synthetic */ void lambda$setupTreeMenu$5$WikiTreeMenuPlugin(MenuItem menuItem, View view) {
        showWikiTree();
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        this.treeItemView = setupTreeMenu();
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31483a(this.listRenameHandler);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31508b(this.listRenameHandler);
        AbstractC12071b bVar = this.wikiTreePanel;
        if (bVar != null) {
            bVar.mo46209b();
            this.wikiTreePanel = null;
        }
        Runnable runnable = this.onBoardingTask;
        if (runnable != null) {
            C13742g.m55710c(runnable);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
        AbstractC12071b bVar = this.wikiTreePanel;
        if (bVar != null) {
            bVar.mo46205a(i, i2, intent);
        }
    }
}
