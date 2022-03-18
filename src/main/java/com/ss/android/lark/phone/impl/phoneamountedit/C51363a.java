package com.ss.android.lark.phone.impl.phoneamountedit;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.phone.impl.phoneamountedit.mvp.C51376b;
import com.ss.android.lark.phone.impl.phoneamountedit.mvp.C51379c;
import com.ss.android.lark.phone.impl.phoneamountedit.mvp.PhoneAmountEditView;

/* renamed from: com.ss.android.lark.phone.impl.phoneamountedit.a */
public class C51363a extends BaseFragment {

    /* renamed from: a */
    public View f127885a;

    /* renamed from: b */
    private C51379c f127886b;

    /* renamed from: c */
    private PhoneAmountEditView.AbstractC51371a f127887c = new PhoneAmountEditView.AbstractC51371a() {
        /* class com.ss.android.lark.phone.impl.phoneamountedit.C51363a.C513641 */

        @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.PhoneAmountEditView.AbstractC51371a
        /* renamed from: a */
        public void mo176973a() {
            C51363a.this.finish();
        }

        @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.PhoneAmountEditView.AbstractC51371a
        /* renamed from: a */
        public void mo176974a(PhoneAmountEditView phoneAmountEditView) {
            ButterKnife.bind(phoneAmountEditView, C51363a.this.f127885a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C51379c cVar = this.f127886b;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private boolean m199215a() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        return !TextUtils.isEmpty(arguments.getString("user_id"));
    }

    /* renamed from: b */
    private void m199216b() {
        C51379c cVar = new C51379c(new C51376b(getArguments().getString("user_id")), new PhoneAmountEditView(getActivity(), this.f127887c));
        this.f127886b = cVar;
        cVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m199216b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f127885a = layoutInflater.inflate(R.layout.fragment_phone_amount_edit, viewGroup, false);
        if (!m199215a()) {
            finish();
        }
        return this.f127885a;
    }
}
