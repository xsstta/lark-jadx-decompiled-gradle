package com.bytedance.p725f.p726a.p733c;

import com.bytedance.p725f.p726a.p734d.C13880b;
import java.io.File;

/* renamed from: com.bytedance.f.a.c.a */
public abstract class AbstractC13866a {

    /* renamed from: a */
    protected AbstractC13867b f36292a;

    /* renamed from: b */
    private String f36293b;

    /* renamed from: c */
    private File f36294c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC13867b mo51153a(File file) {
        return null;
    }

    /* renamed from: a */
    public AbstractC13867b mo51152a() {
        if (this.f36293b == null) {
            C13880b.m56267b("refresh and path null");
            return null;
        }
        if (this.f36294c == null) {
            this.f36294c = new File(this.f36293b);
        }
        AbstractC13867b a = mo51153a(this.f36294c);
        this.f36292a = a;
        return a;
    }

    public String toString() {
        return "BaseStatFile{mPath='" + this.f36293b + '\'' + ", mFile=" + this.f36294c + ", mLastInfo=" + this.f36292a + '}';
    }

    public AbstractC13866a(String str) {
        this.f36293b = str;
    }
}
