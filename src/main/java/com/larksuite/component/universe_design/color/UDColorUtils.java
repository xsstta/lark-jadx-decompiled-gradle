package com.larksuite.component.universe_design.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.C0517d;
import com.huawei.hms.location.LocationRequest;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0003J$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0007J\u001c\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0007J$\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0007J\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u001a\u001a\u00020\fH\u0007J\u001e\u0010\u001b\u001a\u00020\f2\n\u0010\u001c\u001a\u00060\u001dR\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\fH\u0007J\u001a\u0010 \u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\fH\u0007J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000bH\u0007J\u001a\u0010\"\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010$\u001a\u00020\fH\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Lcom/larksuite/component/universe_design/color/UDColorUtils;", "", "()V", "sTmpValue", "Landroid/util/TypedValue;", "getSTmpValue", "()Landroid/util/TypedValue;", "sTmpValue$delegate", "Lkotlin/Lazy;", "tokenIdCache", "Landroidx/collection/LruCache;", "", "", "getTokenIdCache", "()Landroidx/collection/LruCache;", "tokenIdCache$delegate", "convertToken", "token", "getAlphaColor", "context", "Landroid/content/Context;", "baseColorId", "alpha", "", "baseColor", "getAttrAlphaColor", "attrRes", "getAttrColor", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attr", "getColor", "getColorIdByToken", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorId", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDColorUtils {
    public static final UDColorUtils INSTANCE = new UDColorUtils();
    private static final Lazy sTmpValue$delegate = LazyKt.lazy(C25729a.INSTANCE);
    private static final Lazy tokenIdCache$delegate = LazyKt.lazy(C25730b.INSTANCE);

    private final TypedValue getSTmpValue() {
        return (TypedValue) sTmpValue$delegate.getValue();
    }

    private final C0517d<String, Integer> getTokenIdCache() {
        return (C0517d) tokenIdCache$delegate.getValue();
    }

    private UDColorUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/util/TypedValue;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.color.UDColorUtils$a */
    static final class C25729a extends Lambda implements Function0<TypedValue> {
        public static final C25729a INSTANCE = new C25729a();

        C25729a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TypedValue invoke() {
            return new TypedValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/collection/LruCache;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.color.UDColorUtils$b */
    static final class C25730b extends Lambda implements Function0<C0517d<String, Integer>> {
        public static final C25730b INSTANCE = new C25730b();

        C25730b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C0517d<String, Integer> invoke() {
            return new C0517d<>(LocationRequest.PRIORITY_HD_ACCURACY);
        }
    }

    @JvmStatic
    private static final String convertToken(String str) {
        return StringsKt.replace$default(str, "-", "_", false, 4, (Object) null);
    }

    @JvmStatic
    public static final int getColor(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return context.getResources().getColor(i);
    }

    @JvmStatic
    public static final int getAlphaColor(int i, float f) {
        return Color.argb((int) (((float) 255) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    @JvmStatic
    public static final int getAttrColor(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkExpressionValueIsNotNull(theme, "context.theme");
        return getAttrColor(theme, i);
    }

    @JvmStatic
    public static final int getAttrColor(Resources.Theme theme, int i) {
        Intrinsics.checkParameterIsNotNull(theme, "theme");
        UDColorUtils uDColorUtils = INSTANCE;
        if (!theme.resolveAttribute(i, uDColorUtils.getSTmpValue(), true)) {
            return 0;
        }
        if (uDColorUtils.getSTmpValue().type == 2) {
            return getAttrColor(theme, uDColorUtils.getSTmpValue().data);
        }
        return uDColorUtils.getSTmpValue().data;
    }

    @JvmStatic
    public static final int getColorIdByToken(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        UDColorUtils uDColorUtils = INSTANCE;
        Integer a = uDColorUtils.getTokenIdCache().mo2974a(str);
        if (a != null) {
            return a.intValue();
        }
        int identifier = context.getResources().getIdentifier(convertToken(str), "color", context.getPackageName());
        uDColorUtils.getTokenIdCache().mo2975a(str, Integer.valueOf(identifier));
        return identifier;
    }

    @JvmStatic
    public static final ColorStateList getColorStateList(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (Build.VERSION.SDK_INT >= 23) {
            ColorStateList colorStateList = context.getResources().getColorStateList(i, context.getTheme());
            Intrinsics.checkExpressionValueIsNotNull(colorStateList, "context.resources.getCol…t(colorId, context.theme)");
            return colorStateList;
        }
        ColorStateList colorStateList2 = context.getResources().getColorStateList(i);
        Intrinsics.checkExpressionValueIsNotNull(colorStateList2, "context.resources.getColorStateList(colorId)");
        return colorStateList2;
    }

    @JvmStatic
    public static final int getAttrAlphaColor(Context context, int i, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return getAlphaColor(getAttrColor(context, i), f);
    }

    @JvmStatic
    public static final int getAlphaColor(Context context, int i, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return getAlphaColor(context.getResources().getColor(i), f);
    }
}
