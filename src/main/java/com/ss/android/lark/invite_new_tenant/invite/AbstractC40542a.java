package com.ss.android.lark.invite_new_tenant.invite;

import android.os.Bundle;
import android.view.View;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.base.fragment.BaseFragment;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.a */
public abstract class AbstractC40542a extends BaseFragment {

    /* renamed from: a */
    protected boolean f102951a = true;

    /* renamed from: b */
    private BasePresenter f102952b;

    /* renamed from: a */
    public abstract BasePresenter mo146657a();

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m160467b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        BasePresenter basePresenter = this.f102952b;
        if (basePresenter != null) {
            basePresenter.destroy();
            this.f102952b = null;
        }
        super.onDestroy();
    }

    /* renamed from: b */
    private void m160467b() {
        BasePresenter basePresenter;
        if (isResumed() && getUserVisibleHint() && this.f102951a && (basePresenter = this.f102952b) != null) {
            basePresenter.create();
            this.f102951a = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        m160467b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f102952b = mo146657a();
    }
}
