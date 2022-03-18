package com.bytedance.ee.bear.middleground.feed.p453a;

import com.bytedance.ee.bear.contract.AbstractC5080aa;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.feed.a.a */
public class C9419a {

    /* renamed from: a */
    private final String f25318a = "BadgeManager";

    /* renamed from: b */
    private Map<String, String> f25319b = new ConcurrentHashMap();

    /* renamed from: c */
    private final C10917c f25320c;

    /* renamed from: a */
    public void mo35898a(String str) {
        this.f25319b.put(str, "");
    }

    /* renamed from: a */
    public void mo35897a() {
        this.f25319b.clear();
    }

    /* renamed from: a */
    public void mo35900a(List<String> list, String str, int i) {
        for (String str2 : list) {
            C13479a.m54764b("BadgeManager", "add read:" + str2);
            mo35898a(str2);
        }
        m38936a(this.f25320c, list, str, i);
    }

    /* renamed from: a */
    public void mo35899a(String str, int i) {
        C13479a.m54764b("BadgeManager", "readAllMessage");
        NetService.C5077f fVar = new NetService.C5077f("/api/message/read_all/");
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        hashMap.put("obj_type", i + "");
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C5205f()).mo20141a(fVar).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$a$JRF9JmgAG13np61e2pSyGam2lpE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9419a.this.m38933a((C9419a) ((SimpleRequestResult) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$a$gvrFUunUtVKpgARQZPnqihKatI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9419a.this.m38938a((C9419a) ((Throwable) obj));
            }
        });
    }

    /* renamed from: b */
    public boolean mo35901b(String str) {
        return this.f25319b.containsKey(str);
    }

    public C9419a(C10917c cVar) {
        this.f25320c = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38933a(SimpleRequestResult simpleRequestResult) throws Exception {
        C13479a.m54758a("BadgeManager", "read all message success");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38938a(Throwable th) throws Exception {
        C13479a.m54759a("BadgeManager", "read  all message error", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m38930a(String str, AbstractC5080aa aaVar) throws Exception {
        aaVar.remove(str);
        return true;
    }

    /* renamed from: a */
    public static void m38934a(C10917c cVar, String str) {
        cVar.mo41508c(AbstractC5080aa.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$a$DDY44XMnAk3tjgBN7PLihHBpx0 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9419a.m38930a(this.f$0, (AbstractC5080aa) obj);
            }
        }).mo238001b($$Lambda$a$aUaRXBqOnP_Bb_GSsUPlcffNLWk.INSTANCE, $$Lambda$a$UeW5c0oyHc7ELKv__Jl8SKkOCY.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m38932a(long j, long j2, Boolean bool) throws Exception {
        C13479a.m54764b("BadgeManager:static", "update badge: " + j + ", version= " + j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m38929a(String str, long j, long j2, AbstractC5080aa aaVar) throws Exception {
        aaVar.updateBadge(str, j, j2);
        return true;
    }

    /* renamed from: a */
    public static void m38935a(C10917c cVar, String str, long j, long j2) {
        cVar.mo41508c(AbstractC5080aa.class).mo238020d(new Function(str, j, j2) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$a$yptlQdZyC28SslOgQLILSAxu4Gs */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ long f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9419a.m38929a(this.f$0, this.f$1, this.f$2, (AbstractC5080aa) obj);
            }
        }).mo238001b(new Consumer(j, j2) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$a$rdLQigKPjFLnTiqRD3mckLnfJv4 */
            public final /* synthetic */ long f$0;
            public final /* synthetic */ long f$1;

            {
                this.f$0 = r1;
                this.f$1 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9419a.m38932a(this.f$0, this.f$1, (Boolean) obj);
            }
        }, $$Lambda$a$01EkrOJCr7DMasTXKPtGPHZChn4.INSTANCE);
    }

    /* renamed from: a */
    public static void m38936a(C10917c cVar, List<String> list, String str, int i) {
        cVar.mo41508c(AbstractC5080aa.class).mo238020d(new Function(str, i, list) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$a$5JoscQY1oicByyg5uO3xu3ACUQ */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((AbstractC5080aa) obj).read(this.f$0, this.f$1, this.f$2);
            }
        }).mo238001b($$Lambda$a$i6AeZTj8cV_JqIZwf7klQQ1ZXvM.INSTANCE, $$Lambda$a$heo2ks04h2iyTEAoGoJDaUGMqGg.INSTANCE);
    }
}
