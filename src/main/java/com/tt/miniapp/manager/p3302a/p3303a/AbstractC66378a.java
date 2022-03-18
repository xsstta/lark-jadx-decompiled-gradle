package com.tt.miniapp.manager.p3302a.p3303a;

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
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.C24545a;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import com.larksuite.framework.utils.CollectionUtils;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.p3302a.C66377a;
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

/* renamed from: com.tt.miniapp.manager.a.a.a */
public abstract class AbstractC66378a implements IJSComponentManager {

    /* renamed from: a */
    public IMonitorCreator f167579a;

    /* renamed from: b */
    protected Map<String, ReadyJSComponent> f167580b = new ConcurrentHashMap();

    /* renamed from: c */
    protected Map<String, ReadyJSComponent> f167581c = new ConcurrentHashMap();

    /* renamed from: d */
    protected AbstractC67757b<DownloadRequest> f167582d = new C67752a();

    /* renamed from: e */
    public List<IJSComponentManager.AbstractC24525c> f167583e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private HandlerThread f167584f = m259539a("save_ready_component");

    /* renamed from: g */
    private Handler f167585g;

    /* renamed from: a */
    public static HandlerThread m259539a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo231899a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo231900b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo231901c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo231902d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract IAppContext mo231903e();

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public void mo87406a(Context context, final List<String> list, final int i) {
        if (list == null || list.isEmpty()) {
            AppBrandLogger.m52830i("js_component_mgr", "downloadJsComponentsByNames-> componentNames is empty");
            return;
        }
        AppBrandLogger.m52830i("js_component_mgr", "downloadJsComponentsByNames->components:", Arrays.toString(list.toArray()), "downloadFrom:", Integer.valueOf(i));
        if (ProcessUtil.isMainProcess(context)) {
            m259541b(context, list, i);
        } else {
            Observable.create(new Action() {
                /* class com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a.C663802 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    AppBrandLogger.m52830i("js_component_mgr", "download by ipc:", Arrays.toString(list.toArray()));
                    synchronized (AbstractC66378a.class) {
                        C67560a.m262955a("downloadJsComponent", CrossProcessDataEntity.C67574a.m263013a().mo234762a("js_component_names", list).mo234760a("js_component_download_from", (Object) Integer.valueOf(i)).mo234763b());
                    }
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
        }
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public void mo87407a(Context context, final List<String> list, final IJSComponentManager.AbstractC24523a aVar) {
        int i;
        if (list == null || list.isEmpty()) {
            AppBrandLogger.m52830i("js_component_mgr", "downloadJsComponentsByNames-> componentNames is empty");
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
            ReadyJSComponent readyJSComponent = this.f167581c.get(next);
            if (readyJSComponent == null && (readyJSComponent = this.f167580b.get(next)) != null) {
                this.f167581c.put(next, readyJSComponent);
            }
            if (readyJSComponent == null) {
                i = 0;
                break;
            } else {
                AppBrandLogger.m52830i("js_component_mgr", "fetch component info by current process:", Arrays.toString(list.toArray()));
                hashMap.put(next, readyJSComponent);
            }
        }
        this.f167579a.createOPMonitor("op_common_component_status", null).addCategoryValue("components_exist", Integer.valueOf(i)).flush();
        if (i != 0) {
            AppBrandLogger.m52830i("js_component_mgr", "fetchComponentsByName->find success in current process!", Arrays.toString(list.toArray()));
            aVar.mo87362a(hashMap);
            return;
        }
        hashMap.clear();
        if (ProcessUtil.isMainProcess(context)) {
            m259540a(list, aVar);
        } else {
            Observable.create(new Action() {
                /* class com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a.C663813 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    synchronized (AbstractC66378a.class) {
                        AppBrandLogger.m52830i("js_component_mgr", "fetch component info by ipc", Arrays.toString(list.toArray()));
                        C67560a.m262959a("fetchJsComponent", CrossProcessDataEntity.C67574a.m263013a().mo234762a("js_component_names", list).mo234763b(), new AbstractC67565b() {
                            /* class com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a.C663813.C663821 */

                            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                            /* renamed from: a */
                            public void mo48979a() {
                                AppBrandLogger.m52829e("js_component_mgr", "fetchComponentsByName->onCallProcessDead...");
                                aVar.mo87362a(hashMap);
                                AbstractC66378a.this.f167579a.createOPMonitor(null, C67746a.f170621i).setResultTypeFail().flush();
                            }

                            @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                            /* renamed from: a */
                            public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                                AppBrandLogger.m52830i("js_component_mgr", "fetchComponentsByName->onIpcCallback...");
                                ArrayList<ReadyJSComponent> parcelableArrayList = crossProcessDataEntity.mo234739a().getParcelableArrayList("ready_components");
                                for (ReadyJSComponent readyJSComponent : parcelableArrayList) {
                                    if (readyJSComponent != null) {
                                        hashMap.put(readyJSComponent.mo87459c(), readyJSComponent);
                                        AbstractC66378a.this.f167581c.put(readyJSComponent.mo87459c(), readyJSComponent);
                                    }
                                }
                                AppBrandLogger.m52830i("js_component_mgr", "fetchComponentsByName->onIpcCallback->list:", Arrays.toString(parcelableArrayList.toArray()));
                                aVar.mo87362a(hashMap);
                            }
                        });
                    }
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo231897a(Context context, C24545a aVar, String str, IJSComponentManager.AbstractC24524b bVar) {
        File file = new File(str);
        if (!file.exists()) {
            bVar.mo87409a(C67831h.f170841h.mo235454b(), C67831h.f170841h.mo235453a());
            return;
        }
        File a = mo231896a(context, aVar);
        File file2 = new File(a, aVar.mo87459c() + ".js");
        if (file2.exists()) {
            AppBrandLogger.m52830i("js_component_mgr", "component is already install!", aVar);
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
            AppBrandLogger.m52829e("js_component_mgr", "install fail:", e.getMessage());
            bVar.mo87409a(C67831h.f170839f.mo235454b(), Log.getStackTraceString(e));
        }
    }

    /* renamed from: a */
    public Handler mo231895a() {
        if (this.f167585g == null) {
            synchronized (this) {
                if (this.f167585g == null) {
                    this.f167585g = new Handler(this.f167584f.getLooper()) {
                        /* class com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a.HandlerC663791 */

                        public void handleMessage(Message message) {
                            switch (message.what) {
                                case 4096:
                                    AbstractC66378a.this.mo231900b();
                                    return;
                                case 4097:
                                    AbstractC66378a.this.mo231899a(false);
                                    return;
                                case 4098:
                                    AbstractC66378a.this.mo231899a(true);
                                    return;
                                default:
                                    AppBrandLogger.m52830i("js_component_mgr", "do nothing...");
                                    return;
                            }
                        }
                    };
                }
            }
        }
        return this.f167585g;
    }

    public AbstractC66378a() {
        if (ProcessUtil.isMainProcess(mo231903e().getApplicationContext())) {
            AppBrandLogger.m52830i("js_component_mgr", "main process ,start handler thread....");
            this.f167584f.start();
        }
        mo231902d();
    }

    /* renamed from: a */
    public void mo231898a(IMonitorCreator iMonitorCreator) {
        this.f167579a = iMonitorCreator;
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public void mo87405a(Context context) {
        if (ProcessUtil.isMainProcess(context)) {
            mo231895a().sendEmptyMessage(4097);
        }
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public Map<String, ReadyJSComponent> mo87404a(List<String> list) {
        ReadyJSComponent readyJSComponent;
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str) && (readyJSComponent = this.f167581c.get(str)) != null) {
                    hashMap.put(str, readyJSComponent);
                }
            }
            AppBrandLogger.m52830i("js_component_mgr", "fetchComponentsByNamesSync->", Arrays.toString(hashMap.keySet().toArray()));
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m259540a(final List<String> list, IJSComponentManager.AbstractC24523a aVar) {
        final HashMap hashMap = new HashMap();
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        C663855 r2 = new IJSComponentManager.AbstractC24525c() {
            /* class com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a.C663855 */

            @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24525c
            /* renamed from: a */
            public void mo87410a(ReadyJSComponent readyJSComponent) {
                AppBrandLogger.m52830i("js_component_mgr", "onComponentReady->", readyJSComponent);
                if (list.contains(readyJSComponent.mo87459c()) && !hashMap.containsKey(readyJSComponent.mo87459c())) {
                    AppBrandLogger.m52830i("js_component_mgr", "onComponentReady->saveComponent:", readyJSComponent);
                    hashMap.put(readyJSComponent.mo87459c(), readyJSComponent);
                    countDownLatch.countDown();
                }
            }

            @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24525c
            /* renamed from: a */
            public void mo87411a(C24545a aVar, String str, String str2) {
                AppBrandLogger.m52829e("js_component_mgr", "onComponentError->", aVar, "code:", str, "msg", str2);
                if (hashMap.get(aVar.mo87459c()) == null) {
                    AppBrandLogger.m52829e("js_component_mgr", "onComponentError->countDown", aVar);
                    countDownLatch.countDown();
                }
            }
        };
        this.f167583e.add(r2);
        for (String str : list) {
            ReadyJSComponent readyJSComponent = this.f167580b.get(str);
            if (readyJSComponent != null) {
                hashMap.put(str, readyJSComponent);
                countDownLatch.countDown();
            }
        }
        try {
            m259541b(mo231903e().getApplicationContext(), list, 0);
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.f167583e.remove(r2);
        aVar.mo87362a(hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public File mo231896a(Context context, C24545a aVar) {
        File f = ((AbstractC67722a) mo231903e().findServiceByInterface(AbstractC67722a.class)).mo235093f();
        File file = new File(f, "components" + File.separator + aVar.mo87459c() + File.separator + aVar.mo87461d() + File.separator);
        if (!file.exists()) {
            file.mkdirs();
        }
        AppBrandLogger.m52830i("js_component_mgr", "getComponentSaveDir->", file.getAbsolutePath());
        return file;
    }

    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager
    /* renamed from: a */
    public List<String> mo87403a(Context context, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            AppBrandLogger.m52830i("js_component_mgr", "saveComponentSettings, tmaConfig is null");
            return arrayList;
        }
        SharedPreferences.Editor edit = C66377a.m259531a(context).edit();
        JSONObject optJSONObject = jSONObject.optJSONObject("components");
        if (optJSONObject != null) {
            AppBrandLogger.m52830i("js_component_mgr", "saveComponentSettings:", optJSONObject);
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
            AppBrandLogger.m52830i("js_component_mgr", "saveComponentSettings, settingsJson is null");
            return arrayList;
        }
        AppBrandLogger.m52830i("js_component_mgr", "saveComponentSettings:", jSONObject);
        SharedPreferences a = C66377a.m259532a(context, str);
        SharedPreferences.Editor edit = a.edit();
        String string = a.getString("latest_version", "0.0.1");
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            AppBrandLogger.m52830i("js_component_mgr", "saveComponentSettings, settingsJson component is null");
            return arrayList;
        }
        String optString = optJSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        if (C66375a.m259526b(optString, string)) {
            edit.putString("latest_version", optString);
        }
        edit.putString("js_components", jSONObject.toString());
        edit.commit();
        arrayList.add(str);
        return arrayList;
    }

    /* renamed from: b */
    private void m259541b(final Context context, List<String> list, final int i) {
        String str;
        char c;
        int i2;
        String str2;
        char c2;
        Exception e;
        HashMap hashMap;
        String str3;
        JsonObject asJsonObject;
        String str4;
        String str5;
        String str6;
        int i3 = i;
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        String str7 = "js_component_mgr";
        if (i3 != 2) {
            str = C66377a.m259531a(context).getString("js_components", "");
        } else if (CollectionUtils.isEmpty(list)) {
            AppBrandLogger.m52829e(str7, "downloadComponentInHostProcess->componentNames is empty! from:", Integer.valueOf(i));
            return;
        } else {
            str = C66377a.m259532a(context, list.get(0)).getString("js_components", "");
        }
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e(str7, "downloadComponentInHostProcess->jsComponentStr is empty! from:", Integer.valueOf(i));
            return;
        }
        AppBrandLogger.m52830i(str7, "downloadComponentInHostProcess->jsComponentStr:", str);
        HashMap hashMap2 = new HashMap();
        try {
            JsonObject asJsonObject2 = new JsonParser().parse(str).getAsJsonObject();
            Set<String> keySet = asJsonObject2.keySet();
            if (keySet != null && !keySet.isEmpty()) {
                for (String str8 : keySet) {
                    if (!TextUtils.isEmpty(str8)) {
                        try {
                            asJsonObject = asJsonObject2.getAsJsonObject(str8);
                        } catch (ClassCastException unused) {
                            asJsonObject = new JsonParser().parse(asJsonObject2.getAsJsonPrimitive(str8).getAsString()).getAsJsonObject();
                        }
                        C24545a aVar = new C24545a();
                        aVar.mo87460c(str8);
                        if (asJsonObject.has(HiAnalyticsConstant.HaKey.BI_KEY_VERSION)) {
                            str4 = asJsonObject.get(HiAnalyticsConstant.HaKey.BI_KEY_VERSION).getAsString();
                        } else {
                            str4 = "";
                        }
                        aVar.mo87462d(str4);
                        if (asJsonObject.has("url")) {
                            str5 = asJsonObject.get("url").getAsString();
                        } else {
                            str5 = "";
                        }
                        aVar.mo87457b(str5);
                        if (asJsonObject.has("md5")) {
                            str6 = asJsonObject.get("md5").getAsString();
                        } else {
                            str6 = "";
                        }
                        aVar.mo87455a(str6);
                        hashMap2.put(str8, aVar);
                    }
                }
            }
        } catch (JsonSyntaxException e2) {
            try {
                e2.printStackTrace();
                this.f167579a.createOPMonitor(null, C67746a.f170613a).setResultTypeFail().flush();
            } catch (Exception e3) {
                e = e3;
                str2 = str7;
                c2 = 1;
                i2 = 2;
                c = 0;
                Object[] objArr = new Object[i2];
                objArr[c] = "downloadComponentInHostProcess error:";
                objArr[c2] = e.getMessage();
                AppBrandLogger.m52829e(str2, objArr);
            }
        }
        ArrayList<C24545a> arrayList = new ArrayList();
        for (String str9 : list) {
            try {
                C24545a aVar2 = (C24545a) hashMap2.get(str9);
                ReadyJSComponent readyJSComponent = this.f167580b.get(str9);
                if (aVar2 == null) {
                    AppBrandLogger.m52830i(str7, "downloadComponentInHostProcess-> no component info，componentName is:");
                    this.f167579a.createOPMonitor(null, C67746a.f170614b).setResultTypeFail().flush();
                } else {
                    if (readyJSComponent == null) {
                        arrayList.add(aVar2);
                    } else if (!TextUtils.equals(aVar2.mo87461d(), readyJSComponent.mo87461d())) {
                        arrayList.add(aVar2);
                    } else if (!new File(readyJSComponent.mo87445a()).exists()) {
                        AppBrandLogger.m52830i(str7, "js component but js file not exist!", readyJSComponent);
                        this.f167580b.remove(str9);
                        mo231895a().sendEmptyMessage(4096);
                        arrayList.add(aVar2);
                        hashMap = hashMap2;
                        str3 = str7;
                        c = 0;
                        str7 = str3;
                        hashMap2 = hashMap;
                    } else {
                        IMonitorCreator iMonitorCreator = this.f167579a;
                        String d = aVar2.mo87461d();
                        String b = aVar2.mo87456b();
                        hashMap = hashMap2;
                        c = 0;
                        str3 = str7;
                        try {
                            LarkInnerEventHelper.mpJsComponentDownloadResult(iMonitorCreator, str9, d, i, b, TimeMeter.stop(newAndStart), true, 1, null, null);
                            str7 = str3;
                            hashMap2 = hashMap;
                        } catch (Exception e4) {
                            e = e4;
                            str2 = str3;
                            c2 = 1;
                            i2 = 2;
                            Object[] objArr2 = new Object[i2];
                            objArr2[c] = "downloadComponentInHostProcess error:";
                            objArr2[c2] = e.getMessage();
                            AppBrandLogger.m52829e(str2, objArr2);
                        }
                    }
                    hashMap = hashMap2;
                    str3 = str7;
                    c = 0;
                    str7 = str3;
                    hashMap2 = hashMap;
                }
            } catch (Exception e5) {
                e = e5;
                c = 0;
                str2 = str7;
                c2 = 1;
                i2 = 2;
                Object[] objArr22 = new Object[i2];
                objArr22[c] = "downloadComponentInHostProcess error:";
                objArr22[c2] = e.getMessage();
                AppBrandLogger.m52829e(str2, objArr22);
            }
        }
        String str10 = str7;
        int i4 = 2;
        c = 0;
        if (arrayList.isEmpty()) {
            c2 = 1;
            try {
                AppBrandLogger.m52830i(str10, "downloadComponentInHostProcess->no need download components!");
            } catch (Exception e6) {
                e = e6;
                str2 = str10;
                i2 = 2;
                Object[] objArr222 = new Object[i2];
                objArr222[c] = "downloadComponentInHostProcess error:";
                objArr222[c2] = e.getMessage();
                AppBrandLogger.m52829e(str2, objArr222);
            }
        } else {
            c2 = 1;
            File e7 = ((AbstractC67722a) mo231903e().findServiceByInterface(AbstractC67722a.class)).mo235090e();
            if (!e7.exists()) {
                e7.mkdirs();
            }
            for (final C24545a aVar3 : arrayList) {
                LarkInnerEventHelper.mpJsComponentDownloadStart(this.f167579a, aVar3.mo87459c(), aVar3.mo87456b(), i3);
                String str11 = aVar3.mo87459c() + System.currentTimeMillis() + ".js";
                str2 = str10;
                i2 = 2;
                try {
                    this.f167582d.mo235134a(new DownloadRequest.C67778a(aVar3.mo87456b()).mo235242b(new File(e7, str11).getAbsolutePath()).mo235239a(str11).mo235241b(i4).mo235236a(30000, 30000, 30000).mo235238a(TextUtils.isEmpty(aVar3.mo87454a()) ? null : new C67756a(aVar3.mo87454a())).mo235240a(), new AbsDownloadListener<DownloadRequest>() {
                        /* class com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a.C663834 */

                        /* renamed from: a */
                        public void onComplete(DownloadRequest downloadRequest) {
                            AppBrandLogger.m52830i("js_component_mgr", "js component download success:", aVar3);
                            LarkInnerEventHelper.mpJsComponentDownloadResult(AbstractC66378a.this.f167579a, aVar3.mo87459c(), aVar3.mo87461d(), i, aVar3.mo87456b(), TimeMeter.stop(newAndStart), true, 0, null, null);
                            LarkInnerEventHelper.mpJsComponentInstallStart(AbstractC66378a.this.f167579a, aVar3.mo87459c(), i);
                            final TimeMeter newAndStart = TimeMeter.newAndStart();
                            AbstractC66378a.this.mo231897a(context, aVar3, downloadRequest.getDownloadPath(), new IJSComponentManager.AbstractC24524b() {
                                /* class com.tt.miniapp.manager.p3302a.p3303a.AbstractC66378a.C663834.C663841 */

                                @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24524b
                                /* renamed from: a */
                                public void mo87408a(String str) {
                                    AppBrandLogger.m52830i("js_component_mgr", "onInstallComponentSuccess->", str);
                                    LarkInnerEventHelper.mpJsComponentInstallResult(AbstractC66378a.this.f167579a, i, aVar3.mo87459c(), aVar3.mo87461d(), TimeMeter.stop(newAndStart), true, null, null);
                                    ReadyJSComponent readyJSComponent = new ReadyJSComponent();
                                    readyJSComponent.mo87460c(aVar3.mo87459c());
                                    readyJSComponent.mo87462d(aVar3.mo87461d());
                                    readyJSComponent.mo87446a(str);
                                    AbstractC66378a.this.f167580b.put(readyJSComponent.mo87459c(), readyJSComponent);
                                    if (AbstractC66378a.this.f167583e != null) {
                                        for (IJSComponentManager.AbstractC24525c cVar : AbstractC66378a.this.f167583e) {
                                            cVar.mo87410a(readyJSComponent);
                                        }
                                    }
                                    AbstractC66378a.this.mo231895a().sendEmptyMessage(4096);
                                }

                                @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager.AbstractC24524b
                                /* renamed from: a */
                                public void mo87409a(String str, String str2) {
                                    AppBrandLogger.m52829e("js_component_mgr", "onInstallFail->code:", str, "reason:", str2);
                                    LarkInnerEventHelper.mpJsComponentInstallResult(AbstractC66378a.this.f167579a, i, aVar3.mo87459c(), aVar3.mo87461d(), TimeMeter.stop(newAndStart), false, str, str2);
                                }
                            });
                        }

                        /* renamed from: b */
                        public void onError(DownloadRequest downloadRequest) {
                            AppBrandLogger.m52830i("js_component_mgr", "js component download fail:", aVar3, "error msg:", downloadRequest.getDownloadError().f170702b);
                            LarkInnerEventHelper.mpJsComponentDownloadResult(AbstractC66378a.this.f167579a, aVar3.mo87459c(), aVar3.mo87461d(), i, aVar3.mo87456b(), TimeMeter.stop(newAndStart), false, 0, downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b);
                            if (AbstractC66378a.this.f167583e != null) {
                                for (IJSComponentManager.AbstractC24525c cVar : AbstractC66378a.this.f167583e) {
                                    cVar.mo87411a(aVar3, downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b);
                                }
                            }
                        }
                    });
                    i3 = i;
                    str10 = str2;
                    i4 = 2;
                } catch (Exception e8) {
                    e = e8;
                    Object[] objArr2222 = new Object[i2];
                    objArr2222[c] = "downloadComponentInHostProcess error:";
                    objArr2222[c2] = e.getMessage();
                    AppBrandLogger.m52829e(str2, objArr2222);
                }
            }
        }
    }
}
