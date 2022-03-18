package com.larksuite.component.openplatform.core.loader.jsbundle.abs;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24543b;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.C24545a;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.manager.p3302a.C66377a;
import com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.download.AbsDownloadListener;
import com.tt.refer.common.download.AbstractC67757b;
import com.tt.refer.common.download.C67752a;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.p3418a.C67756a;
import com.tt.refer.common.p3417c.C67746a;
import com.tt.refer.common.pkg.C67831h;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.abs.b */
public abstract class AbstractC24527b implements IJSComponentManager {

    /* renamed from: a */
    protected IAppContext f60464a;

    /* renamed from: b */
    public IMonitorCreator f60465b;

    /* renamed from: c */
    protected Map<String, ReadyJSComponent> f60466c = new ConcurrentHashMap();

    /* renamed from: d */
    protected Map<String, ReadyJSComponent> f60467d = new ConcurrentHashMap();

    /* renamed from: e */
    protected AbstractC67757b<DownloadRequest> f60468e = new C67752a();

    /* renamed from: f */
    public List<IJSComponentManager.AbstractC24525c> f60469f = new CopyOnWriteArrayList();

    /* renamed from: g */
    private HandlerThread f60470g = m89444a("save_ready_component");

    /* renamed from: h */
    private Handler f60471h;

    /* renamed from: a */
    public static HandlerThread m89444a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo87381c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo87382d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo87383e();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IAppContext mo87418b() {
        return this.f60464a;
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public void mo87406a(Context context, final List<String> list, final int i) {
        if (list == null || list.isEmpty()) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "downloadJsComponentsByNames-> componentNames is empty");
            return;
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_component", "downloadJsComponentsByNames->components:", Arrays.toString(list.toArray()), "downloadFrom:", Integer.valueOf(i));
        if (ProcessUtil.isMainProcess(context)) {
            m89446b(context, list, i);
        } else {
            Observable.create(new Action() {
                /* class com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b.C245292 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    AppBrandLogger.m52830i("js_bundle_manager_js_component", "download by ipc:", Arrays.toString(list.toArray()));
                    synchronized (AbstractC66378a.class) {
                        C67560a.m262955a("downloadJsComponent", CrossProcessDataEntity.C67574a.m263013a().mo234762a("js_component_names", list).mo234760a("js_component_download_from", (Object) Integer.valueOf(i)).mo234763b());
                    }
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
        }
    }

    /* renamed from: a */
    public void mo87416a(String str, final C24545a aVar, final int i, Context context) {
        LarkInnerEventHelper.mpJsComponentInstallStart(this.f60465b, aVar.mo87459c(), i);
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        mo87414a(context, aVar, str, new IJSComponentManager.AbstractC24524b() {
            /* class com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b.C245314 */

            @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24524b
            /* renamed from: a */
            public void mo87408a(String str) {
                AppBrandLogger.m52830i("js_bundle_manager_js_component", "onInstallComponentSuccess->", str);
                LarkInnerEventHelper.mpJsComponentInstallResult(AbstractC24527b.this.f60465b, i, aVar.mo87459c(), aVar.mo87461d(), TimeMeter.stop(newAndStart), true, null, null);
                ReadyJSComponent readyJSComponent = new ReadyJSComponent();
                readyJSComponent.mo87460c(aVar.mo87459c());
                readyJSComponent.mo87462d(aVar.mo87461d());
                readyJSComponent.mo87446a(str);
                AbstractC24527b.this.f60466c.put(readyJSComponent.mo87459c(), readyJSComponent);
                if (AbstractC24527b.this.f60469f != null) {
                    for (IJSComponentManager.AbstractC24525c cVar : AbstractC24527b.this.f60469f) {
                        cVar.mo87410a(readyJSComponent);
                    }
                }
                AbstractC24527b.this.mo87412a().sendEmptyMessage(4096);
            }

            @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24524b
            /* renamed from: a */
            public void mo87409a(String str, String str2) {
                AppBrandLogger.m52829e("js_bundle_manager_js_component", "onInstallFail->code:", str, "reason:", str2);
                if (AbstractC24527b.this.f60469f != null) {
                    for (IJSComponentManager.AbstractC24525c cVar : AbstractC24527b.this.f60469f) {
                        cVar.mo87411a(aVar, str, str2);
                    }
                }
                LarkInnerEventHelper.mpJsComponentInstallResult(AbstractC24527b.this.f60465b, i, aVar.mo87459c(), aVar.mo87461d(), TimeMeter.stop(newAndStart), false, str, str2);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo87414a(Context context, C24545a aVar, String str, IJSComponentManager.AbstractC24524b bVar) {
        File file = new File(str);
        if (!file.exists()) {
            bVar.mo87409a(C67831h.f170841h.mo235454b(), C67831h.f170841h.mo235453a());
            return;
        }
        File a = mo87413a(context, aVar);
        File file2 = new File(a, aVar.mo87459c() + ".js");
        if (file2.exists()) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "component is already install!", aVar);
            bVar.mo87408a(file2.getAbsolutePath());
            return;
        }
        if (a.exists()) {
            IOUtils.delete(a);
        }
        a.mkdirs();
        try {
            IOUtils.copyFile(file, file2, true);
            bVar.mo87408a(file2.getAbsolutePath());
        } catch (Exception e) {
            IOUtils.delete(a);
            AppBrandLogger.m52829e("js_bundle_manager_js_component", "install fail:", e.getMessage());
            bVar.mo87409a(C67831h.f170839f.mo235454b(), Log.getStackTraceString(e));
        }
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public void mo87407a(Context context, final List<String> list, final IJSComponentManager.AbstractC24523a aVar) {
        int i;
        if (list == null || list.isEmpty()) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "downloadJsComponentsByNames-> componentNames is empty");
            aVar.mo87362a(Collections.emptyMap());
            return;
        }
        final HashMap hashMap = new HashMap();
        Iterator<String> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            String next = it.next();
            ReadyJSComponent readyJSComponent = this.f60467d.get(next);
            if (readyJSComponent == null && (readyJSComponent = this.f60466c.get(next)) != null) {
                this.f60467d.put(next, readyJSComponent);
            }
            if (readyJSComponent == null) {
                i = 0;
                break;
            } else {
                AppBrandLogger.m52830i("js_bundle_manager_js_component", "fetch component info by current process:", Arrays.toString(list.toArray()));
                hashMap.put(next, readyJSComponent);
            }
        }
        this.f60465b.createOPMonitor("op_common_component_status", null).addCategoryValue("components_exist", Integer.valueOf(i)).flush();
        if (i != 0) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "fetchComponentsByName->find success in current process!", Arrays.toString(list.toArray()));
            aVar.mo87362a(hashMap);
            return;
        }
        hashMap.clear();
        if (ProcessUtil.isMainProcess(context)) {
            m89445a(list, aVar);
        } else {
            Observable.create(new Action() {
                /* class com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b.C245325 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    synchronized (AbstractC66378a.class) {
                        AppBrandLogger.m52830i("js_bundle_manager_js_component", "fetch component info by ipc", Arrays.toString(list.toArray()));
                        C67560a.m262959a("fetchJsComponent", CrossProcessDataEntity.C67574a.m263013a().mo234762a("js_component_names", list).mo234763b(), new AbstractC67565b() {
                            /* class com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b.C245325.C245331 */

                            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                            /* renamed from: a */
                            public void mo48979a() {
                                AppBrandLogger.m52829e("js_bundle_manager_js_component", "fetchComponentsByName->onCallProcessDead...");
                                aVar.mo87362a(hashMap);
                                AbstractC24527b.this.f60465b.createOPMonitor(null, C67746a.f170621i).setResultTypeFail().flush();
                            }

                            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                            /* renamed from: a */
                            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                                AppBrandLogger.m52830i("js_bundle_manager_js_component", "fetchComponentsByName->onIpcCallback...");
                                ArrayList<ReadyJSComponent> parcelableArrayList = crossProcessDataEntity.mo234739a().getParcelableArrayList("ready_components");
                                for (ReadyJSComponent readyJSComponent : parcelableArrayList) {
                                    if (readyJSComponent != null) {
                                        hashMap.put(readyJSComponent.mo87459c(), readyJSComponent);
                                        AbstractC24527b.this.f60467d.put(readyJSComponent.mo87459c(), readyJSComponent);
                                    }
                                }
                                AppBrandLogger.m52830i("js_bundle_manager_js_component", "fetchComponentsByName->onIpcCallback->list:", Arrays.toString(parcelableArrayList.toArray()));
                                aVar.mo87362a(hashMap);
                            }
                        });
                    }
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r4 = new java.io.File(r4.mo87445a()).getParentFile();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87417a(final boolean r11) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b.mo87417a(boolean):void");
    }

    /* renamed from: a */
    public Handler mo87412a() {
        if (this.f60471h == null) {
            synchronized (this) {
                if (this.f60471h == null) {
                    this.f60471h = new Handler(this.f60470g.getLooper()) {
                        /* class com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b.HandlerC245281 */

                        public void handleMessage(Message message) {
                            switch (message.what) {
                                case 4096:
                                    AbstractC24527b bVar = AbstractC24527b.this;
                                    bVar.mo87419b(bVar.f60464a.getApplicationContext());
                                    return;
                                case 4097:
                                    AbstractC24527b.this.mo87417a(false);
                                    return;
                                case 4098:
                                    AbstractC24527b.this.mo87417a(true);
                                    return;
                                default:
                                    AppBrandLogger.m52830i("js_bundle_manager_js_component", "do nothing...");
                                    return;
                            }
                        }
                    };
                }
            }
        }
        return this.f60471h;
    }

    /* renamed from: a */
    public void mo87415a(IMonitorCreator iMonitorCreator) {
        this.f60465b = iMonitorCreator;
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public void mo87405a(Context context) {
        if (ProcessUtil.isMainProcess(context)) {
            mo87412a().sendEmptyMessage(4097);
        }
    }

    /* renamed from: d */
    public String mo87421d(Context context) {
        return Storage.getStorageByName(context, mo87381c()).getString("js_components", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo87419b(Context context) {
        String json = new Gson().toJson(this.f60466c);
        AppBrandLogger.m52830i("js_bundle_manager_js_component", "saveReadyComponents:", json);
        Storage.getStorageByName(context, mo87382d()).edit().putString("ready_js_components", json).apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo87420c(Context context) {
        AppBrandLogger.m52830i("js_bundle_manager_js_component", "clearReadyComponents:");
        Storage.getStorageByName(context, mo87382d()).edit().clear().commit();
    }

    public AbstractC24527b(IAppContext iAppContext) {
        this.f60464a = iAppContext;
        if (ProcessUtil.isMainProcess(mo87418b().getApplicationContext())) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "main process ,start handler thread....");
            this.f60470g.start();
        }
        mo87422e(mo87418b().getApplicationContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87422e(Context context) {
        String string = Storage.getStorageByName(AppbrandContext.getInst().getApplicationContext(), mo87382d()).getString("ready_js_components", "");
        if (TextUtils.isEmpty(string)) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "has no install components!");
            return;
        }
        Map<? extends String, ? extends ReadyJSComponent> map = (Map) new Gson().fromJson(string, new TypeToken<Map<String, ReadyJSComponent>>() {
            /* class com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b.C245368 */
        }.getType());
        if (map != null) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "ready_components:", Arrays.toString(map.entrySet().toArray()));
            this.f60466c.clear();
            this.f60467d.clear();
            this.f60466c.putAll(map);
            this.f60467d.putAll(map);
        }
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public Map<String, ReadyJSComponent> mo87404a(List<String> list) {
        ReadyJSComponent readyJSComponent;
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str) && (readyJSComponent = this.f60467d.get(str)) != null) {
                    hashMap.put(str, readyJSComponent);
                }
            }
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "fetchComponentsByNamesSync->", Arrays.toString(hashMap.keySet().toArray()));
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m89445a(final List<String> list, IJSComponentManager.AbstractC24523a aVar) {
        final HashMap hashMap = new HashMap();
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        C245346 r2 = new IJSComponentManager.AbstractC24525c() {
            /* class com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b.C245346 */

            @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24525c
            /* renamed from: a */
            public void mo87410a(ReadyJSComponent readyJSComponent) {
                AppBrandLogger.m52830i("js_bundle_manager_js_component", "onComponentReady->", readyJSComponent);
                if (list.contains(readyJSComponent.mo87459c()) && !hashMap.containsKey(readyJSComponent.mo87459c())) {
                    AppBrandLogger.m52830i("js_bundle_manager_js_component", "onComponentReady->saveComponent:", readyJSComponent);
                    hashMap.put(readyJSComponent.mo87459c(), readyJSComponent);
                    countDownLatch.countDown();
                }
            }

            @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24525c
            /* renamed from: a */
            public void mo87411a(C24545a aVar, String str, String str2) {
                AppBrandLogger.m52829e("js_bundle_manager_js_component", "onComponentError->", aVar, "code:", str, "msg", str2);
                if (hashMap.get(aVar.mo87459c()) == null) {
                    AppBrandLogger.m52829e("js_bundle_manager_js_component", "onComponentError->countDown", aVar);
                    countDownLatch.countDown();
                }
            }
        };
        this.f60469f.add(r2);
        for (String str : list) {
            ReadyJSComponent readyJSComponent = this.f60466c.get(str);
            if (readyJSComponent != null) {
                hashMap.put(str, readyJSComponent);
                countDownLatch.countDown();
            }
        }
        try {
            m89446b(mo87418b().getApplicationContext(), list, 0);
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.f60469f.remove(r2);
        aVar.mo87362a(hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public File mo87413a(Context context, C24545a aVar) {
        File f = ((AbstractC67722a) mo87418b().findServiceByInterface(AbstractC67722a.class)).mo235093f();
        File file = new File(f, "components" + File.separator + aVar.mo87459c() + File.separator + aVar.mo87461d() + File.separator);
        if (!file.exists()) {
            file.mkdirs();
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_component", "getComponentSaveDir->", file.getAbsolutePath());
        return file;
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public List<String> mo87403a(Context context, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "saveComponentSettings, tmaConfig is null");
            return arrayList;
        }
        SharedPreferences.Editor edit = Storage.getStorageByName(context, mo87381c()).edit();
        JSONObject optJSONObject = jSONObject.optJSONObject("components");
        if (optJSONObject != null) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "saveComponentSettings:", optJSONObject);
            edit.putString("js_components", optJSONObject.toString()).commit();
            Iterator<String> keys = optJSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
            }
        }
        return arrayList;
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public List<String> mo87402a(Context context, String str, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "saveComponentSettings, settingsJson is null");
            return arrayList;
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_component", "saveComponentSettings:", jSONObject);
        C66377a.m259532a(context, str).edit().putString("js_components", jSONObject.toString()).commit();
        arrayList.add(str);
        return arrayList;
    }

    /* renamed from: b */
    private void m89446b(final Context context, List<String> list, final int i) {
        C67756a aVar;
        String str;
        String str2;
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        String d = mo87421d(context);
        if (TextUtils.isEmpty(d)) {
            AppBrandLogger.m52829e("js_bundle_manager_js_component", "downloadComponentInHostProcess->jsComponentStr is empty! from:", Integer.valueOf(i));
            return;
        }
        AppBrandLogger.m52830i("js_bundle_manager_js_component", "downloadComponentInHostProcess->jsComponentStr:", d);
        HashMap hashMap = new HashMap();
        C67756a aVar2 = null;
        try {
            JsonObject asJsonObject = new JsonParser().parse(d).getAsJsonObject();
            Set<String> keySet = asJsonObject.keySet();
            if (keySet != null && !keySet.isEmpty()) {
                for (String str3 : keySet) {
                    if (!TextUtils.isEmpty(str3)) {
                        JsonObject asJsonObject2 = asJsonObject.getAsJsonObject(str3);
                        C24545a aVar3 = new C24545a();
                        aVar3.mo87460c(str3);
                        String str4 = "";
                        if (asJsonObject2.has(HiAnalyticsConstant.HaKey.BI_KEY_VERSION)) {
                            str = asJsonObject2.get(HiAnalyticsConstant.HaKey.BI_KEY_VERSION).getAsString();
                        } else {
                            str = str4;
                        }
                        aVar3.mo87462d(str);
                        if (asJsonObject2.has("url")) {
                            str2 = asJsonObject2.get("url").getAsString();
                        } else {
                            str2 = str4;
                        }
                        aVar3.mo87457b(str2);
                        if (asJsonObject2.has("md5")) {
                            str4 = asJsonObject2.get("md5").getAsString();
                        }
                        aVar3.mo87455a(str4);
                        hashMap.put(str3, aVar3);
                    }
                }
            }
        } catch (JsonSyntaxException e) {
            try {
                e.printStackTrace();
                this.f60465b.createOPMonitor(null, C67746a.f170613a).setResultTypeFail().flush();
            } catch (Exception e2) {
                AppBrandLogger.m52829e("js_bundle_manager_js_component", "downloadComponentInHostProcess error:", e2.getMessage());
                return;
            }
        }
        ArrayList<C24545a> arrayList = new ArrayList();
        for (String str5 : list) {
            C24545a aVar4 = (C24545a) hashMap.get(str5);
            ReadyJSComponent readyJSComponent = this.f60466c.get(str5);
            if (aVar4 == null) {
                AppBrandLogger.m52830i("js_bundle_manager_js_component", "downloadComponentInHostProcess-> no component info，componentName is:");
                this.f60465b.createOPMonitor(null, C67746a.f170614b).setResultTypeFail().flush();
            } else if (readyJSComponent == null) {
                arrayList.add(aVar4);
            } else if (C24543b.m89515a(readyJSComponent.mo87461d(), aVar4.mo87461d()) > 0) {
                arrayList.add(aVar4);
            } else if (!new File(readyJSComponent.mo87445a()).exists()) {
                AppBrandLogger.m52830i("js_bundle_manager_js_component", "js component but js file not exist!", readyJSComponent);
                this.f60466c.remove(str5);
                mo87412a().sendEmptyMessage(4096);
                arrayList.add(aVar4);
            } else {
                LarkInnerEventHelper.mpJsComponentDownloadResult(this.f60465b, str5, aVar4.mo87461d(), i, aVar4.mo87456b(), TimeMeter.stop(newAndStart), true, 1, null, null);
            }
        }
        if (arrayList.isEmpty()) {
            AppBrandLogger.m52830i("js_bundle_manager_js_component", "downloadComponentInHostProcess->no need download components!");
            return;
        }
        File e3 = ((AbstractC67722a) this.f60464a.findServiceByInterface(AbstractC67722a.class)).mo235090e();
        if (!e3.exists()) {
            e3.mkdirs();
        }
        for (final C24545a aVar5 : arrayList) {
            LarkInnerEventHelper.mpJsComponentDownloadStart(this.f60465b, aVar5.mo87459c(), aVar5.mo87456b(), i);
            String str6 = aVar5.mo87459c() + System.currentTimeMillis() + ".js";
            DownloadRequest.C67778a a = new DownloadRequest.C67778a(aVar5.mo87456b()).mo235242b(new File(e3, str6).getAbsolutePath()).mo235239a(str6).mo235241b(2).mo235236a(30000, 30000, 30000);
            if (TextUtils.isEmpty(aVar5.mo87454a())) {
                aVar = aVar2;
            } else {
                aVar = new C67756a(aVar5.mo87454a());
            }
            this.f60468e.mo235134a(a.mo235238a(aVar).mo235240a(), new AbsDownloadListener<DownloadRequest>() {
                /* class com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b.C245303 */

                /* renamed from: a */
                public void onComplete(DownloadRequest downloadRequest) {
                    AppBrandLogger.m52830i("js_bundle_manager_js_component", "js component download success:", aVar5);
                    LarkInnerEventHelper.mpJsComponentDownloadResult(AbstractC24527b.this.f60465b, aVar5.mo87459c(), aVar5.mo87461d(), i, aVar5.mo87456b(), TimeMeter.stop(newAndStart), true, 0, null, null);
                    AbstractC24527b.this.mo87416a(downloadRequest.getDownloadPath(), aVar5, i, context);
                }

                /* renamed from: b */
                public void onError(DownloadRequest downloadRequest) {
                    AppBrandLogger.m52830i("js_bundle_manager_js_component", "js component download fail:", aVar5, "error msg:", downloadRequest.getDownloadError().f170702b);
                    LarkInnerEventHelper.mpJsComponentDownloadResult(AbstractC24527b.this.f60465b, aVar5.mo87459c(), aVar5.mo87461d(), i, aVar5.mo87456b(), TimeMeter.stop(newAndStart), false, 0, downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b);
                    if (AbstractC24527b.this.f60469f != null) {
                        for (IJSComponentManager.AbstractC24525c cVar : AbstractC24527b.this.f60469f) {
                            cVar.mo87411a(aVar5, downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b);
                        }
                    }
                }
            });
            aVar2 = null;
        }
    }
}
