package com.bytedance.android.alog;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.C1711a;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Alog {

    /* renamed from: a */
    public static final int f8306a = Mode.SAFE.getValue();

    /* renamed from: b */
    public static final int f8307b = TimeFormat.RAW.getValue();

    /* renamed from: c */
    public static final int f8308c = PrefixFormat.DEFAULT.getValue();

    /* renamed from: d */
    public static final int f8309d = Compress.ZSTD.getValue();

    /* renamed from: e */
    public static final int f8310e = SymCrypt.TEA_16.getValue();

    /* renamed from: f */
    public static final int f8311f = AsymCrypt.EC_SECP256K1.getValue();

    /* renamed from: g */
    public static final ArrayList<String> f8312g = new ArrayList<>();

    /* renamed from: h */
    private static boolean f8313h = false;

    /* renamed from: i */
    private Context f8314i;

    /* renamed from: j */
    private int f8315j;

    /* renamed from: k */
    private String f8316k;

    /* renamed from: l */
    private String f8317l;

    /* renamed from: m */
    private int f8318m;

    /* renamed from: n */
    private int f8319n;

    /* renamed from: o */
    private String f8320o;

    /* renamed from: p */
    private String f8321p;

    /* renamed from: q */
    private long f8322q;

    private static native void nativeAsyncFlush(long j);

    private static native long nativeCreate(int i, boolean z, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, String str4, int i7, int i8, int i9, int i10, int i11, int i12, String str5);

    private static native void nativeDestroy(long j);

    private static native long nativeGetLegacyFlushFuncAddr();

    private static native long nativeGetLegacyGetLogFileDirFuncAddr();

    private static native long nativeGetLegacyWriteFuncAddr();

    private static native long nativeGetNativeWriteFuncAddr();

    static native void nativeSetDefaultInstance(long j);

    private static native void nativeSetLevel(long j, int i);

    private static native void nativeSetSyslog(long j, boolean z);

    private static native void nativeSyncFlush(long j);

    private static native void nativeTimedSyncFlush(long j, int i);

    private static native void nativeWrite(long j, int i, String str, String str2);

    private static native void nativeWriteAsyncMsg(long j, int i, String str, String str2, long j2, long j3);

    public enum AsymCrypt {
        NONE(0),
        EC_SECP256K1(1),
        EC_SECP256R1(2);
        
        private final int value;

        /* access modifiers changed from: package-private */
        public int getValue() {
            return this.value;
        }

        private AsymCrypt(int i) {
            this.value = i;
        }
    }

    public enum Compress {
        NONE(0),
        ZLIB(1),
        ZSTD(2);
        
        private final int value;

        /* access modifiers changed from: package-private */
        public int getValue() {
            return this.value;
        }

        private Compress(int i) {
            this.value = i;
        }
    }

    public enum Mode {
        SPEED(0),
        SAFE(1);
        
        private final int value;

        /* access modifiers changed from: package-private */
        public int getValue() {
            return this.value;
        }

        private Mode(int i) {
            this.value = i;
        }
    }

    public enum PrefixFormat {
        DEFAULT(0),
        LEGACY(1);
        
        private final int value;

        /* access modifiers changed from: package-private */
        public int getValue() {
            return this.value;
        }

        private PrefixFormat(int i) {
            this.value = i;
        }
    }

    public enum SymCrypt {
        NONE(0),
        TEA_16(1),
        TEA_32(2),
        TEA_64(3);
        
        private final int value;

        /* access modifiers changed from: package-private */
        public int getValue() {
            return this.value;
        }

        private SymCrypt(int i) {
            this.value = i;
        }
    }

    public enum TimeFormat {
        RAW(0),
        ISO_8601(1);
        
        private final int value;

        /* access modifiers changed from: package-private */
        public int getValue() {
            return this.value;
        }

        private TimeFormat(int i) {
            this.value = i;
        }
    }

    /* renamed from: j */
    public long mo11302j() {
        return this.f8322q;
    }

    /* renamed from: h */
    public HashMap<String, String> mo11300h() {
        return C2613a.m11014a();
    }

    /* renamed from: b */
    public void mo11288b() {
        long j = this.f8322q;
        if (j != 0) {
            nativeAsyncFlush(j);
        }
    }

    /* renamed from: c */
    public void mo11291c() {
        long j = this.f8322q;
        if (j != 0) {
            nativeSyncFlush(j);
        }
    }

    /* renamed from: d */
    public long mo11293d() {
        if (this.f8322q != 0) {
            return nativeGetLegacyWriteFuncAddr();
        }
        return 0;
    }

    /* renamed from: e */
    public long mo11295e() {
        if (this.f8322q != 0) {
            return nativeGetLegacyFlushFuncAddr();
        }
        return 0;
    }

    /* renamed from: f */
    public long mo11297f() {
        if (this.f8322q != 0) {
            return nativeGetLegacyGetLogFileDirFuncAddr();
        }
        return 0;
    }

    public void finalize() throws Throwable {
        try {
            super.finalize();
        } finally {
            mo11281a();
        }
    }

    /* renamed from: g */
    public long mo11299g() {
        if (this.f8322q != 0) {
            return nativeGetNativeWriteFuncAddr();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo11281a() {
        synchronized (this) {
            long j = this.f8322q;
            if (j != 0) {
                this.f8314i = null;
                this.f8315j = 6;
                nativeDestroy(j);
                this.f8322q = 0;
            }
        }
    }

    /* renamed from: i */
    public String mo11301i() {
        int i;
        File[] fileArr;
        Pattern pattern;
        if (!f8313h) {
            return "not inited";
        }
        if (this.f8320o == null) {
            this.f8320o = C2617d.m11039b(this.f8314i);
        }
        String str = this.f8320o;
        if (str == null) {
            return "get process name failed";
        }
        String replace = str.replace(':', '-');
        File file = new File(this.f8317l);
        if (!file.exists()) {
            return "cache dir not exists";
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return "cache dir is empty";
        }
        String str2 = replace + "__" + this.f8321p + ".alog.cache.guard";
        Pattern compile = Pattern.compile("^" + Pattern.quote(replace) + "__" + Pattern.quote(this.f8321p) + "__\\d{5}\\.alog\\.cache$");
        int length = listFiles.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i2 < length) {
            File file2 = listFiles[i2];
            if (file2.getName().equals(str2)) {
                i3++;
                if (file2.length() >= 24576) {
                    i4++;
                }
                fileArr = listFiles;
            } else {
                String name = file2.getName();
                StringBuilder sb = new StringBuilder();
                sb.append(replace);
                sb.append("__");
                fileArr = listFiles;
                sb.append(this.f8321p);
                sb.append("__");
                if (name.startsWith(sb.toString()) && compile.matcher(file2.getName()).find()) {
                    i5++;
                    pattern = compile;
                    i = length;
                    if (file2.length() >= ((long) this.f8318m)) {
                        i6++;
                    }
                    i2++;
                    compile = pattern;
                    listFiles = fileArr;
                    length = i;
                }
            }
            pattern = compile;
            i = length;
            i2++;
            compile = pattern;
            listFiles = fileArr;
            length = i;
        }
        if (i3 < 1) {
            Log.d("alog_trace", str2);
            Log.d("alog_trace", file.getAbsolutePath());
            return "cache guard not exists";
        } else if (i4 < 1) {
            return "cache guard size insufficiently";
        } else {
            int i7 = this.f8319n;
            if (i5 < i7) {
                return "cache block count insufficiently";
            }
            if (i6 < i7) {
                return "cache block size insufficiently";
            }
            File file3 = new File(this.f8316k);
            if (!file3.exists()) {
                return "log dir not exists";
            }
            final Pattern compile2 = Pattern.compile("^\\d{4}_\\d{2}_\\d{2}_\\d+__" + Pattern.quote(replace) + "__" + Pattern.quote(this.f8321p) + "\\.alog\\.hot$");
            File[] listFiles2 = file3.listFiles(new FilenameFilter() {
                /* class com.bytedance.android.alog.Alog.C26111 */

                public boolean accept(File file, String str) {
                    return compile2.matcher(str).find();
                }
            });
            if (listFiles2 == null || listFiles2.length == 0) {
                return "no log file for current process and instance";
            }
            return "OK";
        }
    }

    /* renamed from: com.bytedance.android.alog.Alog$a */
    public static class C2612a {

        /* renamed from: a */
        private Context f8325a;

        /* renamed from: b */
        private int f8326b;

        /* renamed from: c */
        private boolean f8327c;

        /* renamed from: d */
        private String f8328d;

        /* renamed from: e */
        private String f8329e;

        /* renamed from: f */
        private int f8330f = 2097152;

        /* renamed from: g */
        private int f8331g = 20971520;

        /* renamed from: h */
        private int f8332h = 7;

        /* renamed from: i */
        private String f8333i;

        /* renamed from: j */
        private int f8334j = 65536;

        /* renamed from: k */
        private int f8335k = 196608;

        /* renamed from: l */
        private String f8336l;

        /* renamed from: m */
        private int f8337m = Alog.f8306a;

        /* renamed from: n */
        private int f8338n = Alog.f8307b;

        /* renamed from: o */
        private int f8339o = Alog.f8308c;

        /* renamed from: p */
        private int f8340p = Alog.f8309d;

        /* renamed from: q */
        private int f8341q = Alog.f8310e;

        /* renamed from: r */
        private int f8342r = Alog.f8311f;

        /* renamed from: s */
        private String f8343s = "b012e20c9aab1cb5257aca2069cb79a9339b3a2224f771c78d64972137936eaf0b2f7ebd8d46c2607e1d7fe7723d40b147b8ecfa8fe2eaeee05210c75822381a";

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            if (r24.f8329e != null) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
            r0 = r24.f8325a.getExternalFilesDir(null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
            if (r0 == null) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
            r24.f8329e = r0.getPath() + "/alog";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
            r24.f8329e = r24.f8325a.getFilesDir() + "/alog";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
            if (r24.f8333i != null) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
            r24.f8333i = r24.f8325a.getFilesDir() + "/alog";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
            if (r24.f8336l != null) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
            r24.f8336l = com.bytedance.android.alog.C2617d.m11038a(r24.f8325a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
            r0 = (r24.f8334j / 4096) * 4096;
            r24.f8334j = r0;
            r3 = (r24.f8335k / 4096) * 4096;
            r24.f8335k = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
            if (r0 >= 4096) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
            r24.f8334j = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
            r14 = r24.f8334j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
            if (r3 >= (r14 * 2)) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
            r24.f8335k = r14 * 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f0, code lost:
            return new com.bytedance.android.alog.Alog(r24.f8325a, r24.f8326b, r24.f8327c, r24.f8328d, r24.f8329e, r24.f8330f, r24.f8331g, r24.f8332h, r24.f8333i, r14, r24.f8335k, r24.f8336l, r24.f8337m, r24.f8338n, r24.f8339o, r24.f8340p, r24.f8341q, r24.f8342r, r24.f8343s);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bytedance.android.alog.Alog mo11319a() {
            /*
            // Method dump skipped, instructions count: 244
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.alog.Alog.C2612a.mo11319a():com.bytedance.android.alog.Alog");
        }

        /* renamed from: a */
        public C2612a mo11310a(int i) {
            this.f8326b = i;
            return this;
        }

        /* renamed from: b */
        public C2612a mo11320b(int i) {
            this.f8330f = i;
            return this;
        }

        /* renamed from: c */
        public C2612a mo11322c(int i) {
            this.f8331g = i;
            return this;
        }

        /* renamed from: d */
        public C2612a mo11324d(int i) {
            this.f8332h = i;
            return this;
        }

        /* renamed from: e */
        public C2612a mo11326e(int i) {
            this.f8334j = i;
            return this;
        }

        /* renamed from: f */
        public C2612a mo11327f(int i) {
            this.f8335k = i;
            return this;
        }

        /* renamed from: a */
        public C2612a mo11311a(AsymCrypt asymCrypt) {
            this.f8342r = asymCrypt.getValue();
            return this;
        }

        /* renamed from: b */
        public C2612a mo11321b(String str) {
            this.f8329e = str;
            return this;
        }

        /* renamed from: c */
        public C2612a mo11323c(String str) {
            this.f8333i = str;
            return this;
        }

        /* renamed from: d */
        public C2612a mo11325d(String str) {
            this.f8343s = str;
            return this;
        }

        /* renamed from: a */
        public C2612a mo11312a(Compress compress) {
            this.f8340p = compress.getValue();
            return this;
        }

        /* renamed from: a */
        public C2612a mo11313a(Mode mode) {
            this.f8337m = mode.getValue();
            return this;
        }

        public C2612a(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.f8325a = applicationContext != null ? applicationContext : context;
        }

        /* renamed from: a */
        public C2612a mo11314a(PrefixFormat prefixFormat) {
            this.f8339o = prefixFormat.getValue();
            return this;
        }

        /* renamed from: a */
        public C2612a mo11315a(SymCrypt symCrypt) {
            this.f8341q = symCrypt.getValue();
            return this;
        }

        /* renamed from: a */
        public C2612a mo11316a(TimeFormat timeFormat) {
            this.f8338n = timeFormat.getValue();
            return this;
        }

        /* renamed from: a */
        public C2612a mo11317a(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("-")) {
                    str = str.replace("-", "");
                }
                if (str.contains("_")) {
                    str = str.replace("_", "");
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f8328d = str;
                }
            }
            return this;
        }

        /* renamed from: a */
        public C2612a mo11318a(boolean z) {
            this.f8327c = z;
            return this;
        }
    }

    /* renamed from: a */
    public void mo11282a(int i) {
        long j = this.f8322q;
        if (j != 0) {
            nativeTimedSyncFlush(j, i);
        }
    }

    /* renamed from: a */
    public static synchronized void m10974a(AbstractC2615b bVar) {
        synchronized (Alog.class) {
            if (!f8313h) {
                if (bVar == null) {
                    C1711a.m7628a("alog");
                } else {
                    bVar.mo11329a("alog");
                }
                f8313h = true;
            }
        }
    }

    /* renamed from: b */
    public void mo11289b(int i) {
        long j = this.f8322q;
        if (j != 0) {
            nativeSetLevel(j, i);
        }
    }

    /* renamed from: a */
    public void mo11286a(boolean z) {
        long j = this.f8322q;
        if (j != 0) {
            nativeSetSyslog(j, z);
        }
    }

    /* renamed from: a */
    public void mo11285a(String str, String str2) {
        mo11283a(0, str, str2);
    }

    /* renamed from: b */
    public void mo11290b(String str, String str2) {
        mo11283a(1, str, str2);
    }

    /* renamed from: c */
    public void mo11292c(String str, String str2) {
        mo11283a(2, str, str2);
    }

    /* renamed from: d */
    public void mo11294d(String str, String str2) {
        mo11283a(3, str, str2);
    }

    /* renamed from: e */
    public void mo11296e(String str, String str2) {
        mo11283a(4, str, str2);
    }

    /* renamed from: a */
    public void mo11283a(int i, String str, String str2) {
        long j = this.f8322q;
        if (j != 0 && i >= this.f8315j && str != null && str2 != null) {
            nativeWrite(j, i, str, str2);
        }
    }

    /* renamed from: a */
    public File[] mo11287a(String str, String str2, long j, long j2) {
        return C2613a.m11015a(this.f8316k, str, str2, j, j2);
    }

    /* renamed from: a */
    public void mo11284a(int i, String str, String str2, long j, long j2) {
        long j3 = this.f8322q;
        if (j3 != 0 && i >= this.f8315j && str != null && str2 != null) {
            nativeWriteAsyncMsg(j3, i, str, str2, j, j2);
        }
    }

    public Alog(Context context, int i, boolean z, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, String str4, int i7, int i8, int i9, int i10, int i11, int i12, String str5) {
        this.f8314i = context;
        this.f8315j = i;
        this.f8316k = str2;
        this.f8317l = str3;
        this.f8318m = i5;
        this.f8319n = i6 / i5;
        this.f8321p = str;
        this.f8322q = nativeCreate(i, z, str, str2, i2, i3, i4, str3, i5, i6, str4, i7, i8, i9, i10, i11, i12, str5);
    }
}
