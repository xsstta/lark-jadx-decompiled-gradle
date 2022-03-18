package com.tt.refer.impl.business.api.diagnose.commands;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import com.tt.refer.impl.business.meta.GadgetSchema;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/ClearLocalMeta;", "Lcom/tt/refer/impl/business/api/diagnose/AbsDebugCommand;", "()V", "execute", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "params", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.api.diagnose.a.b */
public final class ClearLocalMeta extends AbstractC67885a {

    /* renamed from: a */
    public static final Companion f170967a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/ClearLocalMeta$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.api.diagnose.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) {
        String optString;
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        if (jSONObject == null || (optString = jSONObject.optString("app_id")) == null) {
            AppBrandLogger.m52829e("ClearLocalMeta", "appId is empty");
            return mo235513a("appId is empty.");
        }
        IBaseService findServiceByInterface = iAppContext.findServiceByInterface(IAppMetaService.class);
        if (findServiceByInterface != null) {
            AppBrandLogger.m52830i("ClearLocalMeta", "appId: ", optString, ", result: ", Boolean.valueOf(((IAppMetaService) findServiceByInterface).mo235257b(iAppContext.getApplicationContext(), new GadgetSchema.C67943Entity(optString))));
            return mo235511a();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tt.refer.common.meta.IAppMetaService<com.tt.refer.common.meta.base.AbsAppMeta, com.tt.refer.impl.business.meta.GadgetSchema.Entity>");
    }
}
