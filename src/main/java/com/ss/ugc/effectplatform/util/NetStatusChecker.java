package com.ss.ugc.effectplatform.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0003¨\u0006\b"}, d2 = {"Lcom/ss/ugc/effectplatform/util/NetStatusChecker;", "", "()V", "isNetConnected", "", "context", "isNetworkConnected", "Landroid/content/Context;", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.o */
public final class NetStatusChecker {

    /* renamed from: a */
    public static final NetStatusChecker f165129a = new NetStatusChecker();

    private NetStatusChecker() {
    }

    /* renamed from: a */
    public final boolean mo228351a(Object obj) {
        if (obj == null || !(obj instanceof Context)) {
            return false;
        }
        return m257118a((Context) obj);
    }

    /* renamed from: a */
    private final boolean m257118a(Context context) {
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                if (connectivityManager == null) {
                    return false;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                Intrinsics.checkExpressionValueIsNotNull(activeNetworkInfo, "networkInfo");
                return activeNetworkInfo.isConnected();
            }
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }
}
