package com.ss.android.lark.forward.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.IForwardCancelListener;
import com.ss.android.lark.forward.impl.p1899a.C38413b;
import com.ss.android.lark.forward.impl.view.BaseForwardView;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.ui.AbstractC57604f;

/* renamed from: com.ss.android.lark.forward.impl.a */
public class C38408a extends C36516a<FloatWindowParams> implements AbstractC57604f {

    /* renamed from: a */
    BaseForwardView.AbstractC38442a f98767a = new BaseForwardView.AbstractC38442a() {
        /* class com.ss.android.lark.forward.impl.C38408a.C384091 */

        @Override // com.ss.android.lark.forward.impl.view.BaseForwardView.AbstractC38442a
        /* renamed from: c */
        public FragmentManager mo140931c() {
            return C38408a.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.forward.impl.view.BaseForwardView.AbstractC38442a
        /* renamed from: b */
        public void mo140930b() {
            C38364a.m151054a().mo140449k().mo140503a(C38408a.this, 3);
        }

        @Override // com.ss.android.lark.forward.impl.view.BaseForwardView.AbstractC38442a
        /* renamed from: a */
        public void mo140926a() {
            if (C38408a.this.getActivity() == null) {
                C53241h.m205894a("ForwardPickFragment", "fragment context is null");
            } else if (!DesktopUtil.m144301a((Context) C38408a.this.getActivity()) || C38408a.this.f98768b.mo140596i().mo140805a() != 0) {
                FragmentActivity activity = C38408a.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            } else {
                C38408a.this.finish();
                Fragment parentFragment = C38408a.this.getParentFragment();
                if (parentFragment instanceof C36516a) {
                    ((C36516a) parentFragment).finish();
                }
            }
        }

        @Override // com.ss.android.lark.forward.impl.view.BaseForwardView.AbstractC38442a
        /* renamed from: a */
        public void mo140928a(C38413b.AbstractC38414a aVar) {
            ButterKnife.bind(aVar, C38408a.this.getView());
        }

        @Override // com.ss.android.lark.forward.impl.view.BaseForwardView.AbstractC38442a
        /* renamed from: a */
        public void mo140929a(String str, Bundle bundle) {
            if (C38408a.this.getParentFragment() instanceof AbstractC57604f) {
                ((AbstractC57604f) C38408a.this.getParentFragment()).mo128968a(str, bundle);
            }
        }

        @Override // com.ss.android.lark.forward.impl.view.BaseForwardView.AbstractC38442a
        /* renamed from: a */
        public void mo140927a(int i, Intent intent) {
            if (C38408a.this.getActivity() == null) {
                C53241h.m205894a("ForwardPickFragment", "fragment context is null");
            } else if (!DesktopUtil.m144301a((Context) C38408a.this.getActivity()) || C38408a.this.f98768b.mo140596i().mo140805a() != 0) {
                C38408a.this.getActivity().setResult(i, intent);
            } else {
                C38408a.this.setResult(i, intent);
            }
        }
    };

    /* renamed from: b */
    public ForwardTemplate f98768b;

    /* renamed from: c */
    private C38417b f98769c;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C38417b bVar = this.f98769c;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        KeyboardUtils.hideKeyboard(getContext());
    }

    /* renamed from: a */
    public boolean mo140925a() {
        ForwardFeature c;
        FragmentActivity activity;
        ForwardTemplate forwardTemplate = this.f98768b;
        if (forwardTemplate == null || (c = forwardTemplate.mo140589c()) == null) {
            return false;
        }
        IForwardCancelListener i = c.mo140767i();
        if (i != null) {
            i.mo140899a();
        }
        if (!c.mo140766h() || (activity = getActivity()) == null || !isAdded()) {
            return false;
        }
        activity.moveTaskToBack(true);
        activity.finish();
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            finish();
            return;
        }
        ForwardTemplate forwardTemplate = (ForwardTemplate) arguments.getParcelable("parcelable_forward_template");
        this.f98768b = forwardTemplate;
        if (forwardTemplate == null || !forwardTemplate.mo140587a()) {
            finish();
            C53241h.m205898b("ForwardPickFragment", "onActivityCreated return, Forwardpresenter has not been initialized");
            return;
        }
        this.f98768b.mo140579a(getActivity());
        C38417b bVar = new C38417b(getActivity(), this.f98768b, this.f98767a);
        this.f98769c = bVar;
        bVar.create();
    }

    @Override // com.ss.android.lark.ui.AbstractC57604f
    /* renamed from: a */
    public void mo128968a(String str, Bundle bundle) {
        str.hashCode();
        if (str.equals("multiSelect")) {
            this.f98769c.f98771a.mo140947b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C38417b bVar = this.f98769c;
        if (bVar != null) {
            bVar.mo140962a(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_forward_pick_chat, viewGroup, false);
    }
}
