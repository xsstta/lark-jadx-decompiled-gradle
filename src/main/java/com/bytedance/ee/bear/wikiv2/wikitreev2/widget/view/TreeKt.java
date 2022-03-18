package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import com.bytedance.ee.bear.wikiv2.icon.WikiIcon;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007H\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/TreeKt;", "", "()V", "getItemIcon", "", "objType", "isFocus", "", "isShortcut", "title", "", "getNoneTitle", "mountFavorite", "getRootIcon", "Lkotlin/Pair;", "getRootTitle", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.b */
public final class TreeKt {

    /* renamed from: a */
    public static final TreeKt f33641a = new TreeKt();

    private TreeKt() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m52180a(boolean z) {
        if (z) {
            String string = C13615c.f35773a.getString(R.string.CreationMobile_Wiki_Permission_NoContent_Placeholder);
            Intrinsics.checkExpressionValueIsNotNull(string, "ContextUtils.baseApplica…on_NoContent_Placeholder)");
            return string;
        }
        String string2 = C13615c.f35773a.getString(R.string.CreationMobile_Wiki_NoSubpages_Placeholder);
        Intrinsics.checkExpressionValueIsNotNull(string2, "ContextUtils.baseApplica…i_NoSubpages_Placeholder)");
        return string2;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m52182b(boolean z) {
        if (z) {
            String string = C13615c.f35773a.getString(R.string.CreationMobile_Wiki_Favorites_Favorites_Tab);
            Intrinsics.checkExpressionValueIsNotNull(string, "ContextUtils.baseApplica…_Favorites_Favorites_Tab)");
            return string;
        }
        String string2 = C13615c.f35773a.getString(R.string.CreationMobile_Wiki_Permission_PagTree_Tab);
        Intrinsics.checkExpressionValueIsNotNull(string2, "ContextUtils.baseApplica…i_Permission_PagTree_Tab)");
        return string2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Pair<Integer, Integer> m52181a(boolean z, boolean z2) {
        int i = R.color.icon_n1;
        if (z) {
            return new Pair<>(Integer.valueOf((int) R.drawable.ud_icon_collect_filled), Integer.valueOf((int) R.color.icon_n1));
        }
        if (z2) {
            i = R.color.ud_C500;
        }
        return new Pair<>(Integer.valueOf((int) R.drawable.ud_icon_wikitreelistblod_outlined), Integer.valueOf(i));
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m52179a(int i, boolean z, boolean z2, String str) {
        return WikiIcon.f32817b.mo46647a().mo46646a(i, z, z2, C13672c.m55481b(str));
    }
}
