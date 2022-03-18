package com.bytedance.ee.larkbrand.hostbridge.sync.p657a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.a.c */
public class C13109c implements AbstractC67571b {

    /* renamed from: a */
    private AbstractC41371j f34797a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_enter_chat";
    }

    public C13109c(AbstractC41371j jVar) {
        this.f34797a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            return null;
        }
        String b = crossProcessDataEntity.mo234744b("chatter_id");
        String b2 = crossProcessDataEntity.mo234744b("app_id");
        boolean d = crossProcessDataEntity.mo234746d("isBot");
        if (!TextUtils.isEmpty(b)) {
            return CrossProcessDataEntity.C67574a.m263013a().mo234760a("enter_chat_result", (Object) Boolean.valueOf(this.f34797a.mo149011b(b, b2, d))).mo234763b();
        }
        String b3 = crossProcessDataEntity.mo234744b("app_id");
        String b4 = crossProcessDataEntity.mo234744b("chat_id");
        boolean a = crossProcessDataEntity.mo234743a("needBadge", true);
        if (!TextUtils.isEmpty(b3) && !TextUtils.isEmpty(b4)) {
            return CrossProcessDataEntity.C67574a.m263013a().mo234760a("enter_chat_result", (Object) Boolean.valueOf(this.f34797a.mo149007a(b4, b3, a))).mo234763b();
        }
        AppBrandLogger.m52829e("EnterChatHandler", "appId or chatId is empty" + b3 + " : " + b4);
        return null;
    }
}
