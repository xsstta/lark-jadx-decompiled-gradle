package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10065k;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.i */
public class C10062i extends C7667e implements C10065k.AbstractC10068a {

    /* renamed from: a */
    private String f27190a;

    /* renamed from: b */
    private int f27191b;

    /* renamed from: c */
    private boolean f27192c;

    /* renamed from: d */
    private Runnable f27193d;

    /* renamed from: e */
    private C10065k f27194e;

    /* renamed from: f */
    private View f27195f;

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10065k.AbstractC10068a
    /* renamed from: g */
    public void mo38411g() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10065k.AbstractC10068a
    /* renamed from: h */
    public void mo38412h() {
        m41876b();
        Runnable runnable = this.f27193d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C10065k kVar = this.f27194e;
        if (kVar != null) {
            kVar.destroy();
        }
        super.onDestroyView();
    }

    /* renamed from: b */
    private void m41876b() {
        if (getActivity() != null) {
            getActivity().getSupportFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    /* renamed from: a */
    private void m41875a() {
        C10065k kVar = new C10065k(getActivity(), new C10063j(this.f27190a, this.f27191b), new C10069l(getActivity(), this.f27195f, this.f27192c), this, false);
        this.f27194e = kVar;
        kVar.create();
    }

    /* renamed from: a */
    public C10062i mo38413a(Runnable runnable) {
        this.f27193d = runnable;
        return this;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            C13479a.m54758a("RequestLinkPasswordFragment", "onCreate savedInstanceState is not null");
            m41876b();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27190a = arguments.getString("obj_token");
            this.f27191b = arguments.getInt(ShareHitPoint.f121869d);
            this.f27192c = arguments.getBoolean("extraShowBack");
            return;
        }
        C13479a.m54758a("RequestLinkPasswordFragment", "getArguments is null");
        m41876b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m41875a();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.enter_link_password, viewGroup, false);
        this.f27195f = inflate;
        return inflate;
    }

    /* renamed from: a */
    public static C7667e m41874a(FragmentManager fragmentManager, String str, int i, int i2, boolean z, Runnable runnable) {
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(C10062i.class.getName());
        if (findFragmentByTag == null || !findFragmentByTag.isVisible()) {
            Bundle bundle = new Bundle();
            bundle.putInt(ShareHitPoint.f121869d, i);
            bundle.putString("obj_token", str);
            bundle.putBoolean("extraShowBack", z);
            C10062i iVar = (C10062i) Fragment.instantiate(C13615c.f35773a, C10062i.class.getName(), bundle);
            iVar.mo38413a(runnable);
            if (i2 == -1) {
                i2 = 16908290;
            }
            fragmentManager.beginTransaction().add(i2, iVar, C10062i.class.getName()).commitAllowingStateLoss();
            return iVar;
        }
        C13479a.m54758a("RequestLinkPasswordFragment", "add fragment when fragment is visible");
        return (C7667e) findFragmentByTag;
    }
}
