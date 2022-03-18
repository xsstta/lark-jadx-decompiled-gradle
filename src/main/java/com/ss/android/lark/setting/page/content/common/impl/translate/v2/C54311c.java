package com.ss.android.lark.setting.page.content.common.impl.translate.v2;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.C54389a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp.TargetLanguageSettingView2;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.c */
public class C54311c extends BaseFragment {

    /* renamed from: a */
    public View f134398a;

    /* renamed from: b */
    private C54389a f134399b;

    /* renamed from: c */
    private Activity f134400c;

    /* renamed from: d */
    private final C54279c.AbstractC54280a f134401d = new C54279c.AbstractC54280a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54311c.C543121 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: a */
        public void mo185591a() {
            C54311c.this.finish();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: a */
        public void mo185592a(C54279c cVar) {
            ButterKnife.bind(cVar, C54311c.this.f134398a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C54389a aVar = this.f134399b;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    /* renamed from: a */
    private void m210883a() {
        C54389a aVar = new C54389a(new C54297h(), new TargetLanguageSettingView2(this.f134400c, this.f134401d));
        this.f134399b = aVar;
        aVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m210883a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f134398a = layoutInflater.inflate(R.layout.activity_setting_target_language, viewGroup, false);
        this.f134400c = getActivity();
        return this.f134398a;
    }
}
