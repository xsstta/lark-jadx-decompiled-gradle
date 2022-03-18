package com.ss.android.vc.meeting.module.presetting;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;

/* renamed from: com.ss.android.vc.meeting.module.presetting.b */
public class C62629b extends BaseFragment {

    /* renamed from: a */
    private View f157667a;

    /* renamed from: b */
    private C62634d f157668b;

    /* renamed from: c */
    private C62643e f157669c;

    /* renamed from: d */
    private C62630c f157670d;

    /* renamed from: e */
    private Activity f157671e;

    /* renamed from: f */
    private String f157672f;

    /* renamed from: a */
    public void mo216463a() {
        C62643e eVar = this.f157669c;
        if (eVar != null) {
            eVar.mo216479a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C62634d dVar = this.f157668b;
        if (dVar != null) {
            dVar.destroy();
            this.f157668b = null;
        }
    }

    /* renamed from: b */
    private void m245037b() {
        this.f157670d = new C62630c();
        C62643e eVar = new C62643e(this.f157671e, this.f157672f, this.f157667a);
        this.f157669c = eVar;
        C62634d dVar = new C62634d(this.f157670d, eVar);
        this.f157668b = dVar;
        dVar.mo216471a(this.f157672f);
        this.f157668b.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null && !TextUtils.isEmpty(getArguments().getString("param_calendar_unique_id"))) {
            this.f157672f = getArguments().getString("param_calendar_unique_id");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m245037b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f157667a = layoutInflater.inflate(R.layout.activity_meeting_pre_setting, viewGroup, false);
        this.f157671e = getActivity();
        return this.f157667a;
    }
}
