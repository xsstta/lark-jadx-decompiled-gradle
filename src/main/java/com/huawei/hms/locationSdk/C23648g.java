package com.huawei.hms.locationSdk;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.huawei.hmf.tasks.AbstractC23430d;
import com.huawei.hmf.tasks.AbstractC23431e;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;

/* renamed from: com.huawei.hms.locationSdk.g */
public class C23648g extends AbstractClientBuilder<C23663p, C23668s> {

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.locationSdk.g$a */
    public static class C23649a implements BaseHmsClient.ConnectionCallbacks {

        /* renamed from: d */
        private static final byte[] f58399d = new byte[0];

        /* renamed from: a */
        private Context f58400a;

        /* renamed from: b */
        private BaseHmsClient.ConnectionCallbacks f58401b;

        /* renamed from: c */
        private Handler f58402c;

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.locationSdk.g$a$a */
        public class C23650a implements Handler.Callback {
            C23650a() {
            }

            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 1001) {
                    C23649a.this.f58402c.removeMessages(1002);
                    C23649a.this.f58402c.sendEmptyMessageDelayed(1002, 12000);
                    C23649a.this.m86059d();
                    return false;
                } else if (i != 1002) {
                    return false;
                } else {
                    C23649a.this.m86055b();
                    return false;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.locationSdk.g$a$b */
        public class C23651b implements AbstractC23430d {

            /* renamed from: a */
            final /* synthetic */ LocationCallback f58404a;

            /* renamed from: b */
            final /* synthetic */ PendingIntent f58405b;

            C23651b(LocationCallback locationCallback, PendingIntent pendingIntent) {
                this.f58404a = locationCallback;
                this.f58405b = pendingIntent;
            }

            @Override // com.huawei.hmf.tasks.AbstractC23430d
            public void onFailure(Exception exc) {
                HMSLog.m86964e("LocationClientBuilder", "task request onFailure");
                C23649a.this.f58402c.removeMessages(1002);
                C23649a.this.m86054a((C23649a) exc, (Exception) this.f58404a, (LocationCallback) this.f58405b);
                v0.m86110f().mo83536a(2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.locationSdk.g$a$c */
        public class C23652c implements AbstractC23431e<Void> {
            C23652c() {
            }

            /* renamed from: a */
            public void onSuccess(Void r2) {
                HMSLog.m86966i("LocationClientBuilder", "task request onSuccess");
                C23649a.this.f58402c.removeMessages(1002);
                v0.m86110f().mo83536a(0);
            }
        }

        public C23649a(Context context, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
            this.f58400a = context;
            this.f58401b = connectionCallbacks;
        }

        /* renamed from: a */
        private void m86051a() {
            if (v0.m86110f().mo83538b()) {
                m86060e();
            }
        }

        /* renamed from: a */
        private void m86052a(AbstractC23432f<Void> fVar, LocationCallback locationCallback, PendingIntent pendingIntent) {
            fVar.mo81828a(new C23652c()).mo81827a(new C23651b(locationCallback, pendingIntent));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private void m86054a(Exception exc, LocationCallback locationCallback, PendingIntent pendingIntent) {
            String str;
            try {
                if (exc instanceof ApiException) {
                    ApiException apiException = (ApiException) exc;
                    int statusCode = apiException.getStatusCode();
                    if (statusCode == 10000 || statusCode == 10102 || statusCode == 10803) {
                        if (locationCallback != null) {
                            LocationAvailability locationAvailability = new LocationAvailability();
                            locationAvailability.setLocationStatus(CommonCode.StatusCode.API_CLIENT_EXPIRED);
                            locationCallback.onLocationAvailability(locationAvailability);
                            HMSLog.m86964e("LocationClientBuilder", "task request onFailure from Location and callback to cp ,errorCode " + apiException.getStatusCode());
                        }
                        if (pendingIntent != null) {
                            Intent intent = new Intent();
                            LocationAvailability locationAvailability2 = new LocationAvailability();
                            locationAvailability2.setLocationStatus(CommonCode.StatusCode.API_CLIENT_EXPIRED);
                            intent.putExtra("com.huawei.hms.location.EXTRA_LOCATION_AVAILABILITY", locationAvailability2);
                            pendingIntent.send(this.f58400a, 0, intent);
                            str = "task request onFailure from Location and pendingIntent to cp ,errorCode " + apiException.getStatusCode();
                        } else {
                            return;
                        }
                    } else if (statusCode == 907135004) {
                        HMSLog.m86964e("LocationClientBuilder", "task request onFailure from HMS and checkRestart");
                        m86051a();
                        return;
                    } else {
                        return;
                    }
                } else {
                    str = "handlerOnFailureMsg failed by instanceof failed";
                }
                HMSLog.m86964e("LocationClientBuilder", str);
            } catch (Exception unused) {
                HMSLog.m86964e("LocationClientBuilder", "handlerOnFailureMsg failed by exception");
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private void m86055b() {
            if (v0.m86110f().mo83539c() == 1) {
                v0.m86110f().mo83536a(2);
                HMSLog.m86964e("LocationClientBuilder", "reSend request time out ,reset state to RE_START_STATE_FAILED");
            }
        }

        /* renamed from: c */
        private void m86057c() {
            if (this.f58402c == null) {
                HandlerThread handlerThread = new HandlerThread("LocationClientBuilder");
                handlerThread.start();
                this.f58402c = new Handler(handlerThread.getLooper(), new C23650a());
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: d */
        private void m86059d() {
            AbstractC23432f<Void> requestLocationUpdatesEx;
            try {
                List<a0> a = C23677z.m86138b().mo83543a();
                if (t0.m86101a(a)) {
                    HMSLog.m86966i("LocationClientBuilder", "onConnected, requests cache list is empty remove delay check msg");
                    this.f58402c.removeMessages(1002);
                    return;
                }
                HMSLog.m86966i("LocationClientBuilder", "request cache list size:" + a.size());
                FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this.f58400a);
                for (a0 a0Var : a) {
                    u0.m86106c("LocationClientBuilder", a0Var.mo83541a(), "onConnected, request in cache list prepare to send");
                    if (a0Var.mo83482c() != null && a0Var.mo83483d() != null) {
                        LocationRequest d = a0Var.mo83483d();
                        if (d.getPriority() != 200) {
                            if (d.getPriority() != 300) {
                                u0.m86106c("LocationClientBuilder", a0Var.mo83541a(), "send location request");
                                requestLocationUpdatesEx = fusedLocationProviderClient.requestLocationUpdates(a0Var.mo83483d(), a0Var.mo83482c(), a0Var.mo83484e());
                                m86052a(requestLocationUpdatesEx, a0Var.mo83482c(), (PendingIntent) null);
                            }
                        }
                        u0.m86106c("LocationClientBuilder", a0Var.mo83541a(), "send ex location request");
                        requestLocationUpdatesEx = fusedLocationProviderClient.requestLocationUpdatesEx(a0Var.mo83483d(), a0Var.mo83482c(), a0Var.mo83484e());
                        m86052a(requestLocationUpdatesEx, a0Var.mo83482c(), (PendingIntent) null);
                    } else if (a0Var.mo83479b() != null) {
                        m86052a(fusedLocationProviderClient.requestLocationUpdates(a0Var.mo83483d(), a0Var.mo83479b()), (LocationCallback) null, a0Var.mo83479b());
                    } else {
                        v0.m86110f().mo83536a(0);
                        u0.m86107d("LocationClientBuilder", a0Var.mo83541a(), "onConnected, requests cache list param is error");
                    }
                }
            } catch (Exception unused) {
                v0.m86110f().mo83536a(2);
                HMSLog.m86964e("LocationClientBuilder", "onConnected exception");
            }
        }

        /* renamed from: e */
        private void m86060e() {
            synchronized (f58399d) {
                HMSLog.m86966i("LocationClientBuilder", "reStartHmsLocation restartState：" + v0.m86110f().mo83539c());
                v0.m86110f().mo83536a(1);
                m86057c();
                this.f58402c.sendEmptyMessageDelayed(CommonCode.StatusCode.API_CLIENT_EXPIRED, 300);
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.m86966i("LocationClientBuilder", "onConnected, send suspended requests,reStartState:" + v0.m86110f().mo83539c());
            BaseHmsClient.ConnectionCallbacks connectionCallbacks = this.f58401b;
            if (connectionCallbacks != null) {
                connectionCallbacks.onConnected();
            }
            if (v0.m86110f().mo83539c() == 2) {
                m86060e();
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HMSLog.m86966i("LocationClientBuilder", "onConnectionSuspended reason:" + i);
            BaseHmsClient.ConnectionCallbacks connectionCallbacks = this.f58401b;
            if (connectionCallbacks != null) {
                connectionCallbacks.onConnectionSuspended(i);
            }
            m86051a();
        }
    }

    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public C23663p buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new C23663p(context, clientSettings, onConnectionFailedListener, new C23649a(context, connectionCallbacks));
    }
}
