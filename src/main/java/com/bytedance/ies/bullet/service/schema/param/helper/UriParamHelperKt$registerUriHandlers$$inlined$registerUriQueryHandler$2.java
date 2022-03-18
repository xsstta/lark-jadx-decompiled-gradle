package com.bytedance.ies.bullet.service.schema.param.helper;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "Landroid/net/Uri$Builder;", "T", "builder", "key", "", "value", "invoke", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/Object;)Landroid/net/Uri$Builder;", "com/bytedance/ies/bullet/service/schema/param/helper/UriParamHelperKt$registerUriQueryHandler$2"}, mo238835k = 3, mv = {1, 1, 16})
public final class UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$2 extends Lambda implements Function3<Uri.Builder, String, Boolean, Uri.Builder> {
    public UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$2() {
        super(3);
    }

    public final Uri.Builder invoke(Uri.Builder builder, String str, Boolean bool) {
        String str2;
        Intrinsics.checkParameterIsNotNull(builder, "builder");
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (bool.booleanValue()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        builder.appendQueryParameter(str, str2);
        return builder;
    }
}
