package com.ss.android.lark.appcenter.wrapper;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizDomain;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d;
import com.ss.android.appcenter.p1262a.p1264b.C27552a;
import com.ss.android.appcenter.p1262a.p1264b.C27554b;
import com.ss.android.appcenter.p1262a.p1264b.C27566d;
import com.ss.android.lark.appcenter.manis.AppCenterProxy;
import com.ss.android.lark.appcenter.manis.ErrorResultWrapper;
import com.ss.android.lark.appcenter.manis.IntArray;
import com.ss.android.lark.appcenter.plugin.ScanCodePlugin;
import com.ss.android.lark.appcenter.scancode.C29118b;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency;
import com.ss.android.lark.appcenter.wrapper.dto.AppCenterMenuIPCItem;
import com.ss.android.lark.appcenter.wrapper.impl.C29144a;
import com.ss.android.lark.appcenter.wrapper.impl.p1362a.C29147c;
import com.ss.android.lark.appcenter.wrapper.impl.p1362a.C29149e;
import com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29161b;
import com.ss.android.lark.appcenter.wrapper.impl.view.C29175b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.widget.listener.C58546g;
import ee.android.framework.manis.C68183b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AppCenterModule {

    /* renamed from: a */
    private IAppCenterModuleDependency.AbstractC29135f f72942a = m107044a().getLoginDependency();

    @Retention(RetentionPolicy.SOURCE)
    public @interface QrCodeSource {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScanFormat {
    }

    /* renamed from: com.ss.android.lark.appcenter.wrapper.AppCenterModule$a */
    public interface AbstractC29127a {
        boolean handleResult(Context context, String str, int i);
    }

    /* renamed from: d */
    public void mo103317d() {
    }

    /* renamed from: f */
    public String mo103320f() {
        return "appCenter";
    }

    /* renamed from: a */
    public void mo103307a(String str, IGetDataCallback<String> iGetDataCallback) {
        C29161b.m107214a(str, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo103308a(String str, final C27554b.AbstractC27562b bVar) {
        if (C26252ad.m94993b(m107044a().getContext())) {
            C27566d.m100596a(str, bVar);
        } else if (m107044a().getFeatureGatingDependency().mo103376a("lark.manis")) {
            AppCenterProxy appCenterProxy = (AppCenterProxy) C68183b.m264839a().mo237086a(m107044a().getContext(), AppCenterProxy.class);
            if (appCenterProxy == null) {
                Log.m165389i("AppCenterModule", "getEnterBotMenuItem get ipc service failed");
            } else {
                appCenterProxy.getEnterBotMenuItem(str, new AppCenterProxy.AbstractC29096c() {
                    /* class com.ss.android.lark.appcenter.wrapper.AppCenterModule.C291243 */

                    @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29096c
                    public void onSuccess(final AppCenterMenuIPCItem appCenterMenuIPCItem) {
                        bVar.onSuccess(new C27552a(appCenterMenuIPCItem.mo103398b(), appCenterMenuIPCItem.mo103397a(), appCenterMenuIPCItem.mo103399c(), appCenterMenuIPCItem.mo103404g(), appCenterMenuIPCItem.mo103400d(), appCenterMenuIPCItem.mo103402e(), appCenterMenuIPCItem.mo103403f(), new C27552a.AbstractC27553a() {
                            /* class com.ss.android.lark.appcenter.wrapper.AppCenterModule.C291243.C291251 */

                            @Override // com.ss.android.appcenter.p1262a.p1264b.C27552a.AbstractC27553a
                            public void onClick(Bundle bundle) {
                                appCenterMenuIPCItem.mo103405h().onClick(bundle);
                            }
                        }));
                    }
                });
            }
        } else {
            Log.m165389i("AppCenterModule", "should call getEnterBotMenuItem only in main process");
            C27566d.m100596a(str, bVar);
        }
    }

    /* renamed from: a */
    public void mo103304a(Context context, String str, boolean z) {
        if (DesktopUtil.m144301a(context)) {
            m107046a(str, z);
        } else {
            C27566d.m100593a(context, str, z);
        }
    }

    /* renamed from: a */
    public void mo103303a(Context context, String str, String str2, Map<String, String> map, int i, String str3) {
        C27566d.m100592a(context, str, str2, map, i, str3);
    }

    /* renamed from: a */
    public void mo103305a(Context context, int[] iArr, boolean z, AbstractC29127a aVar) {
        if (C26252ad.m94993b(m107044a().getContext())) {
            C29118b.m107036a().mo103279a(aVar);
            C29118b.m107036a().mo103278a(context, iArr, z);
            return;
        }
        CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(iArr, z, aVar, context) {
            /* class com.ss.android.lark.appcenter.wrapper.$$Lambda$AppCenterModule$1ai5zxXtlD1qPFzR44nvzbsdS5U */
            public final /* synthetic */ int[] f$0;
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ AppCenterModule.AbstractC29127a f$2;
            public final /* synthetic */ Context f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                AppCenterModule.m107047a(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    public void mo103310a(String str, boolean z, String str2, String str3) {
        C27566d.m100598a(str, z, str2, str3);
    }

    /* renamed from: a */
    public void mo103309a(String str, String str2) {
        C27566d.m100597a(str, str2);
    }

    /* renamed from: a */
    public void mo103306a(String str) {
        C27566d.m100594a(str);
    }

    /* renamed from: h */
    public void mo103323h() {
        C27528a.m100471a().mo98146d();
    }

    /* renamed from: i */
    public List<AbstractC27537d.AbstractC27539b> mo103324i() {
        return C29149e.m107168b();
    }

    /* renamed from: j */
    public List<String> mo103325j() {
        return C29144a.m107134a();
    }

    /* renamed from: a */
    public static IAppCenterModuleDependency m107044a() {
        return (IAppCenterModuleDependency) ApiUtils.getApi(IAppCenterModuleDependency.class);
    }

    /* renamed from: b */
    public void mo103312b() {
        this.f72942a.mo103391d();
    }

    /* renamed from: c */
    public void mo103315c() {
        this.f72942a.mo103392e();
        mo103319e();
    }

    /* renamed from: e */
    public void mo103319e() {
        C27528a.m100471a().mo98148f();
    }

    /* renamed from: g */
    public void mo103322g() {
        m107044a().getBrowserDependency().mo103372a();
    }

    /* renamed from: k */
    public static List<LKPluginConfig> m107049k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LKPluginConfig.C25571a().mo88745a(new ScanCodePlugin()).mo88741a(LKOpenApiBizDomain.OPEN_PLATFORM).mo88749a());
        return arrayList;
    }

    /* renamed from: b */
    public String mo103311b(Context context) {
        return C27566d.m100588a(context);
    }

    /* renamed from: c */
    public String mo103314c(Context context) {
        return C27566d.m100599b(context);
    }

    /* renamed from: d */
    public String mo103316d(Context context) {
        return C27566d.m100602c(context);
    }

    /* renamed from: e */
    public String mo103318e(Context context) {
        return C27566d.m100603d(context);
    }

    /* renamed from: f */
    public String mo103321f(Context context) {
        return C27566d.m100604e(context);
    }

    public AppCenterModule(Context context) {
        mo103300a(context);
    }

    /* renamed from: a */
    public void mo103300a(Context context) {
        if (!C27528a.m100471a().mo98149g()) {
            C27528a.m100471a().mo98140a(context, new C29147c(context));
        }
        C27528a.m100471a().mo98142a(new C28184h.AbstractC28185a() {
            /* class com.ss.android.lark.appcenter.wrapper.AppCenterModule.C291221 */

            @Override // com.ss.android.appcenter.common.util.C28184h.AbstractC28185a
            /* renamed from: a */
            public void mo100395a(String str, String str2) {
                Log.m165379d(str, str2);
            }

            @Override // com.ss.android.appcenter.common.util.C28184h.AbstractC28185a
            /* renamed from: b */
            public void mo100397b(String str, String str2) {
                Log.m165389i(str, str2);
            }

            @Override // com.ss.android.appcenter.common.util.C28184h.AbstractC28185a
            /* renamed from: c */
            public void mo100398c(String str, String str2) {
                Log.m165397w(str, str2);
            }

            @Override // com.ss.android.appcenter.common.util.C28184h.AbstractC28185a
            /* renamed from: d */
            public void mo100399d(String str, String str2) {
                Log.m165383e(str, str2);
            }

            @Override // com.ss.android.appcenter.common.util.C28184h.AbstractC28185a
            /* renamed from: a */
            public void mo100396a(String str, String str2, Throwable th) {
                Log.m165384e(str, str2, th);
            }
        });
    }

    /* renamed from: a */
    private void m107046a(String str, boolean z) {
        C58546g.C58549b c = C58546g.m227072a().mo198457c();
        C27566d.m100595a(str, c.mo198460c(), c.mo198461d(), z);
    }

    /* renamed from: a */
    public List<C27552a> mo103298a(Context context, String str) {
        if (C26252ad.m94993b(context)) {
            return C27566d.m100589a(context, str);
        }
        if (m107044a().getFeatureGatingDependency().mo103376a("lark.manis")) {
            AppCenterProxy appCenterProxy = (AppCenterProxy) C68183b.m264839a().mo237086a(context, AppCenterProxy.class);
            ArrayList arrayList = new ArrayList();
            if (appCenterProxy == null) {
                Log.m165389i("AppCenterModule", "getAppCenterMenuItems get ipc service failed");
                return arrayList;
            }
            List<AppCenterMenuIPCItem> appCenterMenuItems = appCenterProxy.getAppCenterMenuItems(str);
            if (appCenterMenuItems == null) {
                Log.m165389i("AppCenterModule", "getAppCenterMenuItems get ipc getAppCenterMenuItems empty");
                return arrayList;
            }
            for (final AppCenterMenuIPCItem appCenterMenuIPCItem : appCenterMenuItems) {
                arrayList.add(new C27552a(appCenterMenuIPCItem.mo103398b(), appCenterMenuIPCItem.mo103397a(), appCenterMenuIPCItem.mo103399c(), new C27552a.AbstractC27553a() {
                    /* class com.ss.android.lark.appcenter.wrapper.AppCenterModule.C291264 */

                    @Override // com.ss.android.appcenter.p1262a.p1264b.C27552a.AbstractC27553a
                    public void onClick(Bundle bundle) {
                        appCenterMenuIPCItem.mo103405h().onClick(bundle);
                    }
                }));
            }
            return arrayList;
        }
        Log.m165389i("AppCenterModule", "should call getAppCenterMenuItems only in main process");
        return C27566d.m100589a(context, str);
    }

    /* renamed from: a */
    public void mo103301a(Context context, String str, String str2) {
        C27566d.m100590a(context, str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m107045a(String str, final IGetDataCallback iGetDataCallback, final int i) {
        AppCenterProxy appCenterProxy = (AppCenterProxy) C68183b.m264839a().mo237086a(m107044a().getContext(), AppCenterProxy.class);
        if (appCenterProxy == null) {
            Log.m165383e("AILabManager", "doCheckFace get ipc service failed");
            return;
        }
        Log.m165389i("AILabManager", "doCheckFace get ipc service");
        appCenterProxy.doCheckFace(str, new AppCenterProxy.AbstractC29094a() {
            /* class com.ss.android.lark.appcenter.wrapper.AppCenterModule.C291232 */

            @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29094a
            public void onError(ErrorResultWrapper errorResultWrapper) {
                Log.m165383e("AILabManager", "back subprocess. doCheckFace err, " + errorResultWrapper.f72913a.getDebugMsg());
                iGetDataCallback.onError(errorResultWrapper.f72913a);
                AppCenterModule.m107044a().getLittleAppDependency().mo103381a(AppCenterModule.m107044a().getContext(), i);
            }

            @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29094a
            public void onSuccess(String str) {
                Log.m165389i("AILabManager", "back subprocess. doCheckFace onSuccess");
                iGetDataCallback.onSuccess(str);
                AppCenterModule.m107044a().getLittleAppDependency().mo103381a(AppCenterModule.m107044a().getContext(), i);
            }
        });
    }

    /* renamed from: a */
    public AbstractC44552i mo103297a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        mo103300a(context);
        return new C29175b(context, eVar, iTitleController);
    }

    /* renamed from: a */
    public void mo103299a(Activity activity, String str, IGetDataCallback<String> iGetDataCallback) {
        if (C26252ad.m94993b(m107044a().getContext())) {
            Log.m165389i("AILabManager", "doCheckFace in main process");
            C29161b.m107213a(activity, str, iGetDataCallback);
            return;
        }
        Log.m165389i("AILabManager", "doCheckFace in subprocess");
        CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(str, iGetDataCallback, activity.getTaskId()) {
            /* class com.ss.android.lark.appcenter.wrapper.$$Lambda$AppCenterModule$x_owU_dgSrROKLFBhvlIAcqt9PU */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ IGetDataCallback f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                AppCenterModule.this.m107045a((AppCenterModule) this.f$1, (String) this.f$2, (IGetDataCallback) this.f$3);
            }
        });
    }

    /* renamed from: b */
    public void mo103313b(Context context, String str, String str2, String str3) {
        C27566d.m100601b(context, str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m107047a(int[] iArr, boolean z, AbstractC29127a aVar, Context context) {
        AppCenterProxy appCenterProxy = (AppCenterProxy) C68183b.m264839a().mo237086a(m107044a().getContext(), AppCenterProxy.class);
        if (appCenterProxy == null) {
            Log.m165389i("AppCenterModule", "openScanQRCodeActivity get ipc service failed");
        } else {
            appCenterProxy.openScanQRCodeActivity(new IntArray(iArr), z, new AppCenterProxy.AbstractC29095b(context) {
                /* class com.ss.android.lark.appcenter.wrapper.$$Lambda$AppCenterModule$ngjblUO39X2mreHibiMO4ZtXHk */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.appcenter.manis.AppCenterProxy.AbstractC29095b
                public final boolean handleResult(String str, int i) {
                    return AppCenterModule.AbstractC29127a.this.handleResult(this.f$1, str, i);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo103302a(Context context, String str, String str2, String str3) {
        C27566d.m100591a(context, str, str2, str3);
    }
}
