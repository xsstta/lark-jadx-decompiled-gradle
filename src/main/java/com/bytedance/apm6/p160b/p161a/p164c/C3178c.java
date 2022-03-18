package com.bytedance.apm6.p160b.p161a.p164c;

import com.bytedance.apm.p129b.C2786a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.p160b.p161a.C3162b;
import com.bytedance.apm6.p160b.p161a.C3170c;
import com.bytedance.apm6.p183g.AbstractC3326b;
import com.bytedance.apm6.p183g.C3324a;
import com.bytedance.apm6.util.C3352c;
import com.bytedance.apm6.util.C3354d;
import com.bytedance.apm6.util.p195b.C3350b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.b.a.c.c */
public class C3178c {

    /* renamed from: a */
    private final File f10186a;

    /* renamed from: b */
    private final long f10187b;

    /* renamed from: c */
    private ByteBuffer f10188c;

    /* renamed from: d */
    private FileLock f10189d;

    /* renamed from: d */
    private short m13289d() {
        return this.f10188c.getShort(0);
    }

    /* renamed from: e */
    private long m13290e() {
        return this.f10188c.getLong(2);
    }

    /* renamed from: i */
    private AbstractC3326b m13294i() {
        return new AbstractC3326b() {
            /* class com.bytedance.apm6.p160b.p161a.p164c.C3178c.C31802 */

            @Override // com.bytedance.apm6.p183g.AbstractC3326b
            /* renamed from: g */
            public String mo13105g() {
                return "service_monitor";
            }

            @Override // com.bytedance.apm6.p183g.AbstractC3326b
            /* renamed from: h */
            public boolean mo13106h() {
                return true;
            }

            @Override // com.bytedance.apm6.p183g.AbstractC3326b
            /* renamed from: i */
            public JSONObject mo13107i() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("log_type", "service_monitor");
                    jSONObject.put("service", "apm_error");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(ShareHitPoint.f121869d, "large_data");
                    jSONObject.put("category", jSONObject2);
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        };
    }

    /* renamed from: f */
    private int m13291f() {
        return this.f10188c.getInt(10);
    }

    /* renamed from: g */
    private int m13292g() {
        return this.f10188c.getInt(14);
    }

    /* renamed from: c */
    private void m13288c() {
        this.f10188c.clear();
        this.f10188c.putShort(2082);
        this.f10188c.putLong(this.f10187b);
        this.f10188c.putInt(0);
        this.f10188c.putInt(0);
    }

    /* renamed from: h */
    private void m13293h() {
        this.f10188c.position(m13292g() + 18);
        this.f10188c.flip();
        C3176a a = C3176a.m13279a(this.f10188c);
        if (C3318a.m13915u()) {
            String str = C3159a.f10110a;
            C3350b.m13932a(str, "flush to memory success. logFile=" + a);
        }
        C3170c.m13261a().mo13204a(a);
    }

    /* renamed from: b */
    public synchronized String[] mo13230b() {
        File[] listFiles = C3162b.m13180d().listFiles(new FileFilter() {
            /* class com.bytedance.apm6.p160b.p161a.p164c.C3178c.C31791 */

            public boolean accept(File file) {
                String name = file.getName();
                if (name.endsWith(".log")) {
                    return true;
                }
                if (name.endsWith(".txt")) {
                    return false;
                }
                C3352c.m13947b(file);
                return false;
            }
        });
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            arrayList.add(file.getName());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public synchronized void mo13228a() {
        short d = m13289d();
        long e = m13290e();
        int f = m13291f();
        int g = m13292g();
        if (d == 2082 && g > 0) {
            if (f > 0) {
                if (C3318a.m13915u()) {
                    C3350b.m13932a(C3159a.f10110a, "flushing: headerId=" + e + " totalCount=" + f + " totalBytes=" + g);
                }
                long nanoTime = System.nanoTime();
                FileChannel fileChannel = null;
                boolean z = false;
                try {
                    String str = System.currentTimeMillis() + "_" + UUID.randomUUID().toString();
                    try {
                        if (!this.f10186a.exists()) {
                            File parentFile = this.f10186a.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            this.f10186a.mkdirs();
                        }
                    } catch (Throwable th) {
                        C3350b.m13935b(C3159a.f10110a, "flushDir create error.", th);
                    }
                    File file = new File(this.f10186a, str + ".txt");
                    if (file.exists()) {
                        C3350b.m13937d(C3159a.f10110a, "file is exist:" + file.getName());
                    }
                    fileChannel = new FileOutputStream(file, false).getChannel();
                    this.f10188c.position(g + 18);
                    this.f10188c.flip();
                    fileChannel.write(this.f10188c);
                    if (file.renameTo(new File(this.f10186a, str + ".log"))) {
                        z = true;
                    } else {
                        C3350b.m13937d(C3159a.f10110a, "rename error" + file.getAbsolutePath());
                    }
                    if (C3318a.m13915u()) {
                        C3350b.m13932a(C3159a.f10110a, "flush to file success. flushFile=" + file.getAbsolutePath());
                    }
                } catch (Throwable unused) {
                }
                C3354d.m13949a(fileChannel);
                if (!z) {
                    m13293h();
                }
                m13288c();
                if (C3318a.m13915u()) {
                    C3350b.m13932a(C3159a.f10110a, "flush cost=" + (System.nanoTime() - nanoTime));
                }
                return;
            }
        }
        if (C3318a.m13915u()) {
            C3350b.m13932a(C3159a.f10110a, "flushing: Skipped. no data to flush. reset buffer now.");
        }
        m13288c();
    }

    /* renamed from: a */
    private void m13286a(int i) {
        this.f10188c.putInt(10, i);
    }

    /* renamed from: b */
    private void m13287b(int i) {
        this.f10188c.putInt(14, i);
    }

    /* renamed from: a */
    public synchronized void mo13229a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String jSONObject2 = jSONObject.toString();
            if (C3318a.m13915u()) {
                C2786a.m11785a(jSONObject);
            }
            byte[] bytes = jSONObject2.getBytes();
            int length = bytes.length + 4;
            if (length > 262144) {
                C3324a.m13872a(m13294i());
                return;
            }
            if (length > this.f10188c.remaining()) {
                mo13228a();
            }
            this.f10188c.putInt(bytes.length);
            this.f10188c.put(bytes);
            m13286a(m13291f() + 1);
            m13287b(m13292g() + length);
            if (C3318a.m13915u()) {
                C3350b.m13932a(C3159a.f10110a, String.format("push success: totalCount=%s, totalBytes=%s, logItem=%s", Integer.valueOf(m13291f()), Integer.valueOf(m13292g()), jSONObject2));
            }
            if (this.f10188c.position() >= 262134 || m13291f() >= 256) {
                mo13228a();
            }
        }
    }

    public C3178c(long j, File file, File file2) {
        this.f10186a = file2;
        this.f10187b = j;
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            this.f10189d = channel.tryLock();
            this.f10188c = channel.map(FileChannel.MapMode.READ_WRITE, 0, 262162);
            mo13228a();
        } catch (Throwable th) {
            C3350b.m13935b(C3159a.f10110a, "create MappedByteBuffer failed. will fallback into HeapByteBuffer", th);
        }
        if (this.f10188c == null) {
            this.f10188c = ByteBuffer.allocate(262162);
        }
        m13288c();
    }
}
