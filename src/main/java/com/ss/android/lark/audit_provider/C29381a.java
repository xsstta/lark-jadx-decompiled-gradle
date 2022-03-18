package com.ss.android.lark.audit_provider;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.C29304b;
import com.ss.android.lark.audit_provider.C29381a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.pb.authorization.PullPermissionRequest;
import com.ss.android.lark.pb.authorization.PullPermissionResponse;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.audit_provider.a */
public class C29381a {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m107987a(boolean z) {
        C29304b.m107713a().mo103856a(z);
    }

    /* renamed from: a */
    public static void m107986a(Context context, AbstractC29324f fVar) {
        if (!C29304b.m107714b()) {
            C29304b.m107713a().mo103854a(context, new AbstractC29324f(context, fVar) {
                /* class com.ss.android.lark.audit_provider.C29381a.C293821 */

                /* renamed from: a */
                final C29384b f73455a;

                /* renamed from: b */
                final /* synthetic */ Context f73456b;

                /* renamed from: c */
                final /* synthetic */ AbstractC29324f f73457c;

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: e */
                public /* synthetic */ int mo103872e() {
                    return AbstractC29324f.CC.$default$e(this);
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: a */
                public String mo103860a() {
                    AbstractC29324f fVar = this.f73457c;
                    if (fVar != null) {
                        return fVar.mo103860a();
                    }
                    return null;
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: b */
                public String mo103869b() {
                    AbstractC29324f fVar = this.f73457c;
                    if (fVar != null) {
                        return fVar.mo103869b();
                    }
                    return null;
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: c */
                public boolean mo103870c() {
                    AbstractC29324f fVar = this.f73457c;
                    if (fVar == null || !fVar.mo103870c()) {
                        return false;
                    }
                    return true;
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: d */
                public String mo103871d() {
                    AbstractC29324f fVar = this.f73457c;
                    if (fVar != null) {
                        return fVar.mo103871d();
                    }
                    return null;
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: a */
                public AbstractC29324f.AbstractC29326b mo103859a(Context context) {
                    return this.f73455a;
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: b */
                public AbstractC29324f.AbstractC29325a mo103868b(Context context) {
                    return this.f73455a;
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: a */
                public String mo103861a(String str) {
                    AbstractC29324f fVar = this.f73457c;
                    if (fVar != null) {
                        return fVar.mo103861a(str);
                    }
                    return null;
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: a */
                public void mo103862a(AbstractC29324f.AbstractC29327c cVar) {
                    AbstractC29324f fVar = this.f73457c;
                    if (fVar != null) {
                        fVar.mo103862a(cVar);
                    }
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: a */
                public void mo103863a(AbstractC29324f.AbstractC29328d dVar) {
                    AbstractC29324f fVar = this.f73457c;
                    if (fVar != null) {
                        fVar.mo103863a(dVar);
                    }
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: a */
                public void mo103864a(AbstractC29324f.AbstractC29329e eVar) {
                    C53248k.m205912a().mo181697a(Command.PUSH_PERMISSION, new C53248k.AbstractC53250a() {
                        /* class com.ss.android.lark.audit_provider.$$Lambda$a$1$_vGeDDcJBaJmEp5g0F0mAySvA24 */

                        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                        public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                            C29381a.C293821.m107988a(AbstractC29324f.AbstractC29329e.this, bArr, str, z, z2);
                        }
                    });
                }

                {
                    this.f73456b = r1;
                    this.f73457c = r2;
                    this.f73455a = new C29384b(r1);
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: a */
                public boolean mo103867a(String str, boolean z) {
                    AbstractC29324f fVar = this.f73457c;
                    if (fVar != null) {
                        return fVar.mo103867a(str, z);
                    }
                    return z;
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: a */
                public void mo103865a(String str, String str2, final AbstractC29324f.AbstractC29330f fVar) {
                    long j;
                    try {
                        PullPermissionRequest.C49558a aVar = new PullPermissionRequest.C49558a();
                        AbstractC29324f fVar2 = this.f73457c;
                        if (fVar2 != null) {
                            j = (long) fVar2.mo103872e();
                        } else {
                            j = 1;
                        }
                        PullPermissionRequest.C49558a a = aVar.mo172820a(Long.valueOf(j)).mo172821a(str2);
                        if (TextUtils.isEmpty(str)) {
                            str = "";
                        }
                        a.mo172823b(str);
                        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.PULL_PERMISSION;
                        C293831 r5 = new IGetDataCallback<PullPermissionResponse>() {
                            /* class com.ss.android.lark.audit_provider.C29381a.C293821.C293831 */

                            /* renamed from: a */
                            public void onSuccess(PullPermissionResponse pullPermissionResponse) {
                                AbstractC29324f.AbstractC29330f fVar = fVar;
                                if (fVar != null) {
                                    fVar.mo103841a(pullPermissionResponse);
                                }
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                AbstractC29324f.AbstractC29330f fVar = fVar;
                                if (fVar != null) {
                                    fVar.mo103842a(String.valueOf(errorResult.getErrorCode()), errorResult.getDebugMsg());
                                }
                            }
                        };
                        ProtoAdapter<PullPermissionResponse> protoAdapter = PullPermissionResponse.ADAPTER;
                        protoAdapter.getClass();
                        SdkSender.sendPassThroughRequest(command, aVar, r5, new SdkSender.IParser() {
                            /* class com.ss.android.lark.audit_provider.$$Lambda$hHNJ2nhLWuaskLfZPEb0McmRXbc */

                            @Override // com.ss.android.lark.sdk.SdkSender.IParser
                            public final Object parse(byte[] bArr) {
                                return (PullPermissionResponse) ProtoAdapter.this.decode(bArr);
                            }
                        });
                    } catch (Throwable th) {
                        Log.m165384e("AuditProvider", "pullPermissionData error", th);
                    }
                }

                @Override // com.ss.android.lark.audit.AbstractC29324f
                /* renamed from: a */
                public void mo103866a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                    CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(str, jSONObject, jSONObject2, jSONObject3) {
                        /* class com.ss.android.lark.audit_provider.$$Lambda$a$1$hp5Q9H6UcBj1KpL1aHpHHn8ZZXw */
                        public final /* synthetic */ String f$0;
                        public final /* synthetic */ JSONObject f$1;
                        public final /* synthetic */ JSONObject f$2;
                        public final /* synthetic */ JSONObject f$3;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void run() {
                            ApmAgent.monitorEvent(this.f$0, this.f$1, this.f$2, this.f$3);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m107988a(AbstractC29324f.AbstractC29329e eVar, byte[] bArr, String str, boolean z, boolean z2) {
                    if (eVar != null) {
                        eVar.mo103838c(null);
                    }
                }
            });
            C29410a.m108289c().mo104284a($$Lambda$a$CFEr37XxjShgKPFCitDqUaJWDA.INSTANCE);
        }
    }
}
