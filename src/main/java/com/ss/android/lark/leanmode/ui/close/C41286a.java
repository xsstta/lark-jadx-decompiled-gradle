package com.ss.android.lark.leanmode.ui.close;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.leanmode.ui.close.CloseLeanModeView;

/* renamed from: com.ss.android.lark.leanmode.ui.close.a */
public class C41286a extends BaseFragment {

    /* renamed from: a */
    public View f105075a;

    /* renamed from: b */
    private C41289c f105076b;

    /* renamed from: c */
    private Bundle f105077c;

    /* renamed from: d */
    private CloseLeanModeView.AbstractC41285a f105078d = new CloseLeanModeView.AbstractC41285a() {
        /* class com.ss.android.lark.leanmode.ui.close.C41286a.C412871 */

        @Override // com.ss.android.lark.leanmode.ui.close.CloseLeanModeView.AbstractC41285a
        /* renamed from: a */
        public void mo148716a() {
            C41286a.this.finish();
        }

        @Override // com.ss.android.lark.leanmode.ui.close.CloseLeanModeView.AbstractC41285a
        /* renamed from: a */
        public void mo148717a(CloseLeanModeView closeLeanModeView) {
            ButterKnife.bind(closeLeanModeView, C41286a.this.f105075a);
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C41289c cVar = this.f105076b;
        if (cVar != null) {
            cVar.destroy();
        }
    }

    /* renamed from: a */
    private void m163704a() {
        C41289c cVar = new C41289c(new CloseLeanModeView(getActivity(), this.f105078d), this.f105077c);
        this.f105076b = cVar;
        cVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f105077c = getArguments();
        this.f105075a = layoutInflater.inflate(R.layout.fragment_close_lean_mode, viewGroup, false);
        m163704a();
        return this.f105075a;
    }
}
