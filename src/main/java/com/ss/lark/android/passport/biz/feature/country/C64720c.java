package com.ss.lark.android.passport.biz.feature.country;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0203c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.feature.country.AbstractC64744h;
import com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView;

/* renamed from: com.ss.lark.android.passport.biz.feature.country.c */
public class C64720c extends Fragment implements AbstractC64744h {

    /* renamed from: a */
    public AbstractC64744h.AbstractC64745a f163253a;

    /* renamed from: b */
    public AbstractC64744h.AbstractC64746b f163254b;

    /* renamed from: c */
    private C64729e f163255c;

    /* renamed from: d */
    private BaseCountrySelectView.ViewDependency f163256d = new BaseCountrySelectView.ViewDependency() {
        /* class com.ss.lark.android.passport.biz.feature.country.C64720c.C647211 */

        @Override // com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView.ViewDependency
        /* renamed from: a */
        public void mo223560a() {
            if (C64720c.this.f163254b != null) {
                C64720c.this.f163254b.onPageClose();
            }
        }

        @Override // com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView.ViewDependency
        /* renamed from: a */
        public void mo223561a(CountryBean countryBean) {
            if (C64720c.this.f163253a != null) {
                C64720c.this.f163253a.onCountrySelect(countryBean);
            }
        }
    };

    /* renamed from: e */
    private AbstractC0203c f163257e = null;

    /* renamed from: a */
    public static C64720c m254225a() {
        return m254226a((CountrySelectParams) null);
    }

    /* renamed from: c */
    public void mo223577c() {
        C64729e eVar = this.f163255c;
        if (eVar != null) {
            eVar.mo223589h();
        }
    }

    /* renamed from: b */
    public void mo223576b() {
        if (isVisible() && isAdded()) {
            getParentFragmentManager().beginTransaction().setCustomAnimations(R.anim.signin_sdk_translate_from_bottom, R.anim.signin_sdk_translate_to_bottom).hide(this).commitNow();
        }
    }

    /* renamed from: a */
    public void mo223574a(AbstractC64744h.AbstractC64745a aVar) {
        this.f163253a = aVar;
    }

    /* renamed from: a */
    private void m254228a(boolean z) {
        AbstractC0203c cVar = this.f163257e;
        if (cVar != null) {
            cVar.setEnabled(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        m254228a(!z);
    }

    /* renamed from: a */
    public static C64720c m254226a(CountrySelectParams countrySelectParams) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("COUNTRY_SELECT_PARAMS", countrySelectParams);
        C64720c cVar = new C64720c();
        cVar.setArguments(bundle);
        return cVar;
    }

    /* renamed from: a */
    private void m254227a(ViewGroup viewGroup) {
        CountrySelectParams countrySelectParams;
        C64737f fVar = new C64737f(getContext(), this.f163256d, viewGroup);
        CountrySelectModel countrySelectModel = new CountrySelectModel();
        Bundle arguments = getArguments();
        if (arguments != null) {
            countrySelectParams = (CountrySelectParams) arguments.getParcelable("COUNTRY_SELECT_PARAMS");
        } else {
            countrySelectParams = null;
        }
        C64729e eVar = new C64729e(countrySelectModel, fVar, null, countrySelectParams, PassportLog.f123351c.mo171474a());
        this.f163255c = eVar;
        eVar.mo171169a();
    }

    /* renamed from: a */
    public void mo223575a(AbstractC64744h.AbstractC64746b bVar) {
        this.f163254b = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        if (this.f163257e == null) {
            this.f163257e = new AbstractC0203c(true) {
                /* class com.ss.lark.android.passport.biz.feature.country.C64720c.C647222 */

                @Override // androidx.activity.AbstractC0203c
                public void handleOnBackPressed() {
                    if (C64720c.this.f163254b != null) {
                        C64720c.this.f163254b.onPageClose();
                    } else {
                        C64720c.this.mo223576b();
                    }
                }
            };
            onBackPressedDispatcher.addCallback(getViewLifecycleOwner(), this.f163257e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.signin_sdk_fragment_country_select, (ViewGroup) null);
        m254227a(viewGroup2);
        return viewGroup2;
    }
}
