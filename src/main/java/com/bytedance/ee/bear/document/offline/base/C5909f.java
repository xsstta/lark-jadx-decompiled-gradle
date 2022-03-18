package com.bytedance.ee.bear.document.offline.base;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.connection.C4974b;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AbstractC5238z;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.contract.net.C5202c;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.eenet.AbstractC12610a;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.eenet.httpclient.p600a.C12615a;
import com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException;
import com.bytedance.ee.eenet.p598a.C12611a;
import com.bytedance.ee.eenet.p599b.AbstractC12612a;
import com.bytedance.ee.eenet.p599b.C12613b;
import com.bytedance.ee.eenet.util.HttpChannel;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ttnet.TTNetInit;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.Headers;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.base.f */
public class C5909f implements AbstractC12610a, AbstractC12612a {

    /* renamed from: b */
    public static volatile String f16543b;

    /* renamed from: a */
    public Application f16544a;

    /* renamed from: c */
    private C10929e f16545c;

    /* renamed from: d */
    private AbstractC5233x f16546d;

    /* renamed from: e */
    private al f16547e;

    /* renamed from: f */
    private AbstractC5238z f16548f;

    /* renamed from: g */
    private ao f16549g;

    /* renamed from: e */
    private AbstractC5233x m23793e() {
        if (this.f16546d == null) {
            this.f16546d = C5234y.m21391b();
        }
        return this.f16546d;
    }

    /* renamed from: f */
    private AbstractC5238z m23794f() {
        if (this.f16548f == null) {
            this.f16548f = C5102ai.m20872j();
        }
        return this.f16548f;
    }

    /* renamed from: b */
    public al mo23878b() {
        if (this.f16547e == null) {
            this.f16547e = C4511g.m18594d();
        }
        return this.f16547e;
    }

    /* renamed from: c */
    public ao mo23879c() {
        if (this.f16549g == null) {
            this.f16549g = C4484g.m18494b();
        }
        return this.f16549g;
    }

    /* renamed from: d */
    private void m23792d() {
        C13479a.m54772d("HttpConfig", "configHttpClient start");
        C12617b.m52359a(this);
        BearExecutors.m48466a().execute(new Runnable() {
            /* class com.bytedance.ee.bear.document.offline.base.C5909f.RunnableC59101 */

            public void run() {
                final boolean z;
                final String str;
                final String str2;
                boolean z2;
                boolean z3 = true;
                if (((Boolean) new PersistenceSharedPreference("debug_config").mo34038b("rust_net_enable", true)).booleanValue()) {
                    C12617b.m52360a(HttpChannel.RustChannel);
                } else {
                    C12617b.m52360a(HttpChannel.OkHttpChannel);
                }
                if (C12617b.m52367d() == HttpChannel.RustChannel) {
                    if (C4211a.m17514a().mo16536a("rust_net_proxy_enabled", false) || C13616d.m55262a(C5909f.this.f16544a)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C12615a.m52352a(z2);
                }
                C5084ad.m20847d();
                int b = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20121b();
                if (b == 2 || b == 5) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = "#" + ((String) new PersistenceSharedPreference("debug_config").mo34038b("http_request_id", ""));
                } else {
                    str = "";
                }
                boolean a = C4211a.m17514a().mo16536a("ccm_gray.client.ccm", false);
                boolean a2 = C4211a.m17514a().mo16536a("ccm_gray.client.lark", false);
                if (b != 3) {
                    z3 = false;
                }
                if (a || z3) {
                    str2 = "; env=pre=1,is_ccm=" + (a ? 1 : 0) + "," + "is_lark" + '=' + (a2 ? 1 : 0);
                } else {
                    str2 = "";
                }
                final HashMap hashMap = new HashMap();
                final al b2 = C5909f.this.mo23878b();
                hashMap.put("doc-version-code", String.valueOf(b2.mo17365o()));
                hashMap.put("doc-version-name", b2.mo17364n());
                hashMap.put("doc-package-name", b2.mo17366p());
                hashMap.put("doc-platform", b2.mo17350K());
                hashMap.put("doc-biz", b2.mo17350K());
                hashMap.put("doc-os", "Android");
                hashMap.put("doc-os-version", Build.VERSION.RELEASE);
                hashMap.put("doc-device-model", b2.mo17347H());
                hashMap.put("doc-channel-id", b2.mo17351L());
                hashMap.put("doc-device-id", b2.mo17369s());
                hashMap.put("called_from", "docs");
                hashMap.put("User-Agent", b2.mo17352M());
                C12615a.m52351a(new C12615a.AbstractC12616a() {
                    /* class com.bytedance.ee.bear.document.offline.base.C5909f.RunnableC59101.C59111 */

                    @Override // com.bytedance.ee.eenet.httpclient.p600a.C12615a.AbstractC12616a
                    /* renamed from: a */
                    public Map<String, String> mo23881a(Headers headers) {
                        HashMap hashMap = new HashMap(hashMap);
                        if (!TextUtils.isEmpty(C5909f.f16543b)) {
                            hashMap.put("AppComm-Session", C5909f.f16543b);
                        }
                        String str = headers.get("request-id");
                        if (TextUtils.isEmpty(str)) {
                            str = C13598b.m55188a(12) + "-" + b2.mo17356e();
                        }
                        hashMap.put("request-id", str);
                        hashMap.put("x-tt-trace-id", str);
                        Locale d = C5909f.this.mo23879c().mo17253d();
                        hashMap.put("locale", d.getLanguage() + "_" + d.getCountry().toUpperCase());
                        if (z) {
                            String str2 = str + str;
                            hashMap.put("request-id", str2);
                            hashMap.put("x-request-id", str2);
                        }
                        if (headers != null) {
                            String str3 = headers.get("Cookie");
                            if (!TextUtils.isEmpty(str3)) {
                                StringBuilder sb = new StringBuilder(str3);
                                String str4 = headers.get("X-CSRFToken");
                                if (!TextUtils.isEmpty(str4)) {
                                    sb.append("; ");
                                    sb.append("_csrf_token");
                                    sb.append('=');
                                    sb.append(str4);
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    sb.append(str2);
                                }
                                hashMap.put("Cookie", sb.toString());
                            }
                        }
                        HeaderAppendHelper.f16540b.mo23872a(hashMap);
                        return hashMap;
                    }
                });
            }
        });
        C13479a.m54772d("HttpConfig", "configHttpClient end");
    }

    @Override // com.bytedance.ee.eenet.AbstractC12610a
    /* renamed from: a */
    public boolean mo23877a() {
        return ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35637c();
    }

    /* renamed from: a */
    public void mo23876a(Application application, C10929e eVar) {
        this.f16544a = application;
        this.f16545c = eVar;
        m23792d();
        C12613b.m52341a(this);
    }

    @Override // com.bytedance.ee.eenet.p599b.AbstractC12612a
    /* renamed from: a */
    public void mo23874a(long j, long j2, C12611a aVar) {
        int i;
        AbstractC5233x e = m23793e();
        al b = mo23878b();
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.valueOf(j));
            hashMap.put("docs_net_dnsInterval", Integer.valueOf(aVar.f33765a));
            hashMap.put("docs_net_tlsInterval", Integer.valueOf(aVar.f33767c));
            hashMap.put("docs_net_connectionEstablishInterval", Integer.valueOf(aVar.f33766b));
            hashMap.put("http_protocol", aVar.f33774j);
            hashMap.put("version_type", b.mo17367q());
            hashMap.put("http_channel", aVar.f33779o);
            hashMap.put("http_request_tag", aVar.f33783s);
            hashMap.put("url", C13721c.m55648b(aVar.f33775k));
            hashMap.put("http_request_method", aVar.f33782r);
            hashMap.put("response_length", Long.valueOf(aVar.f33785u));
            if (aVar.f33784t) {
                i = 1;
            } else {
                i = 0;
            }
            hashMap.put("doc_use_multi_connection", Integer.valueOf(i));
            hashMap.put("server-timing", aVar.f33786v);
            hashMap.put("code", 0);
            hashMap.put("docs_request_id", aVar.f33780p);
            hashMap.put("app_visible", String.valueOf(m23794f().mo20212d()));
            hashMap.put("doc_network_status", Integer.valueOf(C4974b.m20619a().ordinal()));
            hashMap.put("doc_network_level", Integer.valueOf(((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35644j().getValue()));
            hashMap.put("network_quality_type", Integer.valueOf(TTNetInit.getEffectiveConnectionType()));
            e.mo21079a("dev_performance_native_network_request", hashMap);
        } catch (Throwable th) {
            C13479a.m54773d("HttpConfig", "onApiSuccess: ", th);
        }
    }

    @Override // com.bytedance.ee.eenet.p599b.AbstractC12612a
    /* renamed from: a */
    public void mo23875a(long j, long j2, C12611a aVar, Throwable th) {
        int i;
        AbstractC5233x e = m23793e();
        al b = mo23878b();
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.valueOf(j));
            hashMap.put("docs_net_dnsInterval", Integer.valueOf(aVar.f33765a));
            hashMap.put("docs_net_tlsInterval", Integer.valueOf(aVar.f33767c));
            hashMap.put("docs_net_connectionEstablishInterval", Integer.valueOf(aVar.f33766b));
            hashMap.put("http_protocol", aVar.f33774j);
            hashMap.put("version_type", b.mo17367q());
            hashMap.put("http_channel", aVar.f33779o);
            hashMap.put("http_request_tag", aVar.f33783s);
            hashMap.put("url", C13721c.m55648b(aVar.f33775k));
            hashMap.put("http_request_method", aVar.f33782r);
            hashMap.put("response_length", "0");
            if (aVar.f33784t) {
                i = 1;
            } else {
                i = 0;
            }
            hashMap.put("doc_use_multi_connection", Integer.valueOf(i));
            hashMap.put("server-timing", aVar.f33786v);
            if (th instanceof RustIOException) {
                hashMap.put("code", Integer.valueOf(((RustIOException) th).getRustSdkErrorCode()));
            } else {
                hashMap.put("code", Integer.valueOf(C5202c.m21233a(th)));
            }
            hashMap.put("docs_request_id", aVar.f33780p);
            String str = "";
            if (th != null) {
                String message = th.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    str = message;
                }
                hashMap.put("errorMsg", str);
            } else {
                hashMap.put("errorMsg", str);
            }
            hashMap.put("app_visible", String.valueOf(m23794f().mo20212d()));
            hashMap.put("doc_network_status", Integer.valueOf(C4974b.m20619a().ordinal()));
            hashMap.put("doc_network_level", Integer.valueOf(((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35644j().getValue()));
            hashMap.put("network_quality_type", Integer.valueOf(TTNetInit.getEffectiveConnectionType()));
            e.mo21079a("dev_performance_native_network_request", hashMap);
            C13479a.m54775e("HttpConfig", "onApiError  map:  " + hashMap);
        } catch (Throwable th2) {
            C13479a.m54773d("HttpConfig", "onApiError: ", th2);
        }
    }
}
