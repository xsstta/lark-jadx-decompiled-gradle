package com.ss.android.lark.integrator.tenant;

import com.ss.android.lark.integrator.passport.lazy.C39959a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k;
import com.ss.android.lark.statistics.Statistics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/integrator/tenant/SwitchTenantHitPoint;", "", "()V", "Companion", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.f.a */
public final class SwitchTenantHitPoint {

    /* renamed from: a */
    public static final Companion f100740a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m155630a(int i) {
        f100740a.mo143250a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/integrator/tenant/SwitchTenantHitPoint$Companion;", "", "()V", "sendNotificationSwitchTenant", "", "badgeStatus", "", "sendSidebarSwitchTenant", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.f.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo143250a(int i) {
            int i2;
            AbstractC49397k a = C39959a.m158588a();
            Intrinsics.checkExpressionValueIsNotNull(a, "PassportSdkProvider.getModule()");
            List<TenantInfo> C = a.mo101386C();
            Intrinsics.checkExpressionValueIsNotNull(C, "PassportSdkProvider.getModule().tenantData");
            if (C != null) {
                i2 = C.size();
            } else {
                i2 = 0;
            }
            Statistics.sendEvent("Feed_Sidebar_SwitchTenant_Click", new JSONObject().put("badge_status", i).put("tenants_count", i2));
        }
    }
}
