package com.ss.android.lark.phone.impl.phonequerylimit;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.phone.C51341b;
import com.ss.android.lark.phone.impl.phonequerylimit.mvp.C51404b;
import com.ss.android.lark.phone.impl.phonequerylimit.mvp.C51407c;
import com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryControlInfo;

/* renamed from: com.ss.android.lark.phone.impl.phonequerylimit.a */
public class C51383a extends BaseFragment {

    /* renamed from: a */
    public View f127911a;

    /* renamed from: b */
    private C51407c f127912b;

    /* renamed from: c */
    private PhoneQueryLimitView.AbstractC51399b f127913c = new PhoneQueryLimitView.AbstractC51399b() {
        /* class com.ss.android.lark.phone.impl.phonequerylimit.C51383a.C513841 */

        @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AbstractC51399b
        /* renamed from: a */
        public void mo177002a() {
            C51383a.this.finish();
        }

        @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AbstractC51399b
        /* renamed from: a */
        public void mo177003a(PhoneQueryLimitView phoneQueryLimitView) {
            ButterKnife.bind(phoneQueryLimitView, C51383a.this.f127911a);
        }

        @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.PhoneQueryLimitView.AbstractC51399b
        /* renamed from: a */
        public void mo177004a(String str, int i) {
            C51341b.m199137a().mo144004d().mo144009a(C51383a.this.getActivity(), str, i);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C51407c cVar = this.f127912b;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private void m199261a() {
        C51407c cVar = new C51407c(new C51404b(getArguments()), new PhoneQueryLimitView(getActivity(), this.f127913c));
        this.f127912b = cVar;
        cVar.create();
    }

    /* renamed from: b */
    private boolean m199262b() {
        Bundle arguments = getArguments();
        if (arguments == null || TextUtils.isEmpty(arguments.getString("user_id")) || ((PhoneQueryControlInfo) arguments.getSerializable("control_info")) == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m199261a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f127911a = layoutInflater.inflate(R.layout.fragment_phone_query_limit, viewGroup, false);
        if (!m199262b()) {
            finish();
        }
        return this.f127911a;
    }
}
