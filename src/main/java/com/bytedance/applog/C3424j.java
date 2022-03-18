package com.bytedance.applog;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.applog.network.AbstractC3450b;
import com.bytedance.applog.util.C3453c;
import com.bytedance.dr.AbstractC4018m;
import com.bytedance.p216c.AbstractC3586a;
import java.util.Map;

/* renamed from: com.bytedance.applog.j */
public class C3424j {

    /* renamed from: A */
    private Account f10842A;

    /* renamed from: B */
    private boolean f10843B;

    /* renamed from: C */
    private AbstractC3450b f10844C = new C3453c();

    /* renamed from: D */
    private AbstractC3450b f10845D;

    /* renamed from: E */
    private boolean f10846E = true;

    /* renamed from: F */
    private boolean f10847F;

    /* renamed from: G */
    private boolean f10848G = false;

    /* renamed from: H */
    private boolean f10849H = true;

    /* renamed from: I */
    private boolean f10850I = false;

    /* renamed from: J */
    private boolean f10851J = false;

    /* renamed from: K */
    private boolean f10852K = true;

    /* renamed from: L */
    private String f10853L = "bd_tea_agent.db";

    /* renamed from: M */
    private String f10854M = "applog_stats";

    /* renamed from: N */
    private AbstractC4018m f10855N;

    /* renamed from: O */
    private boolean f10856O = true;

    /* renamed from: P */
    private boolean f10857P = true;

    /* renamed from: Q */
    private boolean f10858Q;

    /* renamed from: R */
    private AbstractC3425a f10859R = null;

    /* renamed from: a */
    private String f10860a;

    /* renamed from: b */
    private boolean f10861b = true;

    /* renamed from: c */
    private String f10862c;

    /* renamed from: d */
    private String f10863d;

    /* renamed from: e */
    private AbstractC3586a f10864e;

    /* renamed from: f */
    private String f10865f;

    /* renamed from: g */
    private String f10866g;

    /* renamed from: h */
    private AbstractC3419f f10867h;

    /* renamed from: i */
    private String f10868i;

    /* renamed from: j */
    private AbstractC3422h f10869j;

    /* renamed from: k */
    private boolean f10870k;

    /* renamed from: l */
    private boolean f10871l;

    /* renamed from: m */
    private boolean f10872m;

    /* renamed from: n */
    private int f10873n;

    /* renamed from: o */
    private String f10874o;

    /* renamed from: p */
    private boolean f10875p;

    /* renamed from: q */
    private String f10876q;

    /* renamed from: r */
    private C3426k f10877r;

    /* renamed from: s */
    private String f10878s;

    /* renamed from: t */
    private String f10879t;

    /* renamed from: u */
    private int f10880u;

    /* renamed from: v */
    private int f10881v;

    /* renamed from: w */
    private int f10882w;

    /* renamed from: x */
    private String f10883x;

    /* renamed from: y */
    private String f10884y;

    /* renamed from: z */
    private Map<String, Object> f10885z;

    /* renamed from: com.bytedance.applog.j$a */
    public interface AbstractC3425a {
        /* renamed from: a */
        boolean mo13772a(String[] strArr);
    }

    /* renamed from: d */
    public void mo13748d(boolean z) {
    }

    /* renamed from: A */
    public int mo13721A() {
        return this.f10881v;
    }

    /* renamed from: B */
    public int mo13722B() {
        return this.f10882w;
    }

    /* renamed from: C */
    public String mo13723C() {
        return this.f10883x;
    }

    /* renamed from: D */
    public String mo13724D() {
        return this.f10884y;
    }

    /* renamed from: E */
    public boolean mo13725E() {
        return this.f10847F;
    }

    /* renamed from: F */
    public boolean mo13726F() {
        return this.f10846E;
    }

    /* renamed from: G */
    public boolean mo13727G() {
        return this.f10848G;
    }

    /* renamed from: H */
    public boolean mo13728H() {
        return this.f10849H;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo13729I() {
        return this.f10851J;
    }

    /* renamed from: J */
    public boolean mo13730J() {
        return this.f10852K;
    }

    /* renamed from: K */
    public String mo13731K() {
        return this.f10853L;
    }

    /* renamed from: L */
    public String mo13732L() {
        return this.f10854M;
    }

    /* renamed from: M */
    public AbstractC4018m mo13733M() {
        return this.f10855N;
    }

    /* renamed from: N */
    public boolean mo13734N() {
        return this.f10858Q;
    }

    /* renamed from: O */
    public AbstractC3425a mo13735O() {
        return this.f10859R;
    }

    /* renamed from: a */
    public AbstractC3419f mo13736a() {
        return this.f10867h;
    }

    /* renamed from: c */
    public String mo13746c() {
        return this.f10874o;
    }

    /* renamed from: e */
    public Map<String, Object> mo13750e() {
        return this.f10885z;
    }

    /* renamed from: f */
    public boolean mo13751f() {
        return this.f10872m;
    }

    /* renamed from: g */
    public String mo13752g() {
        return this.f10860a;
    }

    /* renamed from: h */
    public String mo13753h() {
        return this.f10862c;
    }

    /* renamed from: i */
    public String mo13754i() {
        return this.f10865f;
    }

    /* renamed from: j */
    public String mo13755j() {
        return this.f10866g;
    }

    /* renamed from: k */
    public String mo13756k() {
        return this.f10868i;
    }

    /* renamed from: l */
    public int mo13757l() {
        return this.f10873n;
    }

    /* renamed from: m */
    public AbstractC3422h mo13758m() {
        return this.f10869j;
    }

    /* renamed from: n */
    public boolean mo13759n() {
        return this.f10850I;
    }

    /* renamed from: o */
    public C3426k mo13760o() {
        return this.f10877r;
    }

    /* renamed from: p */
    public AbstractC3586a mo13761p() {
        return this.f10864e;
    }

    /* renamed from: q */
    public boolean mo13762q() {
        return this.f10870k;
    }

    /* renamed from: r */
    public boolean mo13763r() {
        return this.f10871l;
    }

    /* renamed from: s */
    public Account mo13764s() {
        return this.f10842A;
    }

    /* renamed from: t */
    public boolean mo13765t() {
        return this.f10843B;
    }

    /* renamed from: u */
    public String mo13766u() {
        return this.f10863d;
    }

    /* renamed from: w */
    public String mo13768w() {
        return this.f10876q;
    }

    /* renamed from: x */
    public String mo13769x() {
        return this.f10878s;
    }

    /* renamed from: y */
    public String mo13770y() {
        return this.f10879t;
    }

    /* renamed from: z */
    public int mo13771z() {
        return this.f10880u;
    }

    /* renamed from: b */
    public boolean mo13745b() {
        return this.f10861b;
    }

    /* renamed from: d */
    public boolean mo13749d() {
        return this.f10875p;
    }

    /* renamed from: v */
    public AbstractC3450b mo13767v() {
        AbstractC3450b bVar = this.f10845D;
        if (bVar != null) {
            return bVar;
        }
        return this.f10844C;
    }

    /* renamed from: b */
    public void mo13744b(boolean z) {
        this.f10847F = z;
    }

    /* renamed from: a */
    public C3424j mo13737a(int i) {
        this.f10881v = i;
        return this;
    }

    /* renamed from: c */
    public void mo13747c(boolean z) {
        this.f10846E = z;
    }

    /* renamed from: a */
    public C3424j mo13738a(AbstractC3419f fVar) {
        this.f10867h = fVar;
        return this;
    }

    /* renamed from: a */
    public C3424j mo13739a(AbstractC3425a aVar) {
        this.f10859R = aVar;
        return this;
    }

    /* renamed from: a */
    public C3424j mo13740a(C3426k kVar) {
        this.f10877r = kVar;
        return this;
    }

    /* renamed from: a */
    public C3424j mo13741a(AbstractC3450b bVar) {
        this.f10845D = bVar;
        return this;
    }

    /* renamed from: a */
    public C3424j mo13742a(AbstractC3586a aVar) {
        this.f10864e = aVar;
        return this;
    }

    /* renamed from: a */
    public C3424j mo13743a(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.f10873n = i;
        return this;
    }

    public C3424j(String str, String str2) {
        this.f10860a = str;
        this.f10862c = str2;
        if (TextUtils.isEmpty(str2)) {
            Log.e("InitConfig", "channel is empty, please check!!!");
        }
    }
}
