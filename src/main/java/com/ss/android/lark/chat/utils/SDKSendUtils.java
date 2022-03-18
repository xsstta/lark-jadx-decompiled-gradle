package com.ss.android.lark.chat.utils;

import android.app.Application;
import com.bytedance.lark.sdk.C19847o;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.LarkContext;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/utils/SDKSendUtils;", "", "()V", "TAG", "", "assertNotOnMainThread", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.utils.u */
public final class SDKSendUtils {

    /* renamed from: a */
    public static final SDKSendUtils f88703a = new SDKSendUtils();

    private SDKSendUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m133260a() {
        Application application = LarkContext.getApplication();
        if (C57852m.m224554a(application) && C19847o.m72384a()) {
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            StackTraceElement[] stackTrace = currentThread.getStackTrace();
            Intrinsics.checkExpressionValueIsNotNull(stackTrace, "Thread.currentThread().stackTrace");
            Object[] copyOf = Arrays.copyOf(stackTrace, stackTrace.length);
            Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
            StringBuilder sb = new StringBuilder();
            sb.append("Find sync method call in main thread\n ");
            StackTraceElement stackTraceElement = ((StackTraceElement[]) copyOf)[3];
            Intrinsics.checkExpressionValueIsNotNull(stackTraceElement, "stackTrace[3]");
            sb.append(stackTraceElement.getMethodName());
            sb.append(" \n  See more detail in Log...");
            LKUIToast.show(application, sb.toString());
            Log.m165399w("SDKSendUtils", new Exception());
        }
    }
}
