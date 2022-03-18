package com.bytedance.geckox.p762d;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.util.Pair;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.C14264e;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.ComponentModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p757a.C14190a;
import com.bytedance.geckox.p761c.C14217b;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.p772h.AbstractC14279b;
import com.bytedance.geckox.p772h.AbstractC14280c;
import com.bytedance.geckox.p772h.C14281d;
import com.bytedance.geckox.policy.p778d.C14306a;
import com.bytedance.geckox.policy.p778d.C14307b;
import com.bytedance.geckox.policy.p778d.C14308c;
import com.bytedance.geckox.policy.p778d.C14312d;
import com.bytedance.geckox.statistic.C14343e;
import com.bytedance.geckox.statistic.model.C14349b;
import com.bytedance.geckox.utils.C14350a;
import com.bytedance.geckox.utils.C14351b;
import com.bytedance.geckox.utils.C14364j;
import com.bytedance.geckox.utils.C14367l;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import com.bytedance.pipeline.AbstractC20236e;
import com.bytedance.pipeline.exception.DataException;
import com.bytedance.pipeline.exception.JsonException;
import com.bytedance.pipeline.exception.NetWorkException;
import com.bytedance.pipeline.exception.RequestInterceptException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.geckox.d.e */
public class C14250e extends AbstractC20235d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: a */
    private C14218d f37474a;

    /* renamed from: b */
    private Map<String, Map<String, Object>> f37475b;

    /* renamed from: f */
    private Map<String, List<CheckRequestBodyModel.TargetChannel>> f37476f;

    /* renamed from: g */
    private AbstractC14267a f37477g;

    /* renamed from: h */
    private String f37478h;

    /* renamed from: i */
    private AbstractC20236e f37479i;

    /* renamed from: j */
    private boolean f37480j;

    /* renamed from: k */
    private boolean f37481k;

    /* renamed from: l */
    private C14349b f37482l = new C14349b();

    /* renamed from: m */
    private C14307b f37483m;

    /* renamed from: n */
    private int f37484n;

    /* renamed from: a */
    private void m57525a(Set<String> set) {
        long j;
        Map<String, List<CheckRequestBodyModel.TargetChannel>> map = this.f37476f;
        if (!(map == null || this.f37477g == null)) {
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                String key = entry.getKey();
                Iterator<CheckRequestBodyModel.TargetChannel> it = entry.getValue().iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str = it.next().channelName;
                        if (set == null || !set.contains(str)) {
                            Long c = C14367l.m57848c(this.f37474a.mo52148n(), key, str);
                            if (c != null) {
                                String b = C14367l.m57847b(this.f37474a.mo52148n(), key, str, c.longValue());
                                LocalPackageModel localPackageModel = new LocalPackageModel(key, str);
                                localPackageModel.setChannelPath(b);
                                if (c == null) {
                                    j = 0;
                                } else {
                                    j = c.longValue();
                                }
                                localPackageModel.setLatestVersion(j);
                                this.f37477g.mo52237a(localPackageModel);
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private String m57524a(Map<String, List<Pair<String, Long>>> map) {
        List<CheckRequestBodyModel.TargetChannel> list;
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        Context a = this.f37474a.mo52133a();
        checkRequestBodyModel.setCommon(new Common(this.f37474a.mo52145k(), this.f37474a.mo52149o(), this.f37474a.mo52150p(), C14350a.m57809b(a), C14364j.m57839a(a), this.f37474a.mo52146l(), this.f37474a.mo52147m()));
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                hashMap2.put(pair.first, localChannel);
            }
            hashMap.put(entry.getKey(), hashMap2);
        }
        this.f37482l.f37705a = C14217b.m57431a().mo52132b().toJson(hashMap);
        checkRequestBodyModel.setLocal(hashMap);
        HashMap hashMap3 = new HashMap();
        for (String str : this.f37474a.mo52139e()) {
            CheckRequestBodyModel.Group group = new CheckRequestBodyModel.Group();
            group.groupName = this.f37478h;
            Map<String, List<CheckRequestBodyModel.TargetChannel>> map2 = this.f37476f;
            if (map2 != null && !map2.isEmpty() && (list = this.f37476f.get(str)) != null && !list.isEmpty()) {
                group.targetChannels = new ArrayList();
                group.targetChannels.addAll(list);
            }
            hashMap3.put(str, group);
        }
        this.f37482l.f37706b = C14217b.m57431a().mo52132b().toJson(hashMap3);
        checkRequestBodyModel.setDeployments(hashMap3);
        if (this.f37475b != null) {
            this.f37482l.f37707c = C14217b.m57431a().mo52132b().toJson(this.f37475b);
            checkRequestBodyModel.setCustom(this.f37475b);
        }
        checkRequestBodyModel.setRequestMeta(new CheckRequestBodyModel.RequestMeta(this.f37484n));
        return C14217b.m57431a().mo52132b().toJson(checkRequestBodyModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        boolean z;
        super.mo52179a(objArr);
        this.f37474a = (C14218d) objArr[0];
        this.f37476f = (Map) objArr[1];
        this.f37477g = (AbstractC14267a) objArr[2];
        this.f37478h = (String) objArr[3];
        OptionCheckUpdateParams optionCheckUpdateParams = (OptionCheckUpdateParams) objArr[4];
        if (optionCheckUpdateParams != null) {
            this.f37480j = optionCheckUpdateParams.isEnableThrottle();
            this.f37481k = optionCheckUpdateParams.isEnableRetry();
            this.f37475b = optionCheckUpdateParams.getCustomParam();
        }
        this.f37479i = (AbstractC20236e) objArr[5];
        String a = C14351b.m57811a(this.f37478h, this.f37476f);
        this.f37484n = ((Integer) mo68497g().getPipelineData("req_type")).intValue();
        C14307b a2 = new C14307b().mo52355a(new C14306a(this.f37484n, this.f37482l));
        if (this.f37484n == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f37483m = a2.mo52356a(new C14308c(z, this.f37481k, a, new C14222a(this.f37474a.mo52142h(), mo68497g()))).mo52357a(new C14312d(this.f37480j, a, this.f37482l));
        C14276b.m57604a("gecko-debug-tag", "check server channel version[v3] group", this.f37478h, "target channels", this.f37476f);
    }

    /* renamed from: a */
    private long m57523a(List<Pair<String, Long>> list, String str) {
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public Object a_(AbstractC20233b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) throws Throwable {
        this.f37484n = ((Integer) bVar.getPipelineData("req_type")).intValue();
        bVar.setPipelineData("api_version", "v3");
        C14276b.m57604a("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        Map<String, List<UpdatePackage>> b = m57526b(bVar, map);
        if (b == null) {
            return null;
        }
        C14343e.m57788a(this.f37474a, this.f37482l);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<UpdatePackage>> entry : b.entrySet()) {
            arrayList.addAll(entry.getValue());
        }
        return bVar.proceed(arrayList);
    }

    /* renamed from: b */
    private Map<String, List<UpdatePackage>> m57526b(AbstractC20233b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) throws Exception {
        C14281d dVar;
        T t;
        Pair<String, String> a;
        String str = "https://" + this.f37474a.mo52144j() + "/gecko/server/v3/package";
        try {
            this.f37482l.f37710f = C14364j.m57839a(this.f37474a.mo52133a());
            this.f37482l.f37712h = this.f37484n;
            this.f37482l.f37716l = "v3";
            String a2 = m57524a(map);
            this.f37483m.mo52358a();
            AbstractC14280c i = this.f37474a.mo52143i();
            if (i instanceof AbstractC14279b) {
                AbstractC14279b bVar2 = (AbstractC14279b) i;
                GeckoGlobalConfig.AbstractC14188b j = C14264e.m57551a().mo52233h().mo52042j();
                HashMap hashMap = new HashMap();
                if (!(j == null || (a = j.mo52051a(false)) == null)) {
                    hashMap.put(a.first, a.second);
                }
                dVar = bVar2.mo52249a(str, a2, hashMap);
            } else {
                dVar = i.mo52248a(str, a2);
            }
            this.f37482l.f37711g = dVar.f37540c;
            this.f37482l.f37708d = dVar.f37541d;
            this.f37482l.f37709e = C14349b.m57797a(dVar.f37538a);
            if (dVar.f37540c == 200) {
                String str2 = dVar.f37539b;
                this.f37483m.mo52359b();
                C14276b.m57604a("gecko-debug-tag", "response:", str2);
                try {
                    Response response = (Response) C14217b.m57431a().mo52132b().fromJson(str2, new TypeToken<Response<ComponentModel>>() {
                        /* class com.bytedance.geckox.p762d.C14250e.C142511 */
                    }.getType());
                    if (!(this.f37479i == null || (t = response.data) == null)) {
                        this.f37479i.mo52368a(t.getGlobalConfig().getCheckUpdate());
                    }
                    if (response.status == 0) {
                        if (response.data != null) {
                            C14190a.m57310a(this.f37484n, this.f37474a.mo52133a(), response.data.getUniversalStrategies(), this.f37474a.mo52148n(), this.f37477g);
                            Map<String, List<UpdatePackage>> packages = response.data.getPackages();
                            if (packages == null || packages.isEmpty()) {
                                m57525a((Set<String>) null);
                                C14190a.m57312a(this.f37474a);
                                return new HashMap();
                            }
                            for (String str3 : this.f37474a.mo52139e()) {
                                List<UpdatePackage> list = packages.get(str3);
                                if (list != null && !list.isEmpty()) {
                                    for (UpdatePackage updatePackage : list) {
                                        updatePackage.setAccessKey(str3);
                                        updatePackage.setLocalVersion(m57523a(map.get(str3), updatePackage.getChannel()));
                                    }
                                }
                            }
                            return packages;
                        }
                        this.f37482l.f37708d = "check update error：response.data==null";
                        C14343e.m57788a(this.f37474a, this.f37482l);
                        throw new DataException("check update error：response.data==null");
                    } else if (response.status == 2000) {
                        m57525a((Set<String>) null);
                        C14190a.m57312a(this.f37474a);
                        return new HashMap();
                    } else {
                        String str4 = "check update error，unknow status code，response.status：" + response.status;
                        this.f37482l.f37708d = str4;
                        C14343e.m57788a(this.f37474a, this.f37482l);
                        throw new DataException(str4);
                    }
                } catch (Exception e) {
                    this.f37482l.f37708d = "json parse failed：" + e.getMessage();
                    C14343e.m57788a(this.f37474a, this.f37482l);
                    throw new JsonException("json parse failed：" + str2 + " caused by:" + e.getMessage(), e);
                }
            } else {
                this.f37483m.mo52360c();
                throw new NetworkErrorException("net work get failed, code: " + dVar.f37540c + ", url:" + str);
            }
        } catch (IOException e2) {
            this.f37483m.mo52360c();
            this.f37482l.f37708d = e2.getMessage();
            C14343e.m57788a(this.f37474a, this.f37482l);
            throw e2;
        } catch (RequestInterceptException e3) {
            C14343e.m57788a(this.f37474a, this.f37482l);
            throw e3;
        } catch (NetWorkException e4) {
            C14343e.m57788a(this.f37474a, this.f37482l);
            throw e4;
        } catch (Exception e5) {
            C14343e.m57788a(this.f37474a, this.f37482l);
            throw new NetWorkException("request failed：url:" + str + ", caused by:" + e5.getMessage(), e5);
        }
    }
}
