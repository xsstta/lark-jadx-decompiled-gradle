package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C0845f;
import java.util.List;

/* renamed from: androidx.core.provider.a */
public final class C0813a {

    /* renamed from: a */
    private final String f3238a;

    /* renamed from: b */
    private final String f3239b;

    /* renamed from: c */
    private final String f3240c;

    /* renamed from: d */
    private final List<List<byte[]>> f3241d;

    /* renamed from: e */
    private final int f3242e = 0;

    /* renamed from: f */
    private final String f3243f;

    /* renamed from: a */
    public String mo4417a() {
        return this.f3238a;
    }

    /* renamed from: b */
    public String mo4418b() {
        return this.f3239b;
    }

    /* renamed from: c */
    public String mo4419c() {
        return this.f3240c;
    }

    /* renamed from: d */
    public List<List<byte[]>> mo4420d() {
        return this.f3241d;
    }

    /* renamed from: e */
    public int mo4421e() {
        return this.f3242e;
    }

    /* renamed from: f */
    public String mo4422f() {
        return this.f3243f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f3238a + ", mProviderPackage: " + this.f3239b + ", mQuery: " + this.f3240c + ", mCertificates:");
        for (int i = 0; i < this.f3241d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f3241d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3242e);
        return sb.toString();
    }

    public C0813a(String str, String str2, String str3, List<List<byte[]>> list) {
        String str4 = (String) C0845f.m3991a(str);
        this.f3238a = str4;
        String str5 = (String) C0845f.m3991a(str2);
        this.f3239b = str5;
        String str6 = (String) C0845f.m3991a(str3);
        this.f3240c = str6;
        this.f3241d = (List) C0845f.m3991a(list);
        this.f3243f = str4 + "-" + str5 + "-" + str6;
    }
}
