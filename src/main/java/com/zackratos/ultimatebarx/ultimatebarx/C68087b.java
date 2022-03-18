package com.zackratos.ultimatebarx.ultimatebarx;

import android.os.Build;
import com.zackratos.ultimatebarx.ultimatebarx.p3442c.C68099b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\t\u001a\u00020\u0007*\u00020\b\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\n"}, d2 = {"navigationBarHeight", "", "getNavigationBarHeight", "()I", "statusBarHeight", "getStatusBarHeight", "addNavigationBarBottomPadding", "", "Landroid/view/View;", "addStatusBarTopPadding", "ultimatebarx_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.b */
public final class C68087b {
    /* renamed from: a */
    public static final int m264633a() {
        return C68099b.m264686a(UltimateBarXManager.f171319b.mo236993a().mo236980b());
    }

    /* renamed from: b */
    public static final int m264634b() {
        if (Build.VERSION.SDK_INT >= 17 && UltimateBarXManager.f171319b.mo236993a().mo236975a().mo237009a(UltimateBarXManager.f171319b.mo236993a().mo236980b())) {
            return C68099b.m264689b(UltimateBarXManager.f171319b.mo236993a().mo236980b());
        }
        return 0;
    }
}
