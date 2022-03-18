package com.ss.android.lark.magic.settings;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.magic.C41707a;
import com.ss.android.lark.magic.apm.MagicApm;
import com.ss.android.lark.magic.p2152b.AbstractC41708a;
import com.ss.android.lark.utils.C57852m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0004J$\u0010\u000f\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u00100\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/magic/settings/UGMagicConfigHolder;", "", "()V", "TAG", "", "currentConfigString", "gson", "Lcom/google/gson/Gson;", "ugMagicConfig", "Lcom/ss/android/lark/magic/settings/UGMagicConfig;", "checkUpdate", "", "getUGMagicDisplayTimeout", "", "getUGMagicFeelgoodAppKey", "getUGMagicTeaFilterWhiteList", "", "", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.settings.a */
public final class UGMagicConfigHolder {

    /* renamed from: a */
    public static final UGMagicConfigHolder f105989a = new UGMagicConfigHolder();

    /* renamed from: b */
    private static UGMagicConfig f105990b;

    /* renamed from: c */
    private static String f105991c = "";

    /* renamed from: d */
    private static final Gson f105992d = new Gson();

    private UGMagicConfigHolder() {
    }

    /* renamed from: b */
    public final int mo150090b() {
        Integer displayTimeout;
        m165674d();
        UGMagicConfig uGMagicConfig = f105990b;
        if (uGMagicConfig == null || (displayTimeout = uGMagicConfig.getDisplayTimeout()) == null) {
            return 1000;
        }
        return displayTimeout.intValue();
    }

    /* renamed from: c */
    public final String mo150091c() {
        String feelgoodAppKey;
        m165674d();
        UGMagicConfig uGMagicConfig = f105990b;
        if (uGMagicConfig == null || (feelgoodAppKey = uGMagicConfig.getFeelgoodAppKey()) == null) {
            return "";
        }
        return feelgoodAppKey;
    }

    /* renamed from: a */
    public final Map<String, Map<String, List<String>>> mo150089a() {
        boolean z;
        m165674d();
        UGMagicConfig uGMagicConfig = f105990b;
        if (uGMagicConfig == null) {
            return MapsKt.emptyMap();
        }
        Map<String, Map<String, List<String>>> whiteListWithParams = uGMagicConfig.getWhiteListWithParams();
        if (whiteListWithParams == null || whiteListWithParams.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return MapsKt.emptyMap();
        }
        Map<String, Map<String, List<String>>> whiteListWithParams2 = uGMagicConfig.getWhiteListWithParams();
        if (whiteListWithParams2 == null) {
            Intrinsics.throwNpe();
        }
        return whiteListWithParams2;
    }

    /* renamed from: d */
    private final void m165674d() {
        boolean z;
        AbstractC41708a b = C41707a.m165544b();
        Intrinsics.checkExpressionValueIsNotNull(b, "MagicModule.getDependency()");
        String c = b.mo150000c();
        if (!TextUtils.equals(f105991c, c) || f105990b == null) {
            try {
                UGMagicConfig uGMagicConfig = (UGMagicConfig) f105992d.fromJson(c, UGMagicConfig.class);
                if (uGMagicConfig != null) {
                    f105990b = uGMagicConfig;
                    f105991c = c;
                }
                MagicApm aVar = MagicApm.f105928a;
                if (uGMagicConfig != null) {
                    z = true;
                } else {
                    z = false;
                }
                Intrinsics.checkExpressionValueIsNotNull(c, "ugMagicConfigOriginalString");
                aVar.mo149990a(z, c);
            } catch (Exception e) {
                AbstractC41708a b2 = C41707a.m165544b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "MagicModule.getDependency()");
                if (!C57852m.m224554a(b2.mo149998a())) {
                    Log.m165383e("UGMagicConfigHolder", "Failed to parse config: " + c);
                    MagicApm aVar2 = MagicApm.f105928a;
                    Intrinsics.checkExpressionValueIsNotNull(c, "ugMagicConfigOriginalString");
                    aVar2.mo149990a(false, c);
                    return;
                }
                throw e;
            }
        }
    }
}
