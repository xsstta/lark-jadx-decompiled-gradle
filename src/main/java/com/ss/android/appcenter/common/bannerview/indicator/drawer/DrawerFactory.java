package com.ss.android.appcenter.common.bannerview.indicator.drawer;

import com.ss.android.appcenter.common.bannerview.indicator.option.IndicatorOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/DrawerFactory;", "", "()V", "createDrawer", "Lcom/ss/android/appcenter/common/bannerview/indicator/drawer/IDrawer;", "indicatorOptions", "Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.bannerview.indicator.a.d */
public final class DrawerFactory {

    /* renamed from: a */
    public static final DrawerFactory f70509a = new DrawerFactory();

    private DrawerFactory() {
    }

    /* renamed from: a */
    public final IDrawer mo100219a(IndicatorOptions bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "indicatorOptions");
        int b = bVar.mo100229b();
        if (b == 2) {
            return new DashDrawer(bVar);
        }
        if (b != 4) {
            return new CircleDrawer(bVar);
        }
        return new RoundRectDrawer(bVar);
    }
}
