package com.ss.android.lark.mine.impl.index.v2.list.setting;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.index.v2.list.base.BaseSubComponent;
import com.ss.android.lark.mine.impl.statistics.MineHitPoint;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.utils.C57886v;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseSubComponent;", "mContext", "Landroid/content/Context;", "mDependency", "Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingSubComponent$IDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingSubComponent$IDependency;)V", "getMContext", "()Landroid/content/Context;", "mLocaleCache", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILanguageDependency;", "kotlin.jvm.PlatformType", "getMLocaleCache", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$ILanguageDependency;", "mLocaleCache$delegate", "Lkotlin/Lazy;", "mModel", "Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingsModel;", "mNewVersionTipIV", "Landroid/widget/ImageView;", "getMNewVersionTipIV", "()Landroid/widget/ImageView;", "setMNewVersionTipIV", "(Landroid/widget/ImageView;)V", "mViewModel", "Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingsViewModel;", "sidebarType", "", "getSidebarType", "()I", "enable", "", "init", "", "initModel", "onCreate", "showUpdateRedDot", "showUpgrade", "Companion", "IDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingSubComponent extends BaseSubComponent {

    /* renamed from: c */
    public static final Companion f115422c = new Companion(null);

    /* renamed from: a */
    public SettingsViewModel f115423a;

    /* renamed from: b */
    public final IDependency f115424b;

    /* renamed from: d */
    private SettingsModel f115425d;

    /* renamed from: e */
    private final Lazy f115426e = LazyKt.lazy(C45714f.INSTANCE);

    /* renamed from: f */
    private final Context f115427f;
    @BindView(7111)
    public ImageView mNewVersionTipIV;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingSubComponent$IDependency;", "", "openSettings", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.SettingSubComponent$b */
    public interface IDependency {
        /* renamed from: a */
        void mo160819a();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: a */
    public int mo160827a() {
        return 1007;
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: b */
    public boolean mo160829b() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingSubComponent$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.SettingSubComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j */
    public final Context mo160871j() {
        return this.f115427f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$ILanguageDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.SettingSubComponent$f */
    static final class C45714f extends Lambda implements Function0<AbstractC45399a.AbstractC45407h> {
        public static final C45714f INSTANCE = new C45714f();

        C45714f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45407h invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133453l();
        }
    }

    /* renamed from: f */
    public final ImageView mo160868f() {
        ImageView imageView = this.mNewVersionTipIV;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewVersionTipIV");
        }
        return imageView;
    }

    /* renamed from: l */
    private final void m181214l() {
        View K = mo141184K();
        if (K != null) {
            K.setOnClickListener(new C45711c(this));
        }
        SettingsViewModel aVar = this.f115423a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        SettingSubComponent settingSubComponent = this;
        aVar.getHasNewVersion().mo5923a(settingSubComponent, new C45712d(this));
        SettingsViewModel aVar2 = this.f115423a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        aVar2.isShowUpdateRedDot().mo5923a(settingSubComponent, new C45713e(this));
    }

    /* renamed from: g */
    public final void mo160869g() {
        ImageView imageView = this.mNewVersionTipIV;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewVersionTipIV");
        }
        imageView.setVisibility(0);
        Bitmap a = C57886v.m224663a(R.layout.setting_view_upgrade_tip, this.f115427f, R.dimen.setting_upgrade_tip_width, R.dimen.setting_upgrade_tip_height);
        ImageView imageView2 = this.mNewVersionTipIV;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewVersionTipIV");
        }
        imageView2.setImageBitmap(a);
    }

    /* renamed from: i */
    public final void mo160870i() {
        ImageView imageView = this.mNewVersionTipIV;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewVersionTipIV");
        }
        imageView.setVisibility(0);
        ImageView imageView2 = this.mNewVersionTipIV;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewVersionTipIV");
        }
        imageView2.setImageResource(R.drawable.update_red_dot);
        ImageView imageView3 = this.mNewVersionTipIV;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewVersionTipIV");
        }
        ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
        layoutParams.height = -2;
        ImageView imageView4 = this.mNewVersionTipIV;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewVersionTipIV");
        }
        imageView4.setLayoutParams(layoutParams);
    }

    /* renamed from: k */
    private final void m181213k() {
        Context context = this.f115427f;
        if (context != null) {
            AbstractC1142af a = aj.m5366a((FragmentActivity) context).mo6005a(SettingsViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(mC…ngsViewModel::class.java)");
            SettingsViewModel aVar = (SettingsViewModel) a;
            this.f115423a = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            this.f115425d = new SettingsModel(aVar);
            WidgetManager a2 = WidgetManager.f99047e.mo141220a(this);
            SettingsModel settingsModel = this.f115425d;
            if (settingsModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mModel");
            }
            a2.mo141214a(settingsModel);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        mo141188a(LayoutInflater.from(this.f115427f).inflate(R.layout.sidebar_setting, (ViewGroup) null));
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        m181213k();
        m181214l();
        Log.m165389i("Mine_SettingSubComponent", "init setting sub component on" + getLifecycle().getCurrentState().name() + " is enable: " + mo160829b());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/setting/SettingSubComponent$init$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.SettingSubComponent$c */
    public static final class C45711c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingSubComponent f115428a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45711c(SettingSubComponent settingSubComponent) {
            this.f115428a = settingSubComponent;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            C45421b.m180420a().mo133436a(this.f115428a.mo160871j());
            this.f115428a.f115424b.mo160819a();
            MineHitPoint.m181467a("setting");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SettingsViewModel m181212a(SettingSubComponent settingSubComponent) {
        SettingsViewModel aVar = settingSubComponent.f115423a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.SettingSubComponent$d */
    public static final class C45712d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SettingSubComponent f115429a;

        C45712d(SettingSubComponent settingSubComponent) {
            this.f115429a = settingSubComponent;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f115429a.mo160869g();
            } else if (Intrinsics.areEqual((Object) SettingSubComponent.m181212a(this.f115429a).isShowUpdateRedDot().mo5927b(), (Object) true)) {
                this.f115429a.mo160870i();
            } else {
                this.f115429a.mo160868f().setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.SettingSubComponent$e */
    public static final class C45713e<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SettingSubComponent f115430a;

        C45713e(SettingSubComponent settingSubComponent) {
            this.f115430a = settingSubComponent;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f115430a.mo160870i();
            } else if (Intrinsics.areEqual((Object) SettingSubComponent.m181212a(this.f115430a).getHasNewVersion().mo5927b(), (Object) true)) {
                this.f115430a.mo160869g();
            } else {
                this.f115430a.mo160868f().setVisibility(8);
            }
        }
    }

    public SettingSubComponent(Context context, IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f115427f = context;
        this.f115424b = bVar;
    }
}
