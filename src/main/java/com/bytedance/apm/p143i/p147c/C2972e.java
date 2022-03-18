package com.bytedance.apm.p143i.p147c;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.util.C3122i;
import com.bytedance.monitor.util.C20172c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.apm.i.c.e */
public class C2972e implements AbstractC2966b {

    /* renamed from: a */
    private File f9547a;

    /* renamed from: b */
    private List<String> f9548b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private long f9549c = -1;

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: a */
    public void mo12690a(boolean z) {
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: a */
    public void mo12689a() {
        this.f9547a = new File("/proc/net/xt_qtaguid/stats");
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: b */
    public long mo12691b() {
        return mo12694e() + mo12696g();
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: c */
    public long mo12692c() {
        return mo12693d() + mo12695f();
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: h */
    public long mo12697h() {
        return mo12708i() + mo12709j();
    }

    /* renamed from: i */
    public long mo12708i() {
        return mo12694e() + mo12693d();
    }

    /* renamed from: j */
    public long mo12709j() {
        return mo12696g() + mo12695f();
    }

    /* renamed from: k */
    private void m12499k() {
        BufferedReader bufferedReader;
        Throwable th;
        if (this.f9547a != null && System.currentTimeMillis() - this.f9549c >= 1000) {
            this.f9549c = System.currentTimeMillis();
            try {
                ArrayList arrayList = new ArrayList();
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.f9547a), "utf-8"));
                int i = 1;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (i >= 0) {
                            arrayList.add(readLine);
                        }
                        i++;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            C20172c.m73614a(bufferedReader);
                        } catch (Throwable th3) {
                            C20172c.m73614a(bufferedReader);
                            throw th3;
                        }
                    }
                }
                this.f9548b.clear();
                this.f9548b.addAll(arrayList);
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                th.printStackTrace();
                C20172c.m73614a(bufferedReader);
            }
            C20172c.m73614a(bufferedReader);
        }
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: d */
    public long mo12693d() {
        int myUid = Process.myUid();
        m12499k();
        if (C3122i.m13009a(this.f9548b)) {
            return -1;
        }
        long j = 0;
        long j2 = 0;
        for (String str : this.f9548b) {
            String[] split = str.split(" ");
            try {
                if (!TextUtils.equals(split[3], "uid_tag_int")) {
                    if (myUid == Integer.parseInt(split[3])) {
                        long parseLong = Long.parseLong(split[5]);
                        long parseLong2 = Long.parseLong(split[7]);
                        if (Long.valueOf(split[4]).longValue() == 1 && split[1].startsWith("rmnet_data")) {
                            j2 += parseLong2;
                            j += parseLong;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return j + j2;
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: e */
    public long mo12694e() {
        int myUid = Process.myUid();
        m12499k();
        if (C3122i.m13009a(this.f9548b)) {
            return -1;
        }
        long j = 0;
        long j2 = 0;
        for (String str : this.f9548b) {
            String[] split = str.split(" ");
            try {
                if (!TextUtils.equals(split[3], "uid_tag_int")) {
                    if (myUid == Integer.parseInt(split[3])) {
                        long parseLong = Long.parseLong(split[5]);
                        long parseLong2 = Long.parseLong(split[7]);
                        if (Long.valueOf(split[4]).longValue() == 0 && split[1].startsWith("rmnet_data")) {
                            j2 += parseLong2;
                            j += parseLong;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return j + j2;
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: f */
    public long mo12695f() {
        int myUid = Process.myUid();
        m12499k();
        if (C3122i.m13009a(this.f9548b)) {
            return -1;
        }
        long j = 0;
        long j2 = 0;
        for (String str : this.f9548b) {
            String[] split = str.split(" ");
            try {
                if (!TextUtils.equals(split[3], "uid_tag_int")) {
                    if (myUid == Integer.parseInt(split[3])) {
                        long parseLong = Long.parseLong(split[5]);
                        long parseLong2 = Long.parseLong(split[7]);
                        if (Long.valueOf(split[4]).longValue() == 1 && split[1].startsWith("wlan")) {
                            j2 += parseLong2;
                            j += parseLong;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return j + j2;
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: g */
    public long mo12696g() {
        int myUid = Process.myUid();
        m12499k();
        if (C3122i.m13009a(this.f9548b)) {
            return -1;
        }
        long j = 0;
        long j2 = 0;
        for (String str : this.f9548b) {
            String[] split = str.split(" ");
            try {
                if (!TextUtils.equals(split[3], "uid_tag_int")) {
                    if (myUid == Integer.parseInt(split[3])) {
                        long parseLong = Long.parseLong(split[5]);
                        long parseLong2 = Long.parseLong(split[7]);
                        if (Long.valueOf(split[4]).longValue() == 0 && split[1].startsWith("wlan")) {
                            j2 += parseLong2;
                            j += parseLong;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return j + j2;
    }
}
