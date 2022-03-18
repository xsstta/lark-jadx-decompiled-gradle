package com.bytedance.ee.bear.basesdk.services;

import android.app.Application;
import android.os.IInterface;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.domain.AbstractC6304b;
import com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener;
import com.bytedance.ee.bear.domain.C6306d;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.remote.C10959f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.services.h */
public class C4514h extends AbstractC6304b {

    /* renamed from: a */
    private PersistenceSharedPreference f13205a;

    /* renamed from: b */
    private final C10959f<BinderOnDomainCharacteristicChangeListener> f13206b = new C10959f<>();

    /* renamed from: c */
    private Disposable f13207c;

    /* renamed from: d */
    private an f13208d;

    /* renamed from: e */
    private BinderAccountChangeCallback f13209e;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.basesdk.services.h$a */
    public static class C4516a implements NetService.AbstractC5074c<NetService.Result<String>> {
        private C4516a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<String> parse(String str) {
            NetService.Result<String> result = new NetService.Result<>();
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("code");
                String optString = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "");
                result.code = optInt;
                result.data = optString;
            } catch (JSONException e) {
                C13479a.m54759a("RemoteDomainCharacteristicServiceImp", "parse: error", e);
            }
            return result;
        }
    }

    /* renamed from: e */
    private boolean m18643e() {
        return C5084ad.m20847d().mo20038b().mo20041b();
    }

    /* renamed from: d */
    private void m18642d() {
        ConnectionService d = C5084ad.m20847d();
        if (!m18643e()) {
            final LiveData<ConnectionService.NetworkState> a = d.mo20037a();
            C13748k.m55734b(new Runnable(new AbstractC1178x<ConnectionService.NetworkState>() {
                /* class com.bytedance.ee.bear.basesdk.services.C4514h.C45151 */

                /* renamed from: a */
                public void onChanged(ConnectionService.NetworkState networkState) {
                    if (networkState != null && networkState.mo20041b()) {
                        C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "Network has reconnected, begin sync config");
                        C4514h.this.fetchConfig();
                        a.mo5928b((AbstractC1178x) this);
                    }
                }
            }) {
                /* class com.bytedance.ee.bear.basesdk.services.$$Lambda$h$iMvwFONZJwJFBelm3UoNvrWmIFw */
                public final /* synthetic */ AbstractC1178x f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    LiveData.this.mo5925a((LiveData) this.f$1);
                }
            });
        }
    }

    /* renamed from: f */
    private void m18644f() {
        this.f13208d = (an) KoinJavaComponent.m268610a(an.class);
        RemoteDomainCharacteristicServiceImp$2 remoteDomainCharacteristicServiceImp$2 = new RemoteDomainCharacteristicServiceImp$2(this);
        this.f13209e = remoteDomainCharacteristicServiceImp$2;
        this.f13208d.mo16399a(remoteDomainCharacteristicServiceImp$2);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        Disposable disposable = this.f13207c;
        if (disposable != null && !disposable.isDisposed()) {
            this.f13207c.dispose();
        }
        this.f13208d.mo16404b(this.f13209e);
        this.f13206b.mo41594a();
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
    public void fetchConfig() {
        C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "loadConfig()...");
        this.f13207c = m18645g().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.basesdk.services.$$Lambda$h$agz2bEFaUW08J7mA1cMU2Dy_zEw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4514h.this.m18635a((C4514h) ((NetService.Result) obj));
            }
        }, $$Lambda$h$w3gRiasF7sOLalqp0DJMCp3R_U.INSTANCE);
    }

    /* renamed from: g */
    private AbstractC68307f<NetService.Result<String>> m18645g() {
        C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "fetchConfigFlowable()...");
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C4516a());
        NetService.C5077f fVar = new NetService.C5077f("/api/infra/domains/all");
        fVar.mo20144a(C4511g.m18594d().mo17363m());
        return a.mo20141a(fVar).mo237985a(C11678b.m48479c());
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
    public AbstractC68307f<String> getDomainCharacteristicConfig() {
        C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "getDomainCharacteristicConfig()...flowable");
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.basesdk.services.$$Lambda$h$cClGyhZmZv5afitM1tVg6MJWuw */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C4514h.this.m18633a((Boolean) obj);
            }
        });
    }

    /* renamed from: c */
    private void m18641c() {
        C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "initSpaceKitUrlHelper()...");
        C6313i.m25327a().mo25383a(ar.m20936a());
        C6313i.m25327a().mo25386a(((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e());
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
    public void registerConfigChangeListener(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener) {
        this.f13206b.mo41595a(binderOnDomainCharacteristicChangeListener);
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
    public void unregisterConfigChangeListener(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener) {
        this.f13206b.mo41597b(binderOnDomainCharacteristicChangeListener);
    }

    @Override // com.bytedance.ee.bear.domain.AbstractC6304b, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
        super.lazyInit(application);
        C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "lazyInit()...");
        this.f13205a = new PersistenceSharedPreference(C6306d.f17467a);
        m18644f();
        m18642d();
        m18641c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC68307f m18633a(Boolean bool) throws Exception {
        String string = this.f13205a.getString(C6306d.f17468b, "");
        C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "cache domainCharacteristicConfig = " + string);
        if (TextUtils.isEmpty(string)) {
            return m18645g().mo238020d(new Function() {
                /* class com.bytedance.ee.bear.basesdk.services.$$Lambda$h$3c6b_l_FVJpA1e6zsWL8tMJLKzA */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C4514h.this.m18640c((NetService.Result) obj);
                }
            });
        }
        return AbstractC68307f.m265083a("{}");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ String m18640c(NetService.Result result) throws Exception {
        C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "fetchConfigFlowable()...result, code = " + result.code + ", data = " + ((String) result.data) + ", msg = " + result.msg);
        if (result.code != 0) {
            return "{}";
        }
        m18635a(result);
        return (String) result.data;
    }

    /* renamed from: b */
    private boolean m18639b(NetService.Result<String> result) {
        C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "needChange()...code = " + result.code + ", data = " + ((String) result.data));
        if (result.code != 0) {
            C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "needChange()...false for illegal code");
            return false;
        }
        String string = this.f13205a.getString(C6306d.f17468b, "");
        if (TextUtils.isEmpty((CharSequence) result.data) || TextUtils.equals(string, (CharSequence) result.data)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18635a(NetService.Result<String> result) {
        C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "saveAndNotify()...");
        if (m18639b(result)) {
            String str = (String) result.data;
            try {
                HashMap hashMap = new HashMap();
                m18636a(C6306d.f17468b, str, hashMap);
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("common");
                String optString = optJSONObject.optString("domainPool");
                m18636a(C6306d.f17469c, optString, hashMap);
                String optString2 = jSONObject.optString("space_api");
                m18636a(C6306d.f17470d, optString2, hashMap);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("domain");
                String optString3 = optJSONObject2.optString("helpcenter");
                m18636a(C6306d.f17471e, optString3, hashMap);
                String optString4 = optJSONObject2.optString("official");
                m18636a(C6306d.f17472f, optString4, hashMap);
                String optString5 = optJSONObject.optJSONObject("helpcenter_article").optString("authorized_help");
                m18636a(C6306d.f17473g, optString5, hashMap);
                String optString6 = jSONObject.optJSONObject("paramsConfig").optString("unitID");
                m18636a(C6306d.f17474h, optString6, hashMap);
                this.f13206b.mo41596a(new C10959f.AbstractC10961b(hashMap) {
                    /* class com.bytedance.ee.bear.basesdk.services.$$Lambda$h$R10sVaUU9rdBbcVI9OhI4L8udc */
                    public final /* synthetic */ HashMap f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
                    public final void notify(IInterface iInterface) {
                        ((BinderOnDomainCharacteristicChangeListener) iInterface).onConfigChanged(this.f$0);
                    }
                });
                C13479a.m54764b("RemoteDomainCharacteristicServiceImp", "saveAndNotify()...domainPool = " + optString + ", spaceApi = " + optString2 + ", helpCenter = " + optString3 + ", official = " + optString4 + ", compatibleExtension = " + optString5 + ", unitID = " + optString6);
            } catch (Exception e) {
                C13479a.m54761a("RemoteDomainCharacteristicServiceImp", e);
            }
        }
    }

    /* renamed from: a */
    private void m18636a(String str, String str2, Map<String, String> map) {
        String string = this.f13205a.getString(str, "");
        C13479a.m54772d("RemoteDomainCharacteristicServiceImp", "checkItemSame()...key = " + str + ", oldValue = " + string + ", newValue = " + str2);
        if (!TextUtils.equals(str2, string)) {
            this.f13205a.mo34037a(str, str2);
            map.put(str, str2);
        }
    }
}
