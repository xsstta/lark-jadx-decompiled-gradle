package com.ss.ugc.effectplatform.util;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/ss/ugc/effectplatform/util/UriUtil;", "", "()V", "parse", "", "filePath", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.v */
public final class UriUtil {

    /* renamed from: a */
    public static final UriUtil f165136a = new UriUtil();

    private UriUtil() {
    }

    /* renamed from: a */
    public final String mo228359a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "filePath");
        String uri = Uri.parse(str).toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(filePath).toString()");
        return uri;
    }
}
