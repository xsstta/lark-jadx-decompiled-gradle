package com.ss.android.lark.guide.biz.onboarding.res;

import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ&\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/ResLogUtils;", "", "()V", "logE", "", "tag", "", "msg", "newId", "", "id", "error", "", "logI", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.p */
public final class ResLogUtils {

    /* renamed from: a */
    public static final ResLogUtils f99169a = new ResLogUtils();

    private ResLogUtils() {
    }

    /* renamed from: a */
    public final void mo141372a(String str, String str2, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        Intrinsics.checkParameterIsNotNull(th, "error");
        Log.m165383e(str, str2);
        Log.m165381d(str, th);
    }

    /* renamed from: a */
    public final void mo141368a(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        Log.m165389i(str, str2 + ", id=0x" + Integer.toHexString(i));
    }

    /* renamed from: a */
    public final void mo141369a(String str, String str2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        Log.m165389i(str, str2 + ", newId=0x" + Integer.toHexString(i) + ", id=0x" + Integer.toHexString(i2));
    }

    /* renamed from: a */
    public final void mo141371a(String str, String str2, int i, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        Intrinsics.checkParameterIsNotNull(th, "error");
        Log.m165383e(str, str2 + ", id=0x" + Integer.toHexString(i));
        Log.m165381d(str, th);
    }

    /* renamed from: a */
    public final void mo141370a(String str, String str2, int i, int i2, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        Intrinsics.checkParameterIsNotNull(th, "error");
        Log.m165383e(str, str2 + ", newId=0x" + Integer.toHexString(i) + ", id=0x" + Integer.toHexString(i2));
        Log.m165381d(str, th);
    }
}
