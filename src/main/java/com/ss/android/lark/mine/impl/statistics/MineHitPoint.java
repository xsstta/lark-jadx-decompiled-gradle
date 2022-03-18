package com.ss.android.lark.mine.impl.statistics;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007R'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mine/impl/statistics/MineHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "targetMap", "", "", "getTargetMap", "()Ljava/util/Map;", "targetMap$delegate", "Lkotlin/Lazy;", "sendClickSettingMain", "", "click", "target", "sendViewSettingMain", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.statistics.a */
public final class MineHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final MineHitPoint f115572a = new MineHitPoint();

    /* renamed from: b */
    private static final Lazy f115573b = LazyKt.lazy(C45799a.INSTANCE);

    /* renamed from: b */
    private final Map<String, String> m181469b() {
        return (Map) f115573b.getValue();
    }

    private MineHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m181466a() {
        Statistics.sendEvent("setting_main_view");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.statistics.a$a */
    static final class C45799a extends Lambda implements Function0<HashMap<String, String>> {
        public static final C45799a INSTANCE = new C45799a();

        C45799a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HashMap<String, String> invoke() {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("setting", "setting_detail_view");
            hashMap.put("personal_link", "onboarding_add_external_contact_qrcode_link_view");
            hashMap.put("join_or_create_team", "onboarding_team_join_create_upgrade_view");
            hashMap.put("help", "hc_help_view");
            hashMap.put("favorite", "public_favorite_main_view");
            hashMap.put("wallet", "public_wallet_view");
            hashMap.put("device", "public_device_view");
            hashMap.put("do_not_disturb", "none");
            hashMap.put("profile", "setting_profile_view");
            hashMap.put(UpdateKey.STATUS, "none");
            hashMap.put("sos", "im_chat_main_view");
            return hashMap;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m181467a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        String str2 = f115572a.m181469b().get(str);
        if (str2 == null) {
            str2 = "none";
        }
        m181468a(str, str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m181468a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", str);
        jSONObject.put("target", str2);
        Statistics.sendEvent("setting_main_click", jSONObject);
    }
}
