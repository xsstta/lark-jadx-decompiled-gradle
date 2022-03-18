package com.ss.android.lark.setting.page.content.common.impl.locale;

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
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54210e;
import com.ss.android.lark.setting.page.content.common.impl.locale.mvp.C54213f;
import com.ss.android.lark.setting.page.content.common.impl.locale.mvp.LanguageSettingView;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.a */
public class C54181a extends BaseFragment {

    /* renamed from: a */
    public View f134154a;

    /* renamed from: b */
    private C54213f f134155b;

    /* renamed from: c */
    private Activity f134156c;

    /* renamed from: d */
    private boolean f134157d;

    /* renamed from: e */
    private final LanguageSettingView.AbstractC54189a f134158e = new LanguageSettingView.AbstractC54189a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.locale.C54181a.C541821 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.LanguageSettingView.AbstractC54189a
        /* renamed from: a */
        public void mo185486a() {
            C54181a.this.finish();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.locale.mvp.LanguageSettingView.AbstractC54189a
        /* renamed from: a */
        public void mo185487a(LanguageSettingView languageSettingView) {
            ButterKnife.bind(languageSettingView, C54181a.this.f134154a);
        }
    };

    /* renamed from: b */
    private void m210393b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f134157d = arguments.getBoolean("fromLogin", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C54213f fVar = this.f134155b;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C48211b.m190251a().mo168692d();
    }

    /* renamed from: a */
    private void m210392a() {
        C54213f fVar = new C54213f(new C54210e(), new LanguageSettingView(getActivity(), this.f134158e), this.f134157d);
        this.f134155b = fVar;
        fVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C48211b.m190251a().mo168689b("initMVP");
        m210393b();
        m210392a();
        if (UIUtils.isActivityRunning(this.f134156c) && !DesktopUtil.m144301a((Context) this.f134156c)) {
            this.f134156c.getWindow().setBackgroundDrawable(null);
        }
        C48211b.m190251a().mo168691c("initMVP");
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C48211b.m190251a().mo168689b("onCreateView");
        this.f134154a = layoutInflater.inflate(R.layout.activity_mine_setting_language, viewGroup, false);
        this.f134156c = getActivity();
        C48211b.m190251a().mo168691c("onCreateView");
        return this.f134154a;
    }
}
