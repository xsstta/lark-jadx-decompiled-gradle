package com.ss.android.lark.littleapp.service.p2132a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.common.utility.Logger;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13322k;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.lark.applink.C29187c;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.EnvInfo;
import com.ss.android.lark.littleapp.entity.ChatModel;
import com.ss.android.lark.littleapp.p2124b.AbstractC41301a;
import com.ss.android.lark.littleapp.p2131f.C41350a;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.optrace.core.C48939c;
import com.ss.android.lark.process_statistics.C52238a;
import com.ss.android.lark.process_statistics.IProcessLauchReporter;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.C57826g;
import com.tt.miniapphost.C67554l;
import com.tt.refer.common.util.C67866g;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.service.a.c */
public class C41426c extends C41425b implements AbstractC41371j {

    /* renamed from: a */
    public Context f105306a;

    /* renamed from: b */
    public ILittleAppService f105307b;

    /* renamed from: c */
    public Map<String, Boolean> f105308c = new HashMap();

    /* renamed from: d */
    private ILittleAppService.AbstractC41416a f105309d;

    /* renamed from: e */
    private AbstractC41301a f105310e;

    @Override // com.ss.android.lark.littleapp.AbstractC41298a
    /* renamed from: a */
    public void mo148740a(String str) {
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo149000a(String str, JSONObject jSONObject) {
        this.f105309d.mo144280b(str, jSONObject);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148991a(String str, float f, long j, String str2, long j2, AbstractC41371j.AbstractC41380i iVar) {
        if (iVar != null) {
            this.f105309d.mo144258a(this.f105306a, str, f, j, str2, j2, iVar);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148996a(String str, String str2) {
        TracingCoreSpan a = C48939c.m192792a().mo170890a().mo170896a();
        if (!mo149025h("gadget.log.trace") || a == null) {
            Log.m165379d(str, str2);
            return;
        }
        Log.m165379d(str, str2 + " logId:" + a.getTracingID());
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public boolean mo149006a(Context context, String str) {
        return this.f105309d.mo144274a(context, str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148988a(WebView webView) {
        this.f105310e.onCreateWebView(webView);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148999a(final String str, String str2, final String str3, int i, int i2, final AbstractC41371j.AbstractC41379h hVar) {
        if (this.f105306a == null) {
            Logger.m15170e("LittleAppCallbackImpl", "liveCheck context is null");
            return;
        }
        if (BytedCertManager.getInstance().getNetWork() == null) {
            this.f105309d.mo144305j();
        }
        C57826g.m224473a().mo196181a(this.f105306a, str2, str3, i, i2, C41354g.m163939a().getDeviceId(), new C57826g.AbstractC57831a() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.C414271 */

            @Override // com.ss.android.lark.utils.C57826g.AbstractC57831a
            /* renamed from: a */
            public boolean mo149194a() {
                Boolean bool = C41426c.this.f105308c.get(str);
                if (bool == null || !bool.booleanValue()) {
                    return true;
                }
                return false;
            }
        }, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.C414304 */

            /* renamed from: a */
            public void onSuccess(Void r3) {
                C41437d.m164411e().mo149150a(C41426c.this.f105306a, str);
                hVar.mo149055a(str3);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult.getErrorCode() != -1002) {
                    C41426c.this.f105307b.mo149150a(C41426c.this.f105306a, str);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errorCode", errorResult.getErrorCode());
                    jSONObject.put("errorMsg", errorResult.getDebugMsg());
                } catch (JSONException e) {
                    Log.m165384e("LittleAppCallbackImpl", "doFaceLiveness JSONException", e);
                }
                hVar.mo149056a(jSONObject);
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo149001a(String str, boolean z, final AbstractC41371j.AbstractC41375d dVar) {
        C41350a.m163930a().mo148932a(this.f105306a);
        AppBrandLogger.m52830i("LittleAppCallbackImpl", "start cert sdk check");
        if (z) {
            BytedCertManager.getInstance().checkLoadStatus(this.f105306a, new SDKCallBack.AbstractC28329b() {
                /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.C414315 */

                @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28329b
                /* renamed from: a */
                public void mo100933a(BDResponse bDResponse) {
                    Log.m165389i("LittleAppCallbackImpl", "faceOfflineCheckReady onFinish response = " + bDResponse);
                    AbstractC41371j.AbstractC41375d dVar = dVar;
                    if (dVar != null) {
                        dVar.onCheckState(C41350a.m163930a().mo148931a(bDResponse));
                    } else {
                        Log.m165383e("LittleAppCallbackImpl", "faceOfflineCheckReady callback is null");
                    }
                }
            });
        } else if (dVar != null) {
            C41350a.m163930a().mo148933b(this.f105306a);
            dVar.onCheckState(C41350a.m163930a().mo148931a(BytedCertManager.getInstance().checkModelAvailable()));
        } else {
            Log.m165383e("LittleAppCallbackImpl", "faceOfflineCheckReady callback is null checkUpdate = false");
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148994a(String str, final AbstractC41371j.AbstractC41373b bVar) {
        Log.m165389i("LittleAppCallbackImpl", "faceOfflinePrepare start");
        try {
            C41350a.m163930a().mo148932a(this.f105306a);
            String a = BytedCertManager.getInstance().getDownloadConfig().mo100821a();
            File[] fileArr = null;
            if (!TextUtils.isEmpty(a)) {
                File file = new File(a);
                if (file.isDirectory()) {
                    fileArr = file.listFiles();
                }
            }
            Log.m165389i("LittleAppCallbackImpl", "modulePath = " + a + " , modules " + fileArr);
        } catch (Exception e) {
            Log.m165390i("LittleAppCallbackImpl", "faceOfflinePrepare error ", e);
        }
        BytedCertManager.getInstance().preload(this.f105306a, new SDKCallBack.AbstractC28329b() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.C414326 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.AbstractC28329b
            /* renamed from: a */
            public void mo100933a(BDResponse bDResponse) {
                Log.m165389i("LittleAppCallbackImpl", "faceOfflinePrepare onFinish response = " + bDResponse);
                AbstractC41371j.AbstractC41373b bVar = bVar;
                if (bVar != null) {
                    bVar.mo149051a(C41350a.m163930a().mo148931a(bDResponse));
                } else {
                    Log.m165383e("LittleAppCallbackImpl", "faceOfflinePrepare is null");
                }
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148997a(final String str, final String str2, final AbstractC41371j.AbstractC41374c cVar) {
        Log.m165389i("LittleAppCallbackImpl", "faceOfflineStart , path = " + str2);
        C41350a.m163930a().mo148932a(this.f105306a);
        Observable.create(new ObservableOnSubscribe<Bitmap>() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.C414369 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Bitmap> observableEmitter) throws Exception {
                if (TextUtils.isEmpty(str2) || !new File(str2).exists()) {
                    Log.m165389i("LittleAppCallbackImpl", "faceOfflineStart , bitmap is invalid");
                    JSONObject a = C41350a.m163930a().mo148930a(10052, "bitmap is invalid");
                    AbstractC41371j.AbstractC41374c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo149052a(a);
                    } else {
                        Log.m165383e("LittleAppCallbackImpl", "faceOfflineStart , path err and callback is null");
                    }
                } else {
                    observableEmitter.onNext(C57820d.m224433a(str2, DeviceUtils.getScreenHeight(C41426c.this.f105306a) * DeviceUtils.getScreenWidth(C41426c.this.f105306a)));
                }
            }
        }).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Bitmap>() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.C414337 */

            /* renamed from: a */
            public void accept(Bitmap bitmap) throws Exception {
                Log.m165389i("LittleAppCallbackImpl", "do offline facelive at  " + Thread.currentThread().getName());
                if (bitmap != null) {
                    BytedCertManager.getInstance().doOfflineFaceLive(C41426c.this.f105306a, bitmap, new SDKCallBack.FaceLiveCallback() {
                        /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.C414337.C414341 */

                        @Override // com.ss.android.bytedcert.callback.SDKCallBack.FaceLiveCallback
                        public void onFaceLiveFinish(BDResponse bDResponse) {
                            Log.m165389i("LittleAppCallbackImpl", "faceOfflineStart onFinish response = " + bDResponse);
                            if (bDResponse == null || (!bDResponse.success && bDResponse.errorCode == -1002)) {
                                Log.m165383e("LittleAppCallbackImpl", "faceOfflineStart not resume");
                            } else {
                                C41426c.this.f105307b.mo149150a(C41426c.this.f105306a, str);
                                Log.m165389i("LittleAppCallbackImpl", "faceOfflineStart " + bDResponse.success + " , so resume");
                            }
                            if (cVar != null) {
                                cVar.mo149052a(C41350a.m163930a().mo148931a(bDResponse));
                            } else {
                                Log.m165383e("LittleAppCallbackImpl", "faceOfflineStart callback is null");
                            }
                        }
                    });
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.C414358 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                if (cVar != null) {
                    C41350a a = C41350a.m163930a();
                    cVar.mo149052a(a.mo148930a(10051, "face_verify error " + th.getMessage()));
                }
                Log.m165383e("LittleAppCallbackImpl", "faceOfflineStart error : " + th);
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148992a(String str, int i, String str2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException unused) {
            Log.m165383e("LittleAppCallbackImpl", "monitorStatusRate parse json error");
            jSONObject = null;
        }
        this.f105309d.mo144267a(str, i, jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041 A[Catch:{ JSONException -> 0x0048 }] */
    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo148998a(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.littleapp.service.p2132a.C41426c.mo148998a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148993a(String str, final AbstractC41371j.AbstractC41372a aVar) {
        if (TextUtils.isEmpty(str)) {
            aVar.mo149050a("");
        } else {
            this.f105310e.getAppStrategyInfo(str, new AbstractC41301a.AbstractC41305d() {
                /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.AnonymousClass10 */

                @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41305d
                /* renamed from: a */
                public void mo148750a(String str) {
                    aVar.mo149050a(str);
                }
            });
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148989a(AbstractC41371j.AbstractC41376e eVar) {
        AppBrandLogger.m52830i("LittleAppCallbackImpl", "getDeviceID");
        ILittleAppService.AbstractC41416a aVar = this.f105309d;
        if (aVar != null) {
            aVar.mo144262a(eVar);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148995a(String str, AbstractC41371j.AbstractC41378g gVar) {
        ILittleAppService.AbstractC41416a aVar = this.f105309d;
        if (aVar != null) {
            aVar.mo144268a(str, gVar);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public boolean mo149007a(String str, String str2, boolean z) {
        this.f105309d.mo144277a(this.f105306a, str, str2, z);
        return true;
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41298a
    /* renamed from: a */
    public void mo148742a(String str, boolean z) {
        if (C26252ad.m94993b(this.f105306a)) {
            this.f105309d.mo144271a(str, z);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo149004a(boolean z) {
        this.f105309d.mo144272a(z);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41298a
    /* renamed from: a */
    public void mo148738a(final Intent intent) {
        C67866g.m264025a(new Action() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.AnonymousClass11 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                IProcessLauchReporter.LaunchReason launchReason = (IProcessLauchReporter.LaunchReason) intent.getSerializableExtra("reason");
                AppBrandLogger.m52830i("LittleAppCallbackImpl", "onMiniappServiceBind, launchReason: " + launchReason);
                if (launchReason != null) {
                    new C52238a().mo178816a(launchReason);
                }
            }
        }, C67554l.m262725b());
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41298a
    /* renamed from: a */
    public void mo148739a(final Intent intent, int i, final int i2) {
        C67866g.m264025a(new Action() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.C414282 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                IProcessLauchReporter.LaunchReason launchReason = (IProcessLauchReporter.LaunchReason) intent.getSerializableExtra("reason");
                AppBrandLogger.m52830i("LittleAppCallbackImpl", "onMiniappServiceStart, launchReason: " + launchReason + ", startId: " + i2);
                if (launchReason != null) {
                    new C52238a().mo178816a(launchReason);
                }
            }
        }, C67554l.m262725b());
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41298a
    /* renamed from: a */
    public void mo148741a(String str, int i) {
        if (C26252ad.m94993b(this.f105306a)) {
            this.f105309d.mo144266a(str, i);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148990a(AbstractC41371j.AbstractC41377f fVar) {
        this.f105309d.mo144263a(fVar);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public boolean mo149005a(Context context, Intent intent) {
        if (DesktopUtil.m144301a(context)) {
            Activity h = C36519d.m144080a().mo134826h();
            if (C57582a.m223607a(h)) {
                if (C26326z.m95343g()) {
                    intent.removeFlags(268435456);
                }
                C36512a.m144041a().mo134756a(h, new StandAloneParam.C36572a(intent, 2).mo134966a(350).mo134968b(730).mo134967a());
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148987a(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC13322k.AbstractC13324b bVar) {
        this.f105310e.previewCard(context, list, cardContent, z, bVar);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo149003a(List<String> list, AbstractC13322k.AbstractC13323a aVar) {
        this.f105310e.getChatAvatar(list, aVar);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo149002a(String str, boolean z, String str2, String str3) {
        AppBrandLogger.m52830i("LittleAppCallbackImpl", "onGadgetCheckUpdateDone, appId: " + str + "-" + z);
        this.f105310e.onGadgetCheckUpdateDone(str, z, str2, str3);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: j */
    public int mo149028j() {
        return this.f105310e.getCurNetworkLevel();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: n */
    public boolean mo149037n() {
        return DesktopUtil.m144301a(this.f105306a);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: p */
    public AbstractC13304a mo149040p() {
        return this.f105309d.mo144254a();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: q */
    public long mo149042q() {
        return this.f105310e.getProcessStartTime();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: r */
    public String mo149044r() {
        return this.f105309d.mo144301h();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: s */
    public String mo149046s() {
        return this.f105309d.mo144299g();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: u */
    public C29187c mo149048u() {
        return this.f105309d.mo144303i();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: v */
    public void mo149049v() {
        this.f105310e.initAuditSdk();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public String mo148977a() {
        return this.f105310e.getLoginDependency().mo144246a();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: b */
    public String mo149008b() {
        return this.f105310e.getLoginDependency().mo144250e();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: c */
    public String mo149013c() {
        return this.f105310e.getLoginDependency().mo144251f();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: d */
    public String mo149015d() {
        return this.f105310e.getLoginDependency().mo144247b();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: e */
    public String mo149017e() {
        return this.f105310e.getLoginDependency().mo144248c();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: h */
    public boolean mo149024h() {
        return !this.f105310e.getLoginDependency().mo144249d();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: i */
    public void mo149027i() {
        ILittleAppService.AbstractC41416a aVar = this.f105309d;
        if (aVar != null) {
            aVar.mo144291d();
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: k */
    public boolean mo149031k() {
        ILittleAppService.AbstractC41416a aVar = this.f105309d;
        if (aVar != null) {
            return aVar.mo144281b();
        }
        return false;
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: l */
    public String mo149032l() {
        ILittleAppService.AbstractC41416a aVar = this.f105309d;
        if (aVar != null) {
            return aVar.mo144286c();
        }
        return null;
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: m */
    public String mo149035m() {
        return this.f105309d.mo144295e();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: t */
    public void mo149047t() {
        this.f105310e.getBrowserDependency().mo144238a();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: f */
    public Locale mo149019f() {
        Locale languageSetting = this.f105310e.getLanguageSetting();
        return new Locale(languageSetting.getLanguage().toLowerCase(), languageSetting.getCountry().toUpperCase());
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: g */
    public EnvInfo mo149022g() {
        return new EnvInfo(this.f105310e.isOverseaTenantBrand(), this.f105310e.getEnvType());
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: o */
    public Long mo149039o() {
        if (this.f105309d.mo144297f().longValue() - SystemClock.elapsedRealtime() > 2592000) {
            return this.f105309d.mo144297f();
        }
        return -1L;
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public String mo148978a(DomainSettings.Alias alias) {
        return this.f105309d.mo144255a(alias);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: b */
    public String mo149009b(DomainSettings.Alias alias) {
        return this.f105310e.getDynamicDomain(alias);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: f */
    public boolean mo149021f(String str) {
        return this.f105309d.mo144294d(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: g */
    public String mo149023g(String str) {
        return this.f105309d.mo144298f(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: i */
    public String mo149026i(String str) {
        return this.f105309d.mo144302h(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: k */
    public void mo149030k(String str) {
        this.f105309d.mo144306j(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: l */
    public String mo149033l(String str) {
        return this.f105309d.mo144300g(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: m */
    public ChatModel mo149034m(String str) {
        return this.f105310e.getChatByTriggerCode(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: o */
    public double mo149038o(String str) {
        return this.f105310e.getBlankRate(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: j */
    public void mo149029j(String str) {
        this.f105309d.mo144304i(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: p */
    public void mo149041p(String str) {
        this.f105310e.auditOpenMiniAppEvent(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: q */
    public boolean mo149043q(String str) {
        return this.f105310e.checkToShow(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: r */
    public void mo149045r(String str) {
        this.f105310e.completeGuide(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41298a
    /* renamed from: b */
    public void mo148743b(final Intent intent) {
        C67866g.m264025a(new Action() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41426c.C414293 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                IProcessLauchReporter.LaunchReason launchReason = (IProcessLauchReporter.LaunchReason) intent.getSerializableExtra("reason");
                AppBrandLogger.m52830i("LittleAppCallbackImpl", "onMiniappActivityCreate, launchReason: " + launchReason);
                C52238a aVar = new C52238a();
                if (launchReason != null) {
                    aVar.mo178816a(launchReason);
                }
                aVar.mo178815a(IProcessLauchReporter.BusinessType.MINI_APP, System.currentTimeMillis());
            }
        }, C67554l.m262725b());
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41298a
    /* renamed from: c */
    public void mo148745c(String str) {
        if (C26252ad.m94993b(this.f105306a)) {
            this.f105309d.mo144279b(str);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41298a
    /* renamed from: d */
    public void mo148746d(String str) {
        if (C26252ad.m94993b(this.f105306a)) {
            this.f105308c.put(str, true);
            this.f105307b.mo149187d(str);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41298a
    /* renamed from: e */
    public void mo148747e(String str) {
        if (C26252ad.m94993b(this.f105306a)) {
            this.f105308c.put(str, false);
            this.f105307b.mo149189e(str);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: h */
    public boolean mo149025h(String str) {
        ILittleAppService.AbstractC41416a aVar = this.f105309d;
        if (aVar != null) {
            return aVar.mo144296e(str);
        }
        return false;
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41298a
    /* renamed from: b */
    public void mo148744b(String str) {
        if (C26252ad.m94993b(this.f105306a)) {
            this.f105309d.mo144265a(str);
            this.f105307b.mo149190f(str);
            return;
        }
        this.f105310e.logBoostTracer("webview_page_finish_time", Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: n */
    public void mo149036n(String str) {
        AppBrandLogger.m52830i("LittleAppCallbackImpl", "onGadgetDownloadFailed, appId: " + str);
        this.f105310e.onGadgetDownloadFailed(str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public List<AbstractC13322k.C13325c> mo148979a(List<String> list, String str) {
        return this.f105310e.sendTextMessage(list, str);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: c */
    public void mo149014c(String str, String str2) {
        TracingCoreSpan a = C48939c.m192792a().mo170890a().mo170896a();
        if (!mo149025h("gadget.log.trace") || a == null) {
            Log.m165397w(str, str2);
            return;
        }
        Log.m165397w(str, str2 + " logId:" + a.getTracingID());
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: d */
    public void mo149016d(String str, String str2) {
        TracingCoreSpan a = C48939c.m192792a().mo170890a().mo170896a();
        if (!mo149025h("gadget.log.trace") || a == null) {
            Log.m165383e(str, str2);
        } else {
            Log.error(a.getTracingID(), str, str2, (Map<String, String>) null);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: e */
    public void mo149018e(String str, String str2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException unused) {
            Log.m165383e("LittleAppCallbackImpl", "monitorCommonLog parse json error");
            jSONObject = null;
        }
        this.f105309d.mo144269a(str, jSONObject);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: f */
    public void mo149020f(String str, String str2) {
        AppBrandLogger.m52830i("LittleAppCallbackImpl", "onGadgetDownloadFinish, appId: " + str + "-" + str2);
        this.f105310e.onGadgetDownloadFinish(str, str2);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: b */
    public void mo149010b(String str, String str2) {
        TracingCoreSpan a = C48939c.m192792a().mo170890a().mo170896a();
        if (!mo149025h("gadget.log.trace") || a == null) {
            Log.m165389i(str, str2);
        } else {
            Log.info(a.getTracingID(), str, str2, (Map<String, String>) null);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: b */
    public boolean mo149012b(String str, boolean z) {
        ILittleAppService.AbstractC41416a aVar = this.f105309d;
        if (aVar != null) {
            return aVar.mo144285b(str, z);
        }
        return false;
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148982a(Context context, String str, String str2) {
        ILittleAppService.AbstractC41416a aVar = this.f105309d;
        if (aVar != null) {
            aVar.mo144259a(context, str, str2);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: b */
    public boolean mo149011b(String str, String str2, boolean z) {
        this.f105309d.mo144284b(this.f105306a, str, str2, z);
        return true;
    }

    public C41426c(Context context, ILittleAppService.AbstractC41416a aVar, ILittleAppService iLittleAppService, AbstractC41301a aVar2) {
        this.f105306a = context;
        this.f105309d = aVar;
        this.f105307b = iLittleAppService;
        this.f105310e = aVar2;
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148984a(Context context, String str, String str2, String str3) {
        ILittleAppService.AbstractC41416a aVar = this.f105309d;
        if (aVar != null) {
            aVar.mo144260a(context, str, str2, str3);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148986a(Context context, String str, String[] strArr, DialogInterface.OnClickListener onClickListener) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            arrayList.add(new LKUIListItemData(str2));
        }
        ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) new C25644o(context).mo89222a(0.8f)).mo89257p(17)).mo89210d(R.layout.lark_brand_action_sheet_item)).mo89205a(arrayList)).mo89202a(onClickListener)).mo89239c();
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148981a(Context context, Intent intent, int i, int i2, String str) {
        IProcessLauchReporter.LaunchReason launchReason;
        if (intent == null) {
            return;
        }
        if (i == 1) {
            if (i2 > 1000) {
                launchReason = IProcessLauchReporter.LaunchReason.INNER_PRELOAD_MINI_APP;
            } else if (i2 == 2) {
                launchReason = IProcessLauchReporter.LaunchReason.MSG_CARD_PRELOAD_MINI_APP;
            } else if (i2 == 1) {
                launchReason = IProcessLauchReporter.LaunchReason.APP_CENTER_PRELOAD_MINI_APP;
            } else {
                launchReason = null;
            }
            if (launchReason != null) {
                AppBrandLogger.m52830i("LittleAppCallbackImpl", "launchReason: " + launchReason);
                intent.putExtra("reason", launchReason);
                return;
            }
            AppBrandLogger.m52829e("LittleAppCallbackImpl", "launchReason is null");
        } else if (i == 2) {
            intent.putExtra("reason", IProcessLauchReporter.LaunchReason.OPEN_MINI_APP);
        }
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148983a(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC13322k.AbstractC13324b bVar) {
        this.f105310e.previewCard(context, str, str2, cardContent, z, bVar);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148980a(Activity activity, String str, String str2, double d, double d2, int i, String str3) {
        this.f105310e.openLocation(activity, str, str2, d, d2, i, str3);
    }

    @Override // com.ss.android.lark.littleapp.AbstractC41371j
    /* renamed from: a */
    public void mo148985a(Context context, String str, String str2, String str3, Map<String, String> map, int i, int i2) {
        ILittleAppService.AbstractC41416a aVar = this.f105309d;
        if (aVar != null) {
            aVar.mo144261a(context, str, str2, str3, map, i, i2);
        }
    }
}
