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
import com.ss.android.lark.setting.page.content.common.C54150a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageAutoTranslateSettingInfo;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.e */
public class C54341e extends BaseFragment {

    /* renamed from: a */
    public View f134440a;

    /* renamed from: b */
    public AbstractC54318a.AbstractC54327f f134441b;

    /* renamed from: c */
    public AbstractC54318a.AbstractC54326e<C54377c> f134442c;

    /* renamed from: d */
    private final LanguageSettingListView.AbstractC54317a f134443d = new LanguageSettingListView.AbstractC54317a() {
        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54341e.C543421 */

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.AbstractC54317a
        /* renamed from: a */
        public void mo185845a() {
            if (C54341e.this.f134441b != null) {
                C54341e.this.f134441b.mo185862a();
            }
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.AbstractC54317a
        /* renamed from: b */
        public String mo185848b() {
            if (C54341e.this.f134441b != null) {
                return C54341e.this.f134441b.mo185863b();
            }
            return "";
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.AbstractC54317a
        /* renamed from: a */
        public void mo185846a(IView iView) {
            ButterKnife.bind(iView, C54341e.this.f134440a);
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.AbstractC54317a
        /* renamed from: a */
        public void mo185847a(AbstractC54376b bVar) {
            if (C54341e.this.f134442c != null) {
                C54341e.this.f134442c.mo185861a(bVar);
            }
        }
    };

    /* renamed from: e */
    private C54345f f134444e;

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C54345f fVar = this.f134444e;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
        if (context instanceof AbstractC54318a.AbstractC54327f) {
            this.f134441b = (AbstractC54318a.AbstractC54327f) context;
        } else {
            this.f134441b = new AbstractC54318a.AbstractC54327f() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54341e.C543432 */

                @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54327f
                /* renamed from: a */
                public void mo185862a() {
                    C54341e.this.finish();
                }

                @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54327f
                /* renamed from: b */
                public String mo185863b() {
                    return UIHelper.getString(R.string.Lark_NewSettings_AutoTranslation);
                }
            };
        }
        if (context instanceof AbstractC54318a.AbstractC54326e) {
            this.f134442c = (AbstractC54318a.AbstractC54326e) context;
        } else {
            this.f134442c = new AbstractC54318a.AbstractC54326e<C54377c>() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54341e.C543443 */

                @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54326e
                /* renamed from: a */
                public void mo185861a(AbstractC54376b<C54377c> bVar) {
                    if (C54341e.this.mContext != null && (bVar instanceof LanguageAutoTranslateSettingInfo)) {
                        C54150a.m210225a(C54341e.this.mContext, (LanguageAutoTranslateSettingInfo) bVar);
                    }
                }
            };
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C54345f fVar = new C54345f(new C54338d(), new LanguageSettingListView(this.mContext, this.f134443d));
        fVar.create();
        this.f134444e = fVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_language_auto_translate_setting, (ViewGroup) null, false);
        this.f134440a = inflate;
        return inflate;
    }
}
