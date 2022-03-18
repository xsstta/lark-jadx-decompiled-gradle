package com.ss.android.lark.setting.page.content.general;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.setting.page.content.general.GeneralSettingView;
import com.ss.android.lark.setting.page.content.general.correction.CorrectionSettingComponent;
import com.ss.android.lark.setting.page.content.general.enterprisetopic.C54451a;

/* renamed from: com.ss.android.lark.setting.page.content.general.c */
public class C54437c extends BaseFragment {

    /* renamed from: a */
    public View f134628a;

    /* renamed from: b */
    public Activity f134629b;

    /* renamed from: c */
    private C54455f f134630c;

    /* renamed from: d */
    private C54451a f134631d;

    /* renamed from: e */
    private CorrectionSettingComponent f134632e;

    /* renamed from: f */
    private GeneralSettingView.AbstractC54429a f134633f = new GeneralSettingView.AbstractC54429a() {
        /* class com.ss.android.lark.setting.page.content.general.C54437c.C544381 */

        @Override // com.ss.android.lark.setting.page.content.general.GeneralSettingView.AbstractC54429a
        /* renamed from: a */
        public void mo186084a(AbstractC51324c cVar) {
            C51327f.m199086c(C54437c.this.f134629b, cVar);
        }

        @Override // com.ss.android.lark.setting.page.content.general.GeneralSettingView.AbstractC54429a
        /* renamed from: a */
        public void mo186085a(GeneralSettingView generalSettingView) {
            ButterKnife.bind(generalSettingView, C54437c.this.f134628a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C54455f fVar = this.f134630c;
        if (fVar != null) {
            fVar.destroy();
            this.f134630c = null;
        }
        C54451a aVar = this.f134631d;
        if (aVar != null) {
            aVar.mo186137a();
        }
    }

    /* renamed from: a */
    private void m211286a() {
        C54455f fVar = new C54455f(new C54444e(), new GeneralSettingView(this.f134629b, this.f134633f));
        this.f134630c = fVar;
        fVar.create();
        C54451a aVar = new C54451a(getViewLifecycleOwner());
        this.f134631d = aVar;
        aVar.mo186138a((ViewGroup) this.f134628a.findViewById(R.id.enterprise_topic_box_container));
        CorrectionSettingComponent aVar2 = new CorrectionSettingComponent(getViewLifecycleOwner());
        this.f134632e = aVar2;
        aVar2.mo186098a((ViewGroup) this.f134628a.findViewById(R.id.error_correction_box_container));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (UIUtils.isActivityRunning(this.f134629b) && !DesktopUtil.m144301a((Context) this.f134629b)) {
            this.f134629b.getWindow().setBackgroundDrawable(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m211286a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (DesktopUtil.m144301a(viewGroup.getContext())) {
            i = R.layout.activity_mine_setting_general_desktop;
        } else {
            i = R.layout.activity_mine_setting_general;
        }
        this.f134628a = layoutInflater.inflate(i, viewGroup, false);
        this.f134629b = getActivity();
        return this.f134628a;
    }
}
