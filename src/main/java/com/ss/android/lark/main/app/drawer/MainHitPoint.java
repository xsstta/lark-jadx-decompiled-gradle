package com.ss.android.lark.main.app.drawer;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/main/app/drawer/MainHitPoint;", "", "()V", "Companion", "NodePath", "UserType", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MainHitPoint {

    /* renamed from: a */
    public static final HashMap<Integer, String> f112171a = MapsKt.hashMapOf(TuplesKt.to(0, "have_session"), TuplesKt.to(1, "new_account"), TuplesKt.to(2, "invalid"), TuplesKt.to(3, "no_permission_account"));

    /* renamed from: b */
    public static final Companion f112172b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/main/app/drawer/MainHitPoint$UserType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", ShareHitPoint.f121869d, "getType", "()Ljava/lang/String;", "StandardUser", "SimpleUser", "Customer", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum UserType {
        StandardUser("B"),
        SimpleUser(C63954b.f161494a),
        Customer("C");
        
        private String value;

        public final String getType() {
            return this.value;
        }

        private UserType(String str) {
            this.value = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0010J\u0010\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R-\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u000bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t`\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/main/app/drawer/MainHitPoint$Companion;", "", "()V", "INDEX_CANNOT_LOGIN", "", "INDEX_HAVE_SESSION", "INDEX_INVALID_ACCOUNT", "INDEX_NEW_ACCOUNT", "LOG_TAG", "", "userStatusMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getUserStatusMap", "()Ljava/util/HashMap;", "sendAccountSwitchEvent", "", "tenantId", "targetTenantId", "tenantSessionType", "sendAddAccountClickEvent", "sendAddAccountGuideEvent", "sendJoinTeamClickEvent", "userType", "Lcom/ss/android/lark/main/app/drawer/MainHitPoint$UserType;", "sendShowPickTenantGuide", "sendTeamJoinIconClickEvent", "sendTenantSwitchEvent", "toUserId", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.drawer.MainHitPoint$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final HashMap<Integer, String> mo157218a() {
            return MainHitPoint.f112171a;
        }

        /* renamed from: d */
        public final void mo157223d() {
            Statistics.sendEvent("navigation_bubble_popup_logout_guide_view");
        }

        /* renamed from: b */
        public final void mo157221b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", "sidebar_icon");
            Statistics.sendEvent("click_use_by_orgs", jSONObject);
        }

        /* renamed from: c */
        public final void mo157222c() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "add_tenant");
            jSONObject.put("target", "onboarding_team_join_create_upgrade_view");
            Statistics.sendEvent("navigation_tenant_click", jSONObject);
        }

        /* renamed from: e */
        public final void mo157224e() {
            try {
                Statistics.sendEvent("guide_switch_team_show");
            } catch (Throwable th) {
                Log.m165383e("MainHitPoint", th.getMessage());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo157219a(String str) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("to_user_id", str);
            Statistics.sendEvent("tenant_switch_click", jSONObject);
        }

        /* renamed from: a */
        public final void mo157220a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "tenantId");
            Intrinsics.checkParameterIsNotNull(str3, "tenantSessionType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "tenant");
            jSONObject.put("tenant_id", str);
            jSONObject.put("target_tenant_id", str2);
            jSONObject.put("tenant_session_type", str3);
            jSONObject.put("target", "none");
            Statistics.sendEvent("navigation_tenant_click", jSONObject);
        }
    }
}
