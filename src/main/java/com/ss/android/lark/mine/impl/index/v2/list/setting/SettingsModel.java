package com.ss.android.lark.mine.impl.index.v2.list.setting;

import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.p2273b.p2274a.AbstractC45432a;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingsModel;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "mViewModel", "Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingsViewModel;", "(Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingsViewModel;)V", "mObserverDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IObserverDependency;", "getMObserverDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IObserverDependency;", "mObserverDependency$delegate", "Lkotlin/Lazy;", "mUpgradeDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IUpgradeDependency;", "getMUpgradeDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IUpgradeDependency;", "mUpgradeDependency$delegate", "mUpgradeObserver", "Lcom/ss/android/lark/mine/impl/listener/observer/IUpgradeObserver;", "getMViewModel", "()Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingsViewModel;", "onCreate", "", "onDestroy", "onResume", "updateNewVersion", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingsModel extends Widget {

    /* renamed from: a */
    public static final Companion f115432a = new Companion(null);

    /* renamed from: b */
    private AbstractC45432a f115433b = new C45717d(this);

    /* renamed from: c */
    private final Lazy f115434c = LazyKt.lazy(C45715b.INSTANCE);

    /* renamed from: d */
    private final Lazy f115435d = LazyKt.lazy(C45716c.INSTANCE);

    /* renamed from: e */
    private final SettingsViewModel f115436e;

    /* renamed from: b */
    private final AbstractC45399a.AbstractC45413n m181225b() {
        return (AbstractC45399a.AbstractC45413n) this.f115434c.getValue();
    }

    /* renamed from: c */
    private final AbstractC45399a.AbstractC45420u m181226c() {
        return (AbstractC45399a.AbstractC45420u) this.f115435d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingsModel$Companion;", "", "()V", "KEY_USER_AGREEMENT_UPDATE", "", "KEY_USER_PRIVACY_UPDATE", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.SettingsModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final SettingsViewModel mo160874a() {
        return this.f115436e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IObserverDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.SettingsModel$b */
    static final class C45715b extends Lambda implements Function0<AbstractC45399a.AbstractC45413n> {
        public static final C45715b INSTANCE = new C45715b();

        C45715b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45413n invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133462u();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IUpgradeDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.SettingsModel$c */
    static final class C45716c extends Lambda implements Function0<AbstractC45399a.AbstractC45420u> {
        public static final C45716c INSTANCE = new C45716c();

        C45716c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45420u invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133454m();
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        m181225b().mo133523a(this.f115433b);
        m181227f();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        m181225b().mo133525b(this.f115433b);
    }

    /* renamed from: f */
    private final void m181227f() {
        this.f115436e.getHasNewVersion().mo5926a(Boolean.valueOf(m181226c().mo133483a()));
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: u */
    public void mo123361u() {
        super.mo123361u();
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        if (!a.mo133445d().mo133469b("user_privacy_update_tip")) {
            AbstractC45399a a2 = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MineModule.getDependency()");
            if (!a2.mo133445d().mo133469b("user_agreement_update_tip")) {
                this.f115436e.isShowUpdateRedDot().mo5926a((Boolean) false);
                return;
            }
        }
        if (Intrinsics.areEqual((Object) this.f115436e.getHasNewVersion().mo5927b(), (Object) true)) {
            this.f115436e.isShowUpdateRedDot().mo5926a((Boolean) false);
        } else {
            this.f115436e.isShowUpdateRedDot().mo5926a((Boolean) true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/setting/SettingsModel$mUpgradeObserver$1", "Lcom/ss/android/lark/mine/impl/listener/observer/IUpgradeObserver;", "onNoticeLevelChange", "", "visible", "", "onNoticeNewVersion", "ignore", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.SettingsModel$d */
    public static final class C45717d implements AbstractC45432a {

        /* renamed from: a */
        final /* synthetic */ SettingsModel f115437a;

        @Override // com.ss.android.lark.mine.impl.p2273b.p2274a.AbstractC45432a
        /* renamed from: b */
        public void mo160318b(boolean z) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45717d(SettingsModel settingsModel) {
            this.f115437a = settingsModel;
        }

        @Override // com.ss.android.lark.mine.impl.p2273b.p2274a.AbstractC45432a
        /* renamed from: a */
        public void mo160317a(boolean z) {
            this.f115437a.mo160874a().getHasNewVersion().mo5926a(Boolean.valueOf(z));
        }
    }

    public SettingsModel(SettingsViewModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mViewModel");
        this.f115436e = aVar;
    }
}
