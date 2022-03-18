package com.ss.ugc.effectplatform.util;

import bytekn.foundation.encryption.Hash;
import bytekn.foundation.encryption.MD5;
import bytekn.foundation.io.file.FileInputStream;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.io.file.FileMeta;
import bytekn.foundation.io.file.FileOutputStream;
import bytekn.foundation.io.file.FilePathComponent;
import bytekn.foundation.io.file.FileType;
import bytekn.foundation.logger.Logger;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.ss.ugc.effectplatform.util.k */
public final class FileUtils {

    /* renamed from: a */
    public static final FileUtils f165113a = new FileUtils();

    private FileUtils() {
    }

    /* renamed from: b */
    public final String mo228324b(String str) {
        int lastIndexOf$default;
        if (str == null || (lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, FileManager.f5817a.mo8712a(), 0, false, 6, (Object) null)) < 0) {
            return null;
        }
        String substring = str.substring(0, lastIndexOf$default);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public final boolean mo228325c(String str) {
        if (str == null) {
            return false;
        }
        boolean g = FileManager.f5817a.mo8731g(str);
        if (!g && FileManager.f5817a.mo8730f(str)) {
            Logger bVar = Logger.f5760a;
            Logger.m7508a(bVar, "FileUtils", "remove file: " + str + " failed!", null, 4, null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_dirty");
            mo228322a(str, sb.toString(), true);
        }
        return g;
    }

    /* renamed from: a */
    public final long mo228318a(String str) {
        FileMeta c;
        long j;
        if (str == null || (c = FileManager.f5817a.mo8724c(str)) == null) {
            return 0;
        }
        if (c.mo8735c() == FileType.Directory) {
            List<FileMeta> a = FileManager.f5817a.mo8715a(str);
            if (a == null) {
                return 0;
            }
            long j2 = 0;
            for (T t : a) {
                if (t.mo8735c() == FileType.Directory) {
                    j = f165113a.mo228318a(t.mo8733a().mo8744a());
                } else {
                    Long b = t.mo8734b();
                    j = b != null ? b.longValue() : 0;
                }
                j2 += j;
            }
            return j2;
        }
        Long b2 = c.mo8734b();
        if (b2 != null) {
            return b2.longValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo228321a(FilePathComponent gVar) {
        if (gVar == null) {
            return false;
        }
        boolean d = FileManager.f5817a.mo8727d(gVar);
        if (!d && FileManager.f5817a.mo8725c(gVar)) {
            Logger bVar = Logger.f5760a;
            Logger.m7508a(bVar, "FileUtils", "remove file: " + gVar.mo8744a() + " failed!", null, 4, null);
            String a = gVar.mo8744a();
            mo228322a(a, gVar.mo8744a() + "_dirty", true);
        }
        return d;
    }

    /* renamed from: a */
    public final long mo228319a(String str, FileInputStream bVar) {
        Intrinsics.checkParameterIsNotNull(str, "outFilePath");
        Intrinsics.checkParameterIsNotNull(bVar, "inputStream");
        FileOutputStream a = FileManager.m7582a(FileManager.f5817a, str, false, 2, (Object) null);
        if (a == null) {
            return 0;
        }
        m257079a(f165113a, bVar, a, 0, null, 12, null);
        return 0;
    }

    /* renamed from: a */
    public final String mo228320a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "suffix");
        if (str == null) {
            return null;
        }
        if (StringsKt.endsWith$default(str, FileManager.f5817a.mo8712a(), false, 2, (Object) null)) {
            return StringsKt.dropLast(str, 1) + str2 + FileManager.f5817a.mo8712a();
        }
        return str + str2;
    }

    /* renamed from: a */
    public final boolean mo228322a(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str2, "destPath");
        if (str == null) {
            return false;
        }
        if (FileManager.f5817a.mo8718a(str, str2)) {
            return true;
        }
        if (z) {
            return FileManager.f5817a.mo8717a(new FilePathComponent(str), new FilePathComponent(str2));
        }
        return false;
    }

    /* renamed from: a */
    public final long mo228317a(FileInputStream bVar, FileOutputStream fVar, long j, Function2<? super Integer, ? super Long, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(bVar, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(fVar, "sink");
        byte[] bArr = new byte[8192];
        int a = bVar.mo8705a(bArr, 0, 8192);
        long j2 = 0;
        while (a > 0) {
            fVar.mo8741a(bArr, 0, a);
            j2 += (long) a;
            if (j2 < j && j > 0 && kVar != null) {
                kVar.invoke(Integer.valueOf((int) ((((float) j2) / ((float) j)) * ((float) 100))), Long.valueOf(j));
            }
            a = bVar.mo8705a(bArr, 0, 8192);
        }
        if (kVar != null) {
            kVar.invoke(100, Long.valueOf(j));
        }
        fVar.mo8742c();
        fVar.mo8708b();
        return j2;
    }

    /* renamed from: b */
    public final String mo228323b(FileInputStream bVar, FileOutputStream fVar, long j, Function2<? super Integer, ? super Long, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(bVar, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(fVar, "sink");
        MD5 gVar = new MD5();
        byte[] bArr = new byte[8192];
        int a = bVar.mo8705a(bArr, 0, 8192);
        long j2 = 0;
        while (a > 0) {
            fVar.mo8741a(bArr, 0, a);
            j2 += (long) a;
            gVar.mo8690a(bArr, 0, a);
            if (j2 < j && j > 0 && kVar != null) {
                kVar.invoke(Integer.valueOf((int) ((((float) j2) / ((float) j)) * ((float) 100))), Long.valueOf(j));
            }
            a = bVar.mo8705a(bArr, 0, 8192);
        }
        if (kVar != null) {
            kVar.invoke(100, Long.valueOf(j));
        }
        byte[] b = gVar.mo8695b();
        fVar.mo8742c();
        fVar.mo8708b();
        return Hash.m7546a(b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.ugc.effectplatform.util.k */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ long m257079a(FileUtils kVar, FileInputStream bVar, FileOutputStream fVar, long j, Function2 kVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 0;
        }
        if ((i & 8) != 0) {
            kVar2 = null;
        }
        return kVar.mo228317a(bVar, fVar, j, kVar2);
    }
}
