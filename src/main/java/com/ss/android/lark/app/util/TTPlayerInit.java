package com.ss.android.lark.app.util;

import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.player.p2513c.C52114o;
import com.ss.android.lark.player.player.IPlayerDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/app/util/TTPlayerInit;", "", "()V", "init", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.app.util.i */
public final class TTPlayerInit {

    /* renamed from: a */
    public static final TTPlayerInit f72906a = new TTPlayerInit();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/app/util/TTPlayerInit$init$1", "Lcom/ss/android/lark/player/player/IPlayerDependency;", "getTenantId", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.app.util.i$a */
    public static final class C29093a implements IPlayerDependency {
        C29093a() {
        }

        @Override // com.ss.android.lark.player.player.IPlayerDependency
        /* renamed from: a */
        public String mo103201a() {
            Object api = ApiUtils.getApi(IPassportApi.class);
            Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IPassportApi::class.java)");
            String tenantId = ((IPassportApi) api).getTenantId();
            Intrinsics.checkExpressionValueIsNotNull(tenantId, "ApiUtils.getApi(IPassportApi::class.java).tenantId");
            return tenantId;
        }
    }

    private TTPlayerInit() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m106988a() {
        C52114o.m202143a(new C29093a());
    }
}
