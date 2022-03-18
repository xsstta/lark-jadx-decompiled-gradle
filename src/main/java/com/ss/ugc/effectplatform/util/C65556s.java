package com.ss.ugc.effectplatform.util;

import bytekn.foundation.io.file.FileManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"joinFileSeperator", "", "joinUrlSeparator", "effectplatform_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.s */
public final class C65556s {
    /* renamed from: a */
    public static final String m257124a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$this$joinFileSeperator");
        if (StringsKt.endsWith$default(str, FileManager.f5817a.mo8712a(), false, 2, (Object) null)) {
            return str;
        }
        return str + FileManager.f5817a.mo8712a();
    }
}
