package com.ss.android.lark.profile.func.share_profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.profile.func.share_profile.mvp.C52492c;
import com.ss.android.lark.profile.func.share_profile.mvp.ShareProfileView;

/* renamed from: com.ss.android.lark.profile.func.share_profile.a */
public class C52459a extends BaseFragment {

    /* renamed from: a */
    public View f129923a;

    /* renamed from: b */
    private C52492c f129924b;

    /* renamed from: c */
    private ShareProfileView.AbstractC52487a f129925c = new ShareProfileView.AbstractC52487a() {
        /* class com.ss.android.lark.profile.func.share_profile.C52459a.C524601 */

        @Override // com.ss.android.lark.profile.func.share_profile.mvp.ShareProfileView.AbstractC52487a
        /* renamed from: a */
        public void mo179476a() {
            C52459a.this.finish();
        }

        @Override // com.ss.android.lark.profile.func.share_profile.mvp.ShareProfileView.AbstractC52487a
        /* renamed from: a */
        public void mo179477a(ShareProfileView shareProfileView) {
            ButterKnife.bind(shareProfileView, C52459a.this.f129923a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C52492c cVar = this.f129924b;
        if (cVar != null) {
            cVar.destroy();
        }
        this.f129925c = null;
    }

    /* renamed from: a */
    private void m203277a() {
        C52492c cVar = new C52492c(getActivity(), this.f129925c, getChildFragmentManager());
        this.f129924b = cVar;
        cVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f129923a = layoutInflater.inflate(R.layout.activity_share_contact_profile, viewGroup, false);
        m203277a();
        return this.f129923a;
    }
}
