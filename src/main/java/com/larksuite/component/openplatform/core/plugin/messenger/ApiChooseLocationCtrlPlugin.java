package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.authorization.C24588a;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.entity.C67525e;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class ApiChooseLocationCtrlPlugin extends OPPlugin {
    public AbstractC25897h<ApiChooseLocationCtrlResponse> mEventInvokeCallback;
    public AbstractC25895f mLKEventContext;
    private String type;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    /* access modifiers changed from: private */
    public static class ApiChooseLocationCtrlResponse extends C25921b {
        @JSONField(name = "address")
        public String address;
        @JSONField(name = "latitude")
        public double latitude;
        @JSONField(name = "longitude")
        public double longitude;
        @JSONField(name = "name")
        public String name;

        private ApiChooseLocationCtrlResponse() {
        }
    }

    private static class ApiChooseLocationCtrlRequest extends C25920a {
        @JSONField(name = ShareHitPoint.f121869d)
        public String type = "wgs84";

        private ApiChooseLocationCtrlRequest() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mEventInvokeCallback = null;
        this.mLKEventContext = null;
        super.onRelease();
    }

    public void chooseLocation(Activity activity) {
        if (!HostDependManager.getInst().chooseLocationActivity(getAppContext(), this.type, 13)) {
            ApiChooseLocationCtrlResponse apiChooseLocationCtrlResponse = new ApiChooseLocationCtrlResponse();
            apiChooseLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiChooseLocationCtrlResponse.mErrorMessage = "feature is not supported in app";
            this.mEventInvokeCallback.callback(apiChooseLocationCtrlResponse);
            this.mLKEventContext.mo92190b().mo92223e("ApiChooseLocationCtrl", "chooelocation not support");
        }
    }

    public void apiChooseLocation(final Activity activity, final boolean z, final LKEvent lKEvent) {
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235103a(activity, lKEvent.mo92146m(), C66578b.C66579a.m260113b(getAppContext()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.ApiChooseLocationCtrlPlugin.C250544 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                ApiChooseLocationCtrlPlugin.this.mLKEventContext.mo92190b().mo92224i("ApiChooseLocationCtrl", "app permission granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                ApiChooseLocationCtrlPlugin.this.getApiDependency().mo235022a(activity, lKEvent.mo92146m(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.ApiChooseLocationCtrlPlugin.C250544.C250551 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        ApiChooseLocationCtrlPlugin.this.mLKEventContext.mo92190b().mo92224i("ApiChooseLocationCtrl", "system permission granted");
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", ApiChooseLocationCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        ApiChooseLocationCtrlPlugin.this.chooseLocation(activity);
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        ApiChooseLocationCtrlPlugin.this.mLKEventContext.mo92190b().mo92224i("ApiChooseLocationCtrl", "system permission denied");
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", ApiChooseLocationCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        ApiChooseLocationCtrlResponse apiChooseLocationCtrlResponse = new ApiChooseLocationCtrlResponse();
                        apiChooseLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_SYSTEM_AUTH_DENY.code;
                        apiChooseLocationCtrlResponse.mErrorMessage = ApiCode.GENERAL_SYSTEM_AUTH_DENY.msg;
                        ApiChooseLocationCtrlPlugin.this.mEventInvokeCallback.callback(apiChooseLocationCtrlResponse);
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                ApiChooseLocationCtrlPlugin.this.mLKEventContext.mo92190b().mo92224i("ApiChooseLocationCtrl", "app permission denied");
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", ApiChooseLocationCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                ApiChooseLocationCtrlResponse apiChooseLocationCtrlResponse = new ApiChooseLocationCtrlResponse();
                apiChooseLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_USER_AUTH_DENIED.code;
                apiChooseLocationCtrlResponse.mErrorMessage = ApiCode.GENERAL_USER_AUTH_DENIED.msg;
                ApiChooseLocationCtrlPlugin.this.mEventInvokeCallback.callback(apiChooseLocationCtrlResponse);
            }
        });
    }

    public void apiChooseLocationNew(final Activity activity, final boolean z, final LKEvent lKEvent) {
        HashSet hashSet = new HashSet();
        hashSet.add(C66578b.C66579a.m260113b(getAppContext()));
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235101a(activity, lKEvent.mo92146m(), hashSet, new LinkedHashMap<>(), new AbstractC67539a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.ApiChooseLocationCtrlPlugin.C250523 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: a */
            public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                ApiChooseLocationCtrlPlugin.this.mLKEventContext.mo92190b().mo92224i("ApiChooseLocationCtrl", "app permission granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                ApiChooseLocationCtrlPlugin.this.getApiDependency().mo235022a(activity, lKEvent.mo92146m(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.ApiChooseLocationCtrlPlugin.C250523.C250531 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        ApiChooseLocationCtrlPlugin.this.mLKEventContext.mo92190b().mo92224i("ApiChooseLocationCtrl", "system permission granted");
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", ApiChooseLocationCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "success").mo231092a();
                        }
                        ApiChooseLocationCtrlPlugin.this.chooseLocation(activity);
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        ILogger b = ApiChooseLocationCtrlPlugin.this.mLKEventContext.mo92190b();
                        b.mo92224i("ApiChooseLocationCtrl", "system permission denied:" + str);
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", ApiChooseLocationCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        ApiChooseLocationCtrlResponse apiChooseLocationCtrlResponse = new ApiChooseLocationCtrlResponse();
                        apiChooseLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_SYSTEM_AUTH_DENY.code;
                        apiChooseLocationCtrlResponse.mErrorMessage = ApiCode.GENERAL_SYSTEM_AUTH_DENY.msg;
                        ApiChooseLocationCtrlPlugin.this.mEventInvokeCallback.callback(apiChooseLocationCtrlResponse);
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: b */
            public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                ApiChooseLocationCtrlPlugin.this.mLKEventContext.mo92190b().mo92224i("ApiChooseLocationCtrl", "app permission denied");
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", ApiChooseLocationCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(12)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                ApiChooseLocationCtrlResponse apiChooseLocationCtrlResponse = new ApiChooseLocationCtrlResponse();
                apiChooseLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_USER_AUTH_DENIED.code;
                apiChooseLocationCtrlResponse.mErrorMessage = ApiCode.GENERAL_USER_AUTH_DENIED.msg;
                ApiChooseLocationCtrlPlugin.this.mEventInvokeCallback.callback(apiChooseLocationCtrlResponse);
            }
        }, null);
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        C67525e handleChooseLocationResult = HostDependManager.getInst().handleChooseLocationResult(i, i2, intent);
        if (handleChooseLocationResult != null) {
            if (handleChooseLocationResult.mo234483a()) {
                this.mLKEventContext.mo92190b().mo92224i("ApiChooseLocationCtrl", "handle activity cancel");
                ApiChooseLocationCtrlResponse apiChooseLocationCtrlResponse = new ApiChooseLocationCtrlResponse();
                apiChooseLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_CANCEL.code;
                apiChooseLocationCtrlResponse.mErrorMessage = ApiCode.GENERAL_CANCEL.msg;
                this.mEventInvokeCallback.callback(apiChooseLocationCtrlResponse);
            } else {
                ApiChooseLocationCtrlResponse apiChooseLocationCtrlResponse2 = new ApiChooseLocationCtrlResponse();
                new HashMap();
                String d = handleChooseLocationResult.mo234486d();
                String e = handleChooseLocationResult.mo234487e();
                double b = handleChooseLocationResult.mo234484b();
                double c = handleChooseLocationResult.mo234485c();
                if (d != null) {
                    apiChooseLocationCtrlResponse2.name = d;
                }
                if (e != null) {
                    apiChooseLocationCtrlResponse2.address = e;
                }
                apiChooseLocationCtrlResponse2.latitude = b;
                apiChooseLocationCtrlResponse2.longitude = c;
                this.mEventInvokeCallback.callback(apiChooseLocationCtrlResponse2);
            }
        }
        return super.handleActivityResult(i, i2, intent);
    }

    @LKPluginFunction(async = true, eventName = {"chooseLocation"})
    public void chooseLocationCtrlAsync(final LKEvent lKEvent, ApiChooseLocationCtrlRequest apiChooseLocationCtrlRequest, final AbstractC25895f fVar, AbstractC25897h<ApiChooseLocationCtrlResponse> hVar) {
        this.mEventInvokeCallback = hVar;
        this.mLKEventContext = fVar;
        String str = apiChooseLocationCtrlRequest.type;
        this.type = str;
        if (TextUtils.isEmpty(str)) {
            this.type = "wgs84";
        }
        ApiChooseLocationCtrlResponse apiChooseLocationCtrlResponse = new ApiChooseLocationCtrlResponse();
        final Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            apiChooseLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiChooseLocationCtrlResponse.mErrorMessage = "activity is null";
            hVar.callback(apiChooseLocationCtrlResponse);
            fVar.mo92190b().mo92223e("ApiChooseLocationCtrl", "activity is null");
            return;
        }
        final boolean b = ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50184b(12);
        ILogger b2 = fVar.mo92190b();
        b2.mo92224i("ApiChooseLocationCtrl", "chooseLocation start, has app permission:" + b);
        Observable.create(new Function<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.ApiChooseLocationCtrlPlugin.C250512 */

            /* renamed from: a */
            public Boolean fun() {
                return C24588a.m89632c();
            }
        }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.ApiChooseLocationCtrlPlugin.C250501 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                ApiChooseLocationCtrlPlugin.this.apiChooseLocation(currentActivity, b, lKEvent);
                fVar.mo92190b().mo92223e("ApiChooseLocationCtrl", th);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    fVar.mo92190b().mo92224i("ApiChooseLocationCtrl", "use new permission dialog");
                    ApiChooseLocationCtrlPlugin.this.apiChooseLocationNew(currentActivity, b, lKEvent);
                    return;
                }
                fVar.mo92190b().mo92224i("ApiChooseLocationCtrl", "use old permission dialog");
                ApiChooseLocationCtrlPlugin.this.apiChooseLocation(currentActivity, b, lKEvent);
            }
        });
    }
}
