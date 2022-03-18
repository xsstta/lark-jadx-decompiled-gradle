package com.bytedance.apm6.p160b.p161a;

import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.p164c.C3176a;
import com.bytedance.apm6.p160b.p161a.p164c.C3178c;
import com.bytedance.apm6.p160b.p161a.p165d.C3193d;
import com.bytedance.apm6.p160b.p161a.p166e.AbstractC3208d;
import com.bytedance.apm6.util.C3352c;
import com.bytedance.apm6.util.C3354d;
import com.bytedance.apm6.util.p194a.C3346a;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import com.bytedance.common.utility.io.IOUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.bytedance.apm6.b.a.c */
public class C3170c implements AbstractC3208d {

    /* renamed from: a */
    public volatile C3178c f10169a;

    /* renamed from: b */
    private volatile long f10170b = 60000;

    /* renamed from: c */
    private volatile long f10171c = 1048576;

    /* renamed from: d */
    private C3346a<C3176a> f10172d = new C3346a<>(10);

    /* renamed from: e */
    private volatile AbstractRunnableC3362a f10173e;

    /* renamed from: f */
    private volatile boolean f10174f = false;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.b.a.c$a */
    public static class C3175a {

        /* renamed from: a */
        public static final C3170c f10179a = new C3170c();
    }

    @Override // com.bytedance.apm6.p160b.p161a.p166e.AbstractC3208d
    /* renamed from: g */
    public String mo13213g() {
        return "first_log_dir";
    }

    /* renamed from: a */
    public static C3170c m13261a() {
        return C3175a.f10179a;
    }

    /* renamed from: c */
    public synchronized void mo13208c() {
        this.f10174f = true;
    }

    /* renamed from: d */
    public synchronized void mo13210d() {
        this.f10174f = false;
    }

    /* renamed from: i */
    private void m13262i() {
        try {
            if (this.f10169a != null) {
                this.f10169a.mo13228a();
            }
        } catch (Throwable th) {
            C3350b.m13935b(C3159a.f10110a, "flushBuffer", th);
        }
    }

    /* renamed from: b */
    public synchronized void mo13206b() {
        this.f10173e = new AbstractRunnableC3362a(0, this.f10170b) {
            /* class com.bytedance.apm6.p160b.p161a.C3170c.C31722 */

            public void run() {
                C3170c.this.mo13211e();
            }
        };
        C3363b.m13999a(AsyncTaskManagerType.IO).mo13585a(this.f10173e);
        if (C3318a.m13827e()) {
            C3363b.m13999a(AsyncTaskManagerType.IO).mo13585a(new AbstractRunnableC3362a(10000) {
                /* class com.bytedance.apm6.p160b.p161a.C3170c.C31733 */

                public void run() {
                    C3170c.this.mo13212f();
                }
            });
        }
    }

    /* renamed from: e */
    public void mo13211e() {
        long currentTimeMillis = System.currentTimeMillis();
        m13262i();
        m13263j();
        if (C3318a.m13827e() && !this.f10174f) {
            m13264k();
        }
        if (C3318a.m13915u()) {
            String str = C3159a.f10110a;
            C3350b.m13932a(str, "LogReporter One Loop Cost:" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.bytedance.apm6.p160b.p161a.p166e.AbstractC3208d
    /* renamed from: h */
    public long mo13214h() {
        String[] b = this.f10169a.mo13230b();
        long j = 0;
        if (!(b == null || b.length == 0)) {
            for (String str : b) {
                j += new File(C3162b.m13180d(), str).length();
            }
        }
        return j;
    }

    /* renamed from: j */
    private void m13263j() {
        if (!this.f10172d.mo13577b()) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (!this.f10172d.mo13577b()) {
                arrayList.add(this.f10172d.mo13574a());
                C3176a a = this.f10172d.mo13574a();
                if (a != null) {
                    int c = a.mo13222c();
                    if (i == 0 || ((long) (i + c)) < this.f10171c) {
                        i += c;
                        arrayList.add(a);
                    } else {
                        C3193d.m13346a().mo13267a(arrayList, 0);
                        arrayList.clear();
                        arrayList.add(a);
                        i = c;
                    }
                }
            }
            C3193d.m13346a().mo13267a(arrayList, 0);
        }
    }

    /* renamed from: k */
    private void m13264k() {
        String[] strArr;
        if (this.f10169a != null) {
            strArr = this.f10169a.mo13230b();
        } else {
            C3350b.m13937d(C3159a.f10110a, "persistentBuffer is null");
            strArr = null;
        }
        if (!(strArr == null || strArr.length == 0)) {
            List asList = Arrays.asList(strArr);
            Collections.sort(asList, new Comparator<String>() {
                /* class com.bytedance.apm6.p160b.p161a.C3170c.C31744 */

                /* renamed from: a */
                public int compare(String str, String str2) {
                    return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
                }
            });
            if (C3318a.m13915u()) {
                String str = C3159a.f10110a;
                C3350b.m13932a(str, "reportFile: parsing " + asList.size() + " files. fileNameList" + asList);
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < asList.size(); i2++) {
                File file = new File(C3162b.m13180d(), (String) asList.get(i2));
                if (file.exists()) {
                    C3176a a = C3176a.m13278a(file);
                    if (a == null) {
                        if (C3318a.m13915u()) {
                            C3350b.m13932a(C3159a.f10110a, "logFile invalid. delete now.");
                        }
                        file.delete();
                    } else {
                        int c = a.mo13222c();
                        if (i == 0 || ((long) (i + c)) < this.f10171c) {
                            i += c;
                            arrayList.add(a);
                        } else {
                            String str2 = C3159a.f10110a;
                            C2921a.m12355a(str2, "sendList:" + asList.toString());
                            C3193d.m13346a().mo13267a(arrayList, asList.size() - arrayList.size());
                            return;
                        }
                    }
                }
            }
            String str3 = C3159a.f10110a;
            C2921a.m12355a(str3, "sendList:" + asList.toString());
            C3193d.m13346a().mo13267a(arrayList, 0);
        }
    }

    /* renamed from: f */
    public void mo13212f() {
        File[] listFiles;
        File e = C3162b.m13181e();
        if (e.exists() && (listFiles = e.listFiles()) != null) {
            for (File file : listFiles) {
                if (file != null && file.exists() && file.length() > 0) {
                    try {
                        if (Long.parseLong(file.getName().split("_")[0]) < C3318a.m13826d()) {
                            FileChannel fileChannel = null;
                            try {
                                fileChannel = new RandomAccessFile(file, "rw").getChannel();
                                FileLock tryLock = fileChannel.tryLock(0, Long.MAX_VALUE, false);
                                if (tryLock == null || !tryLock.isValid()) {
                                    if (C3318a.m13915u()) {
                                        C3350b.m13932a(C3159a.f10110a, "moveInactiveSubProcessData isValid is not true ");
                                    }
                                    C3354d.m13949a(fileChannel);
                                } else {
                                    File file2 = new File(C3162b.m13180d(), C3162b.m13182f());
                                    boolean renameFile = IOUtils.renameFile(file.getAbsolutePath(), file2.getAbsolutePath());
                                    if (C3318a.m13915u()) {
                                        C3350b.m13932a(C3159a.f10110a, "moveInactiveSubProcessData: src:" + file.getAbsolutePath() + " dst:" + file2.getAbsolutePath() + " isSuccess:" + renameFile);
                                    }
                                    tryLock.release();
                                    C3354d.m13949a(fileChannel);
                                }
                            } catch (Throwable th) {
                                C3354d.m13949a(null);
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13205a(C3178c cVar) {
        this.f10169a = cVar;
    }

    /* renamed from: a */
    public void mo13203a(long j) {
        if (j > 0) {
            this.f10171c = j;
        }
    }

    /* renamed from: a */
    private long m13260a(File file) {
        String name = file.getName();
        int indexOf = name.indexOf("_");
        if (indexOf == -1) {
            return -1;
        }
        try {
            return Long.parseLong(name.substring(0, indexOf));
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public void mo13204a(C3176a aVar) {
        if (aVar != null) {
            this.f10172d.mo13576a(aVar);
        }
    }

    @Override // com.bytedance.apm6.p160b.p161a.p166e.AbstractC3208d
    /* renamed from: c */
    public void mo13209c(long j) {
        String[] b;
        if (!(this.f10169a == null || (b = this.f10169a.mo13230b()) == null || b.length == 0)) {
            for (String str : b) {
                File file = new File(C3162b.m13180d(), str);
                long a = m13260a(file);
                if (a == -1) {
                    C3352c.m13947b(file);
                } else if (a <= j) {
                    C3352c.m13947b(file);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo13207b(long j) {
        if (C3318a.m13915u()) {
            String str = C3159a.f10110a;
            C3350b.m13932a(str, "setLoopInterval:" + this.f10170b);
        }
        if (j > 0) {
            if (this.f10170b != j) {
                this.f10170b = j;
                if (this.f10173e != null) {
                    C3363b.m13999a(AsyncTaskManagerType.IO).mo13586b(this.f10173e);
                    this.f10173e = new AbstractRunnableC3362a(this.f10170b, this.f10170b) {
                        /* class com.bytedance.apm6.p160b.p161a.C3170c.C31711 */

                        public void run() {
                            C3170c.this.mo13211e();
                        }
                    };
                    C3363b.m13999a(AsyncTaskManagerType.IO).mo13585a(this.f10173e);
                }
            }
        }
    }
}
