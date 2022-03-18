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
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.DisplaySettingDetailView;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplaySettingInfo;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.a */
public class C54356a extends BaseFragment {

    /* renamed from: a */
    public View f134469a;

    /* renamed from: b */
    public LanguageDisplaySettingInfo f134470b;

    /* renamed from: c */
    private C54359c f134471c;

    /* renamed from: d */
    private final DisplaySettingDetailView.AbstractC54355b f134472d = new DisplaySettingDetailView.AbstractC54355b() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54356a.C543571 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.DisplaySettingDetailView.AbstractC54355b
        /* renamed from: c */
        public void mo185919c() {
            C54356a.this.finish();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.DisplaySettingDetailView.AbstractC54355b
        /* renamed from: a */
        public String mo185916a() {
            if (C54356a.this.f134470b == null) {
                return "";
            }
            return C54356a.this.f134470b.mo185945c();
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.DisplaySettingDetailView.AbstractC54355b
        /* renamed from: b */
        public String mo185918b() {
            if (C54356a.this.f134470b == null) {
                return "";
            }
            return UIHelper.mustacheFormat(UIHelper.getString(R.string.Lark_Chat_SetTranslateStyleByLanguageDescription), "language", C54356a.this.f134470b.mo185945c());
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.DisplaySettingDetailView.AbstractC54355b
        /* renamed from: a */
        public void mo185917a(IView iView) {
            ButterKnife.bind(iView, C54356a.this.f134469a);
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C54359c cVar = this.f134471c;
        if (cVar != null) {
            cVar.destroy();
            this.f134471c = null;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    /* renamed from: b */
    public static Bundle m211029b(LanguageDisplaySettingInfo languageDisplaySettingInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg1", languageDisplaySettingInfo);
        return bundle;
    }

    /* renamed from: a */
    public static C54356a m211028a(LanguageDisplaySettingInfo languageDisplaySettingInfo) {
        C54356a aVar = new C54356a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg1", languageDisplaySettingInfo);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f134470b = (LanguageDisplaySettingInfo) getArguments().getParcelable("arg1");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C54359c cVar = new C54359c(new C54358b(), new DisplaySettingDetailView(view.getContext(), this.f134472d), this.f134470b);
        cVar.create();
        this.f134471c = cVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_display_detail, viewGroup, false);
        this.f134469a = inflate;
        return inflate;
    }
}
