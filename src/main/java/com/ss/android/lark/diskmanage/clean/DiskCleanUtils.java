package com.ss.android.lark.diskmanage.clean;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26279i;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000fJ&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u000fJ&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u000fJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0006J(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010$\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u0006J\u0010\u0010&\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\"\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010)\u001a\u00020\u001bJ\u000e\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010.\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/diskmanage/clean/DiskCleanUtils;", "", "()V", "MS_PER_DAY", "", "TAG", "", "method", "Ljava/lang/reflect/Method;", "os", "cleanAppCache", "", "context", "Landroid/content/Context;", "cleanDatabases", "", "cleanExternalCache", "cleanInternalCache", "cleanSharedPreference", "collectAllFile", "", "Ljava/io/File;", "folder", "isRecursion", "collectAllFilesByDate", "dirPath", "keepDate", "", "collectAllFilesDateAgo", "agoDays", "collectSpecificPrefixFile", "namePrefix", "collectSpecificPrefixFiles", "collectSpecificSuffixFile", "nameSuffix", "collectSpecificSuffixFiles", "deleteFile", "fileName", "deleteFolder", "filterKeepDateFiles", "files", "keepDateCount", "formatSize", "byteSize", "", "getAppCacheSize", "getFolderSize", "getLastAccessTime", "file", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.clean.b */
public final class DiskCleanUtils {

    /* renamed from: a */
    public static final DiskCleanUtils f94602a = new DiskCleanUtils();

    /* renamed from: b */
    private static Object f94603b;

    /* renamed from: c */
    private static Method f94604c;

    private DiskCleanUtils() {
    }

    /* renamed from: b */
    public final void mo135609b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
            mo135605a(context.getExternalCacheDir());
        }
    }

    /* renamed from: a */
    public final void mo135604a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo135605a(context.getCacheDir());
    }

    /* renamed from: b */
    public final long mo135606b(File file) {
        long j;
        Intrinsics.checkParameterIsNotNull(file, "folder");
        long j2 = 0;
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return file.length();
            }
            for (File file2 : listFiles) {
                Intrinsics.checkExpressionValueIsNotNull(file2, "value");
                if (file2.isDirectory()) {
                    j = mo135606b(file2);
                } else {
                    j = file2.length();
                }
                j2 += j;
            }
            return j2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public final boolean mo135611c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return mo135605a(new File("/data/data/" + context.getPackageName() + "/databases"));
    }

    /* renamed from: a */
    public final String mo135598a(double d) {
        double d2 = (double) 1024;
        double d3 = d / d2;
        double d4 = (double) 1;
        if (d3 < d4) {
            return "0.00MB";
        }
        double d5 = d3 / d2;
        if (d5 < d4) {
            BigDecimal bigDecimal = new BigDecimal(Double.toString(d3));
            return bigDecimal.setScale(2, 4).toPlainString() + "KB";
        }
        double d6 = d5 / d2;
        if (d6 < d4) {
            BigDecimal bigDecimal2 = new BigDecimal(Double.toString(d5));
            return bigDecimal2.setScale(2, 4).toPlainString() + "MB";
        }
        double d7 = d6 / d2;
        if (d7 < d4) {
            BigDecimal bigDecimal3 = new BigDecimal(Double.toString(d6));
            return bigDecimal3.setScale(2, 4).toPlainString() + "GB";
        }
        BigDecimal bigDecimal4 = new BigDecimal(d7);
        return bigDecimal4.setScale(2, 4).toPlainString() + "TB";
    }

    /* renamed from: c */
    public final long mo135610c(File file) {
        Object obj;
        Class<?> cls;
        Method method;
        Class<?> cls2;
        Intrinsics.checkParameterIsNotNull(file, "file");
        try {
            Field field = null;
            if (f94603b == null || f94604c == null) {
                Class<?> cls3 = Class.forName("libcore.io.Libcore");
                Intrinsics.checkExpressionValueIsNotNull(cls3, "Class.forName(\"libcore.io.Libcore\")");
                Field declaredField = cls3.getDeclaredField("os");
                Intrinsics.checkExpressionValueIsNotNull(declaredField, "coreClazz.getDeclaredField(\"os\")");
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj2 = declaredField.get(null);
                f94603b = obj2;
                if (obj2 == null || (cls2 = obj2.getClass()) == null) {
                    method = null;
                } else {
                    method = cls2.getMethod("lstat", String.class);
                }
                f94604c = method;
            }
            if (!file.exists()) {
                return 0;
            }
            Method method2 = f94604c;
            if (method2 != null) {
                obj = method2.invoke(f94603b, file.getAbsolutePath());
            } else {
                obj = null;
            }
            if (!(obj == null || (cls = obj.getClass()) == null)) {
                field = cls.getDeclaredField("st_atime");
            }
            if (field != null && !field.isAccessible()) {
                field.setAccessible(true);
            }
            if (field != null) {
                return field.getLong(obj) * ((long) 1000);
            }
            return file.lastModified();
        } catch (Exception unused) {
            return file.lastModified();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4 A[ADDED_TO_REGION] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo135612d(android.content.Context r13) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.diskmanage.clean.DiskCleanUtils.mo135612d(android.content.Context):boolean");
    }

    /* renamed from: a */
    public final boolean mo135605a(File file) {
        if (file == null) {
            return true;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        String[] list = file.list();
        if (list == null) {
            return true;
        }
        for (String str : list) {
            if (!mo135605a(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Ljava/io/File;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.diskmanage.clean.b$a */
    public static final class C36817a<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Map f94605a;

        C36817a(Map map) {
            this.f94605a = map;
        }

        /* renamed from: a */
        public final int compare(File file, File file2) {
            long j;
            long j2;
            Map map = this.f94605a;
            Intrinsics.checkExpressionValueIsNotNull(file2, "o2");
            Long l = (Long) map.get(file2.getAbsolutePath());
            if (l != null) {
                j = l.longValue();
            } else {
                j = file2.lastModified();
            }
            Map map2 = this.f94605a;
            Intrinsics.checkExpressionValueIsNotNull(file, "o1");
            Long l2 = (Long) map2.get(file.getAbsolutePath());
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = file.lastModified();
            }
            int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i == 0) {
                return 0;
            }
            return 1;
        }
    }

    /* renamed from: a */
    public final List<File> mo135599a(File file, String str) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        if (file != null && file.exists() && file.isDirectory() && !TextUtils.isEmpty(str) && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.exists()) {
                    Intrinsics.checkExpressionValueIsNotNull(file2, "file");
                    if (file2.isFile()) {
                        String name = file2.getName();
                        Intrinsics.checkExpressionValueIsNotNull(name, "file.name");
                        if (str == null) {
                            Intrinsics.throwNpe();
                        }
                        if (StringsKt.startsWith$default(name, str, false, 2, (Object) null)) {
                            arrayList.add(file2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<File> mo135607b(File file, String str) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        if (file != null && file.exists() && file.isDirectory() && !TextUtils.isEmpty(str) && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.exists()) {
                    Intrinsics.checkExpressionValueIsNotNull(file2, "file");
                    if (file2.isFile()) {
                        String name = file2.getName();
                        Intrinsics.checkExpressionValueIsNotNull(name, "file.name");
                        if (str == null) {
                            Intrinsics.throwNpe();
                        }
                        if (StringsKt.endsWith$default(name, str, false, 2, (Object) null)) {
                            arrayList.add(file2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<File> mo135600a(File file, boolean z) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.exists()) {
                    Intrinsics.checkExpressionValueIsNotNull(file2, "file");
                    if (file2.isFile()) {
                        arrayList.add(file2);
                    }
                    if (z && file2.isDirectory()) {
                        arrayList.addAll(mo135600a(file2, true));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<File> mo135603a(List<? extends File> list, int i) {
        Intrinsics.checkParameterIsNotNull(list, "files");
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (File file : list) {
            String absolutePath = file.getAbsolutePath();
            long c = mo135610c(file);
            Intrinsics.checkExpressionValueIsNotNull(absolutePath, "path");
            linkedHashMap.put(absolutePath, Long.valueOf(c));
        }
        Collections.sort(list, new C36817a(linkedHashMap));
        int i2 = 0;
        String a = C26279i.m95153a(new Date(mo135610c((File) list.get(0))), "yyyy-MM-dd");
        for (File file2 : list) {
            String a2 = C26279i.m95153a(new Date(mo135610c(file2)), "yyyy-MM-dd");
            if (!TextUtils.equals(a2, a)) {
                i--;
                a = a2;
            }
            if (i <= 0) {
                break;
            }
            i2++;
        }
        arrayList.addAll(list.subList(i2, list.size()));
        return arrayList;
    }

    /* renamed from: a */
    public final List<File> mo135601a(String str, int i, boolean z) {
        return mo135603a(mo135600a(new File(str), z), i);
    }

    /* renamed from: a */
    public final List<File> mo135602a(String str, String str2, int i) {
        return mo135603a(mo135599a(new File(str), str2), i);
    }

    /* renamed from: b */
    public final List<File> mo135608b(String str, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        List<File> a = mo135600a(new File(str), z);
        if (a.isEmpty()) {
            return arrayList;
        }
        for (File file : a) {
            if (Math.abs(System.currentTimeMillis() - mo135610c(file)) - (((long) i) * 86400000) > 0) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }
}
