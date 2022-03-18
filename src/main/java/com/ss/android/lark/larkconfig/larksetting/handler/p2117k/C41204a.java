package com.ss.android.lark.larkconfig.larksetting.handler.p2117k;

import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.export.ShareRemoteConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.k.a */
public class C41204a extends AbstractBaseSettingHandler.UserSPCachedSettingHandler {

    /* renamed from: a */
    private Map<String, ShareRemoteConfig> f104983a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.k.a$a */
    public static class C41206a {

        /* renamed from: a */
        public static C41204a f104984a = new C41204a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "lark_share_configuration_v2";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "ThirdShare";
    }

    /* renamed from: d */
    public static C41204a m163434d() {
        return C41206a.f104984a;
    }

    /* renamed from: e */
    public Map<String, ShareRemoteConfig> mo107775e() {
        return this.f104983a;
    }

    private C41204a() {
        this.f104983a = new HashMap();
        mo148402a(mo148412j().mo148421a(new Function1() {
            /* class com.ss.android.lark.larkconfig.larksetting.handler.p2117k.$$Lambda$a$gPLUM7gol7X8P56CBvdsvpTCM4 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41204a.m270690lambda$gPLUM7gol7X8P56CBvdsvpTCM4(C41204a.this, (String) obj);
            }
        }).mo148428e(new Function0() {
            /* class com.ss.android.lark.larkconfig.larksetting.handler.p2117k.$$Lambda$a$1iKCqxI5RtXIUE0UcvfpfQ_LSAo */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41204a.lambda$1iKCqxI5RtXIUE0UcvfpfQ_LSAo(C41204a.this);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Unit m163435f() {
        String h = mo148410h();
        Log.m165389i("ThirdShare", "local config: " + h);
        this.f104983a = ShareRemoteConfig.parse(h);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m163433a(String str) {
        Log.m165389i("ThirdShare", "remote config: " + str);
        this.f104983a = ShareRemoteConfig.parse(str);
        return null;
    }
}
