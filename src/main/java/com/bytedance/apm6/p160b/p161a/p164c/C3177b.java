package com.bytedance.apm6.p160b.p161a.p164c;

import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.b.a.c.b */
public class C3177b {

    /* renamed from: a */
    private byte[] f10185a;

    /* renamed from: a */
    public byte[] mo13226a() {
        return this.f10185a;
    }

    public String toString() {
        try {
            return new JSONObject(new String(this.f10185a)).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public C3177b(byte[] bArr) {
        this.f10185a = bArr;
    }
}
