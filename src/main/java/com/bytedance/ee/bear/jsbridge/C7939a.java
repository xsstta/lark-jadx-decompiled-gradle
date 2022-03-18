package com.bytedance.ee.bear.jsbridge;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.thread.C11674a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.common.ReflectUtils;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p704g.C13665a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68279a;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.jsbridge.a */
public class C7939a {

    /* renamed from: a */
    private static long f21358a = 2097152;

    /* renamed from: b */
    private String f21359b = ("Bridge#" + Integer.toHexString(hashCode()));

    /* renamed from: c */
    private Map<String, AbstractC7943b> f21360c = new ConcurrentHashMap();

    /* renamed from: d */
    private Map<String, AbstractC7943b> f21361d = new ConcurrentHashMap();

    /* renamed from: e */
    private Executor f21362e;

    /* renamed from: f */
    private AbstractC7942a f21363f;

    /* renamed from: g */
    private List<AbstractC7949k> f21364g = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.jsbridge.a$a */
    public interface AbstractC7942a {
        /* renamed from: a */
        void mo30839a(String str);
    }

    @JavascriptInterface
    public String callSync(String str) throws Exception {
        return "null";
    }

    /* renamed from: a */
    public void mo30835a(String str, String str2) {
        Message message = new Message();
        message.mo30820a(str);
        message.mo30822b(str2);
        AbstractC7942a aVar = this.f21363f;
        if (aVar != null) {
            aVar.mo30839a(message.mo30829f());
        }
    }

    /* renamed from: a */
    public <T> void mo30833a(String str, AbstractC7945d<T> dVar) {
        mo30832a(str, m31730a((AbstractC7945d) dVar));
    }

    /* renamed from: a */
    public <T> void mo30834a(String str, AbstractC7948j<T> jVar) {
        mo30832a(str, m31731a(jVar));
    }

    /* renamed from: a */
    public void mo30832a(String str, AbstractC7943b bVar) {
        if (TextUtils.isEmpty(str) || bVar == null) {
            C13479a.m54761a(this.f21359b, new IllegalArgumentException());
        } else {
            this.f21360c.put(str, bVar);
        }
    }

    /* renamed from: a */
    public void mo30831a(String str) {
        this.f21360c.remove(str);
    }

    /* renamed from: b */
    public void mo30836b() {
        mo30830a();
        Executor executor = this.f21362e;
        if (executor instanceof C11674a.C11677c) {
            ((C11674a.C11677c) executor).shutdown();
        }
        this.f21363f = null;
    }

    /* renamed from: a */
    public void mo30830a() {
        this.f21360c.clear();
        this.f21361d.clear();
    }

    /* renamed from: a */
    public static <T> AbstractC7943b m31730a(AbstractC7945d<T> dVar) {
        if (dVar == null) {
            return null;
        }
        return new AbstractC7943b() {
            /* class com.bytedance.ee.bear.jsbridge.$$Lambda$a$ccjdxkkG6FjK51QV2pAnWGnZnrY */

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7943b
            public final void handler(String str, AbstractC7947h hVar) {
                C7939a.m31736a((AbstractC7945d) str, (String) AbstractC7945d.this, hVar);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m31742b(Message message) throws Exception {
        if (message == null || !TextUtils.isEmpty(message.mo30819a())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> AbstractC7943b m31731a(AbstractC7948j<T> jVar) {
        if (jVar == null) {
            return null;
        }
        return new AbstractC7943b() {
            /* class com.bytedance.ee.bear.jsbridge.$$Lambda$a$5Vxkoeob8LVA3Z1KXjxjk7aP6Xw */

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7943b
            public final void handler(String str, AbstractC7947h hVar) {
                C7939a.m31737a((AbstractC7948j) str, (String) AbstractC7948j.this, hVar);
            }
        };
    }

    /* renamed from: b */
    private AbstractC7947h m31740b(final String str) {
        if (!TextUtils.isEmpty(str)) {
            return new AbstractC7947h() {
                /* class com.bytedance.ee.bear.jsbridge.C7939a.C79401 */

                @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
                /* renamed from: a */
                public void mo17190a(String str) {
                    C7939a.this.mo30835a(str, str);
                }

                @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
                /* renamed from: a */
                public void mo17188a(JSONObject jSONObject) {
                    C7939a.this.mo30835a(str, jSONObject.toString());
                }

                @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
                /* renamed from: a */
                public void mo17189a(NonProguard nonProguard) {
                    C7939a.this.mo30835a(str, C13665a.m55439a(nonProguard));
                }
            };
        }
        return new AbstractC7947h() {
            /* class com.bytedance.ee.bear.jsbridge.C7939a.C79412 */

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17188a(JSONObject jSONObject) {
            }

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17189a(NonProguard nonProguard) {
            }

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17190a(String str) {
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31732a(Message message) {
        AbstractC7947h b = m31740b(message.mo30823c());
        if (!m31739a(message, b)) {
            m31741b(message, b);
        }
    }

    @JavascriptInterface
    public void prompt(String str) {
        AbstractC68307f.m265083a(str).mo237985a(C68279a.m265022a(this.f21362e)).mo237990a((Function) new Function() {
            /* class com.bytedance.ee.bear.jsbridge.$$Lambda$a$wTRDNucnFkudS8V0MFTHC_5xlg0 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7939a.this.m31744d((String) obj);
            }
        }).mo237998a((AbstractC68322n) $$Lambda$a$AzAdNIvUKSTxPhJrFKjeuKYuyWk.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.jsbridge.$$Lambda$a$ozzlWYaOlrEXevmYtybcswgp9X8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7939a.this.m31732a((C7939a) ((Message) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.jsbridge.$$Lambda$a$etgc9mFwAiRCM_jaDp02wnjMHuI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7939a.this.m31738a((C7939a) ((Throwable) obj));
            }
        });
    }

    public C7939a(AbstractC7942a aVar) {
        Executor c = new C11674a().mo44759c("jscore");
        this.f21362e = c;
        if (c instanceof C11674a.C11677c) {
            ((C11674a.C11677c) c).setRejectedExecutionHandler($$Lambda$a$ISvXybkMAjU2VRQ_9bSBYFoH8xc.INSTANCE);
        }
        this.f21363f = aVar;
        C13479a.m54764b(this.f21359b, "Bridge constructor");
    }

    /* renamed from: c */
    private List<AbstractC7943b> m31743c(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            String str2 = this.f21359b;
            C13479a.m54758a(str2, "undefined handlerName: " + str);
            return arrayList;
        }
        if (this.f21361d.containsKey(str)) {
            arrayList.add(this.f21361d.get(str));
        }
        if (this.f21360c.containsKey(str)) {
            arrayList.add(this.f21360c.get(str));
        }
        if (arrayList.isEmpty()) {
            String str3 = this.f21359b;
            C13479a.m54764b(str3, "getBridgeHandler()... not register or fragmentRef is null  handlerName: " + str);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ AbstractC70020b m31744d(String str) throws Exception {
        String decode = URLDecoder.decode(str, "UTF-8");
        if (TextUtils.isEmpty(decode) || !decode.startsWith("bear://return/")) {
            C13479a.m54758a(this.f21359b, "js_prompt ___fetchQueue____ !!returnnnnnn");
            return AbstractC68307f.m265083a(new Message());
        }
        List<Message> list = null;
        try {
            list = Message.m31718g(C7946e.m31759a(decode));
        } catch (Exception e) {
            C13479a.m54761a(this.f21359b, e);
            C13606d.m55245a(this.f21359b, e);
        }
        if (list == null || list.size() == 0) {
            return AbstractC68307f.m265083a(new Message());
        }
        if (((long) decode.length()) > f21358a) {
            String str2 = this.f21359b;
            C13479a.m54775e(str2, " beyond size : " + decode.length() + "   getHandlerName: " + list.get(0).mo30827e());
            String str3 = this.f21359b;
            C13606d.m55245a(str3, new Throwable(decode.length() + "  " + list.get(0).mo30827e()));
        }
        return AbstractC68307f.m265081a((Iterable) list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31738a(Throwable th) throws Exception {
        C13479a.m54761a(this.f21359b, th);
        C13606d.m55245a(this.f21359b, th);
    }

    /* renamed from: b */
    private void m31741b(Message message, AbstractC7947h hVar) {
        String d = message.mo30825d();
        String e = message.mo30827e();
        for (AbstractC7943b bVar : m31743c(e)) {
            try {
                bVar.handler(d, hVar);
            } catch (Exception e2) {
                String str = this.f21359b;
                C13479a.m54759a(str, "onJSMsg ERR:" + e, e2);
                C13606d.m55245a(this.f21359b, e2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m31735a(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor instanceof C11674a.C11677c) {
            C11674a.C11677c cVar = (C11674a.C11677c) threadPoolExecutor;
            C13479a.m54761a("Bridge", new Throwable("Thread Pool:" + cVar.toString() + "\nshutDown:" + cVar.mo44764b() + "\nshutDownNow:" + cVar.mo44762a()));
        }
    }

    /* renamed from: a */
    private boolean m31739a(Message message, AbstractC7947h hVar) {
        for (int size = this.f21364g.size() - 1; size >= 0; size--) {
            AbstractC7949k kVar = this.f21364g.get(size);
            try {
                if (kVar.mo30845a(message, hVar)) {
                    return true;
                }
            } catch (Exception e) {
                C13479a.m54759a(this.f21359b, "onInterceptJSMsg ERR" + kVar, e);
                C13606d.m55245a(this.f21359b, e);
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> void m31736a(String str, AbstractC7945d<T> dVar, AbstractC7947h hVar) {
        Class a = ReflectUtils.m55227a(dVar);
        if (a == null) {
            a = ReflectUtils.m55228b(dVar);
        }
        T t = null;
        if (a == null) {
            dVar.handle(null, hVar);
            return;
        }
        try {
            t = a.equals(String.class) ? str : JSON.parseObject(str, a);
        } catch (Throwable th) {
            C13479a.m54758a("Bridge", "handleJSMsg PARSE_DATA_ERR  data： " + str + "    clazz： " + a + "  e: " + th);
        }
        dVar.handle(t, hVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> void m31737a(String str, AbstractC7948j<T> jVar, AbstractC7947h hVar) {
        Class a = ReflectUtils.m55227a(jVar);
        if (a == null) {
            a = ReflectUtils.m55228b(jVar);
        }
        T t = null;
        if (a == null) {
            jVar.handle(null, hVar);
            return;
        }
        try {
            t = a.equals(String.class) ? str : JSON.parseObject(str, a);
        } catch (Throwable th) {
            C13479a.m54758a("Bridge", "handleJSMsg PARSE_DATA_ERR  data： " + str + "    clazz： " + a + "  e: " + th);
        }
        jVar.handle(t, hVar);
    }
}
