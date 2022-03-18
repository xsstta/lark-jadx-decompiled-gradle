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
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.p3244e.C65510b;
import com.ss.ugc.effectplatform.util.EffectCacheKeyGenerator;
import com.ss.ugc.effectplatform.util.EffectRequestUtil;
import com.ss.ugc.effectplatform.util.EffectUtils;
import com.ss.ugc.effectplatform.util.NetworkUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002()Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000bH\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0014J$\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J(\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0003H\u0014J\u001a\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007H\u0014J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u0003H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchCategoryEffectTask;", "Lcom/ss/ugc/effectplatform/task/BaseNetworkTask;", "Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "Lcom/ss/ugc/effectplatform/model/net/CategoryEffectListResponse;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "panel", "", "taskFlag", "category", "count", "", "cursor", "sortingPosition", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "extraParams", "", "(Lcom/ss/ugc/effectplatform/EffectConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Map;)V", "buildRequest", "Lcom/ss/ugc/effectplatform/bridge/network/NetRequest;", "getFailCode", "getRetryCount", "onFailure", "", "requestedUrl", "remoteIp", "exceptionResult", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onSuccess", "startTime", "", "netTime", "jsonTime", "result", "parseResponse", "jsonConverter", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "responseString", "saveEffectList", "model", "CategoryVersion", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FetchCategoryEffectTask extends BaseNetworkTask<CategoryPageModel, CategoryEffectListResponse> {

    /* renamed from: c */
    public static final Companion f164957c = new Companion(null);

    /* renamed from: d */
    private final EffectConfig f164958d;

    /* renamed from: e */
    private final String f164959e;

    /* renamed from: f */
    private final String f164960f;

    /* renamed from: g */
    private final int f164961g;

    /* renamed from: h */
    private final int f164962h;

    /* renamed from: i */
    private final int f164963i;

    /* renamed from: j */
    private final String f164964j;

    /* renamed from: k */
    private final Map<String, String> f164965k;

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: e */
    public int mo228219e() {
        return UpdateDialogStatusCode.SHOW;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchCategoryEffectTask$CategoryVersion;", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "cursor", "", "sorting_position", "(Ljava/lang/String;II)V", "getCursor", "()I", "getSorting_position", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class CategoryVersion {
        private final int cursor;
        private final int sorting_position;
        private final String version;

        public static /* synthetic */ CategoryVersion copy$default(CategoryVersion categoryVersion, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = categoryVersion.version;
            }
            if ((i3 & 2) != 0) {
                i = categoryVersion.cursor;
            }
            if ((i3 & 4) != 0) {
                i2 = categoryVersion.sorting_position;
            }
            return categoryVersion.copy(str, i, i2);
        }

        public final String component1() {
            return this.version;
        }

        public final int component2() {
            return this.cursor;
        }

        public final int component3() {
            return this.sorting_position;
        }

        public final CategoryVersion copy(String str, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
            return new CategoryVersion(str, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryVersion)) {
                return false;
            }
            CategoryVersion categoryVersion = (CategoryVersion) obj;
            return Intrinsics.areEqual(this.version, categoryVersion.version) && this.cursor == categoryVersion.cursor && this.sorting_position == categoryVersion.sorting_position;
        }

        public int hashCode() {
            String str = this.version;
            return ((((str != null ? str.hashCode() : 0) * 31) + this.cursor) * 31) + this.sorting_position;
        }

        public String toString() {
            return "CategoryVersion(version=" + this.version + ", cursor=" + this.cursor + ", sorting_position=" + this.sorting_position + ")";
        }

        public final int getCursor() {
            return this.cursor;
        }

        public final int getSorting_position() {
            return this.sorting_position;
        }

        public final String getVersion() {
            return this.version;
        }

        public CategoryVersion(String str, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
            this.version = str;
            this.cursor = i;
            this.sorting_position = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchCategoryEffectTask$Companion;", "", "()V", "TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.FetchCategoryEffectTask$a */
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
        return this.f164958d.mo227567n();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: c */
    public NetRequest mo228217c() {
        String str;
        HashMap<String, String> a = EffectRequestUtil.f165111a.mo228311a(this.f164958d);
        HashMap<String, String> hashMap = a;
        hashMap.put("panel", this.f164959e);
        String str2 = this.f164960f;
        if (str2 == null) {
            str2 = "hot";
        }
        hashMap.put("category", str2);
        hashMap.put("cursor", String.valueOf(this.f164962h));
        hashMap.put("count", String.valueOf(this.f164961g));
        hashMap.put("sorting_position", String.valueOf(this.f164963i));
        String str3 = this.f164964j;
        if (str3 == null) {
            str3 = "0";
        }
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, str3);
        String y = this.f164958d.mo227578y();
        if (y != null) {
            hashMap.put("test_status", y);
        }
        Map<String, String> map = this.f164965k;
        if (map != null) {
            a.putAll(map);
        }
        HTTPMethod hTTPMethod = HTTPMethod.GET;
        NetworkUtils pVar = NetworkUtils.f165130a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f164958d.mo227541A());
        sb.append(this.f164958d.mo227552a());
        if (this.f164958d.mo227569p() == 2) {
            str = "/category/effects/v2";
        } else {
            str = "/category/effects";
        }
        sb.append(str);
        return new NetRequest(pVar.mo228352a(hashMap, sb.toString()), hTTPMethod, null, null, null, false, 60, null);
    }

    /* renamed from: a */
    private final long m256890a(CategoryEffectListResponse categoryEffectListResponse) {
        String str;
        int i;
        ICache fVar;
        CategoryEffectModel category_effects;
        CategoryEffectModel category_effects2;
        CategoryEffectModel category_effects3;
        String str2;
        long j;
        String a = EffectCacheKeyGenerator.f165106a.mo228303a(this.f164959e, this.f164960f, this.f164961g, this.f164962h, this.f164963i);
        String str3 = null;
        long j2 = 0;
        try {
            IJsonConverter q = this.f164958d.mo227570q();
            if (q != null) {
                str2 = q.mo227739a().mo207365a(categoryEffectListResponse);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                ICache fVar2 = (ICache) C1686c.m7468a(this.f164958d.mo227576w());
                if (fVar2 != null) {
                    j = fVar2.mo227682a(a, str2);
                } else {
                    j = 0;
                }
                j2 = j / ((long) EffectConstants.f164862a.mo227731a());
            }
        } catch (Exception e) {
            Logger.m7508a(Logger.f5760a, "FetchCategoryEffectTask", "Json Exception: " + e, null, 4, null);
        }
        try {
            CategoryPageModel data = categoryEffectListResponse.getData();
            if (data == null || (category_effects3 = data.getCategory_effects()) == null || (str = category_effects3.getVersion()) == null) {
                str = "0";
            }
            CategoryPageModel data2 = categoryEffectListResponse.getData();
            int i2 = 0;
            if (data2 == null || (category_effects2 = data2.getCategory_effects()) == null) {
                i = 0;
            } else {
                i = category_effects2.getCursor();
            }
            CategoryPageModel data3 = categoryEffectListResponse.getData();
            if (!(data3 == null || (category_effects = data3.getCategory_effects()) == null)) {
                i2 = category_effects.getSorting_position();
            }
            CategoryVersion categoryVersion = new CategoryVersion(str, i, i2);
            IJsonConverter q2 = this.f164958d.mo227570q();
            if (q2 != null) {
                str3 = q2.mo227739a().mo207365a(categoryVersion);
            }
            if (!(str3 == null || (fVar = (ICache) C1686c.m7468a(this.f164958d.mo227576w())) == null)) {
                fVar.mo227682a(EffectCacheKeyGenerator.f165106a.mo228306c(this.f164959e, this.f164960f), str3);
            }
        } catch (Exception e2) {
            Logger.m7508a(Logger.f5760a, "FetchCategoryEffectTask", "Json Exception: " + e2, null, 4, null);
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public CategoryEffectListResponse mo228212a(IJsonConverter bVar, String str) {
        Intrinsics.checkParameterIsNotNull(bVar, "jsonConverter");
        Intrinsics.checkParameterIsNotNull(str, "responseString");
        return (CategoryEffectListResponse) bVar.mo227739a().mo207364a(str, CategoryEffectListResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: a */
    public void mo228215a(String str, String str2, ExceptionResult cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "exceptionResult");
        cVar.mo227910a(str, this.f164958d.mo227541A(), str2);
        super.mo228215a(str, str2, cVar);
        IMonitorReport a = this.f164958d.mo227572s().mo8625a();
        if (a != null) {
            EffectConfig effectConfig = this.f164958d;
            String str3 = this.f164959e;
            String str4 = this.f164960f;
            if (str4 == null) {
                str4 = "";
            }
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
            C65510b.m256821a(a, false, effectConfig, str3, str4, (Map<String, ? extends Object>) MapsKt.mapOf(pairArr), cVar.mo227911b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo228213a(long j, long j2, long j3, CategoryEffectListResponse categoryEffectListResponse) {
        List<Effect> list;
        List<Effect> list2;
        List<Effect> list3;
        List<Effect> list4;
        List<Effect> list5;
        Intrinsics.checkParameterIsNotNull(categoryEffectListResponse, "result");
        CategoryPageModel data = categoryEffectListResponse.getData();
        if (data != null) {
            EffectUtils jVar = EffectUtils.f165112a;
            String i = this.f164958d.mo227562i();
            String str = this.f164959e;
            CategoryEffectModel category_effects = data.getCategory_effects();
            List<Effect> list6 = null;
            if (category_effects != null) {
                list = category_effects.getCategory_effects();
            } else {
                list = null;
            }
            jVar.mo228312a(i, str, list);
            EffectUtils jVar2 = EffectUtils.f165112a;
            String i2 = this.f164958d.mo227562i();
            String str2 = this.f164959e;
            CategoryEffectModel category_effects2 = data.getCategory_effects();
            if (category_effects2 != null) {
                list2 = category_effects2.getCollection();
            } else {
                list2 = null;
            }
            jVar2.mo228312a(i2, str2, list2);
            EffectUtils jVar3 = EffectUtils.f165112a;
            String i3 = this.f164958d.mo227562i();
            String str3 = this.f164959e;
            CategoryEffectModel category_effects3 = data.getCategory_effects();
            if (category_effects3 != null) {
                list3 = category_effects3.getBind_effects();
            } else {
                list3 = null;
            }
            jVar3.mo228312a(i3, str3, list3);
            if (this.f164958d.mo227569p() == 2) {
                EffectUtils jVar4 = EffectUtils.f165112a;
                List<String> url_prefix = data.getUrl_prefix();
                CategoryEffectModel category_effects4 = data.getCategory_effects();
                if (category_effects4 != null) {
                    list4 = category_effects4.getCategory_effects();
                } else {
                    list4 = null;
                }
                jVar4.mo228313a(url_prefix, list4);
                EffectUtils jVar5 = EffectUtils.f165112a;
                List<String> url_prefix2 = data.getUrl_prefix();
                CategoryEffectModel category_effects5 = data.getCategory_effects();
                if (category_effects5 != null) {
                    list5 = category_effects5.getCollection();
                } else {
                    list5 = null;
                }
                jVar5.mo228313a(url_prefix2, list5);
                EffectUtils jVar6 = EffectUtils.f165112a;
                List<String> url_prefix3 = data.getUrl_prefix();
                CategoryEffectModel category_effects6 = data.getCategory_effects();
                if (category_effects6 != null) {
                    list6 = category_effects6.getBind_effects();
                }
                jVar6.mo228313a(url_prefix3, list6);
            }
            long a = m256890a(categoryEffectListResponse);
            super.mo228213a(j, j2, j3, (NetResponseChecker) categoryEffectListResponse);
            long a2 = DefaultClock.f5722a.mo8623a();
            IMonitorReport a3 = this.f164958d.mo227572s().mo8625a();
            if (a3 != null) {
                EffectConfig effectConfig = this.f164958d;
                String str4 = this.f164959e;
                String str5 = this.f164960f;
                if (str5 == null) {
                    str5 = "";
                }
                C65510b.m256822a(a3, true, effectConfig, str4, str5, MapsKt.mapOf(TuplesKt.to("duration", Long.valueOf(a2 - j)), TuplesKt.to("network_time", Long.valueOf(j2 - j)), TuplesKt.to("json_time", Long.valueOf(j3 - j2)), TuplesKt.to("io_time", Long.valueOf(a2 - j3)), TuplesKt.to("size", Long.valueOf(a))), null, 32, null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCategoryEffectTask(EffectConfig effectConfig, String str, String str2, String str3, int i, int i2, int i3, String str4, Map<String, String> map) {
        super(effectConfig.mo227571r().mo8625a(), effectConfig.mo227570q(), effectConfig.mo227550J(), str2);
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        Intrinsics.checkParameterIsNotNull(str, "panel");
        Intrinsics.checkParameterIsNotNull(str2, "taskFlag");
        this.f164958d = effectConfig;
        this.f164959e = str;
        this.f164960f = str3;
        this.f164961g = i;
        this.f164962h = i2;
        this.f164963i = i3;
        this.f164964j = str4;
        this.f164965k = map;
    }
}
