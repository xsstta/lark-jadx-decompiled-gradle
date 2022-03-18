package com.bytedance.ies.bullet.service.schema.param.helper;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "T", "bundle", "Landroid/os/Bundle;", "key", "", "invoke", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
public final class BundleParamHelperKt$registerBundleHandler$1 extends Lambda implements Function2<Bundle, String, T> {
    final /* synthetic */ Function2 $valueParser;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BundleParamHelperKt$registerBundleHandler$1(Function2 kVar) {
        super(2);
        this.$valueParser = kVar;
    }

    public final T invoke(Bundle bundle, String str) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (bundle.containsKey(str)) {
            return (T) this.$valueParser.invoke(bundle, str);
        }
        return null;
    }
}
