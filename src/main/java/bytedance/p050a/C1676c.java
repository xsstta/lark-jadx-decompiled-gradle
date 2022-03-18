package bytedance.p050a;

import bytedance.io.exception.IllegalPathException;
import bytedance.p051b.AbstractC1678b;
import bytedance.p051b.C1677a;
import bytedance.p052c.C1680a;
import bytedance.p052c.C1681b;
import com.huawei.hms.location.LocationRequest;
import java.util.List;

/* renamed from: bytedance.a.c */
class C1676c implements AbstractC1678b.AbstractC1679a {

    /* renamed from: a */
    private final List<AbstractC1678b> f5699a;

    /* renamed from: b */
    private final int f5700b;

    /* renamed from: c */
    private final C1677a f5701c;

    /* renamed from: d */
    private int f5702d;

    @Override // bytedance.p051b.AbstractC1678b.AbstractC1679a
    /* renamed from: a */
    public C1677a mo8561a(C1677a aVar) throws IllegalPathException {
        String str;
        if (this.f5700b >= this.f5699a.size()) {
            if (aVar.mo8563a() == null && aVar.mo8566c() != null) {
                if (aVar.mo8565b() == null || aVar.mo8565b().isEmpty()) {
                    aVar.mo8564a(aVar.mo8566c());
                } else {
                    aVar.mo8564a(mo8562a(aVar.mo8565b(), aVar.mo8566c()));
                }
            }
            return aVar;
        }
        int i = this.f5702d + 1;
        this.f5702d = i;
        if (i <= 1) {
            C1676c cVar = new C1676c(this.f5699a, this.f5700b + 1, aVar);
            AbstractC1678b bVar = this.f5699a.get(this.f5700b);
            StringBuilder sb = new StringBuilder();
            sb.append("FileResolver = ");
            if (bVar != null) {
                str = bVar.toString();
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" file = ");
            sb.append(aVar.mo8563a());
            C1681b.m7446a("RealResolverController", sb.toString());
            C1677a a = bVar.mo8567a(cVar);
            if (a == null) {
                C1680a.m7443a((int) LocationRequest.PRIORITY_HD_ACCURACY);
                throw new NullPointerException("resolver " + bVar + " returned null");
            } else if (a.mo8563a() != null) {
                return a;
            } else {
                C1680a.m7443a((int) LocationRequest.PRIORITY_INDOOR);
                throw new IllegalStateException("resolver " + bVar + " returned a file with no body");
            }
        } else {
            C1680a.m7443a(100);
            throw new IllegalStateException("FileResolver " + this.f5699a.get(this.f5700b - 1) + " must call handle() exactly once");
        }
    }

    /* renamed from: a */
    public String mo8562a(String str, String str2) {
        if (str2.isEmpty() || str2.equals("/")) {
            return str;
        }
        if (str2.charAt(0) == '/') {
            if (str.equals("/")) {
                return str2;
            }
            return str + str2;
        } else if (str.equals("/")) {
            return str + str2;
        } else {
            return str + '/' + str2;
        }
    }

    public C1676c(List<AbstractC1678b> list, int i, C1677a aVar) {
        this.f5699a = list;
        this.f5700b = i;
        this.f5701c = aVar;
    }
}
