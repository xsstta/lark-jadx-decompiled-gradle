package com.huawei.hms.hatool;

import java.util.List;
import java.util.Map;

public class i0 implements m0 {

    /* renamed from: a */
    public byte[] f58217a;

    /* renamed from: b */
    public String f58218b;

    /* renamed from: c */
    public String f58219c;

    /* renamed from: d */
    public String f58220d;

    /* renamed from: e */
    public String f58221e;

    /* renamed from: f */
    public List<C23615q> f58222f;

    public i0(byte[] bArr, String str, String str2, String str3, String str4, List<C23615q> list) {
        this.f58217a = (byte[]) bArr.clone();
        this.f58218b = str;
        this.f58219c = str2;
        this.f58221e = str3;
        this.f58220d = str4;
        this.f58222f = list;
    }

    /* renamed from: a */
    public final b0 mo83026a(Map<String, String> map) {
        return a0.m85604a(this.f58218b, this.f58217a, map);
    }

    /* renamed from: a */
    public final Map<String, String> mo83027a() {
        return b1.m85629b(this.f58219c, this.f58221e, this.f58220d);
    }

    /* renamed from: b */
    public final void mo83028b() {
        n0.m85861b().mo83125a(new l0(this.f58222f, this.f58219c, this.f58220d, this.f58221e));
    }

    public void run() {
        C23625y.m85977c("hmsSdk", "send data running");
        int a = mo83026a(mo83027a()).mo82965a();
        if (a != 200) {
            mo83028b();
            return;
        }
        C23625y.m85975b("hmsSdk", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.f58220d, this.f58221e, this.f58219c, Integer.valueOf(a));
    }
}
