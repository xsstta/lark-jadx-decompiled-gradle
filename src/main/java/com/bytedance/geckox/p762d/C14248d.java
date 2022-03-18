package com.bytedance.geckox.p762d;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.util.Pair;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.C14264e;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CombineComponentModel;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p757a.C14190a;
import com.bytedance.geckox.p761c.C14217b;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.p772h.AbstractC14279b;
import com.bytedance.geckox.p772h.AbstractC14280c;
import com.bytedance.geckox.p772h.C14281d;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import com.bytedance.geckox.policy.p778d.C14306a;
import com.bytedance.geckox.policy.p778d.C14307b;
import com.bytedance.geckox.policy.p778d.C14308c;
import com.bytedance.geckox.statistic.C14343e;
import com.bytedance.geckox.statistic.model.C14349b;
import com.bytedance.geckox.utils.C14350a;
import com.bytedance.geckox.utils.C14351b;
import com.bytedance.geckox.utils.C14364j;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import com.bytedance.pipeline.AbstractC20236e;
import com.bytedance.pipeline.exception.DataException;
import com.bytedance.pipeline.exception.JsonException;
import com.bytedance.pipeline.exception.NetWorkException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.geckox.d.d */
public class C14248d extends AbstractC20235d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: a */
    private C14218d f37464a;

    /* renamed from: b */
    private Map<String, String> f37465b;

    /* renamed from: f */
    private Map<String, LoopRequestModel> f37466f;

    /* renamed from: g */
    private LoopInterval.LoopLevel f37467g;

    /* renamed from: h */
    private AbstractC14267a f37468h;

    /* renamed from: i */
    private AbstractC20236e f37469i;

    /* renamed from: j */
    private C14349b f37470j = new C14349b();

    /* renamed from: k */
    private C14307b f37471k;

    /* renamed from: l */
    private int f37472l;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        boolean z = false;
        this.f37464a = (C14218d) objArr[0];
        this.f37465b = (Map) objArr[1];
        Map<String, LoopRequestModel> map = (Map) objArr[2];
        this.f37466f = map;
        this.f37467g = (LoopInterval.LoopLevel) objArr[3];
        this.f37468h = (AbstractC14267a) objArr[4];
        this.f37469i = (AbstractC20236e) objArr[5];
        String a = C14351b.m57813a(map);
        this.f37472l = ((Integer) mo68497g().getPipelineData("req_type")).intValue();
        C14307b bVar = new C14307b();
        if (this.f37472l == 2) {
            z = true;
        }
        this.f37471k = bVar.mo52356a(new C14308c(z, true, a, new C14222a(this.f37464a.mo52142h(), mo68497g()))).mo52355a(new C14306a(this.f37472l, this.f37470j));
    }

    /* renamed from: b */
    private String m57520b(Map<String, List<Pair<String, Long>>> map) {
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        Context a = this.f37464a.mo52133a();
        checkRequestBodyModel.setCommon(new Common(this.f37464a.mo52145k(), this.f37464a.mo52149o(), this.f37464a.mo52150p(), C14350a.m57809b(a), C14364j.m57839a(a), this.f37464a.mo52146l(), this.f37464a.mo52147m()));
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
        this.f37470j.f37705a = C14217b.m57431a().mo52132b().toJson(hashMap);
        checkRequestBodyModel.setLocal(hashMap);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        for (String str : this.f37466f.keySet()) {
            hashMap3.put(str, this.f37466f.get(str).getDeployment());
            if (this.f37466f.get(str).getCustom() != null) {
                hashMap4.put(str, this.f37466f.get(str).getCustom());
            }
        }
        this.f37470j.f37707c = C14217b.m57431a().mo52132b().toJson(hashMap4);
        checkRequestBodyModel.setCustom(hashMap4);
        this.f37470j.f37706b = C14217b.m57431a().mo52132b().toJson(hashMap3);
        checkRequestBodyModel.setDeployments(hashMap3);
        CheckRequestBodyModel.RequestMeta requestMeta = new CheckRequestBodyModel.RequestMeta(this.f37472l);
        LoopInterval.LoopLevel loopLevel = this.f37467g;
        if (loopLevel != null) {
            requestMeta.setCombineLevel(loopLevel.name());
        }
        checkRequestBodyModel.setRequestMeta(requestMeta);
        return C14217b.m57431a().mo52132b().toJson(checkRequestBodyModel);
    }

    /* renamed from: a */
    private List<UpdatePackage> m57519a(Map<String, List<Pair<String, Long>>> map) throws Exception {
        C14281d dVar;
        T t;
        Pair<String, String> a;
        String str = "https://" + this.f37464a.mo52144j() + "/gecko/server/combine/check";
        try {
            this.f37470j.f37710f = C14364j.m57839a(this.f37464a.mo52133a());
            this.f37470j.f37712h = this.f37472l;
            this.f37470j.f37716l = "v1";
            String b = m57520b(map);
            this.f37471k.mo52358a();
            AbstractC14280c i = this.f37464a.mo52143i();
            if (i instanceof AbstractC14279b) {
                AbstractC14279b bVar = (AbstractC14279b) i;
                GeckoGlobalConfig.AbstractC14188b j = C14264e.m57551a().mo52233h().mo52042j();
                HashMap hashMap = new HashMap();
                if (!(j == null || (a = j.mo52051a(true)) == null)) {
                    hashMap.put(a.first, a.second);
                }
                dVar = bVar.mo52249a(str, b, hashMap);
            } else {
                dVar = i.mo52248a(str, b);
            }
            this.f37470j.f37711g = dVar.f37540c;
            this.f37470j.f37708d = dVar.f37541d;
            this.f37470j.f37709e = C14349b.m57797a(dVar.f37538a);
            if (dVar.f37540c == 200) {
                this.f37471k.mo52359b();
                String str2 = dVar.f37539b;
                C14276b.m57604a("gecko-debug-tag", "response:", str2);
                try {
                    Response response = (Response) C14217b.m57431a().mo52132b().fromJson(str2, new TypeToken<Response<CombineComponentModel>>() {
                        /* class com.bytedance.geckox.p762d.C14248d.C142491 */
                    }.getType());
                    if (!(this.f37469i == null || (t = response.data) == null)) {
                        this.f37469i.mo52368a(t.getGlobalConfig().getCheckUpdate());
                    }
                    if (response.status == 0) {
                        if (response.data != null) {
                            C14190a.m57311a(this.f37472l, this.f37464a.mo52133a(), response.data.getUniversalStrategies(), this.f37465b, this.f37468h);
                            List<UpdatePackage> packages = response.data.getPackages();
                            if (packages == null || packages.isEmpty()) {
                                C14190a.m57312a(this.f37464a);
                                return new ArrayList();
                            }
                            for (UpdatePackage updatePackage : packages) {
                                updatePackage.setLocalVersion(m57518a(map.get(updatePackage.getAccessKey()), updatePackage.getChannel()));
                            }
                            return packages;
                        }
                        this.f37470j.f37708d = "check update error：response.data==null";
                        C14343e.m57788a(this.f37464a, this.f37470j);
                        throw new DataException("check update error：response.data==null");
                    } else if (response.status == 2000) {
                        C14190a.m57312a(this.f37464a);
                        return new ArrayList();
                    } else {
                        String str3 = "check update error，unknow status code，response.status：" + response.status;
                        this.f37470j.f37708d = str3;
                        C14343e.m57788a(this.f37464a, this.f37470j);
                        throw new DataException(str3);
                    }
                } catch (Exception e) {
                    this.f37470j.f37708d = "json parse failed：" + e.getMessage();
                    C14343e.m57788a(this.f37464a, this.f37470j);
                    throw new JsonException("json parse failed：" + str2 + " caused by:" + e.getMessage(), e);
                }
            } else {
                this.f37471k.mo52360c();
                throw new NetworkErrorException("net work get failed, code: " + dVar.f37540c + ", url:" + str);
            }
        } catch (IOException e2) {
            this.f37471k.mo52360c();
            this.f37470j.f37708d = e2.getMessage();
            C14343e.m57788a(this.f37464a, this.f37470j);
            throw e2;
        } catch (Exception e3) {
            C14343e.m57788a(this.f37464a, this.f37470j);
            throw new NetWorkException("request failed：url:" + str + ", caused by:" + e3.getMessage(), e3);
        }
    }

    /* renamed from: a */
    private long m57518a(List<Pair<String, Long>> list, String str) {
        if (list == null) {
            return 0;
        }
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public Object a_(AbstractC20233b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) throws Throwable {
        C14276b.m57604a("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        this.f37472l = ((Integer) bVar.getPipelineData("req_type")).intValue();
        bVar.setPipelineData("api_version", "v1");
        List<UpdatePackage> a = m57519a(map);
        if (a == null) {
            return null;
        }
        C14343e.m57788a(this.f37464a, this.f37470j);
        return bVar.proceed(a);
    }
}
