package com.ss.lark.android.passport.biz.feature.sso.ssosdk;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.infra.base.architecture.C49029b;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.lark.android.passport.biz.feature.sso.ssosdk.SSOSdkAuthView;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.ssosdk.b */
public class C65056b extends C49029b {

    /* renamed from: e */
    public View f163848e;

    /* renamed from: f */
    private C65059d f163849f;

    /* renamed from: g */
    private FragmentActivity f163850g;

    /* renamed from: h */
    private final SSOSdkAuthView.AbstractC65051a f163851h = new SSOSdkAuthView.AbstractC65051a() {
        /* class com.ss.lark.android.passport.biz.feature.sso.ssosdk.C65056b.C650571 */

        @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.SSOSdkAuthView.AbstractC65051a
        /* renamed from: a */
        public void mo224156a() {
            C65056b.this.finish();
        }

        @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.SSOSdkAuthView.AbstractC65051a
        /* renamed from: a */
        public void mo224157a(SSOSdkAuthView sSOSdkAuthView) {
            ButterKnife.bind(sSOSdkAuthView, C65056b.this.f163848e);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return "SSOSdkAuthFragment";
    }

    /* renamed from: e */
    public void mo224163e() {
        C65059d dVar = this.f163849f;
        if (dVar != null) {
            dVar.mo224168h();
            this.f163849f.mo224167g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C65059d dVar = this.f163849f;
        if (dVar != null) {
            dVar.cn_();
        }
        super.onDestroy();
    }

    /* renamed from: f */
    private void m255463f() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            finish();
            return;
        }
        C65058c cVar = new C65058c((AuthInfo) arguments.getSerializable("sso_auth_info"));
        C65059d dVar = new C65059d(this.f163850g, new SSOSdkAuthView(this.f163850g, this.f163851h), cVar, arguments, this.f123086a, this.f123087b);
        this.f163849f = dVar;
        dVar.mo171169a();
    }

    /* renamed from: d */
    public void mo185117d() {
        if (!DesktopUtil.m144301a((Context) this.f163850g)) {
            StatusBarUtil.setTransparentForImageView(this.f163850g, this.f163848e.findViewById(R.id.view_top));
        }
        View findViewById = this.f163848e.findViewById(R.id.rl_title);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.topMargin = StatusBarUtil.getStatusBarHeight(this.f163850g);
        findViewById.setLayoutParams(marginLayoutParams);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f163850g = getActivity();
        mo185117d();
        m255463f();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.f163848e;
        if (view == null) {
            this.f163848e = layoutInflater.inflate(R.layout.activity_sso_sdk_authorization, viewGroup, false);
        } else if (view.getParent() != null) {
            ((ViewGroup) this.f163848e.getParent()).removeView(this.f163848e);
        }
        return this.f163848e;
    }
}
