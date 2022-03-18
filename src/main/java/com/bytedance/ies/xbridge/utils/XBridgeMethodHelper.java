package com.bytedance.ies.xbridge.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/xbridge/utils/XBridgeMethodHelper;", "", "()V", "getActContext", "Landroid/content/Context;", "context", "getActivity", "Landroid/app/Activity;", C60375c.f150914a, "cf", "Ljava/lang/ref/WeakReference;", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.h.a */
public final class XBridgeMethodHelper {

    /* renamed from: a */
    public static final XBridgeMethodHelper f38086a = new XBridgeMethodHelper();

    private XBridgeMethodHelper() {
    }

    /* renamed from: a */
    public final Activity mo53178a(Context context) {
        while (true) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        Log.w("ViewUtils", "find non-ContextWrapper in view: " + context);
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    return (Activity) context;
                }
            } else {
                break;
            }
        }
        return null;
    }
}
