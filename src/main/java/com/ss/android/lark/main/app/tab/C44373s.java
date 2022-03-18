package com.ss.android.lark.main.app.tab;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.NavigationAppType;
import com.bytedance.lark.pb.basic.v1.NavigationUniqueId;
import com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoBatchRequest;
import com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoBatchResponse;
import com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoRequest;
import com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoResponse;
import com.bytedance.lark.pb.settings.v1.ModifyNavigationOrderRequest;
import com.bytedance.lark.pb.settings.v1.ModifyNavigationOrderResponse;
import com.bytedance.lark.pb.settings.v1.NavigationPlatform;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.larkconfig.larksetting.handler.customnav.NavDataSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.interfaces.AbstractC44504g;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.maincore.dto.TabInfo;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.LarkContext;
import io.reactivex.AbstractC69009q;
import io.reactivex.p3457e.C68296b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.main.app.tab.s */
public class C44373s {

    /* renamed from: e */
    private static final Set<String> f112580e = new HashSet<String>() {
        /* class com.ss.android.lark.main.app.tab.C44373s.C443741 */

        {
            add("conversation");
        }
    };

    /* renamed from: f */
    private static final Set<String> f112581f = new HashSet<String>() {
        /* class com.ss.android.lark.main.app.tab.C44373s.C443774 */
    };

    /* renamed from: g */
    private static final List<String> f112582g = new ArrayList();

    /* renamed from: h */
    private static final List<String> f112583h = new ArrayList();

    /* renamed from: a */
    public AppConfig.FeatureConfig f112584a;

    /* renamed from: b */
    public boolean f112585b;

    /* renamed from: c */
    private Map<String, WeakReference<Object>> f112586c;

    /* renamed from: d */
    private TabInfo f112587d;

    /* renamed from: i */
    private IGetDataCallback<AppConfig> f112588i;

    /* renamed from: j */
    private NavDataSource f112589j;

    /* renamed from: k */
    private String f112590k;

    /* renamed from: l */
    private final C68296b<Pair<Activity, String>> f112591l;

    /* renamed from: m */
    private AbstractC44504g f112592m;

    /* renamed from: n */
    private AbstractC44136a.AbstractC44160o.AbstractC44162b f112593n;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.app.tab.s$a */
    public static class C44383a {

        /* renamed from: a */
        static C44373s f112608a = new C44373s();
    }

    /* renamed from: a */
    public static C44373s m176069a() {
        return C44383a.f112608a;
    }

    /* renamed from: f */
    public NavDataSource mo157645f() {
        return this.f112589j;
    }

    /* renamed from: a */
    public void mo157632a(String str) {
        this.f112590k = str;
    }

    /* renamed from: a */
    public void mo157635a(boolean z, String str, String str2, final IGetDataCallback<Boolean> iGetDataCallback) {
        mo157636a(z, false, (IGetDataCallback<Boolean>) new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.main.app.tab.C44373s.C443807 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("MainModule_TabController", "loadTabConfig success " + bool);
                iGetDataCallback.onSuccess(true);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("MainModule_TabController", "loadTabConfig error" + errorResult.getDebugMsg());
                iGetDataCallback.onSuccess(false);
                if (C57852m.m224554a(LarkContext.getApplication())) {
                    throw new IllegalStateException("Should not happen, all callbacks should use success on finish");
                }
            }
        });
    }

    /* renamed from: a */
    public void mo157636a(boolean z, boolean z2, final IGetDataCallback<Boolean> iGetDataCallback) {
        Log.m165389i("MainModule_TabController", String.format("start load tab config; fromServer = %b, forceLoad = %b, version=3", Boolean.valueOf(z), Boolean.valueOf(z2)));
        if (TextUtils.isEmpty(C44134a.m174959a().mo133201U().mo133293a(NavDataSource.V2)) || z2) {
            final String b = C44134a.m174959a().mo133251g().mo133320b();
            SdkSender.asynSendRequestNonWrap(Command.GET_NAVIGATION_APP_INFO_BATCH, new GetNavigationAppInfoBatchRequest.C19143a().mo65432a(Collections.singletonList(new GetNavigationAppInfoRequest.C19147a().mo65442a((Boolean) true).mo65441a(NavigationPlatform.NAV_MOBILE).build())), new IGetDataCallback<GetNavigationAppInfoBatchResponse>() {
                /* class com.ss.android.lark.main.app.tab.C44373s.C443818 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165397w("MainModule_TabController", "loadTabConfigV3 failed, err = " + errorResult);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(false);
                    }
                }

                /* renamed from: a */
                public void onSuccess(GetNavigationAppInfoBatchResponse getNavigationAppInfoBatchResponse) {
                    if (getNavigationAppInfoBatchResponse == null) {
                        Log.m165397w("MainModule_TabController", "loadTabConfigV3 success serverOrSdkTabConfig = null");
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(false);
                            return;
                        }
                        return;
                    }
                    List<GetNavigationAppInfoResponse> list = getNavigationAppInfoBatchResponse.responses;
                    if (list == null || list.size() == 0) {
                        Log.m165397w("MainModule_TabController", "loadTabConfigV3 success responseList is null or empty");
                        IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                        if (iGetDataCallback2 != null) {
                            iGetDataCallback2.onSuccess(false);
                            return;
                        }
                        return;
                    }
                    String b = C44134a.m174959a().mo133251g().mo133320b();
                    if (b == null || !b.equals(b)) {
                        Log.m165397w("MainModule_TabController", "tenantId not equal " + b + " " + b);
                        IGetDataCallback iGetDataCallback3 = iGetDataCallback;
                        if (iGetDataCallback3 != null) {
                            iGetDataCallback3.onSuccess(false);
                            return;
                        }
                        return;
                    }
                    C44134a.m174959a().mo133201U().mo133295a(JSON.toJSONString(list.get(0)), NavDataSource.V2);
                    IGetDataCallback iGetDataCallback4 = iGetDataCallback;
                    if (iGetDataCallback4 != null) {
                        iGetDataCallback4.onSuccess(true);
                    }
                }
            }, new SdkSender.IParser<GetNavigationAppInfoBatchResponse>() {
                /* class com.ss.android.lark.main.app.tab.C44373s.C443829 */

                /* renamed from: a */
                public GetNavigationAppInfoBatchResponse parse(byte[] bArr) throws IOException {
                    return GetNavigationAppInfoBatchResponse.ADAPTER.decode(bArr);
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(true);
        }
    }

    /* renamed from: a */
    public void mo157630a(TabInfo tabInfo, IGetDataCallback<Boolean> iGetDataCallback) {
        ModifyNavigationOrderRequest.C19173a aVar = new ModifyNavigationOrderRequest.C19173a();
        ArrayList arrayList = new ArrayList(tabInfo.getMainApps().size());
        for (TabAppInfo tabAppInfo : tabInfo.getMainApps()) {
            arrayList.add(new NavigationUniqueId(tabAppInfo.getId(), m176068a(tabAppInfo)));
        }
        aVar.mo65505a(arrayList);
        if (tabInfo.getNavApps() != null && tabInfo.getNavApps().size() > 0) {
            ArrayList arrayList2 = new ArrayList(tabInfo.getNavApps().size());
            for (TabAppInfo tabAppInfo2 : tabInfo.getNavApps()) {
                arrayList2.add(new NavigationUniqueId(tabAppInfo2.getId(), m176068a(tabAppInfo2)));
            }
            aVar.mo65507b(arrayList2);
            aVar.mo65504a(NavigationPlatform.NAV_MOBILE);
        }
        SdkSender.asynSendRequestNonWrap(Command.MODIFY_NAVIGATION_ORDER, aVar, iGetDataCallback, $$Lambda$s$jFCT_esglwUZ0XKY3PiY3Hw6mVU.INSTANCE);
    }

    /* renamed from: a */
    public void mo157629a(final IGetDataCallback<Boolean> iGetDataCallback) {
        Log.m165389i("MainModule_TabController", "start load app config");
        final AbstractC44136a.AbstractC44146b U = C44134a.m174959a().mo133201U();
        Boolean a = U.mo133292a();
        String a2 = U.mo133293a(NavDataSource.LEAN_MODE);
        if (a == null || TextUtils.isEmpty(a2) || (C44134a.m174959a().mo133187G().mo133371a() && !a.booleanValue())) {
            U.mo133297a(false, (IGetDataCallback<AppConfig>) new IGetDataCallback<AppConfig>() {
                /* class com.ss.android.lark.main.app.tab.C44373s.AnonymousClass11 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onSuccess(false);
                    Log.m165389i("MainModule_TabController", "loadAppConfigTabConfig err: " + errorResult.getDebugMsg());
                }

                /* renamed from: a */
                public void onSuccess(AppConfig appConfig) {
                    AppConfig.FeatureConfig a = C44373s.this.mo157626a(appConfig);
                    if (a == null) {
                        iGetDataCallback.onSuccess(false);
                        return;
                    }
                    if (!a.isOn() || TextUtils.isEmpty(a.getTraits())) {
                        U.mo133296a(false);
                    } else {
                        U.mo133296a(true);
                        U.mo133295a(a.getTraits(), NavDataSource.LEAN_MODE);
                    }
                    iGetDataCallback.onSuccess(true);
                    Log.m165389i("MainModule_TabController", "loadAppConfigTabConfig isOn: " + a.isOn());
                }
            });
        } else {
            iGetDataCallback.onSuccess(true);
        }
    }

    /* renamed from: a */
    public <T> void mo157633a(String str, T t) {
        if (t == null) {
            this.f112586c.remove(str);
        } else {
            this.f112586c.put(str, new WeakReference<>(t));
        }
    }

    /* renamed from: a */
    public void mo157628a(Activity activity, String str) {
        if (!TextUtils.isEmpty(str) && UIUtils.isActivityRunning(activity) && this.f112591l.mo237955b()) {
            this.f112591l.onNext(new Pair<>(activity, str));
        }
    }

    /* renamed from: a */
    public void mo157634a(String str, boolean z) {
        UserSP instance = UserSP.getInstance();
        instance.putBoolean("new_tab_" + str, z);
    }

    /* renamed from: e */
    public void mo157644e() {
        this.f112589j = null;
        this.f112587d = null;
    }

    /* renamed from: k */
    private void m176081k() {
        C53248k.m205912a().mo181697a(Command.PUSH_NAVIGATION_APP_INFO, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.main.app.tab.C44373s.AnonymousClass10 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                Log.m165389i("MainModule_TabController", "PUSH_NAVIGATION_APP_INFO onPush " + C44373s.this.f112585b);
                if (!C44373s.this.f112585b) {
                    try {
                        GetNavigationAppInfoResponse decode = GetNavigationAppInfoResponse.ADAPTER.decode(bArr);
                        if (decode == null) {
                            Log.m165397w("MainModule_TabController", "PUSH_NAVIGATION_APP_INFO success response is null");
                            return;
                        }
                        if (decode.app_info != null) {
                            if (decode.app_info.size() != 0) {
                                if (decode.platform == NavigationPlatform.NAV_MOBILE) {
                                    C44134a.m174959a().mo133201U().mo133295a(JSON.toJSONString(decode), NavDataSource.V2);
                                    return;
                                }
                                return;
                            }
                        }
                        Log.m165397w("MainModule_TabController", "PUSH_NAVIGATION_APP_INFO success tab list is null or empty");
                    } catch (Exception e) {
                        Log.m165398w("MainModule_TabController", "PUSH_NAVIGATION_APP_INFO onPush", e);
                    }
                }
            }
        });
    }

    /* renamed from: l */
    private void m176082l() {
        C53248k.m205912a().mo181696a(Command.PUSH_NAVIGATION_APP_INFO);
    }

    /* renamed from: o */
    private void m176085o() {
        C44134a.m174959a().mo133188H().mo133401a(this.f112592m);
    }

    /* renamed from: p */
    private void m176086p() {
        C44134a.m174959a().mo133188H().mo133409b(this.f112592m);
    }

    /* renamed from: q */
    private void m176087q() {
        C44134a.m174959a().mo133257m().mo133346a(this.f112593n);
    }

    /* renamed from: r */
    private void m176088r() {
        C44134a.m174959a().mo133257m().mo133352b(this.f112593n);
    }

    /* renamed from: g */
    public void mo157646g() {
        m176083m();
        m176081k();
        m176085o();
        m176087q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.main.app.tab.s$3 */
    public static /* synthetic */ class C443763 {

        /* renamed from: a */
        static final /* synthetic */ int[] f112599a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.maincore.TabType[] r0 = com.ss.android.lark.maincore.TabType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.main.app.tab.C44373s.C443763.f112599a = r0
                com.ss.android.lark.maincore.TabType r1 = com.ss.android.lark.maincore.TabType.Main     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.main.app.tab.C44373s.C443763.f112599a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.maincore.TabType r1 = com.ss.android.lark.maincore.TabType.Navigation     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.app.tab.C44373s.C443763.<clinit>():void");
        }
    }

    /* renamed from: m */
    private void m176083m() {
        this.f112588i = new IGetDataCallback<AppConfig>() {
            /* class com.ss.android.lark.main.app.tab.C44373s.C443752 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("MainModule_TabController", "callback err " + errorResult.getDebugMsg());
                C44373s.this.f112584a = null;
            }

            /* renamed from: a */
            public void onSuccess(AppConfig appConfig) {
                Map<String, AppConfig.FeatureConfig> features;
                if (appConfig != null && appConfig.getSection() != null && (features = appConfig.getSection().getFeatures()) != null) {
                    C44373s.this.f112584a = features.get("navi");
                    if (C44373s.this.f112584a != null) {
                        AbstractC44136a.AbstractC44146b U = C44134a.m174959a().mo133201U();
                        if (!C44373s.this.f112584a.isOn() || TextUtils.isEmpty(C44373s.this.f112584a.getTraits())) {
                            U.mo133296a(false);
                        } else {
                            U.mo133296a(true);
                            U.mo133295a(C44373s.this.f112584a.getTraits(), NavDataSource.LEAN_MODE);
                        }
                        Log.m165389i("MainModule_TabController", "callback isOn: " + C44373s.this.f112584a.isOn());
                    }
                }
            }
        };
        C44134a.m174959a().mo133201U().mo133294a(this.f112588i);
    }

    /* renamed from: c */
    public boolean mo157641c() {
        return !TextUtils.isEmpty((CharSequence) m176080j().second);
    }

    /* renamed from: h */
    public void mo157647h() {
        C44134a.m174959a().mo133201U().mo133298b(this.f112588i);
        m176082l();
        m176086p();
        m176088r();
    }

    private C44373s() {
        this.f112586c = new ConcurrentHashMap();
        this.f112591l = C68296b.m265052a();
        this.f112585b = false;
        this.f112592m = new AbstractC44504g() {
            /* class com.ss.android.lark.main.app.tab.C44373s.C443785 */

            @Override // com.ss.android.lark.main.interfaces.AbstractC44504g
            /* renamed from: a */
            public void mo157175a() {
                Log.m165389i("MainModule_TabController", "onTenantBeginChange");
                C44373s.this.f112585b = true;
            }

            @Override // com.ss.android.lark.main.interfaces.AbstractC44504g
            /* renamed from: a */
            public void mo157176a(boolean z) {
                C44373s.this.f112585b = false;
                Log.m165389i("MainModule_TabController", "onTenantEndChange " + z);
                C44373s.this.mo157636a(true, true, (IGetDataCallback<Boolean>) null);
            }
        };
        this.f112593n = new AbstractC44136a.AbstractC44160o.AbstractC44162b() {
            /* class com.ss.android.lark.main.app.tab.C44373s.C443796 */

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o.AbstractC44162b
            /* renamed from: a */
            public void mo157134a() {
            }

            @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o.AbstractC44162b
            /* renamed from: b */
            public void mo157135b() {
                C44134a.m174959a().mo133186F();
            }
        };
    }

    /* renamed from: d */
    public String mo157642d() {
        if (C44134a.m174959a().mo133270z().mo133361a("lark.android.main.defaulttab.enable")) {
            return this.f112590k;
        }
        TabInfo tabInfo = this.f112587d;
        if (tabInfo == null || tabInfo.getMainApps() == null || tabInfo.getMainApps().size() == 0) {
            return null;
        }
        return tabInfo.getMainApps().get(0).getKey();
    }

    /* renamed from: i */
    public boolean mo157648i() {
        Boolean a = C44134a.m174959a().mo133201U().mo133292a();
        if (a == null || !a.booleanValue() || !C44134a.m174959a().mo133187G().mo133371a()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private Pair<NavDataSource, String> m176080j() {
        NavDataSource navDataSource;
        String str;
        AbstractC44136a.AbstractC44146b U = C44134a.m174959a().mo133201U();
        boolean i = mo157648i();
        if (i) {
            navDataSource = NavDataSource.LEAN_MODE;
            str = U.mo133293a(navDataSource);
        } else {
            navDataSource = NavDataSource.V2;
            String a = U.mo133293a(navDataSource);
            if (TextUtils.isEmpty(a)) {
                Log.m165389i("MainModule_TabController", "nav config v2 is empty fallback to v1");
                navDataSource = NavDataSource.V1;
                str = U.mo133293a(navDataSource);
            } else {
                str = a;
            }
        }
        Log.m165389i("MainModule_TabController", "getLocalTabInfosJsonString source:" + navDataSource + ", lean:" + i);
        return new Pair<>(navDataSource, str);
    }

    /* renamed from: n */
    private TabInfo m176084n() {
        TabInfo tabInfo = new TabInfo();
        List<String> list = f112582g;
        list.clear();
        List<String> list2 = f112583h;
        list2.clear();
        if (C44134a.m174959a().mo133255k()) {
            list.add("conversation");
            list.add("videochat");
            list.add("calendar");
            list.add("space");
            list.add("contact");
            list.add("create_group");
            list2.add("appCenter");
            list2.add("favorite");
            list2.add("pin");
            list2.add("group");
        } else {
            list.add("conversation");
            list.add("calendar");
            list.add("appCenter");
            list.add("space");
            list.add("contact");
            list.add("favorite");
            list.add("create_group");
            list2.add("wiki");
            list2.add("pin");
            list2.add("group");
            list2.add("videochat");
        }
        for (String str : list) {
            tabInfo.addMainTab(new TabAppInfo(str));
        }
        for (String str2 : f112583h) {
            tabInfo.addNavTab(new TabAppInfo(str2));
        }
        return tabInfo;
    }

    /* renamed from: b */
    public synchronized TabInfo mo157637b() {
        String str;
        String str2;
        Log.m165389i("MainModule_TabController", "getTabInfos start");
        TabInfo tabInfo = this.f112587d;
        if (tabInfo != null) {
            return tabInfo;
        }
        Pair<NavDataSource, String> j = m176080j();
        this.f112589j = (NavDataSource) j.first;
        TabInfo a = C44384t.m176124a((String) j.second);
        if (m176074a(this.f112589j) || a.getMainApps().isEmpty()) {
            this.f112587d = m176071a(a);
            StringBuilder sb = new StringBuilder();
            sb.append("getTabInfos: with fallback ");
            sb.append(this.f112587d);
            sb.append("  source = ");
            NavDataSource navDataSource = this.f112589j;
            if (navDataSource == null) {
                str = "null";
            } else {
                str = navDataSource.name();
            }
            sb.append(str);
            Log.m165389i("MainModule_TabController", sb.toString());
        } else {
            this.f112587d = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getTabInfos: without fallback ");
            sb2.append(this.f112587d);
            sb2.append("  source = ");
            NavDataSource navDataSource2 = this.f112589j;
            if (navDataSource2 == null) {
                str2 = "null";
            } else {
                str2 = navDataSource2.name();
            }
            sb2.append(str2);
            Log.m165389i("MainModule_TabController", sb2.toString());
        }
        return this.f112587d;
    }

    /* renamed from: a */
    private boolean m176074a(NavDataSource navDataSource) {
        if (navDataSource != NavDataSource.LEAN_MODE) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m176077c(TabInfo tabInfo) {
        m176073a(tabInfo.getMainApps());
        m176073a(tabInfo.getNavApps());
    }

    /* renamed from: a */
    public void mo157631a(AbstractC69009q<Pair<Activity, String>> qVar) {
        this.f112591l.subscribe(qVar);
    }

    /* renamed from: a */
    public AppConfig.FeatureConfig mo157626a(AppConfig appConfig) {
        Map<String, AppConfig.FeatureConfig> featureConfigMap;
        if (appConfig == null || (featureConfigMap = appConfig.getFeatureConfigMap()) == null || featureConfigMap.get("navi") == null) {
            return null;
        }
        return featureConfigMap.get("navi");
    }

    /* renamed from: b */
    public <T> T mo157638b(String str) {
        WeakReference<Object> weakReference = this.f112586c.get(str);
        if (weakReference != null) {
            return (T) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo157643d(String str) {
        UserSP instance = UserSP.getInstance();
        return instance.getBoolean("new_tab_" + str, false);
    }

    /* renamed from: a */
    private NavigationAppType m176068a(TabAppInfo tabAppInfo) {
        if ("webapp".equals(tabAppInfo.getAppType())) {
            return NavigationAppType.APP_TYPE_WEB;
        }
        if ("gadget".equals(tabAppInfo.getAppType())) {
            return NavigationAppType.APP_TYPE_MINI;
        }
        return NavigationAppType.APP_TYPE_NATIVE;
    }

    /* renamed from: b */
    private void m176076b(TabInfo tabInfo) {
        if (DesktopUtil.m144307b()) {
            m176070a(TabType.Main, new TabAppInfo("system_setting"), tabInfo);
            m176070a(TabType.Main, new TabAppInfo("create_group"), tabInfo);
            m176070a(TabType.Navigation, new TabAppInfo("favorite"), tabInfo);
        }
    }

    /* renamed from: e */
    private void m176079e(TabInfo tabInfo) {
        List<String> mainAppNames = tabInfo.getMainAppNames();
        List<String> navAppNames = tabInfo.getNavAppNames();
        for (int size = mainAppNames.size(); size < 1 && navAppNames.size() > 0; size++) {
            tabInfo.addMainTab(tabInfo.deleteNavTab(navAppNames.remove(0)));
        }
    }

    /* renamed from: c */
    public int mo157640c(String str) {
        List<TabAppInfo> mainApps;
        TabInfo tabInfo = this.f112587d;
        if (tabInfo == null || (mainApps = tabInfo.getMainApps()) == null) {
            return -1;
        }
        for (int i = 0; i < mainApps.size(); i++) {
            TabAppInfo tabAppInfo = mainApps.get(i);
            if (tabAppInfo != null && TextUtils.equals(tabAppInfo.getKey(), str)) {
                return i;
            }
        }
        List<TabAppInfo> navApps = tabInfo.getNavApps();
        if (navApps == null) {
            return -1;
        }
        for (int i2 = 0; i2 < navApps.size(); i2++) {
            TabAppInfo tabAppInfo2 = navApps.get(i2);
            if (tabAppInfo2 != null && TextUtils.equals(tabAppInfo2.getKey(), str)) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private TabInfo m176071a(TabInfo tabInfo) {
        m176077c(tabInfo);
        TabInfo d = m176078d(tabInfo);
        m176079e(d);
        if (!m176075a(d.getMainAppNames(), d.getNavAppNames())) {
            Log.m165389i("MainModule_TabController", "isServerDataComposeLocalFGSuccess false, rollback to local, " + d);
            d = m176078d(m176084n());
        }
        m176076b(d);
        return d;
    }

    /* renamed from: d */
    private TabInfo m176078d(TabInfo tabInfo) {
        boolean z;
        boolean z2;
        TabInfo tabInfo2 = new TabInfo();
        Map<String, AbstractC44136a.C44142ac.AbstractC44143a> E = C44134a.m174959a().mo133185E();
        List<TabAppInfo> mainApps = tabInfo.getMainApps();
        if (mainApps != null) {
            for (TabAppInfo tabAppInfo : mainApps) {
                if (TextUtils.equals(tabAppInfo.getAppType(), "gadget")) {
                    tabInfo2.addMainTab(tabAppInfo);
                } else if (TextUtils.equals(tabAppInfo.getAppType(), "webapp")) {
                    tabInfo2.addMainTab(tabAppInfo);
                    Log.m165389i("MainModule_TabController", "webApp so addMainTab");
                } else {
                    String key = tabAppInfo.getKey();
                    AbstractC44136a.C44142ac.AbstractC44143a aVar = E.get(key);
                    if (aVar == null || !aVar.isEnable()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("filter tab for main cause of fg; tabName = ");
                        sb.append(key);
                        sb.append(", has enable checker = ");
                        if (aVar == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        sb.append(z2);
                        Log.m165389i("MainModule_TabController", sb.toString());
                    } else {
                        tabInfo2.addMainTab(tabAppInfo);
                    }
                }
            }
        }
        List<TabAppInfo> navApps = tabInfo.getNavApps();
        if (navApps != null) {
            for (TabAppInfo tabAppInfo2 : navApps) {
                if (TextUtils.equals(tabAppInfo2.getAppType(), "gadget")) {
                    tabInfo2.addNavTab(tabAppInfo2);
                } else if (TextUtils.equals(tabAppInfo2.getAppType(), "webapp")) {
                    tabInfo2.addNavTab(tabAppInfo2);
                    Log.m165389i("MainModule_TabController", "webApp so addNavTab");
                } else {
                    String key2 = tabAppInfo2.getKey();
                    AbstractC44136a.C44142ac.AbstractC44143a aVar2 = E.get(key2);
                    if (aVar2 == null || !aVar2.isEnable()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("filter tab for nav cause of fg; tabName = ");
                        sb2.append(key2);
                        sb2.append(", has enable checker = ");
                        if (aVar2 == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb2.append(z);
                        Log.m165389i("MainModule_TabController", sb2.toString());
                    } else {
                        tabInfo2.addNavTab(tabAppInfo2);
                    }
                }
            }
        }
        return tabInfo2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m176072a(byte[] bArr) throws IOException {
        boolean z;
        ModifyNavigationOrderResponse decode = ModifyNavigationOrderResponse.ADAPTER.decode(bArr);
        if (decode == null || decode.app_info == null) {
            z = false;
        } else {
            z = true;
        }
        Log.m165389i("MainModule_TabController", "modifyNavigationOrder " + z);
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    private void m176073a(List<TabAppInfo> list) {
        if (!(list == null || list.isEmpty())) {
            for (TabAppInfo tabAppInfo : list) {
                if (tabAppInfo != null) {
                    if ("gadget".equals(tabAppInfo.getAppType())) {
                        C44134a.m174959a().mo133236b(tabAppInfo);
                    } else if ("webapp".equals(tabAppInfo.getAppType())) {
                        C44134a.m174959a().mo133219a(tabAppInfo);
                    } else if ("moments".equals(tabAppInfo.getKey())) {
                        C44134a.m174959a().mo133242c(tabAppInfo);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public String mo157639b(Context context, String str) {
        TabInfo tabInfo = this.f112587d;
        if (tabInfo == null) {
            return "";
        }
        List<TabAppInfo> mainApps = tabInfo.getMainApps();
        if (mainApps != null) {
            for (TabAppInfo tabAppInfo : mainApps) {
                if (tabAppInfo != null && TextUtils.equals(tabAppInfo.getKey(), str)) {
                    return tabAppInfo.getAppType();
                }
            }
        }
        List<TabAppInfo> navApps = tabInfo.getNavApps();
        if (navApps != null) {
            for (TabAppInfo tabAppInfo2 : navApps) {
                if (tabAppInfo2 != null && TextUtils.equals(tabAppInfo2.getKey(), str)) {
                    return tabAppInfo2.getAppType();
                }
            }
        }
        if ("more".equals(str)) {
            return "native";
        }
        return "";
    }

    /* renamed from: a */
    private boolean m176075a(Collection<String> collection, Collection<String> collection2) {
        if (collection == null || collection2 == null) {
            Log.m165397w("MainModule_TabController", "server data main tab size is 0, navigation tab size is 0");
            return false;
        } else if (collection.size() == 0) {
            Log.m165397w("MainModule_TabController", "server data main tab is 0, fallback to local");
            this.f112589j = NavDataSource.V1;
            return false;
        } else if (!mo157648i()) {
            return true;
        } else {
            if (collection.size() < 1 || collection.size() > 5) {
                Log.m165389i("MainModule_TabController", "main tab size is not legal; size = " + collection.size());
                return false;
            } else if (collection2.size() > 99) {
                Log.m165389i("MainModule_TabController", "sub tab size is not legal; size = " + collection2.size());
                return false;
            } else if (!collection.containsAll(f112580e)) {
                Log.m165389i("MainModule_TabController", "main tab config is not legal; need feed");
                return false;
            } else {
                for (String str : f112581f) {
                    if (collection2.contains(str)) {
                        Log.m165389i("MainModule_TabController", "nav tab config is not legal; name = " + str);
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* renamed from: a */
    public TabType mo157627a(Context context, String str) {
        TabInfo tabInfo = this.f112587d;
        if (tabInfo == null) {
            return TabType.Others;
        }
        List<TabAppInfo> mainApps = tabInfo.getMainApps();
        if (mainApps != null) {
            for (TabAppInfo tabAppInfo : mainApps) {
                if (tabAppInfo != null && TextUtils.equals(tabAppInfo.getKey(), str)) {
                    return TabType.Main;
                }
            }
        }
        List<TabAppInfo> navApps = tabInfo.getNavApps();
        if (navApps != null) {
            for (TabAppInfo tabAppInfo2 : navApps) {
                if (tabAppInfo2 != null && TextUtils.equals(tabAppInfo2.getKey(), str)) {
                    return TabType.Navigation;
                }
            }
        }
        return TabType.Others;
    }

    /* renamed from: a */
    private TabInfo m176070a(TabType tabType, TabAppInfo tabAppInfo, TabInfo tabInfo) {
        if (tabInfo.containsTab(tabAppInfo.getKey())) {
            return tabInfo;
        }
        int i = C443763.f112599a[tabType.ordinal()];
        if (i == 1) {
            tabInfo.addMainTab(tabAppInfo);
        } else if (i == 2) {
            tabInfo.addNavTab(tabAppInfo);
        }
        return tabInfo;
    }
}
