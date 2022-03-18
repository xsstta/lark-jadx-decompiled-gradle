package com.larksuite.framework.utils.file.direct;

import android.content.Context;
import android.os.Build;
import com.larksuite.framework.utils.file.FileAccessDependency;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001d\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/AppInternalPathUtils;", "", "()V", "TAG", "", "getCacheDir", "Ljava/io/File;", "params", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams;", "getCodeCacheDir", "getDataDir", "getDir", "getFileList", "", "(Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams;)[Ljava/lang/String;", "getFilesDir", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.utils.file.direct.c */
public final class AppInternalPathUtils {

    /* renamed from: a */
    public static final AppInternalPathUtils f64895a = new AppInternalPathUtils();

    private AppInternalPathUtils() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final File m95135c(DirectFileAccess.StorageParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Context e = aVar.mo93397e();
        if (e != null) {
            return e.getCacheDir();
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final File m95136d(DirectFileAccess.StorageParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Context e = aVar.mo93397e();
        if (e != null) {
            return e.getCodeCacheDir();
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final File m95137e(DirectFileAccess.StorageParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Context e = aVar.mo93397e();
        if (e != null) {
            return e.getFilesDir();
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final File m95134b(DirectFileAccess.StorageParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Context e = aVar.mo93397e();
        if (e == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return e.getDataDir();
        }
        return new File(e.getApplicationInfo().dataDir);
    }

    @JvmStatic
    /* renamed from: a */
    public static final File m95133a(DirectFileAccess.StorageParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        DirectFileAccess.PathType c = aVar.mo93395c();
        if (c != null) {
            int i = C26275d.f64896a[c.ordinal()];
            if (i == 1) {
                return m95134b(aVar);
            }
            if (i == 2) {
                return m95135c(aVar);
            }
            if (i == 3) {
                return m95136d(aVar);
            }
            if (i == 4) {
                return m95137e(aVar);
            }
        }
        FileAccessDependency.ILogger g = aVar.mo93400g();
        if (g != null) {
            g.mo93389a("AppInternalPathUtils", "invalid path type: " + aVar.mo93395c());
            g.mo93388a(new DirectFileAccess.InvalidPathTypeException("AppInternalPathUtils", aVar));
        }
        return null;
    }
}
