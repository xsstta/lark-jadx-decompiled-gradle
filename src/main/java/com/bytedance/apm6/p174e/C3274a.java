package com.bytedance.apm6.p174e;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.C2931f;
import com.bytedance.apm.config.AbstractC2896g;
import com.bytedance.apm.launch.C3040d;
import com.bytedance.apm.trace.C3088b;
import com.bytedance.apm6.cpu.collect.C3233a;
import com.bytedance.apm6.cpu.p169a.AbstractC3228b;
import com.bytedance.apm6.cpu.p170b.C3230a;
import com.bytedance.apm6.foundation.C3317a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.foundation.safety.C3323b;
import com.bytedance.apm6.p157a.C3150a;
import com.bytedance.apm6.p157a.p158a.AbstractC3153b;
import com.bytedance.apm6.p160b.p161a.AbstractC3210g;
import com.bytedance.apm6.p160b.p161a.C3203e;
import com.bytedance.apm6.p160b.p161a.p162a.AbstractC3161b;
import com.bytedance.apm6.p160b.p161a.p166e.AbstractC3205b;
import com.bytedance.apm6.p160b.p161a.p166e.C3204a;
import com.bytedance.apm6.p160b.p161a.p166e.C3206c;
import com.bytedance.apm6.p167c.C3212a;
import com.bytedance.apm6.p167c.p168a.AbstractC3215b;
import com.bytedance.apm6.p172d.C3268a;
import com.bytedance.apm6.p172d.p173a.AbstractC3272b;
import com.bytedance.apm6.p174e.p175a.C3293c;
import com.bytedance.apm6.p174e.p175a.C3295d;
import com.bytedance.apm6.p174e.p175a.p176a.C3286a;
import com.bytedance.apm6.p177f.AbstractC3304a;
import com.bytedance.apm6.p177f.C3306b;
import com.bytedance.apm6.p177f.p179b.AbstractC3311b;
import com.bytedance.apm6.p183g.C3324a;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.apm6.p187i.AbstractC3332a;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p188a.AbstractC3333a;
import com.bytedance.apm6.p187i.p189b.AbstractC3335a;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.p187i.p192e.AbstractC3341a;
import com.bytedance.apm6.p187i.p192e.AbstractC3343b;
import com.bytedance.apm6.util.C3356f;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import com.bytedance.services.apm.api.AbstractC20699d;
import com.bytedance.services.apm.api.IHttpService;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.e.a */
public class C3274a {

    /* renamed from: a */
    private static volatile boolean f10480a;

    /* renamed from: c */
    private static void m13682c() {
        C3206c.m13399a().mo13289a(new AbstractC3205b() {
            /* class com.bytedance.apm6.p174e.C3274a.AnonymousClass10 */

            @Override // com.bytedance.apm6.p160b.p161a.p166e.AbstractC3205b
            /* renamed from: a */
            public void mo13287a(List<C3204a> list) {
                if (!C3356f.m13964a(list)) {
                    JSONObject jSONObject = new JSONObject();
                    for (C3204a aVar : list) {
                        try {
                            jSONObject.put("before_size_" + aVar.mo13281a(), aVar.mo13284b());
                            jSONObject.put("after_size_" + aVar.mo13281a(), aVar.mo13286c());
                        } catch (Exception unused) {
                        }
                    }
                    C3150a.m13132a("apm_db_size", (JSONObject) null, jSONObject, (JSONObject) null);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m13679a() {
        C3203e.m13385a().mo13279b();
        C3233a.m13533a().mo13393f();
        C3306b.m13762a().mo13525e();
    }

    /* renamed from: b */
    public static void m13681b() {
        C3203e.m13385a().mo13280c();
        C3233a.m13533a().mo13394g();
        C3306b.m13762a().mo13524d();
    }

    /* renamed from: a */
    public static synchronized void m13680a(final AbstractC3303b bVar) {
        synchronized (C3274a.class) {
            if (!f10480a) {
                f10480a = true;
                C3318a.m13821a(bVar);
                C3318a.m13823b(System.currentTimeMillis());
                C3318a.m13819a(System.currentTimeMillis());
                if (C3318a.m13915u()) {
                    C3350b.m13932a("APM-Hub", "APM init start in process " + bVar.mo13072g());
                }
                C3350b.m13931a(new C3323b());
                C3336c.m13902a(IHttpService.class, (AbstractC3332a) new AbstractC3332a<IHttpService>() {
                    /* class com.bytedance.apm6.p174e.C3274a.C32751 */

                    /* renamed from: a */
                    public IHttpService mo13480b() {
                        return bVar.mo13066a();
                    }
                });
                C3336c.m13902a(AbstractC3161b.class, (AbstractC3332a) new AbstractC3332a<AbstractC3161b>() {
                    /* class com.bytedance.apm6.p174e.C3274a.AnonymousClass11 */

                    /* renamed from: a */
                    public AbstractC3161b mo13480b() {
                        return bVar.mo13517y();
                    }
                });
                C3336c.m13902a(AbstractC3153b.class, (AbstractC3332a) new AbstractC3332a<AbstractC3153b>() {
                    /* class com.bytedance.apm6.p174e.C3274a.AnonymousClass12 */

                    /* renamed from: a */
                    public AbstractC3153b mo13480b() {
                        return bVar.mo13518z();
                    }
                });
                C3336c.m13902a(AbstractC3228b.class, (AbstractC3332a) new AbstractC3332a<AbstractC3228b>() {
                    /* class com.bytedance.apm6.p174e.C3274a.AnonymousClass13 */

                    /* renamed from: a */
                    public AbstractC3228b mo13480b() {
                        return bVar.mo13514A();
                    }
                });
                C3336c.m13902a(AbstractC2896g.class, (AbstractC3332a) new AbstractC3332a<AbstractC2896g>() {
                    /* class com.bytedance.apm6.p174e.C3274a.AnonymousClass14 */

                    /* renamed from: a */
                    public AbstractC2896g mo13480b() {
                        return bVar.mo13515B();
                    }
                });
                C3336c.m13902a(AbstractC3338a.class, (AbstractC3332a) new AbstractC3332a<AbstractC3338a>() {
                    /* class com.bytedance.apm6.p174e.C3274a.AnonymousClass15 */

                    /* renamed from: a */
                    public AbstractC3338a mo13480b() {
                        return new C3317a();
                    }
                });
                C3336c.m13902a(AbstractC20699d.class, (AbstractC3332a) new AbstractC3332a<AbstractC20699d>() {
                    /* class com.bytedance.apm6.p174e.C3274a.AnonymousClass16 */

                    /* renamed from: a */
                    public AbstractC20699d mo13480b() {
                        return bVar.mo13080o();
                    }
                });
                C3336c.m13902a(AbstractC3335a.class, (AbstractC3332a) new AbstractC3332a<AbstractC3335a>() {
                    /* class com.bytedance.apm6.p174e.C3274a.AnonymousClass17 */

                    /* renamed from: a */
                    public AbstractC3335a mo13480b() {
                        return bVar.mo13081p();
                    }
                });
                C3336c.m13902a(AbstractC3343b.class, (AbstractC3332a) new AbstractC3332a<AbstractC3343b>() {
                    /* class com.bytedance.apm6.p174e.C3274a.AnonymousClass18 */

                    /* renamed from: a */
                    public AbstractC3343b mo13480b() {
                        return C3331c.m13887a();
                    }
                });
                new C3317a();
                C3336c.m13902a(AbstractC3311b.class, (AbstractC3332a) new AbstractC3332a<AbstractC3311b>() {
                    /* class com.bytedance.apm6.p174e.C3274a.C32762 */

                    /* renamed from: a */
                    public AbstractC3311b mo13480b() {
                        return bVar.mo13086u();
                    }
                });
                C3336c.m13902a(AbstractC3304a.class, (AbstractC3332a) new AbstractC3332a<AbstractC3304a>() {
                    /* class com.bytedance.apm6.p174e.C3274a.C32773 */

                    /* renamed from: a */
                    public AbstractC3304a mo13480b() {
                        return bVar.mo13087v();
                    }
                });
                C3336c.m13902a(AbstractC3333a.class, (AbstractC3332a) new AbstractC3332a<AbstractC3333a>() {
                    /* class com.bytedance.apm6.p174e.C3274a.C32784 */

                    /* renamed from: a */
                    public AbstractC3333a mo13480b() {
                        return bVar.mo13088w();
                    }
                });
                C3336c.m13902a(AbstractC3215b.class, (AbstractC3332a) new AbstractC3332a<AbstractC3215b>() {
                    /* class com.bytedance.apm6.p174e.C3274a.C32795 */

                    /* renamed from: a */
                    public AbstractC3215b mo13480b() {
                        return new C3293c();
                    }
                });
                C3336c.m13902a(AbstractC3341a.class, (AbstractC3332a) new AbstractC3332a<AbstractC3341a>() {
                    /* class com.bytedance.apm6.p174e.C3274a.C32806 */

                    /* renamed from: a */
                    public AbstractC3341a mo13480b() {
                        return C3230a.m13514a();
                    }
                });
                C3336c.m13902a(AbstractC3210g.class, (AbstractC3332a) new AbstractC3332a<AbstractC3210g>() {
                    /* class com.bytedance.apm6.p174e.C3274a.C32817 */

                    /* renamed from: a */
                    public AbstractC3210g mo13480b() {
                        return bVar.mo13085t();
                    }
                });
                C3336c.m13902a(AbstractC3272b.class, (AbstractC3332a) new AbstractC3332a<AbstractC3272b>() {
                    /* class com.bytedance.apm6.p174e.C3274a.C32828 */

                    /* renamed from: a */
                    public AbstractC3272b mo13480b() {
                        return new C3295d();
                    }
                });
                C3286a.m13719a().mo13501b();
                C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(new AbstractRunnableC3362a(bVar.mo13516x()) {
                    /* class com.bytedance.apm6.p174e.C3274a.C32839 */

                    public void run() {
                        C3324a.m13873a(C3203e.m13385a());
                        C3306b.m13762a().mo13522b();
                        if (C3318a.m13827e()) {
                            C3212a.m13412a().mo13296b();
                        }
                        C3233a.m13533a().mo13389b();
                        C2931f.m12389a().mo12637b();
                        if (C3318a.m13827e()) {
                            C3040d.m12727a();
                            C2785b.m11765g(C3088b.m12873c());
                        }
                        if (C3318a.m13827e()) {
                            C3268a.m13662a().mo13469b();
                        }
                    }
                });
                m13682c();
            }
        }
    }
}
