package com.larksuite.framework.utils.file.direct;

import android.content.Context;
import android.os.Environment;
import com.larksuite.framework.utils.file.FileAccessDependency;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/larksuite/framework/utils/file/direct/AppExternalPathUtils;", "", "()V", "TAG", "", "getCacheDir", "Ljava/io/File;", "params", "Lcom/larksuite/framework/utils/file/direct/DirectFileAccess$StorageParams;", "getCacheDirs", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)[Ljava/io/File;", "getDir", "getFilesDir", "getRootDir", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.utils.file.direct.a */
public final class AppExternalPathUtils {

    /* renamed from: a */
    public static final AppExternalPathUtils f64893a = new AppExternalPathUtils();

    private AppExternalPathUtils() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final File m95130b(DirectFileAccess.StorageParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Context e = aVar.mo93397e();
        if (e != null) {
            return e.getExternalCacheDir();
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final File m95132d(DirectFileAccess.StorageParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Context e = aVar.mo93397e();
        if (e != null) {
            return e.getExternalFilesDir(aVar.mo93396d());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final File m95129a(DirectFileAccess.StorageParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        DirectFileAccess.PathType c = aVar.mo93395c();
        if (c != null) {
            int i = C26274b.f64894a[c.ordinal()];
            if (i == 1) {
                return m95130b(aVar);
            }
            if (i == 2) {
                return m95132d(aVar);
            }
            if (i == 3) {
                return m95131c(aVar);
            }
        }
        FileAccessDependency.ILogger g = aVar.mo93400g();
        if (g != null) {
            g.mo93389a("AppExternalPathUtils", "invalid path type " + aVar.mo93395c());
            g.mo93388a(new DirectFileAccess.InvalidPathTypeException("AppExternalPathUtils", aVar));
        }
        return null;
    }

    @Deprecated(message = "migrate to files dir", replaceWith = @ReplaceWith(expression = "getFilesDir(context, type)", imports = {}))
    @JvmStatic
    /* renamed from: c */
    public static final File m95131c(DirectFileAccess.StorageParams aVar) {
        File file;
        String str;
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        File b = m95130b(aVar);
        if (b != null) {
            file = b.getParentFile();
        } else {
            file = null;
        }
        if (file != null) {
            return file;
        }
        Context e = aVar.mo93397e();
        if (e != null) {
            str = e.getPackageName();
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return new File(Environment.getExternalStorageDirectory() + "/Android/data/" + aVar.mo93397e().getPackageName());
    }
}
