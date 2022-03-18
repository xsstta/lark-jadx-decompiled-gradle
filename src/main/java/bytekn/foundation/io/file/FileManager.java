package bytekn.foundation.io.file;

import android.util.Base64;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.C69104g;
import kotlin.io.C69111n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u001c\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\u0004J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0016\u0010&\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0016J\u0016\u0010&\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0016J\u0016\u0010(\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010(\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\u0012\u0010)\u001a\u0004\u0018\u00010%2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018J\u0010\u0010)\u001a\u0004\u0018\u00010%2\u0006\u0010\u001e\u001a\u00020\u0004J\u001c\u0010*\u001a\u0004\u0018\u00010+2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010,\u001a\u00020\u0016J\u001a\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0016J\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!2\u0006\u0010\u001d\u001a\u00020\u0018J\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!2\u0006\u0010\u001e\u001a\u00020\u0004J\u001a\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010/\u001a\u00020\u0014J\u001a\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u0014J\u0010\u00100\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018J\u000e\u00100\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0004J\u001a\u00101\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u000e\u00102\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0018J\u000e\u00102\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0004J\u0016\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004J*\u00106\u001a\u0002072\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u00020\u0014J*\u00106\u001a\u0002072\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u00020\u0014J2\u00106\u001a\u0002072\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00142\b\b\u0002\u0010,\u001a\u00020\u0016H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006:"}, d2 = {"Lbytekn/foundation/io/file/FileManager;", "", "()V", "defaultCacheDir", "", "getDefaultCacheDir", "()Ljava/lang/String;", "separator", "getSeparator", "buildStats", "Lbytekn/foundation/io/file/FileMeta;", "file", "Ljava/io/File;", "closeQuietly", "", "closeable", "Lbytekn/foundation/io/file/KnCloseable;", "contentEncoding2Charset", "Ljava/nio/charset/Charset;", "contentEncoding", "Lbytekn/foundation/io/file/ContentEncoding;", "copyFile", "", "srcPathComponent", "Lbytekn/foundation/io/file/FilePathComponent;", "destPathComponent", "srcPath", "destPath", "exists", "pathComponent", "path", "fileName", "getFileChildrenList", "", "filePath", "inputStreamToString", "inputStream", "Lbytekn/foundation/io/file/FileInputStream;", "mkdir", "recursive", "moveFile", "openFileInputStream", "openFileOutputStream", "Lbytekn/foundation/io/file/FileOutputStream;", "append", "readDir", "readFile", "encoding", "remove", "renameFile", "touch", "unzip", "zipFilePath", "unzipFileFolderPath", "writeFile", "", "contents", "create", "kn_io_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.io.file.c */
public final class FileManager {

    /* renamed from: a */
    public static final FileManager f5817a = new FileManager();

    /* renamed from: b */
    private static final String f5818b;

    /* renamed from: c */
    private static final String f5819c = "";

    /* renamed from: a */
    public static /* synthetic */ long m7578a(FileManager cVar, String str, String str2, boolean z, ContentEncoding contentEncoding, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            contentEncoding = ContentEncoding.Utf8;
        }
        return cVar.mo8709a(str, str2, z, contentEncoding);
    }

    /* renamed from: a */
    public static /* synthetic */ FileOutputStream m7581a(FileManager cVar, FilePathComponent gVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cVar.mo8711a(gVar, z);
    }

    /* renamed from: a */
    public static /* synthetic */ FileOutputStream m7582a(FileManager cVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cVar.mo8720b(str, z);
    }

    /* renamed from: a */
    public static /* synthetic */ String m7583a(FileManager cVar, FileInputStream bVar, ContentEncoding contentEncoding, int i, Object obj) {
        if ((i & 2) != 0) {
            contentEncoding = ContentEncoding.Utf8;
        }
        return cVar.mo8713a(bVar, contentEncoding);
    }

    private FileManager() {
    }

    /* renamed from: a */
    public final String mo8712a() {
        return f5818b;
    }

    /* renamed from: a */
    public final List<FileMeta> mo8715a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        File[] listFiles = new File(str).getAbsoluteFile().listFiles();
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            FileManager cVar = f5817a;
            Intrinsics.checkExpressionValueIsNotNull(file, "it");
            arrayList.add(cVar.m7580a(file));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final FileMeta mo8710a(FilePathComponent gVar) {
        String a;
        if (gVar == null || (a = gVar.mo8744a()) == null) {
            return null;
        }
        return mo8724c(a);
    }

    /* renamed from: a */
    public final String mo8714a(String str, ContentEncoding contentEncoding) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(contentEncoding, "encoding");
        String joinToString$default = CollectionsKt.joinToString$default(C69111n.m265942a((Reader) new BufferedReader(new InputStreamReader(new FileInputStream(new File(str).getAbsoluteFile()), (Charset) new C1709c(contentEncoding).invoke()))), "\n", null, null, 0, null, null, 62, null);
        if (contentEncoding != ContentEncoding.Base64) {
            return joinToString$default;
        }
        byte[] decode = Base64.decode(joinToString$default, 0);
        Intrinsics.checkExpressionValueIsNotNull(decode, "Base64.decode(content, Base64.DEFAULT)");
        return new String(decode, Charsets.f173341a);
    }

    /* renamed from: a */
    public final boolean mo8719a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        File absoluteFile = new File(str).getAbsoluteFile();
        return z ? absoluteFile.mkdirs() : absoluteFile.mkdir();
    }

    /* renamed from: a */
    public final boolean mo8718a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "srcPath");
        Intrinsics.checkParameterIsNotNull(str2, "destPath");
        return new File(str).getAbsoluteFile().renameTo(new File(str2).getAbsoluteFile());
    }

    /* renamed from: a */
    public final boolean mo8717a(FilePathComponent gVar, FilePathComponent gVar2) {
        if (gVar == null || gVar2 == null) {
            return false;
        }
        if (mo8725c(gVar2)) {
            mo8727d(gVar2);
        }
        File file = new File(gVar.mo8744a());
        File file2 = new File(gVar2.mo8744a());
        if (!file.exists()) {
            return false;
        }
        return file.renameTo(file2);
    }

    /* renamed from: a */
    public final FileOutputStream mo8711a(FilePathComponent gVar, boolean z) {
        String a;
        if (gVar == null || (a = gVar.mo8744a()) == null) {
            return null;
        }
        return mo8720b(a, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        kotlin.io.C69101b.m265907a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        throw r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo8713a(bytekn.foundation.io.file.FileInputStream r6, bytekn.foundation.io.file.ContentEncoding r7) {
        /*
            r5 = this;
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.lang.String r0 = "contentEncoding"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.mo8706a()
            java.nio.charset.Charset r7 = r5.m7584a(r7)
            java.lang.String r7 = r7.name()
            r0.<init>(r6, r7)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r6 = 0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r7 = r0
            java.io.InputStreamReader r7 = (java.io.InputStreamReader) r7     // Catch:{ all -> 0x0049 }
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x0049 }
            r1.<init>()     // Catch:{ all -> 0x0049 }
            r2 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r2]     // Catch:{ all -> 0x0049 }
            int r3 = r7.read(r2)     // Catch:{ all -> 0x0049 }
        L_0x0030:
            r4 = -1
            if (r3 == r4) goto L_0x003c
            r4 = 0
            r1.write(r2, r4, r3)     // Catch:{ all -> 0x0049 }
            int r3 = r7.read(r2)     // Catch:{ all -> 0x0049 }
            goto L_0x0030
        L_0x003c:
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "writer.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r1)     // Catch:{ all -> 0x0049 }
            kotlin.io.C69101b.m265907a(r0, r6)
            return r7
        L_0x0049:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004b }
        L_0x004b:
            r7 = move-exception
            kotlin.io.C69101b.m265907a(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bytekn.foundation.io.file.FileManager.mo8713a(bytekn.foundation.io.file.b, bytekn.foundation.io.file.ContentEncoding):java.lang.String");
    }

    /* renamed from: a */
    public final void mo8716a(KnCloseable hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "closeable");
        try {
            hVar.mo8708b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lbytekn/foundation/io/file/FileType;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.io.file.c$a */
    public static final class C1707a extends Lambda implements Function0<FileType> {
        final /* synthetic */ File $file;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1707a(File file) {
            super(0);
            this.$file = file;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FileType invoke() {
            if (this.$file.isDirectory()) {
                return FileType.Directory;
            }
            if (this.$file.isFile()) {
                return FileType.Regular;
            }
            return FileType.Unknown;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/nio/charset/Charset;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.io.file.c$b */
    public static final class C1708b extends Lambda implements Function0<Charset> {
        final /* synthetic */ ContentEncoding $contentEncoding;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1708b(ContentEncoding contentEncoding) {
            super(0);
            this.$contentEncoding = contentEncoding;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Charset invoke() {
            if (C1710d.f5822c[this.$contentEncoding.ordinal()] != 1) {
                return Charsets.f173341a;
            }
            return Charsets.f173345e;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/nio/charset/Charset;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.io.file.c$c */
    public static final class C1709c extends Lambda implements Function0<Charset> {
        final /* synthetic */ ContentEncoding $encoding;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1709c(ContentEncoding contentEncoding) {
            super(0);
            this.$encoding = contentEncoding;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Charset invoke() {
            if (C1710d.f5820a[this.$encoding.ordinal()] != 1) {
                return Charsets.f173341a;
            }
            return Charsets.f173345e;
        }
    }

    static {
        String str = File.separator;
        Intrinsics.checkExpressionValueIsNotNull(str, "File.separator");
        f5818b = str;
    }

    /* renamed from: c */
    public final FileMeta mo8724c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        return m7580a(new File(str));
    }

    /* renamed from: d */
    public final String mo8726d(String str) {
        if (str != null) {
            return new File(str).getName();
        }
        return null;
    }

    /* renamed from: e */
    public final FileInputStream mo8728e(FilePathComponent gVar) {
        String a;
        if (gVar == null || (a = gVar.mo8744a()) == null) {
            return null;
        }
        return mo8732h(a);
    }

    /* renamed from: c */
    public final boolean mo8725c(FilePathComponent gVar) {
        String a;
        if (gVar == null || (a = gVar.mo8744a()) == null) {
            return false;
        }
        return mo8730f(a);
    }

    /* renamed from: d */
    public final boolean mo8727d(FilePathComponent gVar) {
        String a;
        if (gVar == null || (a = gVar.mo8744a()) == null) {
            return false;
        }
        return mo8731g(a);
    }

    /* renamed from: e */
    public final boolean mo8729e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        return new File(str).getAbsoluteFile().createNewFile();
    }

    /* renamed from: f */
    public final boolean mo8730f(String str) {
        if (str != null) {
            return new File(str).getAbsoluteFile().exists();
        }
        return false;
    }

    /* renamed from: h */
    public final FileInputStream mo8732h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        FileInputStream fileInputStream = new FileInputStream(new File(str).getAbsoluteFile());
        FileInputStream bVar = new FileInputStream();
        bVar.mo8707a(fileInputStream);
        return bVar;
    }

    /* renamed from: b */
    public final boolean mo8722b(FilePathComponent gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "pathComponent");
        String a = gVar.mo8744a();
        if (a != null) {
            return mo8729e(a);
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo8731g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        File file = new File(str);
        if (file.exists()) {
            File absoluteFile = file.getAbsoluteFile();
            Intrinsics.checkExpressionValueIsNotNull(absoluteFile, "file.absoluteFile");
            if (C69104g.m265937f(absoluteFile)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final FileMeta m7580a(File file) {
        String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "file.name");
        return new FileMeta(name, new FilePathComponent(file.getAbsolutePath()), new FilePathComponent(file.getCanonicalPath()), Double.valueOf(0.0d), Double.valueOf((double) file.lastModified()), Long.valueOf(file.length()), (FileType) new C1707a(file).invoke());
    }

    /* renamed from: b */
    public final List<String> mo8721b(String str) {
        File absoluteFile;
        Object obj;
        if (str == null || (absoluteFile = new File(str).getAbsoluteFile()) == null || !absoluteFile.exists()) {
            return null;
        }
        if (!absoluteFile.isDirectory()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = absoluteFile.listFiles();
        if (listFiles != null) {
            ArrayList arrayList2 = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                Intrinsics.checkExpressionValueIsNotNull(file, "it");
                if (file.isDirectory()) {
                    String name = file.getName();
                    Intrinsics.checkExpressionValueIsNotNull(name, "it.name");
                    if (!StringsKt.contains$default((CharSequence) name, (CharSequence) "__MACOSX", false, 2, (Object) null)) {
                        List<String> b = f5817a.mo8721b(file.getAbsolutePath());
                        obj = b != null ? Boolean.valueOf(arrayList.addAll(b)) : null;
                    } else {
                        obj = Unit.INSTANCE;
                    }
                } else {
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkExpressionValueIsNotNull(absolutePath, "it.absolutePath");
                    obj = Boolean.valueOf(arrayList.add(absolutePath));
                }
                arrayList2.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final Charset m7584a(ContentEncoding contentEncoding) {
        return (Charset) new C1708b(contentEncoding).invoke();
    }

    /* renamed from: b */
    public final FileOutputStream mo8720b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str).getAbsoluteFile(), z);
        FileOutputStream fVar = new FileOutputStream();
        fVar.mo8740a(fileOutputStream);
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010e A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0118 A[SYNTHETIC, Splitter:B:51:0x0118] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8723b(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: bytekn.foundation.io.file.FileManager.mo8723b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final long mo8709a(String str, String str2, boolean z, ContentEncoding contentEncoding) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(str2, "contents");
        Intrinsics.checkParameterIsNotNull(contentEncoding, "encoding");
        return m7579a(str, str2, z, contentEncoding, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a0, code lost:
        kotlin.io.C69101b.m265907a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        throw r9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m7579a(java.lang.String r7, java.lang.String r8, boolean r9, bytekn.foundation.io.file.ContentEncoding r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: bytekn.foundation.io.file.FileManager.m7579a(java.lang.String, java.lang.String, boolean, bytekn.foundation.io.file.ContentEncoding, boolean):long");
    }
}
