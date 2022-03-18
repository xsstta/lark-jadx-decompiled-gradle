package org.apache.commons.compress.compressors.p3498e;

/* renamed from: org.apache.commons.compress.compressors.e.b */
public class C69806b {

    /* renamed from: a */
    private int f174431a = -1;

    /* renamed from: b */
    private long f174432b;

    /* renamed from: c */
    private String f174433c;

    /* renamed from: d */
    private String f174434d;

    /* renamed from: e */
    private int f174435e = 255;

    /* renamed from: a */
    public void mo244873a(long j) {
        this.f174432b = j;
    }

    /* renamed from: b */
    public void mo244875b(int i) {
        this.f174435e = i;
    }

    /* renamed from: a */
    public void mo244874a(String str) {
        this.f174433c = str;
    }

    /* renamed from: b */
    public void mo244876b(String str) {
        this.f174434d = str;
    }

    /* renamed from: a */
    public void mo244872a(int i) {
        if (i < -1 || i > 9) {
            throw new IllegalArgumentException("Invalid gzip compression level: " + i);
        }
        this.f174431a = i;
    }
}
