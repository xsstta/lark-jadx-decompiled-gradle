package com.bytedance.ee.bear.list.star;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.star.C8810l;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.star.l */
public class C8810l {

    /* renamed from: a */
    private NetService f23729a;

    /* renamed from: com.bytedance.ee.bear.list.star.l$a */
    public interface AbstractC8812a {
        /* renamed from: a */
        void mo33279a();

        /* renamed from: a */
        void mo33280a(int i, Throwable th);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.star.l$c */
    public class C8814c implements NetService.AbstractC5074c<NetService.Result> {

        /* renamed from: b */
        private String f23732b;

        /* renamed from: c */
        private int f23733c;

        /* renamed from: a */
        private void m36948a() {
            C8153a.m32844b().mo31594b(6, this.f23732b);
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result parse(String str) {
            NetService.Result result = new NetService.Result();
            if (str != null) {
                try {
                    result.code = new JSONObject(str).optInt("code");
                    if (result.code == 0) {
                        m36948a();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }

        C8814c(String str, int i) {
            this.f23732b = str;
            this.f23733c = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.star.l$b */
    public class C8813b implements NetService.AbstractC5074c<NetService.Result> {
        private C8813b() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result parse(String str) {
            NetService.Result result = new NetService.Result();
            if (str != null) {
                try {
                    result.code = new JSONObject(str).optInt("code");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }

    public C8810l(NetService netService) {
        this.f23729a = netService;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36940a(AbstractC8812a aVar, Throwable th) throws Exception {
        if (aVar != null) {
            aVar.mo33280a(-1, th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36943b(AbstractC8812a aVar, Throwable th) throws Exception {
        if (aVar != null) {
            aVar.mo33280a(-1, th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36939a(AbstractC8812a aVar, NetService.Result result) throws Exception {
        if (aVar == null) {
            return;
        }
        if (result.code == 0) {
            aVar.mo33279a();
        } else {
            aVar.mo33280a(result.code, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36942b(AbstractC8812a aVar, NetService.Result result) throws Exception {
        if (aVar == null) {
            return;
        }
        if (result.code == 0) {
            aVar.mo33279a();
        } else {
            aVar.mo33280a(result.code, null);
        }
    }

    /* renamed from: a */
    private NetService.C5076e m36938a(String str, String str2, int i) {
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("obj_token", str2);
        hashMap.put(ShareHitPoint.f121869d, String.valueOf(i));
        fVar.mo20147a(hashMap);
        return fVar;
    }

    /* renamed from: b */
    private NetService.C5076e m36941b(String str, String str2, int i) {
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("token", str2);
        hashMap.put(ShareHitPoint.f121869d, String.valueOf(i));
        fVar.mo20147a(hashMap);
        return fVar;
    }

    /* renamed from: a */
    public void mo33863a(String str, int i, AbstractC8812a aVar) {
        this.f23729a.mo20117a(new C8813b()).mo20141a(m36938a("/api/explorer/star/new/", str, i)).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.star.$$Lambda$l$B7IW1liJ6zUJMRLGk710sW8bi7k */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8810l.m36942b(C8810l.AbstractC8812a.this, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.star.$$Lambda$l$O9hmzdOXreoL76pNAYImKnTlT5Q */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8810l.m36943b(C8810l.AbstractC8812a.this, (Throwable) obj);
            }
        });
    }

    /* renamed from: b */
    public void mo33864b(String str, int i, AbstractC8812a aVar) {
        this.f23729a.mo20117a(new C8814c(str, i)).mo20141a(m36941b("/api/explorer/star/remove/", str, i)).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.star.$$Lambda$l$XeDCJyvbjuFSUZb9eLYtSGiE9g */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8810l.m36939a(C8810l.AbstractC8812a.this, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.star.$$Lambda$l$AGkzQ4dK4G3iOAdzdkfJSW6FznE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8810l.m36940a(C8810l.AbstractC8812a.this, (Throwable) obj);
            }
        });
    }
}
