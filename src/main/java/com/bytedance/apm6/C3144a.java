package com.bytedance.apm6;

import android.content.Context;
import android.util.Pair;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.C2920e;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3113c;
import com.bytedance.apm6.p160b.p161a.AbstractC3210g;
import com.bytedance.apm6.p174e.AbstractC3303b;
import com.bytedance.apm6.p174e.C3274a;
import com.bytedance.apm6.p177f.AbstractC3304a;
import com.bytedance.apm6.p177f.p179b.AbstractC3311b;
import com.bytedance.apm6.p187i.p188a.AbstractC3333a;
import com.bytedance.apm6.p187i.p189b.AbstractC3335a;
import com.bytedance.frameworks.core.p747a.C14092a;
import com.bytedance.services.apm.api.AbstractC20699d;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.slardar.config.AbstractC20705b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.a */
public class C3144a {

    /* renamed from: a */
    private static List<AbstractC20705b> f10087a;

    /* renamed from: a */
    public static void m13090a(final Context context) {
        C3274a.m13680a(new AbstractC3303b() {
            /* class com.bytedance.apm6.C3144a.C31451 */

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: b */
            public Context mo13067b() {
                return context;
            }

            /* access modifiers changed from: protected */
            @Override // com.bytedance.apm6.p174e.AbstractC3303b
            /* renamed from: a */
            public IHttpService mo13066a() {
                return C2785b.m11776q();
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: g */
            public String mo13072g() {
                return C2785b.m11756d();
            }

            /* access modifiers changed from: protected */
            @Override // com.bytedance.apm6.p174e.AbstractC3303b
            /* renamed from: p */
            public AbstractC3335a mo13081p() {
                return new AbstractC3335a() {
                    /* class com.bytedance.apm6.C3144a.C31451.C31461 */

                    @Override // com.bytedance.apm6.p187i.p189b.AbstractC3335a
                    /* renamed from: a */
                    public String mo13089a(String str, List<Pair<String, String>> list) {
                        return C14092a.m57057a(str, list);
                    }
                };
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b, com.bytedance.apm6.p174e.AbstractC3303b
            /* renamed from: r */
            public JSONObject mo13083r() {
                return super.mo13083r();
            }

            /* access modifiers changed from: protected */
            @Override // com.bytedance.apm6.p174e.AbstractC3303b
            /* renamed from: t */
            public AbstractC3210g mo13085t() {
                return new AbstractC3210g() {
                    /* class com.bytedance.apm6.C3144a.C31451.C31472 */

                    @Override // com.bytedance.apm6.p160b.p161a.AbstractC3210g
                    /* renamed from: a */
                    public void mo13090a(final JSONObject jSONObject) {
                        if (C2785b.m11761e()) {
                            C3047b.m12756a().mo12886a(new Runnable() {
                                /* class com.bytedance.apm6.C3144a.C31451.C31472.RunnableC31481 */

                                public void run() {
                                    C3144a.m13092a(jSONObject);
                                }
                            });
                        }
                    }
                };
            }

            /* access modifiers changed from: protected */
            @Override // com.bytedance.apm6.p174e.AbstractC3303b
            /* renamed from: u */
            public AbstractC3311b mo13086u() {
                return new C3211c();
            }

            /* access modifiers changed from: protected */
            @Override // com.bytedance.apm6.p174e.AbstractC3303b
            /* renamed from: v */
            public AbstractC3304a mo13087v() {
                return new C3158b();
            }

            /* access modifiers changed from: protected */
            @Override // com.bytedance.apm6.p174e.AbstractC3303b
            /* renamed from: w */
            public AbstractC3333a mo13088w() {
                return new AbstractC3333a() {
                    /* class com.bytedance.apm6.C3144a.C31451.C31493 */

                    @Override // com.bytedance.apm6.p187i.p188a.AbstractC3333a
                    /* renamed from: a */
                    public JSONObject mo13092a() {
                        JSONObject jSONObject = new JSONObject();
                        C3113c.m12960a().mo13051f(jSONObject);
                        return jSONObject;
                    }
                };
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: c */
            public int mo13068c() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12602a();
                }
                return 0;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: d */
            public String mo13069d() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12607b();
                }
                return null;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: e */
            public long mo13070e() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12610c();
                }
                return 0;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: f */
            public String mo13071f() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12613d();
                }
                return null;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: h */
            public String mo13073h() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12616e();
                }
                return null;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: i */
            public int mo13074i() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12618f();
                }
                return 0;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: j */
            public String mo13075j() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12620g();
                }
                return null;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: k */
            public int mo13076k() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12618f();
                }
                return 0;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: l */
            public String mo13077l() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12622i();
                }
                return null;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: m */
            public String mo13078m() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12623j();
                }
                return null;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b
            /* renamed from: n */
            public int mo13079n() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12621h();
                }
                return 0;
            }

            /* access modifiers changed from: protected */
            @Override // com.bytedance.apm6.p174e.AbstractC3303b
            /* renamed from: o */
            public AbstractC20699d mo13080o() {
                return ApmDelegate.m12591a().mo12795h();
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b, com.bytedance.apm6.p174e.AbstractC3303b
            /* renamed from: q */
            public JSONObject mo13082q() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12624k();
                }
                return null;
            }

            @Override // com.bytedance.apm6.foundation.p182a.AbstractC3319b, com.bytedance.apm6.p174e.AbstractC3303b
            /* renamed from: s */
            public Map<String, String> mo13084s() {
                C2920e m = C2785b.m11772m();
                if (m != null) {
                    return m.mo12625l();
                }
                return null;
            }
        });
    }

    /* renamed from: b */
    public static void m13093b(AbstractC20705b bVar) {
        List<AbstractC20705b> list;
        if (bVar != null && (list = f10087a) != null) {
            list.remove(bVar);
        }
    }

    /* renamed from: a */
    public static void m13091a(AbstractC20705b bVar) {
        if (bVar != null) {
            if (f10087a == null) {
                f10087a = new CopyOnWriteArrayList();
            }
            if (!f10087a.contains(bVar)) {
                f10087a.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public static void m13092a(JSONObject jSONObject) {
        List<AbstractC20705b> list = f10087a;
        if (list != null) {
            for (AbstractC20705b bVar : list) {
                bVar.mo69907a(jSONObject);
            }
        }
    }
}
