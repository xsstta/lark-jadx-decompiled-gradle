package com.bytedance.ee.android.file.picker.lib.utils;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/UIExecutor;", "", "()V", "sHandler", "Landroid/os/Handler;", "post", "", "callback", "Ljava/lang/Runnable;", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.k */
public final class UIExecutor {

    /* renamed from: a */
    public static final UIExecutor f12485a = new UIExecutor();

    /* renamed from: b */
    private static final Handler f12486b = new Handler(Looper.getMainLooper());

    private UIExecutor() {
    }

    /* renamed from: a */
    public final void mo16120a(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "callback");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            f12486b.post(runnable);
        }
    }
}
