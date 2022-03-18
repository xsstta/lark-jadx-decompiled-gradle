package com.ss.android.lark.setting.page.content.common.impl.translate.v2;

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
import com.ss.android.lark.setting.page.content.common.C54150a;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54394b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TranslateSettingView2;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.b */
public class C54309b extends BaseFragment {

    /* renamed from: a */
    public View f134393a;

    /* renamed from: b */
    public Activity f134394b;

    /* renamed from: c */
    private C54394b f134395c;

    /* renamed from: d */
    private final C54279c.AbstractC54280a f134396d = new C54279c.AbstractC54280a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54309b.C543101 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: a */
        public void mo185591a() {
            C54309b.this.finish();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: b */
        public void mo185789b() {
            C54150a.m210230c(C54309b.this.f134394b);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: c */
        public void mo185790c() {
            C54150a.m210231d(C54309b.this.f134394b);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: d */
        public void mo185791d() {
            C54150a.m210232e(C54309b.this.f134394b);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: a */
        public void mo185592a(C54279c cVar) {
            ButterKnife.bind(cVar, C54309b.this.f134393a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C54394b bVar = this.f134395c;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    /* renamed from: a */
    private void m210877a() {
        C54394b bVar = new C54394b(new C54297h(), new TranslateSettingView2(this.f134394b, this.f134396d));
        this.f134395c = bVar;
        bVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m210877a();
        if (UIUtils.isActivityRunning(this.f134394b) && !DesktopUtil.m144301a((Context) this.f134394b)) {
            this.f134394b.getWindow().setBackgroundDrawable(null);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f134393a = layoutInflater.inflate(R.layout.activity_setting_translate2, viewGroup, false);
        this.f134394b = getActivity();
        return this.f134393a;
    }
}
