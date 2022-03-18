package com.ss.android.lark.setting.page.content.common.impl.translate;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54287f;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54297h;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.SpecificDisplaySettingView;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.b */
public class C54230b extends BaseFragment {

    /* renamed from: a */
    public View f134256a;

    /* renamed from: b */
    private Activity f134257b;

    /* renamed from: c */
    private C54287f f134258c;

    /* renamed from: d */
    private final C54279c.AbstractC54280a f134259d = new C54279c.AbstractC54280a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.C54230b.C542311 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: a */
        public void mo185591a() {
            C54230b.this.finish();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.C54279c.AbstractC54280a
        /* renamed from: a */
        public void mo185592a(C54279c cVar) {
            ButterKnife.bind(cVar, C54230b.this.f134256a);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C54287f fVar = this.f134258c;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    /* renamed from: a */
    private void m210619a() {
        C54287f fVar = new C54287f(new C54297h(), new SpecificDisplaySettingView(this.f134257b, this.f134259d));
        this.f134258c = fVar;
        fVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m210619a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f134256a = layoutInflater.inflate(R.layout.activity_setting_specific_display, viewGroup, false);
        this.f134257b = getActivity();
        return this.f134256a;
    }
}
