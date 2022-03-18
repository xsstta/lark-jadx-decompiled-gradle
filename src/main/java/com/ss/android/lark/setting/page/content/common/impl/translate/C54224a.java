package com.ss.android.lark.setting.page.content.common.impl.translate;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AutoTranslateSettingView;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54272a;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.a */
public class C54224a extends BaseFragment {

    /* renamed from: a */
    public View f134234a;

    /* renamed from: b */
    private Activity f134235b;

    /* renamed from: c */
    private C54272a f134236c;

    /* renamed from: d */
    private final C54279c.AbstractC54280a f134237d = new C54279c.AbstractC54280a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.C54224a.C542251 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: a */
        public void mo185591a() {
            C54224a.this.finish();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: a */
        public void mo185592a(C54279c cVar) {
            ButterKnife.bind(cVar, C54224a.this.f134234a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C54272a aVar = this.f134236c;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    /* renamed from: a */
    private void m210598a() {
        C54272a aVar = new C54272a(new C54297h(), new AutoTranslateSettingView(this.f134235b, this.f134237d));
        this.f134236c = aVar;
        aVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m210598a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f134234a = layoutInflater.inflate(R.layout.activity_setting_auto_translate, viewGroup, false);
        this.f134235b = getActivity();
        return this.f134234a;
    }
}
