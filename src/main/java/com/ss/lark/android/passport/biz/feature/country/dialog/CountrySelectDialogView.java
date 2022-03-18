package com.ss.lark.android.passport.biz.feature.country.dialog;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView;
import com.ss.lark.android.passport.biz.feature.country.C64715b;
import com.ss.lark.android.passport.biz.feature.country.CountrySelectModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/country/dialog/CountrySelectDialogView;", "Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView;", "mContext", "Landroid/content/Context;", "mDependency", "Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView$ViewDependency;", "mContentView", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView$ViewDependency;Landroid/view/ViewGroup;)V", "adapter", "Lcom/ss/lark/android/passport/biz/feature/country/CountryListAdapter;", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "initView", "", "resetViews", "setCountry", "countryInfo", "Lcom/ss/lark/android/passport/biz/feature/country/CountrySelectModel$CountryInfo;", "Lcom/ss/lark/android/passport/biz/feature/country/CountrySelectModel;", "showSearchResult", "beans", "", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.country.a.c */
public final class CountrySelectDialogView extends BaseCountrySelectView {

    /* renamed from: h */
    private final RecyclerView f163244h;

    /* renamed from: i */
    private final C64715b f163245i = new C64715b();

    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64749b
    /* renamed from: a */
    public void mo223566a(CountrySelectModel.CountryInfo countryInfo) {
    }

    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64749b
    /* renamed from: g */
    public void mo223568g() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView
    /* renamed from: f */
    public void mo223559f() {
        RecyclerView recyclerView = this.f163244h;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f163232e));
        RecyclerView recyclerView2 = this.f163244h;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rv");
        recyclerView2.setAdapter(this.f163245i);
        this.f163245i.mo223570a(mo223557d());
    }

    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64749b
    /* renamed from: a */
    public void mo223567a(List<CountryBean> list) {
        this.f163245i.mo223569a();
        if (list != null) {
            this.f163245i.mo223571a(list);
        }
        this.f163245i.notifyDataSetChanged();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountrySelectDialogView(Context context, BaseCountrySelectView.ViewDependency aVar, ViewGroup viewGroup) {
        super(context, aVar, viewGroup);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mDependency");
        Intrinsics.checkParameterIsNotNull(viewGroup, "mContentView");
        this.f163244h = (RecyclerView) viewGroup.findViewById(R.id.rv_country);
    }
}
