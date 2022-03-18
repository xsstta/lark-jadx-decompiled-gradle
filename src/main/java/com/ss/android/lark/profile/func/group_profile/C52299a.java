package com.ss.android.lark.profile.func.group_profile;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.component.ui.layout.LKUIFrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.profile.func.group_profile.mvp.C52323a;
import com.ss.android.lark.profile.func.group_profile.mvp.C52326b;
import com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView;
import com.ss.android.lark.profile.service.C52904e;
import com.ss.android.lark.profile.statistics.GroupProfilePerceivableErrorCostTimeHitPoint;

/* renamed from: com.ss.android.lark.profile.func.group_profile.a */
public class C52299a extends BaseFragment {

    /* renamed from: a */
    public View f129692a;

    /* renamed from: b */
    public Activity f129693b;

    /* renamed from: c */
    private LKUIFrameLayout f129694c;

    /* renamed from: d */
    private C52326b f129695d;

    /* renamed from: e */
    private GroupProfileView.AbstractC52322b f129696e = new GroupProfileView.AbstractC52322b() {
        /* class com.ss.android.lark.profile.func.group_profile.C52299a.C523001 */

        @Override // com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView.AbstractC52322b
        /* renamed from: a */
        public void mo179136a() {
            C52299a.this.finish();
        }

        @Override // com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView.AbstractC52322b
        /* renamed from: a */
        public void mo179137a(GroupProfileView groupProfileView) {
            ButterKnife.bind(groupProfileView, C52299a.this.f129692a);
        }

        @Override // com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView.AbstractC52322b
        /* renamed from: a */
        public void mo179138a(String str, String str2, String str3) {
            C52904e.m204638a().mo105573a(C52299a.this.f129693b, str, str2, new ContactSource.C29531a().mo104726a(2).mo104729b(str3).mo104728a());
        }
    };

    /* renamed from: a */
    private void m202928a() {
        C52326b bVar = new C52326b(new C52323a(), new GroupProfileView(this.f129696e));
        this.f129695d = bVar;
        bVar.create();
        this.f129695d.mo179191a(getArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f129694c.unRegisterPlus(GroupProfileDrawEventPlus.class);
        C52326b bVar = this.f129695d;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m202928a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180534e();
        this.f129692a = layoutInflater.inflate(R.layout.activity_group_profile, viewGroup, false);
        GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180535f();
        LKUIFrameLayout lKUIFrameLayout = (LKUIFrameLayout) this.f129692a.findViewById(R.id.rootVg);
        this.f129694c = lKUIFrameLayout;
        lKUIFrameLayout.registerPlus(GroupProfileDrawEventPlus.class);
        this.f129693b = getActivity();
        return this.f129692a;
    }
}
