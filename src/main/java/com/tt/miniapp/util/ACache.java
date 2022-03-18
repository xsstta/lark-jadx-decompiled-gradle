package com.tt.miniapp.util;

import android.content.Context;
import android.os.Process;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ACache {

    /* renamed from: a */
    private static Map<String, ACache> f168967a = new HashMap();

    /* renamed from: b */
    private C67011a f168968b;

    /* renamed from: a */
    public void mo233094a() {
        this.f168968b.mo233099a();
    }

    /* renamed from: com.tt.miniapp.util.ACache$a */
    public class C67011a {

        /* renamed from: a */
        public final AtomicLong f168969a;

        /* renamed from: b */
        public final AtomicInteger f168970b;

        /* renamed from: c */
        public final Map<File, Long> f168971c;

        /* renamed from: d */
        protected File f168972d;

        /* renamed from: f */
        private final long f168974f;

        /* renamed from: g */
        private final int f168975g;

        /* renamed from: a */
        public static Thread m261158a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        /* renamed from: b */
        private void m261159b() {
            m261158a(new Thread(new Runnable() {
                /* class com.tt.miniapp.util.ACache.C67011a.RunnableC670121 */

                public void run() {
                    File[] listFiles = C67011a.this.f168972d.listFiles();
                    if (listFiles != null) {
                        int i = 0;
                        int i2 = 0;
                        for (File file : listFiles) {
                            i = (int) (((long) i) + C67011a.this.mo233101b(file));
                            i2++;
                            C67011a.this.f168971c.put(file, Long.valueOf(file.lastModified()));
                        }
                        C67011a.this.f168969a.set((long) i);
                        C67011a.this.f168970b.set(i2);
                    }
                }
            })).start();
        }

        /* renamed from: c */
        private long m261160c() {
            File file;
            if (this.f168971c.isEmpty()) {
                return 0;
            }
            Set<Map.Entry<File, Long>> entrySet = this.f168971c.entrySet();
            synchronized (this.f168971c) {
                file = null;
                Long l = null;
                for (Map.Entry<File, Long> entry : entrySet) {
                    if (file == null) {
                        file = entry.getKey();
                        l = entry.getValue();
                    } else {
                        Long value = entry.getValue();
                        if (value.longValue() < l.longValue()) {
                            file = entry.getKey();
                            l = value;
                        }
                    }
                }
            }
            long b = mo233101b(file);
            if (file.delete()) {
                this.f168971c.remove(file);
            }
            return b;
        }

        /* renamed from: a */
        public void mo233099a() {
            this.f168971c.clear();
            this.f168969a.set(0);
            File[] listFiles = this.f168972d.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
        }

        /* renamed from: b */
        public long mo233101b(File file) {
            return file.length();
        }

        /* renamed from: c */
        public boolean mo233103c(String str) {
            return mo233098a(str).delete();
        }

        /* renamed from: a */
        public File mo233098a(String str) {
            File b = mo233102b(str);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            b.setLastModified(valueOf.longValue());
            this.f168971c.put(b, valueOf);
            return b;
        }

        /* renamed from: b */
        public File mo233102b(String str) {
            File file = this.f168972d;
            return new File(file, str.hashCode() + "");
        }

        /* renamed from: a */
        public void mo233100a(File file) {
            int i = this.f168970b.get();
            while (i + 1 > this.f168975g) {
                this.f168969a.addAndGet(-m261160c());
                i = this.f168970b.addAndGet(-1);
            }
            this.f168970b.addAndGet(1);
            long b = mo233101b(file);
            long j = this.f168969a.get();
            while (j + b > this.f168974f) {
                j = this.f168969a.addAndGet(-m261160c());
            }
            this.f168969a.addAndGet(b);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            file.setLastModified(valueOf.longValue());
            this.f168971c.put(file, valueOf);
        }

        private C67011a(File file, long j, int i) {
            this.f168971c = Collections.synchronizedMap(new HashMap());
            this.f168972d = file;
            this.f168974f = j;
            this.f168975g = i;
            this.f168969a = new AtomicLong();
            this.f168970b = new AtomicInteger();
            m261159b();
        }
    }

    /* renamed from: b */
    private static String m261152b() {
        return "_" + Process.myPid();
    }

    /* renamed from: b */
    public boolean mo233097b(String str) {
        return this.f168968b.mo233103c(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.util.ACache$b */
    public static class C67013b {
        /* renamed from: b */
        public static String m261173b(String str) {
            if (str == null || !m261174b(str.getBytes())) {
                return str;
            }
            return str.substring(str.indexOf(32) + 1, str.length());
        }

        /* renamed from: a */
        public static boolean m261170a(String str) {
            return m261171a(str.getBytes());
        }

        /* renamed from: b */
        private static boolean m261174b(byte[] bArr) {
            if (bArr == null || bArr.length <= 15 || bArr[13] != 45 || m261167a(bArr, ' ') <= 14) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private static String[] m261175c(byte[] bArr) {
            if (!m261174b(bArr)) {
                return null;
            }
            return new String[]{new String(m261172a(bArr, 0, 13)), new String(m261172a(bArr, 14, m261167a(bArr, ' ')))};
        }

        /* renamed from: a */
        private static String m261168a(int i) {
            String str = System.currentTimeMillis() + "";
            while (str.length() < 13) {
                str = "0" + str;
            }
            return str + "-" + i + ' ';
        }

        /* renamed from: a */
        public static boolean m261171a(byte[] bArr) {
            String[] c = m261175c(bArr);
            if (c != null && c.length == 2) {
                String str = c[0];
                while (str.startsWith("0")) {
                    str = str.substring(1, str.length());
                }
                if (System.currentTimeMillis() > Long.valueOf(str).longValue() + (Long.valueOf(c[1]).longValue() * 1000)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private static int m261167a(byte[] bArr, char c) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == c) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public static String m261169a(int i, String str) {
            return m261168a(i) + str;
        }

        /* renamed from: a */
        private static byte[] m261172a(byte[] bArr, int i, int i2) {
            int i3 = i2 - i;
            if (i3 >= 0) {
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
                return bArr2;
            }
            throw new IllegalArgumentException(i + " > " + i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[SYNTHETIC, Splitter:B:33:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b A[SYNTHETIC, Splitter:B:41:0x009b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo233093a(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.util.ACache.mo233093a(java.lang.String):java.lang.String");
    }

    public class CacheException extends Exception {
        public CacheException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static ACache m261150a(Context context, String str) throws CacheException {
        return m261151a(new File(context.getCacheDir(), str), 50000000, Integer.MAX_VALUE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d A[SYNTHETIC, Splitter:B:17:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[SYNTHETIC, Splitter:B:24:0x0040] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo233095a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            com.tt.miniapp.util.ACache$a r0 = r4.f168968b
            java.io.File r5 = r0.mo233102b(r5)
            r0 = 0
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0027 }
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x0027 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0027 }
            r3 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0027 }
            r1.write(r6)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r1.flush()     // Catch:{ IOException -> 0x001d }
            r1.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x0038
        L_0x001d:
            r6 = move-exception
            goto L_0x0035
        L_0x001f:
            r6 = move-exception
            r0 = r1
            goto L_0x003e
        L_0x0022:
            r6 = move-exception
            r0 = r1
            goto L_0x0028
        L_0x0025:
            r6 = move-exception
            goto L_0x003e
        L_0x0027:
            r6 = move-exception
        L_0x0028:
            r6.printStackTrace()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0038
            r0.flush()     // Catch:{ IOException -> 0x0034 }
            r0.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r6 = move-exception
        L_0x0035:
            r6.printStackTrace()
        L_0x0038:
            com.tt.miniapp.util.ACache$a r6 = r4.f168968b
            r6.mo233100a(r5)
            return
        L_0x003e:
            if (r0 == 0) goto L_0x004b
            r0.flush()     // Catch:{ IOException -> 0x0047 }
            r0.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004b:
            com.tt.miniapp.util.ACache$a r0 = r4.f168968b
            r0.mo233100a(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.util.ACache.mo233095a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo233096a(String str, String str2, int i) {
        mo233095a(str, C67013b.m261169a(i, str2));
    }

    private ACache(File file, long j, int i) throws CacheException {
        if (file.exists() || file.mkdirs()) {
            this.f168968b = new C67011a(file, j, i);
            return;
        }
        throw new CacheException("can't make dirs in " + file.getAbsolutePath() + " File eists:" + file.exists() + " File mkdirs:" + file.mkdirs());
    }

    /* renamed from: a */
    public static ACache m261151a(File file, long j, int i) throws CacheException {
        Map<String, ACache> map = f168967a;
        ACache aCache = map.get(file.getAbsoluteFile() + m261152b());
        if (aCache != null) {
            return aCache;
        }
        ACache aCache2 = new ACache(file, j, i);
        Map<String, ACache> map2 = f168967a;
        map2.put(file.getAbsolutePath() + m261152b(), aCache2);
        return aCache2;
    }
}
