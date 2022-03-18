package com.bytedance.ee.bear.doc.resupdate;

import java.io.File;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.o */
public class C5486o {

    /* renamed from: a */
    private File f15582a;

    /* renamed from: b */
    private String f15583b;

    public C5486o() {
    }

    /* renamed from: a */
    public File mo21913a() {
        return this.f15582a;
    }

    /* renamed from: b */
    public String mo21914b() {
        return this.f15583b;
    }

    /* renamed from: c */
    public boolean mo21915c() {
        if (mo21913a() == null || !mo21913a().getAbsolutePath().contains("_sim")) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Resource{file=" + this.f15582a + ", version='" + this.f15583b + '\'' + '}';
    }

    public C5486o(File file, String str) {
        this.f15582a = file;
        this.f15583b = str;
    }
}
