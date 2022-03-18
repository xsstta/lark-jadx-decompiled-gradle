package com.bytedance.ee.bear.integrator.cookies;

import com.bytedance.ee.bear.basesdk.apisupport.C4438x;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.dto.DocAppUserConfig;
import com.bytedance.ee.bear.lark.p414b.AbstractC7988a;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.lark.p414b.AbstractC8004n;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.p1191f.C26005c;
import com.larksuite.framework.http.response.C26014a;
import com.larksuite.framework.thread.CoreThreadPool;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.integrator.cookies.a */
public class C7918a {
    /* renamed from: a */
    public static void m31653a(String str) {
        AbstractC7993f fVar = (AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class);
        String c = fVar.mo30991c(((AbstractC7988a) KoinJavaComponent.m268610a(AbstractC7988a.class)).mo30980c());
        String b = C26005c.m94127b(c);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b);
        arrayList.add(fVar.mo30988b());
        DocAppUserConfig c2 = fVar.mo30990c();
        if (c2 == null) {
            m31654a(c, str, arrayList);
            return;
        }
        List<String> docDomains = c2.getDocDomains();
        if (docDomains != null && !docDomains.isEmpty()) {
            arrayList.addAll(docDomains);
        }
        m31654a(c, str, arrayList);
    }

    /* renamed from: a */
    public static void m31656a(final String str, Map<String, SessionInfo> map) {
        final AbstractC25990b a = ((AbstractC8004n) KoinJavaComponent.m268610a(AbstractC8004n.class)).mo31015a();
        if (a != null) {
            final ArrayList arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                SessionInfo sessionInfo = map.get(str2);
                if (sessionInfo != null) {
                    arrayList.add(m31652a(sessionInfo.getSession(), sessionInfo.getSessionName(), sessionInfo.getHostUrl()));
                }
            }
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.bytedance.ee.bear.integrator.cookies.C7918a.RunnableC79191 */

                public void run() {
                    a.mo92416a(str, arrayList);
                }
            });
        }
    }

    /* renamed from: a */
    private static C26014a m31652a(String str, String str2, String str3) {
        C26014a.C26015a aVar = new C26014a.C26015a();
        aVar.mo92517c(str3).mo92518d("/").mo92514b().mo92512a(253402300799999L).mo92513a(str2).mo92515b(str);
        return aVar.mo92519d();
    }

    /* renamed from: a */
    public static void m31654a(final String str, String str2, List<String> list) {
        final AbstractC25990b a = ((AbstractC8004n) KoinJavaComponent.m268610a(AbstractC8004n.class)).mo31015a();
        if (a != null) {
            final ArrayList arrayList = new ArrayList();
            for (String str3 : list) {
                arrayList.add(m31652a(str2, "bear-session", str3));
                arrayList.add(m31652a(str2, "session", str3));
            }
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.bytedance.ee.bear.integrator.cookies.C7918a.RunnableC79202 */

                public void run() {
                    a.mo92416a(str, arrayList);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m31655a(String str, String str2, List<String> list, List<String> list2) {
        if (list2 != null && !list2.isEmpty()) {
            list.addAll(list2);
            if (C4438x.m18352d()) {
                ArrayList arrayList = new ArrayList(list);
                C13479a.m54764b("CookieStorage", "setHistoryDomains()... domainList = " + arrayList);
                C6313i.m25327a().mo25385a(arrayList);
                C13479a.m54764b("CookieStorage", "set history domains  : " + Arrays.toString(list.toArray()));
            }
        }
        m31654a(str, str2, list);
    }
}
