package com.by.inflate_lib.p100b;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001\u001a \u0010\u0015\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"ID_TYPE_COLOR", "", "ID_TYPE_DIMEN", "ID_TYPE_DRAWABLE", "ID_TYPE_ID", "ID_TYPE_STRING", "getBoolean", "", ShareHitPoint.f121869d, "Lcom/by/inflate_lib/data/ParamsType;", "getColor", "", "context", "Landroid/content/Context;", "getDimen", "", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getDrawableId", "replaceScheme", "key", "throwUnsupported", "name", "attr", "inflate-lib_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.by.inflate_lib.b.a */
public final class C2605a {
    /* renamed from: a */
    public static final String m10962a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, ":", 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf$default + 1);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
}
