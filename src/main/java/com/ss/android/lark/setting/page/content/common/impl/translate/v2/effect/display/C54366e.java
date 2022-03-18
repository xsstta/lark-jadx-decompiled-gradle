package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.page.content.common.C54150a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplaySettingInfo;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.e */
public class C54366e extends BaseFragment {

    /* renamed from: a */
    public View f134487a;

    /* renamed from: b */
    public AbstractC54318a.AbstractC54327f f134488b;

    /* renamed from: c */
    public AbstractC54318a.AbstractC54326e<String> f134489c;

    /* renamed from: d */
    private C54368f f134490d;

    /* renamed from: e */
    private final LanguageSettingListView.AbstractC54317a f134491e = new LanguageSettingListView.AbstractC54317a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54366e.C543671 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.AbstractC54317a
        /* renamed from: a */
        public void mo185845a() {
            if (C54366e.this.f134488b != null) {
                C54366e.this.f134488b.mo185862a();
            } else {
                C54366e.this.finish();
            }
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.AbstractC54317a
        /* renamed from: b */
        public String mo185848b() {
            if (C54366e.this.f134488b != null) {
                return C54366e.this.f134488b.mo185863b();
            }
            return UIHelper.getString(R.string.Lark_NewSettings_SetByLanguageTranslationDisplay);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.AbstractC54317a
        /* renamed from: a */
        public void mo185846a(IView iView) {
            ButterKnife.bind(iView, C54366e.this.f134487a);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.AbstractC54317a
        /* renamed from: a */
        public void mo185847a(AbstractC54376b bVar) {
            if (C54366e.this.f134489c != null) {
                C54366e.this.f134489c.mo185861a(bVar);
            } else if (C54366e.this.mContext != null && bVar != null && (bVar instanceof LanguageDisplaySettingInfo)) {
                C54150a.m210226a(C54366e.this.mContext, (LanguageDisplaySettingInfo) bVar);
            }
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C54368f fVar = this.f134490d;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
        if (context instanceof AbstractC54318a.AbstractC54327f) {
            this.f134488b = (AbstractC54318a.AbstractC54327f) context;
        }
        if (context instanceof AbstractC54318a.AbstractC54326e) {
            this.f134489c = (AbstractC54318a.AbstractC54326e) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C54368f fVar = new C54368f(new C54363d(), new LanguageSettingListView(this.mContext, this.f134491e));
        fVar.create();
        this.f134490d = fVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_language_display_effect_setting, (ViewGroup) null, false);
        this.f134487a = inflate;
        return inflate;
    }
}
