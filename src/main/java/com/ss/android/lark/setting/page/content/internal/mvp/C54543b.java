package com.ss.android.lark.setting.page.content.internal.mvp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.internal.mvp.MineInternalSettingsView;
import com.ss.android.lark.setting.service.impl.C54617d;

/* renamed from: com.ss.android.lark.setting.page.content.internal.mvp.b */
public class C54543b extends BaseFragment {

    /* renamed from: a */
    public View f134838a;

    /* renamed from: b */
    public Activity f134839b;

    /* renamed from: c */
    private C54549d f134840c;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C54549d dVar = this.f134840c;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.page.content.internal.mvp.b$a */
    public class C54545a implements MineInternalSettingsView.AbstractC54536a {
        @Override // com.ss.android.lark.setting.page.content.internal.mvp.MineInternalSettingsView.AbstractC54536a
        /* renamed from: a */
        public void mo186374a() {
            C54115c.m210080a().mo178295g().mo178363a(C54543b.this.f134839b);
            C54617d.m211936l().mo186600n();
            Process.killProcess(Process.myPid());
        }

        private C54545a() {
        }

        @Override // com.ss.android.lark.setting.page.content.internal.mvp.MineInternalSettingsView.AbstractC54536a
        /* renamed from: a */
        public void mo186375a(MineInternalSettingsView mineInternalSettingsView) {
            ButterKnife.bind(mineInternalSettingsView, C54543b.this.f134838a);
        }
    }

    /* renamed from: a */
    private void m211602a() {
        C54549d dVar = new C54549d(new C54546c(), new MineInternalSettingsView(this.f134839b, new C54545a()));
        this.f134840c = dVar;
        dVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (UIUtils.isActivityRunning(this.f134839b) && !DesktopUtil.m144301a((Context) this.f134839b)) {
            this.f134839b.getWindow().setBackgroundDrawable(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m211602a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f134838a = layoutInflater.inflate(R.layout.activity_mine_internal_settings, viewGroup, false);
        this.f134839b = getActivity();
        return this.f134838a;
    }
}
