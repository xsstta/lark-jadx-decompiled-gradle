package com.bytedance.ee.webapp.config;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/webapp/config/WebappAuthSettingHandler;", "Lcom/bytedance/ee/lark/infra/config/mina/v2/AbsSettingHandler;", "()V", "getSettingKey", "", "getWebappAuthStrategy", "loadConfig", "key", "defValue", "saveSettingFromRemote", "", "jsonStr", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.webapp.config.h */
public final class WebappAuthSettingHandler extends AbstractC12744b {

    /* renamed from: a */
    public static final AbstractC12790g<WebappAuthSettingHandler> f36020a = new C13782b();

    /* renamed from: b */
    public static final Companion f36021b = new Companion(null);

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "webapp_auth_strategy";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/webapp/config/WebappAuthSettingHandler$Companion;", "", "()V", "HOLDER", "Lcom/bytedance/ee/lark/infra/foundation/utils/Singleton;", "Lcom/bytedance/ee/webapp/config/WebappAuthSettingHandler;", "getHOLDER", "()Lcom/bytedance/ee/lark/infra/foundation/utils/Singleton;", "KEY_TYPE_WEBAPP_AUTH_CONFIG", "", "SETTING_KEY_WEBAPP_AUTH_CONFIG", "get", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.webapp.config.h$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final AbstractC12790g<WebappAuthSettingHandler> mo50807a() {
            return WebappAuthSettingHandler.f36020a;
        }

        /* renamed from: b */
        public final WebappAuthSettingHandler mo50808b() {
            WebappAuthSettingHandler c = mo50807a().mo48348c(new Context[0]);
            Intrinsics.checkExpressionValueIsNotNull(c, "HOLDER.get()");
            return c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J%\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/bytedance/ee/webapp/config/WebappAuthSettingHandler$Companion$HOLDER$1", "Lcom/bytedance/ee/lark/infra/foundation/utils/Singleton;", "Lcom/bytedance/ee/webapp/config/WebappAuthSettingHandler;", "create", "mContext", "", "Landroid/content/Context;", "([Landroid/content/Context;)Lcom/bytedance/ee/webapp/config/WebappAuthSettingHandler;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.webapp.config.h$b */
    public static final class C13782b extends AbstractC12790g<WebappAuthSettingHandler> {
        C13782b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public WebappAuthSettingHandler mo48227b(Context... contextArr) {
            Intrinsics.checkParameterIsNotNull(contextArr, "mContext");
            return new WebappAuthSettingHandler(null);
        }
    }

    private WebappAuthSettingHandler() {
    }

    /* renamed from: a */
    public final String mo50806a() {
        String string;
        Object parse = JSON.parse(getSettingFromLocal("webapp_auth_strategy", ""));
        if (!(parse instanceof JSONObject) || (string = ((JSONObject) parse).getString(ShareHitPoint.f121869d)) == null) {
            return "";
        }
        return string;
    }

    public /* synthetic */ WebappAuthSettingHandler(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        Intrinsics.checkParameterIsNotNull(str, "jsonStr");
        C12782a.m52834a("webapp_auth_strategy", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        String b = C12782a.m52838b("webapp_auth_strategy", "");
        Intrinsics.checkExpressionValueIsNotNull(b, "AcrossProcessSPHelper.ge…Y_WEBAPP_AUTH_CONFIG, \"\")");
        return b;
    }
}
