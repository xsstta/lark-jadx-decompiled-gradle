package com.ss.lark.android.passport.biz.feature.country;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.feature.country.AbstractC64744h;
import com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView;
import com.ss.lark.android.passport.biz.feature.country.dialog.CountrySelectDialogBuilder;
import com.ss.lark.android.passport.biz.feature.country.dialog.CountrySelectDialogController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010\u001d\u001a\u00020\u0016J\u0016\u0010\u001e\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/country/CountrySelectManager;", "Lcom/ss/lark/android/passport/biz/feature/country/ICountrySelect;", "context", "Landroid/content/Context;", "fm", "Landroidx/fragment/app/FragmentManager;", "fragmentContainerId", "", "params", "Lcom/ss/lark/android/passport/biz/feature/country/CountrySelectParams;", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;ILcom/ss/lark/android/passport/biz/feature/country/CountrySelectParams;)V", "mCloseListener", "Lcom/ss/lark/android/passport/biz/feature/country/ICountrySelect$OnPageCloseListener;", "mDependency", "Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView$ViewDependency;", "mDialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "mFragment", "Lcom/ss/lark/android/passport/biz/feature/country/CountrySelectFragment;", "mOnCountrySelectListener", "Lcom/ss/lark/android/passport/biz/feature/country/ICountrySelect$OnCountrySelectListener;", "hide", "", "init", "reFetchList", "setCloseListener", "closeListener", "setOnCountrySelectListener", "onCountrySelectListener", "show", "showDialog", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "showFragment", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.country.d */
public final class CountrySelectManager implements AbstractC64744h {

    /* renamed from: h */
    public static final Companion f163260h = new Companion(null);

    /* renamed from: a */
    public AbstractC64744h.AbstractC64745a f163261a;

    /* renamed from: b */
    public AbstractC64744h.AbstractC64746b f163262b;

    /* renamed from: c */
    public final BaseCountrySelectView.ViewDependency f163263c = new C64723b(this);

    /* renamed from: d */
    public C64720c f163264d;

    /* renamed from: e */
    public UDDialog f163265e;

    /* renamed from: f */
    public final Context f163266f;

    /* renamed from: g */
    public final CountrySelectParams f163267g;

    /* renamed from: i */
    private final FragmentManager f163268i;

    /* renamed from: j */
    private final int f163269j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/country/CountrySelectManager$Companion;", "", "()V", "BOTTOM_DIALOG_STYLE_THRESHOLD", "", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.country.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onPageClose"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.country.d$d */
    public static final class C64727d implements AbstractC64744h.AbstractC64746b {

        /* renamed from: a */
        final /* synthetic */ CountrySelectManager f163275a;

        C64727d(CountrySelectManager dVar) {
            this.f163275a = dVar;
        }

        @Override // com.ss.lark.android.passport.biz.feature.country.AbstractC64744h.AbstractC64746b
        public final void onPageClose() {
            this.f163275a.f163263c.mo223560a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/lark/android/passport/biz/feature/country/CountrySelectManager$mDependency$1", "Lcom/ss/lark/android/passport/biz/feature/country/BaseCountrySelectView$ViewDependency;", "onCountryItemClick", "", "bean", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "onPageClose", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.country.d$b */
    public static final class C64723b implements BaseCountrySelectView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ CountrySelectManager f163270a;

        @Override // com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView.ViewDependency
        /* renamed from: a */
        public void mo223560a() {
            AbstractC64744h.AbstractC64746b bVar = this.f163270a.f163262b;
            if (bVar != null) {
                bVar.onPageClose();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64723b(CountrySelectManager dVar) {
            this.f163270a = dVar;
        }

        @Override // com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView.ViewDependency
        /* renamed from: a */
        public void mo223561a(CountryBean countryBean) {
            Intrinsics.checkParameterIsNotNull(countryBean, "bean");
            AbstractC64744h.AbstractC64745a aVar = this.f163270a.f163261a;
            if (aVar != null) {
                aVar.onCountrySelect(countryBean);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.country.d$c */
    static final class RunnableC64724c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CountrySelectManager f163271a;

        RunnableC64724c(CountrySelectManager dVar) {
            this.f163271a = dVar;
        }

        public final void run() {
            C64741g.m254275a().mo223608a(this.f163271a.f163266f, false, this.f163271a.f163267g.mo223547a(), (AbstractC49352d<List<CountryBean>>) new AbstractC49352d<List<? extends CountryBean>>(this) {
                /* class com.ss.lark.android.passport.biz.feature.country.CountrySelectManager.RunnableC64724c.C647251 */

                /* renamed from: a */
                final /* synthetic */ RunnableC64724c f163272a;

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                }

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.lark.android.passport.biz.feature.country.d$c$1$a */
                public static final class RunnableC64726a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C647251 f163273a;

                    /* renamed from: b */
                    final /* synthetic */ List f163274b;

                    RunnableC64726a(C647251 r1, List list) {
                        this.f163273a = r1;
                        this.f163274b = list;
                    }

                    public final void run() {
                        List list = this.f163274b;
                        if (list == null || list.size() > 6) {
                            this.f163273a.f163272a.f163271a.mo223579a(this.f163273a.f163272a.f163271a.f163267g);
                        } else {
                            this.f163273a.f163272a.f163271a.mo223582a(this.f163274b);
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f163272a = r1;
                }

                /* renamed from: a */
                public void mo145179a(List<? extends CountryBean> list) {
                    UICallbackExecutor.execute(new RunnableC64726a(this, list));
                }
            });
        }
    }

    /* renamed from: c */
    public void mo223584c() {
        if (this.f163264d != null) {
            C64720c cVar = this.f163264d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            }
            cVar.mo223577c();
        }
    }

    /* renamed from: a */
    public final void mo223578a() {
        CountrySelectManager dVar = this;
        if (dVar.f163264d != null) {
            C64720c cVar = this.f163264d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            }
            cVar.mo223576b();
        }
        if (dVar.f163265e != null) {
            UDDialog uDDialog = this.f163265e;
            if (uDDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDialog");
            }
            uDDialog.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo223583b() {
        boolean z;
        List<String> a = this.f163267g.mo223547a();
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo223579a(this.f163267g);
            return;
        }
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC64724c(this));
    }

    /* renamed from: a */
    public void mo223580a(AbstractC64744h.AbstractC64745a aVar) {
        this.f163261a = aVar;
    }

    /* renamed from: a */
    public void mo223581a(AbstractC64744h.AbstractC64746b bVar) {
        this.f163262b = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "kotlin.jvm.PlatformType", "onCountrySelect"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.country.d$e */
    public static final class C64728e implements AbstractC64744h.AbstractC64745a {

        /* renamed from: a */
        final /* synthetic */ CountrySelectManager f163276a;

        C64728e(CountrySelectManager dVar) {
            this.f163276a = dVar;
        }

        @Override // com.ss.lark.android.passport.biz.feature.country.AbstractC64744h.AbstractC64745a
        public final void onCountrySelect(CountryBean countryBean) {
            BaseCountrySelectView.ViewDependency aVar = this.f163276a.f163263c;
            Intrinsics.checkExpressionValueIsNotNull(countryBean, "it");
            aVar.mo223561a(countryBean);
        }
    }

    /* renamed from: a */
    public final void mo223582a(List<? extends CountryBean> list) {
        if (this.f163265e == null) {
            this.f163265e = ((CountrySelectDialogBuilder) ((CountrySelectDialogBuilder) ((CountrySelectDialogBuilder) new CountrySelectDialogBuilder(this.f163266f).controller(new CountrySelectDialogController(this.f163266f))).gravity(80)).mo223564a(list).mo223563a(this.f163263c).maskAlpha(0.3f)).show();
            return;
        }
        UDDialog uDDialog = this.f163265e;
        if (uDDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialog");
        }
        uDDialog.show();
    }

    /* renamed from: a */
    public final void mo223579a(CountrySelectParams countrySelectParams) {
        if (this.f163264d == null) {
            C64720c a = C64720c.m254226a(countrySelectParams);
            Intrinsics.checkExpressionValueIsNotNull(a, "CountrySelectFragment.newInstance(params)");
            this.f163264d = a;
            if (a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            }
            a.mo223575a(new C64727d(this));
            C64720c cVar = this.f163264d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            }
            cVar.mo223574a(new C64728e(this));
        }
        try {
            FragmentTransaction customAnimations = this.f163268i.beginTransaction().setCustomAnimations(R.anim.signin_sdk_translate_from_bottom, R.anim.signin_sdk_translate_to_bottom);
            Intrinsics.checkExpressionValueIsNotNull(customAnimations, "fm.beginTransaction().se…e_to_bottom\n            )");
            C64720c cVar2 = this.f163264d;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            }
            if (cVar2.isAdded()) {
                C64720c cVar3 = this.f163264d;
                if (cVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFragment");
                }
                customAnimations.show(cVar3).commitAllowingStateLoss();
                if (countrySelectParams.mo223548b()) {
                    mo223584c();
                    return;
                }
                return;
            }
            int i = this.f163269j;
            C64720c cVar4 = this.f163264d;
            if (cVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFragment");
            }
            customAnimations.add(i, cVar4).commitAllowingStateLoss();
        } catch (Exception e) {
            PassportLog.f123351c.mo171474a().mo171462a("CountrySelectManager", "show fragment failed", e);
        }
    }

    public CountrySelectManager(Context context, FragmentManager fragmentManager, int i, CountrySelectParams countrySelectParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
        Intrinsics.checkParameterIsNotNull(countrySelectParams, "params");
        this.f163266f = context;
        this.f163268i = fragmentManager;
        this.f163269j = i;
        this.f163267g = countrySelectParams;
    }
}
