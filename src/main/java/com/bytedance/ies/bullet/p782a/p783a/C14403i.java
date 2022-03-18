package com.bytedance.ies.bullet.p782a.p783a;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u001a\u001c\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u001a\u001c\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u001a\u001c\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u001a\u0016\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"AUTHORITY_ABSOLUTE", "", "AUTHORITY_RELATIVE", "SCHEME_ASSETS", "SCHEME_FILE", "SCHEME_HTTP", "SCHEME_HTTPS", "SCHEME_LYNX_VIEW", "makeAbsoluteUri", "Landroid/net/Uri;", "path", "sourceUri", "makeAssetAbsoluteUri", "makeAssetRelativeUri", "makeRelativeUri", "appendExtraPart", "Landroid/net/Uri$Builder;", "x-resourceloader_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.i */
public final class C14403i {
    /* renamed from: a */
    public static final Uri.Builder m57932a(Uri.Builder builder, Uri uri) {
        Intrinsics.checkParameterIsNotNull(builder, "$this$appendExtraPart");
        if (uri != null) {
            builder.encodedQuery(uri.getEncodedQuery());
        }
        return builder;
    }

    /* renamed from: a */
    public static final Uri m57933a(String str, Uri uri) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Uri.Builder path = new Uri.Builder().scheme("local_file").authority("relative").path(str);
        Intrinsics.checkExpressionValueIsNotNull(path, "Uri.Builder()\n    .schem…RITY_RELATIVE).path(path)");
        Uri build = m57932a(path, uri).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "Uri.Builder()\n    .schem…raPart(sourceUri).build()");
        return build;
    }

    /* renamed from: b */
    public static final Uri m57935b(String str, Uri uri) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Uri.Builder path = new Uri.Builder().scheme("assets").authority("relative").path(str);
        Intrinsics.checkExpressionValueIsNotNull(path, "Uri.Builder()\n    .schem…RITY_RELATIVE).path(path)");
        Uri build = m57932a(path, uri).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "Uri.Builder()\n    .schem…raPart(sourceUri).build()");
        return build;
    }

    /* renamed from: c */
    public static final Uri m57937c(String str, Uri uri) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Uri.Builder path = new Uri.Builder().scheme("assets").authority("absolute").path(str);
        Intrinsics.checkExpressionValueIsNotNull(path, "Uri.Builder()\n    .schem…RITY_ABSOLUTE).path(path)");
        Uri build = m57932a(path, uri).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "Uri.Builder()\n    .schem…raPart(sourceUri).build()");
        return build;
    }

    /* renamed from: a */
    public static /* synthetic */ Uri m57934a(String str, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            uri = null;
        }
        return m57933a(str, uri);
    }

    /* renamed from: b */
    public static /* synthetic */ Uri m57936b(String str, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            uri = null;
        }
        return m57935b(str, uri);
    }

    /* renamed from: c */
    public static /* synthetic */ Uri m57938c(String str, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            uri = null;
        }
        return m57937c(str, uri);
    }
}
