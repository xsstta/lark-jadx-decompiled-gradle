package com.tt.refer.common.config;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.host.HostDependManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C69120l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000 22\u00020\u0001:\u00012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u001e\u0010\"\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0018\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010 H\u0002J\n\u0010%\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001bH\u0016JE\u0010+\u001a\u00020\u001b26\u0010,\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00170-\"\u0014\u0012\u0004\u0012\u00020\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010.JC\u0010/\u001a\u00020\u001b26\u0010,\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00170-\"\u0014\u0012\u0004\u0012\u00020\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017¢\u0006\u0002\u0010.J\u0010\u00100\u001a\u00020\u001b2\b\u00101\u001a\u0004\u0018\u00010\u000eR*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/tt/refer/common/config/ConfigStrategyManager;", "Lcom/tt/refer/common/config/IConfigStrategy;", "mAppContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "mActions", "Ljava/util/ArrayList;", "Lcom/tt/refer/common/config/Action;", "Lkotlin/collections/ArrayList;", "getMActions", "()Ljava/util/ArrayList;", "setMActions", "(Ljava/util/ArrayList;)V", "mContent", "", "mHasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mMethod", "getMMethod", "()Ljava/lang/String;", "setMMethod", "(Ljava/lang/String;)V", "mOSConfig", "Lkotlin/Pair;", "", "mVersionConfig", "build", "", "json", "checkAndInit", "createAction", "actionObject", "Lorg/json/JSONObject;", "mainJson", "createConfig", "Lcom/tt/refer/common/config/Config;", "configObject", "getAppContext", "registerCommand", "command", "listener", "Lcom/tt/refer/common/config/IStrategyListener;", "release", "run", "args", "", "([Lkotlin/Pair;)V", "runImpl", "setContent", "content", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.common.b.c */
public final class ConfigStrategyManager implements IConfigStrategy {

    /* renamed from: a */
    public static final Companion f170592a = new Companion(null);

    /* renamed from: b */
    private AtomicBoolean f170593b = new AtomicBoolean(false);

    /* renamed from: c */
    private Pair<String, ? extends Object> f170594c = new Pair<>("os", "Android");

    /* renamed from: d */
    private Pair<String, ? extends Object> f170595d;

    /* renamed from: e */
    private ArrayList<Action> f170596e;

    /* renamed from: f */
    private String f170597f;

    /* renamed from: g */
    private final IAppContext f170598g;

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tt/refer/common/config/ConfigStrategyManager$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.common.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.f170598g;
    }

    /* renamed from: a */
    private final void m263598a() {
        if (!this.f170593b.get()) {
            String str = (String) HostDependManager.getInst().getHostData(2022, "{\n            \"action_method\": \"continue\",\n            \"actions\": [\n                {\n                    \"commands\": [\n                        \"blank\"\n                    ],\n                    \"options\": [\n                        [\n                            \"blankrate\"\n                        ],\n                        [\n                            \"ios\",\n                            \"lucencyblankrate\"\n                        ]\n                    ]\n                },\n                {\n                    \"commands\": [\n                        \"not_blank\"\n                    ],\n                    \"options\": [\n                        [\n                            \"android\",\n                            \"notblankrate\"\n                        ],\n                        [\n                            \"ios\",\n                            \"notblankrate\",\n                            \"notlucencyblankrate\"\n                        ]\n                    ]\n                },\n                {\n                    \"commands\": [\n                        \"close\"\n                    ],\n                    \"options\": [\n                        [\n                            \"count\"\n                        ],\n                        [\n                            \"ios\",\n                            \"count\",\n                            \"blankrate\",\n                            \"lucencyblankrate\"\n                        ]\n                    ]\n                }\n            ],\n            \"configs\": {\n                \"android\": {\n                    \"op\": \"=\",\n                    \"type\": \"os\",\n                    \"value\": \"Android\"\n                },\n                \"blankrate\": {\n                    \"op\": \">\",\n                    \"type\": \"blank_rate\",\n                    \"value\": 0.95\n                },\n                \"count\": {\n                    \"op\": \"=\",\n                    \"type\": \"close_count\",\n                    \"value\": 3\n                },\n                \"fcp\": {\n                    \"op\": \"=\",\n                    \"type\": \"fcp\",\n                    \"value\": false\n                },\n                \"ios\": {\n                    \"op\": \"=\",\n                    \"type\": \"os\",\n                    \"value\": \"iOS\"\n                },\n                \"lucencyblankrate\": {\n                    \"op\": \">\",\n                    \"type\": \"lucency\",\n                    \"value\": 0.5\n                },\n                \"notblankrate\": {\n                    \"op\": \"<=\",\n                    \"type\": \"blank_rate\",\n                    \"value\": 0.95\n                },\n                \"notlucencyblankrate\": {\n                    \"op\": \"<=\",\n                    \"type\": \"lucency\",\n                    \"value\": 0.5\n                }\n            }\n        }", this.f170598g);
            Intrinsics.checkExpressionValueIsNotNull(str, "content");
            mo235125a(str);
            this.f170593b.set(true);
        }
    }

    public ConfigStrategyManager(IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "mAppContext");
        this.f170598g = iAppContext;
        AppbrandContext inst = AppbrandContext.getInst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
        C67531h initParams = inst.getInitParams();
        Intrinsics.checkExpressionValueIsNotNull(initParams, "AppbrandContext.getInst()\n            .initParams");
        this.f170595d = new Pair<>(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, initParams.mo234500a());
        this.f170596e = new ArrayList<>();
        this.f170597f = "break";
    }

    /* renamed from: a */
    private final Config<? extends Object> m263597a(JSONObject jSONObject) {
        Config<? extends Object> bVar = null;
        if (jSONObject == null) {
            return bVar;
        }
        Object obj = jSONObject.get("value");
        if (obj instanceof Boolean) {
            bVar = new Config<>();
            bVar.mo235118a(obj);
        } else if (obj instanceof Number) {
            bVar = new Config<>();
            bVar.mo235118a(obj);
        } else if (obj instanceof String) {
            bVar = new Config<>();
            bVar.mo235118a(obj);
        }
        if (bVar != null) {
            String string = jSONObject.getString(ShareHitPoint.f121869d);
            Intrinsics.checkExpressionValueIsNotNull(string, "configObject.getString(ConfigConstants.TAG_TYPE)");
            bVar.mo235119a(string);
        }
        if (bVar != null) {
            String string2 = jSONObject.getString("op");
            Intrinsics.checkExpressionValueIsNotNull(string2, "configObject.getString(C…gConstants.TAG_OPERATION)");
            bVar.mo235122b(string2);
        }
        return bVar;
    }

    /* renamed from: b */
    public final void mo235128b(Pair<String, ? extends Object>... pairArr) {
        Intrinsics.checkParameterIsNotNull(pairArr, "args");
        ConfigStrategyManager cVar = this;
        Iterator<T> it = cVar.f170596e.iterator();
        while (it.hasNext()) {
            boolean a = it.next().mo235115a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            if (Intrinsics.areEqual(cVar.f170597f, "break") && a) {
                AppBrandLogger.m52830i("StrategyManager", "break so return");
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo235125a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "json");
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("actions");
            String string = jSONObject.getString("action_method");
            Intrinsics.checkExpressionValueIsNotNull(string, "jsonObject.getString(ConfigConstants.TAG_METHOD)");
            this.f170597f = string;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if (obj != null) {
                    this.f170596e.add(m263596a((JSONObject) obj, jSONObject));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type org.json.JSONObject");
                }
            }
            AppBrandLogger.m52830i("StrategyManager", "mActions length = " + this.f170596e.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.tt.refer.common.config.IConfigStrategy
    /* renamed from: a */
    public void mo235127a(Pair<String, ? extends Object>... pairArr) {
        Intrinsics.checkParameterIsNotNull(pairArr, "args");
        try {
            C69120l lVar = new C69120l(2);
            lVar.mo239352a((Object) pairArr);
            lVar.mo239354b(this.f170594c);
            mo235128b((Pair[]) lVar.mo239353a((Object[]) new Pair[lVar.mo239351a()]));
        } catch (Exception e) {
            e.printStackTrace();
            AppBrandLogger.m52830i("StrategyManager", "occur error when run");
        }
    }

    /* renamed from: a */
    private final Action m263596a(JSONObject jSONObject, JSONObject jSONObject2) {
        Action aVar = new Action();
        JSONArray jSONArray = jSONObject.getJSONArray("commands");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            aVar.mo235113a().add(jSONArray.get(i).toString());
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("configs");
        JSONArray jSONArray2 = jSONObject.getJSONArray("options");
        AppBrandLogger.m52830i("StrategyManager", "options length = " + jSONArray2.length());
        int length2 = jSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            ArrayList<Config<? extends Object>> arrayList = new ArrayList<>();
            Object obj = jSONArray2.get(i2);
            if (obj != null) {
                JSONArray jSONArray3 = (JSONArray) obj;
                int length3 = jSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    Config<? extends Object> a = m263597a(jSONObject3.getJSONObject(jSONArray3.get(i3).toString()));
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                aVar.mo235116b().add(arrayList);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type org.json.JSONArray");
            }
        }
        return aVar;
    }

    @Override // com.tt.refer.common.config.IConfigStrategy
    /* renamed from: a */
    public void mo235126a(String str, IStrategyListener eVar) {
        Intrinsics.checkParameterIsNotNull(str, "command");
        m263598a();
        for (T t : this.f170596e) {
            if (eVar != null) {
                t.mo235114a(str, eVar);
            }
        }
    }
}
