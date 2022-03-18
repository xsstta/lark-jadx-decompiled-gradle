package com.larksuite.component.universe_design.util;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/util/TypefaceHelper;", "", "()V", "fontCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroid/graphics/Typeface;", "get", "context", "Landroid/content/Context;", "path", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.util.e */
public final class TypefaceHelper {

    /* renamed from: a */
    public static final TypefaceHelper f63885a = new TypefaceHelper();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, Typeface> f63886b = new ConcurrentHashMap<>();

    private TypefaceHelper() {
    }

    /* renamed from: a */
    public final Typeface mo91838a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "path");
        if (Build.VERSION.SDK_INT >= 24) {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str);
            if (createFromAsset != null) {
                return createFromAsset;
            }
            Typeface typeface = Typeface.DEFAULT;
            Intrinsics.checkExpressionValueIsNotNull(typeface, "Typeface.DEFAULT");
            return typeface;
        }
        ConcurrentHashMap<String, Typeface> concurrentHashMap = f63886b;
        Typeface typeface2 = concurrentHashMap.get(str);
        if (typeface2 == null) {
            try {
                Typeface createFromAsset2 = Typeface.createFromAsset(context.getAssets(), str);
                if (createFromAsset2 != null) {
                    concurrentHashMap.put(str, createFromAsset2);
                    return createFromAsset2;
                }
            } catch (Exception unused) {
                Typeface typeface3 = Typeface.DEFAULT;
                Intrinsics.checkExpressionValueIsNotNull(typeface3, "Typeface.DEFAULT");
                return typeface3;
            }
        }
        if (typeface2 != null) {
            return typeface2;
        }
        Typeface typeface4 = Typeface.DEFAULT;
        Intrinsics.checkExpressionValueIsNotNull(typeface4, "Typeface.DEFAULT");
        return typeface4;
    }
}
