package com.bytedance.ee.bear.list.homepage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.p380a.C7662a;
import com.bytedance.ee.bear.facade.common.p380a.C7663b;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a;
import com.bytedance.ee.bear.list.homepage.title.AbstractC8505c;
import com.bytedance.ee.bear.list.homepage.title.C8507e;
import com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar;
import com.bytedance.ee.bear.list.homepage.title.MainTabTitleBar;
import com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import java.lang.ref.WeakReference;
import org.koin.java.KoinJavaComponent;

public abstract class BaseHomeFragment extends C7663b implements AbstractC8463b {

    /* renamed from: c */
    protected AbstractC8472c f22828c;

    /* renamed from: d */
    protected AbstractC7741a f22829d;

    /* renamed from: e */
    protected CollapsingToolbarLayout f22830e;

    /* renamed from: f */
    protected AbstractC8473d f22831f;

    /* renamed from: g */
    protected AbstractC8505c f22832g;

    /* renamed from: h */
    private boolean f22833h;

    /* renamed from: i */
    private int f22834i;

    /* renamed from: j */
    private final AccountService.AccountChangeUICallback f22835j = new CustomAccountChangeUICallback();

    /* renamed from: a */
    public abstract AbstractC8509a mo33060a(C7662a aVar, Context context, C10917c cVar, AppBarLayout appBarLayout);

    /* renamed from: p */
    public abstract int mo33065p();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public View mo33062k() {
        return mo30111b(R.id.list_appbar_refresh_lean_header);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8463b
    public void y_() {
        AbstractC8472c cVar = this.f22828c;
        if (cVar != null) {
            cVar.mo33133a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AbstractC8473d mo33061j() {
        return (AbstractC8473d) getChildFragmentManager().findFragmentById(R.id.list_home_sub_fragment);
    }

    @Override // com.bytedance.ee.bear.facade.common.p380a.C7662a, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        C13479a.m54764b("BaseHomeFragment", "onDetach()...");
    }

    /* renamed from: q */
    public void mo33066q() {
        y_();
        AbstractC8473d dVar = this.f22831f;
        if (dVar != null) {
            dVar.mo32695a((AbstractC27129h) null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    public void x_() {
        super.x_();
        C13479a.m54764b("BaseHomeFragment", "onDestroyViewLazy()...");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: f */
    public void mo30117f() {
        super.mo30117f();
        C13479a.m54764b("BaseHomeFragment", "onResumeLazy()...");
        AbstractC8472c cVar = this.f22828c;
        if (cVar != null) {
            cVar.mo33133a();
        }
        this.f22833h = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo33063l() {
        return ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20783h().f14914a;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.p380a.C7662a, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        C13479a.m54764b("BaseHomeFragment", "onDestroy()...");
        AbstractC8472c cVar = this.f22828c;
        if (cVar != null) {
            cVar.mo33134b();
        }
        ((an) KoinJavaComponent.m268610a(an.class)).mo16404b(this.f22835j);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo33064o() {
        AbstractC7741a aVar;
        if (this.f22830e != null && (aVar = this.f22829d) != null && (aVar instanceof ViewGroup)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ViewGroup) aVar).getLayoutParams();
            AbstractC8505c cVar = this.f22832g;
            if ((cVar instanceof C8507e) || (cVar instanceof MainTabTitleBar) || cVar.getTitleType() == HomeMainTitleBar.TitleType.SPACE_ROUTE.ordinal()) {
                marginLayoutParams.topMargin = 0;
            } else {
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(R.dimen.list_home_title_search_height);
            }
            ((ViewGroup) this.f22829d).setLayoutParams(marginLayoutParams);
            this.f22830e.setMinimumHeight(this.f22832g.getTitleBarHeight());
        }
    }

    private static class CustomAccountChangeUICallback extends AccountService.AccountChangeUICallback {
        private final WeakReference<BaseHomeFragment> mBaseHomeFragmentRef;
        private String mUserToken;

        private CustomAccountChangeUICallback(BaseHomeFragment baseHomeFragment) {
            this.mBaseHomeFragmentRef = new WeakReference<>(baseHomeFragment);
        }

        @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
        public void onChangeInUi(AccountService.Account account) {
            C13479a.m54764b("BaseHomeFragment", "CustomAccountChangeUICallback...onChangeInUi()  account = " + account);
            if (account == null || TextUtils.equals(this.mUserToken, account.f14591h)) {
                C13479a.m54764b("BaseHomeFragment", "CustomAccountChangeUICallback...onChangeInUi()...account is null or the same");
            } else if (this.mBaseHomeFragmentRef.get() == null) {
                C13479a.m54758a("BaseHomeFragment", "CustomAccountChangeUICallback.onChangeInUi, mBaseHomeFragmentRef.get() is null. " + this.mBaseHomeFragmentRef.get());
            } else {
                this.mBaseHomeFragmentRef.get().mo33066q();
                this.mUserToken = account.f14591h;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        C13479a.m54764b("BaseHomeFragment", "onAttach()...");
    }

    @Override // com.bytedance.ee.bear.facade.common.p380a.C7662a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C13479a.m54764b("BaseHomeFragment", "onSaveInstanceState()...");
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.p380a.C7662a, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(this.f22835j);
    }

    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C13479a.m54764b("BaseHomeFragment", "setUserVisibleHint()...isVisibleToUser = " + z + ", this = " + this);
        this.f22833h = z;
        if (z && mo30119i()) {
            y_();
        }
        AbstractC8473d dVar = this.f22831f;
        if (dVar != null) {
            dVar.setUserVisibleHint(z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: b */
    public void mo30113b(Bundle bundle) {
        super.mo30113b(bundle);
        C13479a.m54764b("BaseHomeFragment", "onCreateViewLazy()...");
        mo30107a(mo33065p());
        if (getParentFragment() instanceof AbstractC8476f) {
            this.f22832g = ((AbstractC8476f) getParentFragment()).mo30786c();
        }
        if (getActivity() instanceof AbstractC8476f) {
            this.f22832g = ((AbstractC8476f) getActivity()).mo30786c();
        }
        AppBarLayout appBarLayout = (AppBarLayout) mo30111b(R.id.list_sub_menu_layout);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo30111b(R.id.list_refresh_layout);
        this.f22830e = (CollapsingToolbarLayout) mo30111b(R.id.list_collapsing_layout);
        AbstractC8473d j = mo33061j();
        this.f22831f = j;
        if (j != null) {
            j.mo32694a(smartRefreshLayout);
        }
        View b = mo30111b(R.id.list_appbar_refresh_header);
        if (mo33063l()) {
            b.setVisibility(0);
            this.f22829d = (AbstractC7741a) b;
        } else {
            View k = mo33062k();
            k.setVisibility(0);
            b.setVisibility(8);
            this.f22829d = (AbstractC7741a) k;
        }
        this.f22828c = mo33060a(this, getContext(), ar.m20936a(), appBarLayout);
        AbstractC27126e refreshHeader = smartRefreshLayout.getRefreshHeader();
        if (refreshHeader instanceof AbstractC7741a) {
            this.f22829d.setCustomText(getString(R.string.Doc_List_RefreshDocTips));
            ((AbstractC7741a) refreshHeader).setAssociatedHeader(this.f22829d);
        }
        appBarLayout.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b() {
            /* class com.bytedance.ee.bear.list.homepage.$$Lambda$BaseHomeFragment$Z4vq6P1QAFIIoD4G5ePk9srdWWM */

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                BaseHomeFragment.lambda$Z4vq6P1QAFIIoD4G5ePk9srdWWM(BaseHomeFragment.this, appBarLayout, i);
            }
        });
        mo33064o();
        c_(true);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8463b
    /* renamed from: a */
    public void mo30959a(int i, int i2) {
        AbstractC8505c cVar = this.f22832g;
        if (cVar != null && this.f22833h) {
            cVar.mo33176a(i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35023a(AppBarLayout appBarLayout, int i) {
        AbstractC8505c cVar;
        if (this.f22834i != i) {
            this.f22834i = i;
            if (i == 0 && (cVar = this.f22832g) != null) {
                cVar.mo33198k();
            }
        }
    }
}
