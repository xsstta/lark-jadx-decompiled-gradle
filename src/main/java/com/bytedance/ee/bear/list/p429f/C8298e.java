package com.bytedance.ee.bear.list.p429f;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.p429f.C8298e;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.f.e */
public class C8298e {

    /* renamed from: a */
    private NetService f22433a;

    /* renamed from: com.bytedance.ee.bear.list.f.e$a */
    public interface AbstractC8300a {
        /* renamed from: a */
        void mo32600a();

        /* renamed from: a */
        void mo32601a(int i, Throwable th);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.f.e$b */
    public class C8301b implements NetService.AbstractC5074c<NetService.Result> {
        private C8301b() {
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

    public C8298e(NetService netService) {
        this.f22433a = netService;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34211a(AbstractC8300a aVar, Throwable th) throws Exception {
        if (aVar != null) {
            aVar.mo32601a(-1, th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m34213b(AbstractC8300a aVar, Throwable th) throws Exception {
        if (aVar != null) {
            aVar.mo32601a(-1, th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m34212b(AbstractC8300a aVar, NetService.Result result) throws Exception {
        if (aVar == null) {
            return;
        }
        if (result.code == 0) {
            aVar.mo32600a();
        } else {
            aVar.mo32601a(result.code, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34210a(AbstractC8300a aVar, NetService.Result result) throws Exception {
        if (aVar == null) {
            return;
        }
        if (result.code == 0) {
            aVar.mo32600a();
        } else {
            aVar.mo32601a(result.code, null);
        }
    }

    /* renamed from: a */
    private NetService.C5076e m34209a(String str, String str2, int i) {
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("token", str2);
        hashMap.put(ShareHitPoint.f121869d, String.valueOf(i));
        fVar.mo20147a(hashMap);
        return fVar;
    }

    /* renamed from: b */
    public void mo32599b(String str, int i, AbstractC8300a aVar) {
        this.f22433a.mo20117a(new C8301b()).mo20141a(m34209a("/api/explorer/pin/remove/", str, i)).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.p429f.$$Lambda$e$ZAhb7Abh42dPg9JggfikZfIXbc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8298e.m269630lambda$ZAhb7Abh42dPg9JggfikZfIXbc(C8298e.AbstractC8300a.this, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.p429f.$$Lambda$e$IT5UwamugPnX29LBnkQLlg7amg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8298e.m269631lambda$IT5UwamugPnX29LBnkQLlg7amg(C8298e.AbstractC8300a.this, (Throwable) obj);
            }
        });
    }

    /* renamed from: a */
    public void mo32598a(String str, int i, AbstractC8300a aVar) {
        this.f22433a.mo20117a(new C8301b()).mo20141a(m34209a("/api/explorer/pin/add/", str, i)).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.p429f.$$Lambda$e$7onziaMbh8_DptXJI9YVOMP3MuU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8298e.lambda$7onziaMbh8_DptXJI9YVOMP3MuU(C8298e.AbstractC8300a.this, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.p429f.$$Lambda$e$JlTVDlIYmFgO_bW2y5YoMnZtdBQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8298e.lambda$JlTVDlIYmFgO_bW2y5YoMnZtdBQ(C8298e.AbstractC8300a.this, (Throwable) obj);
            }
        });
    }
}
