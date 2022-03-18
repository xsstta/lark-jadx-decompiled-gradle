package com.bytedance.ee.bear.middleground.permission.collaborator.manager;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9753a;
import com.bytedance.ee.bear.middleground.permission.lock.LockBannerView;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a */
public abstract class AbstractC9726a implements AbstractC9751b {

    /* renamed from: a */
    protected Context f26245a;

    /* renamed from: b */
    protected C10917c f26246b;

    /* renamed from: c */
    protected AbstractC9753a f26247c;

    /* renamed from: d */
    protected DocPermSetInfo f26248d;

    /* renamed from: e */
    protected AbstractC9751b.AbstractC9752a f26249e;

    /* renamed from: f */
    protected AccountService.Account f26250f;

    /* renamed from: g */
    protected Locale f26251g;

    /* renamed from: h */
    private final C7718l f26252h;

    /* renamed from: i */
    private final View f26253i;

    /* renamed from: j */
    private BaseTitleBar f26254j;

    /* renamed from: k */
    private SmartRefreshLayout f26255k;

    /* renamed from: l */
    private ConnectionService.NetworkState f26256l;

    /* renamed from: m */
    private boolean f26257m;

    /* renamed from: n */
    private LockBannerView f26258n;

    /* renamed from: c */
    public abstract AbstractC9753a mo37148c();

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b
    /* renamed from: d */
    public void mo37149d() {
        this.f26258n.mo37767a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b
    /* renamed from: e */
    public void mo37150e() {
        this.f26258n.mo37769b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b
    /* renamed from: a */
    public void mo37140a() {
        SmartRefreshLayout smartRefreshLayout = this.f26255k;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.mo96416n();
        } else {
            C13479a.m54764b("BaseCollaboratorManageView", "finishLoadMore()...mSmartRefreshLayout is null");
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("BaseCollaboratorManageView", "destroy()...");
        this.f26249e = null;
    }

    /* renamed from: f */
    private void m40273f() {
        this.f26250f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        this.f26251g = C4484g.m18494b().mo17253d();
    }

    /* renamed from: g */
    private void m40274g() {
        C5084ad.m20847d().mo20037a().mo5923a(this.f26252h, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.$$Lambda$a$0NicJuCeAixSL8FkHAKn_u4K3HY */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC9726a.lambda$0NicJuCeAixSL8FkHAKn_u4K3HY(AbstractC9726a.this, (ConnectionService.NetworkState) obj);
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("BaseCollaboratorManageView", "create()...");
        m40273f();
        mo37147b();
        m40274g();
    }

    /* renamed from: h */
    private void m40275h() {
        boolean z;
        ConnectionService.NetworkState networkState;
        SmartRefreshLayout smartRefreshLayout = this.f26255k;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.mo96434w();
            SmartRefreshLayout smartRefreshLayout2 = this.f26255k;
            if (!this.f26257m || (networkState = this.f26256l) == null || !networkState.mo20041b()) {
                z = false;
            } else {
                z = true;
            }
            smartRefreshLayout2.mo96415m(z);
            return;
        }
        C13479a.m54764b("BaseCollaboratorManageView", "setEnableLoadMore()...mSmartRefreshLayout is null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37147b() {
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f26253i.findViewById(R.id.doc_permission_manage_title_bar);
        this.f26254j = baseTitleBar;
        baseTitleBar.setActionIconTint(R.color.icon_n1);
        this.f26254j.mo45070a(new BaseTitleBar.C11803d(R.drawable.ud_icon_member_add_outlined) {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9726a.C97271 */

            @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
            /* renamed from: a */
            public void mo16854a(View view) {
                super.mo16854a(view);
                if (AbstractC9726a.this.f26249e != null) {
                    AbstractC9726a.this.f26249e.mo37189a();
                }
            }
        });
        this.f26254j.setLeftClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9726a.C97282 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (AbstractC9726a.this.f26249e != null) {
                    AbstractC9726a.this.f26249e.mo37192b();
                }
            }
        });
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f26253i.findViewById(R.id.share_collaborator_refresh_layout);
        this.f26255k = smartRefreshLayout;
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(this.f26245a));
        this.f26255k.mo96368b(new AbstractC27137a() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.$$Lambda$a$DUWvK1cdKyTCkMEVbHAdQ4ykRf0 */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public final void onLoadmore(AbstractC27129h hVar) {
                AbstractC9726a.lambda$DUWvK1cdKyTCkMEVbHAdQ4ykRf0(AbstractC9726a.this, hVar);
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.f26253i.findViewById(R.id.doc_permission_collaborator_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(this.f26245a));
        AbstractC9753a c = mo37148c();
        this.f26247c = c;
        recyclerView.setAdapter(c);
        this.f26258n = (LockBannerView) this.f26253i.findViewById(R.id.lockBanner);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC9751b.AbstractC9752a aVar) {
        this.f26249e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40272a(AbstractC27129h hVar) {
        AbstractC9751b.AbstractC9752a aVar = this.f26249e;
        if (aVar != null) {
            aVar.mo37191a(hVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40271a(ConnectionService.NetworkState networkState) {
        C13479a.m54764b("BaseCollaboratorManageView", "observeNetwork()...networkState = " + networkState);
        this.f26256l = networkState;
        m40275h();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b
    /* renamed from: a */
    public void mo37143a(CharSequence charSequence) {
        this.f26254j.setTitle(charSequence);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b
    /* renamed from: a */
    public void mo37145a(List<UserInfo> list) {
        AbstractC9753a aVar = this.f26247c;
        if (aVar != null) {
            aVar.mo70690f(list);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b
    /* renamed from: a */
    public void mo37146a(boolean z) {
        C13479a.m54764b("BaseCollaboratorManageView", "setHasMore()...hasMore = " + z);
        this.f26257m = z;
        m40275h();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b
    /* renamed from: a */
    public void mo37141a(int i, UserInfo userInfo) {
        AbstractC9753a aVar = this.f26247c;
        if (aVar != null) {
            aVar.mo70664a(i, userInfo);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9751b
    /* renamed from: a */
    public void mo37144a(String str, boolean z, View.OnClickListener onClickListener) {
        this.f26258n.mo37768a(str, z, onClickListener);
    }

    public AbstractC9726a(Context context, C10917c cVar, C7718l lVar, View view, DocPermSetInfo docPermSetInfo) {
        this.f26245a = context;
        this.f26246b = cVar;
        this.f26252h = lVar;
        this.f26253i = view;
        this.f26248d = docPermSetInfo;
    }
}
