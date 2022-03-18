package com.bytedance.ee.larkwebview.p671d.p673b;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"setMultiple", "Landroid/content/Intent;", "multiple", "", "base_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.d.b.b */
public final class C13435b {
    /* renamed from: a */
    public static final Intent m54600a(Intent intent, boolean z) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$setMultiple");
        Intent putExtra = intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        Intrinsics.checkExpressionValueIsNotNull(putExtra, "putExtra(Intent.EXTRA_ALLOW_MULTIPLE, multiple)");
        return putExtra;
    }
}
