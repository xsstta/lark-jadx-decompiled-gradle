package com.bytedance.ee.bear.document.offline.sync;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.permission.C6063a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Response;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.a */
public abstract class AbstractC5982a implements AbstractC5997i {

    /* renamed from: a */
    public String f16764a = "AbsPreloadStrategy";

    /* renamed from: b */
    protected C10917c f16765b = new C10917c(new C10929e());

    /* renamed from: c */
    protected NetService f16766c = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: d */
    protected al f16767d = C4511g.m18594d();

    /* renamed from: e */
    protected AbstractC5233x f16768e = C5234y.m21391b();

    /* renamed from: f */
    protected ConnectionService f16769f = C5084ad.m20847d();

    /* renamed from: g */
    protected String f16770g;

    /* renamed from: h */
    protected String f16771h;

    /* renamed from: i */
    protected String f16772i;

    /* renamed from: j */
    protected AbstractC5990h f16773j;

    /* renamed from: k */
    private final long f16774k = 10485760;

    /* renamed from: l */
    private List<String> f16775l = new ArrayList();

    /* renamed from: a */
    public abstract JSONObject mo24216a(String str);

    /* renamed from: a */
    public abstract Response mo24220a(OfflineDoc offlineDoc);

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
    }

    /* renamed from: a */
    public abstract void mo24218a(String str, String str2);

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24223a(String str, String str2, String str3) {
    }

    /* renamed from: a */
    public abstract boolean mo24225a(org.json.JSONObject jSONObject);

    public AbstractC5982a() {
        C6063a.m24571a().mo24542a(this.f16766c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24208a(Throwable th) throws Exception {
        C13479a.m54774d(this.f16764a, th);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void mo24227b(String str) throws Exception {
        C13479a.m54764b(this.f16764a, "docsDataService: retryDoc");
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24222a(AbstractC5990h hVar) {
        this.f16773j = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo24224a(C5968f fVar) {
        if (fVar == null) {
            return false;
        }
        String str = this.f16764a;
        C13479a.m54772d(str, "doOfflineDocValidation... for :" + fVar.mo24134c());
        C6063a.C6065a a = C6063a.m24571a().mo24541a(fVar.mo24134c(), C8275a.m34051b(fVar.mo24130b()), 900, true);
        if (a != null && a.f16948a == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m24207a(OfflineDoc offlineDoc, AbstractC5094ag agVar) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.add(offlineDoc);
        agVar.preloadDocs(arrayList);
        return "";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24221a(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback) {
        Object obj;
        try {
            if (TextUtils.isEmpty(this.f16770g)) {
                C13479a.m54775e(this.f16764a, "consumeDoc()... mKey null ");
                if (binderIPreloadCallback != null) {
                    binderIPreloadCallback.onPreloadFail(offlineDoc.getObj_token());
                    return;
                }
                return;
            }
            Response a = mo24220a(offlineDoc);
            if (a == null || !a.isSuccessful()) {
                if (!this.f16775l.contains(offlineDoc.getObj_token())) {
                    String str = this.f16764a;
                    C13479a.m54775e(str, "consumeDoc()... token444 retryDoc =  " + offlineDoc);
                    this.f16775l.add(offlineDoc.getObj_token());
                    this.f16765b.mo41508c(AbstractC5094ag.class).mo238020d(new Function() {
                        /* class com.bytedance.ee.bear.document.offline.sync.$$Lambda$a$VuN2bPOPz2218jfgNKSLbLQ1Gh4 */

                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return AbstractC5982a.lambda$VuN2bPOPz2218jfgNKSLbLQ1Gh4(OfflineDoc.this, (AbstractC5094ag) obj);
                        }
                    }).mo238001b(new Consumer() {
                        /* class com.bytedance.ee.bear.document.offline.sync.$$Lambda$a$ngD5yxsDVhg0vno0MOQBfXd8c */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            AbstractC5982a.m269264lambda$ngD5yxsDVhg0vno0MOQBfXd8c(AbstractC5982a.this, (String) obj);
                        }
                    }, new Consumer() {
                        /* class com.bytedance.ee.bear.document.offline.sync.$$Lambda$a$XvO3QMhKj3JgB9w_xd_gtBOvklw */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            AbstractC5982a.lambda$XvO3QMhKj3JgB9w_xd_gtBOvklw(AbstractC5982a.this, (Throwable) obj);
                        }
                    });
                } else if (binderIPreloadCallback != null) {
                    binderIPreloadCallback.onPreloadFail(offlineDoc.getObj_token());
                }
                String str2 = this.f16764a;
                StringBuilder sb = new StringBuilder();
                sb.append("consumeDoc()... token555 =  ");
                if (a != null) {
                    obj = a.body();
                } else {
                    obj = "";
                }
                sb.append(obj);
                C13479a.m54775e(str2, sb.toString());
                return;
            }
            String string = a.body().string();
            org.json.JSONObject jSONObject = null;
            if (!TextUtils.isEmpty(string)) {
                jSONObject = new org.json.JSONObject(string);
            }
            if (mo24225a(jSONObject)) {
                HashMap hashMap = new HashMap();
                hashMap.put("file_id", C13598b.m55197d(offlineDoc.getObj_token()));
                hashMap.put("file_type", C8275a.m34050a(offlineDoc.getType()));
                hashMap.put("doc_network_status", String.valueOf(this.f16769f.mo20038b().mo20040a()));
                hashMap.put("response_length", String.valueOf(string.length()));
                hashMap.put("from_source", offlineDoc.getFrom_source());
                this.f16768e.mo21079a("preload_clientvar", hashMap);
                if (((long) string.length()) > 10485760) {
                    String str3 = this.f16764a;
                    C13606d.m55245a(str3, new Throwable("consumeDoc()...  MAX_LENGTH responseStr.size =  " + string.length()));
                    return;
                }
                C5968f fVar = new C5968f();
                fVar.mo24128a(this.f16770g);
                fVar.mo24138d(jSONObject.toString());
                fVar.mo24136c(offlineDoc.getObj_token());
                fVar.mo24146h(Uri.parse(offlineDoc.getUrl()).getPath());
                fVar.mo24127a(Long.valueOf(System.currentTimeMillis()));
                fVar.mo24135c(1);
                fVar.mo24133b(C8275a.m34050a(offlineDoc.getType()));
                String str4 = this.f16764a;
                C13479a.m54772d(str4, "consumeDoc save key = " + this.f16770g + ",var = " + fVar.mo24137d().length());
                C5955d.m24025b().mo24072a(fVar);
                mo24218a(string, offlineDoc.getObj_token());
                if (!C5130a.m20997b(offlineDoc.getObj_token())) {
                    ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31513b(offlineDoc.getObj_token());
                }
                if (binderIPreloadCallback != null) {
                    binderIPreloadCallback.onPreloadSuccess(offlineDoc.getObj_token());
                }
                C13479a.m54772d(this.f16764a, "consumeDoc()... token111 =  ");
                return;
            }
            if (binderIPreloadCallback != null) {
                binderIPreloadCallback.onPreloadFail(offlineDoc.getObj_token());
            }
            String str5 = this.f16764a;
            C13479a.m54775e(str5, "consumeDoc()... token333 =  " + a.body().string());
        } catch (Exception e) {
            if (binderIPreloadCallback != null) {
                binderIPreloadCallback.onPreloadFail(offlineDoc.getObj_token());
            }
            String str6 = this.f16764a;
            C13479a.m54758a(str6, "consumeDoc()... e = " + e);
        }
    }
}
