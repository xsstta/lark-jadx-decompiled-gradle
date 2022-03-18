package com.larksuite.component.universe_design.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006R&\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/larksuite/component/universe_design/util/TintDrawablePool;", "", "()V", "drawablePool", "", "Lkotlin/Pair;", "", "Landroid/graphics/drawable/Drawable;", "getTintDrawable", "context", "Landroid/content/Context;", "drawableRes", "tintColor", "universe-ui-checkbox_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.util.d */
public final class TintDrawablePool {

    /* renamed from: a */
    private final Map<Pair<Integer, Integer>, Drawable> f63884a = new HashMap();

    /* renamed from: a */
    public final Drawable mo91837a(Context context, int i, int i2) {
        Drawable drawable;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        Drawable drawable2 = this.f63884a.get(pair);
        if (drawable2 == null) {
            if (i2 == 0) {
                drawable = UDIconUtils.getIconDrawable(context, i);
            } else {
                drawable = UDIconUtils.getIconDrawable(context, i, i2);
            }
            drawable2 = drawable;
        }
        this.f63884a.put(pair, drawable2);
        return drawable2;
    }
}
