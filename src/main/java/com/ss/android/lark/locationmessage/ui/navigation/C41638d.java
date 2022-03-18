package com.ss.android.lark.locationmessage.ui.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.locationmessage.ui.navigation.NavigateView;

/* renamed from: com.ss.android.lark.locationmessage.ui.navigation.d */
public class C41638d extends BaseFragment {

    /* renamed from: a */
    public View f105766a;

    /* renamed from: b */
    public String f105767b;

    /* renamed from: c */
    private C41642f f105768c;

    /* renamed from: d */
    private NavigateView f105769d;

    /* renamed from: e */
    private final NavigateView.AbstractC41631b f105770e = new NavigateView.AbstractC41631b() {
        /* class com.ss.android.lark.locationmessage.ui.navigation.C41638d.C416391 */

        @Override // com.ss.android.lark.locationmessage.ui.navigation.NavigateView.AbstractC41631b
        /* renamed from: a */
        public String mo149760a() {
            return C41638d.this.f105767b;
        }

        @Override // com.ss.android.lark.locationmessage.ui.navigation.NavigateView.AbstractC41631b
        /* renamed from: b */
        public void mo149762b() {
            C41638d.this.finish();
        }

        @Override // com.ss.android.lark.locationmessage.ui.navigation.NavigateView.AbstractC41631b
        /* renamed from: a */
        public void mo149761a(NavigateView navigateView) {
            ButterKnife.bind(navigateView, C41638d.this.f105766a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C41642f fVar = this.f105768c;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f105769d.mo149749b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f105769d.mo149746a();
    }

    /* renamed from: a */
    private void m165236a() {
        Bundle arguments = getArguments();
        this.f105767b = arguments.getString("extra_favorite_id", null);
        NavigateView navigateView = new NavigateView(getActivity(), this.f105766a, this.f105770e, (LocationInfo) arguments.getSerializable("extra_location"));
        this.f105769d = navigateView;
        C41642f fVar = new C41642f(navigateView, this.f105770e);
        this.f105768c = fVar;
        fVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.f105769d.mo149747a(bundle);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f105766a = layoutInflater.inflate(R.layout.fragment_navigate, viewGroup, false);
        m165236a();
        return this.f105766a;
    }
}
