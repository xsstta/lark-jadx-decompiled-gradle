package com.ss.android.lark.mm.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/utils/ClipBoardUtil;", "", "()V", "copy", "", "context", "Landroid/content/Context;", "text", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.b */
public final class ClipBoardUtil {

    /* renamed from: a */
    public static final ClipBoardUtil f118606a = new ClipBoardUtil();

    private ClipBoardUtil() {
    }

    /* renamed from: a */
    public final void mo165481a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("", str));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
    }
}
