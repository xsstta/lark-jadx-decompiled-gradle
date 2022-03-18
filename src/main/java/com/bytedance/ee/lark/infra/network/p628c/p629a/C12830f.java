package com.bytedance.ee.lark.infra.network.p628c.p629a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.network.c.a.f */
public class C12830f {

    /* renamed from: a */
    private int f34274a = -1;

    /* renamed from: b */
    private String f34275b;

    /* renamed from: c */
    private String f34276c;

    /* renamed from: d */
    private byte[] f34277d;

    /* renamed from: e */
    private ArrayList<C12826d> f34278e;

    /* renamed from: f */
    private Throwable f34279f;

    /* renamed from: g */
    private JSONObject f34280g;

    /* renamed from: h */
    private IAppContext f34281h;

    /* renamed from: b */
    public int mo48463b() {
        return this.f34274a;
    }

    /* renamed from: c */
    public String mo48465c() {
        return this.f34275b;
    }

    /* renamed from: f */
    public Throwable mo48468f() {
        return this.f34279f;
    }

    /* renamed from: g */
    public JSONObject mo48469g() {
        return this.f34280g;
    }

    /* renamed from: e */
    public byte[] mo48467e() {
        byte[] bArr = this.f34277d;
        if (bArr != null) {
            return bArr;
        }
        String str = this.f34276c;
        if (str != null) {
            return str.getBytes();
        }
        return null;
    }

    /* renamed from: h */
    public ArrayList<C12826d> mo48470h() {
        if (this.f34278e == null) {
            this.f34278e = new ArrayList<>();
        }
        return this.f34278e;
    }

    /* renamed from: d */
    public String mo48466d() {
        String str = this.f34276c;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.f34277d;
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        return m52983b(bArr);
    }

    /* renamed from: a */
    public void mo48459a(int i) {
        this.f34274a = i;
    }

    /* renamed from: a */
    public void mo48460a(String str) {
        this.f34275b = str;
    }

    /* renamed from: b */
    public void mo48464b(String str) {
        this.f34276c = str;
    }

    public C12830f(IAppContext iAppContext) {
        this.f34281h = iAppContext;
    }

    /* renamed from: a */
    public void mo48461a(Throwable th) {
        this.f34279f = th;
    }

    /* renamed from: b */
    private String m52983b(byte[] bArr) {
        try {
            return new String(bArr);
        } catch (Throwable th) {
            AppBrandLogger.m52829e("TmaResponse", th);
            return "";
        }
    }

    /* renamed from: a */
    public void mo48462a(byte[] bArr) {
        this.f34277d = bArr;
    }
}
