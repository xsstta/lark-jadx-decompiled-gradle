package com.bytedance.ee.bear.lynx.impl.utli;

import android.content.Context;
import android.util.Log;
import com.bytedance.ee.bear.lynx.api.CCMLynxPageRouter;
import com.bytedance.ee.bear.lynx.impl.route.RouterAbilityProvider;
import com.bytedance.ee.bear.lynx.impl.route.TemplateUrlUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0006J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fJ&\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/utli/RoutePageUtils;", "", "()V", "TAG", "", "closePageWith", "", "context", "Landroid/content/Context;", "containerId", "animation", "openPageWithPath", "", "path", "params", "", "openPageWithUrl", "url", "replace", "useSysBrowser", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.c.g */
public final class RoutePageUtils {

    /* renamed from: a */
    public static final RoutePageUtils f23776a = new RoutePageUtils();

    /* renamed from: a */
    public final void mo33926a(String str, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(str, "path");
    }

    private RoutePageUtils() {
    }

    /* renamed from: a */
    public final boolean mo33927a(Context context, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!(context instanceof RouterAbilityProvider)) {
            return false;
        }
        ((RouterAbilityProvider) context).mo33906c();
        return true;
    }

    /* renamed from: a */
    public final boolean mo33928a(Context context, String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "url");
        if (TemplateUrlUtils.f23758a.mo33909a(str)) {
            ((CCMLynxPageRouter) KoinJavaComponent.m268613a(CCMLynxPageRouter.class, null, null, 6, null)).mo33879a(context, str, null);
        } else if (z2) {
            Log.w("RoutePageUtils", "use system browser url not implement");
        } else {
            Log.w("RoutePageUtils", "native applink url not implement");
        }
        if (!z || !(context instanceof RouterAbilityProvider)) {
            return false;
        }
        ((RouterAbilityProvider) context).mo33906c();
        return true;
    }
}
