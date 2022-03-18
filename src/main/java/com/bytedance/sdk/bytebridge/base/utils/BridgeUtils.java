package com.bytedance.sdk.bytebridge.base.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.bytebridge.base.context.GlobalBridgeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/utils/BridgeUtils;", "", "()V", "globalBridgeView", "Lcom/bytedance/sdk/bytebridge/base/context/GlobalBridgeView;", "getGlobalBridgeView", "()Lcom/bytedance/sdk/bytebridge/base/context/GlobalBridgeView;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "getBridgeNameWithoutNamespace", "", "bridgeName", "isEmpty", "", "s", "isHttpUrl", "url", "isMainThread", "parseUriHost", "uriString", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.e.a */
public final class BridgeUtils {

    /* renamed from: a */
    public static final BridgeUtils f50598a = new BridgeUtils();

    /* renamed from: b */
    private static final GlobalBridgeView f50599b = new GlobalBridgeView();

    /* renamed from: c */
    private static final Handler f50600c = new Handler(Looper.getMainLooper());

    private BridgeUtils() {
    }

    /* renamed from: a */
    public final GlobalBridgeView mo69817a() {
        return f50599b;
    }

    /* renamed from: b */
    public final Handler mo69819b() {
        return f50600c;
    }

    /* renamed from: c */
    public final boolean mo69820c() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
            if (Intrinsics.areEqual(mainLooper.getThread(), Thread.currentThread())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String mo69818a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        List<String> split = new Regex("\\.").split(str, 0);
        return split.get(split.size() - 1);
    }
}
