package com.bytedance.ies.bullet.service.schema.param.core;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "T", "builder", "key", "", "value", "invoke", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)Landroid/os/Bundle;", "com/bytedance/ies/bullet/service/schema/param/helper/BundleParamHelperKt$registerBundleHandler$2"}, mo238835k = 3, mv = {1, 1, 16})
public final class UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$8 extends Lambda implements Function3<Bundle, String, StatusFontMode, Bundle> {
    public UIParamTypes$registerBundleHandlers$$inlined$registerBundleHandler$8() {
        super(3);
    }

    public final Bundle invoke(Bundle bundle, String str, StatusFontMode statusFontMode) {
        Intrinsics.checkParameterIsNotNull(bundle, "builder");
        Intrinsics.checkParameterIsNotNull(str, "key");
        bundle.putString(str, statusFontMode.getVALUE());
        return bundle;
    }
}
