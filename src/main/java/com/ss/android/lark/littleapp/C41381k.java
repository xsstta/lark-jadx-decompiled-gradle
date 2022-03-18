package com.ss.android.lark.littleapp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.hostbridge.sync.C13118f;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13314g;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13317i;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13320j;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13322k;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13307d;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.suite.R;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.k */
public class C41381k implements ExtensionWrapper {

    /* renamed from: a */
    private AbstractC41371j f105228a;

    @Override // com.bytedance.ee.larkbrand.service.extension.AppLogger
    /* renamed from: a */
    public void mo49574a(String str, JSONObject jSONObject) {
        this.f105228a.mo149000a(str, jSONObject);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AppLogger
    /* renamed from: a */
    public void mo49573a(String str, String str2) {
        this.f105228a.mo148996a(str, str2);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13316h
    /* renamed from: a */
    public void mo49588a(Context context, String str, String[] strArr, final AbstractC67550j.AbstractC67551a<Integer> aVar) {
        this.f105228a.mo148986a(context, str, strArr, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.littleapp.C41381k.DialogInterface$OnClickListenerC413821 */

            public void onClick(DialogInterface dialogInterface, int i) {
                aVar.onNativeModuleCall(Integer.valueOf(i));
            }
        });
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.ShareToLarkWrapper
    /* renamed from: a */
    public void mo49613a(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, IAppContext iAppContext) {
        C41300b.m163754a(z, str, str2, str3, str4, str5, z2, str6, iAppContext);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkNativeWrapper
    /* renamed from: a */
    public boolean mo49608a(String str, String str2, boolean z, Activity activity) {
        return C41300b.m163753a(str, str2, z, activity);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkNativeWrapper
    /* renamed from: a */
    public void mo49606a(String str, String str2, Activity activity) {
        C41300b.m163741a(str, str2, activity);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13314g
    /* renamed from: a */
    public void mo49587a(String str, final AbstractC13314g.AbstractC13315a aVar) {
        this.f105228a.mo148993a(str, new AbstractC41371j.AbstractC41372a() {
            /* class com.ss.android.lark.littleapp.C41381k.C413843 */

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41372a
            /* renamed from: a */
            public void mo149050a(String str) {
                if (TextUtils.isEmpty(str)) {
                    aVar.mo48844a();
                } else {
                    aVar.mo48845a(str);
                }
            }
        });
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13313f
    /* renamed from: a */
    public void mo49586a(String str, IAppContext iAppContext) {
        mo49609b(str, C67432a.m262319a(iAppContext).getAppInfo().appId, true);
        this.f105228a.mo149027i();
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkNativeWrapper
    /* renamed from: a */
    public boolean mo49607a(String str, String str2, boolean z) {
        return C13374s.m54400c(str, str2, z);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkNativeWrapper
    /* renamed from: a */
    public void mo49603a(Context context, String str, String str2, String str3, Map<String, String> map) {
        this.f105228a.mo148985a(context, str, str2, str3, map, R.anim.microapp_i_slide_in_right, R.anim.microapp_i_stay_out);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkNativeWrapper
    /* renamed from: a */
    public void mo49605a(IAppContext iAppContext) {
        Activity currentActivity = iAppContext.getCurrentActivity();
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (currentActivity != null || appInfo != null) {
            this.f105228a.mo148984a(currentActivity, appInfo.appName, appInfo.appId, appInfo.version);
        }
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13307d
    /* renamed from: a */
    public void mo49564a(String str, final AbstractC13307d.AbstractC13308a aVar) {
        this.f105228a.mo148995a(str, new AbstractC41371j.AbstractC41378g() {
            /* class com.ss.android.lark.littleapp.C41381k.C413854 */

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41378g
            /* renamed from: a */
            public void mo149053a() {
                AbstractC13307d.AbstractC13308a aVar = aVar;
                if (aVar != null) {
                    aVar.mo49162a();
                }
            }

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41378g
            /* renamed from: a */
            public void mo149054a(String str) {
                AbstractC13307d.AbstractC13308a aVar = aVar;
                if (aVar != null) {
                    aVar.mo49163a(str);
                }
            }
        });
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkNativeWrapper
    /* renamed from: a */
    public void mo49604a(WebView webView) {
        this.f105228a.mo148988a(webView);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13311d
    /* renamed from: a */
    public boolean mo49583a(Context context, Intent intent) {
        return this.f105228a.mo149005a(context, intent);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13322k
    /* renamed from: a */
    public void mo49597a(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC13322k.AbstractC13324b bVar) {
        this.f105228a.mo148987a(context, list, cardContent, z, bVar);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.TTWebviewSchedulerWrapper
    /* renamed from: a */
    public void mo49615a(boolean z) {
        this.f105228a.mo149004a(z);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i
    /* renamed from: a */
    public void mo49591a(String str, String str2, String str3, int i, int i2, final AbstractC13317i.AbstractC13319b bVar) {
        this.f105228a.mo148999a(str, str2, str3, i, i2, new AbstractC41371j.AbstractC41379h() {
            /* class com.ss.android.lark.littleapp.C41381k.C413876 */

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41379h
            /* renamed from: a */
            public void mo149055a(String str) {
                bVar.mo49154a(str);
            }

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41379h
            /* renamed from: a */
            public void mo149056a(JSONObject jSONObject) {
                bVar.mo49155a(jSONObject);
            }
        });
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i
    /* renamed from: a */
    public void mo49592a(String str, boolean z, AbstractC13317i.AbstractC13318a aVar) {
        this.f105228a.mo149001a(str, z, new AbstractC41371j.AbstractC41375d() {
            /* class com.ss.android.lark.littleapp.$$Lambda$k$O_rQ0ncNUg_cc_G53CYru17Q0Yo */

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41375d
            public final void onCheckState(JSONObject jSONObject) {
                C41381k.lambda$O_rQ0ncNUg_cc_G53CYru17Q0Yo(AbstractC13317i.AbstractC13318a.this, jSONObject);
            }
        });
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i
    /* renamed from: a */
    public void mo49589a(String str, final AbstractC13317i.AbstractC13318a aVar) {
        this.f105228a.mo148994a(str, new AbstractC41371j.AbstractC41373b() {
            /* class com.ss.android.lark.littleapp.C41381k.C413887 */

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41373b
            /* renamed from: a */
            public void mo149051a(JSONObject jSONObject) {
                AbstractC13317i.AbstractC13318a aVar = aVar;
                if (aVar != null) {
                    aVar.onResult(jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i
    /* renamed from: a */
    public void mo49590a(String str, String str2, final AbstractC13317i.AbstractC13318a aVar) {
        this.f105228a.mo148997a(str, str2, new AbstractC41371j.AbstractC41374c() {
            /* class com.ss.android.lark.littleapp.C41381k.C413898 */

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41374c
            /* renamed from: a */
            public void mo149052a(JSONObject jSONObject) {
                AbstractC13317i.AbstractC13318a aVar = aVar;
                if (aVar != null) {
                    aVar.onResult(jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13310b
    /* renamed from: a */
    public void mo49578a(String str) {
        this.f105228a.mo149041p(str);
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13309e
    /* renamed from: b */
    public String mo49565b() {
        return this.f105228a.mo148977a();
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13309e
    /* renamed from: c */
    public String mo49566c() {
        return this.f105228a.mo149015d();
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13309e
    /* renamed from: d */
    public String mo49567d() {
        return this.f105228a.mo149008b();
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13309e
    /* renamed from: e */
    public String mo49568e() {
        return this.f105228a.mo149013c();
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13309e
    /* renamed from: f */
    public String mo49569f() {
        return this.f105228a.mo149017e();
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13310b
    /* renamed from: g */
    public void mo49579g() {
        this.f105228a.mo149049v();
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public int getCurNetworkLevel() {
        return this.f105228a.mo149028j();
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public AbstractC13304a getMapModel() {
        return this.f105228a.mo149040p();
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public String getTTWebViewSoVersion() {
        return this.f105228a.mo149032l();
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13311d
    /* renamed from: h */
    public boolean mo49584h() {
        return this.f105228a.mo149037n();
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public boolean isUsingTTWebView() {
        return this.f105228a.mo149031k();
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.TTWebviewSchedulerWrapper
    /* renamed from: j */
    public String mo49616j() {
        return this.f105228a.mo149046s();
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.TTWebviewSchedulerWrapper
    /* renamed from: k */
    public String mo49617k() {
        return this.f105228a.mo149044r();
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13327q
    /* renamed from: l */
    public boolean mo49618l() {
        return this.f105228a.mo149024h();
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.ShareToLarkWrapper
    /* renamed from: i */
    public boolean mo49614i() {
        return this.f105228a.mo149025h("appcenter.cardshare");
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public long getServerTime() {
        CrossProcessDataEntity b = C13118f.m53717b("get_ntp_time", null);
        if (b != null) {
            return b.mo234738a("ntp_time", -1L);
        }
        return -1;
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13305b
    /* renamed from: a */
    public Locale mo49563a() {
        return this.f105228a.mo149019f();
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkNativeWrapper
    /* renamed from: a */
    public void mo49601a(Activity activity) {
        C41300b.m163739a(activity);
    }

    public C41381k(AbstractC41371j jVar) {
        this.f105228a = jVar;
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public void onMiniappActivityCreate(Intent intent) {
        this.f105228a.mo148743b(intent);
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public void onMiniappServiceBind(Intent intent) {
        this.f105228a.mo148738a(intent);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13312e
    /* renamed from: a */
    public String mo49585a(DomainSettings.Alias alias) {
        return this.f105228a.mo149009b(alias);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13326l
    /* renamed from: e */
    public boolean mo49599e(String str) {
        return this.f105228a.mo149043q(str);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13326l
    /* renamed from: f */
    public void mo49600f(String str) {
        this.f105228a.mo149045r(str);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkWebWrapper
    /* renamed from: g */
    public boolean mo49612g(String str) {
        return C13374s.m54394a(str);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.BadgeWrapper
    /* renamed from: b */
    public void mo49580b(String str) {
        C13118f.m53717b("registerBadgeChange", CrossProcessDataEntity.C67574a.m263013a().mo234760a("chat_id", (Object) str).mo234763b());
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.BadgeWrapper
    /* renamed from: c */
    public void mo49581c(String str) {
        C13118f.m53717b("unRegisterBadgeChange", CrossProcessDataEntity.C67574a.m263013a().mo234760a("chat_id", (Object) str).mo234763b());
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public void getDeviceId(final ExtensionWrapper.AbstractC13303a aVar) {
        AppBrandLogger.m52830i("MiniAppImpl", "getDeviceId ipc start");
        C13374s.m54396b(new AbstractC67565b() {
            /* class com.ss.android.lark.littleapp.C41381k.C413865 */

            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
            /* renamed from: a */
            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                if (crossProcessDataEntity != null) {
                    String b = crossProcessDataEntity.mo234744b("device_id");
                    if (!TextUtils.isEmpty(b)) {
                        aVar.mo48821a(b);
                        return;
                    }
                    AppBrandLogger.m52829e("MiniAppImpl", "device id callback data deviceId empty error");
                    aVar.mo48822b(crossProcessDataEntity.mo234740a("device_id_error", "UnKnown error"));
                    return;
                }
                AppBrandLogger.m52829e("MiniAppImpl", "device id callback data empty error");
                aVar.mo48822b("UnKnown error");
            }
        });
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.BadgeWrapper
    /* renamed from: d */
    public JSONObject mo49582d(String str) {
        CrossProcessDataEntity b = C13118f.m53717b("lark_get_chat_info", CrossProcessDataEntity.C67574a.m263013a().mo234760a("chat_id", (Object) str).mo234763b());
        if (b != null) {
            String a = b.mo234740a("chat_info", "");
            if (!TextUtils.isEmpty(a)) {
                try {
                    return new JSONObject(a);
                } catch (JSONException e) {
                    AppBrandLogger.eWithThrowable("MiniAppImpl", "getchatinfo fail", e);
                }
            }
        }
        return new JSONObject();
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public boolean getFeatureGating(String str) {
        if (C41318d.m163782a().containsKey(str)) {
            boolean h = this.f105228a.mo149025h(str);
            AppBrandLogger.m52830i("MiniAppImpl", "getFg: " + str + " value: " + h);
            return h;
        }
        AppBrandLogger.m52830i("MiniAppImpl", "fg key not in map: " + str);
        return true;
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public void decodeQRCodeActivity(String str, Activity activity) {
        C41300b.m163752a(str, activity);
    }

    /* renamed from: a */
    public static /* synthetic */ void m164096a(AbstractC13317i.AbstractC13318a aVar, JSONObject jSONObject) {
        if (aVar != null) {
            aVar.onResult(jSONObject);
        }
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public void onOpen(String str, boolean z) {
        this.f105228a.mo148742a(str, z);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AppLogger
    /* renamed from: b */
    public void mo49575b(String str, String str2) {
        this.f105228a.mo149010b(str, str2);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AppLogger
    /* renamed from: c */
    public void mo49576c(String str, String str2) {
        this.f105228a.mo149014c(str, str2);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AppLogger
    /* renamed from: d */
    public void mo49577d(String str, String str2) {
        this.f105228a.mo149016d(str, str2);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.MiniMonitor
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        String str2;
        AbstractC41371j jVar = this.f105228a;
        if (jSONObject == null) {
            str2 = "";
        } else {
            str2 = jSONObject.toString();
        }
        jVar.mo149018e(str, str2);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13322k
    /* renamed from: a */
    public List<AbstractC13322k.C13325c> mo49595a(List<String> list, String str) {
        return this.f105228a.mo148979a(list, str);
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public boolean getFeatureGating(String str, boolean z) {
        AbstractC41371j jVar = this.f105228a;
        if (jVar != null) {
            return jVar.mo149012b(str, z);
        }
        AppBrandLogger.m52830i("MiniAppImpl", "miniAppCallback is null: " + str + " return default :" + z);
        return z;
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkWebWrapper
    /* renamed from: a */
    public void mo49611a(Context context, String str) {
        C41300b.m163740a(context, str);
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public void onMiniappServiceStart(Intent intent, int i, int i2) {
        this.f105228a.mo148739a(intent, i, i2);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.MiniMonitor
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        String str2;
        AbstractC41371j jVar = this.f105228a;
        if (jSONObject == null) {
            str2 = "";
        } else {
            str2 = jSONObject.toString();
        }
        jVar.mo148992a(str, i, str2);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.MiniMonitor
    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        AbstractC41371j jVar = this.f105228a;
        String jSONObject3 = jSONObject.toString();
        if (jSONObject2 == null) {
            str2 = "";
        } else {
            str2 = jSONObject2.toString();
        }
        jVar.mo148998a(str, jSONObject3, str2);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkNativeWrapper
    /* renamed from: b */
    public boolean mo49609b(String str, String str2, boolean z) {
        return C13374s.m54397b(str, str2, z);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkWebWrapper
    /* renamed from: a */
    public void mo49610a(Activity activity, String str, String str2) {
        C41300b.m163743a(activity, str, str2);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.OpenLarkNativeWrapper
    /* renamed from: a */
    public void mo49602a(Context context, String str, String str2) {
        this.f105228a.mo148982a(context, str, str2);
    }

    @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper
    public void preHandleIntent(Context context, Intent intent, int i, int i2, String str) {
        this.f105228a.mo148981a(context, intent, i, i2, str);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13322k
    /* renamed from: a */
    public void mo49596a(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC13322k.AbstractC13324b bVar) {
        this.f105228a.mo148983a(context, str, str2, cardContent, z, bVar);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13320j
    /* renamed from: a */
    public void mo49593a(Activity activity, String str, String str2, double d, double d2, int i, String str3) {
        this.f105228a.mo148980a(activity, str, str2, d, d2, i, str3);
    }

    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13320j
    /* renamed from: a */
    public void mo49594a(Context context, String str, float f, long j, String str2, long j2, final AbstractC13320j.AbstractC13321a aVar) {
        this.f105228a.mo148991a(str, f, j, str2, j2, new AbstractC41371j.AbstractC41380i() {
            /* class com.ss.android.lark.littleapp.C41381k.C413832 */

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
            /* renamed from: a */
            public void mo142998a() {
            }

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
            /* renamed from: a */
            public void mo143000a(String str, int i) {
                AppBrandLogger.m52829e("MiniAppImpl", "onLocationError error : " + str);
                aVar.mo48854a(str, i);
            }

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
            /* renamed from: a */
            public void mo142999a(Location location, String str, int i) {
                aVar.mo48853a(location, str, i);
            }

            @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41380i
            /* renamed from: a */
            public void mo143001a(ArrayList<Location> arrayList, Location location, String str, int i) {
                aVar.mo48855a(arrayList, location, str, i);
            }
        });
    }
}
