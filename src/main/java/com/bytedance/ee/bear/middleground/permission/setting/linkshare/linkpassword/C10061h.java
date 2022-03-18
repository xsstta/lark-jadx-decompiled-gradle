package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10065k;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13746i;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.h */
public class C10061h extends DialogInterface$OnCancelListenerC1021b implements C10065k.AbstractC10068a {

    /* renamed from: c */
    private String f27184c;

    /* renamed from: d */
    private int f27185d;

    /* renamed from: e */
    private Runnable f27186e;

    /* renamed from: f */
    private C10065k f27187f;

    /* renamed from: g */
    private View f27188g;

    /* renamed from: h */
    private boolean f27189h;

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10065k.AbstractC10068a
    /* renamed from: g */
    public void mo38411g() {
        mo38410f();
    }

    /* renamed from: f */
    public void mo38410f() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10065k.AbstractC10068a
    /* renamed from: h */
    public void mo38412h() {
        mo5513b();
        Runnable runnable = this.f27186e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C10065k kVar = this.f27187f;
        if (kVar != null) {
            kVar.destroy();
        }
        super.onDestroyView();
    }

    /* renamed from: i */
    private void m41868i() {
        C10065k kVar = new C10065k(getActivity(), new C10063j(this.f27184c, this.f27185d), new C10069l(getActivity(), this.f27188g, true), this, this.f27189h);
        this.f27187f = kVar;
        kVar.create();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        if (v_ == null) {
            window = null;
        } else {
            window = v_.getWindow();
        }
        if (window != null && getContext() != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.y = C13746i.m55722a(getContext());
            window.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_base)));
            window.setAttributes(attributes);
        }
    }

    /* renamed from: a */
    public C10061h mo38409a(Runnable runnable) {
        this.f27186e = runnable;
        return this;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        Dialog a = super.mo946a(bundle);
        if (a.getWindow() != null) {
            a.getWindow().setSoftInputMode(16);
            a.setOnKeyListener(new DialogInterface.OnKeyListener() {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$h$gvdh87ZU2Y6HS1CllkY556CZgJo */

                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return C10061h.this.m41867a(dialogInterface, i, keyEvent);
                }
            });
        }
        return a;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            mo5513b();
            C13479a.m54758a("RequestLinkPasswordDialog", "onCreate savedInstanceState is not null");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27184c = arguments.getString("obj_token");
            this.f27185d = arguments.getInt(ShareHitPoint.f121869d);
            this.f27189h = arguments.getBoolean("is_share_folder_v2");
            mo5510a(0, R.style.RequestPasswordDialogStyle);
            return;
        }
        C13479a.m54758a("RequestLinkPasswordDialog", "getArguments is null");
        mo5513b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m41868i();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m41867a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        mo38410f();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.enter_link_password, viewGroup, false);
        this.f27188g = inflate;
        return inflate;
    }

    /* renamed from: a */
    public static DialogInterface$OnCancelListenerC1021b m41866a(FragmentActivity fragmentActivity, int i, String str, boolean z, Runnable runnable) {
        Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(C10061h.class.getName());
        if (findFragmentByTag == null || !findFragmentByTag.isVisible()) {
            Bundle bundle = new Bundle();
            bundle.putInt(ShareHitPoint.f121869d, i);
            bundle.putString("obj_token", str);
            bundle.putBoolean("is_share_folder_v2", z);
            C10061h hVar = (C10061h) Fragment.instantiate(fragmentActivity, C10061h.class.getName(), bundle);
            hVar.mo38409a(runnable);
            if (C13726a.m55676b(fragmentActivity)) {
                hVar.mo5511a(fragmentActivity.getSupportFragmentManager(), C10061h.class.getName());
            } else {
                C13479a.m54759a("RequestLinkPasswordDialog", "show when activity not active", new IllegalStateException());
            }
            return hVar;
        }
        C13479a.m54758a("RequestLinkPasswordDialog", "show fragment when fragment is visible");
        return (DialogInterface$OnCancelListenerC1021b) findFragmentByTag;
    }
}
