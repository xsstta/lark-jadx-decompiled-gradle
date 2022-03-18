package com.ss.android.ugc.effectmanager.p3042a;

import android.text.TextUtils;
import bolts.Task;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.ugc.effectmanager.AlgorithmModelInfoMemoryCache;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.C60629h;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.AbstractC60523h;
import com.ss.android.ugc.effectmanager.common.C60499b;
import com.ss.android.ugc.effectmanager.common.C60513e;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3053h.C60537p;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.AssetUtils;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.effect.task.task.FetchModelInfoByNameTask;
import com.ss.android.ugc.effectmanager.model.C60631a;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.a.c */
public class C60471c {

    /* renamed from: a */
    public final DownloadableModelConfig f151124a;

    /* renamed from: b */
    public IModelCache f151125b;

    /* renamed from: c */
    private Map<String, C60481h> f151126c = new ConcurrentHashMap();

    /* renamed from: d */
    private Map<String, ModelInfo> f151127d = new ConcurrentHashMap();

    /* renamed from: e */
    private AbstractC60523h<Task<C60481h>> f151128e = new AbstractC60523h<Task<C60481h>>() {
        /* class com.ss.android.ugc.effectmanager.p3042a.C60471c.C604721 */

        /* renamed from: a */
        public Task<C60481h> mo207032b(int i) {
            return C60471c.this.mo207025a(i);
        }
    };

    /* renamed from: a */
    public void mo207027a(IModelCache dVar) {
        this.f151125b = dVar;
    }

    /* renamed from: a */
    public Task<C60481h> mo207025a(final int i) {
        return Task.call(new Callable<C60481h>() {
            /* class com.ss.android.ugc.effectmanager.p3042a.C60471c.CallableC604743 */

            /* renamed from: a */
            public C60481h call() throws Exception {
                C60482i a = C60482i.m235012a();
                ModelEventListener k = C60471c.this.f151124a.mo206982k();
                try {
                    final HashMap hashMap = new HashMap();
                    hashMap.put("sdk_version", C60471c.this.f151124a.mo206980i());
                    hashMap.put("device_type", C60471c.this.f151124a.mo206979h());
                    hashMap.put(UpdateKey.STATUS, String.valueOf(C60471c.this.f151124a.mo206972a().ordinal()));
                    new NormalTask(null, null) {
                        /* class com.ss.android.ugc.effectmanager.p3042a.C60471c.CallableC604743.C604751 */

                        @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60520e
                        /* renamed from: a */
                        public void mo207037a() {
                            C60549e p = C60471c.this.f151124a.mo206987p();
                            if (p != null) {
                                hashMap.putAll(EffectRequestUtil.f151340a.mo207238a(p));
                            }
                            String a = AssetUtils.m235231a(C60471c.this.f151124a.mo206973b(), "model/effect_local_config.json");
                            if (!TextUtils.isEmpty(a)) {
                                try {
                                    String optString = new JSONObject(a).optString("tag");
                                    EPLog.m235179b("ModelConfigArbiter", "asset tag = " + optString);
                                    if (!TextUtils.isEmpty(optString)) {
                                        hashMap.put("tag", optString);
                                    }
                                } catch (JSONException unused) {
                                }
                            }
                            if (i > 0) {
                                hashMap.put("busi_id", String.valueOf(i));
                            }
                        }
                    }.mo207037a();
                    C60631a aVar = (C60631a) C60471c.this.f151124a.mo206977f().mo207188a(C60471c.this.f151124a.mo206975d().mo207187a(new C60499b("GET", C60537p.m235320a(hashMap, C60471c.this.f151124a.mo206976e().get(0).mo208018c() + "/model/api/arithmetics"))), C60631a.class);
                    C60513e eVar = new C60513e();
                    if (aVar != null) {
                        int status_code = aVar.getStatus_code();
                        if (status_code == 0) {
                            C60631a.C60632a a2 = aVar.mo208102a();
                            if (a2 == null || a2.mo208103a() == null) {
                                throw new IllegalStateException("status_code == 0 but data == null, indicates there may be an internal server error");
                            }
                            Map<String, List<ModelInfo>> a3 = a2.mo208103a();
                            for (String str : a3.keySet()) {
                                for (ModelInfo modelInfo : a3.get(str)) {
                                    eVar.mo207199a(str, modelInfo);
                                }
                            }
                            if (k != null) {
                                k.mo208067a(true, null, a.mo207065b(), C60471c.this.f151124a.mo206980i());
                            }
                            return new C60481h(eVar);
                        }
                        throw new IllegalStateException("status code == " + status_code + " , indicates there is no model config from server, sdk version is " + C60471c.this.f151124a.mo206980i());
                    }
                    throw new IllegalStateException("response == null, indicates there may be an internal server error");
                } catch (IllegalStateException e) {
                    if (k != null) {
                        k.mo208067a(false, e.getMessage(), a.mo207065b(), C60471c.this.f151124a.mo206980i());
                    }
                    return null;
                }
            }
        }, this.f151124a.mo206978g());
    }

    public C60471c(DownloadableModelConfig downloadableModelConfig) {
        this.f151124a = downloadableModelConfig;
    }

    /* renamed from: c */
    public C60629h mo207030c(final int i) {
        C60481h hVar = this.f151126c.get("biz_" + i);
        if (hVar != null && hVar.mo207064a() != null) {
            return hVar.mo207064a();
        }
        Task.callInBackground(new Callable<Object>() {
            /* class com.ss.android.ugc.effectmanager.p3042a.C60471c.CallableC604775 */

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                C60471c.this.mo207028b(i);
                return null;
            }
        });
        return null;
    }

    /* renamed from: b */
    public synchronized C60629h mo207028b(int i) {
        String str = "biz_" + i;
        C60481h hVar = this.f151126c.get(str);
        if (hVar == null || hVar.mo207064a() == null) {
            Task<C60481h> b = this.f151128e.mo207032b(i);
            try {
                b.waitForCompletion();
                if (!b.isFaulted()) {
                    final C60481h result = b.getResult();
                    if (this.f151125b != null) {
                        Task.callInBackground(new Callable<Void>() {
                            /* class com.ss.android.ugc.effectmanager.p3042a.C60471c.CallableC604764 */

                            /* renamed from: a */
                            public Void call() throws Exception {
                                AlgorithmModelInfoMemoryCache.f151112a.mo207012a(result.mo207064a(), C60471c.this.f151125b);
                                return null;
                            }
                        });
                    }
                    if (result == null) {
                        throw new RuntimeException("config == null");
                    } else if (result.mo207064a() != null) {
                        this.f151126c.put(str, result);
                        return result.mo207064a();
                    } else {
                        throw new RuntimeException("loadedModelList == null");
                    }
                } else {
                    throw new RuntimeException(b.getError());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            return hVar.mo207064a();
        }
    }

    /* renamed from: c */
    private Task<ModelInfo> m234962c(final int i, final String str) {
        return Task.call(new Callable<ModelInfo>() {
            /* class com.ss.android.ugc.effectmanager.p3042a.C60471c.CallableC604732 */

            /* renamed from: a */
            public ModelInfo call() throws Exception {
                SingleAlgorithmModelResponse c = new FetchModelInfoByNameTask(C60471c.this.f151124a, str, i, null, null, null).mo207469c();
                if (c == null || c.getData() == null || c.getData().getFile_url() == null) {
                    return null;
                }
                return new ModelInfo(c.getData());
            }
        }, this.f151124a.mo206978g());
    }

    /* renamed from: b */
    public ModelInfo mo207029b(final int i, final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ModelInfo modelInfo = this.f151127d.get(str);
        if (modelInfo == null) {
            Task.callInBackground(new Callable<Object>() {
                /* class com.ss.android.ugc.effectmanager.p3042a.C60471c.CallableC604786 */

                @Override // java.util.concurrent.Callable
                public Object call() throws Exception {
                    C60471c.this.mo207026a(i, str);
                    return null;
                }
            });
        }
        return modelInfo;
    }

    /* renamed from: a */
    public synchronized ModelInfo mo207026a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ModelInfo modelInfo = this.f151127d.get(str);
        if (modelInfo == null) {
            Task<ModelInfo> c = m234962c(i, str);
            try {
                c.waitForCompletion();
                if (!c.isFaulted()) {
                    modelInfo = c.getResult();
                    this.f151127d.put(str, modelInfo);
                } else {
                    throw new RuntimeException(c.getError());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return modelInfo;
    }
}
