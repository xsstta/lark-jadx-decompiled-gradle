package com.ss.android.lark.auditsdk.p1379b;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.C29282a;
import com.ss.android.lark.audit.C29304b;
import com.ss.android.lark.audit.model.AuditEvent;
import com.ss.android.lark.audit_provider.C29381a;
import com.ss.android.lark.auditsdk.C29385a;
import com.ss.android.lark.auditsdk.IAuditModuleDependency;
import com.ss.android.lark.auditsdk.authorization.C29389a;
import com.ss.android.lark.auditsdk.p1378a.C29386a;
import com.ss.android.lark.auditsdk.p1378a.C29387b;
import com.ss.android.lark.auditsdk.wrapper.ParamCreator;
import com.ss.android.lark.log.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.auditsdk.b.b */
public class C29393b {

    /* renamed from: a */
    public final IAuditModuleDependency f73483a;

    /* renamed from: b */
    public final ParamCreator f73484b;

    /* renamed from: c */
    public ParamCreator.CommonParams f73485c;

    /* renamed from: d */
    public final AbstractC29324f f73486d;

    /* renamed from: e */
    public final AtomicBoolean f73487e;

    /* renamed from: f */
    private ExecutorService f73488f;

    /* renamed from: g */
    private final Context f73489g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.auditsdk.b.b$a */
    public static final class C29399a {

        /* renamed from: a */
        public static final C29393b f73496a = new C29393b();
    }

    /* renamed from: a */
    public static C29393b m108086a() {
        return C29399a.f73496a;
    }

    /* renamed from: c */
    public String mo104122c() {
        return C29389a.m108034a();
    }

    /* renamed from: d */
    public String mo104123d() {
        return C29389a.m108040b();
    }

    /* renamed from: f */
    private void m108087f() {
        this.f73483a.mo104095a(new IAuditModuleDependency.OnAccountChangedListener() {
            /* class com.ss.android.lark.auditsdk.p1379b.C29393b.C293952 */

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency.OnAccountChangedListener
            /* renamed from: a */
            public void mo104106a(String str) {
                C29393b.this.mo104124e();
                C29393b.this.mo104121b();
            }
        });
    }

    /* renamed from: e */
    public void mo104124e() {
        Log.m165389i("AuditSdk", "AuditSdk unInit");
        this.f73487e.set(false);
        ExecutorService executorService = this.f73488f;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    private C29393b() {
        this.f73486d = new AbstractC29324f() {
            /* class com.ss.android.lark.auditsdk.p1379b.C29393b.C293941 */

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: a */
            public /* synthetic */ AbstractC29324f.AbstractC29326b mo103859a(Context context) {
                return AbstractC29324f.CC.$default$a(this, context);
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: a */
            public /* synthetic */ void mo103864a(AbstractC29324f.AbstractC29329e eVar) {
                AbstractC29324f.CC.$default$a(this, eVar);
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: a */
            public /* synthetic */ void mo103865a(String str, String str2, AbstractC29324f.AbstractC29330f fVar) {
                AbstractC29324f.CC.$default$a(this, str, str2, fVar);
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: a */
            public /* synthetic */ void mo103866a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                AbstractC29324f.CC.$default$a(this, str, jSONObject, jSONObject2, jSONObject3);
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: b */
            public /* synthetic */ AbstractC29324f.AbstractC29325a mo103868b(Context context) {
                return AbstractC29324f.CC.$default$b(this, context);
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: b */
            public String mo103869b() {
                return C29393b.this.f73483a.mo104102g();
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: c */
            public boolean mo103870c() {
                return C29393b.this.f73483a.mo104103h();
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: d */
            public String mo103871d() {
                return C29393b.this.f73483a.mo104101f();
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: e */
            public int mo103872e() {
                return C29393b.this.f73483a.mo104097b();
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: a */
            public String mo103860a() {
                return "https://www." + C29393b.this.f73483a.mo104098c();
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: a */
            public String mo103861a(String str) {
                return C29393b.this.f73483a.mo104091a(str);
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: a */
            public void mo103862a(AbstractC29324f.AbstractC29327c cVar) {
                C29393b.this.f73483a.mo104092a(cVar);
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: a */
            public void mo103863a(AbstractC29324f.AbstractC29328d dVar) {
                C29393b.this.f73483a.mo104093a(dVar);
            }

            @Override // com.ss.android.lark.audit.AbstractC29324f
            /* renamed from: a */
            public boolean mo103867a(String str, boolean z) {
                return C29393b.this.f73483a.mo104096a(str, z);
            }
        };
        this.f73487e = new AtomicBoolean(false);
        this.f73489g = C29385a.m108005a().mo104090a();
        this.f73483a = C29385a.m108005a();
        this.f73484b = new ParamCreator();
        m108087f();
    }

    /* renamed from: b */
    public void mo104121b() {
        if (!this.f73483a.mo104103h()) {
            Exception exc = new Exception();
            Log.m165385e("AuditSdk", String.format("AuditSdk error: is not login\n%s", android.util.Log.getStackTraceString(exc)), exc, true);
            return;
        }
        ExecutorService executorService = this.f73488f;
        if (executorService == null || executorService.isShutdown()) {
            this.f73488f = CoreThreadPool.getDefault().newSerialIODensityThreadPool("audit");
        }
        this.f73488f.execute(new Runnable() {
            /* class com.ss.android.lark.auditsdk.p1379b.C29393b.RunnableC293963 */

            public void run() {
                if (!C29393b.this.f73487e.get()) {
                    Log.m165389i("AuditSdk", "AuditSdk init");
                    C29381a.m107986a(C29385a.m108005a().mo104090a(), C29393b.this.f73486d);
                    C29393b.this.f73484b.mo104138a(new ParamCreator.IEnvCreateCallback() {
                        /* class com.ss.android.lark.auditsdk.p1379b.C29393b.RunnableC293963.C293971 */

                        @Override // com.ss.android.lark.auditsdk.wrapper.ParamCreator.IEnvCreateCallback
                        /* renamed from: a */
                        public void mo104126a(ParamCreator.CommonParams aVar) {
                            if (!ParamCreator.f73499a.mo104145a(aVar)) {
                                Log.m165383e("AuditSdk", "setup common env failed");
                            } else {
                                C29393b.this.f73485c = aVar;
                            }
                        }
                    });
                    C29393b.this.f73487e.set(true);
                }
            }
        });
    }

    /* renamed from: a */
    public String mo104115a(int i) {
        return C29389a.m108035a(i);
    }

    /* renamed from: a */
    public void mo104119a(final C29282a aVar) {
        ExecutorService executorService = this.f73488f;
        if (executorService != null && !executorService.isShutdown()) {
            this.f73488f.execute(new Runnable() {
                /* class com.ss.android.lark.auditsdk.p1379b.C29393b.RunnableC293984 */

                public void run() {
                    if (!C29393b.this.f73487e.get()) {
                        Log.m165383e("AuditSdk", "audit sdk is not init");
                    } else if (C29393b.this.f73485c == null) {
                        Log.m165383e("AuditSdk", "Common env is not setup");
                    } else {
                        AuditEvent a = aVar.mo103798a(C29393b.this.f73485c.mo104140b()).mo103801a(C29393b.this.f73485c.mo104139a()).mo103800a(C29393b.this.f73485c.mo104141c()).mo103803a();
                        Log.m165379d("AuditSdk", "audit event:" + a.parseToString());
                        C29304b.m107713a().mo103855a(a);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo104120a(C29387b bVar) {
        String str;
        C29386a a = bVar.mo104062a();
        boolean d = a.mo104061d();
        if (a.mo104060c() == null || "".equals(a.mo104060c())) {
            if (("checkAuthority stopped because fileKey is " + a.mo104060c()) == null) {
                str = "null";
            } else {
                str = "\"\"";
            }
            Log.m165389i("AuditSdk", str);
            return d;
        }
        int a2 = C29304b.m107713a().mo103853a(a.mo104058a(), a.mo104059b(), a.mo104060c());
        Log.m165389i("AuditSdk", "checkAuthority--->action: " + a.mo104058a() + ", entity: " + a.mo104059b() + "--->check result: " + a2);
        if (a2 == 2) {
            d = true;
        } else if (a2 == 1) {
            d = false;
        }
        Log.m165389i("AuditSdk", "checkAuthority--->authorizationPassed: " + d);
        return d;
    }

    /* renamed from: a */
    public void mo104116a(Context context, int i) {
        C29389a.m108037a(context, i);
    }

    /* renamed from: a */
    public void mo104117a(Context context, int i, DialogInterface.OnDismissListener onDismissListener) {
        C29389a.m108038a(context, i, onDismissListener);
    }

    /* renamed from: a */
    public void mo104118a(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
        C29389a.m108039a(context, str, onDismissListener);
    }
}
