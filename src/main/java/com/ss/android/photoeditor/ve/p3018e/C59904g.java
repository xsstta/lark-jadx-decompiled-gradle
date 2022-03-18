package com.ss.android.photoeditor.ve.p3018e;

import android.graphics.BitmapFactory;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"HTTPS_URL", "", "HTTP_URL", "LOG_TAG", "decodeImageFileSize", "", "path", "isUrl", "", "uri", "photoeditor_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.e.g */
public final class C59904g {
    /* renamed from: a */
    public static final boolean m232487a(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else if (str != null) {
            str2 = str.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        if (str2 == null) {
            return false;
        }
        if (StringsKt.startsWith$default(str2, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(str2, "https://", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final int[] m232488b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        int[] iArr = {0, 0};
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(str, options);
            iArr[0] = options.outWidth;
            iArr[1] = options.outHeight;
        } catch (Exception e) {
            Log.m165389i("ImageUtils", "decodeImageFileSize exception :" + e.getMessage());
        }
        return iArr;
    }
}
