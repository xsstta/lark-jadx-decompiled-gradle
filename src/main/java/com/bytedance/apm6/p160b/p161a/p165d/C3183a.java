package com.bytedance.apm6.p160b.p161a.p165d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.p160b.p161a.C3162b;
import com.bytedance.apm6.util.C3352c;
import com.bytedance.apm6.util.C3354d;
import com.bytedance.apm6.util.C3356f;
import com.bytedance.apm6.util.p195b.C3350b;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.apm6.b.a.d.a */
public class C3183a {

    /* renamed from: a */
    private SharedPreferences f10195a;

    /* renamed from: b */
    private volatile boolean f10196b;

    /* renamed from: c */
    private File f10197c;

    /* renamed from: d */
    private ConcurrentHashMap<String, C3186b> f10198d;

    /* renamed from: e */
    private long f10199e;

    /* renamed from: f */
    private volatile boolean f10200f;

    /* renamed from: g */
    private ArrayList<String> f10201g;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.b.a.d.a$a */
    public static class C3185a {

        /* renamed from: a */
        public static C3183a f10203a = new C3183a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm6.b.a.d.a$b */
    public static class C3186b {

        /* renamed from: a */
        public int f10204a;

        /* renamed from: b */
        public long f10205b;

        /* renamed from: a */
        public int mo13242a() {
            return this.f10204a;
        }

        /* renamed from: b */
        public String mo13244b() {
            return this.f10204a + "_" + this.f10205b;
        }

        /* renamed from: a */
        public static C3186b m13316a(String str) {
            try {
                String[] split = str.split("_");
                return new C3186b(Integer.parseInt(split[0]), Long.parseLong(split[1]));
            } catch (Exception unused) {
                return null;
            }
        }

        public C3186b(int i, long j) {
            this.f10204a = i;
            this.f10205b = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo13243a(int i, long j) {
            this.f10204a = i;
            this.f10205b = j;
        }
    }

    /* renamed from: a */
    static C3183a m13303a() {
        return C3185a.f10203a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public File mo13238b() {
        m13306d();
        return this.f10197c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public File[] mo13239c() {
        m13306d();
        File file = this.f10197c;
        if (file == null) {
            return null;
        }
        return file.listFiles();
    }

    private C3183a() {
        this.f10198d = new ConcurrentHashMap<>();
        this.f10199e = 0;
        this.f10200f = false;
        this.f10201g = new ArrayList<>();
    }

    /* renamed from: d */
    private synchronized void m13306d() {
        if (!this.f10196b) {
            File file = new File(C3162b.m13177a(), "log");
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f10197c = file;
            this.f10195a = C3318a.m13917w().getSharedPreferences("log_report_message", 0);
            this.f10196b = true;
        }
    }

    /* renamed from: e */
    private synchronized void m13307e() {
        int i = 0;
        if (!this.f10200f) {
            String[] list = m13303a().mo13238b().list();
            int length = list.length;
            while (i < length) {
                String str = list[i];
                if (!this.f10201g.contains(str)) {
                    m13304b(str);
                }
                i++;
            }
            this.f10200f = true;
        } else if (this.f10199e > 0 && this.f10201g.size() == 0) {
            String[] list2 = m13303a().mo13238b().list();
            int length2 = list2.length;
            while (i < length2) {
                String str2 = list2[i];
                if (!this.f10201g.contains(str2)) {
                    m13304b(str2);
                }
                i++;
            }
            this.f10199e -= (long) this.f10201g.size();
        }
    }

    /* renamed from: b */
    private void m13304b(String str) {
        if (((long) this.f10201g.size()) > 5000) {
            this.f10199e++;
        } else {
            this.f10201g.add(str);
        }
    }

    /* renamed from: c */
    static long m13305c(File file) {
        try {
            String[] split = file.getName().split("_");
            if (split.length != 2) {
                return -1;
            }
            return Long.parseLong(split[0]);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo13234a(File file) {
        if (file != null) {
            this.f10201g.remove(file.getName());
            m13306d();
            C3352c.m13947b(file);
            this.f10198d.remove(file.getName());
            SharedPreferences.Editor edit = this.f10195a.edit();
            edit.remove(file.getName());
            edit.commit();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3186b mo13237b(File file) {
        C3186b bVar = null;
        if (file == null) {
            return null;
        }
        m13306d();
        String name = file.getName();
        if (this.f10198d.containsKey(name)) {
            return this.f10198d.get(name);
        }
        if (this.f10195a.contains(name)) {
            String string = this.f10195a.getString(name, "");
            if (!TextUtils.isEmpty(string)) {
                bVar = C3186b.m13316a(string);
            }
            if (bVar != null) {
                this.f10198d.put(name, bVar);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized File mo13233a(String str) {
        File file;
        String str2 = "." + str;
        m13307e();
        if (C3318a.m13915u()) {
            C3350b.m13932a(C3159a.f10110a, "failedFiles:" + this.f10201g + " " + str2);
        }
        File file2 = null;
        if (this.f10201g.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f10201g.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.endsWith(str2)) {
                arrayList.add(next);
            }
        }
        if (C3356f.m13964a(arrayList)) {
            return null;
        }
        Collections.sort(arrayList, new Comparator<String>() {
            /* class com.bytedance.apm6.p160b.p161a.p165d.C3183a.C31841 */

            /* renamed from: a */
            public int compare(String str, String str2) {
                return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
            }
        });
        Iterator it2 = arrayList.iterator();
        C3186b bVar = null;
        while (true) {
            if (it2.hasNext()) {
                file = new File(m13303a().mo13238b(), (String) it2.next());
                C3186b b = mo13237b(file);
                if (b == null) {
                    break;
                }
                if (C3318a.m13915u()) {
                    C3350b.m13932a(C3159a.f10110a, "list send file:" + file.getName() + " " + b.f10204a + " " + b.f10205b + " " + System.currentTimeMillis());
                }
                if (b.f10204a == 0 || b.f10205b < System.currentTimeMillis()) {
                    break;
                } else if (bVar == null || bVar.f10205b > b.f10205b) {
                    bVar = b;
                    file2 = file;
                }
            } else {
                break;
            }
        }
        file2 = file;
        return file2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13235a(File file, int i, long j) {
        C3186b bVar;
        if (file != null) {
            try {
                m13306d();
                SharedPreferences.Editor edit = this.f10195a.edit();
                String name = file.getName();
                if (this.f10198d.containsKey(name)) {
                    bVar = this.f10198d.get(name);
                } else {
                    bVar = new C3186b(i, j);
                    this.f10198d.put(name, bVar);
                }
                bVar.mo13243a(i, j);
                edit.putString(name, bVar.mo13244b());
                edit.commit();
            } catch (Throwable th) {
                C3350b.m13935b(C3159a.f10110a, "updateRetryMessage", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo13236a(byte[] bArr, String str, int i, long j) {
        m13306d();
        if (this.f10197c == null) {
            return false;
        }
        String format = String.format("%d%s%s%s%s", Long.valueOf(System.currentTimeMillis()), "_", UUID.randomUUID().toString(), ".", str);
        File file = new File(this.f10197c, format);
        FileChannel fileChannel = null;
        try {
            mo13235a(file, i, j);
            fileChannel = new FileOutputStream(file).getChannel();
            fileChannel.write(ByteBuffer.wrap(bArr));
            if (!this.f10201g.contains(format)) {
                m13304b(format);
            }
            if (C3318a.m13915u()) {
                String str2 = C3159a.f10110a;
                C3350b.m13932a(str2, "saveFile:" + file.getName());
            }
            return true;
        } catch (Throwable th) {
            C3350b.m13935b(C3159a.f10110a, "saveFile", th);
            return false;
        } finally {
            C3354d.m13949a(fileChannel);
        }
    }
}
