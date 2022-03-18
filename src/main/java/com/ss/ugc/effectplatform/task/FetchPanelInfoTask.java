package com.ss.ugc.effectplatform.task;

import bytekn.foundation.concurrent.SharedReference;
import bytekn.foundation.concurrent.clock.DefaultClock;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.p054b.C1686c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.bridge.network.HTTPMethod;
import com.ss.ugc.effectplatform.bridge.network.NetRequest;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.common.EffectConstants;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoResponse;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.p3244e.C65510b;
import com.ss.ugc.effectplatform.util.EffectCacheKeyGenerator;
import com.ss.ugc.effectplatform.util.EffectRequestUtil;
import com.ss.ugc.effectplatform.util.EffectUtils;
import com.ss.ugc.effectplatform.util.NetworkUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002*+BW\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\rH\u0014J\b\u0010\u0018\u001a\u00020\rH\u0014J$\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J(\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0003H\u0014J\u001a\u0010$\u001a\u0004\u0018\u00010\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0007H\u0014J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0003H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchPanelInfoTask;", "Lcom/ss/ugc/effectplatform/task/BaseNetworkTask;", "Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", "Lcom/ss/ugc/effectplatform/model/net/PanelInfoResponse;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "panel", "", "taskFlag", "withCategoryEffect", "", "category", "count", "", "cursor", "extraParams", "", "(Lcom/ss/ugc/effectplatform/EffectConfig;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/util/Map;)V", "fileSize", "Lbytekn/foundation/concurrent/SharedReference;", "", "buildRequest", "Lcom/ss/ugc/effectplatform/bridge/network/NetRequest;", "getFailCode", "getRetryCount", "onFailure", "", "requestedUrl", "remoteIp", "exceptionResult", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onSuccess", "startTime", "netTime", "jsonTime", "result", "parseResponse", "jsonConverter", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "responseString", "saveEffectList", "newChannel", "Companion", "Version", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FetchPanelInfoTask extends BaseNetworkTask<PanelInfoModel, PanelInfoResponse> {

    /* renamed from: c */
    public static final Companion f164972c = new Companion(null);

    /* renamed from: d */
    private SharedReference<Long> f164973d;

    /* renamed from: e */
    private final EffectConfig f164974e;

    /* renamed from: f */
    private final String f164975f;

    /* renamed from: g */
    private final boolean f164976g;

    /* renamed from: h */
    private final String f164977h;

    /* renamed from: i */
    private final int f164978i;

    /* renamed from: j */
    private final int f164979j;

    /* renamed from: k */
    private final Map<String, String> f164980k;

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: e */
    public int mo228219e() {
        return UpdateDialogStatusCode.SHOW;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchPanelInfoTask$Version;", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "(Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "setVersion", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Version {
        private String version;

        public Version() {
            this(null, 1, null);
        }

        public static /* synthetic */ Version copy$default(Version version2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = version2.version;
            }
            return version2.copy(str);
        }

        public final String component1() {
            return this.version;
        }

        public final Version copy(String str) {
            return new Version(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Version) && Intrinsics.areEqual(this.version, ((Version) obj).version);
            }
            return true;
        }

        public int hashCode() {
            String str = this.version;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Version(version=" + this.version + ")";
        }

        public final String getVersion() {
            return this.version;
        }

        public final void setVersion(String str) {
            this.version = str;
        }

        public Version(String str) {
            this.version = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Version(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "0" : str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchPanelInfoTask$Companion;", "", "()V", "TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.FetchPanelInfoTask$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: d */
    public int mo228218d() {
        return this.f164974e.mo227567n();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: c */
    public NetRequest mo228217c() {
        String str;
        HashMap<String, String> a = EffectRequestUtil.f165111a.mo228311a(this.f164974e);
        HashMap<String, String> hashMap = a;
        hashMap.put("panel", this.f164975f);
        if (this.f164976g) {
            hashMap.put("has_category_effects", String.valueOf(true));
            String str2 = this.f164977h;
            if (str2 == null) {
                str2 = "default";
            }
            hashMap.put("category", str2);
            hashMap.put("cursor", String.valueOf(this.f164979j));
            hashMap.put("count", String.valueOf(this.f164978i));
        }
        String y = this.f164974e.mo227578y();
        if (y != null) {
            hashMap.put("test_status", y);
        }
        Map<String, String> map = this.f164980k;
        if (map != null) {
            a.putAll(map);
        }
        HTTPMethod hTTPMethod = HTTPMethod.GET;
        NetworkUtils pVar = NetworkUtils.f165130a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f164974e.mo227541A());
        sb.append(this.f164974e.mo227552a());
        if (this.f164974e.mo227569p() == 2) {
            str = "/panel/info/v2";
        } else {
            str = "/panel/info";
        }
        sb.append(str);
        return new NetRequest(pVar.mo228352a(hashMap, sb.toString()), hTTPMethod, null, null, null, false, 60, null);
    }

    /* renamed from: a */
    private final void m256908a(PanelInfoResponse panelInfoResponse) {
        String str;
        ICache fVar;
        String str2;
        long j;
        String a = EffectCacheKeyGenerator.f165106a.mo228304a(this.f164974e.mo227559f(), this.f164975f, this.f164976g, this.f164977h, this.f164979j, this.f164978i);
        String str3 = null;
        try {
            IJsonConverter q = this.f164974e.mo227570q();
            if (q != null) {
                str2 = q.mo227739a().mo207365a(panelInfoResponse);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                SharedReference<Long> bVar = this.f164973d;
                ICache fVar2 = (ICache) C1686c.m7468a(this.f164974e.mo227576w());
                if (fVar2 != null) {
                    j = fVar2.mo227682a(a, str2);
                } else {
                    j = 0;
                }
                C1686c.m7469a(bVar, Long.valueOf(j / ((long) EffectConstants.f164862a.mo227731a())));
            }
        } catch (Exception e) {
            Logger.m7508a(Logger.f5760a, "NewFetchPanelInfoTask", "Exception: " + e, null, 4, null);
        }
        try {
            PanelInfoModel responseData = panelInfoResponse.getResponseData();
            if (responseData != null) {
                str = responseData.getVersion();
            } else {
                str = null;
            }
            Version version = new Version(str);
            IJsonConverter q2 = this.f164974e.mo227570q();
            if (q2 != null) {
                str3 = q2.mo227739a().mo207365a(version);
            }
            if (str3 != null && (fVar = (ICache) C1686c.m7468a(this.f164974e.mo227576w())) != null) {
                fVar.mo227682a(EffectCacheKeyGenerator.f165106a.mo228301a(this.f164975f), str3);
            }
        } catch (Exception e2) {
            Logger.m7508a(Logger.f5760a, "FetchPanelInfoTask", "Json Exception: " + e2, null, 4, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public PanelInfoResponse mo228212a(IJsonConverter bVar, String str) {
        Intrinsics.checkParameterIsNotNull(bVar, "jsonConverter");
        Intrinsics.checkParameterIsNotNull(str, "responseString");
        return (PanelInfoResponse) bVar.mo227739a().mo207364a(str, PanelInfoResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: a */
    public void mo228215a(String str, String str2, ExceptionResult cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "exceptionResult");
        Logger bVar = Logger.f5760a;
        Logger.m7508a(bVar, "FetchPanelInfoTask", "Failed: " + cVar, null, 4, null);
        cVar.mo227910a(str, this.f164974e.mo227541A(), str2);
        super.mo228215a(str, str2, cVar);
        IMonitorReport a = this.f164974e.mo227572s().mo8625a();
        if (a != null) {
            EffectConfig effectConfig = this.f164974e;
            String str3 = this.f164975f;
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to("error_code", Integer.valueOf(cVar.mo227908a()));
            if (str2 == null) {
                str2 = "";
            }
            pairArr[1] = TuplesKt.to("host_ip", str2);
            if (str == null) {
                str = "";
            }
            pairArr[2] = TuplesKt.to("download_url", str);
            C65510b.m256823a(a, false, effectConfig, str3, (Map<String, ? extends Object>) MapsKt.mapOf(pairArr), cVar.mo227911b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo228213a(long j, long j2, long j3, PanelInfoResponse panelInfoResponse) {
        Intrinsics.checkParameterIsNotNull(panelInfoResponse, "result");
        PanelInfoModel data = panelInfoResponse.getData();
        if (data != null) {
            CategoryEffectModel category_effects = data.getCategory_effects();
            if (category_effects != null) {
                EffectUtils.f165112a.mo228312a(this.f164974e.mo227562i(), this.f164975f, category_effects.getCategory_effects());
                EffectUtils.f165112a.mo228312a(this.f164974e.mo227562i(), this.f164975f, category_effects.getCollection());
                EffectUtils.f165112a.mo228312a(this.f164974e.mo227562i(), this.f164975f, category_effects.getBind_effects());
                if (this.f164974e.mo227569p() == 2) {
                    EffectUtils.f165112a.mo228313a(data.getUrl_prefix(), category_effects.getCategory_effects());
                    EffectUtils.f165112a.mo228313a(data.getUrl_prefix(), category_effects.getCollection());
                    EffectUtils.f165112a.mo228313a(data.getUrl_prefix(), category_effects.getBind_effects());
                }
            }
            m256908a(panelInfoResponse);
            super.mo228213a(j, j2, j3, (NetResponseChecker) panelInfoResponse);
            long a = DefaultClock.f5722a.mo8623a();
            IMonitorReport a2 = this.f164974e.mo227572s().mo8625a();
            if (a2 != null) {
                C65510b.m256824a(a2, true, this.f164974e, this.f164975f, MapsKt.mapOf(TuplesKt.to("duration", Long.valueOf(a - j)), TuplesKt.to("network_time", Long.valueOf(j2 - j)), TuplesKt.to("json_time", Long.valueOf(j3 - j2)), TuplesKt.to("io_time", Long.valueOf(a - j3)), TuplesKt.to("size", this.f164973d.mo8625a())), null, 16, null);
            }
        }
    }
}
