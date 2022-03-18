package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.common.util.NetworkUtil;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/infra/network/OnNetworkStatusChangeUtil;", "", "()V", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.q */
public final class OnNetworkStatusChangeUtil {

    /* renamed from: a */
    public static final Companion f61080a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/infra/network/OnNetworkStatusChangeUtil$Companion;", "", "()V", "TAG", "", "registerListener", "Lcom/tt/refer/common/util/NetworkUtil$NetWorkChangedListener;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "unRegisterListener", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.q$a */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/larksuite/component/openplatform/core/plugin/infra/network/OnNetworkStatusChangeUtil$Companion$registerListener$1", "Lcom/tt/refer/common/util/NetworkUtil$NetWorkChangedListener;", "onChanged", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "networkType", "", "isAvailable", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.q$a$a */
        public static final class C24949a implements NetworkUtil.NetWorkChangedListener {
            C24949a() {
            }

            @Override // com.tt.refer.common.util.NetworkUtil.NetWorkChangedListener
            /* renamed from: a */
            public void mo88035a(IAppContext iAppContext, String str, boolean z) {
                Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
                Intrinsics.checkParameterIsNotNull(str, "networkType");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("isConnected", z);
                    jSONObject.put("networkType", str);
                    if (iAppContext.isDestroyed()) {
                        return;
                    }
                    if (!iAppContext.isDestroying()) {
                        ((AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class)).mo235012a(C67706e.C67708a.m263377a("onNetworkStatusChange", jSONObject).mo235009a());
                    }
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("OnNetworkStatusChangeUtil", e);
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo88034b(IAppContext iAppContext) {
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            NetworkUtil.f170931k.mo235499a(iAppContext);
        }

        @JvmStatic
        /* renamed from: a */
        public final NetworkUtil.NetWorkChangedListener mo88033a(IAppContext iAppContext) {
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            C24949a aVar = new C24949a();
            NetworkUtil.f170931k.mo235500a(iAppContext, aVar);
            return aVar;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final NetworkUtil.NetWorkChangedListener m90202a(IAppContext iAppContext) {
        return f61080a.mo88033a(iAppContext);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m90203b(IAppContext iAppContext) {
        f61080a.mo88034b(iAppContext);
    }
}
