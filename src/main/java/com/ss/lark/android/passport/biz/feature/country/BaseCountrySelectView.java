package com.ss.lark.android.passport.biz.feature.country;

import android.content.Context;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.feature.country.C64715b;
import com.ss.lark.android.passport.biz.feature.country.C64747i;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0015H$J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0016R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0004@\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8DX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView;", "Lcom/ss/lark/android/passport/biz/feature/country/ICountrySelectContract$IView;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BaseView;", "Lcom/ss/lark/android/passport/biz/feature/country/ICountrySelectContract$IView$Delegate;", "mContext", "Landroid/content/Context;", "mDependency", "Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView$ViewDependency;", "mContentView", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView$ViewDependency;Landroid/view/ViewGroup;)V", "mDelegate", "mTitleBar", "Lcom/ss/android/lark/passport/infra/widget/CommonTitleBar;", "onItemClickListener", "Lcom/ss/lark/android/passport/biz/feature/country/CountryListAdapter$OnItemClickListener;", "getOnItemClickListener", "()Lcom/ss/lark/android/passport/biz/feature/country/CountryListAdapter$OnItemClickListener;", "onItemClickListener$delegate", "Lkotlin/Lazy;", "create", "", "destroy", "getContext", "initView", "setViewDelegate", "viewDelegate", "ViewDependency", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.country.a */
public abstract class BaseCountrySelectView extends AbstractC49023c<C64747i.AbstractC64749b.AbstractC64750a> implements C64747i.AbstractC64749b {

    /* renamed from: c */
    protected C64747i.AbstractC64749b.AbstractC64750a f163230c;

    /* renamed from: d */
    protected final CommonTitleBar f163231d;

    /* renamed from: e */
    public final Context f163232e;

    /* renamed from: f */
    public final ViewDependency f163233f;

    /* renamed from: g */
    public final ViewGroup f163234g;

    /* renamed from: h */
    private final Lazy f163235h = LazyKt.lazy(new C64712b(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView$ViewDependency;", "", "onCountryItemClick", "", "bean", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "onPageClose", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.country.a$a */
    public interface ViewDependency {
        /* renamed from: a */
        void mo223560a();

        /* renamed from: a */
        void mo223561a(CountryBean countryBean);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C64715b.AbstractC64719b mo223557d() {
        return (C64715b.AbstractC64719b) this.f163235h.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo223559f();

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        mo223559f();
    }

    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64749b
    /* renamed from: e */
    public Context mo223558e() {
        return this.f163232e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/lark/android/passport/biz/feature/country/CountryListAdapter$OnItemClickListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.country.a$b */
    static final class C64712b extends Lambda implements Function0<C64715b.AbstractC64719b> {
        final /* synthetic */ BaseCountrySelectView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64712b(BaseCountrySelectView aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C64715b.AbstractC64719b invoke() {
            return new C64715b.AbstractC64719b(this) {
                /* class com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView.C64712b.C647131 */

                /* renamed from: a */
                final /* synthetic */ C64712b f163237a;

                {
                    this.f163237a = r1;
                }

                @Override // com.ss.lark.android.passport.biz.feature.country.C64715b.AbstractC64719b
                /* renamed from: a */
                public final void mo223562a(CountryBean countryBean) {
                    C64747i.AbstractC64749b.AbstractC64750a aVar = this.f163237a.this$0.f163230c;
                    if (aVar != null) {
                        aVar.mo223594a(countryBean);
                    }
                    ViewDependency aVar2 = this.f163237a.this$0.f163233f;
                    Intrinsics.checkExpressionValueIsNotNull(countryBean, "bean");
                    aVar2.mo223561a(countryBean);
                    this.f163237a.this$0.f163233f.mo223560a();
                }
            };
        }
    }

    /* renamed from: a */
    public void mo171188a(C64747i.AbstractC64749b.AbstractC64750a aVar) {
        this.f163230c = aVar;
    }

    public BaseCountrySelectView(Context context, ViewDependency aVar, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mDependency");
        Intrinsics.checkParameterIsNotNull(viewGroup, "mContentView");
        this.f163232e = context;
        this.f163233f = aVar;
        this.f163234g = viewGroup;
        CommonTitleBar commonTitleBar = (CommonTitleBar) viewGroup.findViewById(R.id.title);
        this.f163231d = commonTitleBar;
        if (commonTitleBar != null) {
            commonTitleBar.setTitleClickListener(new CommonTitleBar.AbstractC49238b(this) {
                /* class com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView.C647111 */

                /* renamed from: a */
                final /* synthetic */ BaseCountrySelectView f163236a;

                @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
                /* renamed from: b */
                public void mo171770b() {
                }

                @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
                /* renamed from: c */
                public void mo171771c() {
                }

                @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
                /* renamed from: d */
                public void mo171772d() {
                }

                @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
                /* renamed from: a */
                public void mo171769a() {
                    this.f163236a.f163233f.mo223560a();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f163236a = r1;
                }
            });
        }
    }
}
