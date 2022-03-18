package com.ss.android.lark.larkconfig.larksetting;

import android.text.TextUtils;
import com.bytedance.i18n.claymore.PluginServiceLoader;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.behavior.v1.GetABExperimentFeatureMapRequest;
import com.bytedance.lark.pb.behavior.v1.GetABExperimentFeatureMapResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.appsetting.api.LocalDefaultConfigStorage;
import com.ss.android.lark.appsetting.api.SettingKeysCollector;
import com.ss.android.lark.appsetting.api.p1370a.C29211a;
import com.ss.android.lark.larkconfig.export.C41149a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import com.ss.android.lark.larkconfig.larksetting.handler.browser.PendingShowReStartDialogConfigHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.chat.ReactionSampleSettingHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.chat.ReadSampleSettingHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.fd.FDFeatureHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.helpdesk.C41196a;
import com.ss.android.lark.larkconfig.larksetting.handler.log.C41207a;
import com.ss.android.lark.larkconfig.larksetting.handler.log.C41210c;
import com.ss.android.lark.larkconfig.larksetting.handler.magic.UGMagicConfigEventFilterHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.monitor.PushMonitorConfigHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.p2107a.C41170a;
import com.ss.android.lark.larkconfig.larksetting.handler.p2109c.C41174a;
import com.ss.android.lark.larkconfig.larksetting.handler.p2111e.C41185a;
import com.ss.android.lark.larkconfig.larksetting.handler.p2112f.C41187a;
import com.ss.android.lark.larkconfig.larksetting.handler.p2113g.C41191a;
import com.ss.android.lark.larkconfig.larksetting.handler.p2117k.C41204a;
import com.ss.android.lark.larkconfig.larksetting.handler.ugbanner.UGBannerSettingHandler;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.c */
public class C41164c {

    /* renamed from: a */
    public List<AbstractBaseSettingHandler> f104944a;

    /* renamed from: b */
    public final C41161a f104945b;

    /* renamed from: c */
    private Set<String> f104946c;

    /* renamed from: d */
    private volatile Map<String, C41149a> f104947d;

    /* renamed from: e */
    private volatile boolean f104948e;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.c$a */
    public static class C41169a {

        /* renamed from: a */
        public static final C41164c f104955a = new C41164c();
    }

    /* renamed from: a */
    public static C41164c m163343a() {
        return C41169a.f104955a;
    }

    /* renamed from: c */
    public void mo148465c() {
        C29211a.m107458a().mo103609b();
    }

    /* renamed from: d */
    public void mo148466d() {
        mo148463a(false, (IGetDataCallback<Void>) null);
    }

    /* renamed from: e */
    public void mo148467e() {
        C29211a.m107458a().mo103607a(new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.larkconfig.larksetting.C41164c.C411684 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("AppSettingService", "failed to receive setting push.");
            }

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                if (map == null || CollectionUtils.isEmpty(map)) {
                    C53241h.m205898b("AppSettingService", "onSetting push empty.");
                    return;
                }
                for (AbstractBaseSettingHandler aVar : C41164c.this.f104944a) {
                    String a = aVar.mo107772a();
                    if (map.containsKey(a) && !TextUtils.isEmpty(map.get(a))) {
                        aVar.mo148405a(map);
                    }
                }
                C41164c.this.f104945b.mo148438a(map, C41164c.this.mo148468f());
            }
        });
    }

    private C41164c() {
        this.f104946c = new HashSet();
        this.f104945b = new C41161a();
        this.f104944a = Collections.emptyList();
    }

    /* renamed from: b */
    public void mo148464b() {
        if (this.f104948e) {
            mo148466d();
            return;
        }
        this.f104948e = true;
        LocalDefaultConfigStorage.m107475a();
        m163344g();
        for (AbstractBaseSettingHandler aVar : this.f104944a) {
            aVar.mo148414l();
        }
        m163345h();
        mo148466d();
    }

    /* renamed from: f */
    public Map<String, C41149a> mo148468f() {
        if (this.f104947d == null) {
            synchronized (this) {
                if (this.f104947d == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    C41163b.m163326a().fillDefaultKey2LoadConfigMap(concurrentHashMap);
                    if (C41187a.m163399e()) {
                        concurrentHashMap.put("dynamic_url_mapper", C41149a.f104927a);
                    }
                    this.f104947d = concurrentHashMap;
                }
            }
        }
        return this.f104947d;
    }

    /* renamed from: h */
    private void m163345h() {
        Set<String> keySet = SettingKeysCollector.getKeySet();
        if (!CollectionUtils.isEmpty(keySet)) {
            this.f104946c.addAll(keySet);
        }
        for (AbstractBaseSettingHandler aVar : this.f104944a) {
            this.f104946c.add(aVar.mo107772a());
        }
        for (String str : mo148468f().keySet()) {
            this.f104946c.add(str);
        }
    }

    /* renamed from: g */
    private void m163344g() {
        ArrayList arrayList = new ArrayList();
        Iterator loadAll = PluginServiceLoader.loadAll(IAppSettingPlugin.class);
        while (loadAll.hasNext()) {
            IAppSettingPlugin aVar = (IAppSettingPlugin) loadAll.next();
            if (aVar.mo107780c()) {
                C53241h.m205898b("AppSettingService", "ignored handler is: " + aVar.mo107779b());
            } else {
                arrayList.addAll(aVar.mo107778a());
                C53241h.m205898b("AppSettingService", "not ignored handler is: " + aVar.mo107779b());
            }
        }
        arrayList.addAll(C41170a.m163360d());
        arrayList.add(C41210c.m163446d());
        arrayList.add(C41196a.m163419d());
        if (!C41187a.m163399e()) {
            arrayList.add(C41187a.m163397d());
        }
        arrayList.add(C41191a.m163406a());
        arrayList.add(UGBannerSettingHandler.f104990a);
        arrayList.add(C41185a.m163389d());
        arrayList.add(C41204a.m163434d());
        arrayList.add(UGMagicConfigEventFilterHandler.m163423e());
        arrayList.add(C41207a.m163440d());
        arrayList.add(ReactionSampleSettingHandler.f104962a);
        arrayList.add(ReadSampleSettingHandler.f104963a);
        arrayList.add(PushMonitorConfigHandler.f104982a);
        arrayList.add(PendingShowReStartDialogConfigHandler.f104958a);
        arrayList.add(C41174a.m163368d());
        arrayList.add(FDFeatureHandler.f104972a);
        this.f104944a = arrayList;
        List<AbstractBaseSettingHandler> settingHandlers = C41163b.m163326a().getSettingHandlers();
        if (!CollectionUtils.isEmpty(settingHandlers)) {
            this.f104944a.addAll(settingHandlers);
        }
    }

    /* renamed from: a */
    public String mo148461a(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : collection) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo148462a(final IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_AB_EXPERIMENT_FEATURE_MAP, new GetABExperimentFeatureMapRequest.C15452a(), new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.larkconfig.larksetting.C41164c.C411662 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205900d("AppSettingService", "pullABExperimentData onError:" + errorResult);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                if (map != null && iGetDataCallback != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        if (!CollectionUtils.isEmpty(map)) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                if (!TextUtils.isEmpty(entry.getValue())) {
                                    jSONObject2.put(entry.getKey(), entry.getValue());
                                    jSONArray.put(entry.getKey());
                                } else {
                                    jSONArray.put(entry.getKey());
                                }
                            }
                        }
                        jSONObject.put("online", jSONArray);
                        jSONObject.put("values", jSONObject2);
                        iGetDataCallback.onSuccess(jSONObject.toString());
                    } catch (JSONException e) {
                        C53241h.m205896a("AppSettingService", "pullABExperimentData parse failed", (Throwable) e, true);
                    }
                }
            }
        }, new SdkSender.IParser<Map<String, String>>() {
            /* class com.ss.android.lark.larkconfig.larksetting.C41164c.C411673 */

            /* renamed from: a */
            public Map<String, String> parse(byte[] bArr) throws IOException {
                Set<String> set;
                GetABExperimentFeatureMapResponse decode = GetABExperimentFeatureMapResponse.ADAPTER.decode(bArr);
                if (!decode.is_from_db.booleanValue()) {
                    C53241h.m205898b("AppSettingService", "GetABExperimentFeatureMapResponse: empty not from db.");
                    return new HashMap();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("GetABExperimentFeatureMapResponse: ");
                C41164c cVar = C41164c.this;
                if (decode.feature_with_ab_map == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    set = decode.feature_with_ab_map.keySet();
                }
                sb.append(cVar.mo148461a(set));
                C53241h.m205899c("AppSettingService", sb.toString());
                return decode.feature_with_ab_map;
            }
        });
    }

    /* renamed from: a */
    public <T extends C41152a> T mo148460a(String str, AbstractC41160a aVar) {
        return (T) aVar.mo103073b(this.f104945b.mo148436a(str, mo148468f().get(str)));
    }

    /* renamed from: a */
    public void mo148463a(boolean z, final IGetDataCallback<Void> iGetDataCallback) {
        if (!this.f104948e) {
            C53241h.m205900d("AppSettingService", "pull to early before init called");
            mo148464b();
        }
        C29211a.m107458a().mo103608a(z, new ArrayList(this.f104946c), new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.larkconfig.larksetting.C41164c.C411651 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205900d("AppSettingService", "pullAppSettings onError:" + errorResult);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                for (AbstractBaseSettingHandler aVar : C41164c.this.f104944a) {
                    aVar.mo148405a(map);
                }
                C41164c.this.f104945b.mo148438a(map, C41164c.this.mo148468f());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(null);
                }
            }
        });
    }
}
