package com.bytedance.ies.bullet.service.schema.param.helper;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "T", "bundle", "Landroid/os/Bundle;", "key", "", "invoke", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "com/bytedance/ies/bullet/service/schema/param/helper/BundleParamHelperKt$registerBundleHandler$1"}, mo238835k = 3, mv = {1, 1, 16})
public final class BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$9 extends Lambda implements Function2<Bundle, String, Double> {
    public BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$9() {
        super(2);
    }

    public final Double invoke(Bundle bundle, String str) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (bundle.containsKey(str)) {
            return Double.valueOf(bundle.getDouble(str));
        }
        return null;
    }
}
