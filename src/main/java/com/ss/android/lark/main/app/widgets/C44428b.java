package com.ss.android.lark.main.app.widgets;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.ss.android.lark.main.p2235b.C44498d;
import com.ss.android.lark.maincore.AbstractC44546c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"showGuideIfNeed", "", "showGuide", "Lkotlin/Function0;", "guideShowHelper", "Lcom/ss/android/lark/maincore/IGuideShowHelper;", "core_main_main_productionUsRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.widgets.b */
public final class C44428b {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.widgets.b$a */
    public static final class C44429a extends Lambda implements Function0<Unit> {
        final /* synthetic */ AbstractC44546c $guideShowHelper;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44429a(AbstractC44546c cVar) {
            super(0);
            this.$guideShowHelper = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$guideShowHelper.mo137997a();
        }
    }

    /* renamed from: a */
    public static final void m176318a(AbstractC44546c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "guideShowHelper");
        m176319a(new C44429a(cVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/main/app/widgets/DrawerGuideUtilsKt$showGuideIfNeed$2", "Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;", "onDrawerClosed", "", "drawerView", "Landroid/view/View;", "onDrawerOpened", "onDrawerSlide", "slideOffset", "", "onDrawerStateChanged", "newState", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.widgets.b$b */
    public static final class C44430b implements DrawerLayout.AbstractC0974c {

        /* renamed from: a */
        final /* synthetic */ Function0 f112746a;

        /* renamed from: b */
        final /* synthetic */ View f112747b;

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: a */
        public void mo719a(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: a */
        public void mo720a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "drawerView");
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: a */
        public void mo721a(View view, float f) {
            Intrinsics.checkParameterIsNotNull(view, "drawerView");
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
        /* renamed from: b */
        public void mo723b(View view) {
            Intrinsics.checkParameterIsNotNull(view, "drawerView");
            this.f112746a.invoke();
            ((MainViewContainer) this.f112747b).mo4929b(this);
        }

        C44430b(Function0 function0, View view) {
            this.f112746a = function0;
            this.f112747b = view;
        }
    }

    /* renamed from: a */
    public static final void m176319a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "showGuide");
        View a = C44498d.m176512a("main_view_container");
        if (a instanceof MainViewContainer) {
            MainViewContainer mainViewContainer = (MainViewContainer) a;
            if (!mainViewContainer.mo157769g()) {
                function0.invoke();
            } else {
                mainViewContainer.mo4918a(new C44430b(function0, a));
            }
        } else {
            function0.invoke();
        }
    }
}
