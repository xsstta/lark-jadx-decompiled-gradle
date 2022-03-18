package com.ss.lark.android.passport.biz.feature.user_info.p3233a;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SetUserInfoStepInfo;
import com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65091c;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.b */
public class C65090b extends PagerAdapter {

    /* renamed from: a */
    private final SetUserInfoStepInfo f163905a;

    /* renamed from: b */
    private final List<SetUserInfoStepInfo.CredentialInputItem> f163906b;

    /* renamed from: c */
    private final SetUserInfoStepInfo.Input f163907c;

    /* renamed from: d */
    private final UniContext f163908d;

    /* renamed from: e */
    private CountryBean f163909e;

    /* renamed from: f */
    private final boolean f163910f;

    /* renamed from: g */
    private final C65091c.AbstractC65093a f163911g;

    /* renamed from: h */
    private final C65091c.AbstractC65094b f163912h;

    /* renamed from: i */
    private final SparseArray<C65091c> f163913i = new SparseArray<>();

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f163906b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f163906b.get(i).mTabName;
    }

    /* renamed from: a */
    public boolean mo224250a(int i) {
        C65091c cVar = this.f163913i.get(i);
        if (cVar == null || !cVar.mo224255c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo224248a(int i, String str) {
        C65091c cVar = this.f163913i.get(i);
        if (cVar != null) {
            cVar.mo224253a(str);
            cVar.mo224254b();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C65091c a = mo224247a(i, viewGroup.getContext(), viewGroup);
        this.f163913i.put(i, a);
        View a2 = a.mo224251a();
        viewGroup.addView(a2);
        return a2;
    }

    /* renamed from: a */
    public void mo224249a(CountryBean countryBean, boolean z) {
        this.f163909e = countryBean;
        for (int i = 0; i < this.f163913i.size(); i++) {
            SparseArray<C65091c> sparseArray = this.f163913i;
            C65091c cVar = sparseArray.get(sparseArray.keyAt(i));
            if (cVar != null) {
                cVar.mo224252a(countryBean, z);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C65091c cVar = this.f163913i.get(i);
        if (cVar != null) {
            viewGroup.removeView(cVar.mo224251a());
            this.f163913i.remove(i);
        }
    }

    /* renamed from: a */
    public C65091c mo224247a(int i, Context context, ViewGroup viewGroup) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("step_info", this.f163905a);
        bundle.putSerializable("cp_item", this.f163906b.get(i));
        bundle.putSerializable("country_bean", this.f163909e);
        bundle.putSerializable("name_input", this.f163907c);
        bundle.putSerializable("enable_change_region_code", Boolean.valueOf(this.f163910f));
        bundle.putInt("position", i);
        return new C65091c(bundle, context, this.f163908d, viewGroup, this.f163911g, this.f163912h);
    }

    public C65090b(SetUserInfoStepInfo setUserInfoStepInfo, UniContext uniContext, CountryBean countryBean, boolean z, C65091c.AbstractC65093a aVar, C65091c.AbstractC65094b bVar) {
        this.f163905a = setUserInfoStepInfo;
        this.f163906b = setUserInfoStepInfo.mCredentialInputList;
        this.f163907c = setUserInfoStepInfo.mNameInput;
        this.f163908d = uniContext;
        this.f163909e = countryBean;
        this.f163910f = z;
        this.f163911g = aVar;
        this.f163912h = bVar;
    }
}
