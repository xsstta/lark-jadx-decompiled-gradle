package com.bytedance.ee.bear.todocenter.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.C1363f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bizwidget.C4878c;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.NoNetworkView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.CircleRefreshHeader;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.todocenter.C11688b;
import com.bytedance.ee.bear.todocenter.entity.TodoList;
import com.bytedance.ee.bear.todocenter.push.AbstractC11709b;
import com.bytedance.ee.bear.todocenter.push.C11710c;
import com.bytedance.ee.bear.todocenter.template.C11717b;
import com.bytedance.ee.bear.todocenter.template.entity.TodoTemplateEntity;
import com.bytedance.ee.bear.todocenter.ui.C11728b;
import com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment;
import com.bytedance.ee.bear.todocenter.ui.entity.EmptyTodoEntity;
import com.bytedance.ee.bear.todocenter.ui.entity.SectionUIEntity;
import com.bytedance.ee.bear.todocenter.ui.entity.TodoUIEntity;
import com.bytedance.ee.bear.todocenter.ui.p566b.AbstractC11735a;
import com.bytedance.ee.bear.todocenter.ui.widget.TodoEmptyView;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.chad.library.adapter.base.entity.AbstractC20930c;
import com.larksuite.suite.R;
import com.oubowu.stickyitemdecoration.AbstractC26971a;
import com.oubowu.stickyitemdecoration.C26972b;
import com.oubowu.stickyitemdecoration.StickyHeadContainer;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27139c;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

public class TodoCenterFragment extends C7667e implements AbstractC11709b {

    /* renamed from: a */
    public SmartRefreshLayout f31509a;

    /* renamed from: b */
    public BaseRecyclerView f31510b;

    /* renamed from: c */
    public C11736c f31511c;

    /* renamed from: d */
    public C11717b f31512d;

    /* renamed from: e */
    public C4878c f31513e;

    /* renamed from: f */
    public StickyHeadContainer f31514f;

    /* renamed from: g */
    public final C68289a f31515g = new C68289a();

    /* renamed from: h */
    private TodoEmptyView f31516h;

    /* renamed from: i */
    private C11728b f31517i;

    /* renamed from: j */
    private NoNetworkView f31518j;

    /* renamed from: k */
    private boolean f31519k;

    /* renamed from: l */
    private Boolean f31520l;

    /* renamed from: m */
    private C11710c f31521m;

    /* renamed from: n */
    private AccountService.AccountChangeUICallback f31522n;

    /* renamed from: a */
    public void mo44882a() {
        if (this.f31511c != null) {
            C13479a.m54764b("TodoCenterFragment", "updateData ==");
            m48616i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48592a(boolean z, TodoUIEntity todoUIEntity, Throwable th) throws Exception {
        C13479a.m54761a("TodoCenterFragment", th);
        if (th instanceof NetService.ServerErrorException) {
            int code = ((NetService.ServerErrorException) th).getCode();
            if (code == 3001) {
                Toast.showFailureText(getActivity(), (int) R.string.CreationMobile_Docs_TaskCenter_NoPermission_Toast);
                m48590a(z, todoUIEntity);
            } else if (code == 3000) {
                Toast.showFailureText(getActivity(), (int) R.string.CreationMobile_Docs_TaskCenter_Deleted_Tooltip);
                m48590a(z, todoUIEntity);
            } else {
                Toast.showFailureText(getActivity(), (int) R.string.Doc_Facade_OperateFailed);
                this.f31517i.mo44901a(true, todoUIEntity, true);
            }
        } else {
            Toast.showFailureText(getActivity(), (int) R.string.Doc_Facade_OperateFailed);
            this.f31517i.mo44901a(true, todoUIEntity, true);
        }
    }

    /* renamed from: a */
    public void mo44883a(int i) {
        this.f31517i.mo44896a(i, (C11728b.AbstractC11734d) new C11728b.AbstractC11734d() {
            /* class com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment.C117247 */

            @Override // com.bytedance.ee.bear.todocenter.ui.C11728b.AbstractC11734d
            /* renamed from: a */
            public void mo44893a(SectionUIEntity sectionUIEntity, int i, boolean z) {
                C11738e todoUIData;
                if (sectionUIEntity.id == 2) {
                    TodoCenterFragment.this.f31515g.mo237937a(TodoCenterFragment.this.f31511c.showDoneList().mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                        /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$MJFQUEuACgbDldanU_Vh1WiAvIY */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            TodoCenterFragment.this.mo44887b((C11738e) obj);
                        }
                    }, new Consumer() {
                        /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$xh_sXTiQKTbysZICVZW8G73KZM */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            TodoCenterFragment.this.mo44888b((Throwable) obj);
                        }
                    }));
                } else if (sectionUIEntity.id == 1 && (todoUIData = TodoCenterFragment.this.f31511c.getTodoUIData()) != null) {
                    todoUIData.f31555d = z;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo44884a(C11738e eVar) {
        this.f31519k = false;
        this.f31516h.mo44968c();
        m48589a(eVar.f31554c);
        C13479a.m54764b("TodoCenterFragment", "loadLatestSuccess() " + eVar);
        if (eVar.mo44938c()) {
            m48612g();
            this.f31517i.mo70690f(new ArrayList(0));
            return;
        }
        this.f31517i.mo44899a(eVar.f31553b);
    }

    /* renamed from: a */
    public void mo44885a(Throwable th) {
        this.f31519k = false;
        this.f31516h.mo44967b();
        C13479a.m54764b("TodoCenterFragment", "loadLatestFailure()...throwable = " + th);
        m48589a(false);
        if (C13657b.m55421a(this.f31517i.mo70673b())) {
            m48612g();
        }
    }

    @Override // com.bytedance.ee.bear.todocenter.push.AbstractC11709b
    /* renamed from: a */
    public void mo44861a(TodoList todoList) {
        C13479a.m54764b("TodoCenterFragment", "onItemDelete ");
        this.f31515g.mo237937a(this.f31511c.syncPushItemDelete(todoList).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$MJFQUEuACgbDldanU_Vh1WiAvIY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.mo44887b((C11738e) obj);
            }
        }, $$Lambda$TodoCenterFragment$cgPRvNyfB2AOG70OzBSNc2wglSU.INSTANCE));
    }

    /* renamed from: g */
    private void m48612g() {
        this.f31516h.mo44966a(new OnSingleClickListener() {
            /* class com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment.C117236 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m48635a(TodoTemplateEntity todoTemplateEntity) throws Exception {
                TodoCenterFragment.this.f31513e.mo19130b();
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(todoTemplateEntity.getUrl());
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m48636a(Throwable th) throws Exception {
                TodoCenterFragment.this.f31513e.mo19130b();
                C13479a.m54761a("TodoCenterFragment", th);
                Toast.showFailureText(TodoCenterFragment.this.getActivity(), (int) R.string.Doc_Facade_OperateFailed);
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                TodoCenterFragment.this.f31513e.mo19131b(R.string.Doc_Facade_Loading);
                TodoCenterFragment.this.f31513e.mo19132c();
                TodoCenterFragment.this.f31515g.mo237937a(TodoCenterFragment.this.f31512d.getTodoTemplate().mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$6$jk3s4QbsZCt2s0CclVDoq_pNopQ */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        TodoCenterFragment.C117236.this.m48635a((TodoCenterFragment.C117236) ((TodoTemplateEntity) obj));
                    }
                }, new Consumer() {
                    /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$6$f6cf6QZ0joqvKwitr6ji5ErbCpU */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        TodoCenterFragment.C117236.this.m48636a((TodoCenterFragment.C117236) ((Throwable) obj));
                    }
                }));
            }
        });
    }

    /* renamed from: d */
    private void m48603d() {
        BinderC117181 r1 = new AccountService.AccountChangeUICallback() {
            /* class com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment.BinderC117181 */
            private String mUserToken;

            @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
            public void onChangeInUi(AccountService.Account account) {
                C13479a.m54764b("TodoCenterFragment", "onChangeInUi");
                if (account == null || TextUtils.equals(this.mUserToken, account.f14591h)) {
                    C13479a.m54764b("TodoCenterFragment", "AccountChangeUICallback...onChangeInUi()...account is null or the same");
                    return;
                }
                if (this.mUserToken != null) {
                    TodoCenterFragment.this.mo44889c();
                }
                this.mUserToken = account.f14591h;
            }
        };
        this.f31522n = r1;
        ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(r1);
    }

    /* renamed from: e */
    private void m48607e() {
        this.f31511c = (C11736c) aj.m5364a(this).mo6005a(C11736c.class);
        this.f31512d = (C11717b) aj.m5364a(this).mo6005a(C11717b.class);
    }

    /* renamed from: h */
    private void m48614h() {
        this.f31515g.mo237937a(this.f31511c.loadCacheData().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$UHHkdP_G_gwbMwL1f5cran2n2O0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.mo44884a((C11738e) obj);
            }
        }, $$Lambda$TodoCenterFragment$FL4VLBwjBgbpfJ0zS11wOwSGSww.INSTANCE));
    }

    /* renamed from: j */
    private void m48618j() {
        this.f31515g.mo237937a(this.f31511c.loadMore().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$MJFQUEuACgbDldanU_Vh1WiAvIY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.mo44887b((C11738e) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$yom07hJLymf05tvOGF3MBZ2GBFo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.m48609e((TodoCenterFragment) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ boolean m48619k() {
        ConnectionService.NetworkState b = C5084ad.m20847d().mo20038b();
        if (b == null || !b.mo20041b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo44889c() {
        this.f31516h.mo44965a();
        this.f31515g.mo237937a(this.f31511c.loadCacheData().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$5kRaSMXIQKD_VELhqiaNYaly5M */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.m48605d((TodoCenterFragment) ((C11738e) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$oQ4dIcLN7TziI3vKd9srBkm8M5s */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.m48615h((Throwable) obj);
            }
        }));
    }

    /* renamed from: f */
    private boolean m48611f() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f31510b.getLayoutManager();
        if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1 == this.f31517i.getItemCount() && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (!this.f31515g.isDisposed()) {
            this.f31515g.mo237935a();
        }
        if (this.f31522n != null) {
            ((an) KoinJavaComponent.m268610a(an.class)).mo16404b(this.f31522n);
        }
        C11710c cVar = this.f31521m;
        if (cVar != null) {
            cVar.mo44863a();
        }
    }

    /* renamed from: i */
    private void m48616i() {
        if (this.f31519k) {
            C13479a.m54764b("TodoCenterFragment", "loading Latest Data");
            return;
        }
        this.f31519k = true;
        if (C13657b.m55421a(this.f31517i.mo70673b())) {
            this.f31516h.mo44965a();
        }
        this.f31515g.mo237937a(this.f31511c.loadLatestData().mo238005b(new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$p4GviPRBrNkQziPm9QoO48lH5Q */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.m48601c((TodoCenterFragment) ((C11738e) obj));
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$UHHkdP_G_gwbMwL1f5cran2n2O0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.mo44884a((C11738e) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$rTwnQmi4qOCWK16laZdck3HGJbs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.m48610f((Throwable) obj);
            }
        }));
    }

    /* renamed from: b */
    public void mo44886b() {
        boolean z;
        boolean f = m48611f();
        C11738e todoUIData = this.f31511c.getTodoUIData();
        if (todoUIData != null) {
            m48598b(todoUIData.f31554c);
            SmartRefreshLayout smartRefreshLayout = this.f31509a;
            if (!this.f31511c.shouldEnableLoadMore() || !f) {
                z = false;
            } else {
                z = true;
            }
            smartRefreshLayout.mo96415m(z);
        }
        C13479a.m54764b("TodoCenterFragment", "registerAdapterDataObserver onChanged " + f + " " + todoUIData);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48588a(AbstractC27129h hVar) {
        m48618j();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m48597b(AbstractC27129h hVar) {
        m48616i();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m48601c(C11738e eVar) throws Exception {
        m48594b(eVar.f31556e);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m48605d(C11738e eVar) throws Exception {
        mo44884a(eVar);
        m48616i();
    }

    /* renamed from: b */
    private void m48594b(int i) {
        if (this.f31521m == null) {
            C11710c cVar = new C11710c();
            this.f31521m = cVar;
            cVar.mo44864a(i, this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m48609e(Throwable th) throws Exception {
        C13479a.m54761a("TodoCenterFragment", th);
        mo44888b(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m48610f(Throwable th) throws Exception {
        C13479a.m54761a("TodoCenterFragment", th);
        mo44885a(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m48615h(Throwable th) throws Exception {
        C13479a.m54761a("TodoCenterFragment", th);
        m48616i();
    }

    /* renamed from: a */
    private void m48583a(View view) {
        this.f31518j = (NoNetworkView) view.findViewById(R.id.noNetworkView);
        C5084ad.m20847d().mo20037a().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$HTU8VkLRUyrKfSKTsJV8uEdGGZs */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                TodoCenterFragment.this.m48584a((TodoCenterFragment) ((ConnectionService.NetworkState) obj));
            }
        });
    }

    /* renamed from: b */
    private void m48598b(boolean z) {
        SmartRefreshLayout smartRefreshLayout = this.f31509a;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.mo96366b(0, true, !z);
        }
    }

    /* renamed from: b */
    private void m48595b(View view) {
        C4878c cVar = new C4878c(getActivity());
        this.f31513e = cVar;
        cVar.mo19128a(ParticipantRepo.f117150c);
        this.f31513e.mo19131b(R.string.Doc_Facade_Loading);
        this.f31516h = (TodoEmptyView) view.findViewById(R.id.todo_empty_view);
        m48608e(view);
        m48600c(view);
        m48604d(view);
    }

    /* renamed from: d */
    private void m48604d(View view) {
        final StickyHeadContainer stickyHeadContainer = (StickyHeadContainer) view.findViewById(R.id.sticky_section_container);
        C20923c cVar = new C20923c(stickyHeadContainer);
        stickyHeadContainer.setVisibility(4);
        stickyHeadContainer.setDataCallback(new StickyHeadContainer.AbstractC26970a(cVar) {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$UnrBKDp32aZmDrY_L7TsVjpPVXA */
            public final /* synthetic */ C20923c f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.oubowu.stickyitemdecoration.StickyHeadContainer.AbstractC26970a
            public final void onDataChange(int i) {
                TodoCenterFragment.this.m48587a((TodoCenterFragment) this.f$1, (C20923c) i);
            }
        });
        stickyHeadContainer.setOnClickListener(new OnSingleClickListener() {
            /* class com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment.C117214 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                TodoCenterFragment.this.mo44883a(stickyHeadContainer.getLastStickyHeadPosition());
            }
        });
        C26972b bVar = new C26972b(stickyHeadContainer, TodoItemType.Section.getType());
        bVar.mo95886a(new AbstractC26971a() {
            /* class com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment.C117225 */

            @Override // com.oubowu.stickyitemdecoration.AbstractC26971a
            /* renamed from: a */
            public void mo44891a() {
                stickyHeadContainer.mo95873a();
                stickyHeadContainer.setVisibility(4);
            }

            @Override // com.oubowu.stickyitemdecoration.AbstractC26971a
            /* renamed from: a */
            public void mo44892a(int i) {
                if (TodoCenterFragment.this.f31509a.getState() == RefreshState.None || TodoCenterFragment.this.f31509a.getState() == RefreshState.Loading || TodoCenterFragment.this.f31509a.getState() == RefreshState.LoadReleased || TodoCenterFragment.this.f31509a.getState() == RefreshState.LoadFinish) {
                    stickyHeadContainer.mo95874a(i);
                    stickyHeadContainer.setVisibility(0);
                }
            }
        });
        this.f31510b.addItemDecoration(bVar);
        this.f31514f = stickyHeadContainer;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48584a(ConnectionService.NetworkState networkState) {
        C13479a.m54764b("TodoCenterFragment", "Network changed:" + networkState);
        if (networkState != null) {
            Boolean bool = this.f31520l;
            if (!(bool == null || bool.booleanValue() == networkState.mo20041b())) {
                C13479a.m54764b("TodoCenterFragment", "initNetworkState: update todo item enable status");
                if (networkState.mo20041b()) {
                    m48616i();
                } else {
                    m48614h();
                }
                this.f31517i.notifyDataSetChanged();
            }
            this.f31520l = Boolean.valueOf(networkState.mo20041b());
            if (networkState.mo20041b()) {
                this.f31518j.setVisibility(8);
                this.f31509a.mo96413l(true);
                return;
            }
            this.f31518j.setTip(getString(R.string.CreationMobile_Docs_TaskCenter_NoNetwork_Tooltip));
            this.f31518j.setVisibility(0);
            this.f31509a.mo96413l(false);
        }
    }

    /* renamed from: c */
    private void m48600c(View view) {
        BaseRecyclerView baseRecyclerView = (BaseRecyclerView) view.findViewById(R.id.todo_list_recycler_view);
        this.f31510b = baseRecyclerView;
        baseRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f31510b.setItemAnimator(new C1363f());
        this.f31510b.setNestScrollListener(new BaseRecyclerView.AbstractC11798a() {
            /* class com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment.C117192 */

            @Override // com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a
            /* renamed from: a */
            public void mo33327a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
            }

            @Override // com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a
            /* renamed from: a */
            public void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
                if (TodoCenterFragment.this.f31509a.getState() != RefreshState.PullDownToRefresh && TodoCenterFragment.this.f31509a.getState() != RefreshState.ReleaseToRefresh && (TodoCenterFragment.this.getParentFragment() instanceof AbstractC11735a)) {
                    ((AbstractC11735a) TodoCenterFragment.this.getParentFragment()).mo44903a(i, i2);
                }
            }
        });
        C11728b bVar = new C11728b(getActivity(), new ArrayList(), $$Lambda$TodoCenterFragment$TSgWReCrZfRg_tIb_afPXxGvQ0.INSTANCE);
        this.f31517i = bVar;
        bVar.mo70667a((RecyclerView) this.f31510b);
        this.f31517i.registerAdapterDataObserver(new C11726a() {
            /* class com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment.C117203 */

            /* renamed from: a */
            final Runnable f31524a = new Runnable() {
                /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$3$rsmpSWR9QR2XXUBjD4EPCJ73EmM */

                public final void run() {
                    TodoCenterFragment.C117203.this.m48632a();
                }
            };

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m48632a() {
                TodoCenterFragment.this.mo44886b();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                TodoCenterFragment.this.f31510b.removeCallbacks(this.f31524a);
                TodoCenterFragment.this.f31510b.postDelayed(this.f31524a, 100);
            }
        });
        this.f31517i.mo70668a((BaseQuickAdapter.AbstractC20911a) new BaseQuickAdapter.AbstractC20911a() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$p_2ADIRsGwxQf1RNYWZXAQvmtgY */

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                TodoCenterFragment.this.m48586a((TodoCenterFragment) baseQuickAdapter, (BaseQuickAdapter) view, (View) i);
            }
        });
        this.f31517i.mo44897a((C11728b.AbstractC11733c) new C11728b.AbstractC11733c() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$9FqPyaX6xxft8unxNjYmr03wxM */

            @Override // com.bytedance.ee.bear.todocenter.ui.C11728b.AbstractC11733c
            public final void onCheckedChanged(TodoUIEntity todoUIEntity, int i, boolean z) {
                TodoCenterFragment.this.m48596b((TodoCenterFragment) todoUIEntity, (TodoUIEntity) i, (int) z);
            }
        });
    }

    /* renamed from: e */
    private void m48608e(View view) {
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view.findViewById(R.id.list_refresh_layout);
        this.f31509a = smartRefreshLayout;
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(view.getContext()));
        this.f31509a.mo96415m(false);
        this.f31509a.mo96369b(new AbstractC27139c() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$bIDYxjKeN6VMT9s5x5dvAd2zT8 */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
            public final void onRefresh(AbstractC27129h hVar) {
                TodoCenterFragment.this.m48597b((TodoCenterFragment) hVar);
            }
        });
        this.f31509a.mo96368b(new AbstractC27137a() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$sWAKArKujUKBxwtb9IEqGalz1UM */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public final void onLoadmore(AbstractC27129h hVar) {
                TodoCenterFragment.this.m48588a((TodoCenterFragment) hVar);
            }
        });
        AbstractC27126e refreshHeader = this.f31509a.getRefreshHeader();
        if (refreshHeader instanceof CircleRefreshHeader) {
            ((CircleRefreshHeader) refreshHeader).setAssociatedHeader(new C11737d() {
                /* class com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment.C117258 */

                @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e, com.bytedance.ee.bear.todocenter.ui.C11737d
                /* renamed from: a */
                public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
                    if (refreshState2 == RefreshState.Loading || refreshState2 == RefreshState.LoadFinish || refreshState2 == RefreshState.LoadReleased || (refreshState2 == RefreshState.None && TodoCenterFragment.this.f31514f.getLastStickyHeadPosition() >= 0)) {
                        TodoCenterFragment.this.f31514f.setVisibility(0);
                    } else {
                        TodoCenterFragment.this.f31514f.setVisibility(4);
                    }
                }

                @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e, com.bytedance.ee.bear.todocenter.ui.C11737d
                public void a_(float f, int i, int i2, int i3) {
                    TodoCenterFragment.this.f31514f.setVisibility(4);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.todocenter.push.AbstractC11709b
    /* renamed from: b */
    public void mo44862b(TodoList todoList) {
        C13479a.m54764b("TodoCenterFragment", "onItemAdd ");
        this.f31515g.mo237937a(this.f31511c.syncPushItemAdd(todoList).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$MJFQUEuACgbDldanU_Vh1WiAvIY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.mo44887b((C11738e) obj);
            }
        }, $$Lambda$TodoCenterFragment$pX8vFD_iZJRHHmi_zGz22CT5JuU.INSTANCE));
    }

    /* renamed from: a */
    private void m48589a(boolean z) {
        C13479a.m54764b("TodoCenterFragment", "finishRefreshAnim()...hasMore = " + z);
        SmartRefreshLayout smartRefreshLayout = this.f31509a;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.mo96435x();
            this.f31509a.mo96434w();
            mo44886b();
        }
    }

    /* renamed from: b */
    public void mo44887b(C11738e eVar) {
        C13479a.m54764b("TodoCenterFragment", "loadMoreSuccess() " + eVar);
        this.f31516h.mo44968c();
        m48598b(eVar.f31554c);
        if (eVar.mo44938c()) {
            m48612g();
            this.f31517i.mo70690f(new ArrayList(0));
            return;
        }
        this.f31517i.mo44902b(eVar.f31553b);
    }

    /* renamed from: b */
    public void mo44888b(Throwable th) {
        C13479a.m54764b("TodoCenterFragment", "loadMoreFailure()...throwable = " + th);
        m48598b(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        m48607e();
        m48595b(view);
        mo44889c();
        m48583a(view);
        m48603d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48587a(C20923c cVar, int i) {
        AbstractC20930c cVar2 = (AbstractC20930c) this.f31517i.mo70685d(i);
        if (cVar2 instanceof SectionUIEntity) {
            C11728b.m48647a(cVar, (SectionUIEntity) cVar2);
        }
    }

    /* renamed from: a */
    private void m48590a(boolean z, TodoUIEntity todoUIEntity) {
        this.f31515g.mo237937a(this.f31511c.removeTodoIfNeeded(todoUIEntity).mo238001b(new Consumer(z, todoUIEntity) {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$3dOc_YmvVvJWOUeYwx0b_Bl7j7g */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ TodoUIEntity f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.m48591a((TodoCenterFragment) this.f$1, (boolean) this.f$2, (TodoUIEntity) ((C11738e) obj));
            }
        }, $$Lambda$TodoCenterFragment$gWJPQu05scQkabspv8Oagb_hHI.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48591a(boolean z, TodoUIEntity todoUIEntity, C11738e eVar) throws Exception {
        m48593a(z, todoUIEntity, eVar.f31553b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m48599b(boolean z, TodoUIEntity todoUIEntity, C11738e eVar) throws Exception {
        m48593a(z, todoUIEntity, eVar.f31553b);
    }

    /* renamed from: a */
    private void m48593a(boolean z, TodoUIEntity todoUIEntity, List<AbstractC20930c> list) {
        this.f31517i.mo44900a(z, todoUIEntity, list);
        if (C13657b.m55421a(list)) {
            m48612g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.todo_center_fragment, viewGroup, false);
    }

    /* renamed from: a */
    private void m48585a(TodoUIEntity todoUIEntity, int i, boolean z) {
        this.f31517i.mo44901a(false, todoUIEntity, true);
        this.f31515g.mo237937a(this.f31511c.updateTodoStatus(todoUIEntity, z).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(z, todoUIEntity) {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$tfkh7loh1Y031Rt7WWpGoF5aA */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ TodoUIEntity f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.m48599b((TodoCenterFragment) this.f$1, (boolean) this.f$2, (TodoUIEntity) ((C11738e) obj));
            }
        }, new Consumer(z, todoUIEntity) {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$TodoCenterFragment$5Xg8PYRcIoyFeeuxgFm_bhifMcU */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ TodoUIEntity f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoCenterFragment.this.m48592a((TodoCenterFragment) this.f$1, (boolean) this.f$2, (TodoUIEntity) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m48596b(TodoUIEntity todoUIEntity, int i, boolean z) {
        String str;
        C13479a.m54772d("TodoCenterFragment", "onCheckedChanged: position " + i + " isChecked " + z + " todoEntity " + todoUIEntity);
        m48585a(todoUIEntity, i, z);
        if (z) {
            str = "done";
        } else {
            str = "undone";
        }
        C11688b.m48500a(str, todoUIEntity.checked_uuid);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48586a(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        C13479a.m54772d("TodoCenterFragment", "onItemClick: " + i);
        AbstractC20930c cVar = (AbstractC20930c) this.f31517i.mo70685d(i);
        if (cVar instanceof EmptyTodoEntity) {
            C13479a.m54764b("TodoCenterFragment", "click empty todo empty");
        }
        if (cVar instanceof TodoUIEntity) {
            TodoUIEntity todoUIEntity = (TodoUIEntity) cVar;
            ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(todoUIEntity.click_url);
            C11688b.m48500a("click_todo", todoUIEntity.checked_uuid);
            return;
        }
        mo44883a(i);
    }
}
