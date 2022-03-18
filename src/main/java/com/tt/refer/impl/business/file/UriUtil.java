package com.tt.refer.impl.business.file;

import android.net.Uri;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u0010\u001a\u00020\u0011*\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tt/refer/impl/business/file/UriUtil;", "", "()V", "FILE_SCHEME", "", "HTTPS_SCHEME", "HTTP_SCHEME", "TAG", "TTFILE_SCHEME", "createFileUri", "Landroid/net/Uri;", "file", "Ljava/io/File;", "path", "createUri", "rawUri", "isScheme", "", "scheme", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.l */
public final class UriUtil {

    /* renamed from: a */
    public static final UriUtil f171131a = new UriUtil();

    private UriUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Uri m264452a(File file) {
        if (file != null) {
            return Uri.parse("file://" + file.getAbsolutePath());
        }
        AppBrandLogger.m52830i("URIUtil", "file:" + file);
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final Uri m264455b(String str) {
        if (str != null) {
            return m264452a(new File(str));
        }
        AppBrandLogger.m52830i("URIUtil", "path:" + str);
        return null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Uri m264453a(String str) {
        if (str != null) {
            return Uri.parse(str);
        }
        AppBrandLogger.m52830i("URIUtil", "rawUri:" + str);
        return null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m264454a(Uri uri, String str) {
        String str2;
        if (uri != null) {
            str2 = uri.getScheme();
        } else {
            str2 = null;
        }
        return Intrinsics.areEqual(str2, str);
    }
}
