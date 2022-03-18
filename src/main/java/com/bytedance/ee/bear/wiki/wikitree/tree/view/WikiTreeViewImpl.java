package com.bytedance.ee.bear.wiki.wikitree.tree.view;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.DialogC0259b;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.bizwidget.C4878c;
import com.bytedance.ee.bear.facade.common.empty.C7690d;
import com.bytedance.ee.bear.facade.common.empty.C7692e;
import com.bytedance.ee.bear.facade.common.empty.EmptyView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7732b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.p567a.C11816b;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.common.widget.InterceptableRecyclerView;
import com.bytedance.ee.bear.wiki.homepage.WikiCreateTypeSelector;
import com.bytedance.ee.bear.wiki.search.C12033c;
import com.bytedance.ee.bear.wiki.search.SearchMode;
import com.bytedance.ee.bear.wiki.search.WikiSearchView;
import com.bytedance.ee.bear.wiki.wikitree.WikiEmptyViewConfig;
import com.bytedance.ee.bear.wiki.wikitree.WikiTreeEmptyView;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeViewImpl;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class WikiTreeViewImpl extends FrameLayout implements AbstractC12177b {

    /* renamed from: a */
    public AbstractC12177b.AbstractC12178a f32763a;

    /* renamed from: b */
    public FragmentActivity f32764b;

    /* renamed from: c */
    public C10917c f32765c;

    /* renamed from: d */
    public WikiTreeView f32766d;

    /* renamed from: e */
    public C7690d f32767e;

    /* renamed from: f */
    private String f32768f = "Wiki_WikiTreeViewImpl";

    /* renamed from: g */
    private String f32769g = "";

    /* renamed from: h */
    private WikiTreeType f32770h;

    /* renamed from: i */
    private FrameLayout f32771i;

    /* renamed from: j */
    private DialogC0259b f32772j;

    /* renamed from: k */
    private C11811a f32773k;

    /* renamed from: l */
    private C4878c f32774l;

    /* renamed from: m */
    private WikiTreeEmptyView f32775m;

    /* renamed from: n */
    private WikiSearchView f32776n;

    /* renamed from: o */
    private boolean f32777o;

    /* renamed from: p */
    private boolean f32778p;

    /* renamed from: q */
    private Runnable f32779q = new Runnable() {
        /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeViewImpl.RunnableC121721 */

        public void run() {
            WikiTreeViewImpl.this.f32767e.mo30158a(new C7692e.C7695b(0));
        }
    };

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m50638m();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: a */
    public void mo46563a(String str) {
        this.f32766d.mo46534a(str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: a */
    public void mo46565a(List<TreeNode> list) {
        this.f32766d.mo46536a(list);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: a */
    public void mo46564a(String str, boolean z) {
        this.f32766d.mo46535a(str, z);
    }

    /* renamed from: a */
    public void mo46562a(TreeNode treeNode, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        FragmentActivity fragmentActivity = this.f32764b;
        if (fragmentActivity != null) {
            C11811a a = C11811a.m48976a(fragmentActivity);
            this.f32773k = a;
            if (this.f32777o) {
                a.mo45215a(R.string.Doc_Wiki_RemoveAlertConfirm, onClickListener);
            }
            if (this.f32778p) {
                this.f32773k.mo45215a(R.string.Doc_Wiki_MoveTo, onClickListener2);
            }
            this.f32773k.mo45226b(C11816b.m49006a().mo45254a((CharSequence) this.f32764b.getResources().getString(R.string.Doc_Widget_Cancel)).mo45251a(this.f32764b.getResources().getColor(R.color.function_danger_500)).mo45257a());
            this.f32773k.mo45217a(new DialogInterface.OnDismissListener(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$CSuvz_ZkzZd5nOWSGBYkcxCIu8 */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    WikiTreeViewImpl.m270094lambda$CSuvz_ZkzZd5nOWSGBYkcxCIu8(WikiTreeViewImpl.this, this.f$1, dialogInterface);
                }
            });
            this.f32773k.mo45231c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m50641p() {
        this.f32763a.mo46468r();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m50642q() {
        this.f32763a.mo46469s();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m50643r() {
        this.f32763a.mo46470t();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m50644s() {
        this.f32763a.mo46467q();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m50645t() {
        this.f32763a.mo46468r();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m50646u() {
        this.f32763a.mo46465o();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: b */
    public void mo46566b() {
        m50639n();
        m50640o();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: c */
    public void mo46571c() {
        this.f32776n.mo45987a();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: d */
    public void mo46573d() {
        this.f32776n.mo46008l();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: e */
    public void mo46576e() {
        this.f32776n.mo46014p();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: g */
    public void mo46578g() {
        this.f32766d.stopScroll();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: h */
    public void mo46579h() {
        this.f32776n.mo46006j();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: i */
    public void mo46580i() {
        this.f32776n.mo46009m();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: j */
    public void mo46581j() {
        this.f32776n.mo45994c();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: k */
    public void mo46582k() {
        this.f32776n.mo45996e();
    }

    /* renamed from: n */
    private void m50639n() {
        DialogC0259b bVar = this.f32772j;
        if (bVar != null && bVar.isShowing()) {
            this.f32772j.dismiss();
        }
    }

    /* renamed from: o */
    private void m50640o() {
        C11811a aVar = this.f32773k;
        if (aVar != null && aVar.mo45233e()) {
            this.f32773k.mo45232d();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        mo46566b();
        this.f32763a = null;
        this.f32764b = null;
        this.f32765c = null;
        this.f32766d.setListener(null);
        this.f32766d = null;
        C13748k.m55735c(this.f32779q);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: f */
    public void mo46577f() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32771i.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        this.f32771i.setLayoutParams(layoutParams);
    }

    /* renamed from: l */
    private void m50637l() {
        View.inflate(getContext(), R.layout.wiki_tree_layout, this);
        this.f32771i = (FrameLayout) findViewById(R.id.wiki_tree_view);
        this.f32766d = (WikiTreeView) findViewById(R.id.bear_wiki_tree_rl_content);
        this.f32775m = (WikiTreeEmptyView) findViewById(R.id.list_no_data_tip);
        this.f32767e = new C7690d(getContext(), this.f32775m, this.f32766d);
        WikiSearchView wikiSearchView = (WikiSearchView) findViewById(R.id.wiki_tree_search_view);
        this.f32776n = wikiSearchView;
        wikiSearchView.mo45988a(0);
        C7732b.m30927a(this.f32766d, "bear_wiki_tree_view");
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: a */
    public void mo46557a() {
        C4878c cVar = this.f32774l;
        if (cVar != null && cVar.mo19129a()) {
            this.f32774l.mo19130b();
        }
    }

    /* renamed from: m */
    private void m50638m() {
        SearchMode searchMode;
        this.f32766d.setListener(new C12173a());
        this.f32775m.setConfig(new WikiEmptyViewConfig(getContext(), C4484g.m18494b().mo17252c()).mo46257a().invoke());
        this.f32775m.setOnRetryListener(new EmptyView.AbstractC7668a() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$tPACJgWszRTzD_XpLctHm_dQxRg */

            @Override // com.bytedance.ee.bear.facade.common.empty.EmptyView.AbstractC7668a
            public final void onFailedRetry() {
                WikiTreeViewImpl.lambda$tPACJgWszRTzD_XpLctHm_dQxRg(WikiTreeViewImpl.this);
            }
        });
        if (this.f32770h == WikiTreeType.NEW_TO || this.f32770h == WikiTreeType.MOV_TO) {
            searchMode = SearchMode.TREE_SEARCH_OPERATION_MODE;
        } else {
            searchMode = SearchMode.TREE_SEARCH_SCAN_MODE;
        }
        this.f32776n.mo45990a(this.f32765c, this.f32764b, searchMode);
        this.f32776n.setOnCancelInputClickListener(new WikiSearchView.AbstractC12023b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$lO8lP1DBcIlzMDjUVLtxMpzJhAA */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12023b
            public final void onCancelInputClick() {
                WikiTreeViewImpl.lambda$lO8lP1DBcIlzMDjUVLtxMpzJhAA(WikiTreeViewImpl.this);
            }
        });
        this.f32776n.setOnSearchEditTextClickListener(new WikiSearchView.AbstractC12028g() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$BoAniOdi6DxNSQXnUF9mCQW5_A */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12028g
            public final void onSearchTextViewClick() {
                WikiTreeViewImpl.m270093lambda$BoAniOdi6DxNSQXnUF9mCQW5_A(WikiTreeViewImpl.this);
            }
        });
        this.f32776n.setOnInputSearchKeyListener(new WikiSearchView.AbstractC12026e() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$GpcUZ_GKY7h8y2qy9K0izCJ02Kg */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12026e
            public final void onInputSearchKey(String str) {
                WikiTreeViewImpl.lambda$GpcUZ_GKY7h8y2qy9K0izCJ02Kg(WikiTreeViewImpl.this, str);
            }
        });
        this.f32776n.setOnPullUpSearchMoreListener(new WikiSearchView.AbstractC12027f() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$QdADzrLUhBgwNK4g8GsIp8fhnXE */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12027f
            public final void onPullUpSearchMore() {
                WikiTreeViewImpl.lambda$QdADzrLUhBgwNK4g8GsIp8fhnXE(WikiTreeViewImpl.this);
            }
        });
        this.f32776n.setOnCancelSearchClickListener(new WikiSearchView.AbstractC12025d() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$G3CHVhLnDnB14lcmVIAe7W8Nc */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12025d
            public final void onCancelSearchClick() {
                WikiTreeViewImpl.m270095lambda$G3CHVhLnDnB14lcmVIAe7W8Nc(WikiTreeViewImpl.this);
            }
        });
        this.f32776n.setOnCancelQueryListener(new WikiSearchView.AbstractC12024c() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$pSffAKQS8XvoEfPgz3Nqr3G3v24 */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12024c
            public final void onCancelQuery() {
                WikiTreeViewImpl.lambda$pSffAKQS8XvoEfPgz3Nqr3G3v24(WikiTreeViewImpl.this);
            }
        });
        this.f32776n.setSearchResultItemClickListener(new WikiSearchView.AbstractC12029h() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$2twNZChvMYAehps36c6Fw15_qnk */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12029h
            public final void onSearchItemClick(String str, String str2, String str3, int i) {
                WikiTreeViewImpl.lambda$2twNZChvMYAehps36c6Fw15_qnk(WikiTreeViewImpl.this, str, str2, str3, i);
            }
        });
        this.f32776n.setKeyBoardHeightChangeListener(this.f32764b);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setEnableActionMove(boolean z) {
        this.f32778p = z;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setEnableActionRemove(boolean z) {
        this.f32777o = z;
    }

    public void setViewDelegate(AbstractC12177b.AbstractC12178a aVar) {
        this.f32763a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeViewImpl$a */
    public class C12173a implements WikiTreeView.AbstractC12170b {
        private C12173a() {
        }

        @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.AbstractC12170b
        /* renamed from: a */
        public void mo46553a(TreeNode treeNode) {
            WikiTreeViewImpl.this.f32763a.mo46439a(treeNode);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m50674a(TreeNode treeNode, View view) {
            C11933b.m49474a(WikiTreeViewImpl.this.f32765c, "click_move", WikiTreeViewImpl.this.f32766d.getFocusItem(), treeNode.wiki_token);
            WikiTreeViewImpl.this.f32763a.mo46449c(treeNode);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m50676c(TreeNode treeNode, View view) {
            C11933b.m49477a(WikiTreeViewImpl.this.f32765c, "confirm_to_remove_public", WikiTreeViewImpl.this.f32766d.getFocusItem(), treeNode.wiki_token, treeNode.level, false, null);
            WikiTreeViewImpl.this.f32763a.mo46446b(treeNode);
        }

        @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.AbstractC12170b
        /* renamed from: b */
        public void mo46556b(TreeNode treeNode, boolean z) {
            C11933b.m49477a(WikiTreeViewImpl.this.f32765c, "swipe_page", WikiTreeViewImpl.this.f32766d.getFocusItem(), treeNode.wiki_token, treeNode.level, false, null);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m50675b(TreeNode treeNode, View view) {
            C11933b.m49477a(WikiTreeViewImpl.this.f32765c, "click_remove_public", WikiTreeViewImpl.this.f32766d.getFocusItem(), treeNode.wiki_token, treeNode.level, false, null);
            WikiTreeViewImpl.this.mo46560a(new View.OnClickListener(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$a$ToNbcew48Xu3DVtA7flmXb8BQVo */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    WikiTreeViewImpl.C12173a.lambda$ToNbcew48Xu3DVtA7flmXb8BQVo(WikiTreeViewImpl.C12173a.this, this.f$1, view);
                }
            });
        }

        @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.AbstractC12170b
        /* renamed from: a */
        public void mo46554a(TreeNode treeNode, int i) {
            if (i == R.id.swipe_menu_add) {
                WikiCreateTypeSelector.m49553a(WikiTreeViewImpl.this.f32765c, WikiTreeViewImpl.this.f32764b, new WikiCreateTypeSelector.SelectorResultHandler(treeNode) {
                    /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$a$kkAHGm1VYbwCzaW_fbi1NysyvM */
                    public final /* synthetic */ TreeNode f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.bytedance.ee.bear.wiki.homepage.WikiCreateTypeSelector.SelectorResultHandler
                    public final void onCreateTypeSelected(int i, String str) {
                        WikiTreeViewImpl.C12173a.m270097lambda$kkAHGm1VYbwCzaW_fbi1NysyvM(WikiTreeViewImpl.C12173a.this, this.f$1, i, str);
                    }
                });
            } else if (i == R.id.swipe_menu_more) {
                WikiTreeViewImpl.this.mo46562a(treeNode, new View.OnClickListener(treeNode) {
                    /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$a$jgON5vWmo_qVH4TOzNx5Xfjyfq8 */
                    public final /* synthetic */ TreeNode f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        WikiTreeViewImpl.C12173a.lambda$jgON5vWmo_qVH4TOzNx5Xfjyfq8(WikiTreeViewImpl.C12173a.this, this.f$1, view);
                    }
                }, new View.OnClickListener(treeNode) {
                    /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$a$lFsuto3b2sUDwuOtmgMkLuoB7xw */
                    public final /* synthetic */ TreeNode f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        WikiTreeViewImpl.C12173a.lambda$lFsuto3b2sUDwuOtmgMkLuoB7xw(WikiTreeViewImpl.C12173a.this, this.f$1, view);
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.AbstractC12170b
        /* renamed from: a */
        public void mo46555a(TreeNode treeNode, boolean z) {
            C11933b.m49475a(WikiTreeViewImpl.this.f32765c, "node_expand_change", WikiTreeViewImpl.this.f32766d.getFocusItem(), treeNode.wiki_token, treeNode.level);
            if (z) {
                WikiTreeViewImpl.this.f32763a.mo46462d(treeNode);
            } else {
                WikiTreeViewImpl.this.f32763a.mo46463e(treeNode);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m50673a(TreeNode treeNode, int i, String str) {
            C11933b.m49476a(WikiTreeViewImpl.this.f32765c, "create_new_from_pages", WikiTreeViewImpl.this.f32766d.getFocusItem(), treeNode.wiki_token, i, treeNode.level, false, C8275a.m34050a(i));
            WikiTreeViewImpl.this.f32763a.mo46440a(treeNode, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m50636f(String str) {
        this.f32763a.a_(str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setDisableItem(String str) {
        this.f32766d.setDisableItem(str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setEnableHomeSwipe(boolean z) {
        this.f32766d.setEnableHomeSwipe(z);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setEnableMenuItemAdd(boolean z) {
        this.f32766d.setEnableMenuItemAdd(z);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setEnableMenuItemClick(boolean z) {
        this.f32766d.setEnableMenuItemClick(z);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setEnableMenuItemMore(boolean z) {
        this.f32766d.setEnableMenuItemMore(z);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setEnableSwipeMenu(boolean z) {
        this.f32766d.setEnableSwipeMenu(z);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setFocusItem(String str) {
        this.f32766d.setFocusItem(str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setRefreshLayoutEnableLoadMore(boolean z) {
        this.f32776n.setRefreshLayoutEnableLoadMore(z);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setSearchEnabled(boolean z) {
        this.f32776n.setSearchTextViewEnabled(z);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setSearchNoResultViewPosition(int i) {
        this.f32776n.setTreePanelNoResultViewPosition(i);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setTouchInterceptor(InterceptableRecyclerView.AbstractC11939a aVar) {
        this.f32766d.setTouchInterceptor(aVar);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setWikiTreeFlingListener(RecyclerView.AbstractC1337f fVar) {
        this.f32766d.setOnFlingListener(fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50633a(View view) {
        this.f32763a.mo46466p();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: c */
    public void mo46572c(String str) {
        this.f32766d.mo46538b(str, false);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: d */
    public void mo46574d(String str) {
        this.f32766d.m50593e(str);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setSearchVisible(boolean z) {
        int i;
        WikiSearchView wikiSearchView = this.f32776n;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        wikiSearchView.setVisibility(i);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setWikiTreeVisible(boolean z) {
        int i;
        FrameLayout frameLayout = this.f32771i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    public WikiTreeViewImpl(Context context) {
        super(context);
        m50637l();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: b */
    public void mo46569b(String str) {
        this.f32766d.mo46538b(str, true);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    public void setTagSuffix(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f32768f = String.format("%s_%s", this.f32768f, str);
            this.f32769g = str;
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: b */
    public void mo46570b(List<C12033c> list) {
        this.f32776n.mo45992a(list);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: b */
    public void mo46567b(int i) {
        C13748k.m55735c(this.f32779q);
        if (i == 2) {
            this.f32767e.mo30158a(new C7692e.C7695b(2));
        } else if (i == 0) {
            C13748k.m55733a(this.f32779q, 400);
        } else if (i == 99) {
            this.f32767e.mo30158a(new C7692e.C7695b(99));
            setSearchVisible(false);
        } else if (i == 5) {
            this.f32767e.mo30158a(new C7692e.C7695b(5));
            setSearchVisible(false);
            this.f32775m.setNoFoundClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$mqCS1bquUrVAaTd1MP02EJqH84 */

                public final void onClick(View view) {
                    WikiTreeViewImpl.m270096lambda$mqCS1bquUrVAaTd1MP02EJqH84(WikiTreeViewImpl.this, view);
                }
            });
        } else {
            this.f32767e.mo30158a(new C7692e.C7695b(3));
            setSearchVisible(false);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: e */
    public List<Integer> mo46575e(String str) {
        ArrayList arrayList = new ArrayList(3);
        int[] iArr = {0, 0};
        RecyclerView.ViewHolder a = this.f32766d.mo46533a(this.f32766d.mo46540d(str));
        if (a == null) {
            C13479a.m54758a(this.f32768f, "find aim view holden by wikiToken failed, holder == null");
            return arrayList;
        }
        a.itemView.getLocationOnScreen(iArr);
        int measuredHeight = a.itemView.getMeasuredHeight();
        if (iArr[1] > 0) {
            arrayList.add(Integer.valueOf(iArr[0]));
            arrayList.add(Integer.valueOf(iArr[1]));
            arrayList.add(Integer.valueOf(measuredHeight));
        }
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: a */
    public void mo46558a(int i) {
        if (this.f32774l == null) {
            this.f32774l = new C4878c(this.f32764b);
        }
        if (!this.f32774l.mo19129a()) {
            this.f32774l.mo19131b(i);
            this.f32774l.mo19132c();
        }
    }

    /* renamed from: a */
    public void mo46560a(View.OnClickListener onClickListener) {
        m50640o();
        FragmentActivity fragmentActivity = this.f32764b;
        if (fragmentActivity != null) {
            DialogC25637f b = new C25639g(fragmentActivity).mo89263v(R.color.bg_body).mo89256o(R.color.text_title).mo89253l(8388611).mo89254m(R.string.Doc_Wiki_RemoveAlertText).mo89248g(R.string.Doc_Wiki_RemoveAlertTitle).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89257p(17).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Doc_Wiki_Cancel).mo89267a((DialogInterface.OnClickListener) null).mo89271d(R.color.text_title)).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Doc_Wiki_RemoveAlertConfirm).mo89267a(new DialogInterface.OnClickListener(onClickListener) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeViewImpl$bgqMWqTaqoOKm0zvKHgvpBzefWU */
                public final /* synthetic */ View.OnClickListener f$0;

                {
                    this.f$0 = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    WikiTreeViewImpl.lambda$bgqMWqTaqoOKm0zvKHgvpBzefWU(this.f$0, dialogInterface, i);
                }
            }).mo89271d(R.color.function_danger_500)).mo89233b();
            this.f32772j = b;
            b.show();
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: b */
    public void mo46568b(int i, int i2) {
        FragmentActivity fragmentActivity = this.f32764b;
        if (fragmentActivity != null) {
            Toast.showFailureText(fragmentActivity, fragmentActivity.getResources().getString(i), i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50634a(TreeNode treeNode, DialogInterface dialogInterface) {
        WikiTreeView wikiTreeView = this.f32766d;
        if (wikiTreeView != null) {
            wikiTreeView.mo46538b(treeNode.wiki_token, false);
        }
    }

    public WikiTreeViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m50637l();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: a */
    public void mo46559a(int i, int i2) {
        FragmentActivity fragmentActivity = this.f32764b;
        if (fragmentActivity != null) {
            Toast.showSuccessText(fragmentActivity, fragmentActivity.getResources().getString(i), i2);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b
    /* renamed from: a */
    public void mo46561a(FragmentActivity fragmentActivity, C10917c cVar, WikiTreeType wikiTreeType) {
        this.f32764b = fragmentActivity;
        this.f32765c = cVar;
        this.f32770h = wikiTreeType;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50635a(String str, String str2, String str3, int i) {
        this.f32763a.mo46460a(str, str2);
    }
}
