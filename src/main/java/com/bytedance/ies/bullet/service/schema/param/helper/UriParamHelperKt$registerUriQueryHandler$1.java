package com.bytedance.ies.bullet.service.schema.param.helper;

import android.net.Uri;
import com.bytedance.ies.bullet.service.schema.p792a.C14424a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "T", "uri", "Landroid/net/Uri;", "key", "", "invoke", "(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
public final class UriParamHelperKt$registerUriQueryHandler$1 extends Lambda implements Function2<Uri, String, T> {
    final /* synthetic */ Function1 $valueParser;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriParamHelperKt$registerUriQueryHandler$1(Function1 function1) {
        super(2);
        this.$valueParser = function1;
    }

    public final T invoke(Uri uri, String str) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        Intrinsics.checkParameterIsNotNull(str, "key");
        String a = C14424a.m58176a(uri, str);
        if (a != null) {
            return (T) this.$valueParser.invoke(a);
        }
        return null;
    }
}
