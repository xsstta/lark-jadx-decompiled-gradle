package com.ss.android.lark.mm.utils;

import android.net.Uri;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/utils/UrlUtil;", "", "()V", "encode", "", "path", "parseHost", "url", "parseObjectToken", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.v */
public final class UrlUtil {

    /* renamed from: a */
    public static final UrlUtil f118671a = new UrlUtil();

    private UrlUtil() {
    }

    /* renamed from: c */
    public final String mo165519c(String str) {
        try {
            return URLEncoder.encode(str, "UTF8");
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: b */
    public final String mo165518b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Uri parse = Uri.parse(str);
        if (parse != null) {
            String str2 = "https://" + parse.getHost();
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    /* renamed from: a */
    public final String mo165517a(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "url");
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(url)");
        String path = parse.getPath();
        if (path == null) {
            return "";
        }
        Intrinsics.checkExpressionValueIsNotNull(path, "it");
        if (StringsKt.endsWith$default(path, "/", false, 2, (Object) null)) {
            path = path.substring(0, path.length() - 1);
            Intrinsics.checkExpressionValueIsNotNull(path, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        String str3 = path;
        if (StringsKt.lastIndexOf$default((CharSequence) str3, "/", 0, false, 6, (Object) null) < 0 || StringsKt.endsWith$default(path, "/", false, 2, (Object) null)) {
            str2 = "";
        } else {
            int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str3, "/", 0, false, 6, (Object) null) + 1;
            if (path != null) {
                str2 = path.substring(lastIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        if (str2 != null) {
            return str2;
        }
        return "";
    }
}
