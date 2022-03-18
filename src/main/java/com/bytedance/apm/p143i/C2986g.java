package com.bytedance.apm.p143i;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.internal.C3010b;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p138d.AbstractC2918e;
import com.bytedance.apm.p139e.C2922b;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3112b;
import com.bytedance.apm.util.C3131o;
import com.bytedance.apm.util.C3141x;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.i.g */
public class C2986g extends AbstractC2946a {

    /* renamed from: d */
    public static String f9593d = null;

    /* renamed from: f */
    public static String f9594f = null;

    /* renamed from: r */
    private static long f9595r = 17179869184L;

    /* renamed from: A */
    private C3141x<C2991d> f9596A;

    /* renamed from: a */
    public long f9597a = 524288000;

    /* renamed from: b */
    public long f9598b = 524288000;

    /* renamed from: c */
    public AbstractC2918e f9599c;

    /* renamed from: e */
    public String f9600e;

    /* renamed from: g */
    public String f9601g;

    /* renamed from: h */
    public long f9602h;

    /* renamed from: i */
    public long f9603i;

    /* renamed from: j */
    public long f9604j;

    /* renamed from: m */
    public long f9605m;

    /* renamed from: n */
    private boolean f9606n;

    /* renamed from: o */
    private boolean f9607o;

    /* renamed from: p */
    private int f9608p = 20;

    /* renamed from: q */
    private long f9609q = 2592000000L;

    /* renamed from: s */
    private boolean f9610s;

    /* renamed from: t */
    private List<C2988a> f9611t;

    /* renamed from: u */
    private List<String> f9612u = new ArrayList();

    /* renamed from: v */
    private List<String> f9613v = new ArrayList();

    /* renamed from: w */
    private List<String> f9614w = new ArrayList();

    /* renamed from: x */
    private List<String> f9615x = new ArrayList();

    /* renamed from: y */
    private C3141x<C2989b> f9616y;

    /* renamed from: z */
    private C3141x<C2989b> f9617z;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: c */
    public boolean mo12101c() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: d */
    public long mo12102d() {
        return 120000;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.i.g$b */
    public static class C2989b implements Comparable {

        /* renamed from: a */
        public String f9629a;

        /* renamed from: b */
        public long f9630b;

        /* renamed from: c */
        private int f9631c;

        public C2989b() {
        }

        /* renamed from: b */
        private String m12570b() {
            String str = this.f9629a;
            if (str.contains(C2986g.f9593d)) {
                return str.replace(C2986g.f9593d, "internal");
            }
            if (str.contains(C2986g.f9594f)) {
                return str.replace(C2986g.f9594f, "external");
            }
            return str;
        }

        /* renamed from: a */
        public JSONObject mo12739a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", m12570b());
                jSONObject.put("size", this.f9630b);
                int i = this.f9631c;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.f9630b;
            long j2 = ((C2989b) obj).f9630b;
            if (j == j2) {
                return 0;
            }
            if (j > j2) {
                return 1;
            }
            return -1;
        }

        public C2989b(String str, long j, int i) {
            this.f9629a = str;
            this.f9630b = j;
            this.f9631c = i;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: a */
    public void mo12099a(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("dump_switch", true);
        this.f9607o = optBoolean;
        if (optBoolean) {
            long currentTimeMillis = System.currentTimeMillis() - C3010b.m12651a().mo12824c("check_disk_last_time");
            if (currentTimeMillis < 86400000 && currentTimeMillis > 0) {
                this.f9606n = true;
            }
            if (jSONObject.optInt("dump_threshold") > 0) {
                this.f9597a = ((long) jSONObject.optInt("dump_threshold")) * 1024 * 1024;
            }
            if (jSONObject.optInt("abnormal_folder_size") > 0) {
                this.f9598b = ((long) jSONObject.optInt("abnormal_folder_size")) * 1024 * 1024;
            }
            if (jSONObject.optInt("dump_top_count") > 0) {
                this.f9608p = jSONObject.optInt("dump_top_count");
            }
            if (jSONObject.optInt("outdated_days") > 0) {
                this.f9609q = ((long) jSONObject.optInt("outdated_days")) * 86400000;
            }
            this.f9612u = C3131o.m13023c(jSONObject, "disk_customed_paths");
            this.f9613v = C3131o.m13022b(jSONObject, "ignored_relative_paths");
        }
        if (jSONObject.optBoolean("enable_collect_apm6", false)) {
            this.f9606n = true;
        }
    }

    /* renamed from: a */
    public void mo12735a(String str, long j, int i, int i2) {
        if (C2785b.m11769j()) {
            Log.d("MonitorStorage", "appendExceptionFolderQueue: path: " + str + ":  size: " + j + " , accumulateNum: " + i + " , num: " + i2);
        }
        if (j <= f9595r) {
            if (this.f9617z == null) {
                this.f9617z = new C3141x<>(this.f9608p);
            }
            this.f9617z.mo13061a(new C2989b(str, j, i2));
        }
    }

    /* renamed from: a */
    public void mo12736a(String str, long j, int i, long j2) {
        if (C2785b.m11769j()) {
            C2925e.m12375d("MonitorStorage", "appendutdatedFileQueue: path: " + str + ", size: " + j);
        }
        if (j >= 102400 && j <= f9595r) {
            if (this.f9596A == null) {
                this.f9596A = new C3141x<>(this.f9608p);
            }
            this.f9596A.mo13061a(new C2991d(str, j, i, j2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.i.g$a */
    public static class C2988a {

        /* renamed from: a */
        public String f9623a;

        /* renamed from: b */
        public long f9624b;

        /* renamed from: c */
        public float f9625c;

        /* renamed from: d */
        public boolean f9626d;

        /* renamed from: e */
        public String f9627e;

        /* renamed from: f */
        public List<C2988a> f9628f;

        private C2988a() {
            this.f9627e = "normal";
            this.f9628f = new ArrayList();
        }

        /* renamed from: b */
        private String m12568b() {
            String str = this.f9623a;
            if (str.contains(C2986g.f9593d)) {
                return str.replace(C2986g.f9593d, "internal");
            }
            if (str.contains(C2986g.f9594f)) {
                return str.replace(C2986g.f9594f, "external");
            }
            return str;
        }

        /* renamed from: a */
        public JSONObject mo12738a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("path", m12568b());
                jSONObject.put("size", this.f9624b);
                jSONObject.put("size_rate", (double) this.f9625c);
                jSONObject.put("is_folder", this.f9626d);
                jSONObject.put("report_type", this.f9627e);
                if (!this.f9628f.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (C2988a aVar : this.f9628f) {
                        jSONArray.put(aVar.mo12738a());
                    }
                    jSONObject.put("next_disk", jSONArray);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.i.g$c */
    public class C2990c {

        /* renamed from: a */
        public String f9632a;

        /* renamed from: b */
        public C2990c f9633b;

        /* renamed from: c */
        public long f9634c;

        /* renamed from: d */
        public int f9635d;

        /* renamed from: e */
        public boolean f9636e;

        /* renamed from: f */
        public long f9637f;

        /* renamed from: h */
        private int f9639h;

        /* renamed from: i */
        private boolean f9640i;

        /* renamed from: a */
        private boolean m12572a() {
            if (this.f9639h == this.f9635d) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private void m12573b() {
            if (TextUtils.equals(this.f9632a, C2986g.f9593d)) {
                C2986g.this.f9602h = this.f9634c;
            } else if (TextUtils.equals(this.f9632a, C2986g.f9594f)) {
                C2986g.this.f9603i = this.f9634c;
            } else if (TextUtils.equals(this.f9632a, C2986g.this.f9600e)) {
                C2986g.this.f9604j = this.f9634c;
            } else if (TextUtils.equals(this.f9632a, C2986g.this.f9601g)) {
                C2986g.this.f9605m = this.f9634c;
            }
        }

        private C2990c() {
        }

        /* renamed from: a */
        public void mo12741a(long j) {
            this.f9634c += j;
            this.f9639h++;
            if (this.f9633b != null && m12572a()) {
                if (this.f9640i) {
                    this.f9633b.f9640i = true;
                }
                if (this.f9634c >= C2986g.this.f9598b && !this.f9640i) {
                    C2986g.this.mo12735a(this.f9632a, this.f9634c, this.f9639h, this.f9635d);
                    this.f9633b.f9640i = true;
                }
                this.f9633b.mo12741a(this.f9634c);
                if (this.f9636e) {
                    C2986g.this.mo12736a(this.f9632a, this.f9634c, this.f9635d, this.f9637f);
                }
                m12573b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.i.g$d */
    public static class C2991d extends C2989b {

        /* renamed from: c */
        public long f9641c;

        /* renamed from: d */
        private String f9642d;

        /* renamed from: e */
        private int f9643e;

        /* renamed from: f */
        private long f9644f;

        /* renamed from: b */
        private String m12575b() {
            String str = this.f9642d;
            if (str.contains(C2986g.f9593d)) {
                return str.replace(C2986g.f9593d, "internal");
            }
            if (str.contains(C2986g.f9594f)) {
                return str.replace(C2986g.f9594f, "external");
            }
            return str;
        }

        @Override // com.bytedance.apm.p143i.C2986g.C2989b
        /* renamed from: a */
        public JSONObject mo12739a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", m12575b());
                jSONObject.put("size", this.f9641c);
                int i = this.f9643e;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                jSONObject.put("outdate_interval", this.f9644f);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.apm.p143i.C2986g.C2989b, java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.f9644f;
            long j2 = ((C2991d) obj).f9644f;
            if (j == j2) {
                return 0;
            }
            if (j > j2) {
                return 1;
            }
            return -1;
        }

        public C2991d(String str, long j, int i, long j2) {
            this.f9642d = str;
            this.f9641c = j;
            this.f9643e = i;
            this.f9644f = j2;
        }
    }

    public C2986g() {
        this.f9459k = "disk";
    }

    /* renamed from: h */
    private void m12558h() {
        try {
            m12552a(C3112b.m12939a(C2785b.m11735a()), C3112b.m12947b(C2785b.m11735a()), C3112b.m12956j(), Environment.getDataDirectory().getFreeSpace());
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    private void m12559o() {
        try {
            mo12733a();
            m12552a(this.f9602h + this.f9603i, this.f9604j + this.f9605m, Environment.getDataDirectory().getTotalSpace() + Environment.getRootDirectory().getTotalSpace(), Environment.getDataDirectory().getFreeSpace());
            C3010b.m12651a().mo12821a("check_disk_last_time", System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: e */
    public void mo12103e() {
        boolean n = mo12652n();
        if (!this.f9606n && n) {
            m12557f();
            if (this.f9610s) {
                this.f9606n = true;
                return;
            }
            if (this.f9607o) {
                m12559o();
            } else {
                m12558h();
            }
            this.f9606n = true;
            mo12648j();
            mo12649k();
        }
    }

    /* renamed from: f */
    private void m12557f() {
        if (f9593d == null) {
            Context a = C2785b.m11735a();
            try {
                a.getPackageName();
                f9593d = a.getFilesDir().getParent();
                this.f9600e = a.getCacheDir().getAbsolutePath();
                f9594f = a.getExternalFilesDir(null).getParentFile().getAbsolutePath();
                File externalCacheDir = a.getExternalCacheDir();
                if (externalCacheDir != null) {
                    this.f9601g = externalCacheDir.getAbsolutePath();
                }
                List<String> list = this.f9613v;
                if (list != null) {
                    for (String str : list) {
                        if (str.contains("internal")) {
                            this.f9614w.add(str.replace("internal", f9593d));
                        } else if (str.contains("external")) {
                            this.f9614w.add(str.replace("external", f9594f));
                        }
                    }
                }
                List<String> list2 = this.f9612u;
                if (list2 != null) {
                    for (String str2 : list2) {
                        if (str2.contains("internal")) {
                            this.f9615x.add(str2.replace("internal", f9593d));
                        } else if (str2.contains("external")) {
                            this.f9615x.add(str2.replace("external", f9594f));
                        }
                    }
                }
            } catch (Exception unused) {
                this.f9610s = true;
            }
        }
    }

    /* renamed from: a */
    public void mo12733a() {
        List<C2988a> list;
        int i;
        String[] strArr;
        int i2 = 2;
        boolean z = true;
        String[] strArr2 = {f9593d, f9594f};
        this.f9611t = new ArrayList();
        int i3 = 0;
        while (i3 < i2) {
            String str = strArr2[i3];
            File file = new File(str);
            List<C2988a> list2 = this.f9611t;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            m12553a(file, i4, z, list2);
            File file2 = new File(str);
            C2990c cVar = new C2990c();
            cVar.f9632a = str;
            cVar.f9633b = new C2990c();
            File[] listFiles = file2.listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                cVar.f9635d = listFiles.length;
                LinkedList linkedList = new LinkedList();
                linkedList.offer(cVar);
                while (!linkedList.isEmpty()) {
                    int size = linkedList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        C2990c cVar2 = (C2990c) linkedList.poll();
                        if (cVar2 == null) {
                            i = i7;
                            strArr = strArr2;
                        } else {
                            String str2 = cVar2.f9632a;
                            File file3 = new File(str2);
                            if (!file3.exists() || this.f9614w.contains(str2)) {
                                i = i7;
                                strArr = strArr2;
                                cVar2.f9633b.f9635d--;
                            } else {
                                strArr = strArr2;
                                if (file3.isFile()) {
                                    long length = file3.length();
                                    if (length > 0) {
                                        m12554a(str2, length);
                                    }
                                    if (cVar2.f9633b != null) {
                                        cVar2.f9633b.mo12741a(length);
                                        if (!cVar2.f9633b.f9636e) {
                                            long b = m12556b(file3.lastModified());
                                            if (b > 0) {
                                                i = i7;
                                                mo12736a(str2, length, 0, b);
                                            }
                                        }
                                    }
                                    i = i7;
                                } else {
                                    i = i7;
                                    File[] listFiles2 = file3.listFiles();
                                    if (listFiles2 == null || listFiles2.length == 0) {
                                        cVar2.f9633b.mo12741a(0);
                                    } else {
                                        cVar2.f9635d = listFiles2.length;
                                        for (File file4 : listFiles2) {
                                            C2990c cVar3 = new C2990c();
                                            cVar3.f9633b = cVar2;
                                            cVar3.f9632a = file4.getAbsolutePath();
                                            if (file4.isDirectory() && !cVar2.f9636e) {
                                                long b2 = m12556b(file4.lastModified());
                                                if (b2 > 0) {
                                                    cVar3.f9636e = true;
                                                    cVar3.f9637f = b2;
                                                }
                                            }
                                            linkedList.offer(cVar3);
                                        }
                                    }
                                }
                            }
                        }
                        i7 = i + 1;
                        strArr2 = strArr;
                    }
                }
            }
            i3++;
            strArr2 = strArr2;
            i2 = 2;
            z = true;
        }
        List<String> list3 = this.f9615x;
        if (list3 != null && list3.size() > 0) {
            for (String str3 : this.f9615x) {
                m12553a(new File(str3), 1, false, this.f9611t);
            }
        }
        for (C2988a aVar : this.f9611t) {
            if ("normal".equals(aVar.f9627e) && (list = aVar.f9628f) != null && !list.isEmpty()) {
                for (C2988a aVar2 : list) {
                    aVar.f9624b += aVar2.f9624b;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12734a(AbstractC2918e eVar) {
        this.f9599c = eVar;
    }

    /* renamed from: a */
    private long m12549a(long j) {
        return j / 1073741824;
    }

    /* renamed from: a */
    private boolean m12555a(C2988a aVar) {
        for (String str : this.f9614w) {
            if (aVar.f9623a.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private long m12556b(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < this.f9609q || currentTimeMillis >= 62899200000L) {
            return 0;
        }
        return currentTimeMillis;
    }

    /* renamed from: a */
    private long m12550a(File file) {
        long j;
        long j2 = 0;
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            j = m12550a(file2);
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

    /* renamed from: a */
    private static List<String> m12551a(C3141x<? extends C2989b> xVar) {
        if (xVar == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (C2989b bVar : xVar.mo13060a()) {
            linkedList.add(bVar.f9629a);
        }
        return linkedList;
    }

    /* renamed from: a */
    private float m12548a(long j, BigDecimal bigDecimal) {
        return (float) new BigDecimal(j).divide(bigDecimal, 4, 4).doubleValue();
    }

    /* renamed from: a */
    private void m12554a(String str, long j) {
        if (C2785b.m11769j()) {
            C2925e.m12375d("MonitorStorage", "appendExceptionFileQueue: path: " + str + ", size: " + j);
        }
        if (j <= f9595r) {
            if (this.f9616y == null) {
                this.f9616y = new C3141x<>(this.f9608p);
            }
            this.f9616y.mo13061a(new C2989b(str, j, 1));
        }
    }

    /* renamed from: a */
    private void m12553a(File file, int i, boolean z, List<C2988a> list) {
        if (i <= 2 && file != null && file.exists() && !this.f9614w.contains(file.getAbsolutePath())) {
            if (!file.isDirectory()) {
                C2988a aVar = new C2988a();
                aVar.f9626d = false;
                aVar.f9623a = file.getAbsolutePath();
                aVar.f9624b = file.length();
                if (!z) {
                    aVar.f9627e = "custom";
                }
                list.add(aVar);
            } else if (z) {
                File[] listFiles = file.listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists() && !this.f9614w.contains(file2.getAbsolutePath())) {
                            C2988a aVar2 = new C2988a();
                            aVar2.f9626d = file2.isDirectory();
                            aVar2.f9623a = file2.getAbsolutePath();
                            if (file2.isDirectory()) {
                                ArrayList arrayList = new ArrayList();
                                aVar2.f9628f = arrayList;
                                if (i == 2) {
                                    aVar2.f9624b = m12550a(file2);
                                }
                                m12553a(file2, i + 1, z, arrayList);
                                list.add(aVar2);
                            } else {
                                aVar2.f9624b = file2.length();
                                list.add(aVar2);
                            }
                        }
                    }
                }
            } else {
                C2988a aVar3 = new C2988a();
                aVar3.f9626d = true;
                aVar3.f9627e = "custom";
                aVar3.f9623a = file.getAbsolutePath();
                aVar3.f9624b = m12550a(file);
                list.add(aVar3);
            }
        }
    }

    /* renamed from: a */
    private void m12552a(long j, long j2, long j3, long j4) {
        final long j5;
        try {
            if (C2785b.m11769j()) {
                String str = C2922b.f9428c;
                C2925e.m12374c(str, "disk: data: " + j + " , cache: " + j2 + " , total: " + j3 + " , free: " + j4);
            }
            long j6 = f9595r;
            if (j > j6) {
                j5 = j6;
            } else {
                j5 = j;
            }
            if (j2 <= j6) {
                j6 = j2;
            }
            JSONObject jSONObject = new JSONObject();
            if (j > 0) {
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, j5);
            }
            if (j2 > 0) {
                jSONObject.put("cache", j6);
            }
            if (j3 > 0) {
                jSONObject.put("total", m12549a(j3));
            }
            if (j4 > 0) {
                jSONObject.put("rom_free", m12549a(j4));
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.f9607o && j5 > this.f9597a) {
                if (this.f9616y != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (C2989b bVar : this.f9616y.mo13060a()) {
                        JSONObject a = bVar.mo12739a();
                        if (a != null) {
                            jSONArray.put(a);
                        }
                    }
                    jSONObject2.put("top_usage", jSONArray);
                }
                if (this.f9617z != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (C2989b bVar2 : this.f9617z.mo13060a()) {
                        JSONObject a2 = bVar2.mo12739a();
                        if (a2 != null) {
                            jSONArray2.put(a2);
                        }
                    }
                    jSONObject2.put("exception_folders", jSONArray2);
                }
                if (this.f9596A != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (C2991d dVar : this.f9596A.mo13060a()) {
                        JSONObject a3 = dVar.mo12739a();
                        if (a3 != null) {
                            jSONArray3.put(a3);
                        }
                    }
                    jSONObject2.put("outdated_files", jSONArray3);
                }
                List<C2988a> list = this.f9611t;
                if (list != null && !list.isEmpty()) {
                    BigDecimal bigDecimal = new BigDecimal(j5);
                    JSONArray jSONArray4 = new JSONArray();
                    for (C2988a aVar : this.f9611t) {
                        if (m12555a(aVar)) {
                            aVar.f9625c = BitmapDescriptorFactory.HUE_RED;
                        } else {
                            aVar.f9625c = m12548a(aVar.f9624b, bigDecimal);
                        }
                        List<C2988a> list2 = aVar.f9628f;
                        if (list2 != null && list2.size() > 0) {
                            for (C2988a aVar2 : list2) {
                                if (m12555a(aVar2)) {
                                    aVar2.f9625c = BitmapDescriptorFactory.HUE_RED;
                                } else {
                                    aVar2.f9625c = m12548a(aVar2.f9624b, bigDecimal);
                                }
                            }
                        }
                        jSONArray4.put(aVar.mo12738a());
                    }
                    jSONObject2.put("disk_info", jSONArray4);
                }
                if (this.f9599c != null) {
                    final List<String> a4 = m12551a(this.f9616y);
                    final List<String> a5 = m12551a(this.f9617z);
                    final List<String> a6 = m12551a(this.f9596A);
                    C3047b.m12756a().mo12890b(new Runnable() {
                        /* class com.bytedance.apm.p143i.C2986g.RunnableC29871 */

                        public void run() {
                            C2986g.this.f9599c.mo12601a(C2986g.this.f9597a, j5, a4, a5, a6);
                        }
                    });
                }
                this.f9616y = null;
                this.f9617z = null;
                this.f9596A = null;
                this.f9611t = null;
            }
            mo12646a(new C2753f("disk", "storageUsed", false, jSONObject, null, jSONObject2));
        } catch (Exception unused) {
        }
    }
}
