package com.ss.android.lark.setting.page.v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.page.v2.AbstractC54591a;
import com.ss.android.lark.setting.page.v2.MineSystemSettingView2;

/* renamed from: com.ss.android.lark.setting.page.v2.b */
public class C54595b extends BaseFragment {

    /* renamed from: a */
    public View f134919a;

    /* renamed from: b */
    private C54598d f134920b;

    /* renamed from: c */
    private MineSystemSettingView2.AbstractC54590a f134921c = new MineSystemSettingView2.AbstractC54590a() {
        /* class com.ss.android.lark.setting.page.v2.C54595b.C545961 */

        @Override // com.ss.android.lark.setting.page.v2.MineSystemSettingView2.AbstractC54590a
        /* renamed from: a */
        public void mo186506a(AbstractC54591a.AbstractC54593b bVar) {
            ButterKnife.bind(bVar, C54595b.this.f134919a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C54598d dVar = this.f134920b;
        if (dVar != null) {
            dVar.mo186511e();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        C54598d dVar = this.f134920b;
        if (dVar != null) {
            dVar.mo186508b();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C54598d dVar = this.f134920b;
        if (dVar != null) {
            dVar.mo186509c();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C54598d dVar = this.f134920b;
        if (dVar != null) {
            dVar.mo186510d();
        }
    }

    /* renamed from: a */
    private void m211796a() {
        MineSystemSettingView2 mineSystemSettingView2 = new MineSystemSettingView2(getActivity(), this.f134921c);
        C54598d dVar = new C54598d(getActivity(), new C54597c(), mineSystemSettingView2);
        this.f134920b = dVar;
        dVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m211796a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_mine_systemsetting_v2, viewGroup, false);
        this.f134919a = inflate;
        return inflate;
    }
}
