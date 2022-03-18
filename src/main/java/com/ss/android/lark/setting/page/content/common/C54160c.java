package com.ss.android.lark.setting.page.content.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import com.ss.android.lark.setting.page.content.common.impl.font.FontSizeSettingHitPoint;
import com.ss.android.lark.setting.page.content.common.mvp.C54415b;
import com.ss.android.lark.setting.page.content.common.mvp.C54421c;
import com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView;

/* renamed from: com.ss.android.lark.setting.page.content.common.c */
public class C54160c extends BaseFragment {

    /* renamed from: a */
    public View f134057a;

    /* renamed from: b */
    public Activity f134058b;

    /* renamed from: c */
    private C54421c f134059c;

    /* renamed from: d */
    private final LanguageAndTranslateView.AbstractC54410a f134060d = new LanguageAndTranslateView.AbstractC54410a() {
        /* class com.ss.android.lark.setting.page.content.common.C54160c.C541611 */

        @Override // com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.AbstractC54410a
        /* renamed from: a */
        public void mo185353a() {
            m210267h();
        }

        @Override // com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.AbstractC54410a
        /* renamed from: b */
        public void mo185356b() {
            m210266g();
        }

        /* renamed from: g */
        private void m210266g() {
            C54150a.m210228b(C54160c.this.f134058b);
        }

        @Override // com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.AbstractC54410a
        /* renamed from: c */
        public void mo185357c() {
            C54150a.m210230c(C54160c.this.f134058b);
        }

        @Override // com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.AbstractC54410a
        /* renamed from: d */
        public void mo185358d() {
            C54150a.m210233f(C54160c.this.f134058b);
        }

        @Override // com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.AbstractC54410a
        /* renamed from: e */
        public void mo185359e() {
            C54150a.m210221a(C54160c.this.f134058b);
        }

        @Override // com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.AbstractC54410a
        /* renamed from: f */
        public void mo185360f() {
            C54150a.m210234g(C54160c.this.mContext);
        }

        /* renamed from: h */
        private void m210267h() {
            C54150a.m210223a(C54160c.this.f134058b, (Bundle) null);
        }

        @Override // com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.AbstractC54410a
        /* renamed from: a */
        public void mo185354a(LanguageAndTranslateView languageAndTranslateView) {
            ButterKnife.bind(languageAndTranslateView, C54160c.this.f134057a);
        }

        @Override // com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.AbstractC54410a
        /* renamed from: a */
        public void mo185355a(boolean z, String str) {
            if (z) {
                LKUIToast.show(C54160c.this.getContext(), (int) R.drawable.saving_pictures, str);
            } else {
                LKUIToast.show(C54160c.this.getContext(), str);
            }
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C54421c cVar = this.f134059c;
        if (cVar != null) {
            cVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f134059c.mo186061e();
    }

    /* renamed from: a */
    private void m210265a() {
        C54421c cVar = new C54421c(new C54415b(), new LanguageAndTranslateView(this.f134058b, this.f134060d));
        this.f134059c = cVar;
        cVar.create();
        this.f134059c.mo186058b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (UIUtils.isActivityRunning(this.f134058b) && !DesktopUtil.m144301a((Context) this.f134058b)) {
            this.f134058b.getWindow().setBackgroundDrawable(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m210265a();
        FontSizeSettingHitPoint.f134143a.mo185455a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 65281 && i2 == -1) {
            this.f134059c.mo186060d();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (DesktopUtil.m144301a(viewGroup.getContext())) {
            i = R.layout.activity_mine_language_translate_desktop;
        } else {
            i = R.layout.activity_mine_language_translate;
        }
        this.f134057a = layoutInflater.inflate(i, viewGroup, false);
        this.f134058b = getActivity();
        return this.f134057a;
    }
}
