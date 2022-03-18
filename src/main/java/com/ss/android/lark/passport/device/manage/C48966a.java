package com.ss.android.lark.passport.device.manage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.passport.device.manage.DevicesManageView;

/* renamed from: com.ss.android.lark.passport.device.manage.a */
public class C48966a extends BaseFragment {

    /* renamed from: a */
    public View f122972a;

    /* renamed from: b */
    private Activity f122973b;

    /* renamed from: c */
    private C48971c f122974c;

    /* renamed from: d */
    private DevicesManageView.AbstractC48961a f122975d = new DevicesManageView.AbstractC48961a() {
        /* class com.ss.android.lark.passport.device.manage.C48966a.C489671 */

        @Override // com.ss.android.lark.passport.device.manage.DevicesManageView.AbstractC48961a
        /* renamed from: a */
        public void mo170983a() {
            C48966a.this.finish();
        }

        @Override // com.ss.android.lark.passport.device.manage.DevicesManageView.AbstractC48961a
        /* renamed from: a */
        public void mo170984a(DevicesManageView devicesManageView) {
            ButterKnife.bind(devicesManageView, C48966a.this.f122972a);
        }
    };

    /* renamed from: b */
    private int m192870b() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return 1;
        }
        return arguments.getInt("lkp_launch_mode", 1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C48971c cVar = this.f122974c;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private void m192869a() {
        C48971c cVar = new C48971c(new C48968b(), new DevicesManageView(this.f122975d, this.f122973b, m192870b()));
        this.f122974c = cVar;
        cVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m192869a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122972a = layoutInflater.inflate(R.layout.activity_multi_devices_detail, viewGroup, false);
        this.f122973b = getActivity();
        return this.f122972a;
    }
}
