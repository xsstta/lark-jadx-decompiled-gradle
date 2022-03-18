package com.ss.lark.android.passport.biz.feature.country.dialog;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tR\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/country/dialog/CountrySelectDialogBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "countries", "", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "dependency", "Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView$ViewDependency;", "setCountries", "setDependency", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.country.a.a */
public final class CountrySelectDialogBuilder extends UDBaseDialogBuilder<CountrySelectDialogBuilder> {

    /* renamed from: a */
    public List<? extends CountryBean> f163238a;

    /* renamed from: b */
    public BaseCountrySelectView.ViewDependency f163239b;

    /* renamed from: a */
    public final CountrySelectDialogBuilder mo223564a(List<? extends CountryBean> list) {
        this.f163238a = list;
        return this;
    }

    /* renamed from: a */
    public final CountrySelectDialogBuilder mo223563a(BaseCountrySelectView.ViewDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f163239b = aVar;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountrySelectDialogBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
