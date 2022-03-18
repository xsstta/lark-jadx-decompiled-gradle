package com.bytedance.memory.p847c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.memory.p845a.C20055a;
import com.bytedance.memory.p846b.C20066d;
import java.io.File;

/* renamed from: com.bytedance.memory.c.b */
public final class C20073b {

    /* renamed from: a */
    private static volatile C20073b f49015a;

    /* renamed from: b */
    private final Context f49016b;

    /* renamed from: c */
    private final File f49017c;

    /* renamed from: d */
    private final File f49018d;

    /* renamed from: e */
    private final File f49019e;

    /* renamed from: f */
    private final File f49020f;

    /* renamed from: g */
    private final File f49021g;

    /* renamed from: h */
    private final File f49022h;

    /* renamed from: i */
    private final String f49023i;

    /* renamed from: a */
    public File mo68042a() {
        return this.f49020f;
    }

    /* renamed from: b */
    public File mo68043b() {
        return this.f49022h;
    }

    /* renamed from: c */
    public File mo68044c() {
        return this.f49019e;
    }

    /* renamed from: d */
    public File mo68045d() {
        return this.f49021g;
    }

    /* renamed from: f */
    public File mo68047f() {
        return this.f49018d;
    }

    /* renamed from: g */
    public File mo68048g() {
        return this.f49017c;
    }

    /* renamed from: j */
    public File mo68050j() {
        return this.f49017c;
    }

    /* renamed from: k */
    private void m73243k() {
        try {
            C20066d.m73228a(new File(this.f49023i, "memorywidget"));
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public boolean mo68046e() {
        return new File(this.f49021g, "festival.jpg.heap").exists();
    }

    /* renamed from: h */
    public void mo68049h() {
        if (this.f49017c.exists()) {
            this.f49017c.delete();
        }
    }

    /* renamed from: i */
    public static C20073b m73242i() {
        if (f49015a == null) {
            synchronized (C20073b.class) {
                if (f49015a == null) {
                    f49015a = new C20073b(C20055a.m73200c().mo68027f());
                }
            }
        }
        return f49015a;
    }

    private C20073b(Context context) {
        this.f49016b = context;
        String a = C20055a.m73200c().mo68020a();
        if (!TextUtils.isEmpty(a)) {
            this.f49023i = new File(a).getAbsolutePath();
        } else {
            this.f49023i = context.getExternalFilesDir(null).getParentFile().getAbsolutePath();
        }
        String d = C2785b.m11756d();
        if (d != null) {
            this.f49021g = new File(this.f49023i + "/" + "memorywidgets", d);
            this.f49022h = new File(this.f49023i + "/" + "memory", d);
        } else {
            this.f49021g = new File(this.f49023i + "/" + "memorywidgets", context.getPackageName());
            this.f49022h = new File(this.f49023i + "/" + "memory", context.getPackageName());
        }
        if (!this.f49021g.exists()) {
            this.f49021g.mkdirs();
        }
        if (!this.f49022h.exists()) {
            this.f49022h.mkdirs();
        }
        File file = new File(this.f49021g, "cache");
        this.f49019e = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f49017c = new File(this.f49021g, "festival.jpg");
        this.f49018d = new File(this.f49021g, "festival.jpg.heap");
        File file2 = new File(this.f49021g, "shrink");
        this.f49020f = file2;
        if (!file2.exists()) {
            file2.mkdirs();
        }
        m73243k();
    }
}
