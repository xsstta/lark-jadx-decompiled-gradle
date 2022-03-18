package com.ss.android.lark.mine.impl.status;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.mine.impl.status.mvp.C45827c;
import com.ss.android.lark.mine.impl.status.mvp.UserStatusView;

/* renamed from: com.ss.android.lark.mine.impl.status.d */
public class C45810d extends BaseFragment {

    /* renamed from: a */
    public View f115595a;

    /* renamed from: b */
    public Activity f115596b;

    /* renamed from: c */
    private C45827c f115597c;

    /* renamed from: d */
    private UserStatusView.AbstractC45818a f115598d = new UserStatusView.AbstractC45818a() {
        /* class com.ss.android.lark.mine.impl.status.C45810d.C458111 */

        @Override // com.ss.android.lark.mine.impl.status.mvp.UserStatusView.AbstractC45818a
        /* renamed from: c */
        public void mo161052c() {
            C45810d.this.finish();
        }

        @Override // com.ss.android.lark.mine.impl.status.mvp.UserStatusView.AbstractC45818a
        /* renamed from: a */
        public void mo161049a() {
            if (KeyboardUtils.isSoftShowing(C45810d.this.f115596b)) {
                KeyboardUtils.hideKeyboard(C45810d.this.f115596b);
            }
        }

        @Override // com.ss.android.lark.mine.impl.status.mvp.UserStatusView.AbstractC45818a
        /* renamed from: b */
        public void mo161051b() {
            if (!KeyboardUtils.isSoftShowing(C45810d.this.f115596b)) {
                KeyboardUtils.showKeyboard(C45810d.this.f115596b);
            }
        }

        @Override // com.ss.android.lark.mine.impl.status.mvp.UserStatusView.AbstractC45818a
        /* renamed from: a */
        public void mo161050a(UserStatusView userStatusView) {
            ButterKnife.bind(userStatusView, C45810d.this.f115595a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C45827c cVar = this.f115597c;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onFinish() {
        if (this.f115597c != null) {
            Intent intent = new Intent();
            this.f115597c.mo161073a(intent);
            setResult(-1, intent);
        }
        super.onFinish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        StatusBarUtil.setColor(requireActivity(), UIUtils.getColor(this.mContext, R.color.bg_base), 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C45827c cVar = new C45827c(this.f115598d, this.f115596b, getArguments());
        this.f115597c = cVar;
        cVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f115595a = layoutInflater.inflate(R.layout.activity_mine_status_update, viewGroup, false);
        this.f115596b = getActivity();
        return this.f115595a;
    }
}
