package com.ss.android.videoshop.p3195b;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.videoshop.p3202h.C64169a;
import com.ss.ttvideoengine.DataSource;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.preloader.TTAVPreloaderItem;
import java.util.Map;

/* renamed from: com.ss.android.videoshop.b.b */
public class C64116b {

    /* renamed from: A */
    private String f161872A;

    /* renamed from: B */
    private String f161873B;

    /* renamed from: C */
    private String f161874C;

    /* renamed from: D */
    private boolean f161875D;

    /* renamed from: E */
    private boolean f161876E;

    /* renamed from: F */
    private Map<String, String> f161877F;

    /* renamed from: G */
    private C64169a f161878G = C64169a.m252178a();

    /* renamed from: a */
    private String f161879a;

    /* renamed from: b */
    private long f161880b;

    /* renamed from: c */
    private int f161881c = 0;

    /* renamed from: d */
    private long f161882d = 0;

    /* renamed from: e */
    private String f161883e = null;

    /* renamed from: f */
    private long f161884f = 0;

    /* renamed from: g */
    private long f161885g = -1;

    /* renamed from: h */
    private int f161886h;

    /* renamed from: i */
    private int f161887i;

    /* renamed from: j */
    private String f161888j;

    /* renamed from: k */
    private Bundle f161889k;

    /* renamed from: l */
    private VideoModel f161890l;

    /* renamed from: m */
    private String f161891m;

    /* renamed from: n */
    private String f161892n;

    /* renamed from: o */
    private String f161893o;

    /* renamed from: p */
    private String f161894p;

    /* renamed from: q */
    private String f161895q;

    /* renamed from: r */
    private DataSource f161896r;

    /* renamed from: s */
    private C64115a f161897s;

    /* renamed from: t */
    private TTAVPreloaderItem f161898t;

    /* renamed from: u */
    private String f161899u;

    /* renamed from: v */
    private String f161900v;

    /* renamed from: w */
    private int f161901w;

    /* renamed from: x */
    private String f161902x;

    /* renamed from: y */
    private String f161903y;

    /* renamed from: z */
    private String f161904z;

    /* renamed from: A */
    public DataSource mo221924A() {
        return this.f161896r;
    }

    /* renamed from: B */
    public String mo221925B() {
        return this.f161899u;
    }

    /* renamed from: C */
    public String mo221926C() {
        return this.f161900v;
    }

    /* renamed from: c */
    public long mo221935c() {
        return this.f161885g;
    }

    /* renamed from: d */
    public Bundle mo221937d() {
        return this.f161889k;
    }

    /* renamed from: g */
    public String mo221944g() {
        return this.f161891m;
    }

    /* renamed from: h */
    public String mo221946h() {
        return this.f161892n;
    }

    /* renamed from: i */
    public int mo221949i() {
        return this.f161886h;
    }

    /* renamed from: j */
    public int mo221950j() {
        return this.f161887i;
    }

    /* renamed from: k */
    public String mo221951k() {
        return this.f161895q;
    }

    /* renamed from: l */
    public String mo221952l() {
        return this.f161888j;
    }

    /* renamed from: m */
    public int mo221953m() {
        return this.f161901w;
    }

    /* renamed from: n */
    public String mo221954n() {
        return this.f161902x;
    }

    /* renamed from: o */
    public String mo221955o() {
        return this.f161903y;
    }

    /* renamed from: p */
    public String mo221956p() {
        return this.f161904z;
    }

    /* renamed from: q */
    public String mo221957q() {
        return this.f161872A;
    }

    /* renamed from: r */
    public String mo221958r() {
        return this.f161873B;
    }

    /* renamed from: s */
    public String mo221959s() {
        return this.f161874C;
    }

    /* renamed from: t */
    public C64169a mo221960t() {
        return this.f161878G;
    }

    /* renamed from: u */
    public boolean mo221961u() {
        return this.f161875D;
    }

    /* renamed from: v */
    public C64115a mo221962v() {
        return this.f161897s;
    }

    /* renamed from: w */
    public boolean mo221963w() {
        return this.f161876E;
    }

    /* renamed from: x */
    public String mo221964x() {
        return this.f161893o;
    }

    /* renamed from: y */
    public String mo221965y() {
        return this.f161894p;
    }

    /* renamed from: b */
    public String mo221934b() {
        return this.f161879a;
    }

    /* renamed from: e */
    public VideoModel mo221940e() {
        return this.f161890l;
    }

    /* renamed from: f */
    public TTAVPreloaderItem mo221943f() {
        return this.f161898t;
    }

    /* renamed from: z */
    public boolean mo221966z() {
        return !TextUtils.isEmpty(this.f161893o);
    }

    /* renamed from: a */
    public Map<String, String> mo221931a() {
        return this.f161877F;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str = this.f161879a;
        int i9 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = i * 31;
        String str2 = this.f161891m;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        String str3 = this.f161892n;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        TTAVPreloaderItem tTAVPreloaderItem = this.f161898t;
        if (tTAVPreloaderItem != null) {
            i4 = tTAVPreloaderItem.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        C64115a aVar = this.f161897s;
        if (aVar != null) {
            i5 = aVar.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        String str4 = this.f161893o;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 31;
        String str5 = this.f161894p;
        if (str5 != null) {
            i7 = str5.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 31;
        String str6 = this.f161900v;
        if (str6 != null) {
            i8 = str6.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 31;
        String str7 = this.f161899u;
        if (str7 != null) {
            i9 = str7.hashCode();
        }
        return ((i17 + i9) * 31) + ((int) (this.f161880b * 31));
    }

    /* renamed from: a */
    public C64116b mo221927a(Bundle bundle) {
        this.f161889k = bundle;
        return this;
    }

    /* renamed from: b */
    public C64116b mo221933b(String str) {
        this.f161892n = str;
        return this;
    }

    /* renamed from: e */
    public C64116b mo221939e(String str) {
        this.f161893o = str;
        return this;
    }

    /* renamed from: f */
    public C64116b mo221942f(String str) {
        this.f161894p = str;
        return this;
    }

    /* renamed from: a */
    public C64116b mo221928a(C64169a aVar) {
        this.f161878G = aVar;
        return this;
    }

    /* renamed from: c */
    public C64116b mo221936c(String str) {
        this.f161873B = str;
        return this;
    }

    /* renamed from: d */
    public C64116b mo221938d(String str) {
        this.f161874C = str;
        return this;
    }

    /* renamed from: g */
    public void mo221945g(String str) {
        this.f161899u = str;
    }

    /* renamed from: h */
    public void mo221947h(String str) {
        this.f161900v = str;
    }

    /* renamed from: a */
    public C64116b mo221929a(String str) {
        this.f161891m = str;
        return this;
    }

    /* renamed from: a */
    public C64116b mo221930a(boolean z) {
        this.f161876E = z;
        return this;
    }

    /* renamed from: a */
    public void mo221932a(Map<String, String> map) {
        this.f161877F = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C64116b bVar = (C64116b) obj;
        if (this.f161880b == bVar.f161880b && m251655a(this.f161879a, bVar.f161879a) && m251655a(this.f161890l, bVar.f161890l) && m251655a(this.f161891m, bVar.f161891m) && m251655a(this.f161892n, bVar.f161892n) && m251655a(this.f161897s, bVar.f161897s) && m251655a(this.f161893o, bVar.f161893o) && m251655a(this.f161894p, bVar.f161894p) && m251655a(this.f161900v, bVar.f161900v) && m251655a(this.f161899u, bVar.f161899u)) {
            return m251655a(this.f161898t, bVar.f161898t);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m251655a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }
}
