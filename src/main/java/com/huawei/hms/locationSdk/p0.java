package com.huawei.hms.locationSdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.support.api.client.Status;
import org.json.JSONObject;

public class p0 extends c0<C23663p, Void> {

    /* renamed from: b */
    private a0 f58424b;

    /* renamed from: c */
    private Handler f58425c;

    /* renamed from: com.huawei.hms.locationSdk.p0$a */
    class HandlerC23664a extends Handler {
        HandlerC23664a() {
        }

        public void handleMessage(Message message) {
            p0.this.m86094a(message);
        }
    }

    /* renamed from: com.huawei.hms.locationSdk.p0$b */
    class HandlerC23665b extends Handler {
        HandlerC23665b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            p0.this.m86094a(message);
        }
    }

    public p0(String str, String str2, String str3, a0 a0Var, Looper looper, String str4) {
        super(str, str2, str3, str4);
        this.f58424b = a0Var;
        this.f58425c = looper == null ? new HandlerC23664a() : new HandlerC23665b(looper);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m86094a(Message message) {
        String str = this.f58396a;
        u0.m86106c("RequestLocationUpdatesTaskApiCall", str, "handleOnResultMessage code:" + message.what);
        try {
            int i = message.what;
            if (i == 1) {
                this.f58424b.mo83482c().onLocationResult((LocationResult) message.obj);
            } else if (i == 2) {
                this.f58424b.mo83482c().onLocationAvailability((LocationAvailability) message.obj);
            }
        } catch (Exception unused) {
            u0.m86105b("RequestLocationUpdatesTaskApiCall", this.f58396a, "handleOnResultMessage exception");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doExecute(C23663p pVar, ResponseErrorCode responseErrorCode, String str, C23433g<Void> gVar) {
        ApiException e;
        u0.m86106c("RequestLocationUpdatesTaskApiCall", this.f58396a, "doExecute");
        if (responseErrorCode != null) {
            try {
                if (responseErrorCode.getErrorCode() == 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    a0 a0Var = (a0) C23677z.m86138b().mo83545b(this.f58424b);
                    this.f58424b = a0Var;
                    if (!(a0Var == null || a0Var.mo83483d() == null)) {
                        if (this.f58424b.mo83482c() != null) {
                            if (jSONObject.has("locationResult")) {
                                u0.m86106c("RequestLocationUpdatesTaskApiCall", this.f58396a, "doExecute onLocationResult");
                                LocationResult b = w0.m86123b(jSONObject);
                                int f = this.f58424b.mo83486f();
                                int size = b.getLocations().size();
                                String str2 = this.f58396a;
                                u0.m86106c("RequestLocationUpdatesTaskApiCall", str2, "modify numUpdates with callback, numUpdates:" + f + " , locationSize:" + size);
                                if (f > 0) {
                                    if (f >= size) {
                                        if (f == size) {
                                            C23643b.m86020b(pVar.getContext(), (C23668s) null).mo83499a(this.f58424b.mo83482c());
                                        }
                                        Message obtain = Message.obtain();
                                        obtain.what = 1;
                                        obtain.obj = b;
                                        this.f58425c.sendMessage(obtain);
                                        C23677z.m86138b().mo83548a(this.f58424b, f - size);
                                        return;
                                    }
                                }
                                C23643b.m86020b(pVar.getContext(), (C23668s) null).mo83499a(this.f58424b.mo83482c());
                                return;
                            } else if (jSONObject.has("locationAvailability")) {
                                LocationAvailability a = w0.m86120a(str);
                                u0.m86106c("RequestLocationUpdatesTaskApiCall", this.f58396a, "doExecute onLocationAvailability");
                                Message obtain2 = Message.obtain();
                                obtain2.what = 2;
                                obtain2.obj = a;
                                this.f58425c.sendMessage(obtain2);
                                return;
                            }
                        }
                    }
                    u0.m86105b("RequestLocationUpdatesTaskApiCall", this.f58396a, "INTERNAL_ERROR : doExecute requestLocationUpdatesCache is null");
                    return;
                }
                C23677z.m86138b().mo83546c(this.f58424b);
                z0.m86140a().mo83549a(gVar, responseErrorCode, null);
            } catch (ApiException e2) {
                e = e2;
                C23677z.m86138b().mo83546c(this.f58424b);
                String str3 = this.f58396a;
                u0.m86105b("RequestLocationUpdatesTaskApiCall", str3, "doExecute exception:" + e.getMessage());
                gVar.mo81845a(e);
            } catch (Exception unused) {
                C23677z.m86138b().mo83546c(this.f58424b);
                u0.m86105b("RequestLocationUpdatesTaskApiCall", this.f58396a, "doExecute exception");
                e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
                gVar.mo81845a(e);
            }
        } else {
            C23677z.m86138b().mo83546c(this.f58424b);
            throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40000000;
    }
}
