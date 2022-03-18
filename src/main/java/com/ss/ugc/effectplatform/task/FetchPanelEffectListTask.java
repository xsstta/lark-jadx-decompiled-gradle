package com.ss.ugc.effectplatform.task;

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
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.model.net.EffectNetListResponse;
import com.ss.ugc.effectplatform.model.util.BuildEffectChannelResponse;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.p3244e.C65510b;
import com.ss.ugc.effectplatform.util.EffectCacheKeyGenerator;
import com.ss.ugc.effectplatform.util.EffectRequestUtil;
import com.ss.ugc.effectplatform.util.NetworkUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002#$B5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J$\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J(\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0003H\u0014J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0012\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchPanelEffectListTask;", "Lcom/ss/ugc/effectplatform/task/BaseNetworkTask;", "Lcom/ss/ugc/effectplatform/model/EffectChannelModel;", "Lcom/ss/ugc/effectplatform/model/net/EffectNetListResponse;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "panel", "", "extraParams", "", "taskFlag", "(Lcom/ss/ugc/effectplatform/EffectConfig;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "buildRequest", "Lcom/ss/ugc/effectplatform/bridge/network/NetRequest;", "getFailCode", "", "getRetryCount", "onFailure", "", "requestedUrl", "remoteIp", "exceptionResult", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onSuccess", "startTime", "", "netTime", "jsonTime", "result", "parseResponse", "jsonConverter", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "responseString", "saveEffectList", "newChannel", "Companion", "Version", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FetchPanelEffectListTask extends BaseNetworkTask<EffectChannelModel, EffectNetListResponse> {

    /* renamed from: e */
    public static final Companion f164966e = new Companion(null);

    /* renamed from: h */
    private static final String f164967h = f164967h;

    /* renamed from: c */
    public final EffectConfig f164968c;

    /* renamed from: d */
    public final String f164969d;

    /* renamed from: f */
    private final String f164970f;

    /* renamed from: g */
    private final Map<String, String> f164971g;

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: e */
    public int mo228219e() {
        return UpdateDialogStatusCode.SHOW;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchPanelEffectListTask$Version;", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "(Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "setVersion", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchPanelEffectListTask$Companion;", "", "()V", "TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.FetchPanelEffectListTask$a */
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
        return this.f164968c.mo227567n();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.FetchPanelEffectListTask$b */
    public static final class C65520b extends Lambda implements Function0<Unit> {
        final /* synthetic */ EffectChannelResponse $channelResponse;
        final /* synthetic */ FetchPanelEffectListTask this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65520b(FetchPanelEffectListTask fetchPanelEffectListTask, EffectChannelResponse effectChannelResponse) {
            super(0);
            this.this$0 = fetchPanelEffectListTask;
            this.$channelResponse = effectChannelResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IEffectPlatformBaseListener a = this.this$0.f164968c.mo227550J().mo227753a(this.this$0.f164969d);
            if (a != null) {
                a.mo207370a(this.$channelResponse);
            }
            this.this$0.f164968c.mo227550J().mo227755b(this.this$0.f164969d);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: c */
    public NetRequest mo228217c() {
        HashMap<String, String> a = EffectRequestUtil.f165111a.mo228311a(this.f164968c);
        HashMap<String, String> hashMap = a;
        hashMap.put("panel", this.f164970f);
        Map<String, String> map = this.f164971g;
        if (map != null) {
            a.putAll(map);
        }
        HTTPMethod hTTPMethod = HTTPMethod.GET;
        NetworkUtils pVar = NetworkUtils.f165130a;
        return new NetRequest(pVar.mo228352a(hashMap, this.f164968c.mo227541A() + this.f164968c.mo227552a() + "/v3/effects"), hTTPMethod, null, null, null, false, 60, null);
    }

    /* renamed from: a */
    private final long m256899a(EffectChannelModel effectChannelModel) {
        ICache fVar;
        String str;
        long j;
        long j2 = 0;
        if (effectChannelModel != null) {
            String a = EffectCacheKeyGenerator.f165106a.mo228302a(this.f164968c.mo227559f(), this.f164970f);
            String str2 = null;
            try {
                IJsonConverter q = this.f164968c.mo227570q();
                if (q != null) {
                    str = q.mo227739a().mo207365a(effectChannelModel);
                } else {
                    str = null;
                }
                if (str != null) {
                    ICache fVar2 = (ICache) C1686c.m7468a(this.f164968c.mo227576w());
                    if (fVar2 != null) {
                        j = fVar2.mo227682a(a, str);
                    } else {
                        j = 0;
                    }
                    j2 = j / ((long) EffectConstants.f164862a.mo227731a());
                }
            } catch (Exception e) {
                Logger.m7508a(Logger.f5760a, f164967h, "Exception: " + e, null, 4, null);
            }
            try {
                Version version = new Version(effectChannelModel.getVersion());
                IJsonConverter q2 = this.f164968c.mo227570q();
                if (q2 != null) {
                    str2 = q2.mo227739a().mo207365a(version);
                }
                if (!(str2 == null || (fVar = (ICache) C1686c.m7468a(this.f164968c.mo227576w())) == null)) {
                    fVar.mo227682a("effect_version" + this.f164970f, str2);
                }
            } catch (Exception e2) {
                Logger.m7508a(Logger.f5760a, "FetchPanelInfoTask", "Json Exception: " + e2, null, 4, null);
            }
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public EffectNetListResponse mo228212a(IJsonConverter bVar, String str) {
        Intrinsics.checkParameterIsNotNull(bVar, "jsonConverter");
        Intrinsics.checkParameterIsNotNull(str, "responseString");
        return (EffectNetListResponse) bVar.mo227739a().mo207364a(str, EffectNetListResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: a */
    public void mo228215a(String str, String str2, ExceptionResult cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "exceptionResult");
        cVar.mo227910a(str, this.f164968c.mo227541A(), str2);
        super.mo228215a(str, str2, cVar);
        IMonitorReport a = this.f164968c.mo227572s().mo8625a();
        if (a != null) {
            EffectConfig effectConfig = this.f164968c;
            String str3 = this.f164970f;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("error_code", Integer.valueOf(cVar.mo227908a()));
            if (str2 == null) {
                str2 = "";
            }
            pairArr[1] = TuplesKt.to("host_ip", str2);
            C65510b.m256827b(a, false, effectConfig, str3, MapsKt.mapOf(pairArr), cVar.mo227911b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo228213a(long j, long j2, long j3, EffectNetListResponse effectNetListResponse) {
        Intrinsics.checkParameterIsNotNull(effectNetListResponse, "result");
        EffectChannelModel data = effectNetListResponse.getData();
        if (data != null) {
            EffectChannelResponse a = new BuildEffectChannelResponse(this.f164970f, this.f164968c.mo227562i(), false).mo227898a(data);
            long a2 = m256899a(data);
            mo228259a(new C65520b(this, a));
            long a3 = DefaultClock.f5722a.mo8623a();
            IMonitorReport a4 = this.f164968c.mo227572s().mo8625a();
            if (a4 != null) {
                C65510b.m256828b(a4, true, this.f164968c, this.f164970f, MapsKt.mapOf(TuplesKt.to("duration", Long.valueOf(a3 - j)), TuplesKt.to("network_time", Long.valueOf(j2 - j)), TuplesKt.to("json_time", Long.valueOf(j3 - j2)), TuplesKt.to("io_time", Long.valueOf(a3 - j3)), TuplesKt.to("size", Long.valueOf(a2))), null, 16, null);
            }
        }
    }
}
