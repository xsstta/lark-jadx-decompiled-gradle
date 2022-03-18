package com.ss.ugc.effectplatform.task;

import bytekn.foundation.concurrent.SharedReference;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.p054b.C1686c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.bridge.network.HTTPMethod;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.bridge.network.NetRequest;
import com.ss.ugc.effectplatform.bridge.network.NetResponse;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.model.CheckUpdateVersionModel;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.model.net.EffectCheckUpdateResponse;
import com.ss.ugc.effectplatform.p3242c.C65506c;
import com.ss.ugc.effectplatform.settings.SettingsFactory;
import com.ss.ugc.effectplatform.settings.Setttings;
import com.ss.ugc.effectplatform.util.C65555m;
import com.ss.ugc.effectplatform.util.EffectCacheKeyGenerator;
import com.ss.ugc.effectplatform.util.EffectRequestUtil;
import com.ss.ugc.effectplatform.util.NetworkUtils;
import com.ss.ugc.effectplatform.util.TextUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aBG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/ugc/effectplatform/task/CheckUpdateTask;", "Lcom/ss/ugc/effectplatform/task/BaseNetworkTask;", "", "Lcom/ss/ugc/effectplatform/model/net/EffectCheckUpdateResponse;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "taskFlag", "", "panel", "category", "checkType", "", "extraParams", "", "(Lcom/ss/ugc/effectplatform/EffectConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lbytekn/foundation/concurrent/SharedReference;", "buildRequest", "Lcom/ss/ugc/effectplatform/bridge/network/NetRequest;", "checkedChannelCache", "execute", "", "parseResponse", "jsonConverter", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "responseString", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.c */
public final class CheckUpdateTask extends BaseNetworkTask<Boolean, EffectCheckUpdateResponse> {

    /* renamed from: c */
    public static final Companion f165014c = new Companion(null);

    /* renamed from: d */
    private SharedReference<String> f165015d = new SharedReference<>(null);

    /* renamed from: e */
    private final EffectConfig f165016e;

    /* renamed from: f */
    private final String f165017f;

    /* renamed from: g */
    private final String f165018g;

    /* renamed from: h */
    private final int f165019h;

    /* renamed from: i */
    private final Map<String, String> f165020i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/task/CheckUpdateTask$Companion;", "", "()V", "APP_VERSION", "", "CHECK_CATEGORY_UPDATE", "", "CHECK_INFO_STICKER_PANEL_UPDATE", "CHECK_PANEL_UPDATE", "CHECK_PANEL_UPDATE_PAGE", "TAG", "VERSION", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: i */
    private final boolean m256964i() {
        String str;
        String str2;
        int i = this.f165019h;
        if (i == 0) {
            str = "effect_version" + this.f165017f;
        } else if (i == 1) {
            str = EffectCacheKeyGenerator.f165106a.mo228306c(this.f165017f, this.f165018g);
        } else if (i == 2) {
            str = EffectCacheKeyGenerator.f165106a.mo228301a(this.f165017f);
        } else if (i != 3) {
            str = "effect_version" + this.f165017f;
        } else {
            str = EffectCacheKeyGenerator.f165106a.mo228305b(this.f165016e.mo227559f(), this.f165017f);
        }
        ICache fVar = (ICache) C1686c.m7468a(this.f165016e.mo227576w());
        CheckUpdateVersionModel checkUpdateVersionModel = null;
        if (fVar != null) {
            str2 = fVar.mo227685b(str);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return false;
        }
        if (this.f165019h == 3) {
            return true;
        }
        CheckUpdateVersionModel checkUpdateVersionModel2 = null;
        try {
            IJsonConverter q = this.f165016e.mo227570q();
            if (q != null) {
                checkUpdateVersionModel = (CheckUpdateVersionModel) q.mo227739a().mo207364a(str2, CheckUpdateVersionModel.class);
            }
            checkUpdateVersionModel2 = checkUpdateVersionModel;
        } catch (Exception e) {
            Logger.m7508a(Logger.f5760a, "CheckUpdateTask", "Json Parse Exception: " + e, null, 4, null);
        }
        if (checkUpdateVersionModel2 == null) {
            return false;
        }
        C1686c.m7469a(this.f165015d, checkUpdateVersionModel2.getVersion());
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask
    /* renamed from: c */
    public NetRequest mo228217c() {
        String str;
        if (TextUtils.f165135a.mo228357a(C65555m.m257111a(this.f165016e))) {
            str = HiAnalyticsConstant.HaKey.BI_KEY_VERSION;
        } else {
            str = C65555m.m257111a(this.f165016e) + FileManager.f5817a.mo8712a() + HiAnalyticsConstant.HaKey.BI_KEY_VERSION;
        }
        Setttings a = SettingsFactory.f164933a.mo227815a(str, this.f165016e.mo227543C());
        String str2 = "";
        boolean z = !Intrinsics.areEqual(a.mo227814b("app_version", str2), this.f165016e.mo227557d());
        if (z) {
            String d = this.f165016e.mo227557d();
            if (d == null) {
                d = str2;
            }
            a.mo227813a("app_version", d);
        }
        HashMap<String, String> a2 = EffectRequestUtil.f165111a.mo228311a(this.f165016e);
        HashMap<String, String> hashMap = a2;
        String str3 = this.f165017f;
        if (str3 == null) {
            str3 = str2;
        }
        hashMap.put("panel", str3);
        int i = this.f165019h;
        String str4 = "/panel/check";
        if (i != 0) {
            if (i == 1) {
                String str5 = this.f165018g;
                if (str5 == null) {
                    str5 = str2;
                }
                hashMap.put("category", str5);
                str4 = "/category/check";
            } else if (i != 2 && i == 3) {
                str4 = "/sticker/checkUpdate";
            }
        }
        if (z) {
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, str2);
        } else {
            String a3 = this.f165015d.mo8625a();
            if (a3 != null) {
                str2 = a3;
            }
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, str2);
        }
        Map<String, String> map = this.f165020i;
        if (map != null) {
            a2.putAll(map);
        }
        String y = this.f165016e.mo227578y();
        if (y != null) {
            hashMap.put("test_status", y);
        }
        return new NetRequest(NetworkUtils.f165130a.mo228352a(hashMap, this.f165016e.mo227541A() + this.f165016e.mo227552a() + str4), HTTPMethod.GET, null, null, null, false, 60, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseNetworkTask, com.ss.ugc.effectplatform.task.BaseTask
    /* renamed from: f */
    public void mo228248f() {
        NetResponse eVar;
        if (!m256964i()) {
            mo228213a(0, 0, 0, new EffectCheckUpdateResponse(true, null, 0, 6, null));
        } else if (!mo228260g()) {
            try {
                NetRequest c = mo228217c();
                INetworkClient a = this.f165016e.mo227571r().mo8625a();
                if (a != null) {
                    eVar = a.mo207366a(c);
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    String a2 = C65506c.m256760a(eVar.mo227747b());
                    if (!TextUtils.f165135a.mo228357a(a2) && this.f165016e.mo227570q() != null) {
                        IJsonConverter q = this.f165016e.mo227570q();
                        if (q != null) {
                            EffectCheckUpdateResponse b = mo228212a(q, a2);
                            if (b != null) {
                                mo228213a(0, 0, 0, b);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo228215a(null, null, new ExceptionResult((int) UpdateDialogStatusCode.SHOW));
            } catch (Exception e) {
                mo228215a(null, null, new ExceptionResult(e));
                Logger.m7508a(Logger.f5760a, "CheckUpdateTask", "checkUpdate Failed: " + e, null, 4, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public EffectCheckUpdateResponse mo228212a(IJsonConverter bVar, String str) {
        Intrinsics.checkParameterIsNotNull(bVar, "jsonConverter");
        Intrinsics.checkParameterIsNotNull(str, "responseString");
        return (EffectCheckUpdateResponse) bVar.mo227739a().mo207364a(str, EffectCheckUpdateResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckUpdateTask(EffectConfig effectConfig, String str, String str2, String str3, int i, Map<String, String> map) {
        super(effectConfig.mo227571r().mo8625a(), effectConfig.mo227570q(), effectConfig.mo227550J(), str);
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        Intrinsics.checkParameterIsNotNull(str, "taskFlag");
        this.f165016e = effectConfig;
        this.f165017f = str2;
        this.f165018g = str3;
        this.f165019h = i;
        this.f165020i = map;
    }
}
