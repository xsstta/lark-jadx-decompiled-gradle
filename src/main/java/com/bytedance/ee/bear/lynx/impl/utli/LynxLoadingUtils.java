package com.bytedance.ee.bear.lynx.impl.utli;

import android.content.Context;
import com.bytedance.ee.bear.lynx.impl.page.AbsLynxPageActivity;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/utli/LynxLoadingUtils;", "", "()V", "hideLoading", "", "context", "Landroid/content/Context;", "showLoading", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.c.b */
public final class LynxLoadingUtils {

    /* renamed from: a */
    public static final LynxLoadingUtils f23768a = new LynxLoadingUtils();

    private LynxLoadingUtils() {
    }

    /* renamed from: a */
    public final boolean mo33917a(Context context) {
        if (!(context instanceof AbsLynxPageActivity)) {
            return false;
        }
        ((AbsLynxPageActivity) context).mo33953a();
        return true;
    }

    /* renamed from: b */
    public final boolean mo33918b(Context context) {
        if (!(context instanceof AbsLynxPageActivity)) {
            return false;
        }
        ((AbsLynxPageActivity) context).mo33955b();
        return true;
    }
}
