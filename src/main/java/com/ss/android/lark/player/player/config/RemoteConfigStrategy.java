package com.ss.android.lark.player.player.config;

import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.p2513c.C52114o;
import com.ss.android.lark.player.player.LarkVideoEngineCallback;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001c\u0010\u001b\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00038BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00038BX\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00038BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/player/player/config/RemoteConfigStrategy;", "Lcom/ss/android/lark/player/player/config/BaseConfigStrategy;", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "engineJson", "getEngineJson", "()Lorg/json/JSONObject;", "engineJson$delegate", "Lkotlin/Lazy;", "getJsonObject", "larkJson", "getLarkJson", "larkJson$delegate", "mdlJson", "getMdlJson", "mdlJson$delegate", "configEngine", "Lcom/ss/ttvideoengine/TTVideoEngine;", "configLark", "", "configMDL", "setMDLValue", "jsonKey", "", "engineKey", "", "setEngineOption", "Companion", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.player.c.a.c */
public final class RemoteConfigStrategy extends BaseConfigStrategy {

    /* renamed from: a */
    public static final Companion f129277a = new Companion(null);

    /* renamed from: b */
    private final Lazy f129278b = LazyKt.lazy(new C52105c(this));

    /* renamed from: c */
    private final Lazy f129279c = LazyKt.lazy(new C52106d(this));

    /* renamed from: d */
    private final Lazy f129280d = LazyKt.lazy(new C52104b(this));

    /* renamed from: e */
    private final JSONObject f129281e;

    /* renamed from: e */
    private final JSONObject m202102e() {
        return (JSONObject) this.f129278b.getValue();
    }

    /* renamed from: f */
    private final JSONObject m202103f() {
        return (JSONObject) this.f129279c.getValue();
    }

    /* renamed from: g */
    private final JSONObject m202104g() {
        return (JSONObject) this.f129280d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/player/player/config/RemoteConfigStrategy$Companion;", "", "()V", "BAD_AV_WAIT_TIME", "", "CACHE_CONTROL_ENABLED", "DATALOADER_KEY_INT_BACKUP_DNS_TYPE", "DATALOADER_KEY_INT_DNS_MAIN_DELAYED_USE_BACKUP_TIME", "DATALOADER_KEY_INT_ENABLE_DNS_PARALLEL_PARSE", "DATALOADER_KEY_INT_ENABLE_DNS_REFRESH", "DATALOADER_KEY_INT_ENABLE_EXTERN_DNS", "DATALOADER_KEY_INT_ENABLE_SOCKET_REUSE", "DATALOADER_KEY_INT_MAIN_DNS_TYPE", "DATALOADER_KEY_INT_MAXCACHESIZE", "DOMAIN_ENGINE", "DOMAIN_LARK", "DOMAIN_MDL", "ENGINE_PARAM_KEY_ENABLE_LOOPER", "PLAYER_BUFFERING_DATA_OF_MILLISECONDS", "PLAYER_BUFFERING_TIMEOUT", "PLAYER_MAX_BUFFERING_DATA_OF_MILLISECONDS", "PLAYER_NETWORK_TIMEOUT", "PLAYER_OPTION_CACHE", "PLAYER_OPTION_ENABEL_HARDWARE_DECODE", "PLAYER_OPTION_ENABLE_BYTEVC1", "PLAYER_OPTION_ENABLE_DATALOADER", "PLAYER_OPTION_ENABLE_DEMUX_NONBLOCK_READ", "PLAYER_OPTION_IMAGE_LAYOUT", "PLAYER_OPTION_KEEP_FORMAT_THREAD_ALIVE", "PLAYER_OPTION_NOTIFY_BUFFERING_DIRECTLY", "PLAYER_OPTION_POSITION_UPDATE_INTERVAL", "PLAYER_OPTION_POST_PREPARE", "PLAYER_OPTION_PREFER_NEAREST_MAX_POS_OFFSET", "PLAYER_OPTION_PREFER_NEAREST_SAMPLE", "PLAYER_OPTION_SKIP_FIND_STREAM_INFO", "PLAYER_OPTION_USE_VIDEOMODEL_CACHE", "PLAYER_TYPE_OS", "TAG", "USE_CACHE_FROM_BIZ", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.player.c.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final JSONObject mo178487d() {
        return this.f129281e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.player.c.a.c$b */
    static final class C52104b extends Lambda implements Function0<JSONObject> {
        final /* synthetic */ RemoteConfigStrategy this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52104b(RemoteConfigStrategy cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final JSONObject invoke() {
            return this.this$0.mo178487d().optJSONObject("engine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.player.c.a.c$c */
    static final class C52105c extends Lambda implements Function0<JSONObject> {
        final /* synthetic */ RemoteConfigStrategy this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52105c(RemoteConfigStrategy cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final JSONObject invoke() {
            return this.this$0.mo178487d().optJSONObject("lark");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.player.c.a.c$d */
    static final class C52106d extends Lambda implements Function0<JSONObject> {
        final /* synthetic */ RemoteConfigStrategy this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52106d(RemoteConfigStrategy cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final JSONObject invoke() {
            return this.this$0.mo178487d().optJSONObject("mdl");
        }
    }

    @Override // com.ss.android.lark.player.player.config.BaseConfigStrategy
    /* renamed from: b */
    public void mo178485b() {
        super.mo178485b();
        m202101a("DATALOADER_KEY_INT_ENABLE_EXTERN_DNS", 7);
        m202101a("DATALOADER_KEY_INT_ENABLE_SOCKET_REUSE", 8);
        m202101a("DATALOADER_KEY_INT_MAIN_DNS_TYPE", 90);
        m202101a("DATALOADER_KEY_INT_BACKUP_DNS_TYPE", 91);
        m202101a("DATALOADER_KEY_INT_DNS_MAIN_DELAYED_USE_BACKUP_TIME", 92);
        m202101a("DATALOADER_KEY_INT_ENABLE_DNS_REFRESH", LocationRequest.PRIORITY_NO_POWER);
        m202101a("DATALOADER_KEY_INT_ENABLE_DNS_PARALLEL_PARSE", 103);
        m202101a("DATALOADER_KEY_INT_MAXCACHESIZE", 1);
    }

    @Override // com.ss.android.lark.player.player.config.BaseConfigStrategy
    /* renamed from: a */
    public void mo178484a() {
        JSONObject e = m202102e();
        if (e != null) {
            if (e.has("USE_CACHE_FROM_BIZ")) {
                boolean z = true;
                if (e.getInt("USE_CACHE_FROM_BIZ") != 1) {
                    z = false;
                }
                C52114o.m202146c(z);
            }
            if (e.has("BAD_AV_WAIT_TIME")) {
                LarkVideoEngineCallback.f129285b.mo178513a(e.getLong("BAD_AV_WAIT_TIME"));
            }
        }
    }

    @Override // com.ss.android.lark.player.player.config.BaseConfigStrategy
    /* renamed from: c */
    public TTVideoEngine mo178486c() {
        int i;
        JSONObject g = m202104g();
        if (g == null || g.optInt("PLAYER_TYPE_OS", 0) != 1) {
            i = 0;
        } else {
            i = 2;
        }
        HashMap hashMap = new HashMap();
        JSONObject g2 = m202104g();
        if (g2 != null && g2.optInt("ENGINE_PARAM_KEY_ENABLE_LOOPER", 0) == 1) {
            hashMap.put("enable_looper", true);
        }
        TTVideoEngine tTVideoEngine = new TTVideoEngine(LarkContext.getApplication(), i, hashMap);
        JSONObject g3 = m202104g();
        if (g3 != null && g3.optInt("PLAYER_OPTION_ENABEL_HARDWARE_DECODE", 0) == 1) {
            tTVideoEngine.setIntOption(7, 1);
            tTVideoEngine.setAsyncInit(true, 0);
        }
        JSONObject g4 = m202104g();
        if (g4 != null && g4.optInt("CACHE_CONTROL_ENABLED", 0) == 1) {
            tTVideoEngine.setCacheControlEnabled(true);
        }
        m202100a(tTVideoEngine, "PLAYER_NETWORK_TIMEOUT", 12);
        m202100a(tTVideoEngine, "PLAYER_BUFFERING_TIMEOUT", 11);
        m202100a(tTVideoEngine, "PLAYER_OPTION_NOTIFY_BUFFERING_DIRECTLY", 322);
        m202100a(tTVideoEngine, "PLAYER_BUFFERING_DATA_OF_MILLISECONDS", 118);
        m202100a(tTVideoEngine, "PLAYER_MAX_BUFFERING_DATA_OF_MILLISECONDS", 202);
        m202100a(tTVideoEngine, "PLAYER_OPTION_CACHE", 0);
        m202100a(tTVideoEngine, "PLAYER_OPTION_PREFER_NEAREST_SAMPLE", SmEvents.EVENT_HBRESET);
        m202100a(tTVideoEngine, "PLAYER_OPTION_PREFER_NEAREST_MAX_POS_OFFSET", 954);
        m202100a(tTVideoEngine, "PLAYER_OPTION_ENABLE_DEMUX_NONBLOCK_READ", 561);
        m202100a(tTVideoEngine, "PLAYER_OPTION_POSITION_UPDATE_INTERVAL", 602);
        m202100a(tTVideoEngine, "PLAYER_OPTION_SKIP_FIND_STREAM_INFO", 204);
        m202100a(tTVideoEngine, "PLAYER_OPTION_POST_PREPARE", 482);
        m202100a(tTVideoEngine, "PLAYER_OPTION_KEEP_FORMAT_THREAD_ALIVE", 509);
        m202100a(tTVideoEngine, "PLAYER_OPTION_IMAGE_LAYOUT", 4);
        m202100a(tTVideoEngine, "PLAYER_OPTION_ENABLE_BYTEVC1", 6);
        m202100a(tTVideoEngine, "PLAYER_OPTION_ENABLE_DATALOADER", 160);
        m202100a(tTVideoEngine, "PLAYER_OPTION_USE_VIDEOMODEL_CACHE", 21);
        return tTVideoEngine;
    }

    public RemoteConfigStrategy(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
        this.f129281e = jSONObject;
    }

    /* renamed from: a */
    private final void m202101a(String str, int i) {
        JSONObject f = m202103f();
        if (f != null && f.has(str)) {
            int i2 = f.getInt(str);
            TTVideoEngine.setIntValue(i, i2);
            Log.m165389i("RemoteConfigStrategy", "set key: " + str + ", value: " + i2);
        }
    }

    /* renamed from: a */
    private final void m202100a(TTVideoEngine tTVideoEngine, String str, int i) {
        JSONObject g = m202104g();
        if (g != null && g.has(str)) {
            int i2 = g.getInt(str);
            tTVideoEngine.setIntOption(i, i2);
            Log.m165389i("RemoteConfigStrategy", "set key: " + str + ", value: " + i2);
        }
    }
}
