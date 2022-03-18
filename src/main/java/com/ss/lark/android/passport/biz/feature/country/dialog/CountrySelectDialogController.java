package com.ss.lark.android.passport.biz.feature.country.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\f\u001a\u00020\r\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u001a\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/country/dialog/CountrySelectDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "countries", "", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "dependency", "Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView$ViewDependency;", "view", "Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView;", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDefaultRootRes", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.country.a.b */
public final class CountrySelectDialogController extends UDDialogController {

    /* renamed from: a */
    public BaseCountrySelectView f163240a;

    /* renamed from: b */
    private List<? extends CountryBean> f163241b;

    /* renamed from: c */
    private BaseCountrySelectView.ViewDependency f163242c;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultRootRes() {
        return R.layout.signin_sdk_dialog_country_select;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.country.a.b$a */
    static final class DialogInterface$OnDismissListenerC64714a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ CountrySelectDialogController f163243a;

        DialogInterface$OnDismissListenerC64714a(CountrySelectDialogController bVar) {
            this.f163243a = bVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            CountrySelectDialogController.m254212a(this.f163243a).cn_();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountrySelectDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ BaseCountrySelectView m254212a(CountrySelectDialogController bVar) {
        BaseCountrySelectView aVar = bVar.f163240a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        return aVar;
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof CountrySelectDialogBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            CountrySelectDialogBuilder aVar = (CountrySelectDialogBuilder) uDBaseDialogBuilder;
            this.f163241b = aVar.f163238a;
            this.f163242c = aVar.f163239b;
            return;
        }
        throw new IllegalArgumentException(("builder should be CountrySelectDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback, com.larksuite.component.universe_design.dialog.UDDialogController
    public void onCreate(UDDialog uDDialog, Bundle bundle) {
        boolean z;
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        super.onCreate(uDDialog, bundle);
        BaseCountrySelectView.ViewDependency aVar = this.f163242c;
        boolean z2 = true;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ViewGroup viewGroup = (ViewGroup) uDDialog.findViewById(R.id.ll_root);
            if (viewGroup == null) {
                z2 = false;
            }
            if (z2) {
                CountrySelectDialogView cVar = new CountrySelectDialogView(getContext(), aVar, viewGroup);
                this.f163240a = cVar;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                }
                cVar.mo171169a();
                BaseCountrySelectView aVar2 = this.f163240a;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                }
                List<? extends CountryBean> list = this.f163241b;
                if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
                    arrayList = new ArrayList();
                }
                aVar2.mo223567a(arrayList);
                uDDialog.setOnDismissListener(new DialogInterface$OnDismissListenerC64714a(this));
                return;
            }
            throw new IllegalArgumentException("root should not be null".toString());
        }
        throw new IllegalArgumentException("dep should not be null".toString());
    }
}
