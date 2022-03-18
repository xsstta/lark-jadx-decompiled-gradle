package com.bytedance.ttnet.diagnosis;

import com.bytedance.frameworks.baselib.network.http.cronet.p743a.AbstractC13987a;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ttnet.diagnosis.a */
public class C20769a implements IDiagnosisRequest {

    /* renamed from: b */
    private static final String f50884b = "a";

    /* renamed from: a */
    public IDiagnosisCallback f50885a;

    /* renamed from: c */
    private int f50886c;

    /* renamed from: d */
    private List<String> f50887d;

    /* renamed from: e */
    private int f50888e;

    /* renamed from: f */
    private int f50889f;

    /* renamed from: g */
    private boolean f50890g = false;

    /* renamed from: h */
    private boolean f50891h = false;

    /* renamed from: i */
    private String f50892i;

    /* renamed from: j */
    private AbstractC13987a.AbstractC13988a f50893j = new C20770a();

    /* renamed from: k */
    private AbstractC13987a f50894k;

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void cancel() {
        synchronized (this) {
            if (this.f50890g) {
                if (!this.f50891h) {
                    this.f50894k.cancel();
                    this.f50891h = true;
                }
            }
        }
    }

    /* renamed from: a */
    private void m75674a() throws Exception {
        if (this.f50894k == null) {
            Class<?> a = m75673a("org.chromium.diagnosis.CronetDiagnosisRequestImpl");
            if (a != null) {
                Object newInstance = a.getDeclaredConstructor(AbstractC13987a.AbstractC13988a.class, Integer.TYPE, List.class, Integer.TYPE, Integer.TYPE).newInstance(this.f50893j, Integer.valueOf(this.f50886c), this.f50887d, Integer.valueOf(this.f50888e), Integer.valueOf(this.f50889f));
                if (newInstance instanceof AbstractC13987a) {
                    this.f50894k = (AbstractC13987a) newInstance;
                    return;
                }
                return;
            }
            throw new ClassNotFoundException("org.chromium.diagnosis.CronetDiagnosisRequestImpl class not found");
        }
    }

    /* renamed from: com.bytedance.ttnet.diagnosis.a$a */
    class C20770a implements AbstractC13987a.AbstractC13988a {
        C20770a() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.cronet.p743a.AbstractC13987a.AbstractC13988a
        /* renamed from: a */
        public void mo51516a(String str) {
            if (C20769a.this.f50885a != null) {
                C20769a.this.f50885a.onDiagnosisComplete(str);
            }
        }
    }

    /* renamed from: a */
    private Class<?> m75673a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void setUserExtraInfo(String str) {
        synchronized (this) {
            this.f50892i = str;
            doExtraCommand("extra_info", str);
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void start(IDiagnosisCallback iDiagnosisCallback) {
        synchronized (this) {
            if (!this.f50890g) {
                this.f50885a = iDiagnosisCallback;
                this.f50894k.start();
                this.f50890g = true;
                String str = this.f50892i;
                if (str != null && !str.isEmpty()) {
                    doExtraCommand("extra_info", this.f50892i);
                }
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void doExtraCommand(String str, String str2) {
        synchronized (this) {
            if (this.f50890g) {
                this.f50894k.doExtraCommand(str, str2);
            }
        }
    }

    public C20769a(int i, List<String> list, int i2, int i3) throws Exception {
        this.f50886c = i;
        this.f50887d = list;
        this.f50888e = i2;
        this.f50889f = i3;
        m75674a();
    }
}
