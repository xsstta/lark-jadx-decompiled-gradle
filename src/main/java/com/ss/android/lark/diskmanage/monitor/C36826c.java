package com.ss.android.lark.diskmanage.monitor;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.monitor.C36823b;
import com.ss.android.lark.diskmanage.monitor.settings.DiskMonitorConfig;
import com.ss.android.lark.diskmanage.monitor.settings.MonitorGlobalConfig;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.diskmanage.monitor.c */
public class C36826c {

    /* renamed from: b */
    static String f94626b;

    /* renamed from: c */
    static String f94627c;

    /* renamed from: d */
    static String f94628d;

    /* renamed from: e */
    static String f94629e;

    /* renamed from: j */
    public static List<String> f94630j;

    /* renamed from: a */
    public long f94631a = 52428800;

    /* renamed from: f */
    public long f94632f;

    /* renamed from: g */
    public long f94633g;

    /* renamed from: h */
    public long f94634h;

    /* renamed from: i */
    public long f94635i;

    /* renamed from: k */
    private C36823b f94636k;

    /* renamed from: l */
    private boolean f94637l;

    /* renamed from: m */
    private boolean f94638m;

    /* renamed from: n */
    private long f94639n = 629145600;

    /* renamed from: o */
    private long f94640o = 20971520;

    /* renamed from: p */
    private int f94641p = 20;

    /* renamed from: q */
    private boolean f94642q;

    /* renamed from: r */
    private List<C36828a> f94643r;

    /* renamed from: s */
    private List<String> f94644s = new ArrayList();

    /* renamed from: t */
    private List<String> f94645t = new ArrayList();

    /* renamed from: u */
    private List<File> f94646u = new ArrayList();

    /* renamed from: v */
    private List<String> f94647v = new ArrayList();

    /* renamed from: w */
    private C36823b.C36825b<C36823b.C36824a> f94648w;

    /* renamed from: x */
    private C36823b.C36825b<C36823b.C36824a> f94649x;

    /* renamed from: a */
    public void mo135655a(String str, long j, int i, int i2) {
        if (this.f94649x == null) {
            this.f94649x = new C36823b.C36825b<>(this.f94641p);
        }
        this.f94649x.mo135651a(new C36823b.C36824a(str, j));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.diskmanage.monitor.c$a */
    public static class C36828a {

        /* renamed from: a */
        public String f94650a;

        /* renamed from: b */
        public long f94651b;

        /* renamed from: c */
        public boolean f94652c;

        /* renamed from: d */
        public String f94653d;

        /* renamed from: e */
        public List<C36828a> f94654e;

        private C36828a() {
            this.f94653d = "normal";
            this.f94654e = new ArrayList();
        }

        /* renamed from: c */
        private boolean m145300c() {
            for (String str : C36826c.f94630j) {
                if (this.f94650a.contains(str)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public List<C36828a> mo135656a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            if (!this.f94654e.isEmpty() && m145300c()) {
                arrayList.addAll(m145299b());
            }
            return arrayList;
        }

        /* renamed from: b */
        private List<C36828a> m145299b() {
            long j;
            boolean contains = this.f94650a.contains(C36826c.f94626b + File.separator + "files");
            boolean contains2 = this.f94650a.contains(C36826c.f94626b + File.separator + "databases");
            if (!(contains || contains2)) {
                return this.f94654e;
            }
            HashMap hashMap = new HashMap();
            for (C36828a aVar : this.f94654e) {
                boolean startsWith = new File(aVar.f94650a).getName().startsWith("space_res");
                boolean startsWith2 = new File(aVar.f94650a).getName().startsWith("plugin_v3");
                String str = aVar.f94650a;
                if (startsWith) {
                    str = C36826c.f94626b + File.separator + "files" + File.separator + "space_res*";
                } else if (startsWith2) {
                    str = C36826c.f94626b + File.separator + "files" + File.separator + "plugin_v3*";
                } else if (contains2) {
                    String name = new File(aVar.f94650a).getName();
                    if (name.endsWith("-shm") || name.endsWith("-wal")) {
                        name = name.substring(0, name.length() - 4);
                    }
                    if (name.endsWith("-journal")) {
                        name = name.substring(0, name.length() - 8);
                    }
                    if (name.contains("encrypted") && name.contains("db")) {
                        name = name.substring(name.indexOf("_"));
                    }
                    str = C36826c.f94626b + File.separator + "databases" + File.separator + name;
                }
                if (hashMap.containsKey(str)) {
                    j = ((Long) hashMap.get(str)).longValue();
                } else {
                    j = 0;
                }
                hashMap.put(str, Long.valueOf(j + aVar.f94651b));
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                C36828a aVar2 = new C36828a();
                aVar2.f94650a = (String) entry.getKey();
                aVar2.f94651b = ((Long) entry.getValue()).longValue();
                arrayList.add(aVar2);
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.diskmanage.monitor.c$b */
    public class C36829b {

        /* renamed from: a */
        public String f94655a;

        /* renamed from: b */
        public C36829b f94656b;

        /* renamed from: c */
        public long f94657c;

        /* renamed from: d */
        public int f94658d;

        /* renamed from: f */
        private int f94660f;

        /* renamed from: g */
        private boolean f94661g;

        /* renamed from: a */
        private boolean m145302a() {
            if (this.f94660f == this.f94658d) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private void m145303b() {
            if (TextUtils.equals(this.f94655a, C36826c.f94626b)) {
                C36826c.this.f94632f = this.f94657c;
            } else if (TextUtils.equals(this.f94655a, C36826c.f94628d)) {
                C36826c.this.f94633g = this.f94657c;
            } else if (TextUtils.equals(this.f94655a, C36826c.f94627c)) {
                C36826c.this.f94634h = this.f94657c;
            } else if (TextUtils.equals(this.f94655a, C36826c.f94629e)) {
                C36826c.this.f94635i = this.f94657c;
            }
        }

        private C36829b() {
        }

        /* renamed from: a */
        public void mo135657a(long j) {
            this.f94657c += j;
            this.f94660f++;
            if (this.f94656b != null && m145302a()) {
                if (this.f94661g) {
                    this.f94656b.f94661g = true;
                }
                if (this.f94657c >= C36826c.this.f94631a && !this.f94661g) {
                    C36826c.this.mo135655a(this.f94655a, this.f94657c, this.f94660f, this.f94658d);
                    this.f94656b.f94661g = true;
                }
                this.f94656b.mo135657a(this.f94657c);
                m145303b();
            }
        }
    }

    C36826c() {
    }

    /* renamed from: c */
    private void m145294c() {
        ArrayList arrayList = new ArrayList();
        C36828a aVar = new C36828a();
        aVar.f94650a = f94626b + File.separator + "app_*webview*";
        aVar.f94652c = true;
        for (C36828a aVar2 : this.f94643r) {
            if (aVar2.f94650a.contains(f94626b + File.separator + "app_") && aVar2.f94650a.contains("webview")) {
                aVar.f94651b += aVar2.f94651b;
                arrayList.add(aVar2);
            }
        }
        this.f94643r.removeAll(arrayList);
        this.f94643r.add(aVar);
    }

    /* renamed from: b */
    private void m145292b() {
        List<C36828a> list;
        long j;
        String[] strArr;
        String[] strArr2 = {f94626b, f94628d};
        this.f94643r = new ArrayList();
        int i = 0;
        for (int i2 = 2; i < i2; i2 = 2) {
            String str = strArr2[i];
            m145289a(new File(str), 1, true, this.f94643r);
            File file = new File(str);
            C36829b bVar = new C36829b();
            bVar.f94655a = str;
            bVar.f94656b = new C36829b();
            File[] listFiles = file.listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                bVar.f94658d = listFiles.length;
                LinkedList linkedList = new LinkedList();
                linkedList.offer(bVar);
                while (!linkedList.isEmpty()) {
                    int size = linkedList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        C36829b bVar2 = (C36829b) linkedList.poll();
                        if (bVar2 != null) {
                            String str2 = bVar2.f94655a;
                            File file2 = new File(str2);
                            if (!file2.exists()) {
                                bVar2.f94656b.f94658d--;
                            } else {
                                if (file2.isFile()) {
                                    long length = file2.length();
                                    strArr = strArr2;
                                    if (length > this.f94640o) {
                                        m145290a(str2, length);
                                    }
                                    if (bVar2.f94656b != null) {
                                        bVar2.f94656b.mo135657a(length);
                                    }
                                } else {
                                    strArr = strArr2;
                                    File[] listFiles2 = file2.listFiles();
                                    if (listFiles2 == null || listFiles2.length == 0) {
                                        bVar2.f94656b.mo135657a(0);
                                    } else {
                                        bVar2.f94658d = listFiles2.length;
                                        for (File file3 : listFiles2) {
                                            C36829b bVar3 = new C36829b();
                                            bVar3.f94656b = bVar2;
                                            bVar3.f94655a = file3.getAbsolutePath();
                                            linkedList.offer(bVar3);
                                        }
                                    }
                                }
                                i3++;
                                strArr2 = strArr;
                            }
                        }
                        strArr = strArr2;
                        i3++;
                        strArr2 = strArr;
                    }
                }
            }
            i++;
            strArr2 = strArr2;
        }
        List<String> list2 = this.f94645t;
        if (list2 != null && list2.size() > 0) {
            for (String str3 : this.f94645t) {
                m145289a(new File(str3), 1, false, this.f94643r);
            }
        }
        List<File> list3 = this.f94646u;
        if (list3 != null && list3.size() > 0) {
            for (File file4 : this.f94646u) {
                HashMap hashMap = new HashMap();
                File[] listFiles3 = file4.listFiles();
                for (File file5 : listFiles3) {
                    String str4 = "rust" + File.separator + file5.getName();
                    if (str4.endsWith("-shm") || str4.endsWith("-wal")) {
                        str4 = str4.substring(0, str4.length() - 4);
                    }
                    if (file5.isDirectory()) {
                        j = m145286a(file5);
                    } else {
                        j = file5.length();
                    }
                    hashMap.put(str4, Long.valueOf((hashMap.containsKey(str4) ? ((Long) hashMap.get(str4)).longValue() : 0) + j));
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    C36828a aVar = new C36828a();
                    aVar.f94653d = "custom";
                    aVar.f94650a = (String) entry.getKey();
                    aVar.f94651b = ((Long) entry.getValue()).longValue();
                    this.f94643r.add(aVar);
                }
            }
        }
        this.f94643r.addAll(m145291b(new File(f94626b + File.separator + "files" + File.separator + "ccm")));
        for (C36828a aVar2 : this.f94643r) {
            if ("normal".equals(aVar2.f94653d) && (list = aVar2.f94654e) != null && !list.isEmpty()) {
                for (C36828a aVar3 : list) {
                    aVar2.f94651b += aVar3.f94651b;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo135653a() {
        long j;
        C36808a.AbstractC36811b b = C36808a.m145209b();
        if (b != null) {
            j = b.mo102810a("lark_check_disk_last_time", 0L);
        } else {
            j = 0;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis >= 86400000 || currentTimeMillis <= 0) {
            String str = "";
            if (b != null) {
                str = b.mo102811a("key_storage_monitor_setting", str);
            }
            Log.m165389i("StorageHandler", "settingJson = " + str);
            try {
                DiskMonitorConfig diskMonitorConfig = (DiskMonitorConfig) JSON.parseObject(str, DiskMonitorConfig.class);
                if (diskMonitorConfig == null) {
                    Log.m165389i("StorageHandler", "parseConfig return null ");
                    this.f94637l = true;
                    return;
                }
                MonitorGlobalConfig globalConfig = diskMonitorConfig.getGlobalConfig();
                if (globalConfig != null) {
                    this.f94638m = globalConfig.getDumpSwitch();
                    this.f94639n = globalConfig.getDumpThreshold() * 1024 * 1024;
                    this.f94640o = globalConfig.getAbnormalFileSize() * 1024 * 1024;
                    this.f94631a = globalConfig.getAbnormalFolderSize() * 1024 * 1024;
                    this.f94641p = globalConfig.getDumpTopCount();
                    this.f94644s = globalConfig.getDiskCustomedPaths();
                }
                this.f94636k.mo135647a(diskMonitorConfig.getExceptionConfig());
                if (!this.f94638m) {
                    Log.m165389i("StorageHandler", "parseConfig return mDiskSwitch ");
                    this.f94637l = true;
                }
            } catch (Exception e) {
                Log.m165384e("StorageHandler", "parse DiskMonitorConfig fail. ", e);
            }
        } else {
            this.f94637l = true;
        }
    }

    /* renamed from: a */
    public static long m145286a(File file) {
        long j;
        long j2 = 0;
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            j = m145286a(file2);
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
    static String m145287a(String str) {
        if (str.contains(f94626b)) {
            return str.replace(f94626b, "internal");
        }
        if (str.contains(f94628d)) {
            return str.replace(f94628d, "external");
        }
        return str;
    }

    /* renamed from: b */
    private List<C36828a> m145291b(File file) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.exists()) {
                    C36828a aVar = new C36828a();
                    aVar.f94652c = file2.isDirectory();
                    aVar.f94650a = file2.getAbsolutePath();
                    aVar.f94653d = "custom";
                    if (aVar.f94652c) {
                        aVar.f94651b = m145286a(file2);
                    } else {
                        aVar.f94651b = file2.length();
                    }
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m145295c(Context context) {
        try {
            Log.m165389i("StorageHandler", "handleUsedStorageNew start");
            m145292b();
            m145288a(context, this.f94633g + this.f94632f, this.f94635i + this.f94634h, Environment.getRootDirectory().getTotalSpace() + Environment.getDataDirectory().getTotalSpace(), Environment.getDataDirectory().getFreeSpace());
            C36808a.AbstractC36811b b = C36808a.m145209b();
            if (b != null) {
                b.mo102814b("lark_check_disk_last_time", System.currentTimeMillis());
            }
            Log.m165389i("StorageHandler", "handleUsedStorageNew end");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m145293b(Context context) {
        if (f94626b == null) {
            try {
                String packageName = context.getPackageName();
                f94626b = context.getFilesDir().getParent();
                f94627c = context.getCacheDir().getAbsolutePath();
                f94628d = Environment.getExternalStorageDirectory() + "/Android/data/" + packageName;
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir != null) {
                    f94629e = externalCacheDir.getAbsolutePath();
                }
                ArrayList arrayList = new ArrayList();
                f94630j = arrayList;
                arrayList.addAll(Arrays.asList(f94626b + File.separator + "app_", f94626b + File.separator + "code_cache", f94626b + File.separator + "lib", f94626b + File.separator + "shared_prefs", f94626b + File.separator + "no_backup"));
                File file = new File(StoragePathUtils.f94669a.mo135752r(context));
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    for (File file2 : listFiles) {
                        if (file2.isDirectory() && file2.getName().length() == 32) {
                            this.f94646u.add(file2);
                            this.f94647v.add(file2.getName());
                        }
                    }
                }
                this.f94636k.mo135648a(this.f94647v);
                List<String> list = this.f94644s;
                if (list != null) {
                    for (String str : list) {
                        if (str.contains("internal")) {
                            this.f94645t.add(str.replace("internal", f94626b));
                        } else if (str.contains("external")) {
                            this.f94645t.add(str.replace("external", f94628d));
                        }
                    }
                }
                this.f94645t.add(StoragePathUtils.f94669a.mo135729a(context));
            } catch (Exception e) {
                Log.m165389i("StorageHandler", "parseConfig return initPaths " + e);
                this.f94642q = true;
            }
        }
    }

    /* renamed from: a */
    public void mo135654a(Context context) {
        if (!this.f94637l) {
            this.f94636k = new C36823b(context);
            mo135653a();
            if (!this.f94637l) {
                m145293b(context);
                if (this.f94642q) {
                    Log.m165389i("StorageHandler", "parseConfig return mInitException ");
                    this.f94637l = true;
                    return;
                }
                m145295c(context);
                this.f94637l = true;
            }
        }
    }

    /* renamed from: a */
    private void m145290a(String str, long j) {
        if (this.f94648w == null) {
            this.f94648w = new C36823b.C36825b<>(this.f94641p);
        }
        this.f94648w.mo135651a(new C36823b.C36824a(str, j));
    }

    /* renamed from: a */
    private void m145289a(File file, int i, boolean z, List<C36828a> list) {
        if (i <= 2 && file != null && file.exists()) {
            if (!file.isDirectory()) {
                C36828a aVar = new C36828a();
                aVar.f94652c = false;
                aVar.f94650a = file.getAbsolutePath();
                aVar.f94651b = file.length();
                if (!z) {
                    aVar.f94653d = "custom";
                }
                list.add(aVar);
            } else if (z) {
                File[] listFiles = file.listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists()) {
                            C36828a aVar2 = new C36828a();
                            aVar2.f94652c = file2.isDirectory();
                            aVar2.f94650a = file2.getAbsolutePath();
                            if (file2.isDirectory()) {
                                ArrayList arrayList = new ArrayList();
                                aVar2.f94654e = arrayList;
                                if (i == 2) {
                                    aVar2.f94651b = m145286a(file2);
                                }
                                m145289a(file2, i + 1, z, arrayList);
                                list.add(aVar2);
                            } else {
                                aVar2.f94651b = file2.length();
                                list.add(aVar2);
                            }
                        }
                    }
                }
            } else {
                C36828a aVar3 = new C36828a();
                aVar3.f94652c = true;
                aVar3.f94653d = "custom";
                aVar3.f94650a = file.getAbsolutePath();
                aVar3.f94651b = m145286a(file);
                list.add(aVar3);
            }
        }
    }

    /* renamed from: a */
    private void m145288a(Context context, long j, long j2, long j3, long j4) {
        try {
            Log.m165389i("StorageHandler", "disk: data: " + j + " , cache: " + j2 + " , total: " + j3 + " , free: " + j4);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, j);
            jSONObject.put("cache", j2);
            jSONObject.put("total", j3);
            jSONObject.put("rom_free", j4);
            if (j > this.f94639n) {
                this.f94636k.mo135646a(context, this.f94648w.mo135650a(), this.f94649x.mo135650a());
            }
            List<C36828a> list = this.f94643r;
            if (list != null && !list.isEmpty()) {
                m145294c();
                for (C36828a aVar : this.f94643r) {
                    for (C36828a aVar2 : aVar.mo135656a()) {
                        Log.m165379d("StorageHandler", "path: " + m145287a(aVar2.f94650a) + ", size: " + aVar2.f94651b);
                        jSONObject.put(m145287a(aVar2.f94650a), aVar2.f94651b);
                    }
                }
                C36830d.m145308a("lark_storage_size_all", null, jSONObject, null);
            }
            this.f94643r = null;
            this.f94648w.mo135652b();
            this.f94649x.mo135652b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
