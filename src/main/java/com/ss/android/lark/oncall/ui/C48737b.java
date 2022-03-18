package com.ss.android.lark.oncall.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.oncall.hitpoint.OnCallHitPoint;
import com.ss.android.lark.oncall.ui.OnCallView;

/* renamed from: com.ss.android.lark.oncall.ui.b */
public class C48737b extends BaseFragment {

    /* renamed from: a */
    public View f122483a;

    /* renamed from: b */
    private C48752e f122484b;

    /* renamed from: c */
    private final OnCallView.AbstractC48731b f122485c = new OnCallView.AbstractC48731b() {
        /* class com.ss.android.lark.oncall.ui.C48737b.C487381 */

        @Override // com.ss.android.lark.oncall.ui.OnCallView.AbstractC48731b
        /* renamed from: a */
        public void mo169994a() {
            C48737b.this.finish();
        }

        @Override // com.ss.android.lark.oncall.ui.OnCallView.AbstractC48731b
        /* renamed from: a */
        public void mo169995a(OnCallView onCallView) {
            ButterKnife.bind(onCallView, C48737b.this.f122483a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f122484b.destroy();
    }

    /* renamed from: a */
    private void m192023a() {
        C48752e eVar = new C48752e(new C48742d(), new OnCallView(this.f122485c, getActivity()));
        this.f122484b = eVar;
        eVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            OnCallHitPoint.f122437a.mo169927b(getActivity().getIntent().getStringExtra("APPRECIABLE_KEY_LARK_ON_CALL"));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122483a = layoutInflater.inflate(R.layout.activity_oncall, viewGroup, false);
        m192023a();
        return this.f122483a;
    }
}
