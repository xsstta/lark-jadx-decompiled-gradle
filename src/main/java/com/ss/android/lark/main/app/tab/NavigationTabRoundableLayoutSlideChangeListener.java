package com.ss.android.lark.main.app.tab;

import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.component.ui.p1153e.C25653b;
import com.ss.android.lark.main.app.tab.C44364l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavigationTabRoundableLayoutSlideChangeListener;", "Lcom/ss/android/lark/main/app/tab/NavigationTabBottomSheetCallback$AbstractOnSlideChangeListener;", "roundableLayout", "Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "(Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;)V", "calculateRadiusBySlideOffset", "", "slideOffset", "onCollapsed", "", "bottomSheet", "Landroid/view/View;", "onExpanded", "onSliding", "setRadiusByOffset", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.o */
public final class NavigationTabRoundableLayoutSlideChangeListener extends C44364l.AbstractC44365a {

    /* renamed from: a */
    public static final Companion f112578a = new Companion(null);

    /* renamed from: b */
    private final LKUIRoundableLayout f112579b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavigationTabRoundableLayoutSlideChangeListener$Companion;", "", "()V", "DEFAULT_CORNER_IN_DP", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.o$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NavigationTabRoundableLayoutSlideChangeListener(LKUIRoundableLayout lKUIRoundableLayout) {
        Intrinsics.checkParameterIsNotNull(lKUIRoundableLayout, "roundableLayout");
        this.f112579b = lKUIRoundableLayout;
    }

    /* renamed from: a */
    private final float m176060a(float f) {
        return C25653b.m91892a(this.f112579b.getContext(), ((float) 12) * f);
    }

    /* renamed from: b */
    private final void m176061b(float f) {
        float a = m176060a(f);
        this.f112579b.mo89663b(a, BitmapDescriptorFactory.HUE_RED, a, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
    /* renamed from: d */
    public void mo157362d(View view) {
        Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
        m176061b(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
    /* renamed from: a */
    public void mo157358a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
        m176061b(1.0f);
    }

    @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
    /* renamed from: a */
    public void mo157359a(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
        m176061b(f);
    }
}
