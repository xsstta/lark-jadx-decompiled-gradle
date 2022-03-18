package com.ss.android.lark.notification.setting.impl.badgestyle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.setting.impl.badgestyle.mvp.BadgeStyleSettingsView;
import com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48585a;
import com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48587b;

/* renamed from: com.ss.android.lark.notification.setting.impl.badgestyle.a */
public class C48583a extends BaseFragment {

    /* renamed from: a */
    C48587b f122222a;

    /* renamed from: b */
    C48587b.AbstractC48591a f122223b = new C48587b.AbstractC48591a() {
        /* class com.ss.android.lark.notification.setting.impl.badgestyle.C48583a.C485841 */

        @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48587b.AbstractC48591a
        /* renamed from: a */
        public void mo169678a(BadgeStyleSettingsView badgeStyleSettingsView) {
            ButterKnife.bind(badgeStyleSettingsView, C48583a.this.f122224c);
        }

        @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48587b.AbstractC48591a
        /* renamed from: a */
        public void mo169679a(boolean z, String str) {
            if (z) {
                LKUIToast.show(C48583a.this.f122225d, str);
            } else {
                LKUIToast.show(C48583a.this.f122225d, str);
            }
        }
    };

    /* renamed from: c */
    public View f122224c;

    /* renamed from: d */
    public Activity f122225d;

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C48587b bVar = this.f122222a;
        if (bVar != null) {
            bVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private void m191519a() {
        C48587b bVar = new C48587b(new C48585a(), new BadgeStyleSettingsView(this.f122225d, this.f122223b));
        this.f122222a = bVar;
        bVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (UIUtils.isActivityRunning(this.f122225d) && !DesktopUtil.m144301a((Context) this.f122225d)) {
            this.f122225d.getWindow().setBackgroundDrawable(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m191519a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122224c = layoutInflater.inflate(R.layout.activity_setting_badgestyle, viewGroup, false);
        this.f122225d = getActivity();
        return this.f122224c;
    }
}
