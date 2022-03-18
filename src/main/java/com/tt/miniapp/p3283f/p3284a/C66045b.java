package com.tt.miniapp.p3283f.p3284a;

/* renamed from: com.tt.miniapp.f.a.b */
public class C66045b {

    /* renamed from: a */
    private String f166709a;

    /* renamed from: b */
    private String f166710b;

    /* renamed from: c */
    private String f166711c;

    /* renamed from: d */
    private String f166712d;

    public String toString() {
        return "CustomerServiceParam{appId='" + this.f166709a + '\'' + ", aId='" + this.f166710b + '\'' + ", userId='" + this.f166711c + '\'' + ", platform='" + this.f166712d + '\'' + '}';
    }

    /* renamed from: a */
    public String mo231134a(String str) {
        return str + "?appid=" + this.f166709a + "&aid=" + this.f166710b + "&uid=" + this.f166711c + "&os=" + this.f166712d;
    }

    public C66045b(String str, String str2, String str3, String str4) {
        this.f166709a = str;
        this.f166710b = str2;
        this.f166711c = str3;
        this.f166712d = str4;
    }
}
