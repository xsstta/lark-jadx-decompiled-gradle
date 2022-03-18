package com.bytedance.apm.config;

import android.os.Build;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.constant.C2905a;
import com.bytedance.apm.core.AbstractC2908b;
import com.bytedance.apm.p138d.AbstractC2914a;
import com.bytedance.apm.p138d.AbstractC2915b;
import com.bytedance.apm.p138d.AbstractC2916c;
import com.bytedance.apm.p138d.AbstractC2917d;
import com.bytedance.apm.p138d.AbstractC2918e;
import com.bytedance.apm.p138d.AbstractC2919f;
import com.bytedance.apm.p139e.AbstractC2923c;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.util.C3121h;
import com.bytedance.apm.util.C3132p;
import com.bytedance.apm6.foundation.AbstractC3320b;
import com.bytedance.frameworks.core.p747a.C14094b;
import com.bytedance.services.apm.api.AbstractC20699d;
import com.bytedance.services.apm.api.AbstractC20702g;
import com.bytedance.services.apm.api.IHttpService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.config.d */
public class C2888d {

    /* renamed from: A */
    private final ExecutorService f9275A;

    /* renamed from: B */
    private final String f9276B;

    /* renamed from: C */
    private final AbstractC2919f f9277C;

    /* renamed from: a */
    public List<String> f9278a;

    /* renamed from: b */
    public List<String> f9279b;

    /* renamed from: c */
    public List<String> f9280c;

    /* renamed from: d */
    public AbstractC2916c f9281d;

    /* renamed from: e */
    public final boolean f9282e;

    /* renamed from: f */
    public final boolean f9283f;

    /* renamed from: g */
    public final boolean f9284g;

    /* renamed from: h */
    public final boolean f9285h;

    /* renamed from: i */
    public final long f9286i;

    /* renamed from: j */
    public final boolean f9287j;

    /* renamed from: k */
    public final boolean f9288k;

    /* renamed from: l */
    public final boolean f9289l;

    /* renamed from: m */
    public final JSONObject f9290m;

    /* renamed from: n */
    public final AbstractC2908b f9291n;

    /* renamed from: o */
    public final IHttpService f9292o;

    /* renamed from: p */
    public final Set<AbstractC20702g> f9293p;

    /* renamed from: q */
    public final AbstractC20699d f9294q;

    /* renamed from: r */
    public final AbstractC2917d f9295r;

    /* renamed from: s */
    private final boolean f9296s;

    /* renamed from: t */
    private final boolean f9297t;

    /* renamed from: u */
    private final boolean f9298u;

    /* renamed from: v */
    private final boolean f9299v;

    /* renamed from: w */
    private final long f9300w;

    /* renamed from: x */
    private final AbstractC2915b f9301x;

    /* renamed from: y */
    private final AbstractC2914a f9302y;

    /* renamed from: z */
    private final AbstractC2918e f9303z;

    /* renamed from: b */
    public AbstractC2917d mo12425b() {
        return this.f9295r;
    }

    /* renamed from: c */
    public AbstractC2908b mo12427c() {
        return this.f9291n;
    }

    /* renamed from: d */
    public AbstractC2916c mo12429d() {
        return this.f9281d;
    }

    /* renamed from: e */
    public List<String> mo12430e() {
        return this.f9278a;
    }

    /* renamed from: f */
    public boolean mo12431f() {
        return this.f9298u;
    }

    /* renamed from: g */
    public boolean mo12432g() {
        return this.f9299v;
    }

    /* renamed from: h */
    public List<String> mo12433h() {
        return this.f9279b;
    }

    /* renamed from: i */
    public List<String> mo12434i() {
        return this.f9280c;
    }

    /* renamed from: j */
    public JSONObject mo12435j() {
        return this.f9290m;
    }

    /* renamed from: k */
    public IHttpService mo12436k() {
        return this.f9292o;
    }

    /* renamed from: l */
    public Set<AbstractC20702g> mo12437l() {
        return this.f9293p;
    }

    /* renamed from: m */
    public boolean mo12438m() {
        return this.f9283f;
    }

    /* renamed from: n */
    public boolean mo12439n() {
        return this.f9284g;
    }

    /* renamed from: o */
    public boolean mo12440o() {
        return this.f9285h;
    }

    /* renamed from: p */
    public long mo12441p() {
        return this.f9286i;
    }

    /* renamed from: q */
    public long mo12442q() {
        return this.f9300w;
    }

    /* renamed from: r */
    public boolean mo12443r() {
        return this.f9288k;
    }

    /* renamed from: s */
    public AbstractC2915b mo12444s() {
        return this.f9301x;
    }

    /* renamed from: t */
    public AbstractC2914a mo12445t() {
        return this.f9302y;
    }

    /* renamed from: u */
    public AbstractC2918e mo12446u() {
        return this.f9303z;
    }

    /* renamed from: v */
    public ExecutorService mo12447v() {
        return this.f9275A;
    }

    /* renamed from: w */
    public AbstractC20699d mo12448w() {
        return this.f9294q;
    }

    /* renamed from: x */
    public boolean mo12449x() {
        return this.f9289l;
    }

    /* renamed from: y */
    public String mo12450y() {
        return this.f9276B;
    }

    /* renamed from: z */
    public AbstractC2919f mo12451z() {
        return this.f9277C;
    }

    /* renamed from: com.bytedance.apm.config.d$a */
    public static final class C2890a {

        /* renamed from: A */
        AbstractC20699d f9304A;

        /* renamed from: B */
        AbstractC2923c f9305B;

        /* renamed from: C */
        AbstractC3320b f9306C;

        /* renamed from: D */
        String f9307D;

        /* renamed from: E */
        AbstractC2917d f9308E;

        /* renamed from: a */
        boolean f9309a;

        /* renamed from: b */
        boolean f9310b;

        /* renamed from: c */
        boolean f9311c;

        /* renamed from: d */
        boolean f9312d;

        /* renamed from: e */
        boolean f9313e;

        /* renamed from: f */
        boolean f9314f;

        /* renamed from: g */
        long f9315g;

        /* renamed from: h */
        boolean f9316h;

        /* renamed from: i */
        boolean f9317i;

        /* renamed from: j */
        boolean f9318j;

        /* renamed from: k */
        boolean f9319k;

        /* renamed from: l */
        boolean f9320l;

        /* renamed from: m */
        List<String> f9321m;

        /* renamed from: n */
        List<String> f9322n;

        /* renamed from: o */
        List<String> f9323o;

        /* renamed from: p */
        JSONObject f9324p;

        /* renamed from: q */
        AbstractC2908b f9325q;

        /* renamed from: r */
        IHttpService f9326r;

        /* renamed from: s */
        Set<AbstractC20702g> f9327s;

        /* renamed from: t */
        long f9328t;

        /* renamed from: u */
        AbstractC2915b f9329u;

        /* renamed from: v */
        AbstractC2914a f9330v;

        /* renamed from: w */
        AbstractC2918e f9331w;

        /* renamed from: x */
        AbstractC2919f f9332x;

        /* renamed from: y */
        ExecutorService f9333y;

        /* renamed from: z */
        AbstractC2916c f9334z;

        /* renamed from: a */
        public C2890a mo12465a(boolean z) {
            this.f9312d = z && Build.VERSION.SDK_INT >= 21;
            return this;
        }

        /* renamed from: a */
        public C2890a mo12463a(List<String> list) {
            this.f9322n = list;
            return this;
        }

        /* renamed from: a */
        public C2890a mo12464a(JSONObject jSONObject) {
            try {
                C3121h.m12999a(this.f9324p, jSONObject);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public C2890a mo12462a(String str, String str2) {
            try {
                this.f9324p.put(str, str2);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public C2888d mo12466a() {
            C3132p.m13026a(this.f9324p.optString("aid"), "aid");
            C3132p.m13027b(this.f9324p.optString("app_version"), "app_version");
            C3132p.m13027b(this.f9324p.optString("update_version_code"), "update_version_code");
            C3132p.m13027b(this.f9324p.optString("device_id"), "device_id");
            return new C2888d(this);
        }

        C2890a() {
            this.f9318j = true;
            this.f9321m = C2905a.f9394a;
            this.f9322n = C2905a.f9396c;
            this.f9323o = C2905a.f9399f;
            this.f9324p = new JSONObject();
            this.f9327s = new HashSet();
            this.f9328t = 0;
            this.f9315g = 2500;
            this.f9304A = new AbstractC20699d() {
                /* class com.bytedance.apm.config.C2888d.C2890a.C28911 */

                @Override // com.bytedance.services.apm.api.AbstractC20699d
                /* renamed from: a */
                public byte[] mo12470a(byte[] bArr) {
                    return C14094b.m57065a(bArr, bArr.length);
                }
            };
            this.f9312d = C2904i.f9391a;
            this.f9316h = C2904i.f9392b;
            this.f9317i = C2904i.f9393c;
        }

        /* renamed from: a */
        public C2890a mo12453a(AbstractC2908b bVar) {
            this.f9325q = bVar;
            return this;
        }

        /* renamed from: b */
        public C2890a mo12467b(List<String> list) {
            this.f9323o = list;
            return this;
        }

        /* renamed from: c */
        public C2890a mo12469c(List<String> list) {
            this.f9321m = list;
            return this;
        }

        /* renamed from: a */
        public C2890a mo12454a(AbstractC2914a aVar) {
            this.f9330v = aVar;
            return this;
        }

        /* renamed from: a */
        public C2890a mo12452a(long j) {
            this.f9328t = Math.min(j, 30L);
            return this;
        }

        /* renamed from: b */
        public C2890a mo12468b(boolean z) {
            boolean z2;
            if (!z || Build.VERSION.SDK_INT < 21) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f9320l = z2;
            return this;
        }

        /* renamed from: a */
        public C2890a mo12455a(AbstractC2915b bVar) {
            this.f9329u = bVar;
            return this;
        }

        /* renamed from: a */
        public C2890a mo12456a(AbstractC2916c cVar) {
            this.f9334z = cVar;
            return this;
        }

        C2890a(C2888d dVar) {
            this.f9318j = true;
            this.f9321m = dVar.f9278a;
            this.f9322n = dVar.f9279b;
            this.f9323o = dVar.f9280c;
            this.f9312d = dVar.f9283f;
            this.f9313e = dVar.f9284g;
            this.f9314f = dVar.f9285h;
            this.f9315g = dVar.f9286i;
            this.f9316h = dVar.f9287j;
            this.f9319k = dVar.f9282e;
            this.f9320l = dVar.f9288k;
            this.f9324p = dVar.f9290m;
            this.f9325q = dVar.f9291n;
            this.f9327s = dVar.f9293p;
            this.f9326r = dVar.f9292o;
            this.f9330v = dVar.mo12445t();
            this.f9334z = dVar.f9281d;
            this.f9304A = dVar.f9294q;
            this.f9311c = dVar.f9289l;
            this.f9308E = dVar.f9295r;
        }

        /* renamed from: a */
        public C2890a mo12457a(AbstractC2917d dVar) {
            this.f9308E = dVar;
            return this;
        }

        /* renamed from: a */
        public C2890a mo12458a(IHttpService iHttpService) {
            this.f9326r = iHttpService;
            return this;
        }

        /* renamed from: a */
        public C2890a mo12459a(AbstractC20699d dVar) {
            this.f9304A = dVar;
            return this;
        }

        /* renamed from: a */
        public C2890a mo12460a(AbstractC20702g gVar) {
            if (gVar == null || (!C2785b.m11761e() && gVar.isOnlyMainProcess())) {
                return this;
            }
            this.f9327s.add(gVar);
            return this;
        }

        /* renamed from: a */
        public C2890a mo12461a(String str, int i) {
            try {
                this.f9324p.put(str, i);
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    /* renamed from: a */
    public static C2890a m12186a() {
        return new C2890a();
    }

    /* renamed from: a */
    public void mo12424a(List<String> list) {
        this.f9279b = list;
    }

    /* renamed from: b */
    public void mo12426b(List<String> list) {
        this.f9278a = list;
    }

    /* renamed from: c */
    public void mo12428c(List<String> list) {
        this.f9280c = list;
    }

    /* renamed from: a */
    public static C2890a m12187a(C2888d dVar) {
        return new C2890a(dVar);
    }

    private C2888d(C2890a aVar) {
        this.f9290m = aVar.f9324p;
        this.f9298u = aVar.f9309a;
        this.f9299v = aVar.f9310b;
        this.f9291n = aVar.f9325q;
        this.f9278a = aVar.f9321m;
        this.f9292o = aVar.f9326r;
        this.f9297t = aVar.f9318j;
        this.f9296s = aVar.f9317i;
        this.f9283f = aVar.f9312d;
        this.f9284g = aVar.f9313e;
        this.f9285h = aVar.f9314f;
        this.f9286i = aVar.f9315g;
        this.f9288k = aVar.f9320l;
        this.f9293p = aVar.f9327s;
        this.f9279b = aVar.f9322n;
        this.f9280c = aVar.f9323o;
        this.f9300w = aVar.f9328t;
        this.f9287j = aVar.f9316h;
        this.f9282e = aVar.f9319k;
        this.f9302y = aVar.f9330v;
        this.f9301x = aVar.f9329u;
        this.f9303z = aVar.f9331w;
        this.f9275A = aVar.f9333y;
        this.f9281d = aVar.f9334z;
        this.f9294q = aVar.f9304A;
        this.f9289l = aVar.f9311c;
        this.f9276B = aVar.f9307D;
        this.f9277C = aVar.f9332x;
        this.f9295r = aVar.f9308E;
        C2921a.m12353a(aVar.f9305B);
        C2921a.m12354a(aVar.f9306C);
    }
}
