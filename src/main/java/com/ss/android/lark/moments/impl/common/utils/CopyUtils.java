package com.ss.android.lark.moments.impl.common.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57814c;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/CopyUtils;", "", "()V", "doCopyText", "", "context", "Landroid/content/Context;", "copyText", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.a */
public final class CopyUtils {

    /* renamed from: a */
    public static final CopyUtils f119249a = new CopyUtils();

    private CopyUtils() {
    }

    /* renamed from: a */
    public final boolean mo166199a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "copyText");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            try {
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("", C57814c.m224352c(str)));
                return true;
            } catch (Exception e) {
                Log.m165387e("Copy failed", (Throwable) e, true);
                return false;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
    }
}
