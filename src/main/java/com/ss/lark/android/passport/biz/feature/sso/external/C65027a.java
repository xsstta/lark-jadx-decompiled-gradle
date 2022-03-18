package com.ss.lark.android.passport.biz.feature.sso.external;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.architecture.C49029b;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.lark.android.passport.biz.feature.sso.external.ExternalAuthView;
import java.util.HashMap;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.external.a */
public class C65027a extends C49029b {

    /* renamed from: e */
    public View f163793e;

    /* renamed from: f */
    private C65030c f163794f;

    /* renamed from: g */
    private FragmentActivity f163795g;

    /* renamed from: h */
    private ExternalAuthView f163796h;

    /* renamed from: i */
    private final ExternalAuthView.AbstractC65026a f163797i = new ExternalAuthView.AbstractC65026a() {
        /* class com.ss.lark.android.passport.biz.feature.sso.external.C65027a.C650281 */

        @Override // com.ss.lark.android.passport.biz.feature.sso.external.ExternalAuthView.AbstractC65026a
        /* renamed from: a */
        public void mo224092a() {
            C65027a.this.finish();
        }

        @Override // com.ss.lark.android.passport.biz.feature.sso.external.ExternalAuthView.AbstractC65026a
        /* renamed from: a */
        public void mo224093a(ExternalAuthView externalAuthView) {
            ButterKnife.bind(externalAuthView, C65027a.this.f163793e);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return "ExternalAuthFragment";
    }

    /* renamed from: e */
    public void mo224094e() {
        C65030c cVar = this.f163794f;
        if (cVar != null) {
            cVar.mo224102h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C65030c cVar = this.f163794f;
        if (cVar != null) {
            cVar.cn_();
        }
        ExternalAuthView externalAuthView = this.f163796h;
        if (externalAuthView != null) {
            externalAuthView.cn_();
        }
        super.onDestroy();
    }

    /* renamed from: d */
    public void mo185117d() {
        if (!DesktopUtil.m144301a((Context) this.f163795g)) {
            StatusBarUtil.setTransparentForImageView(this.f163795g, this.f163793e.findViewById(R.id.view_top));
        }
        View findViewById = this.f163793e.findViewById(R.id.rl_title);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.topMargin = StatusBarUtil.getStatusBarHeight(this.f163795g);
        findViewById.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: f */
    private void m255302f() {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null) {
            finish();
            return;
        }
        int i = arguments.getInt(ShareHitPoint.f121868c, 0);
        C65029b bVar = new C65029b(i, arguments.getString("token"), (AuthInfo) arguments.getSerializable("auth_info"));
        ExternalAuthView externalAuthView = new ExternalAuthView(this.f163795g, this.f163797i);
        this.f163796h = externalAuthView;
        C65030c cVar = new C65030c(this.f163795g, externalAuthView, bVar, this.f123086a, this.f123087b);
        this.f163794f = cVar;
        cVar.mo171169a();
        HashMap hashMap = new HashMap();
        if (i == 1) {
            str = "qr";
        } else if (i == 2) {
            str = "url";
        } else {
            str = "default";
        }
        hashMap.put("auth_source", str);
        this.f123087b.mo171467b("n_page_authz_start", "ExternalAuthFragment init", hashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f163795g = getActivity();
        mo185117d();
        m255302f();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.f163793e;
        if (view == null) {
            this.f163793e = layoutInflater.inflate(R.layout.activity_sso_sdk_authorization, viewGroup, false);
        } else if (view.getParent() != null) {
            ((ViewGroup) this.f163793e.getParent()).removeView(this.f163793e);
        }
        return this.f163793e;
    }
}
