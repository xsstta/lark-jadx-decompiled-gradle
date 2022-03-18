package com.ss.android.lark.platform.p2494o.p2495a;

import android.text.TextUtils;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.p2494o.C51886a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.o.a.a */
public class C51888a extends AbstractBaseSettingHandler {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.o.a.a$b */
    public static class C51891b {

        /* renamed from: a */
        public static C51888a f128899a = new C51888a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "custom_exception_config_android";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "CPUExceptionHandler";
    }

    /* renamed from: d */
    public static C51888a m201263d() {
        return C51891b.f128899a;
    }

    /* renamed from: com.ss.android.lark.platform.o.a.a$a */
    public static class C51890a implements IAppSettingPlugin {
        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: b */
        public String mo107779b() {
            return "CPUExceptionHandler";
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: c */
        public boolean mo107780c() {
            return false;
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: a */
        public Collection<AbstractBaseSettingHandler> mo107778a() {
            return new HashSet(Collections.singletonList(C51888a.m201263d()));
        }
    }

    private C51888a() {
        mo148402a(mo148411i().mo148421a(new Function1() {
            /* class com.ss.android.lark.platform.p2494o.p2495a.$$Lambda$a$yvqn73LvCpRQVHTWTJJkyjHll00 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C51888a.this.m201262a((String) obj);
            }
        }));
    }

    /* renamed from: e */
    public long[] mo107775e() {
        return new long[]{mo148399a("cpu_excptionlow_usage_rate", 50), mo148399a("cpu_excptionmiddle_usage_rate", 80), mo148399a("cpu_excptionhigh_usage_rate", 100)};
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m201262a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("cpu_excption");
            long optLong = optJSONObject.optLong("low_usage_rate", 50);
            long optLong2 = optJSONObject.optLong("middle_usage_rate", 80);
            long optLong3 = optJSONObject.optLong("high_usage_rate", 100);
            mo148401a(optLong, "cpu_excptionlow_usage_rate");
            mo148401a(optLong2, "cpu_excptionmiddle_usage_rate");
            mo148401a(optLong3, "cpu_excptionhigh_usage_rate");
            C51886a.m201246a().mo168807a(optLong, optLong2, optLong3);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("safe_mode");
            if (optJSONObject2 != null) {
                C36083a.m141486a().getSafeModeDependency().mo133108a(optJSONObject2);
            }
            return null;
        } catch (Exception e) {
            Log.m165384e("CPUExceptionHandler", "CPUExceptionHandler", e);
        }
    }
}
