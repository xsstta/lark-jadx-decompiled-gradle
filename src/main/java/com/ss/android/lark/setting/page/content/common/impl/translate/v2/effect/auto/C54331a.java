package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.AutoTranslateSettingDetailView;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageAutoTranslateSettingInfo;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.a */
public class C54331a extends BaseFragment {

    /* renamed from: a */
    public LanguageAutoTranslateSettingInfo f134422a;

    /* renamed from: b */
    public View f134423b;

    /* renamed from: c */
    private C54334c f134424c;

    /* renamed from: d */
    private final AutoTranslateSettingDetailView.AbstractC54330b f134425d = new AutoTranslateSettingDetailView.AbstractC54330b() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54331a.C543321 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.AutoTranslateSettingDetailView.AbstractC54330b
        /* renamed from: c */
        public void mo185880c() {
            C54331a.this.finish();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.AutoTranslateSettingDetailView.AbstractC54330b
        /* renamed from: a */
        public String mo185877a() {
            if (C54331a.this.f134422a == null) {
                return "";
            }
            return C54331a.this.f134422a.mo185945c();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.AutoTranslateSettingDetailView.AbstractC54330b
        /* renamed from: b */
        public String mo185879b() {
            String str;
            String string = UIHelper.getString(R.string.Lark_Chat_SetAutoTranslateByLanguageDescription);
            if (C54331a.this.f134422a == null) {
                str = "";
            } else {
                str = C54331a.this.f134422a.mo185945c();
            }
            return UIHelper.mustacheFormat(string, "language", str);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.AutoTranslateSettingDetailView.AbstractC54330b
        /* renamed from: a */
        public void mo185878a(IView iView) {
            ButterKnife.bind(iView, C54331a.this.f134423b);
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C54334c cVar = this.f134424c;
        if (cVar != null) {
            cVar.destroy();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    /* renamed from: b */
    public static Bundle m210947b(LanguageAutoTranslateSettingInfo languageAutoTranslateSettingInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg1", languageAutoTranslateSettingInfo);
        return bundle;
    }

    /* renamed from: a */
    public static C54331a m210946a(LanguageAutoTranslateSettingInfo languageAutoTranslateSettingInfo) {
        C54331a aVar = new C54331a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg1", languageAutoTranslateSettingInfo);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f134422a = (LanguageAutoTranslateSettingInfo) getArguments().getParcelable("arg1");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C54334c cVar = new C54334c(new C54333b(), new AutoTranslateSettingDetailView(view.getContext(), this.f134425d), this.f134422a);
        cVar.create();
        this.f134424c = cVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_auto_translate_detail, viewGroup, false);
        this.f134423b = inflate;
        return inflate;
    }
}
