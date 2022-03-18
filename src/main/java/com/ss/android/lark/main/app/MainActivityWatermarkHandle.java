package com.ss.android.lark.main.app;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/main/app/MainActivityWatermarkHandle;", "", "mainActivity", "Lcom/ss/android/lark/main/app/MainActivity;", "(Lcom/ss/android/lark/main/app/MainActivity;)V", "internalFragment", "Lcom/ss/android/lark/main/app/MainActivityWatermarkHandle$InternalFragment;", "watermarkDependency", "Lcom/ss/android/lark/main/dependency/IMainModuleDependency$IWatermarkDependency;", "kotlin.jvm.PlatformType", "getWatermarkDependency", "()Lcom/ss/android/lark/main/dependency/IMainModuleDependency$IWatermarkDependency;", "detachWatermark", "", "refreshWatermark", "Companion", "InternalFragment", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.d */
public final class MainActivityWatermarkHandle {

    /* renamed from: b */
    public static final Companion f112131b = new Companion(null);

    /* renamed from: a */
    public final MainActivity f112132a;

    /* renamed from: c */
    private InternalFragment f112133c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/main/app/MainActivityWatermarkHandle$InternalFragment;", "Landroidx/fragment/app/Fragment;", "()V", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.d$b */
    public static final class InternalFragment extends Fragment {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/main/app/MainActivityWatermarkHandle$Companion;", "", "()V", "TAG", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.d$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC44136a.AbstractC44140ab mo157179a() {
        AbstractC44136a aVar = this.f112132a.f112091b;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "mainActivity.mMainModuleDependency");
        return aVar.mo133252h();
    }

    /* renamed from: c */
    public final void mo157181c() {
        InternalFragment bVar = this.f112133c;
        if (bVar != null) {
            this.f112132a.getSupportFragmentManager().beginTransaction().remove(bVar).commitAllowingStateLoss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onInitReady", "com/ss/android/lark/main/app/MainActivityWatermarkHandle$refreshWatermark$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.d$c */
    static final class C44191c implements AbstractC44136a.AbstractC44140ab.AbstractC44141a {

        /* renamed from: a */
        final /* synthetic */ InternalFragment f112134a;

        /* renamed from: b */
        final /* synthetic */ MainActivityWatermarkHandle f112135b;

        C44191c(InternalFragment bVar, MainActivityWatermarkHandle dVar) {
            this.f112134a = bVar;
            this.f112135b = dVar;
        }

        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44140ab.AbstractC44141a
        /* renamed from: a */
        public final void mo157126a() {
            if (C57582a.m223607a((Activity) this.f112135b.f112132a)) {
                this.f112135b.mo157179a().mo133334a(this.f112135b.f112132a);
                AbstractC44136a.AbstractC44140ab a = this.f112135b.mo157179a();
                Intrinsics.checkExpressionValueIsNotNull(a, "watermarkDependency");
                if (a.mo133338b()) {
                    this.f112135b.mo157179a().mo133335a(this.f112135b.f112132a, this.f112134a);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo157180b() {
        InternalFragment bVar = this.f112133c;
        if (bVar != null) {
            this.f112132a.getSupportFragmentManager().beginTransaction().remove(bVar).commitAllowingStateLoss();
            this.f112133c = null;
        }
        InternalFragment bVar2 = new InternalFragment();
        this.f112133c = bVar2;
        if (bVar2 != null) {
            this.f112132a.getSupportFragmentManager().beginTransaction().add(bVar2, "MainActivityWatermarkHandle").commitAllowingStateLoss();
            mo157179a().mo133336a(new C44191c(bVar2, this));
        }
    }

    public MainActivityWatermarkHandle(MainActivity mainActivity) {
        Intrinsics.checkParameterIsNotNull(mainActivity, "mainActivity");
        this.f112132a = mainActivity;
    }
}
