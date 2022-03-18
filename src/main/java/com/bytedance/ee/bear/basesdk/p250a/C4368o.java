package com.bytedance.ee.bear.basesdk.p250a;

import android.content.Context;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.log.C13479a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.basesdk.a.o */
public class C4368o {

    /* renamed from: a */
    private static final AtomicBoolean f12995a = new AtomicBoolean(false);

    /* renamed from: b */
    private static String f12996b = "";

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.basesdk.a.o$a */
    public static class C4370a {

        /* renamed from: a */
        public RandomAccessFile f12997a;

        /* renamed from: b */
        public FileLock f12998b;

        /* renamed from: c */
        public File f12999c;

        private C4370a() {
        }

        /* renamed from: a */
        public C4370a mo17014a(File file) throws IOException {
            this.f12999c = file;
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f12997a = randomAccessFile;
            this.f12998b = randomAccessFile.getChannel().tryLock();
            return this;
        }
    }

    /* renamed from: b */
    private static C4370a m18015b() throws IOException {
        return m18011a(false);
    }

    /* renamed from: c */
    private static String m18016c() {
        C13479a.m54764b("ServiceFileUtils", "getNewFileName");
        return f12996b + File.separator + "service_report_" + System.currentTimeMillis() + ".txt";
    }

    /* renamed from: a */
    static synchronized List<Map> m18012a() {
        synchronized (C4368o.class) {
            ArrayList arrayList = new ArrayList();
            try {
                StringBuilder sb = new StringBuilder();
                char c = 1;
                C4370a a = m18011a(true);
                RandomAccessFile randomAccessFile = a.f12997a;
                FileLock fileLock = a.f12998b;
                if (randomAccessFile != null) {
                    if (fileLock != null) {
                        if (fileLock.isValid()) {
                            byte[] bArr = new byte[10240];
                            while (true) {
                                int read = randomAccessFile.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                sb.append(new String(bArr, 0, read));
                            }
                            String[] split = sb.toString().split("ServiceFileUtils\nServiceFileUtils");
                            int length = split.length;
                            int i = 0;
                            while (i < length) {
                                String str = split[i];
                                HashMap hashMap = new HashMap();
                                String[] split2 = str.split("__key,value__");
                                int length2 = split2.length;
                                int i2 = 0;
                                while (i2 < length2) {
                                    String str2 = split2[i2];
                                    String[] split3 = str2.split("_ServiceFileUtils_");
                                    try {
                                        hashMap.put(split3[0], split3[c]);
                                    } catch (Exception unused) {
                                        C13479a.m54758a("ServiceFileUtils", "key value:" + str2);
                                    }
                                    i2++;
                                    split = split;
                                    c = 1;
                                }
                                arrayList.add(hashMap);
                                i++;
                                split = split;
                                c = 1;
                            }
                        }
                        fileLock.close();
                        randomAccessFile.getChannel().close();
                        randomAccessFile.close();
                        boolean delete = a.f12999c.delete();
                        C13479a.m54764b("ServiceFileUtils", "name:" + a.f12999c.getName() + " del:" + delete);
                        return arrayList;
                    }
                }
                C13479a.m54758a("ServiceFileUtils", "open error " + randomAccessFile + "  " + fileLock);
                return arrayList;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static C4370a m18011a(boolean z) throws IOException {
        try {
            File file = new File(f12996b);
            file.mkdirs();
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.length() < 102400 || z) {
                    try {
                        C4370a aVar = new C4370a();
                        aVar.mo17014a(file2);
                        if (aVar.f12998b != null) {
                            return aVar;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        C4370a aVar2 = new C4370a();
        if (z) {
            return aVar2;
        }
        return aVar2.mo17014a(new File(m18016c()));
    }

    /* renamed from: a */
    static void m18013a(Context context) {
        AtomicBoolean atomicBoolean = f12995a;
        if (!atomicBoolean.get()) {
            atomicBoolean.compareAndSet(false, true);
            C13479a.m54764b("ServiceFileUtils", "init ServiceFileUtils");
            try {
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    f12996b = externalFilesDir.getPath() + "/service";
                }
            } catch (Exception unused) {
                C13479a.m54758a("ServiceFileUtils", "can't found sdcard path");
                try {
                    File file = new File(CCMStorage.m21714b(context, Biz.DOCS));
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    f12996b = file.getPath() + "/service";
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m18014a(Map map) {
        synchronized (C4368o.class) {
            try {
                StringBuilder sb = new StringBuilder();
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    sb.append((String) entry.getKey());
                    sb.append("_ServiceFileUtils_");
                    sb.append(entry.getValue());
                    if (it.hasNext()) {
                        sb.append("__key,value__");
                    }
                }
                sb.append("ServiceFileUtils\nServiceFileUtils");
                C4370a b = m18015b();
                RandomAccessFile randomAccessFile = b.f12997a;
                FileLock fileLock = b.f12998b;
                if (fileLock.isValid()) {
                    randomAccessFile.seek(randomAccessFile.length());
                    randomAccessFile.write(sb.toString().getBytes());
                }
                fileLock.close();
                randomAccessFile.getChannel().close();
                randomAccessFile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }
}
