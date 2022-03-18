package com.ss.android.lark.contact.impl.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.impl.setting.mvp.C36008b;
import com.ss.android.lark.contact.impl.setting.mvp.C36011c;
import com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.contact.impl.setting.b */
public class C35991b extends BaseFragment {

    /* renamed from: a */
    public View f93047a;

    /* renamed from: b */
    private Activity f93048b;

    /* renamed from: c */
    private C36011c f93049c;

    /* renamed from: d */
    private final PrivacySettingView.AbstractC36003a f93050d = new PrivacySettingView.AbstractC36003a() {
        /* class com.ss.android.lark.contact.impl.setting.C35991b.C359921 */

        @Override // com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.AbstractC36003a
        /* renamed from: a */
        public void mo132401a() {
            C35991b.this.setResult(-1);
            C35991b.this.finish();
        }

        @Override // com.ss.android.lark.contact.impl.setting.mvp.PrivacySettingView.AbstractC36003a
        /* renamed from: a */
        public void mo132402a(PrivacySettingView privacySettingView) {
            ButterKnife.bind(privacySettingView, C35991b.this.f93047a);
        }
    };

    /* renamed from: e */
    private PrivacySettingView f93051e;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C36011c cVar = this.f93049c;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private void m141135a() {
        C36008b bVar = new C36008b();
        PrivacySettingView privacySettingView = new PrivacySettingView(this.f93048b, this.f93050d);
        this.f93051e = privacySettingView;
        C36011c cVar = new C36011c(bVar, privacySettingView);
        this.f93049c = cVar;
        cVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (UIUtils.isActivityRunning(this.f93048b) && !DesktopUtil.m144301a((Context) this.f93048b)) {
            this.f93048b.getWindow().setBackgroundDrawable(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m141135a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f93051e.mo132408a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (DesktopUtil.m144301a(viewGroup.getContext())) {
            i = R.layout.activity_setting_privacy_desktop;
        } else {
            i = R.layout.activity_setting_privacy;
        }
        this.f93047a = layoutInflater.inflate(i, viewGroup, false);
        this.f93048b = getActivity();
        return this.f93047a;
    }
}
