package com.bytedance.ies.bullet.service.schema.p792a;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\u001a\u0014\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001*\u00020\u0003\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002\u001a\u0018\u0010\b\u001a\u00020\u0003*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n¨\u0006\u000b"}, d2 = {"getQueryParameterNamesSafely", "", "", "Landroid/net/Uri;", "getQueryParameterSafely", "key", "removeQueryParameterSafely", "queryParameterName", "removeQueryParametersSafely", "queryParameterNames", "", "x-schema_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.schema.a.a */
public final class C14424a {
    /* renamed from: a */
    public static final String m58176a(Uri uri, String str) {
        Intrinsics.checkParameterIsNotNull(uri, "$this$getQueryParameterSafely");
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (!uri.isHierarchical()) {
            uri = null;
        }
        if (uri != null) {
            return uri.getQueryParameter(str);
        }
        return null;
    }
}
