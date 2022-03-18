package com.bytedance.ee.bear.document.offline.p318e;

import java.io.File;

/* renamed from: com.bytedance.ee.bear.document.offline.e.f */
public class C5929f {

    /* renamed from: a */
    private File f16620a;

    /* renamed from: b */
    private String f16621b;

    /* renamed from: c */
    private boolean f16622c;

    public C5929f() {
    }

    /* renamed from: a */
    public File mo23915a() {
        return this.f16620a;
    }

    /* renamed from: b */
    public String mo23916b() {
        return this.f16621b;
    }

    /* renamed from: c */
    public boolean mo23917c() {
        return this.f16622c;
    }

    public String toString() {
        return "Resource{file=" + this.f16620a + ", version='" + this.f16621b + '\'' + '}';
    }

    public C5929f(File file, String str, boolean z) {
        this.f16620a = file;
        this.f16621b = str;
        this.f16622c = z;
    }
}
