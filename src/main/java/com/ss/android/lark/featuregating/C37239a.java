package com.ss.android.lark.featuregating;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.featuregating.p1844a.AbstractC37244b;
import com.ss.android.lark.featuregating.p1844a.AbstractC37245c;
import com.ss.android.lark.featuregating.p1845b.C37246a;
import com.ss.android.lark.featuregating.p1846c.AbstractC37250a;
import com.ss.android.lark.featuregating.service.impl.C37252a;
import com.ss.android.lark.featuregating.service.impl.C37256c;
import com.ss.android.lark.featuregating.service.impl.C37257d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57762aa;
import com.ss.android.lark.utils.LarkContext;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.lark.featuregating.a */
public class C37239a {

    /* renamed from: a */
    private static boolean f95636a;

    /* renamed from: b */
    private static CountDownLatch f95637b = new CountDownLatch(1);

    /* renamed from: c */
    private static volatile AbstractC37245c f95638c;

    /* renamed from: d */
    private static C57762aa f95639d = new C57762aa();

    /* renamed from: a */
    public static AbstractC37245c m146644a() {
        m146651e();
        return f95638c;
    }

    /* renamed from: d */
    private static void m146650d() {
        f95637b.countDown();
        f95636a = true;
    }

    /* renamed from: b */
    public static AbstractC37250a m146648b() {
        m146651e();
        return (AbstractC37250a) f95639d.mo196049a(AbstractC37250a.class, new C57762aa.AbstractC57763a<AbstractC37250a>() {
            /* class com.ss.android.lark.featuregating.C37239a.C372401 */

            /* renamed from: a */
            public AbstractC37250a mo133374b(Class<AbstractC37250a> cls) {
                return new C37257d();
            }
        });
    }

    /* renamed from: c */
    public static AbstractC37244b m146649c() {
        m146651e();
        return (AbstractC37244b) f95639d.mo196049a(AbstractC37244b.class, new C57762aa.AbstractC57763a<AbstractC37244b>() {
            /* class com.ss.android.lark.featuregating.C37239a.C372412 */

            /* renamed from: a */
            public AbstractC37244b mo133374b(Class<AbstractC37244b> cls) {
                return new C37252a();
            }
        });
    }

    /* renamed from: e */
    private static void m146651e() {
        if (!f95636a) {
            try {
                Log.m165383e("FeatureGatingModule", "Oops! Some error must have occurred.");
                if (!C26284k.m95185a(LarkContext.getApplication())) {
                    f95637b.await();
                    return;
                }
                throw new RuntimeException("Oops! Some error must have occurred.");
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public static Boolean m146645a(String str) {
        m146651e();
        return C37256c.m146696a(str);
    }

    /* renamed from: a */
    public static void m146647a(AbstractC37245c cVar) {
        f95638c = cVar;
        m146650d();
    }

    /* renamed from: a */
    public static void m146646a(IGetDataCallback<Map<String, Boolean>> iGetDataCallback, IGetDataCallback<Map<String, Boolean>> iGetDataCallback2) {
        C37246a.m146666d().mo136947a(iGetDataCallback, iGetDataCallback2);
    }
}
