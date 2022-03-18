package com.bytedance.apm6.p167c;

import android.app.Application;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.apm.p138d.AbstractC2918e;
import com.bytedance.apm.util.C3141x;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p167c.p168a.C3214a;
import com.bytedance.apm6.util.C3352c;
import com.bytedance.apm6.util.C3356f;
import com.bytedance.apm6.util.p195b.C3350b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.c.c */
public class C3217c {

    /* renamed from: d */
    private static C3217c f10296d = new C3217c();

    /* renamed from: a */
    public String f10297a;

    /* renamed from: b */
    public String f10298b;

    /* renamed from: c */
    public C3214a f10299c;

    /* renamed from: e */
    private String f10300e;

    /* renamed from: f */
    private String f10301f;

    /* renamed from: g */
    private volatile boolean f10302g;

    /* renamed from: h */
    private List<String> f10303h;

    /* renamed from: i */
    private List<String> f10304i;

    /* renamed from: j */
    private boolean f10305j;

    /* renamed from: k */
    private long f10306k;

    /* renamed from: l */
    private long f10307l;

    /* renamed from: m */
    private long f10308m;

    /* renamed from: n */
    private long f10309n;

    /* renamed from: o */
    private AbstractC2918e f10310o;

    /* renamed from: a */
    public boolean mo13331a(long j) {
        return j < 0 || j > 17179869184L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo13332b(long j) {
        return j >= 104857600 && j <= 17179869184L;
    }

    private C3217c() {
    }

    /* renamed from: a */
    public static C3217c m13449a() {
        return f10296d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3216b mo13328a(C3214a aVar) {
        if (aVar == null || this.f10302g) {
            return null;
        }
        this.f10299c = aVar;
        m13469f();
        this.f10303h = m13462b(aVar.mo13320k());
        this.f10304i = m13462b(aVar.mo13319j());
        return m13460b();
    }

    /* renamed from: a */
    private boolean m13456a(C3219a aVar) {
        for (String str : this.f10303h) {
            if (aVar.f10311a.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo13329a(C3141x<C3220b> xVar) {
        JSONArray jSONArray = new JSONArray();
        for (C3220b bVar : xVar.mo13060a()) {
            JSONObject a = bVar.mo13334a();
            if (a != null) {
                jSONArray.put(a);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private boolean m13457a(File file) {
        if (!C3356f.m13964a(this.f10303h)) {
            return this.f10303h.contains(file.getAbsolutePath());
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.c.c$c */
    public class C3221c {

        /* renamed from: a */
        public String f10322a;

        /* renamed from: b */
        public C3221c f10323b;

        /* renamed from: c */
        public long f10324c;

        /* renamed from: d */
        public int f10325d;

        /* renamed from: e */
        public boolean f10326e;

        /* renamed from: f */
        public long f10327f;

        /* renamed from: h */
        private int f10329h;

        /* renamed from: i */
        private boolean f10330i;

        /* renamed from: a */
        public boolean mo13337a() {
            if (this.f10329h == this.f10325d) {
                return true;
            }
            return false;
        }

        private C3221c() {
        }

        /* renamed from: a */
        public void mo13336a(long j, C3141x<C3220b> xVar, C3141x<C3220b> xVar2) {
            this.f10324c += j;
            this.f10329h++;
            if (this.f10323b != null && mo13337a()) {
                if (this.f10330i) {
                    this.f10323b.f10330i = true;
                }
                if (this.f10324c >= C3217c.this.f10299c.mo13311d() && !this.f10330i) {
                    if (!C3217c.this.mo13331a(this.f10324c)) {
                        xVar2.mo13061a(new C3220b(this.f10322a, this.f10324c, this.f10325d));
                    }
                    this.f10323b.f10330i = true;
                }
                this.f10323b.mo13336a(this.f10324c, xVar, xVar2);
                if (this.f10326e && C3217c.this.mo13332b(this.f10324c)) {
                    C3217c cVar = C3217c.this;
                    String str = this.f10322a;
                    long j2 = this.f10324c;
                    int i = this.f10325d;
                    xVar.mo13061a(new C3222d(str, j2, i, (long) i));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.c.c$a */
    public class C3219a {

        /* renamed from: a */
        public String f10311a;

        /* renamed from: b */
        public long f10312b;

        /* renamed from: c */
        public float f10313c;

        /* renamed from: d */
        public boolean f10314d;

        /* renamed from: e */
        public String f10315e;

        /* renamed from: f */
        public List<C3219a> f10316f;

        /* renamed from: b */
        private String m13475b() {
            String str = this.f10311a;
            if (str.contains(C3217c.this.f10297a)) {
                return str.replace(C3217c.this.f10297a, "internal");
            }
            if (str.contains(C3217c.this.f10298b)) {
                return str.replace(C3217c.this.f10298b, "external");
            }
            return str;
        }

        /* renamed from: a */
        public JSONObject mo13333a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("path", m13475b());
                jSONObject.put("size", this.f10312b);
                jSONObject.put("size_rate", (double) this.f10313c);
                jSONObject.put("is_folder", this.f10314d);
                jSONObject.put("report_type", this.f10315e);
                if (!this.f10316f.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (C3219a aVar : this.f10316f) {
                        jSONArray.put(aVar.mo13333a());
                    }
                    jSONObject.put("next_disk", jSONArray);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        private C3219a() {
            this.f10315e = "normal";
            this.f10316f = new ArrayList();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.c.c$b */
    public class C3220b implements Comparable {

        /* renamed from: a */
        public String f10318a;

        /* renamed from: b */
        public long f10319b;

        /* renamed from: d */
        private int f10321d;

        /* renamed from: b */
        private String m13477b() {
            String str = this.f10318a;
            if (str.contains(C3217c.this.f10297a)) {
                return str.replace(C3217c.this.f10297a, "internal");
            }
            if (str.contains(C3217c.this.f10298b)) {
                return str.replace(C3217c.this.f10298b, "external");
            }
            return str;
        }

        /* renamed from: a */
        public JSONObject mo13334a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", m13477b());
                jSONObject.put("size", this.f10319b);
                int i = this.f10321d;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public C3220b() {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.f10319b;
            long j2 = ((C3220b) obj).f10319b;
            if (j == j2) {
                return 0;
            }
            if (j > j2) {
                return 1;
            }
            return -1;
        }

        public C3220b(String str, long j, int i) {
            this.f10318a = str;
            this.f10319b = j;
            this.f10321d = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.c.c$d */
    public class C3222d extends C3220b {

        /* renamed from: d */
        public long f10331d;

        /* renamed from: f */
        private final String f10333f;

        /* renamed from: g */
        private int f10334g;

        /* renamed from: h */
        private long f10335h;

        /* renamed from: b */
        private String m13481b() {
            String str = this.f10333f;
            if (str.contains(C3217c.this.f10297a)) {
                return str.replace(C3217c.this.f10297a, "internal");
            }
            if (str.contains(C3217c.this.f10298b)) {
                return str.replace(C3217c.this.f10298b, "external");
            }
            return str;
        }

        @Override // com.bytedance.apm6.p167c.C3217c.C3220b
        /* renamed from: a */
        public JSONObject mo13334a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", m13481b());
                jSONObject.put("size", this.f10331d);
                int i = this.f10334g;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                jSONObject.put("outdate_interval", this.f10335h);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.apm6.p167c.C3217c.C3220b, java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.f10335h;
            long j2 = ((C3222d) obj).f10335h;
            if (j == j2) {
                return 0;
            }
            if (j > j2) {
                return 1;
            }
            return -1;
        }

        public C3222d(String str, long j, int i, long j2) {
            super();
            this.f10333f = str;
            this.f10331d = j;
            this.f10334g = i;
            this.f10335h = j2;
        }
    }

    /* renamed from: e */
    private long m13468e() {
        long j = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            for (File file : C3318a.m13917w().getApplicationContext().getExternalMediaDirs()) {
                j += m13458b(file);
            }
        }
        return j;
    }

    /* renamed from: f */
    private void m13469f() {
        if (!this.f10305j) {
            this.f10305j = true;
            Application w = C3318a.m13917w();
            try {
                w.getPackageName();
                this.f10297a = w.getFilesDir().getParent();
                this.f10300e = w.getCacheDir().getAbsolutePath();
                this.f10298b = m13450a(w);
                File externalCacheDir = w.getExternalCacheDir();
                if (externalCacheDir != null) {
                    this.f10301f = externalCacheDir.getAbsolutePath();
                }
            } catch (Exception unused) {
                this.f10302g = true;
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x008e A[Catch:{ Exception -> 0x00b7 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m13467d() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.p167c.C3217c.m13467d():long");
    }

    /* renamed from: b */
    private C3216b m13460b() {
        ArrayList arrayList = new ArrayList();
        m13454a(new File(this.f10297a), arrayList);
        m13454a(new File(this.f10298b), arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (C3219a aVar : arrayList) {
            boolean z = true;
            Iterator<C3219a> it = aVar.f10316f.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f10314d) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                arrayList2.remove(aVar);
            }
        }
        arrayList.removeAll(arrayList2);
        if (C3318a.m13915u()) {
            Iterator<C3219a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C3350b.m13932a("APM-Disk", "diskInfoNodes:" + it2.next().mo13333a());
            }
        }
        C3141x<C3220b> xVar = new C3141x<>(this.f10299c.mo13316g());
        C3141x<C3220b> xVar2 = new C3141x<>(this.f10299c.mo13317h());
        C3141x<C3220b> xVar3 = new C3141x<>(this.f10299c.mo13315f());
        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add(this.f10297a);
        arrayList3.add(this.f10300e);
        m13455a(m13452a(this.f10297a, xVar, xVar2, xVar3, arrayList3));
        arrayList3.clear();
        arrayList3.add(this.f10301f);
        arrayList3.add(this.f10298b);
        m13455a(m13452a(this.f10298b, xVar, xVar2, xVar3, arrayList3));
        if (C3318a.m13915u()) {
            Iterator<C3220b> it3 = xVar.mo13060a().iterator();
            while (it3.hasNext()) {
                C3350b.m13932a("APM-Disk", "fileListTopK:" + it3.next().mo13334a());
            }
            Iterator<C3220b> it4 = xVar2.mo13060a().iterator();
            while (it4.hasNext()) {
                C3350b.m13932a("APM-Disk", "dirListTopK:" + it4.next().mo13334a());
            }
            Iterator<C3220b> it5 = xVar3.mo13060a().iterator();
            while (it5.hasNext()) {
                C3350b.m13932a("APM-Disk", "outdatedListTopK:" + it5.next().mo13334a());
            }
            C3350b.m13932a("APM-Disk", "insideDataSize:" + this.f10306k + " outsideDataSize:" + this.f10307l + " insideCacheSize:" + this.f10308m + " outsideCacheSize:" + this.f10309n);
        }
        m13466c(arrayList);
        return m13448a(xVar, xVar2, xVar3, arrayList);
    }

    /* renamed from: c */
    private Pair<Long, Long> m13464c() {
        UUID uuid;
        try {
            long j = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                StorageStatsManager storageStatsManager = (StorageStatsManager) C3318a.m13917w().getSystemService("storagestats");
                StorageManager storageManager = (StorageManager) C3318a.m13917w().getSystemService("storage");
                long j2 = 0;
                for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                    String uuid2 = storageVolume.getUuid();
                    if (uuid2 == null) {
                        uuid = StorageManager.UUID_DEFAULT;
                    } else {
                        uuid = UUID.fromString(uuid2);
                    }
                    j += storageStatsManager.getTotalBytes(uuid);
                    j2 += storageManager.getAllocatableBytes(uuid);
                }
                return new Pair<>(Long.valueOf(((j / 1000) / 1000) * 1024 * 1024), Long.valueOf(((j2 / 1000) / 1000) * 1024 * 1024));
            } else if (Build.VERSION.SDK_INT >= 24) {
                List<StorageVolume> storageVolumes = ((StorageManager) C3318a.m13917w().getSystemService("storage")).getStorageVolumes();
                if (C3356f.m13964a(storageVolumes)) {
                    return null;
                }
                long j3 = 0;
                for (StorageVolume storageVolume2 : storageVolumes) {
                    File file = (File) m13451a(storageVolume2.getClass(), "getPathFile", new Class[0]).invoke(storageVolume2, new Object[0]);
                    j += file.getTotalSpace();
                    j3 += file.getFreeSpace();
                }
                return new Pair<>(Long.valueOf(((j / 1000) / 1000) * 1024 * 1024), Long.valueOf(((j3 / 1000) / 1000) * 1024 * 1024));
            } else {
                StorageManager storageManager2 = (StorageManager) C3318a.m13917w().getSystemService("storage");
                long j4 = 0;
                for (Object obj : (List) m13451a(storageManager2.getClass(), "getVolumes", new Class[0]).invoke(storageManager2, new Object[0])) {
                    File file2 = (File) m13451a(obj.getClass(), "getPathFile", new Class[0]).invoke(obj, new Object[0]);
                    j4 += file2.getFreeSpace();
                    j += file2.getFreeSpace();
                }
                return new Pair<>(Long.valueOf(j), Long.valueOf(j4));
            }
        } catch (Throwable unused) {
            return new Pair<>(Long.valueOf(C3352c.m13946b(Environment.getDataDirectory().getPath()) + C3352c.m13946b(Environment.getRootDirectory().getPath())), Long.valueOf(C3352c.m13944a(Environment.getDataDirectory().getPath())));
        }
    }

    /* renamed from: a */
    public void mo13330a(AbstractC2918e eVar) {
        this.f10310o = eVar;
    }

    /* renamed from: a */
    private String m13450a(Context context) {
        try {
            return context.getExternalFilesDir(null).getParentFile().getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private long m13463c(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < this.f10299c.mo13318i() || currentTimeMillis >= 62899200000L) {
            return 0;
        }
        return currentTimeMillis;
    }

    /* renamed from: b */
    private long m13458b(File file) {
        long j;
        long j2 = 0;
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            j = m13458b(file2);
                        } else {
                            j = file2.length();
                        }
                        j2 += j;
                    }
                    return j2;
                }
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private void m13466c(List<C3219a> list) {
        if (!C3356f.m13964a(this.f10304i)) {
            for (String str : this.f10304i) {
                m13465c(new File(str), list);
            }
        }
    }

    /* renamed from: b */
    private static List<String> m13461b(C3141x<? extends C3220b> xVar) {
        if (xVar == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (C3220b bVar : xVar.mo13060a()) {
            linkedList.add(bVar.f10318a);
        }
        return linkedList;
    }

    /* renamed from: b */
    private List<String> m13462b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (C3356f.m13964a(list)) {
            return arrayList;
        }
        for (String str : list) {
            if (str.contains("internal")) {
                arrayList.add(str.replace("internal", this.f10297a));
            } else if (str.contains("external")) {
                arrayList.add(str.replace("external", this.f10298b));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m13455a(List<C3221c> list) {
        if (!C3356f.m13964a(list)) {
            for (C3221c cVar : list) {
                if (TextUtils.equals(cVar.f10322a, this.f10297a)) {
                    this.f10306k = cVar.f10324c;
                } else if (TextUtils.equals(cVar.f10322a, this.f10298b)) {
                    this.f10307l = cVar.f10324c;
                } else if (TextUtils.equals(cVar.f10322a, this.f10300e)) {
                    this.f10308m = cVar.f10324c;
                } else if (TextUtils.equals(cVar.f10322a, this.f10301f)) {
                    this.f10309n = cVar.f10324c;
                }
            }
        }
    }

    /* renamed from: a */
    private float m13447a(long j, BigDecimal bigDecimal) {
        return (float) new BigDecimal(j).divide(bigDecimal, 4, 4).doubleValue();
    }

    /* renamed from: a */
    private JSONArray m13453a(List<C3219a> list, long j) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        BigDecimal bigDecimal = new BigDecimal(j);
        JSONArray jSONArray = new JSONArray();
        for (C3219a aVar : list) {
            if (m13456a(aVar)) {
                aVar.f10313c = BitmapDescriptorFactory.HUE_RED;
            } else {
                aVar.f10313c = m13447a(aVar.f10312b, bigDecimal);
            }
            List<C3219a> list2 = aVar.f10316f;
            if (list2 != null && list2.size() > 0) {
                for (C3219a aVar2 : list2) {
                    if (m13456a(aVar2)) {
                        aVar2.f10313c = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        aVar2.f10313c = m13447a(aVar2.f10312b, bigDecimal);
                    }
                }
            }
            jSONArray.put(aVar.mo13333a());
        }
        return jSONArray;
    }

    /* renamed from: b */
    private long m13459b(File file, List<C3219a> list) {
        long j = 0;
        if (file != null && file.exists() && !m13457a(file)) {
            if (file.isFile()) {
                long length = file.length();
                if (length < this.f10299c.mo13314e()) {
                    return length;
                }
                C3219a aVar = new C3219a();
                aVar.f10314d = false;
                aVar.f10311a = file.getAbsolutePath();
                aVar.f10312b = length;
                list.add(aVar);
                return length;
            }
            File[] listFiles = file.listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                C3219a aVar2 = new C3219a();
                aVar2.f10314d = file.isDirectory();
                aVar2.f10311a = file.getAbsolutePath();
                ArrayList arrayList = new ArrayList();
                aVar2.f10316f = arrayList;
                list.add(aVar2);
                for (File file2 : listFiles) {
                    if (file2 != null && file2.exists() && !m13457a(file2)) {
                        j += m13459b(file2, arrayList);
                    }
                }
                aVar2.f10312b = j;
            }
        }
        return j;
    }

    /* renamed from: c */
    private void m13465c(File file, List<C3219a> list) {
        if (file != null && file.exists() && !m13457a(file)) {
            if (file.isFile()) {
                long length = file.length();
                C3219a aVar = new C3219a();
                aVar.f10314d = false;
                aVar.f10311a = file.getAbsolutePath();
                aVar.f10312b = length;
                aVar.f10315e = "custom";
                list.add(aVar);
                return;
            }
            C3219a aVar2 = new C3219a();
            aVar2.f10314d = true;
            aVar2.f10315e = "custom";
            aVar2.f10311a = file.getAbsolutePath();
            aVar2.f10312b = m13458b(file);
            list.add(aVar2);
        }
    }

    /* renamed from: a */
    private void m13454a(File file, List<C3219a> list) {
        File[] listFiles = file.listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                m13459b(file2, list);
            }
        }
    }

    /* renamed from: a */
    private static Method m13451a(Class cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C3216b m13448a(C3141x<C3220b> xVar, C3141x<C3220b> xVar2, C3141x<C3220b> xVar3, List<C3219a> list) {
        long j;
        try {
            long j2 = this.f10306k + this.f10307l;
            long j3 = this.f10308m + this.f10309n;
            long totalSpace = Environment.getDataDirectory().getTotalSpace() + Environment.getRootDirectory().getTotalSpace();
            long freeSpace = Environment.getDataDirectory().getFreeSpace();
            if (j2 > 17179869184L) {
                j = 17179869184L;
            } else {
                j = j2;
            }
            if (j3 > 17179869184L) {
                j3 = 17179869184L;
            }
            if (j < 0) {
                return null;
            }
            if (this.f10310o != null) {
                this.f10310o.mo12601a(this.f10299c.mo13308c(), j, m13461b(xVar), m13461b(xVar2), m13461b(xVar3));
            }
            Pair<Long, Long> c = m13464c();
            long d = m13467d();
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Disk", "appUsage:" + d);
            }
            return new C3216b(j2, j3, totalSpace, freeSpace, d, ((Long) c.first).longValue(), ((Long) c.second).longValue(), (double) m13447a(d, new BigDecimal(totalSpace)), mo13329a(xVar), mo13329a(xVar2), mo13329a(xVar3), m13453a(list, j));
        } catch (Throwable th) {
            Log.e("APM-Disk", "error", th);
            return null;
        }
    }

    /* renamed from: a */
    private List<C3221c> m13452a(String str, C3141x<C3220b> xVar, C3141x<C3220b> xVar2, C3141x<C3220b> xVar3, List<String> list) {
        int i;
        LinkedList linkedList;
        int i2;
        File file;
        long j;
        String str2;
        ArrayList arrayList = new ArrayList();
        File file2 = new File(str);
        C3221c cVar = new C3221c();
        cVar.f10322a = str;
        cVar.f10323b = new C3221c();
        File[] listFiles = file2.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        if (list.contains(file2.getAbsolutePath())) {
            arrayList.add(cVar);
            list.remove(file2.getAbsolutePath());
        }
        cVar.f10325d = listFiles.length;
        LinkedList linkedList2 = new LinkedList();
        linkedList2.offer(cVar);
        while (!linkedList2.isEmpty()) {
            int size = linkedList2.size();
            int i3 = 0;
            while (i3 < size) {
                C3221c cVar2 = (C3221c) linkedList2.poll();
                if (cVar2 == null) {
                    linkedList = linkedList2;
                } else {
                    String str3 = cVar2.f10322a;
                    File file3 = new File(str3);
                    if (!file3.exists() || m13457a(file3)) {
                        linkedList = linkedList2;
                        i = i3;
                        cVar2.f10323b.f10325d--;
                        i3 = i + 1;
                        linkedList2 = linkedList;
                    } else {
                        LinkedList linkedList3 = linkedList2;
                        if (file3.isFile()) {
                            long length = file3.length();
                            if (!mo13331a(length)) {
                                j = length;
                                file = file3;
                                str2 = str3;
                                xVar.mo13061a(new C3220b(str3, j, 1));
                            } else {
                                j = length;
                                file = file3;
                                str2 = str3;
                            }
                            if (cVar2.f10323b == null) {
                                linkedList = linkedList3;
                            } else {
                                cVar2.f10323b.mo13336a(j, xVar3, xVar2);
                                if (!cVar2.f10323b.f10326e) {
                                    long c = m13463c(file.lastModified());
                                    if (c > 0 && mo13332b(j)) {
                                        i = i3;
                                        xVar3.mo13061a(new C3222d(str2, (long) size, 0, c));
                                    }
                                }
                                i = i3;
                            }
                        } else {
                            i = i3;
                            if (list.contains(file3.getAbsolutePath())) {
                                arrayList.add(cVar2);
                                list.remove(file3.getAbsolutePath());
                            }
                            File[] listFiles2 = file3.listFiles();
                            if (listFiles2 == null || listFiles2.length == 0) {
                                linkedList = linkedList3;
                                cVar2.f10323b.mo13336a(0, xVar3, xVar2);
                                i3 = i + 1;
                                linkedList2 = linkedList;
                            } else {
                                cVar2.f10325d = listFiles2.length;
                                int length2 = listFiles2.length;
                                int i4 = 0;
                                while (i4 < length2) {
                                    File file4 = listFiles2[i4];
                                    C3221c cVar3 = new C3221c();
                                    cVar3.f10323b = cVar2;
                                    cVar3.f10322a = file4.getAbsolutePath();
                                    if (!file4.isDirectory() || cVar2.f10326e) {
                                        i2 = length2;
                                    } else {
                                        i2 = length2;
                                        long c2 = m13463c(file4.lastModified());
                                        if (c2 > 0) {
                                            cVar3.f10326e = true;
                                            cVar3.f10327f = c2;
                                        }
                                    }
                                    linkedList3.offer(cVar3);
                                    i4++;
                                    linkedList3 = linkedList3;
                                    length2 = i2;
                                }
                            }
                        }
                        linkedList = linkedList3;
                        i3 = i + 1;
                        linkedList2 = linkedList;
                    }
                }
                i = i3;
                i3 = i + 1;
                linkedList2 = linkedList;
            }
        }
        return arrayList;
    }
}
