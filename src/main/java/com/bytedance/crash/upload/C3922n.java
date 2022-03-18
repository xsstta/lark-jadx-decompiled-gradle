package com.bytedance.crash.upload;

import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.n */
public class C3922n {

    /* renamed from: a */
    private final int f12014a;

    /* renamed from: b */
    private String f12015b;

    /* renamed from: c */
    private JSONObject f12016c;

    /* renamed from: d */
    private byte[] f12017d;

    /* renamed from: b */
    public byte[] mo15580b() {
        return this.f12017d;
    }

    /* renamed from: a */
    public boolean mo15579a() {
        if (this.f12014a != 207) {
            return true;
        }
        return false;
    }

    public C3922n(int i) {
        this.f12014a = i;
    }

    public C3922n(int i, String str) {
        this.f12014a = i;
        this.f12015b = str;
    }

    public C3922n(int i, Throwable th) {
        this.f12014a = i;
        if (th != null) {
            this.f12015b = th.getMessage();
        }
    }

    public C3922n(int i, JSONObject jSONObject) {
        this.f12014a = i;
        this.f12016c = jSONObject;
    }

    public C3922n(int i, byte[] bArr) {
        this.f12014a = i;
        this.f12017d = bArr;
    }
}
