package com.bytedance.ee.bear.middleground.calendar.util;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/calendar/util/OfflineUtils;", "", "()V", "MIME_TYPE_IMAGE", "", "getMime", "url", "middleground-calendar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.bear.middleground.calendar.c.a */
public final class OfflineUtils {

    /* renamed from: a */
    public static final OfflineUtils f24072a = new OfflineUtils();

    private OfflineUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m37361a(String str) {
        Uri parse;
        String path;
        if (str == null || (parse = Uri.parse(str)) == null || (path = parse.getPath()) == null) {
            return "text/html";
        }
        Intrinsics.checkExpressionValueIsNotNull(path, "url?.let { Uri.parse(url) }?.path ?: return mime");
        if (StringsKt.endsWith$default(path, ".css", false, 2, (Object) null)) {
            return "text/css";
        }
        if (StringsKt.endsWith$default(path, ".js", false, 2, (Object) null)) {
            return "application/x-javascript";
        }
        if (StringsKt.endsWith$default(path, ".jpg", false, 2, (Object) null) || StringsKt.endsWith$default(path, ".gif", false, 2, (Object) null) || StringsKt.endsWith$default(path, ".png", false, 2, (Object) null) || StringsKt.endsWith$default(path, ".jpeg", false, 2, (Object) null) || StringsKt.endsWith$default(path, ".webp", false, 2, (Object) null) || StringsKt.endsWith$default(path, ".bmp", false, 2, (Object) null)) {
            return "image/*";
        }
        return "text/html";
    }
}
