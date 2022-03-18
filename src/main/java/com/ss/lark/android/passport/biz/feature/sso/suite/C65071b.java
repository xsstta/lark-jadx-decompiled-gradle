package com.ss.lark.android.passport.biz.feature.sso.suite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.architecture.C49029b;
import com.ss.android.lark.passport.signinsdk_api.entity.SuiteInfo;
import com.ss.lark.android.passport.biz.feature.sso.suite.SuiteConfirmView;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.b */
public class C65071b extends C49029b {

    /* renamed from: e */
    public View f163872e;

    /* renamed from: f */
    private FragmentActivity f163873f;

    /* renamed from: g */
    private C65076d f163874g;

    /* renamed from: h */
    private final SuiteConfirmView.AbstractC65065a f163875h = new SuiteConfirmView.AbstractC65065a() {
        /* class com.ss.lark.android.passport.biz.feature.sso.suite.C65071b.C650721 */

        @Override // com.ss.lark.android.passport.biz.feature.sso.suite.SuiteConfirmView.AbstractC65065a
        /* renamed from: a */
        public void mo224193a() {
            C65071b.this.finish();
        }

        @Override // com.ss.lark.android.passport.biz.feature.sso.suite.SuiteConfirmView.AbstractC65065a
        /* renamed from: a */
        public void mo224194a(SuiteConfirmView suiteConfirmView) {
            ButterKnife.bind(suiteConfirmView, C65071b.this.f163872e);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return "SuiteConfirmFragment";
    }

    /* renamed from: d */
    public void mo185117d() {
        C65076d dVar = this.f163874g;
        if (dVar != null) {
            dVar.mo224215k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C65076d dVar = this.f163874g;
        if (dVar != null) {
            dVar.cn_();
        }
        super.onDestroy();
    }

    /* renamed from: e */
    private void m255544e() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            finish();
            return;
        }
        C65073c cVar = new C65073c(arguments.getInt(ShareHitPoint.f121868c, 0), arguments.getString("token"), (SuiteInfo) arguments.getSerializable("suite_info"));
        C65076d dVar = new C65076d(this.f163873f, new SuiteConfirmView(this.f163875h, this.f163873f), cVar, this.f123086a, this.f123087b);
        this.f163874g = dVar;
        dVar.mo171169a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f163873f = getActivity();
        m255544e();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.f163872e;
        if (view == null) {
            this.f163872e = layoutInflater.inflate(R.layout.activity_suite_confirm, viewGroup, false);
        } else if (view.getParent() != null) {
            ((ViewGroup) this.f163872e.getParent()).removeView(this.f163872e);
        }
        return this.f163872e;
    }
}
