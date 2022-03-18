package com.bytedance.ee.bear.middleground.record.p498b;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.record.b.c */
public class C10128c {

    /* renamed from: a */
    private NetService.C5077f<SimpleRequestResult> f27353a;

    /* renamed from: b */
    private NetService.AbstractC5075d<SimpleRequestResult> f27354b;

    /* renamed from: com.bytedance.ee.bear.middleground.record.b.c$a */
    public interface AbstractC10131a {
        /* renamed from: a */
        void mo38540a();

        /* renamed from: a */
        void mo38541a(Throwable th) throws Exception;
    }

    /* renamed from: a */
    private void m42155a(boolean z) {
        String str;
        NetService.C5077f<SimpleRequestResult> fVar = new NetService.C5077f<>("/space/api/user_properties/set/");
        this.f27353a = fVar;
        fVar.mo20143a(1);
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        NetService.C5077f<SimpleRequestResult> fVar2 = this.f27353a;
        fVar2.mo20153c("{\"permission_type\":1,\"properties\":{\"allow_read_list_setting\":" + str + "}}");
    }

    /* renamed from: a */
    public Disposable mo38537a(boolean z, final AbstractC10131a aVar) {
        m42155a(z);
        NetService.AbstractC5075d<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C5205f());
        this.f27354b = a;
        return a.mo20141a(this.f27353a).mo238001b(new Consumer<SimpleRequestResult>() {
            /* class com.bytedance.ee.bear.middleground.record.p498b.C10128c.C101291 */

            /* renamed from: a */
            public void accept(SimpleRequestResult simpleRequestResult) {
                C13479a.m54772d("SetPrivacyExecutor", "GetPrivacyExecutor doAction accept  result=" + simpleRequestResult);
                AbstractC10131a aVar = aVar;
                if (aVar != null) {
                    aVar.mo38540a();
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.middleground.record.p498b.C10128c.C101302 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("SetPrivacyExecutor", " doAction failed", th);
                AbstractC10131a aVar = aVar;
                if (aVar != null) {
                    aVar.mo38541a(th);
                }
            }
        });
    }
}
