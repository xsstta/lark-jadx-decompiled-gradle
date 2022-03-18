package com.larksuite.component.universe_design.icon;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.component.universe_design.dimension.UDDimension;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\bH\u0007J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\f"}, d2 = {"Lcom/larksuite/component/universe_design/icon/UDIconUtils;", "", "()V", "getIconDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "drawableRes", "", "size", "Lcom/larksuite/component/universe_design/dimension/UDDimension;", "color", "universe-ui-icon_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDIconUtils {
    public static final UDIconUtils INSTANCE = new UDIconUtils();

    private UDIconUtils() {
    }

    @JvmStatic
    public static final Drawable getIconDrawable(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Drawable b = C0215a.m655b(context, i);
        if (b != null) {
            return b;
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i));
    }

    @JvmStatic
    public static final Drawable getIconDrawable(Context context, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Drawable iconDrawable = getIconDrawable(context, i);
        iconDrawable.mutate();
        iconDrawable.setTint(i2);
        return iconDrawable;
    }

    @JvmStatic
    public static final Drawable getIconDrawable(Context context, int i, UDDimension aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        Drawable iconDrawable = getIconDrawable(context, i);
        iconDrawable.mutate();
        int a = (int) aVar.mo90193a(context);
        iconDrawable.setBounds(0, 0, a, a);
        return iconDrawable;
    }

    @JvmStatic
    public static final Drawable getIconDrawable(Context context, int i, int i2, UDDimension aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        Drawable iconDrawable = getIconDrawable(context, i);
        iconDrawable.mutate();
        iconDrawable.setTint(i2);
        int a = (int) aVar.mo90193a(context);
        iconDrawable.setBounds(0, 0, a, a);
        return iconDrawable;
    }
}
