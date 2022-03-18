package com.bytedance.sdk.bridge.lynx;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/sdk/bridge/lynx/LynxBridgeManager;", "", "()V", "currentActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getCurrentActivity", "registerCurrentActivity", "", "activity", "registerDelegateBridge", "Lcom/lynx/tasm/LynxViewBuilder;", "obj", "lynx-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.lynx.i */
public final class LynxBridgeManager {

    /* renamed from: a */
    public static final LynxBridgeManager f50529a = new LynxBridgeManager();

    /* renamed from: b */
    private static WeakReference<Activity> f50530b;

    private LynxBridgeManager() {
    }

    /* renamed from: a */
    public final Activity mo69749a() {
        WeakReference<Activity> weakReference = f50530b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
